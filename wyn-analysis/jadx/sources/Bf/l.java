package Bf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public abstract class l extends AbstractC4345a {
    public static String V(String str) {
        int length;
        Comparable comparable;
        AbstractC3340k.e(str, "<this>");
        List listE0 = Af.n.e0(new Af.o(str, 3));
        List list = listE0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!k.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ff.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!tg.b.I(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listE0.size();
        int iZ = AbstractC3935e.z(listE0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i5 = length + 1;
            if (length < 0) {
                AbstractC3935e.P();
                throw null;
            }
            String str3 = (String) obj2;
            String strP0 = ((length == 0 || length == iZ) && k.y0(str3)) ? null : k.p0(iIntValue, str3);
            if (strP0 != null) {
                arrayList3.add(strP0);
            }
            length = i5;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        ff.o.v0(arrayList3, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }

    public static String W(String str) {
        AbstractC3340k.e(str, "<this>");
        if (k.y0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listE0 = Af.n.e0(new Af.o(str, 3));
        int length = str.length();
        listE0.size();
        int iZ = AbstractC3935e.z(listE0);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : listE0) {
            int i10 = i5 + 1;
            String strSubstring = null;
            if (i5 < 0) {
                AbstractC3935e.P();
                throw null;
            }
            String str2 = (String) obj;
            if ((i5 != 0 && i5 != iZ) || !k.y0(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!tg.b.I(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && r.j0(i11, str2, false, "|")) {
                    strSubstring = str2.substring("|".length() + i11);
                    AbstractC3340k.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i5 = i10;
        }
        StringBuilder sb2 = new StringBuilder(length);
        ff.o.v0(arrayList, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }
}
