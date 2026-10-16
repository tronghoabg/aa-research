package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ajzw implements ajpg {
    public akal d = new akal();

    @Deprecated
    protected akas e = null;

    @Deprecated
    protected ajzw() {
    }

    @Override // defpackage.ajpg
    public final void f(ajoy ajoyVar) {
        this.d.a(ajoyVar);
    }

    @Override // defpackage.ajpg
    public final void g(String str, String str2) {
        this.d.a(new ajzx(str, str2));
    }

    @Override // defpackage.ajpg
    public final void h(String str, String str2) {
        akal akalVar = this.d;
        ajzx ajzxVar = new ajzx(str, str2);
        int i = 0;
        while (true) {
            List list = akalVar.b;
            if (i >= list.size()) {
                list.add(ajzxVar);
                return;
            } else {
                if (((ajoy) list.get(i)).b().equalsIgnoreCase(ajzxVar.a)) {
                    list.set(i, ajzxVar);
                    return;
                }
                i++;
            }
        }
    }

    @Override // defpackage.ajpg
    public final ajoy hW(String str) {
        akal akalVar = this.d;
        int i = 0;
        while (true) {
            List list = akalVar.b;
            if (i >= list.size()) {
                return null;
            }
            ajoy ajoyVar = (ajoy) list.get(i);
            if (ajoyVar.b().equalsIgnoreCase(str)) {
                return ajoyVar;
            }
            i++;
        }
    }

    @Override // defpackage.ajpg
    @Deprecated
    public final akas hX() {
        if (this.e == null) {
            this.e = new akar();
        }
        return this.e;
    }

    @Override // defpackage.ajpg
    public final void i(ajoy[] ajoyVarArr) {
        this.d.c(ajoyVarArr);
    }

    @Override // defpackage.ajpg
    @Deprecated
    public final void j(akas akasVar) {
        ahgm.e(akasVar, "HTTP parameters");
        this.e = akasVar;
    }

    @Override // defpackage.ajpg
    public final boolean k(String str) {
        akal akalVar = this.d;
        int i = 0;
        while (true) {
            List list = akalVar.b;
            if (i >= list.size()) {
                return false;
            }
            if (((ajoy) list.get(i)).b().equalsIgnoreCase(str)) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.ajpg
    public final ajoy[] l() {
        return this.d.d();
    }

    @Override // defpackage.ajpg
    public final ajoy[] m(String str) {
        akal akalVar = this.d;
        int i = 0;
        ArrayList arrayList = null;
        while (true) {
            List list = akalVar.b;
            if (i >= list.size()) {
                break;
            }
            ajoy ajoyVar = (ajoy) list.get(i);
            if (ajoyVar.b().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ajoyVar);
            }
            i++;
        }
        return arrayList != null ? (ajoy[]) arrayList.toArray(new ajoy[arrayList.size()]) : akal.a;
    }

    @Override // defpackage.ajpg
    public final akaf n() {
        return new akaf(this.d.b, null);
    }

    @Override // defpackage.ajpg
    public final akaf o(String str) {
        return new akaf(this.d.b, str);
    }
}
