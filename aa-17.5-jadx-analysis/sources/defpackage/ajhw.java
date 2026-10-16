package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ajhw {
    public String a;
    public String d;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final List f = woy.bk("");

    private final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        return ahde.b(str);
    }

    private static final List e(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iD = afyh.D(str, '&', i);
            if (iD == -1) {
                iD = str.length();
            }
            int iD2 = afyh.D(str, '=', i);
            if (iD2 == -1 || iD2 > iD) {
                String strSubstring = str.substring(i, iD);
                strSubstring.getClass();
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iD2);
                strSubstring2.getClass();
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iD2 + 1, iD);
                strSubstring3.getClass();
                arrayList.add(strSubstring3);
            }
            i = iD + 1;
        }
        return arrayList;
    }

    public final ajhx a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strC = ajmq.c(this.b, 0, 0, false, 7);
        String strC2 = ajmq.c(this.c, 0, 0, false, 7);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iD = d();
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(ajmq.c((String) it.next(), 0, 0, false, 7));
        }
        List<String> list2 = this.g;
        if (list2 != null) {
            arrayList = new ArrayList(woy.bp(list2, 10));
            for (String str3 : list2) {
                arrayList.add(str3 != null ? ajmq.c(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new ajhx(str, strC, strC2, str2, iD, arrayList, str4 != null ? ajmq.c(str4, 0, 0, false, 7) : null, toString());
    }

    public final void b(String str) {
        this.g = str != null ? e(ajmq.b(str, 0, 0, " \"'<>#", true, false, true, false, 83)) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0322  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ajhx r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhw.c(ajhx, java.lang.String):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (afyh.A(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        if (this.e != -1 || this.a != null) {
            int iD = d();
            String str3 = this.a;
            if (str3 == null || iD != ahde.b(str3)) {
                sb.append(':');
                sb.append(iD);
            }
        }
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
        if (this.g != null) {
            sb.append('?');
            List list2 = this.g;
            list2.getClass();
            ahde.c(list2, sb);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
