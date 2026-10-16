package androidx.sqlite.util;

import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SQLStatementParserKt {
    public static final String getStatementPrefix(String str) {
        x.f(str, "sql");
        int statementPrefixIndex = getStatementPrefixIndex(str);
        if (statementPrefixIndex < 0 || statementPrefixIndex > str.length()) {
            return null;
        }
        String strSubstring = str.substring(statementPrefixIndex, Math.min(statementPrefixIndex + 3, str.length()));
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final int getStatementPrefixIndex(String str) {
        int i2;
        int length = str.length() - 2;
        if (length >= 0) {
            int iW = 0;
            while (iW < length) {
                char cCharAt = str.charAt(iW);
                if (x.a(cCharAt, 32) > 0) {
                    if (cCharAt == '-') {
                        if (str.charAt(iW + 1) == '-') {
                            iW = o.W(str, '\n', iW + 2, 4);
                            if (iW < 0) {
                                return -1;
                            }
                        }
                    } else if (cCharAt == '/') {
                        int iW2 = iW + 1;
                        if (str.charAt(iW2) == '*') {
                            do {
                                iW2 = o.W(str, '*', iW2 + 1, 4);
                                if (iW2 >= 0) {
                                    i2 = iW2 + 1;
                                    if (i2 >= length) {
                                        break;
                                    }
                                } else {
                                    return -1;
                                }
                            } while (str.charAt(i2) != '/');
                            iW = iW2 + 2;
                        }
                    }
                    return iW;
                }
                iW++;
            }
        }
        return -1;
    }
}
