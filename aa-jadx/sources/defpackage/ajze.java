package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajze extends defpackage.ajyz implements defpackage.ajvh {
    private final java.lang.String[] a;

    public ajze(java.lang.String[] strArr) {
        defpackage.aguw.e(strArr, "Array of date patterns");
        this.a = (java.lang.String[]) strArr.clone();
    }

    @Override // defpackage.ajvh
    public final java.lang.String a() {
        return "expires";
    }

    @Override // defpackage.ajvj
    public final void b(defpackage.ajvu ajvuVar, java.lang.String str) throws defpackage.ajvt {
        java.util.Date date;
        if (str == null) {
            throw new defpackage.ajvt("Missing value for 'expires' attribute");
        }
        java.lang.String[] strArr = this.a;
        if (strArr == null) {
            strArr = defpackage.ajtf.a;
        }
        int length = str.length();
        java.util.Date date2 = defpackage.ajtf.b;
        java.lang.String strSubstring = (length > 1 && str.startsWith("'") && str.endsWith("'")) ? str.substring(1, str.length() - 1) : str;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            date = null;
            if (i >= length2) {
                break;
            }
            java.lang.String str2 = strArr[i];
            java.lang.ThreadLocal threadLocal = defpackage.ajte.a;
            java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) threadLocal.get();
            java.util.Map map = softReference != null ? (java.util.Map) softReference.get() : null;
            if (map == null) {
                map = new java.util.HashMap();
                threadLocal.set(new java.lang.ref.SoftReference(map));
            }
            java.text.SimpleDateFormat simpleDateFormat = (java.text.SimpleDateFormat) map.get(str2);
            if (simpleDateFormat == null) {
                java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat(str2, java.util.Locale.US);
                simpleDateFormat2.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("GMT"));
                map.put(str2, simpleDateFormat2);
                simpleDateFormat = simpleDateFormat2;
            }
            simpleDateFormat.set2DigitYearStart(date2);
            java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
            java.util.Date date3 = simpleDateFormat.parse(strSubstring, parsePosition);
            if (parsePosition.getIndex() != 0) {
                date = date3;
                break;
            }
            i++;
        }
        if (date == null) {
            throw new defpackage.ajvt("Invalid 'expires' attribute: ".concat(str));
        }
        ajvuVar.k(date);
    }
}
