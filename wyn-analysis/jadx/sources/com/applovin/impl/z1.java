package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.C1628b1;
import com.applovin.impl.p7;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class z1 extends a2 {

    /* renamed from: p0, reason: collision with root package name */
    private final p7 f24001p0;

    /* renamed from: q0, reason: collision with root package name */
    private final Set f24002q0;

    public class a implements C1628b1.b {
        public a() {
        }

        @Override // com.applovin.impl.C1628b1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(z1.this.f20903g0 - (z1.this.f20886P.getDuration() - z1.this.f20886P.getCurrentPosition()));
            int iC = z1.this.C();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(z1.this.f24002q0).iterator();
            while (it.hasNext()) {
                z7 z7Var = (z7) it.next();
                if (z7Var.a(seconds, iC)) {
                    hashSet.add(z7Var);
                    z1.this.f24002q0.remove(z7Var);
                }
            }
            z1.this.a(hashSet);
            if (iC >= 25 && iC < 50) {
                z1.this.f24001p0.getAdEventTracker().x();
                return;
            }
            if (iC >= 50 && iC < 75) {
                z1.this.f24001p0.getAdEventTracker().y();
            } else if (iC >= 75) {
                z1.this.f24001p0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.C1628b1.b
        public boolean b() {
            return !z1.this.f20906j0;
        }
    }

    public z1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f24002q0 = hashSet;
        p7 p7Var = (p7) bVar;
        this.f24001p0 = p7Var;
        if (p7Var.r1()) {
            ImageView imageViewA = v7.a(p7Var.l1().e(), activity, kVar);
            this.f20894X = imageViewA;
            imageViewA.setOnClickListener(new B1(this, bVar, kVar, activity, 0));
        }
        p7.d dVar = p7.d.VIDEO;
        hashSet.addAll(p7Var.a(dVar, a8.f20986a));
        a(p7.d.IMPRESSION);
        a(dVar, "creativeView");
        p7Var.getAdEventTracker().g();
    }

    private void W() {
        if (!G() || this.f24002q0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.k("AppLovinFullscreenActivity", "Firing " + this.f24002q0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.f24002q0);
    }

    @Override // com.applovin.impl.a2
    public void D() {
        a(p7.d.VIDEO, "skip");
        this.f24001p0.getAdEventTracker().B();
        super.D();
    }

    @Override // com.applovin.impl.a2
    public void E() {
        super.E();
        p7 p7Var = this.f24001p0;
        if (p7Var != null) {
            p7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.a2
    public void O() {
        long jP;
        int iR;
        long millis = 0;
        if (this.f24001p0.O() >= 0 || this.f24001p0.P() >= 0) {
            if (this.f24001p0.O() >= 0) {
                jP = this.f24001p0.O();
            } else {
                p7 p7Var = this.f24001p0;
                c8 c8VarP1 = p7Var.p1();
                if (c8VarP1 == null || c8VarP1.d() <= 0) {
                    long j8 = this.f20903g0;
                    if (j8 > 0) {
                        millis = j8;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(c8VarP1.d());
                }
                if (p7Var.W0() && (iR = (int) p7Var.r()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iR);
                }
                jP = (long) ((this.f24001p0.P() / 100.0d) * millis);
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.a2
    public void R() {
        super.R();
        p7 p7Var = this.f24001p0;
        if (p7Var != null) {
            p7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.a2
    public void S() {
        W();
        if (!b8.a(this.f24001p0)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.f20906j0) {
                return;
            }
            a(p7.d.COMPANION, "creativeView");
            this.f24001p0.getAdEventTracker().w();
            super.S();
        }
    }

    @Override // com.applovin.impl.a2
    public void U() {
        super.U();
        a(p7.d.VIDEO, this.f20902f0 ? "mute" : "unmute");
        this.f24001p0.getAdEventTracker().b(this.f20902f0);
    }

    @Override // com.applovin.impl.a2
    public void d(long j8) {
        super.d(j8);
        this.f24001p0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j8), o7.e(this.f23428b));
    }

    @Override // com.applovin.impl.a2
    public void g(String str) {
        a(p7.d.ERROR, u7.MEDIA_FILE_ERROR);
        this.f24001p0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.w1
    public void s() {
        super.s();
        a(this.f20906j0 ? p7.d.COMPANION : p7.d.VIDEO, "pause");
        this.f24001p0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.w1
    public void t() {
        super.t();
        a(this.f20906j0 ? p7.d.COMPANION : p7.d.VIDEO, "resume");
        this.f24001p0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void v() {
        this.f20899c0.c();
        super.v();
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    private boolean V() {
        return this.f20894X != null && this.f24001p0.r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Activity activity, View view) {
        Uri uriC = this.f24001p0.l1().c();
        if (uriC != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriC);
            }
            a(p7.d.INDUSTRY_ICON_CLICK);
            if (bVar.isCustomTabsEnabled()) {
                kVar.z().a(uriC, b().getController(), activity);
            } else {
                l7.b(uriC, bVar, activity, kVar);
            }
        }
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void a(String str) {
        if (this.f24001p0 != null) {
            a(p7.d.VIDEO, "close");
            a(p7.d.COMPANION, "close");
        }
        super.a(str);
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (V()) {
            a(p7.d.INDUSTRY_ICON_IMPRESSION);
            this.f20894X.setVisibility(0);
        }
        this.f20899c0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        C1623a c1623a = this.f20887Q;
        if (c1623a != null) {
            arrayList.add(new h4(c1623a, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.f20888R;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        C1642i0 c1642i0 = this.f20889S;
        if (c1642i0 != null) {
            arrayList.add(new h4(c1642i0, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.f20892V;
        if (progressBar != null) {
            arrayList.add(new h4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.f20893W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.f20890T;
        if (imageView != null) {
            arrayList.add(new h4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.f20891U;
        if (lVar != null) {
            arrayList.add(new h4(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f23436j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f23436j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f24001p0.getAdEventTracker().b(this.f20886P, arrayList);
    }

    @Override // com.applovin.impl.a2
    public void a(MotionEvent motionEvent) {
        a(p7.d.VIDEO_CLICK);
        this.f24001p0.getAdEventTracker().v();
        super.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, u7.UNSPECIFIED);
    }

    private void a(p7.d dVar) {
        a(dVar, u7.UNSPECIFIED);
    }

    private void a(p7.d dVar, String str) {
        a(dVar, str, u7.UNSPECIFIED);
    }

    private void a(p7.d dVar, u7 u7Var) {
        a(dVar, "", u7Var);
    }

    private void a(p7.d dVar, String str, u7 u7Var) {
        a(this.f24001p0.a(dVar, str), u7Var);
    }

    private void a(Set set, u7 u7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f20886P.getCurrentPosition());
        d8 d8VarQ1 = this.f24001p0.q1();
        Uri uriD = d8VarQ1 != null ? d8VarQ1.d() : null;
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        b8.a(set, seconds, uriD, u7Var, this.f23428b);
    }
}
