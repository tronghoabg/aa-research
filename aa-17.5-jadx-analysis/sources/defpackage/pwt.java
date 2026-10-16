package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class pwt {
    private static final xxx a = xxx.c(',').f();
    private static final xxx b = xxx.c(';').f();
    private static final xxx c = xxx.c('=').f().a(2);
    private static final Pattern d = Pattern.compile("^\"|\"$");

    public static Map a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (String str : a.g((String) it.next())) {
                HashMap map2 = new HashMap();
                String lowerCase = "";
                for (String str2 : b.g(str)) {
                    if (str2.contains("=")) {
                        List listI = c.i(str2);
                        if (!map2.containsKey(((String) listI.get(0)).toLowerCase(Locale.ROOT))) {
                            map2.put(((String) listI.get(0)).toLowerCase(Locale.ROOT), d.matcher((CharSequence) listI.get(1)).replaceAll(""));
                        }
                    } else if (lowerCase.isEmpty()) {
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                    }
                }
                if (!lowerCase.isEmpty()) {
                    if (map.containsKey(lowerCase)) {
                        HashMap map3 = new HashMap();
                        map3.putAll(map2);
                        map3.putAll((Map) map.get(lowerCase));
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
