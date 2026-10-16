package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class lgg extends afde implements afeg {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ Context c;
    final /* synthetic */ GhIcon d;
    final /* synthetic */ cmw e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgg(float f, Context context, GhIcon ghIcon, cmw cmwVar, afck afckVar) {
        super(2, afckVar);
        this.b = f;
        this.c = context;
        this.d = ghIcon;
        this.e = cmwVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        lgg lggVar = new lgg(this.b, this.c, this.d, this.e, afckVar);
        lggVar.f = obj;
        return lggVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        bxd bxdVar;
        afcr afcrVar = afcr.a;
        if (this.a != 0) {
            bxdVar = (bxd) this.f;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            bxd bxdVar2 = (bxd) this.f;
            float f = this.b;
            int iK = Float.isNaN(f) ? -1 : afgi.k(dlf.w(this.c).eA(f));
            GhIcon ghIcon = this.d;
            Context context = this.c;
            this.f = bxdVar2;
            this.a = 1;
            int i = lgi.a;
            Executor executor = mki.a.d;
            executor.getClass();
            aitg aitgVar = new aitg(affa.s(this), 1);
            aitgVar.z();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            Handler handler = new Handler(looperMyLooper);
            ajmd ajmdVar = new ajmd(aitgVar, null);
            int i2 = ghIcon.b;
            if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 10 || i2 == 7 || i2 == 8) {
                ajmdVar.x(ghIcon.f(context, iK));
            } else {
                lgc lgcVar = new lgc(ghIcon, context, iK, handler, executor, ajmdVar);
                lgcVar.c.execute(lgcVar);
            }
            Object objK = aitgVar.k();
            if (objK == afcrVar) {
                return afcrVar;
            }
            bxdVar = bxdVar2;
            obj = objK;
        }
        Drawable drawable = (Drawable) obj;
        bxdVar.b(drawable == null ? this.e : new lgf(drawable));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((lgg) b((bxd) obj, (afck) obj2)).hT(afak.a);
    }
}
