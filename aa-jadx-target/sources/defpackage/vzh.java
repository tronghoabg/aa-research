package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class vzh {
    public final boolean a;
    public final ajgy b;

    public vzh(boolean z, ajgy ajgyVar) {
        this.a = z;
        this.b = ajgyVar;
    }

    public defpackage.vzf a(java.lang.String str) {
        return d(str);
    }

    public abstract ajgy b(defpackage.vzf vzfVar);

    public defpackage.vzf d(java.lang.String str) {
        return a(str);
    }

    public final ajgy e() {
        defpackage.abor aborVarK = f(null).K();
        int i = defpackage.vzf.b.c;
        aborVarK.t();
        ajgy ajgyVar = aborVarK.b;
        ajgyVar.c = 2;
        ajgyVar.d = java.lang.Integer.valueOf(i);
        return aborVarK.q();
    }

    public ajgy f(defpackage.vzf vzfVar) {
        if (vzfVar != null) {
            ajgy ajgyVar = this.b;
            if (!vzfVar.equals(defpackage.vzf.b(ajgyVar))) {
                defpackage.abor aborVarN = ajgy.a.n();
                int iAs = defpackage.a.as(ajgyVar.e);
                if (iAs == 0) {
                    iAs = 1;
                }
                aborVarN.t();
                ajgy ajgyVar2 = aborVarN.b;
                ajgyVar2.e = iAs - 1;
                ajgyVar2.b |= 2;
                vzfVar.g(aborVarN);
                return aborVarN.q();
            }
        }
        return this.b;
    }
}
