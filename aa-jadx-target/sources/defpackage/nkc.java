package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nkc implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nkc(aiuw aiuwVar, com.google.android.gms.car.control.CarAction carAction, nqr nqrVar, int i) {
        this.d = i;
        this.b = aiuwVar;
        this.c = carAction;
        this.a = nqrVar;
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [aiuw, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.d;
        if (i == 0) {
            android.content.ComponentName componentName = (android.content.ComponentName) obj;
            java.lang.Object obj2 = componentName == null ? this.a : componentName;
            if (obj2 == null) {
                return defpackage.kfn.h();
            }
            android.content.ComponentName componentName2 = (android.content.ComponentName) obj2;
            return new defpackage.nne(com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName2), componentName2, null, null, false, new defpackage.lyb(obj2, this.b, this.c, 9, (short[]) null));
        }
        if (i == 1) {
            android.content.ComponentName componentName3 = (android.content.ComponentName) obj;
            java.lang.Object obj3 = componentName3 == null ? this.a : componentName3;
            if (obj3 == null) {
                return defpackage.kfn.h();
            }
            android.content.ComponentName componentName4 = (android.content.ComponentName) obj3;
            return new defpackage.nne(com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName4), componentName4, null, null, false, new defpackage.lyb(this.b, this.c, obj3, 10, (byte[]) null));
        }
        if (i == 2) {
            ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new fax((com.google.android.gms.car.control.CarAction) this.c, (nqr) this.a, ((java.lang.Boolean) obj).booleanValue(), (defpackage.afdk) null, 4), 3);
            return defpackage.afbk.a;
        }
        if (i == 3) {
            ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new fax((com.google.android.gms.car.control.CarAction) this.c, (nqr) this.a, ((java.lang.Boolean) obj).booleanValue(), (defpackage.afdk) null, 5, (byte[]) null), 3);
            return defpackage.afbk.a;
        }
        if (i == 4) {
            ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new fax((com.google.android.gms.car.control.CarAction) this.c, (nqr) this.a, ((java.lang.Boolean) obj).booleanValue(), (defpackage.afdk) null, 6, (char[]) null), 3);
            return defpackage.afbk.a;
        }
        if (i == 5) {
            ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new fax((com.google.android.gms.car.control.CarAction) this.c, (nqr) this.a, ((java.lang.Boolean) obj).booleanValue(), (defpackage.afdk) null, 7, (short[]) null), 3);
            return defpackage.afbk.a;
        }
        nwt nwtVar = (nwt) obj;
        nwtVar.getClass();
        defpackage.nxh nxhVar = (defpackage.nxh) this.a;
        defpackage.mcl.C(nxhVar, defpackage.zbd.ob);
        ((defpackage.afgq) this.b).a = true;
        this.c.invoke(nwtVar);
        nxhVar.g.run();
        return defpackage.afbk.a;
    }

    public /* synthetic */ nkc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
