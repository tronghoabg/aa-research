package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sqp {
    static {
        java.util.regex.Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        java.util.regex.Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        java.util.regex.Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    public static java.util.Map a(java.net.URI uri) {
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new java.util.HashMap();
            defpackage.xzd xzdVarC = defpackage.xzd.c('=');
            java.util.Iterator it = defpackage.xzd.c('&').b().g(rawQuery).iterator();
            while (it.hasNext()) {
                java.util.List listI = xzdVarC.i((java.lang.String) it.next());
                if (listI.isEmpty() || listI.size() > 2) {
                    throw new java.lang.IllegalArgumentException("bad parameter");
                }
                map.put(b((java.lang.String) listI.get(0)), listI.size() == 2 ? b((java.lang.String) listI.get(1)) : null);
            }
        }
        return map;
    }

    private static java.lang.String b(java.lang.String str) {
        try {
            return j$.net.URLDecoder.decode(str, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
