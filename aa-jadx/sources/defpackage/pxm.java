package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxm {
    private static final defpackage.xzd a = defpackage.xzd.c(',').f();
    private static final defpackage.xzd b = defpackage.xzd.c(';').f();
    private static final defpackage.xzd c = defpackage.xzd.c('=').f().a(2);
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("^\"|\"$");

    public static java.util.Map a(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            for (java.lang.String str : a.g((java.lang.String) it.next())) {
                java.util.HashMap map2 = new java.util.HashMap();
                java.lang.String lowerCase = "";
                for (java.lang.String str2 : b.g(str)) {
                    if (str2.contains("=")) {
                        java.util.List listI = c.i(str2);
                        if (!map2.containsKey(((java.lang.String) listI.get(0)).toLowerCase(java.util.Locale.ROOT))) {
                            map2.put(((java.lang.String) listI.get(0)).toLowerCase(java.util.Locale.ROOT), d.matcher((java.lang.CharSequence) listI.get(1)).replaceAll(""));
                        }
                    } else if (lowerCase.isEmpty()) {
                        lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
                    }
                }
                if (!lowerCase.isEmpty()) {
                    if (map.containsKey(lowerCase)) {
                        java.util.HashMap map3 = new java.util.HashMap();
                        map3.putAll(map2);
                        map3.putAll((java.util.Map) map.get(lowerCase));
                        map.put(lowerCase, map3);
                    } else {
                        map.put(lowerCase, map2);
                    }
                }
            }
        }
        return map;
    }
}
