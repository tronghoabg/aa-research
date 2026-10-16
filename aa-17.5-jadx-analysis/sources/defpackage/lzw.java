package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.auto.sdk.nav.NavigationClientConfig;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class lzw implements lzt, lzx {
    public static final yph a = yph.c("GH.NavProviderClientSrc");
    public final ComponentName b;
    public final lzs c;
    public lzy e;
    public final Handler f;
    private final ComponentName i;
    private final Context j;
    private final lws k;
    public final Object d = new Object();
    public int g = 0;
    public final Runnable h = new lqj(this, 15, null);

    public lzw(Context context, lws lwsVar, ComponentName componentName, ComponentName componentName2, lzs lzsVar) {
        this.j = context;
        lwsVar.getClass();
        this.k = lwsVar;
        this.i = componentName;
        this.b = componentName2;
        this.c = lzsVar;
        this.f = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.lzt
    @ResultIgnorabilityUnspecified
    public final boolean a() {
        ComponentName componentName = this.b;
        componentName.getClass();
        Intent intent = new Intent();
        intent.setComponent(componentName);
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4547)).y("Binding to nav service: %s", componentName);
        synchronized (this.d) {
            lzy lzyVar = this.e;
            if (lzyVar == null || !lzyVar.d.equals(componentName)) {
                d(this.e);
                intent.putExtra("NAVIGATION_CLIENT_CONFIG", new NavigationClientConfig(1, mpm.d(kio.b().e())));
                lzy lzyVar2 = new lzy(componentName, this);
                if (!spi.a().d(this.j, intent, lzyVar2, Build.VERSION.SDK_INT >= 29 ? 4097 : 1)) {
                    return false;
                }
                this.e = lzyVar2;
                this.f.postDelayed(this.h, 5000L);
            } else {
                ((ype) yphVar.l().ai(4548)).y("Trying to bind to same nav provider when already bound. Ignoring: %s", componentName);
            }
            return true;
        }
    }

    public final void b() {
        d(this.e);
        if (this.g < 3) {
            ((ype) ((ype) a.h()).ai(4550)).K("Navigation Client Provider Rebind to %s attempt: %d", this.i, this.g);
            this.g++;
            a();
        } else {
            yop yopVarG = a.g();
            ComponentName componentName = this.i;
            ((ype) ((ype) yopVarG).ai((char) 4549)).y("Unable to bind to %s", componentName);
            this.c.n(componentName, "Rebind limit exceeded");
        }
    }

    public final void c(lzy lzyVar) {
        if (lzyVar == null) {
            return;
        }
        ComponentName componentName = lzyVar.d;
        ((ype) a.l().ai((char) 4551)).y("Unbinding from nav service: %s", componentName.getShortClassName());
        try {
            try {
                lzyVar.a();
            } catch (RuntimeException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai(4552)).u("Error in nav provider while unbinding from it");
            }
            if (this.e == lzyVar) {
                this.e = null;
            }
            this.f.removeCallbacks(this.h);
        } finally {
            spi.a().c(this.j, lzyVar);
            if (this.e == lzyVar) {
                this.e = null;
            }
            this.f.removeCallbacks(this.h);
        }
    }

    public final void d(lzy lzyVar) {
        c(lzyVar);
        wer.c();
        lzp lzpVar = (lzp) this.c;
        lzpVar.o(null);
        lzt lztVar = lzpVar.d;
        if (lztVar != null) {
            eqm eqmVar = lzpVar.f;
            ajnt ajntVar = new ajnt((char[]) null);
            ajntVar.k(((lzw) lztVar).b);
            ajntVar.a = 1;
            eqmVar.m(ajntVar.j());
        }
        if (acye.c()) {
            mab.c().d();
        } else {
            mlq.e().h(yzr.NAV_NOTIFICATION_HERO);
            mlq.e().h(yzr.NAV_NOTIFICATION_NORMAL);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationProviderClientSource{navComponent=");
        sb.append(this.i);
        sb.append(", navProviderComponent=");
        sb.append(this.b);
        synchronized (this.d) {
            sb.append(", currentConnection=");
            sb.append(this.e);
            sb.append(", rebindAttempts=");
            sb.append(this.g);
        }
        sb.append('}');
        return sb.toString();
    }
}
