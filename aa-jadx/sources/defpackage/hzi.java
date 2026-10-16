package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzi {
    public static final java.util.Map a;
    private static final java.lang.String b;

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    static {
        java.lang.String property = java.lang.System.getProperty("http.agent");
        if (!android.text.TextUtils.isEmpty(property)) {
            int length = property.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (cCharAt > 31) {
                    if (cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                } else if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        b = property;
        java.util.HashMap map = new java.util.HashMap(2);
        if (!android.text.TextUtils.isEmpty(property)) {
            map.put("User-Agent", java.util.Collections.singletonList(new defpackage.hzj(property)));
        }
        a = j$.util.DesugarCollections.unmodifiableMap(map);
    }
}
