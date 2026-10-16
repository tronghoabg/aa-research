package com.applovin.impl;

import A7.AbstractC0279p0;
import Va.M6;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C1628b1;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.e6;
import com.applovin.impl.n8;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a2 extends w1 implements AppLovinCommunicatorSubscriber {

    /* renamed from: M, reason: collision with root package name */
    private final b2 f20883M;

    /* renamed from: N, reason: collision with root package name */
    private MediaPlayer f20884N;

    /* renamed from: O, reason: collision with root package name */
    private final View f20885O;

    /* renamed from: P, reason: collision with root package name */
    protected final AppLovinVideoView f20886P;

    /* renamed from: Q, reason: collision with root package name */
    protected final C1623a f20887Q;

    /* renamed from: R, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f20888R;

    /* renamed from: S, reason: collision with root package name */
    protected C1642i0 f20889S;

    /* renamed from: T, reason: collision with root package name */
    protected final ImageView f20890T;

    /* renamed from: U, reason: collision with root package name */
    protected com.applovin.impl.adview.l f20891U;

    /* renamed from: V, reason: collision with root package name */
    protected final ProgressBar f20892V;

    /* renamed from: W, reason: collision with root package name */
    protected ProgressBar f20893W;

    /* renamed from: X, reason: collision with root package name */
    protected ImageView f20894X;

    /* renamed from: Y, reason: collision with root package name */
    private final e f20895Y;

    /* renamed from: Z, reason: collision with root package name */
    private final d f20896Z;

    /* renamed from: a0, reason: collision with root package name */
    private final Handler f20897a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Handler f20898b0;

    /* renamed from: c0, reason: collision with root package name */
    protected final C1628b1 f20899c0;

    /* renamed from: d0, reason: collision with root package name */
    protected final C1628b1 f20900d0;

    /* renamed from: e0, reason: collision with root package name */
    private final boolean f20901e0;

    /* renamed from: f0, reason: collision with root package name */
    protected boolean f20902f0;

    /* renamed from: g0, reason: collision with root package name */
    protected long f20903g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f20904h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f20905i0;

    /* renamed from: j0, reason: collision with root package name */
    protected boolean f20906j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f20907k0;

    /* renamed from: l0, reason: collision with root package name */
    private final AtomicBoolean f20908l0;

    /* renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f20909m0;

    /* renamed from: n0, reason: collision with root package name */
    private long f20910n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f20911o0;

    public class a implements C1628b1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20912a;

        public a(int i5) {
            this.f20912a = i5;
        }

        @Override // com.applovin.impl.C1628b1.b
        public void a() {
            if (a2.this.f20889S != null) {
                long seconds = this.f20912a - TimeUnit.MILLISECONDS.toSeconds(r0.f20886P.getCurrentPosition());
                if (seconds <= 0) {
                    a2.this.f23447v = true;
                } else if (a2.this.Q()) {
                    a2.this.f20889S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.C1628b1.b
        public boolean b() {
            return a2.this.Q();
        }
    }

    public class b implements C1628b1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f20914a;

        public b(Integer num) {
            this.f20914a = num;
        }

        @Override // com.applovin.impl.C1628b1.b
        public void a() {
            a2 a2Var = a2.this;
            if (a2Var.f20906j0) {
                a2Var.f20892V.setVisibility(8);
            } else {
                a2.this.f20892V.setProgress((int) ((a2Var.f20886P.getCurrentPosition() / a2.this.f20903g0) * this.f20914a.intValue()));
            }
        }

        @Override // com.applovin.impl.C1628b1.b
        public boolean b() {
            return !a2.this.f20906j0;
        }
    }

    public class c implements C1628b1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20916a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f20917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f20918c;

        public c(long j8, Integer num, Long l10) {
            this.f20916a = j8;
            this.f20917b = num;
            this.f20918c = l10;
        }

        @Override // com.applovin.impl.C1628b1.b
        public void a() {
            a2.this.f20893W.setProgress((int) ((a2.this.f23443r / this.f20916a) * this.f20917b.intValue()));
            a2 a2Var = a2.this;
            a2Var.f23443r = this.f20918c.longValue() + a2Var.f23443r;
        }

        @Override // com.applovin.impl.C1628b1.b
        public boolean b() {
            return a2.this.f23443r < this.f20916a;
        }
    }

    public class d implements n8.a {
        private d() {
        }

        @Override // com.applovin.impl.n8.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            a2.this.a("video_button");
        }

        @Override // com.applovin.impl.n8.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            a2.this.a(lVar.getAndClearLastClickEvent());
        }

        @Override // com.applovin.impl.n8.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            a2.this.f23425J = true;
        }

        @Override // com.applovin.impl.n8.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            a2.this.T();
        }

        public /* synthetic */ d(a2 a2Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.n8.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            l7.a(uri, a2.this.b().getController(), a2.this.f23428b);
        }

        @Override // com.applovin.impl.n8.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            l7.c(uri, a2.this.b().getController().g(), a2.this.f23428b);
        }
    }

    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            a2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "Video completed");
            }
            a2.this.f20907k0 = true;
            a2 a2Var = a2.this;
            if (!a2Var.f23445t) {
                a2Var.S();
            } else if (a2Var.h()) {
                a2.this.A();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i5, int i10) {
            a2.this.g(N0.a.e("Video view error (", i5, ",", i10, ")"));
            a2.this.f20886P.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i5, int i10) {
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", N0.a.e("MediaPlayer Info: (", i5, ", ", i10, ")"));
            }
            if (i5 == 701) {
                a2.this.R();
                return false;
            }
            if (i5 != 3) {
                if (i5 != 702) {
                    return false;
                }
                a2.this.E();
                return false;
            }
            a2.this.f20899c0.b();
            a2 a2Var = a2.this;
            if (a2Var.f20888R != null) {
                a2Var.P();
            }
            a2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            a2.this.f20884N = mediaPlayer;
            mediaPlayer.setOnInfoListener(a2.this.f20895Y);
            mediaPlayer.setOnErrorListener(a2.this.f20895Y);
            float f10 = !a2.this.f20902f0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            a2.this.f23446u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            a2.this.d(mediaPlayer.getDuration());
            a2.this.O();
            com.applovin.impl.sdk.o oVar = a2.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + a2.this.f20884N);
            }
        }

        public /* synthetic */ e(a2 a2Var, a aVar) {
            this();
        }
    }

    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a2 a2Var = a2.this;
            if (view == a2Var.f20888R) {
                a2Var.T();
                return;
            }
            if (view == a2Var.f20890T) {
                a2Var.U();
            } else if (com.applovin.impl.sdk.o.a()) {
                a2.this.f23429c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(a2 a2Var, a aVar) {
            this();
        }
    }

    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f20883M = new b2(this.f23427a, this.f23430d, this.f23428b);
        a aVar = null;
        this.f20894X = null;
        e eVar = new e(this, aVar);
        this.f20895Y = eVar;
        d dVar = new d(this, aVar);
        this.f20896Z = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f20897a0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f20898b0 = handler2;
        C1628b1 c1628b1 = new C1628b1(handler, this.f23428b);
        this.f20899c0 = c1628b1;
        this.f20900d0 = new C1628b1(handler2, this.f23428b);
        boolean zC0 = this.f23427a.C0();
        this.f20901e0 = zC0;
        this.f20902f0 = o7.e(this.f23428b);
        this.f20905i0 = -1;
        this.f20908l0 = new AtomicBoolean();
        this.f20909m0 = new AtomicBoolean();
        this.f20910n0 = -2L;
        this.f20911o0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f20886P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        bVar.h().putString("video_view_address", f8.a(appLovinVideoView));
        View view = new View(activity);
        this.f20885O = view;
        boolean z2 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) kVar.a(y4.f23892r1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(kVar, y4.f23823j0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, y4.f23823j0, activity, eVar));
            view.setOnTouchListener(new C(0));
        }
        f fVar = new f(this, aVar);
        if (bVar.d0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.U(), activity);
            this.f20888R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.f20888R = null;
        }
        if (a(this.f20902f0, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.f20890T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            e(this.f20902f0);
        } else {
            this.f20890T = null;
        }
        String strA0 = bVar.a0();
        if (StringUtils.isValidString(strA0)) {
            n8 n8Var = new n8(kVar);
            n8Var.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.Z(), bVar, n8Var, activity);
            this.f20891U = lVar;
            lVar.a(strA0);
        } else {
            this.f20891U = null;
        }
        if (zC0) {
            C1623a c1623a = new C1623a(activity, ((Integer) kVar.a(y4.f23876p2)).intValue(), R.attr.progressBarStyleLarge);
            this.f20887Q = c1623a;
            c1623a.setColor(Color.parseColor("#75FFFFFF"));
            c1623a.setBackgroundColor(Color.parseColor("#00000000"));
            c1623a.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f20887Q = null;
        }
        int iC = c();
        if (((Boolean) kVar.a(y4.f23744Z1)).booleanValue() && iC > 0) {
            z2 = true;
        }
        if (this.f20889S == null && z2) {
            this.f20889S = new C1642i0(activity);
            int iS = bVar.s();
            this.f20889S.setTextColor(iS);
            this.f20889S.setTextSize(((Integer) kVar.a(y4.f23737Y1)).intValue());
            this.f20889S.setFinishedStrokeColor(iS);
            this.f20889S.setFinishedStrokeWidth(((Integer) kVar.a(y4.f23729X1)).intValue());
            this.f20889S.setMax(iC);
            this.f20889S.setProgress(iC);
            c1628b1.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iC));
        }
        if (!bVar.k0()) {
            this.f20892V = null;
            return;
        }
        Long l10 = (Long) kVar.a(y4.f23850m2);
        Integer num = (Integer) kVar.a(y4.f23859n2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.f20892V = progressBar;
        a(progressBar, bVar.j0(), num.intValue());
        c1628b1.a("PROGRESS_BAR", l10.longValue(), new b(num));
    }

    private void M() {
        com.applovin.impl.adview.l lVar;
        e8 e8VarB0 = this.f23427a.b0();
        if (e8VarB0 == null || !e8VarB0.j() || this.f20906j0 || (lVar = this.f20891U) == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new B(this, lVar.getVisibility() == 4, e8VarB0.h(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.f20906j0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f23428b.n0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f20905i0 < 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f20905i0 + "ms for MediaPlayer: " + this.f20884N);
        }
        this.f20886P.seekTo(this.f20905i0);
        this.f20886P.start();
        this.f20899c0.b();
        this.f20905i0 = -1;
        a(new A(this, 0), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.f20909m0.compareAndSet(false, true)) {
            a(this.f20888R, this.f23427a.d0(), new A(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z2) {
        if (AbstractC1654o0.e()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f23430d.getDrawable(z2 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f20890T.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f20890T.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.f20890T, z2 ? this.f23427a.G() : this.f23427a.Y(), this.f23428b);
    }

    private void f(boolean z2) {
        this.f20904h0 = C();
        if (z2) {
            this.f20886P.pause();
        } else {
            this.f20886P.stopPlayback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        p8.a(this.f20891U, str, "AppLovinFullscreenActivity", this.f23428b);
    }

    @Override // com.applovin.impl.w1
    public void A() {
        this.f20883M.a(this.f23437l);
        this.f23442q = SystemClock.elapsedRealtime();
    }

    public void O() {
        long jP;
        long millis;
        if (this.f23427a.O() >= 0 || this.f23427a.P() >= 0) {
            if (this.f23427a.O() >= 0) {
                jP = this.f23427a.O();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f23427a;
                long j8 = this.f20903g0;
                long j10 = j8 > 0 ? j8 : 0L;
                if (aVar.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f23427a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) aVar.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                    j10 += millis;
                }
                jP = (long) ((this.f23427a.P() / 100.0d) * j10);
            }
            c(jP);
        }
    }

    public boolean Q() {
        return (this.f23447v || this.f20906j0 || !this.f20886P.isPlaying()) ? false : true;
    }

    public void R() {
        AppLovinSdkUtils.runOnUiThread(new A(this, 6));
    }

    public void S() {
        a2 a2Var;
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f23427a.d1());
        long jM = this.f23427a.M();
        if (jM > 0) {
            this.f23443r = 0L;
            Long l10 = (Long) this.f23428b.a(y4.f23917u2);
            Integer num = (Integer) this.f23428b.a(y4.f23936x2);
            ProgressBar progressBar = new ProgressBar(this.f23430d, null, R.attr.progressBarStyleHorizontal);
            this.f20893W = progressBar;
            a(progressBar, this.f23427a.L(), num.intValue());
            a2Var = this;
            this.f20900d0.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), a2Var.new c(jM, num, l10));
            a2Var.f20900d0.b();
        } else {
            a2Var = this;
        }
        a2Var.f20883M.a(a2Var.k, a2Var.f23436j, b(), a2Var.f20893W);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(a2Var.f23450y);
        sb2.append(",");
        a(AbstractC0279p0.j(a2Var.f23451z, ");", sb2), a2Var.f23427a.x());
        if (a2Var.k != null) {
            if (a2Var.f23427a.r() >= 0) {
                a(a2Var.k, a2Var.f23427a.r(), new A(this, 3));
            } else {
                a2Var.k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = a2Var.k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = a2Var.f23436j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = a2Var.f23436j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = a2Var.f20893W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        a2Var.f23427a.getAdEventTracker().b(b(), arrayList);
        p();
        a2Var.f20906j0 = true;
    }

    public void T() {
        this.f20910n0 = SystemClock.elapsedRealtime() - this.f20911o0;
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", M6.s(new StringBuilder("Attempting to skip video with skip time: "), this.f20910n0, "ms"));
        }
        D();
    }

    public void U() {
        MediaPlayer mediaPlayer = this.f20884N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f20902f0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z2 = !this.f20902f0;
            this.f20902f0 = z2;
            e(z2);
            a(this.f20902f0, 0L);
        } catch (Throwable unused) {
        }
    }

    public void d(long j8) {
        this.f20903g0 = j8;
    }

    public void g(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f23429c;
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Encountered media error: ", str, " for ad: ");
            sbW.append(this.f23427a);
            oVar.b("AppLovinFullscreenActivity", sbW.toString());
        }
        if (this.f20908l0.compareAndSet(false, true)) {
            if (((Boolean) this.f23428b.a(y4.f23696T0)).booleanValue()) {
                this.f23428b.G().d(this.f23427a, com.applovin.impl.sdk.k.o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f23421F;
            if (appLovinAdDisplayListener instanceof l2) {
                ((l2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f23427a instanceof p7 ? "handleVastVideoError" : "handleVideoError";
            this.f23428b.D().a(str2, str, this.f23427a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f23428b.g().a(d2.f21263E, this.f23427a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.w1
    public void m() {
        super.a(C(), this.f20901e0, F(), this.f20910n0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f23427a.getAdIdNumber() && this.f20901e0) {
                int i5 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !AbstractC1659r0.a(i5)) || this.f20907k0 || this.f20886P.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i5 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.w1
    public void r() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f23428b.a(y4.f23932w6)).booleanValue()) {
                p8.b(this.f20891U);
                this.f20891U = null;
            }
            if (this.f20901e0) {
                AppLovinCommunicator.getInstance(this.f23430d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f20886P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f20886P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.f20884N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.r();
    }

    @Override // com.applovin.impl.w1
    public void v() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f20905i0 = this.f20886P.getCurrentPosition();
        this.f20886P.pause();
        this.f20899c0.c();
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f20905i0 + "ms");
        }
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        C1623a c1623a = this.f20887Q;
        if (c1623a != null) {
            c1623a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        C1623a c1623a = this.f20887Q;
        if (c1623a != null) {
            c1623a.a();
            C1623a c1623a2 = this.f20887Q;
            Objects.requireNonNull(c1623a2);
            a(new D0(c1623a2, 3), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f20910n0 = -1L;
        this.f20911o0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        C1623a c1623a = this.f20887Q;
        if (c1623a != null) {
            c1623a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f23442q = SystemClock.elapsedRealtime();
    }

    public int C() {
        long currentPosition = this.f20886P.getCurrentPosition();
        if (this.f20907k0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f20903g0) * 100.0f) : this.f20904h0;
    }

    public void D() {
        this.f23450y++;
        if (this.f23427a.u()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            S();
        }
    }

    public void E() {
        AppLovinSdkUtils.runOnUiThread(new A(this, 1));
    }

    public boolean F() {
        if (this.f23425J && this.f23427a.a1()) {
            return true;
        }
        return G();
    }

    public boolean G() {
        return C() >= this.f23427a.f0();
    }

    @Override // com.applovin.impl.w1
    public void b(boolean z2) {
        super.b(z2);
        if (z2) {
            b(0L);
            if (this.f20906j0) {
                this.f20900d0.b();
                return;
            }
            return;
        }
        if (this.f20906j0) {
            this.f20900d0.c();
        } else {
            v();
        }
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        this.f20883M.a(this.f20891U);
        this.f20883M.a((View) this.f20888R);
        if (!h() || this.f20906j0) {
            A();
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        String str;
        this.f20883M.a(this.f20890T, this.f20888R, this.f20891U, this.f20887Q, this.f20892V, this.f20889S, this.f20886P, this.f20885O, b(), this.f23436j, this.f20894X, viewGroup);
        if (AbstractC1654o0.h() && (str = this.f23428b.o0().getExtraParameters().get("audio_focus_request")) != null) {
            this.f20886P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f23428b.a(y4.f23741Y5)).booleanValue() || !a(!this.f20901e0)) {
            this.f20886P.setVideoURI(this.f23427a.l0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.f23436j;
            if (kVar != null) {
                kVar.b();
            }
            this.f20886P.start();
            if (this.f20901e0) {
                R();
            }
            b().renderAd(this.f23427a);
            if (this.f20888R != null) {
                this.f23428b.r0().a(new s6(this.f23428b, "scheduleSkipButton", new A(this, 4)), e6.b.TIMEOUT, this.f23427a.e0(), true);
            }
            super.c(this.f20902f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z2, long j8) {
        if (z2) {
            f8.a(this.f20891U, j8, (Runnable) null);
        } else {
            f8.b(this.f20891U, j8, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void b(long j8) {
        a(new A(this, 5), j8);
    }

    @Override // com.applovin.impl.w1
    public void a(String str, long j8) {
        super.a(str, j8);
        if (this.f20891U == null || j8 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new F(3, this, str), j8);
    }

    private void a(ProgressBar progressBar, int i5, int i10) {
        progressBar.setMax(i10);
        progressBar.setPadding(0, 0, 0, 0);
        if (AbstractC1654o0.e()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i5));
        }
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        this.f20899c0.a();
        this.f20900d0.a();
        this.f20897a0.removeCallbacksAndMessages(null);
        this.f20898b0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f23428b.a(y4.f23679Q6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f23427a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    public void a(MotionEvent motionEvent) {
        Context context;
        if (this.f23427a.B0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriC0 = this.f23427a.c0();
            if (uriC0 != null) {
                if (!((Boolean) this.f23428b.a(y4.f23933x)).booleanValue() || (context = this.f23430d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.k.o();
                }
                this.f23428b.k().trackAndLaunchVideoClick(this.f23427a, uriC0, motionEvent, this, context);
                t2.a(this.f23420E, this.f23427a);
                this.f23451z++;
                return;
            }
            return;
        }
        M();
    }

    private static boolean a(boolean z2, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(y4.f23783e2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(y4.f23790f2)).booleanValue() || z2) {
            return true;
        }
        return ((Boolean) kVar.a(y4.f23808h2)).booleanValue();
    }
}
