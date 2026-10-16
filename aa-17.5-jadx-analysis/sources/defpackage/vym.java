package defpackage;

/* loaded from: classes.dex */
public abstract class vym {
    public final boolean a;
    public final ajfz b;

    public vym(boolean z, ajfz ajfzVar) {
        this.a = z;
        this.b = ajfzVar;
    }

    public vyk a(String str) {
        return d(str);
    }

    public abstract ajfz b(vyk vykVar);

    public vyk d(String str) {
        return a(str);
    }

    public final ajfz e() {
        abnp abnpVarK = f(null).K();
        int i = vyk.b.c;
        abnpVarK.t();
        ajfz ajfzVar = (ajfz) abnpVarK.b;
        ajfzVar.c = 2;
        ajfzVar.d = Integer.valueOf(i);
        return (ajfz) abnpVarK.q();
    }

    public ajfz f(vyk vykVar) {
        if (vykVar != null) {
            ajfz ajfzVar = this.b;
            if (!vykVar.equals(vyk.b(ajfzVar))) {
                abnp abnpVarN = ajfz.a.n();
                int iAt = a.at(ajfzVar.e);
                if (iAt == 0) {
                    iAt = 1;
                }
                abnpVarN.t();
                ajfz ajfzVar2 = (ajfz) abnpVarN.b;
                ajfzVar2.e = iAt - 1;
                ajfzVar2.b |= 2;
                vykVar.g(abnpVarN);
                return (ajfz) abnpVarN.q();
            }
        }
        return this.b;
    }
}
