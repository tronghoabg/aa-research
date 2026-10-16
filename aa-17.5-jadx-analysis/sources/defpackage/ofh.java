package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes2.dex */
final class ofh extends ieq {
    final /* synthetic */ ofi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofh(ofi ofiVar) {
        super(96, 96);
        this.a = ofiVar;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        ((ype) ((ype) ofi.a.f()).ai((char) 5834)).y("onLoadCleared from contactPhotoTarget. id=%s", spu.aT(this.a.c, new lst(6)));
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        ype ypeVar = (ype) ((ype) ofi.a.g()).ai(5835);
        ofi ofiVar = this.a;
        ypeVar.w("CurrentCallNotificationProducer could not load Contact photo. id=%s", ofiVar.c.a);
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aK);
        abnp abnpVarF = rrbVarH.F();
        int i = ofiVar.c.e;
        abnpVarF.t();
        yzn yznVar = (yzn) abnpVarF.b;
        yzn yznVar2 = yzn.a;
        yznVar.b |= 1;
        yznVar.c = i;
        if (ofiVar.d != null) {
            abnp abnpVarB = rrbVarH.B();
            boolean z = !jxn.c().e(ofiVar.d);
            abnpVarB.t();
            yww ywwVar = (yww) abnpVarB.b;
            yww ywwVar2 = yww.a;
            ywwVar.b |= 2;
            ywwVar.d = z;
        }
        abnp abnpVarB2 = rrbVarH.B();
        oit.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - ofiVar.e;
        abnpVarB2.t();
        yww ywwVar3 = (yww) abnpVarB2.b;
        yww ywwVar4 = yww.a;
        ywwVar3.b |= 1;
        ywwVar3.c = jElapsedRealtime;
        ebf.j().F(rrbVarH.l());
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        ype ypeVar = (ype) ((ype) ofi.a.f()).ai(5836);
        ofi ofiVar = this.a;
        ypeVar.w("Loaded contact photo. id=%d", ofiVar.c.a);
        hrt.c(ofiVar.b).i(ofiVar.f);
        ofiVar.O((Bitmap) obj);
    }
}
