package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class lrk implements eqn {
    static {
        yph.c("GH.MediaPlayOnStMetrics");
    }

    public static void b(eqj eqjVar, eqa eqaVar) {
        szp.i(eqjVar, eqaVar, new lrk());
    }

    @Override // defpackage.eqn
    public final /* bridge */ /* synthetic */ void eS(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        if (componentName == null) {
            return;
        }
        ohs ohsVarJ = ebf.j();
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 20, yyv.MEDIA_SESSION_ALREADY_PLAYING);
        rquVarH.e(componentName.getPackageName());
        ohsVarJ.F(rquVarH.l());
    }
}
