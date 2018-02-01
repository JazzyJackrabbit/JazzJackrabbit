OPEN "codecol.txt" FOR OUTPUT AS #2
DIM V AS _UNSIGNED INTEGER

CHDIR "1E"

'FOR z = 0 TO 209
z = 62

OPEN RTRIM$(LTRIM$(STR$(z))) + ".col" FOR BINARY AS #1

FOR i = 0 TO 31
    FOR j = 0 TO 31
        GET #1, i + j * 32 + 1, V
        DO WHILE V > 255:
            V = V - 256
        LOOP
        IF V <> 0 THEN
            COLOR _RGB(80, 40, 40):
            PRINT
            PRINT #2, "c["; RTRIM$(LTRIM$(STR$(z))); "]["; RTRIM$(LTRIM$(STR$(j))); "]["; RTRIM$(LTRIM$(STR$(i))); "]="; RTRIM$(LTRIM$(STR$(V))); ";";
        END IF
    NEXT j
NEXT i

CLOSE #1

'NEXT z

