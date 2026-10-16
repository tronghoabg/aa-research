package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import com.google.android.apps.auto.sdk.nav.NavigationClientConfig;
import com.google.android.apps.auto.sdk.nav.NavigationProviderConfig;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lzv implements lzh {
    public static final yph a = yph.c("GH.NavClient");
    public final ComponentName b;
    public owm f;
    private owo h;
    private lzl i;
    public final pxp g = new pxp(this);
    public TurnEvent c = new TurnEvent();
    public NavigationSummary d = new NavigationSummary();
    public final Handler e = new Handler(Looper.getMainLooper());

    public lzv(owm owmVar, ComponentName componentName) {
        this.f = owmVar;
        componentName.getClass();
        this.b = componentName;
    }

    private final synchronized void g() throws RemoteException {
        if (this.h != null) {
            un unVar = new un(null, null);
            unVar.r(2);
            this.h.c((NavigationSummary) unVar.a);
            this.h = null;
        }
        j(null);
    }

    private static void h(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.NAVIGATION_CLIENT_MANAGER, yzyVar).l());
    }

    private final synchronized void i(int i) throws RemoteException {
        Bundle bundleD = mpm.d(kio.b().e());
        NavigationClientConfig navigationClientConfig = new NavigationClientConfig(i, bundleD);
        ((ype) a.l().ai(4542)).D("Registering as navigation client using version = %d and dynamic configuration = %s", i, bundleD);
        owm owmVar = this.f;
        owmVar.getClass();
        Parcel parcelGh = owmVar.gh();
        ijp.g(parcelGh, navigationClientConfig);
        owmVar.gj(2, parcelGh);
    }

    private final synchronized void j(owo owoVar) throws RemoteException {
        owm owmVar = this.f;
        owmVar.getClass();
        owp owpVarE = owmVar.e();
        if (owpVarE == null) {
            ((ype) a.l().ai((char) 4543)).u("Got null navigation state manager");
            if (owoVar != null) {
                h(yzy.pI);
                return;
            }
            return;
        }
        Parcel parcelGh = owpVarE.gh();
        ijp.i(parcelGh, owoVar);
        owpVarE.gk(1, parcelGh);
        this.h = owoVar;
    }

    private final synchronized void k(owr owrVar) throws RemoteException {
        owm owmVar = this.f;
        owmVar.getClass();
        ows owsVarF = owmVar.f();
        if (owsVarF == null) {
            ((ype) a.l().ai((char) 4544)).u("Got null navigation suggestion manager");
            return;
        }
        Parcel parcelGh = owsVarF.gh();
        ijp.i(parcelGh, owrVar);
        owsVarF.gk(1, parcelGh);
    }

    @Override // defpackage.lzh
    public final ComponentName a() {
        return this.b;
    }

    @Override // defpackage.lzh
    public final eqj b() {
        return this.i.a;
    }

    @Override // defpackage.lzh
    public final synchronized NavigationSummary c() {
        return this.d;
    }

    @Override // defpackage.lzh
    public final synchronized TurnEvent d() {
        return this.c;
    }

    final synchronized void e() {
        try {
            try {
                g();
                k(null);
                owm owmVar = this.f;
                owmVar.getClass();
                owmVar.gj(4, owmVar.gh());
                this.e.post(new ily(11));
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai(4546)).u("Error calling stop() on nav provider");
                h(yzy.pG);
            } catch (RuntimeException e2) {
                ((ype) ((ype) ((ype) a.g()).p(e2)).ai(4545)).u("Error in nav provider cleaning up before unbind");
                h(yzy.pH);
            }
        } finally {
        }
    }

    public final synchronized boolean f() {
        int i;
        wer.b();
        owm owmVar = this.f;
        owmVar.getClass();
        try {
            Parcel parcelGi = owmVar.gi(1, owmVar.gh());
            NavigationProviderConfig navigationProviderConfig = (NavigationProviderConfig) ijp.a(parcelGi, NavigationProviderConfig.CREATOR);
            parcelGi.recycle();
            if (navigationProviderConfig == null) {
                ((ype) ((ype) a.g()).ai(4541)).u("Got null provider config from nav provider service");
                h(yzy.pD);
                return false;
            }
            if (navigationProviderConfig.a > 1 || (i = navigationProviderConfig.b) <= 0) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Invalid API level for connecting to navigation provider. Client is %d. Provider accepts [%d, %d]", 1, Integer.valueOf(navigationProviderConfig.a), Integer.valueOf(navigationProviderConfig.b)));
            }
            i(Math.min(1, i));
            ows owsVarF = this.f.f();
            lzl lzlVar = new lzl(this);
            this.i = lzlVar;
            if (owsVarF != null) {
                k(lzlVar);
            }
            owp owpVarE = this.f.e();
            mai maiVar = new mai(this.b);
            if (owpVarE != null) {
                j(new lzu(this, maiVar));
            }
            owm owmVar2 = this.f;
            ClientMode clientMode = new ClientMode(null);
            Parcel parcelGh = owmVar2.gh();
            ijp.g(parcelGh, clientMode);
            owmVar2.gk(3, parcelGh);
            return true;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 4539)).u("RemoteException in nav provider registration.");
            h(yzy.pE);
            return false;
        } catch (RuntimeException e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 4540)).u("RuntimeException in nav provider registration.");
            h(yzy.pF);
            return false;
        }
    }

    public final String toString() {
        return "NavigationProviderClient{, navProviderName=" + String.valueOf(this.b) + "}";
    }
}
