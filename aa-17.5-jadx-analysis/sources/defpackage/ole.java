package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class ole extends erm {
    public final eqj a;
    public final eqj b;
    public final eqj c;
    public final eqj d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj i;

    public ole() {
        mao maoVar = new mao();
        Context context = mki.a.c;
        mad madVarE = mad.e();
        this.f = madVarE.c;
        eqm eqmVar = madVarE.a;
        eqm eqmVar2 = madVarE.b;
        this.i = maoVar;
        eqj eqjVarB = eqy.b(eqmVar2, new oin(3));
        int i = 4;
        eqj eqjVarB2 = eqy.b(eqmVar, new oin(i));
        int i2 = 5;
        eqj eqjVarB3 = eqy.b(eqmVar2, new oin(i2));
        this.b = eqy.b(eqjVarB2, new oin(6));
        this.c = eqy.b(eqjVarB3, new oin(7));
        this.e = eqy.b(eqjVarB2, new olc());
        this.a = eqy.b(eqjVarB, new nzf(context, i));
        this.d = eqy.b(eqjVarB3, new nzf(context, i2));
        this.g = tby.c(tby.w(maoVar, new oin(8)), GhIcon.p(mki.a.c, R.drawable.android_auto_icon));
    }
}
