package defpackage;

import j$.util.DesugarTimeZone;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ajye extends ajxz implements ajuh {
    private final String[] a;

    public ajye(String[] strArr) {
        ahgm.e(strArr, "Array of date patterns");
        this.a = (String[]) strArr.clone();
    }

    @Override // defpackage.ajuh
    public final String a() {
        return "expires";
    }

    @Override // defpackage.ajuj
    public final void b(ajuu ajuuVar, String str) throws ajut {
        Date date;
        if (str == null) {
            throw new ajut("Missing value for 'expires' attribute");
        }
        String[] strArr = this.a;
        if (strArr == null) {
            strArr = ajsf.a;
        }
        int length = str.length();
        Date date2 = ajsf.b;
        String strSubstring = (length > 1 && str.startsWith("'") && str.endsWith("'")) ? str.substring(1, str.length() - 1) : str;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            date = null;
            if (i >= length2) {
                break;
            }
            String str2 = strArr[i];
            ThreadLocal threadLocal = ajse.a;
            SoftReference softReference = (SoftReference) threadLocal.get();
            Map map = softReference != null ? (Map) softReference.get() : null;
            if (map == null) {
                map = new HashMap();
                threadLocal.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str2);
            if (simpleDateFormat == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2, Locale.US);
                simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                map.put(str2, simpleDateFormat2);
                simpleDateFormat = simpleDateFormat2;
            }
            simpleDateFormat.set2DigitYearStart(date2);
            ParsePosition parsePosition = new ParsePosition(0);
            Date date3 = simpleDateFormat.parse(strSubstring, parsePosition);
            if (parsePosition.getIndex() != 0) {
                date = date3;
                break;
            }
            i++;
        }
        if (date == null) {
            throw new ajut("Invalid 'expires' attribute: ".concat(str));
        }
        ajuuVar.k(date);
    }
}
