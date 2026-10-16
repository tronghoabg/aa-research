package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ajid {
    public final ajhx a;
    public final String b;
    public final ajhv c;
    public final ajin d;
    private ajhg e;

    public ajid(ajic ajicVar) {
        ajhx ajhxVar = ajicVar.a;
        if (ajhxVar == null) {
            throw new IllegalStateException("url == null");
        }
        this.a = ajhxVar;
        this.b = ajicVar.b;
        this.c = ahdw.k(ajicVar.d);
        this.d = ajicVar.c;
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final ajhg b() {
        ajhg ajhgVar = this.e;
        if (ajhgVar != null) {
            return ajhgVar;
        }
        ajhv ajhvVar = this.c;
        ajhg ajhgVar2 = ajhg.a;
        ajhg ajhgVarA = aiqw.a(ajhvVar);
        this.e = ajhgVarA;
        return ajhgVarA;
    }

    public final boolean c() {
        return this.a.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        ajhv ajhvVar = this.c;
        if (ajhvVar.a() != 0) {
            sb.append(", headers=[");
            Iterator itD = ahdw.d(ajhvVar);
            int i = 0;
            while (itD.hasNext()) {
                Object next = itD.next();
                int i2 = i + 1;
                if (i < 0) {
                    woy.bo();
                }
                aezu aezuVar = (aezu) next;
                String str = (String) aezuVar.a;
                String str2 = (String) aezuVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (true == ajiq.k(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        ajin ajinVar = this.d;
        if (!affa.f(ajinVar, ajil.a)) {
            sb.append(", tags=");
            sb.append(ajinVar);
        }
        sb.append('}');
        return sb.toString();
    }
}
