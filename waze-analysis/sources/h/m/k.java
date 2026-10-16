package h.m;

import h.a.z;
import h.g.b.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class k {
    public static void A(kotlinx.b.a.q qVar) {
        x.f(qVar, "descriptor");
    }

    public static final Iterator a(h.g.a.p pVar) {
        x.f(pVar, "block");
        i iVar = new i();
        iVar.c(h.c.a.h.c(pVar, iVar, iVar));
        return iVar;
    }

    public static final h b(h.g.a.p pVar) {
        x.f(pVar, "block");
        return new l(pVar, 1);
    }

    public static h c(Iterator it) {
        x.f(it, "<this>");
        return d(new l(it, 0));
    }

    public static h d(h hVar) {
        x.f(hVar, "<this>");
        return hVar instanceof a ? hVar : new a(hVar);
    }

    public static h e() {
        return c.f48170a;
    }

    public static h f(h.g.a.a aVar) {
        x.f(aVar, "nextFunction");
        return d(new v(aVar, new com.waze.uid.b(aVar, 7), 1));
    }

    public static h g(Object obj, h.g.a.l lVar) {
        x.f(lVar, "nextFunction");
        return obj == null ? c.f48170a : new v(new com.waze.uid.state_impl.email.n(obj, 10), lVar, 1);
    }

    public static h h(Object... objArr) {
        x.f(objArr, "elements");
        x.f(objArr, "<this>");
        return new z(objArr, 1);
    }

    public static Object i(h hVar) {
        x.f(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static List j(h hVar) {
        x.f(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return h.a.i.h();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return h.a.i.d(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static h k(h hVar, h.g.a.l lVar) {
        x.f(hVar, "<this>");
        x.f(lVar, "predicate");
        return new d(hVar, true, lVar);
    }

    public static h l(h hVar) {
        x.f(hVar, "<this>");
        com.waze.ui.x.a aVar = new com.waze.ui.x.a(20);
        x.f(hVar, "<this>");
        x.f(aVar, "predicate");
        return new d(hVar, false, aVar);
    }

    public static h m(h hVar, h.g.a.l lVar) {
        x.f(hVar, "<this>");
        x.f(lVar, "transform");
        return new f(hVar, lVar, o.f48192a);
    }

    public static h n(h hVar, h.g.a.l lVar) {
        x.f(hVar, "<this>");
        x.f(lVar, "transform");
        return new f(hVar, lVar, n.f48191a);
    }

    public static h o(h hVar, h.g.a.l lVar) {
        x.f(hVar, "<this>");
        x.f(lVar, "transform");
        return new v(hVar, lVar, 2, null);
    }

    public static h p(h hVar, h.g.a.l lVar) {
        x.f(hVar, "<this>");
        x.f(lVar, "transform");
        return l(new v(hVar, lVar, 2, null));
    }

    public static h q(h hVar, Comparator comparator) {
        x.f(hVar, "<this>");
        x.f(comparator, "comparator");
        return new p(hVar, comparator);
    }

    public static h r(h hVar, int i2) {
        x.f(hVar, "<this>");
        if (i2 >= 0) {
            return i2 == 0 ? e() : hVar instanceof b ? ((b) hVar).b(i2) : new t(hVar, i2, 0);
        }
        throw new IllegalArgumentException("Requested element count " + i2 + " is less than zero.");
    }

    public static h s(h hVar, h.g.a.l lVar) {
        x.f(hVar, "<this>");
        x.f(lVar, "predicate");
        return new v(hVar, lVar, 0);
    }

    public static boolean t(h hVar, Object obj) {
        x.f(hVar, "<this>");
        x.f(hVar, "<this>");
        Iterator it = hVar.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                h.a.i.p();
            }
            if (!x.n(obj, next)) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String u(h hVar, CharSequence charSequence) throws IOException {
        x.f(hVar, "<this>");
        x.f(charSequence, "separator");
        x.f(str, "prefix");
        x.f(str, "postfix");
        x.f(str, "truncated");
        StringBuilder sb = new StringBuilder();
        x.f(hVar, "<this>");
        x.f(sb, "buffer");
        x.f(charSequence, "separator");
        x.f(str, "prefix");
        x.f(str, "postfix");
        x.f(str, "truncated");
        sb.append((CharSequence) str);
        int i2 = 0;
        for (Object obj : hVar) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            h.n.o.b(sb, obj, null);
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static final String v(char c2, Locale locale) {
        x.f(locale, "locale");
        x.f(locale, "locale");
        String strValueOf = String.valueOf(c2);
        x.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        x.e(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c2);
            x.d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            x.e(upperCase2, "toUpperCase(...)");
            if (x.n(upperCase, upperCase2)) {
                return String.valueOf(Character.toTitleCase(c2));
            }
        } else if (c2 != 329) {
            char cCharAt = upperCase.charAt(0);
            x.d(upperCase, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = upperCase.substring(1);
            x.e(strSubstring, "substring(...)");
            x.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return upperCase;
    }

    public static final boolean w(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static boolean x(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final void y(int i2) {
        if (i2 < 2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new h.k.j(2, 36));
        }
    }

    public static final void z(String str, h.l.c cVar) {
        String str2;
        x.f(cVar, "baseClass");
        String str3 = "in the polymorphic scope of '" + cVar.c() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + cVar.c() + "' has to be sealed and '@Serializable'.";
        }
        throw new kotlinx.b.k(str2);
    }
}
