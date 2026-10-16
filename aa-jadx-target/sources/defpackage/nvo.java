package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nvo {
    static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.nvo.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/system/notification/internal/NotificationDirector;", 0)};
    public static final /* synthetic */ int b = 0;

    public static final void b(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.oio oioVarA = defpackage.oio.a();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SYSTEM_UI_NOTIFICATION, zbdVar);
        rrvVarH.p(componentName);
        oioVarA.b((defpackage.rrw) rrvVarH.l());
    }

    public static final android.content.ComponentName c(nuv nuvVar) {
        java.lang.String str = nuvVar.b;
        str.getClass();
        android.content.ComponentName componentNameCreateRelative = android.content.ComponentName.createRelative(nuvVar.c.f, str);
        componentNameCreateRelative.getClass();
        return componentNameCreateRelative;
    }

    public final defpackage.nvq a() {
        return (defpackage.nvq) defpackage.nvq.c.getValue(this, a[0]);
    }
}
