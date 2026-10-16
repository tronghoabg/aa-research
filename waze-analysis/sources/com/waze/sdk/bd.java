package com.waze.sdk;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.support.v4.media.MediaMetadataCompat;
import android.text.Spannable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.waze.MainActivity;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.gl;
import com.waze.lm;
import com.waze.mg;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd {

    /* renamed from: c, reason: collision with root package name */
    private static bd f35309c;

    /* renamed from: a, reason: collision with root package name */
    public be f35310a;

    /* renamed from: e, reason: collision with root package name */
    private an f35313e;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f35315g;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f35317i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f35318j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference f35319k;
    private Dialog m;
    private boolean n;

    /* renamed from: d, reason: collision with root package name */
    private final Object f35312d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Stack f35314f = new Stack();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f35316h = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    private final List f35320l = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.b.bn f35311b = ck.b(Optional.empty());

    private bd() {
    }

    public static final void Q() {
        bi.d().m();
    }

    public static final boolean R() {
        return bi.d().s();
    }

    private final void S(an anVar) {
        com.waze.shared_infra.i.h.a("WazeSdk: On new app bound: ".concat(String.valueOf(anVar.T())));
        synchronized (this.f35312d) {
            an anVar2 = this.f35313e;
            if (anVar2 != null && !TextUtils.equals(anVar2.T(), anVar.T())) {
                V(1);
            }
            this.f35313e = anVar;
        }
        SdkConfiguration.setExternalAppAndType(anVar.H(), 2);
        this.f35316h.post(new com.google.firebase.messaging.m(this, anVar, 2));
    }

    private final void T(an anVar) {
        boolean zAe = anVar.ae();
        if (zAe) {
            L();
            SdkConfiguration.setLastConnectedAudioApp(anVar.T());
        } else {
            String strS = anVar.S();
            com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
            String str = String.format(aVarA.c(R.string.SDK_ON_DISAGREED_POPUP_TEXT, new Object[0]), strS);
            String str2 = String.format(aVarA.c(R.string.SDK_ON_DISAGREED_POPUP_LINK_TEXT, new Object[0]), strS);
            av avVar = new av();
            Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(str);
            int iIndexOf = spannableNewSpannable.toString().indexOf(str2);
            if (iIndexOf >= 0) {
                spannableNewSpannable.setSpan(avVar, iIndexOf, str2.length() + iIndexOf, 33);
            }
            com.waze.ab.o oVar = new com.waze.ab.o();
            oVar.Q(aVarA.c(R.string.SDK_ON_DISAGREED_POPUP_TITLE, strS));
            oVar.O(spannableNewSpannable);
            oVar.M(aVarA.c(R.string.OK, new Object[0]));
            oVar.y(false);
            com.waze.z.a.d.ai.q(oVar);
        }
        WeakReference weakReference = this.f35319k;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((az) this.f35319k.get()).F(anVar, zAe);
    }

    private final void U() {
        com.waze.g.f fVar = new com.waze.g.f(this, 20);
        this.f35315g = fVar;
        this.f35316h.postDelayed(fVar, 1000L);
    }

    private final void V(int i2) {
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            if (anVar != null) {
                anVar.I(i2);
                an anVar2 = this.f35313e;
                this.f35313e = null;
                this.f35316h.post(new com.google.firebase.appcheck.debug.a.a(this, anVar2, 20));
                if (i2 != 7) {
                    SdkConfiguration.setLastConnectedAudioApp(null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        if (this.n) {
            return;
        }
        this.n = true;
        String lastConnectedAudioApp = SdkConfiguration.getLastConnectedAudioApp();
        if (lastConnectedAudioApp != null) {
            ap.f35250a.e(lastConnectedAudioApp, null, null);
        }
    }

    private final boolean X(String str) {
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            if (anVar == null) {
                com.waze.shared_infra.i.h.a("WazeSdk: Authentication failed because no bound app is found.");
                return false;
            }
            if (anVar.af(str)) {
                return true;
            }
            com.waze.shared_infra.i.h.a("WazeSdk: Authentication failed because token is not matched.");
            return false;
        }
    }

    private final boolean Y(String str) {
        boolean z;
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            z = false;
            if (anVar != null && anVar.T().equals(str)) {
                z = true;
            }
        }
        return z;
    }

    public static synchronized bd d() {
        bd bdVar;
        bdVar = f35309c;
        if (bdVar == null) {
            bdVar = new bd();
            f35309c = bdVar;
        }
        return bdVar;
    }

    public static /* synthetic */ void h(bd bdVar, MediaMetadataCompat mediaMetadataCompat) {
        WeakReference weakReference = bdVar.f35317i;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((ba) bdVar.f35317i.get()).J(mediaMetadataCompat);
    }

    public static /* synthetic */ void j(bd bdVar, an anVar) {
        if (anVar.ad()) {
            bdVar.f35314f.push(anVar);
            if (NativeManager.isAppStarted() && bdVar.f35315g == null) {
                bdVar.U();
            }
        }
    }

    public static /* synthetic */ void l(bd bdVar) {
        SdkConfiguration.updateAppList();
        if (!SdkConfiguration.isSdkConfigurationLoaded()) {
            bdVar.U();
            return;
        }
        bdVar.A();
        bdVar.f35315g = null;
        Stack stack = bdVar.f35314f;
        if (stack.size() <= 0) {
            bdVar.W();
            return;
        }
        while (!stack.empty()) {
            an anVar = (an) stack.pop();
            if (!anVar.ad()) {
                anVar.I(7);
            } else if (bdVar.f35313e != null) {
                anVar.I(1);
            } else {
                au appConfig = SdkConfiguration.getAppConfig(anVar.T());
                if (appConfig == null || !SdkConfiguration.isWhiteListed(appConfig.f35260c)) {
                    anVar.I(2);
                } else {
                    anVar.Y(appConfig);
                    bdVar.S(anVar);
                }
            }
        }
    }

    public static /* synthetic */ void m(bd bdVar, an anVar) {
        WeakReference weakReference = bdVar.f35319k;
        if (weakReference != null && weakReference.get() != null) {
            ((az) bdVar.f35319k.get()).G(anVar);
        }
        if (anVar.K()) {
            return;
        }
        bdVar.v();
    }

    public static /* synthetic */ void n(bd bdVar, android.support.v4.media.a.z zVar) {
        WeakReference weakReference = bdVar.f35317i;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((ba) bdVar.f35317i.get()).L(zVar);
    }

    public static /* synthetic */ void o(bd bdVar, boolean z) {
        synchronized (bdVar.f35312d) {
            an anVar = bdVar.f35313e;
            if (anVar != null && anVar.K()) {
                anVar.aa(z);
                bdVar.T(anVar);
            }
        }
    }

    public static /* synthetic */ void p(bd bdVar, List list) {
        WeakReference weakReference = bdVar.f35318j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((bc) bdVar.f35318j.get()).M(list);
    }

    public static /* synthetic */ void r(bd bdVar, an anVar) {
        Dialog dialog = bdVar.m;
        if (dialog != null && dialog.isShowing()) {
            bdVar.m.dismiss();
        }
        WeakReference weakReference = bdVar.f35319k;
        if (weakReference != null && weakReference.get() != null) {
            ((az) bdVar.f35319k.get()).H(anVar);
        }
        bdVar.L();
    }

    public static /* synthetic */ void s(bd bdVar, an anVar, boolean z) {
        synchronized (bdVar.f35312d) {
            if (bdVar.Y(anVar.T())) {
                anVar.aa(z);
                bdVar.T(anVar);
                bdVar.m = null;
            }
        }
    }

    public static /* synthetic */ void t(bd bdVar, boolean z) {
        an anVar = bdVar.f35313e;
        if (anVar != null) {
            anVar.Z(z);
        }
    }

    public final void A() {
        Iterator it = this.f35320l.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() != null) {
                ((ay) weakReference.get()).a();
            } else {
                it.remove();
            }
        }
    }

    public final void B(boolean z) {
        if (z) {
            return;
        }
        V(6);
    }

    final void C(String str) {
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            if (anVar != null && anVar.T().equals(str)) {
                V(7);
            }
        }
    }

    @Deprecated
    final void D(boolean z) {
        this.f35316h.post(new gl(this, z, 5));
    }

    @Deprecated
    final void E() {
        Resources resourcesB = b();
        au spotifyAppConfig = SdkConfiguration.getSpotifyAppConfig();
        bo boVar = new bo();
        boVar.f35360a = -14756000;
        S(new am(resourcesB, spotifyAppConfig, new bp(boVar), com.waze.sdk.b.m.v()));
    }

    public final void F(String str) {
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            if (anVar == null || !anVar.T().equals(str)) {
                ap.f35250a.c(str);
            } else {
                this.f35313e.J();
            }
        }
    }

    public final void G(ay ayVar) {
        Iterator it = this.f35320l.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null || weakReference.get() == ayVar) {
                it.remove();
            }
        }
    }

    final void H(String str, boolean z) {
        if (NativeManager.getInstance() == null) {
            NativeManager.registerOnAppStartedEvent(new com.google.firebase.messaging.w(this, str, z, 4));
            return;
        }
        synchronized (this.f35312d) {
            if (X(str)) {
                this.f35316h.post(new gl(this, z, 6));
            } else {
                com.waze.shared_infra.i.h.a("WazeSdk: Rejects sending navigation data... Authentication failed.");
            }
        }
    }

    public final void I(az azVar) {
        an anVar;
        this.f35319k = new WeakReference(azVar);
        synchronized (this.f35312d) {
            anVar = this.f35313e;
        }
        if (anVar != null) {
            azVar.G(anVar);
            if (anVar.ae()) {
                azVar.F(anVar, true);
            }
        }
    }

    public final void J(ba baVar) {
        android.support.v4.media.a.z zVarP;
        MediaMetadataCompat mediaMetadataCompatO = null;
        if (baVar == null) {
            this.f35317i = null;
            return;
        }
        this.f35317i = new WeakReference(baVar);
        if (this.f35313e != null) {
            synchronized (this.f35312d) {
                mediaMetadataCompatO = this.f35313e.O();
                zVarP = this.f35313e.P();
            }
        } else {
            zVarP = null;
        }
        if (mediaMetadataCompatO != null) {
            baVar.J(mediaMetadataCompatO);
        }
        if (zVarP != null) {
            baVar.L(zVarP);
        }
    }

    public final void K(bc bcVar) {
        List listU;
        if (bcVar == null) {
            this.f35318j = null;
            return;
        }
        this.f35318j = new WeakReference(bcVar);
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            listU = anVar != null ? anVar.U() : new ArrayList();
        }
        bcVar.M(listU);
    }

    final void L() {
        final MainActivity mainActivityC = lm.d().c();
        if (mainActivityC == null || !mainActivityC.bs()) {
            return;
        }
        synchronized (this.f35312d) {
            final com.waze.main_screen.b.a.b bVar = (com.waze.main_screen.b.a.b) com.waze.web.r.h(com.waze.main_screen.b.a.b.class);
            if (bVar == null) {
                return;
            }
            an anVar = this.f35313e;
            if (anVar == null) {
                bVar.a(null);
            } else {
                anVar.X(mainActivityC, new as() { // from class: com.waze.sdk.ax
                    @Override // com.waze.sdk.as
                    public final void a(Drawable drawable) {
                        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(mainActivityC.getResources(), com.waze.utils.o.a(drawable));
                        roundedBitmapDrawableCreate.setCircular(true);
                        bVar.a(roundedBitmapDrawableCreate);
                    }
                });
            }
        }
    }

    public final void M(String str, MediaMetadataCompat mediaMetadataCompat) {
        if (Y(str)) {
            this.f35316h.post(new com.google.firebase.appcheck.debug.a.a(this, mediaMetadataCompat, 19));
        }
    }

    public final void N(String str, android.support.v4.media.a.z zVar) {
        if (Y(str)) {
            this.f35316h.post(new com.google.firebase.messaging.m(this, zVar, 1));
        }
    }

    public final void O(String str, List list) {
        if (Y(str)) {
            this.f35316h.post(new com.google.firebase.messaging.m(this, list, 3, null));
        }
    }

    final boolean P(Resources resources, String str, String str2, Bundle bundle, Messenger messenger) {
        au appConfig = SdkConfiguration.getAppConfig(str);
        if (appConfig != null && !SdkConfiguration.isWhiteListed(appConfig.f35260c)) {
            return false;
        }
        an anVar = new an(resources, str, str2, appConfig, new bp(bundle), messenger);
        if (appConfig == null) {
            this.f35316h.post(new com.google.firebase.messaging.m(this, anVar, 4));
            return true;
        }
        if (!anVar.ad()) {
            return false;
        }
        S(anVar);
        return true;
    }

    final int a() {
        int iM;
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            iM = anVar != null ? anVar.M() : 0;
        }
        return iM;
    }

    final Resources b() {
        be beVar = this.f35310a;
        return beVar != null ? beVar.b() : mg.a().getResources();
    }

    public final ah c() {
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            if (anVar == null || !anVar.ae()) {
                return null;
            }
            return this.f35313e.Q();
        }
    }

    final String e(String str) {
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            if (anVar != null && anVar.af(str)) {
                return anVar.T();
            }
            Stack stack = this.f35314f;
            int size = stack.size();
            int i2 = 0;
            while (i2 < size) {
                an anVar2 = (an) stack.get(i2);
                i2++;
                if (anVar2.af(str)) {
                    return anVar2.T();
                }
            }
            return null;
        }
    }

    final String f() {
        String strS;
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            strS = anVar != null ? anVar.S() : null;
        }
        return strS;
    }

    public final String g() {
        String strT;
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            strT = anVar != null ? anVar.T() : null;
        }
        return strT;
    }

    public final void u(ay ayVar) {
        this.f35320l.add(new WeakReference(ayVar));
    }

    public final void v() {
        synchronized (this.f35312d) {
            an anVar = this.f35313e;
            if (anVar != null && !anVar.K()) {
                if (anVar.ag() || !SdkConfiguration.isAudioSdkEnabled()) {
                    Dialog dialog = this.m;
                    if (dialog != null && dialog.isShowing()) {
                        return;
                    }
                    be beVar = this.f35310a;
                    if (beVar != null && beVar.c()) {
                        an anVar2 = this.f35313e;
                        this.m = bq.c(anVar2.S(), new com.waze.navigate.f(this, anVar2, 3));
                    }
                } else {
                    T(this.f35313e);
                }
            }
            bi biVarD = bi.d();
            Resources resourcesB = b();
            be beVar2 = this.f35310a;
            biVarD.y(resourcesB, beVar2 != null ? beVar2.a() : mg.a().getPackageManager(), new com.waze.search.h.ay(this));
        }
    }

    public final void w() {
        this.f35311b.e(Optional.empty());
    }

    public final void x() {
        if (NativeManager.isAppStarted()) {
            SdkConfiguration.updateAppList();
            if (SdkConfiguration.isSdkConfigurationLoaded()) {
                this.f35316h.post(new com.waze.beacons.p(this, 4));
            } else {
                U();
            }
        } else {
            NativeManager.runOnNativeManagerReady(new com.waze.beacons.p(this, 5));
        }
        L();
    }

    final void y(String str) {
        synchronized (this.f35312d) {
            if (X(str)) {
                V(5);
            }
        }
    }

    public final void z(String str, boolean z) {
        if (!z && Y(str)) {
            V(3);
        }
        Iterator it = this.f35320l.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() != null) {
                ((ay) weakReference.get()).b();
            } else {
                it.remove();
            }
        }
    }
}
