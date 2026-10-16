package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ofl extends ieq {
    public ofm a;
    final /* synthetic */ ofq b;
    private final CarCall d;
    private final Uri e;
    private final long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(ofq ofqVar, CarCall carCall, Uri uri) {
        super(96, 96);
        carCall.getClass();
        this.b = ofqVar;
        this.d = carCall;
        this.e = uri;
        oit.a();
        this.f = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        ((ynz) ofq.a.f().ai(5854)).w("onLoadCleared for contact photo. id=%s", this.d.a);
        ofm ofmVar = this.a;
        if (ofmVar != null) {
            this.b.e(ofmVar);
        }
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        ynz ynzVar = (ynz) ofq.a.g().ai(5855);
        CarCall carCall = this.d;
        ynzVar.w("Could not load contact photo. id=%s", carCall.a);
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aK);
        abnp abnpVarF = rrbVarH.F();
        abnpVarF.t();
        yzn yznVar = (yzn) abnpVarF.b;
        yzn yznVar2 = yzn.a;
        yznVar.b |= 1;
        yznVar.c = carCall.e;
        abnp abnpVarB = rrbVarH.B();
        boolean z = !jxn.c().e(this.e);
        abnpVarB.t();
        yww ywwVar = (yww) abnpVarB.b;
        yww ywwVar2 = yww.a;
        ywwVar.b |= 2;
        ywwVar.d = z;
        abnp abnpVarB2 = rrbVarH.B();
        oit.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        abnpVarB2.t();
        yww ywwVar3 = (yww) abnpVarB2.b;
        ywwVar3.b |= 1;
        ywwVar3.c = jElapsedRealtime;
        ebf.j().F(rrbVarH.l());
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        ofq ofqVar = this.b;
        Bitmap bitmap = (Bitmap) obj;
        Set setKeySet = ofqVar.e.keySet();
        CarCall carCall = this.d;
        int i = carCall.a;
        if (!setKeySet.contains(Integer.valueOf(i))) {
            ((ynz) ofq.a.f().ai(5856)).w("Loaded contact photo for removed call. id=%d", i);
            return;
        }
        ((ynz) ofq.a.f().ai(5857)).w("Loaded contact photo. id=%d", i);
        ofm ofmVar = this.a;
        if (ofmVar != null) {
            ofqVar.e(ofmVar);
        }
        ofqVar.f(bitmap, carCall);
    }
}
