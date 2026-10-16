package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class njq implements ngq {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ njq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v22, types: [eqg, java.lang.Object] */
    public final boolean a(ngx ngxVar) {
        int i = this.b;
        if (i == 0) {
            return ((njv) this.a).j(ngxVar);
        }
        if (i == 1) {
            java.lang.Object obj = this.a;
            if (!((android.support.v4.app.Fragment) obj).isAdded()) {
                ((defpackage.yqj) defpackage.nik.b.h()).u("Trying to run education after rail detatched");
                return false;
            }
            defpackage.nik nikVar = (defpackage.nik) obj;
            if (nikVar.c != null) {
                defpackage.nik.b(ngxVar, defpackage.zbd.eQ, "another tooltip is already showing", new java.lang.Object[0]);
                return false;
            }
            if (!(ngxVar instanceof nmv)) {
                defpackage.zbd zbdVar = defpackage.zbd.eR;
                java.lang.String simpleName = ngxVar.getClass().getSimpleName();
                simpleName.getClass();
                defpackage.nik.b(ngxVar, zbdVar, "unrecognized display type %s", simpleName);
                return false;
            }
            nmv nmvVar = (nmv) ngxVar;
            defpackage.lhe lheVarC = nikVar.c(nmvVar.a());
            if (lheVarC == null || ((defpackage.bzc) lheVarC.a).b == 0) {
                defpackage.nik.b(ngxVar, defpackage.zbd.eS, "anchor view %s is null or not shown", nmvVar.a());
                return false;
            }
            defpackage.khg.u(new defpackage.wde("GH.CompRailBaseFrag", defpackage.zbe.RAIL, defpackage.zbd.eP, "Error building tooltip", new java.lang.Object[0]), new defpackage.lyb(obj, ngxVar, lheVarC, 6, (char[]) null));
            return true;
        }
        if (i == 2) {
            return ((njv) this.a).j(ngxVar);
        }
        oxg oxgVar = null;
        if (i == 3) {
            if (!(ngxVar instanceof nrg)) {
                return false;
            }
            ?? r12 = this.a;
            defpackage.nrm.c.l().u("Showing immersive toolbar education");
            ngx ngxVar2 = (nrg) ngxVar;
            oxg oxgVar2 = new oxg((defpackage.eqg) r12);
            nrh nrhVar = new nrh();
            oxgVar2.b = (defpackage.noz) defpackage.khg.u(new defpackage.wde("IMMERSIVE_TOOLBAR_EDUCATION", defpackage.zbe.IMMERSIVE_MODE, defpackage.zbd.LF, "Unable to create immersive toolbar education", new java.lang.Object[0]), new defpackage.nma(oxgVar2, nrhVar, 12));
            nrhVar.a.b(new defpackage.ccz(-80858378, true, new myl(nrhVar, oxgVar2, 7, (byte[]) null)));
            if (oxgVar2.b != null) {
                defpackage.ngy.g().i(ngxVar2);
                oxgVar = oxgVar2;
            }
            ((defpackage.nrm) r12).g = oxgVar;
            return true;
        }
        if (!(ngxVar instanceof nwc)) {
            return false;
        }
        java.lang.Object obj2 = this.a;
        ((defpackage.yqj) ((defpackage.yqj) defpackage.nwd.a.f()).ai((char) 5493)).u("Showing quick feedback display");
        nwc nwcVar = (nwc) ngxVar;
        int i2 = nwf.a;
        int i3 = nwcVar.b;
        int i4 = nwcVar.c;
        android.content.Context context = ((defpackage.nwd) obj2).b;
        java.lang.String string = context.getString(i3);
        java.lang.String string2 = i4 == 0 ? null : context.getString(i4);
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nwcVar.d;
        androidx.car.app.model.CarIcon carIcon = nwcVar.e;
        defpackage.zbe zbeVar = nwcVar.f;
        android.content.ComponentName componentName = nwcVar.g;
        nwe nweVar = nwcVar.h;
        aafz aafzVar = new aafz((byte[]) null);
        aafzVar.b = nwf.a(context, zbeVar, defpackage.zbd.FU, componentName, nweVar);
        aafzVar.e = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, 2131233163);
        nvb nvbVar = new nvb(aafzVar);
        aafz aafzVar2 = new aafz((byte[]) null);
        aafzVar2.b = nwf.a(context, zbeVar, defpackage.zbd.FT, componentName, nweVar);
        aafzVar2.e = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, 2131233162);
        nvb nvbVar2 = new nvb(aafzVar2);
        nvc nvcVar = new nvc();
        nvcVar.m = string;
        nvcVar.d = ghIcon;
        nvcVar.e = carIcon;
        nvcVar.a = nvf.d;
        nvcVar.x = defpackage.nve.f;
        nvcVar.j = false;
        nvcVar.A = nvd.b;
        nvcVar.f = "com.google.android.projection.gearhead";
        nvcVar.p = nvbVar;
        nvcVar.q = nvbVar2;
        if (string2 != null) {
            nun nunVarA = nup.a();
            nunVarA.d = string2;
            nunVarA.a = ghIcon;
            nunVarA.b = carIcon;
            nunVarA.j = "com.google.android.projection.gearhead";
            nunVarA.f = nvbVar;
            nunVarA.h = nvbVar2;
            nunVarA.g = nuo.a;
            nunVarA.b(java.lang.System.currentTimeMillis());
            nvcVar.u = nunVarA.a();
        }
        nvh nvhVarB = nvcVar.b();
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.FS);
        rrvVarH.p(componentName);
        oimVarU.F(rrvVarH.l());
        defpackage.nuz nuzVarB = defpackage.nuz.b();
        nwc.a.longValue();
        nuzVarB.j("quick_feedback_notification_tag", 759347436L, nvhVarB);
        defpackage.ngy.g().i(ngxVar);
        return true;
    }
}
