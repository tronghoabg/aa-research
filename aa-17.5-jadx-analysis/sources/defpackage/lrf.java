package defpackage;

import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes.dex */
final class lrf implements eqn {
    static {
        yph.c("GH.MediaImgTypeMetrics");
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        lra lraVar = (lra) obj;
        ComponentName componentName = lraVar.a;
        lmd lmdVar = lraVar.b;
        if (componentName == null) {
            return;
        }
        Uri uri = (Uri) spu.aT(lmdVar, new llx(13));
        if (uri != null && mlq.N(uri)) {
            ohu ohuVarA = ohu.a();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fB);
            rrbVarH.p(componentName);
            ohuVarA.b((rrc) rrbVarH.l());
        }
        if (((Bitmap) spu.aT(lmdVar, new llx(14))) == null || uri != null) {
            return;
        }
        ohu ohuVarA2 = ohu.a();
        rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fA);
        rrbVarH2.p(componentName);
        ohuVarA2.b((rrc) rrbVarH2.l());
    }
}
