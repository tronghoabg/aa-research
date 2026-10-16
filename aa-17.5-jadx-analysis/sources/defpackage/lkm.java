package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class lkm extends llc {
    private static final yob a = yob.c("com/google/android/apps/auto/components/media/app/browse/MoreModel");
    private final PendingIntent o;
    private final afdr p;
    private final afeg q;
    private final eqm r;

    public lkm(Context context, ept eptVar, mon monVar, List list, PendingIntent pendingIntent, int i, int i2, htm htmVar, afdr afdrVar, afdr afdrVar2, afeg afegVar) {
        super(context, eptVar, monVar, i, i, i2, afdrVar, afdrVar2, "More", 0, null, null, htmVar, null, 257024);
        this.o = pendingIntent;
        this.p = afdrVar;
        this.q = afegVar;
        afbt afbtVar = new afbt(10);
        afbtVar.addAll(list);
        if (pendingIntent != null) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gU);
            rrbVarH.p(monVar.a);
            ohsVarJ.F(rrbVarH.l());
            llu lluVar = new llu((short[]) null);
            lluVar.I(this.c.getString(R.string.settings_media));
            lluVar.G("settings_media_item");
            String str = String.format(Locale.US, "android.resource://%s/%d", Arrays.copyOf(new Object[]{this.c.getPackageName(), Integer.valueOf(R.drawable.gs_settings_vd_theme_24)}, 2));
            str.getClass();
            lluVar.F(Uri.parse(str));
            Bundle bundle = new Bundle();
            bundle.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", 3);
            lluVar.D(bundle);
            afbtVar.add(new llu(lluVar.B(), 0));
        }
        List listG = g(afbtVar.f());
        afco afcoVar = tby.a;
        this.r = new eqm(listG);
    }

    private final void n() throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = this.o;
        if (pendingIntent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gV);
        ComponentName componentName = this.d.a;
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        lnh lnhVar = new lnh(componentName);
        Bundle bundle = new Bundle();
        bundle.putBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY", lnhVar);
        Intent intentPutExtras = new Intent().putExtras(bundle);
        intentPutExtras.getClass();
        try {
            pendingIntent.send(this.c, 0, intentPutExtras);
        } catch (PendingIntent.CanceledException e) {
            ((ynz) ((ynz) a.h()).p(e).ai(3986)).y("Failed to send pending intent %s", this.o);
        }
    }

    @Override // defpackage.llc
    public final /* synthetic */ eqj a() {
        return this.r;
    }

    @Override // defpackage.llc
    public final void d(llu lluVar) throws PendingIntent.CanceledException {
        lluVar.getClass();
        if (affa.f(lluVar.i(), "settings_media_item")) {
            n();
        } else if (!lluVar.k()) {
            this.q.invoke(lluVar, this.n);
        } else {
            m(lluVar);
            this.p.invoke();
        }
    }
}
