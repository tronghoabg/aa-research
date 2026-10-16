package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import androidx.car.app.IAppHost;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.SurfaceContainer;
import androidx.car.app.media.model.MediaPlaybackTemplate;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.PlaceListMapTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;
import com.android.car.libraries.apphost.external.model.InCallTemplate;
import com.android.car.libraries.apphost.external.model.LocalWrapperTemplate;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import com.android.car.libraries.apphost.external.model.widgets.PaneWidget;
import com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;
import com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class hhz extends fud implements epf {
    public final hia c;
    public hid d;
    public ISurfaceCallback e;
    public SurfaceContainer f;
    public final AtomicBoolean g;
    public final ghl h;
    public final gns i;
    public final ajmd j;
    private final IAppHost.Stub k;
    private final gjv l;

    public hhz(hid hidVar, hia hiaVar, gjv gjvVar, geu geuVar) {
        super(geuVar, "CarApp.H");
        this.k = new hhy(this);
        this.g = new AtomicBoolean(false);
        this.j = new ajmd(this, null);
        this.d = hidVar;
        this.c = hiaVar;
        this.l = gjvVar;
        ghl ghlVar = (ghl) geuVar.F(ghl.class);
        this.h = ghlVar;
        this.i = geuVar.k();
        geu geuVar2 = this.a;
        geuVar2.getClass();
        ghlVar.getClass();
        int i = 1;
        ghlVar.a(GridTemplate.class, new ghm(1));
        ghlVar.a(ListTemplate.class, new ghm(0));
        int i2 = 4;
        ghlVar.a(MessageTemplate.class, new ghm(4));
        int i3 = 5;
        ghlVar.a(NavigationTemplate.class, new ghm(5));
        int i4 = 6;
        ghlVar.a(PaneTemplate.class, new ghm(6));
        int i5 = 7;
        ghlVar.a(PlaceListMapTemplate.class, new ghm(7));
        ghlVar.a(PlaceListNavigationTemplate.class, new ghm(8));
        ghlVar.a(RoutePreviewNavigationTemplate.class, new ghm(9));
        ghlVar.a(SignInTemplate.class, new ghm(10));
        ghlVar.a(MapTemplate.class, new ghn(geuVar2));
        int i6 = 2;
        ghlVar.a(MapWithContentTemplate.class, new ghm(2));
        ghlVar.a(TabTemplate.class, new ghm(11));
        ghlVar.a(ggr.class, new gyt(1));
        int i7 = 3;
        ghlVar.a(MediaPlaybackTemplate.class, new ghm(3));
        gho ghoVar = new gho();
        ghlVar.a(SectionedItemTemplate.class, ghoVar);
        geuVar2.s(gho.class, ghoVar);
        int i8 = 12;
        Iterator it = woy.bi(LongMessageTemplate.class, SearchTemplate.class, TabTemplateInternal.class, GoogleTabTemplate.class, MenuTemplate.class, MediaPlaybackTemplate.class, DialpadTemplate.class, TelephoneKeypadTemplate.class, androidx.car.app.dialer.TelephoneKeypadTemplate.class, hhs.class, InCallTemplate.class, androidx.car.app.dialer.InCallTemplate.class, WebViewTemplate.class).iterator();
        while (it.hasNext()) {
            ghlVar.a((Class) it.next(), gyt.a);
        }
        Map map = ghs.a;
        ebq ebqVar = ebq.m;
        Map map2 = ghs.a;
        map2.put(NavigationTemplate.class, new dmz(ebqVar, 20));
        map2.put(UnrestrictedTabTemplate.class, new gyu(ebq.n, 1));
        map2.put(PaneWidget.class, new gyu(ebq.o, 0));
        map2.put(DialpadTemplate.class, new gyu(ebq.p, 2));
        map2.put(TelephoneKeypadTemplate.class, new dmz(ebq.q, 16));
        map2.put(androidx.car.app.dialer.TelephoneKeypadTemplate.class, new dmz(ebq.j, 17));
        map2.put(InCallTemplate.class, new dmz(ebq.k, 18));
        map2.put(androidx.car.app.dialer.InCallTemplate.class, new dmz(ebq.l, 19));
        map2.put(MediaPlaybackTemplate.class, new dmz(ebq.f, 12));
        map2.put(MapTemplate.class, new dmz(ebq.g, 13));
        map2.put(ggr.class, new dmz(ebq.h, 14));
        map2.put(LongMessageTemplate.class, new dmz(ebq.i, 15));
        map2.put(ListTemplate.class, new gyv(new gyu(new gys(i4), 17), 2));
        map2.put(GridTemplate.class, new gyv(new gyv(new gqr(19), 3), 4));
        map2.put(SectionedItemTemplate.class, new gyv(new gyv(new gqr(20), 5), 6));
        map2.put(PaneTemplate.class, new gyv(new gyv(new gys(i), 7), 8));
        map2.put(MessageTemplate.class, new gyu(new gyv(new gys(0), 9), 7));
        map2.put(PlaceListMapTemplate.class, new gyu(new gyu(new gys(i6), 8), 9));
        map2.put(PlaceListNavigationTemplate.class, new gyu(new gyu(new gys(i7), 10), 11));
        map2.put(SearchTemplate.class, new gyu(new gyu(new gys(i2), 12), 13));
        map2.put(RoutePreviewNavigationTemplate.class, new gyu(new gyu(new gys(i3), 14), 15));
        map2.put(SignInTemplate.class, new gyu(new gyu(new gys(i5), 16), 18));
        map2.put(MenuTemplate.class, new gyu(new gyu(new gys(8), 19), 20));
        map2.put(AlphaJumpTemplate.class, new gyv(new gyv(new gys(9), 1), 0));
        map2.put(MapWithContentTemplate.class, new gyu(new gyu(new gys(10), 3), 4));
        map2.put(LocalWrapperTemplate.class, new gyu(new gyu(new gys(11), 5), 6));
        map2.put(TabTemplate.class, new gyv(new dah(new gys(i8), new gys(13), 9), 10));
        map2.put(TabTemplateInternal.class, new gyv(new dah(new gys(14), new gys(15), 10), 11));
        map2.put(GoogleTabTemplate.class, new gyv(new dah(new gqr(17), new gqr(18), 11), 12));
        y();
        z();
    }

    private final void z() {
        this.a.B().b(this, 2, new gnu(this, 9));
        this.a.B().b(this, 3, new gnu(this, 10));
        this.a.c().a().getLifecycle().c(this);
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        t();
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        eqaVar.getLifecycle().d(this);
    }

    @Override // defpackage.fud, defpackage.fuh
    public final void i(Intent intent) {
        this.a.i();
        if ("androidx.car.app.action.NAVIGATE".equals(intent.getAction()) || intent.getBooleanExtra("CAR_APP_NOTIFICATION_INTENT", false) || intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false)) {
            this.h.b();
        }
    }

    @Override // defpackage.fud, defpackage.fuh
    public final void j() {
        y();
        this.h.b();
        boolean zG = ((ggk) this.a.F(ggk.class)).G(((gmh) this.a.d()).a.getPackageName());
        if (this.a.i().c() < 9 || zG) {
            u();
            return;
        }
        gjv gjvVar = this.l;
        ((gmg) gjvVar.a).b("car", new geh(gnk.P, new gss(this, 2)));
    }

    @Override // defpackage.fud
    public final void k() {
        x();
    }

    @Override // defpackage.fud, defpackage.fuh
    public final void l() {
        u();
    }

    @Override // defpackage.fud, defpackage.fuh
    public final void o(geu geuVar) {
        this.a.B().c(this, 2);
        this.a.B().c(this, 3);
        this.a.c().a().getLifecycle().d(this);
        super.o(geuVar);
        geuVar.s(ghl.class, this.h);
        z();
    }

    @Override // defpackage.fud, defpackage.gnp
    public final void p(PrintWriter printWriter) {
        printWriter.printf("- flow validator: %s\n", this.h);
        printWriter.printf("- surface: %s\n", this.f);
    }

    @Override // defpackage.fuh
    public final /* bridge */ /* synthetic */ IBinder q() {
        g();
        return this.k;
    }

    public final hid r() {
        g();
        return this.d;
    }

    public final hln s() {
        ComponentName componentName = ((gmh) this.a.d()).a;
        return this.d.b(this.a.b());
    }

    public final void t() {
        gdu gduVar = (gdu) this.a.l(gdu.class);
        gduVar.getClass();
        gduVar.b();
    }

    public final void u() {
        if (this.g.getAndSet(true)) {
            return;
        }
        this.c.a(new geh(gnk.e, new gss(this, 3)));
    }

    public final void v() {
        Object obj;
        if (this.f == null || (obj = this.a.C().a) == null) {
            return;
        }
        ISurfaceCallback iSurfaceCallback = this.e;
        if (iSurfaceCallback != null) {
            this.a.t().b(gnk.m, new gdg(iSurfaceCallback, obj, 14));
        }
        gks.c("CarApp.H.Dis", "SurfaceProvider: onStableAreaChanged: stableArea: [%s]", obj);
    }

    public final void w() {
        Object obj;
        if (this.f == null || (obj = this.a.C().b) == null) {
            return;
        }
        ISurfaceCallback iSurfaceCallback = this.e;
        if (iSurfaceCallback != null) {
            this.a.t().b(gnk.l, new gdg(iSurfaceCallback, obj, 11));
        }
        gks.c("CarApp.H.Tem", "SurfaceProvider: onVisibleAreaChanged: visibleArea: [%s]", obj);
    }

    public final void x() {
        ComponentName componentName = ((gmh) this.a.d()).a;
        hln hlnVarB = this.d.b(this.a.b());
        hlnVarB.h(null);
        if (((ggk) this.a.F(ggk.class)).n()) {
            hlnVarB.c();
        }
    }

    public final void y() {
        ComponentName componentName = ((gmh) this.a.d()).a;
        hln hlnVarB = this.d.b(this.a.b());
        if (hlnVarB == null) {
            throw new IllegalStateException("Can't get surface provider for ".concat(String.valueOf(((gmh) this.a.d()).a.flattenToShortString())));
        }
        hlnVarB.h(this.j);
        if (((ggk) this.a.F(ggk.class)).n()) {
            hlnVarB.e();
        }
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
