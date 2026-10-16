package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lrr implements defpackage.eqt, defpackage.epl {
    private android.content.ComponentName a;
    private boolean b;
    private boolean c;

    private static void g(android.content.ComponentName componentName, boolean z) {
        if (defpackage.acqn.h() && z) {
            defpackage.lby.o.e(defpackage.mkp.a.c);
        }
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 20, z ? defpackage.zaa.MEDIA_SESSION_STARTED : defpackage.zaa.MEDIA_SESSION_STOPPED);
        rroVarH.e(componentName.getPackageName());
        oimVarU.F(rroVarH.l());
    }

    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        if (this.b) {
            android.content.ComponentName componentName = this.a;
            componentName.getClass();
            g(componentName, true);
            this.c = true;
        }
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        if (this.c) {
            android.content.ComponentName componentName = this.a;
            componentName.getClass();
            g(componentName, false);
            this.c = false;
        }
    }

    @Override // defpackage.eqt
    public final /* synthetic */ void ea(java.lang.Object obj) {
        defpackage.lrk lrkVar = (defpackage.lrk) obj;
        android.content.ComponentName componentName = lrkVar.a;
        android.content.ComponentName componentName2 = this.a;
        this.a = componentName;
        this.b = componentName != null && lrkVar.b == defpackage.lor.b && defpackage.lki.b(lrkVar.c) && !lrkVar.d;
        if (j$.util.Objects.equals(componentName2, this.a)) {
            android.content.ComponentName componentName3 = this.a;
            if (componentName3 != null) {
                boolean z = this.c;
                boolean z2 = this.b;
                if (z != z2) {
                    g(componentName3, z2);
                    this.c = this.b;
                    return;
                }
                return;
            }
            return;
        }
        if (this.c) {
            componentName2.getClass();
            g(componentName2, false);
            this.c = false;
        }
        if (this.b) {
            android.content.ComponentName componentName4 = this.a;
            componentName4.getClass();
            g(componentName4, true);
            this.c = true;
        }
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }
}
