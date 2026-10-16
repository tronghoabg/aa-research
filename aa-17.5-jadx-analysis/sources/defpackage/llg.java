package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Map;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class llg {
    public static final yob a = yob.c("com/google/android/apps/auto/components/media/app/playback/PlaybackModel");
    public final Context b;
    public final mon c;
    public final afec d;
    public final afdr e;
    public final afdr f;
    public final lth g;
    public final eqj h;
    public final IconCompat i;
    public final eqj j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final eqj n;
    public final eqj o;
    public final eqj p;
    public final eqj q;
    public final eqj r;
    private final eqa s;
    private final eqj t;
    private final eqj u;
    private final eqj v;

    public llg(Context context, mon monVar, eqa eqaVar, int i, afec afecVar, afdr afdrVar, afdr afdrVar2) {
        lth lthVarB;
        eqj eqjVarG;
        eqj eqjVarT;
        eqj eqmVar;
        this.b = context;
        this.c = monVar;
        this.s = eqaVar;
        this.d = afecVar;
        this.e = afdrVar;
        this.f = afdrVar2;
        eqj eqjVarF = loy.j().f(monVar.a);
        this.t = eqjVarF;
        int i2 = 1;
        if (acsx.Q()) {
            yzz yzzVar = yzz.MEDIA_FACET;
            ComponentName componentName = monVar.a;
            afco afcoVar = tby.a;
            eqm eqmVar2 = new eqm(componentName);
            eqjVarF.getClass();
            lthVarB = lto.b(yzzVar, eqmVar2, eqjVarF, lmi.a.a().d() ? new mzw(1) : null);
        } else {
            lthVarB = null;
        }
        this.g = lthVarB;
        eqjVarF.getClass();
        eqj eqjVarB = eqy.b(eqjVarF, new lle(i2));
        this.h = eqjVarB;
        this.i = IconCompat.k(lfs.e(context).c(context, monVar.a, i));
        int i3 = 3;
        if (lthVarB == null) {
            eqjVarG = tby.C(eqjVarB, new llf(this, i3));
        } else {
            afco afcoVar2 = tby.a;
            ltn ltnVar = (ltn) lthVarB;
            eqjVarG = tby.G(ltnVar.c, ltnVar.d, new kus(this, 10));
        }
        int i4 = 4;
        eqjVarG.fE(eqaVar, new ewg(new llf(this, i4), 18));
        if (lthVarB == null) {
            eqjVarT = tby.t(tby.C(eqjVarB, new lle(7)));
        } else {
            ltn ltnVar2 = (ltn) lthVarB;
            eqjVarT = tby.t(tby.G(ltnVar2.d, ltnVar2.c, new kuu(9)));
        }
        this.j = eqjVarT;
        int i5 = 0;
        this.k = tby.t(tby.C(eqjVarB, new lle(i5)));
        this.l = lom.a(monVar.a);
        lsc lscVarF = lsc.f();
        ComponentName componentName2 = monVar.a;
        this.m = tby.d(lscVarF.e(componentName2), (eqj) Map.EL.computeIfAbsent(lscVarF.f, componentName2, new lka(15)), new kuu(15));
        int i6 = 2;
        eqj eqjVarC = lthVarB == null ? tby.c(tby.C(eqjVarB, new lle(i6)), lmd.a) : ((ltn) lthVarB).c;
        this.u = eqjVarC;
        eqj eqjVarW = lthVarB == null ? tby.w(eqjVarB, new lle(i3)) : ((ltn) lthVarB).e;
        this.v = eqjVarW;
        this.n = tby.w(eqjVarW, new lle(i4));
        if (lthVarB == null || !affa.f(monVar.a, mkn.G)) {
            eqmVar = new eqm(null);
        } else {
            eqj eqjVarE = lthVarB.e(dty.f(eqaVar));
            ltn ltnVar3 = (ltn) lthVarB;
            eqmVar = tby.e(eqjVarE, ltnVar3.j, ltnVar3.l, new kkw(this, 13));
        }
        this.o = eqmVar;
        ComponentName componentName3 = monVar.a;
        ComponentName componentName4 = mkn.G;
        this.p = affa.f(componentName3, componentName4) ? eqy.a(eqy.b(eqjVarC, new llf(this, i5))) : new eqm(null);
        this.q = affa.f(monVar.a, componentName4) ? eqy.a(eqy.b(eqjVarC, new llf(this, i6))) : new eqm(null);
        this.r = affa.f(monVar.a, componentName4) ? eqy.a(eqy.b(eqjVarC, new lle(6))) : new eqm(afbf.a);
    }

    public static final void c(SpannableStringBuilder spannableStringBuilder, CarIcon carIcon) {
        spannableStringBuilder.append(" ", CarIconSpan.create(carIcon, 2), 33);
    }

    public static final IconCompat d(Resources resources, String str, int i) throws Resources.NotFoundException {
        if (i != 0) {
            TypedValue typedValue = new TypedValue();
            if (resources != null) {
                try {
                    resources.getValue(i, typedValue, true);
                } catch (Resources.NotFoundException e) {
                    ((ynz) ((ynz) a.h()).p(e).ai(3995)).u("Unable to load resource for attribution icon.");
                    return null;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && afyh.C(charSequence, ".xml")) {
                return IconCompat.n(resources, str, i);
            }
        }
        return null;
    }

    public final boolean a(lmd lmdVar, AaPlaybackState aaPlaybackState) {
        HashMap map = lll.a.a().c;
        ComponentName componentName = this.c.a;
        Long l = (Long) map.get(componentName);
        long jLongValue = l != null ? l.longValue() : -1L;
        if (jLongValue != -1) {
            oit.a();
            if (SystemClock.elapsedRealtime() - jLongValue < 5000) {
                return false;
            }
        }
        return !lnm.p(aaPlaybackState, lmdVar, componentName);
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, int i, krr krrVar) {
        c(spannableStringBuilder, thq.d(this.b, i, new llf(krrVar, 1)));
    }
}
