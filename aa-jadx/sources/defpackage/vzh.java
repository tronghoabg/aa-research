package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vzh {
    public final boolean a;
    public final defpackage.ajgy b;

    public vzh(boolean z, defpackage.ajgy ajgyVar) {
        this.a = z;
        this.b = ajgyVar;
    }

    public defpackage.vzf a(java.lang.String str) {
        return d(str);
    }

    public abstract defpackage.ajgy b(defpackage.vzf vzfVar);

    public defpackage.vzf d(java.lang.String str) {
        return a(str);
    }

    public final defpackage.ajgy e() {
        defpackage.abor aborVarK = f(null).K();
        int i = defpackage.vzf.b.c;
        aborVarK.t();
        defpackage.ajgy ajgyVar = (defpackage.ajgy) aborVarK.b;
        ajgyVar.c = 2;
        ajgyVar.d = java.lang.Integer.valueOf(i);
        return (defpackage.ajgy) aborVarK.q();
    }

    public defpackage.ajgy f(defpackage.vzf vzfVar) {
        if (vzfVar != null) {
            defpackage.ajgy ajgyVar = this.b;
            if (!vzfVar.equals(defpackage.vzf.b(ajgyVar))) {
                defpackage.abor aborVarN = defpackage.ajgy.a.n();
                int iAs = defpackage.a.as(ajgyVar.e);
                if (iAs == 0) {
                    iAs = 1;
                }
                aborVarN.t();
                defpackage.ajgy ajgyVar2 = (defpackage.ajgy) aborVarN.b;
                ajgyVar2.e = iAs - 1;
                ajgyVar2.b |= 2;
                vzfVar.g(aborVarN);
                return (defpackage.ajgy) aborVarN.q();
            }
        }
        return this.b;
    }
}
