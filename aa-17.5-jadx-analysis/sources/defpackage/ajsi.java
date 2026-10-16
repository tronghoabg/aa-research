package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class ajsi {
    public static final EnumSet a;
    public static final EnumSet b;

    static {
        EnumSet.noneOf(ajsh.class);
        EnumSet.of(ajsh.a);
        a = EnumSet.of(ajsh.b);
        b = EnumSet.of(ajsh.a, ajsh.b);
    }

    public static URI a(URI uri) throws URISyntaxException {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        ajsg ajsgVar = new ajsg(uri);
        List<String> listB = ajsgVar.b();
        Stack stack = new Stack();
        for (String str : listB) {
            if (!".".equals(str)) {
                if (!"..".equals(str)) {
                    stack.push(str);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        if (stack.size() == 0) {
            stack.add("");
        }
        ajsgVar.e(stack);
        String str2 = ajsgVar.a;
        if (str2 != null) {
            ajsgVar.a = str2.toLowerCase(Locale.ROOT);
        }
        String str3 = ajsgVar.f;
        if (str3 != null) {
            ajsgVar.d(str3.toLowerCase(Locale.ROOT));
        }
        return ajsgVar.a();
    }

    public static URI b(URI uri, URI uri2) {
        URI uriResolve;
        ahgm.e(uri, "Base URI");
        ahgm.e(uri2, "Reference URI");
        String aSCIIString = uri2.toASCIIString();
        if (aSCIIString.startsWith("?")) {
            String aSCIIString2 = uri.toASCIIString();
            int iIndexOf = aSCIIString2.indexOf(63);
            if (iIndexOf >= 0) {
                aSCIIString2 = aSCIIString2.substring(0, iIndexOf);
            }
            return URI.create(String.valueOf(aSCIIString2).concat(String.valueOf(aSCIIString)));
        }
        if (aSCIIString.isEmpty()) {
            String aSCIIString3 = uri.resolve(URI.create("#")).toASCIIString();
            uriResolve = URI.create(aSCIIString3.substring(0, aSCIIString3.indexOf(35)));
        } else {
            uriResolve = uri.resolve(uri2);
        }
        try {
            return a(uriResolve);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static URI c(URI uri) throws URISyntaxException {
        ahgm.e(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        ajsg ajsgVar = new ajsg(uri);
        String string = null;
        if (ajsgVar.d != null) {
            ajsgVar.d = null;
            ajsgVar.b = null;
            ajsgVar.c = null;
            ajsgVar.e = null;
        }
        if (ajsgVar.b().isEmpty()) {
            ajsgVar.f("");
        }
        if (ajsgVar.h != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : ajsgVar.h) {
                sb.append('/');
                sb.append(str);
            }
            string = sb.toString();
        }
        if (ahku.b(string)) {
            ajsgVar.e(ajsj.d("/"));
        }
        String str2 = ajsgVar.f;
        if (str2 != null) {
            ajsgVar.d(str2.toLowerCase(Locale.ROOT));
        }
        ajsgVar.c();
        return ajsgVar.a();
    }

    public static URI d(URI uri, ajpe ajpeVar, EnumSet enumSet) throws URISyntaxException {
        String str;
        ahgm.e(uri, "URI");
        ahgm.e(enumSet, "URI flags");
        if (uri.isOpaque()) {
            return uri;
        }
        ajsg ajsgVar = new ajsg(uri);
        if (ajpeVar != null) {
            ajsgVar.a = ajpeVar.d;
            ajsgVar.d(ajpeVar.a);
            ajsgVar.g(ajpeVar.c);
        } else {
            ajsgVar.a = null;
            ajsgVar.d(null);
            ajsgVar.g(-1);
        }
        if (enumSet.contains(ajsh.a)) {
            ajsgVar.c();
        }
        if (enumSet.contains(ajsh.b)) {
            List listB = ajsgVar.b();
            ArrayList arrayList = new ArrayList(listB);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).isEmpty() && it.hasNext()) {
                    it.remove();
                }
            }
            if (arrayList.size() != listB.size()) {
                ajsgVar.e(arrayList);
            }
        }
        List list = ajsgVar.h;
        if ((list == null || list.isEmpty()) && ((str = ajsgVar.g) == null || str.isEmpty())) {
            ajsgVar.f("");
        }
        return ajsgVar.a();
    }

    public static ajpe e(URI uri) {
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        if (uri.getHost() != null) {
            return new ajpe(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        if (uri.getAuthority() == null) {
            return null;
        }
        String authority = uri.getAuthority();
        int iIndexOf = authority.indexOf(64);
        if (iIndexOf != -1) {
            authority = authority.substring(iIndexOf + 1);
        }
        String scheme = uri.getScheme();
        int iIndexOf2 = authority.indexOf(":");
        if (iIndexOf2 != -1) {
            String strSubstring = authority.substring(0, iIndexOf2);
            try {
                String strSubstring2 = authority.substring(iIndexOf2 + 1);
                i = ahku.b(strSubstring2) ? -1 : Integer.parseInt(strSubstring2);
                authority = strSubstring;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        try {
            return new ajpe(authority, i, scheme);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }
}
