package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lnm extends defpackage.mpa {
    public lnm() {
        super("Media");
    }

    @Override // defpackage.mpa
    protected final void a(android.content.Intent intent) {
        if (intent.getComponent() == null) {
            return;
        }
        if (defpackage.afga.f(intent.getComponent(), defpackage.mkt.F)) {
            defpackage.kjx.a.a().l(2);
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_PLAYBACK_ONLY_APP_LAUNCH, defpackage.zbd.hd);
            rrvVarH.p(intent.getComponent());
            oimVarU.F(rrvVarH.l());
            return;
        }
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        java.lang.String str = new low(context, intent.getComponent()).a().c;
        str.getClass();
        try {
            defpackage.mfm.a();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.ComponentName component = intent.getComponent();
            if (component == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(component.getPackageName());
            if (launchIntentForPackage == null) {
                intent.addFlags(268435456);
            } else {
                intent = launchIntentForPackage;
            }
            defpackage.mfm.c(context, intent, str, defpackage.zbe.MEDIA_PLAYBACK_ONLY_APP_LAUNCH);
        } catch (android.content.ActivityNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.mpa.b.h()).p(e)).y("Activity not found for %s", str);
            defpackage.ocn.a().g(context, defpackage.mkt.s, context.getString(2132083145, str), 1);
        }
    }

    @Override // defpackage.mpa
    protected final boolean b(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        if (defpackage.lnt.e(intent) && component != null && !defpackage.afga.f(component, defpackage.mkt.f)) {
            java.lang.String packageName = component.getPackageName();
            packageName.getClass();
            if (packageName.length() > 0) {
                java.lang.String className = component.getClassName();
                className.getClass();
                if (className.length() == 0) {
                    java.lang.String packageName2 = component.getPackageName();
                    packageName2.getClass();
                    defpackage.yhx yhxVarE = defpackage.ler.a().e(defpackage.kit.b().e(), defpackage.nze.a());
                    yhxVarE.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : yhxVarE) {
                        if (defpackage.afga.f(((defpackage.mqj) obj).a().getPackageName(), packageName2)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() > 1) {
                        ((defpackage.yqj) defpackage.mpa.b.h()).M("Found multiple launcher apps for package %s, choosing first in list %s", packageName2, arrayList);
                    }
                    defpackage.mqj mqjVar = (defpackage.mqj) defpackage.afga.aB(arrayList);
                    if (mqjVar == null) {
                        return true;
                    }
                    intent.setComponent(mqjVar.a());
                    return false;
                }
            }
            if (defpackage.ler.a().a(defpackage.kit.b().e(), defpackage.mpr.d(intent)) == null) {
                return true;
            }
        }
        return false;
    }
}
