package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class spr {
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    public static Map a(URI uri) {
        Map map = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new HashMap();
            xxx xxxVarC = xxx.c('=');
            Iterator it = xxx.c('&').b().g(rawQuery).iterator();
            while (it.hasNext()) {
                List listI = xxxVarC.i((String) it.next());
                if (listI.isEmpty() || listI.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                map.put(b((String) listI.get(0)), listI.size() == 2 ? b((String) listI.get(1)) : null);
            }
        }
        return map;
    }

    private static String b(String str) {
        try {
            return URLDecoder.decode(str, CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
