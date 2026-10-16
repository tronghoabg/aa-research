package defpackage;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ajhv implements Iterable, afgc {
    public static final ajhv a = new ajhv(new String[0]);
    public final String[] b;

    public ajhv(String[] strArr) {
        strArr.getClass();
        this.b = strArr;
    }

    public final int a() {
        return this.b.length >> 1;
    }

    public final String b(String str) {
        String[] strArr = this.b;
        int length = strArr.length - 2;
        int iO = affa.o(length, 0, -2);
        if (iO <= length) {
            while (!afyh.R(str, strArr[length])) {
                if (length != iO) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.text.DateFormat[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    public final Date c(String str) {
        String strB = b(str);
        if (strB == null) {
            return null;
        }
        ajjz ajjzVar = ajka.a;
        if (strB.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) ajka.a.get()).parse(strB, parsePosition);
        if (parsePosition.getIndex() == strB.length()) {
            return date;
        }
        String[] strArr = ajka.b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < 15; i++) {
                ?? r4 = ajka.c;
                ?? r5 = r4[i];
                SimpleDateFormat simpleDateFormat = r5;
                if (r5 == 0) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(strArr[i], Locale.US);
                    simpleDateFormat2.setTimeZone(ajis.a);
                    r4[i] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(strB, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ajhv) && Arrays.equals(this.b, ((ajhv) obj).b);
    }

    public final int hashCode() {
        return ahdw.a(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<aezu<String, String>> iterator() {
        return ahdw.d(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iA = a();
        for (int i = 0; i < iA; i++) {
            String strB = ahdw.b(this, i);
            String strC = ahdw.c(this, i);
            sb.append(strB);
            sb.append(": ");
            if (true == ajiq.k(strB)) {
                strC = "██";
            }
            sb.append(strC);
            sb.append("\n");
        }
        return sb.toString();
    }
}
