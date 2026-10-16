package com.vungle.ads.internal.ui.view;

import R8.v;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.nativead.NativeVideoListener;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class d extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f33756a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f33757b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f33758c;

    /* renamed from: d, reason: collision with root package name */
    public float f33759d;

    /* renamed from: e, reason: collision with root package name */
    public TextureView f33760e;

    /* renamed from: f, reason: collision with root package name */
    public Surface f33761f;

    /* renamed from: g, reason: collision with root package name */
    public MediaPlayer f33762g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f33763h;

    /* renamed from: i, reason: collision with root package name */
    public AtomicBoolean f33764i;

    /* renamed from: j, reason: collision with root package name */
    public AtomicBoolean f33765j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33766l;

    /* renamed from: m, reason: collision with root package name */
    public int f33767m;

    /* renamed from: n, reason: collision with root package name */
    public int f33768n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f33769o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33770p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33771q;

    /* renamed from: r, reason: collision with root package name */
    public int f33772r;

    /* renamed from: s, reason: collision with root package name */
    public int f33773s;

    /* renamed from: t, reason: collision with root package name */
    public com.vungle.ads.nativead.b f33774t;

    /* renamed from: u, reason: collision with root package name */
    public b f33775u;

    /* renamed from: v, reason: collision with root package name */
    public int f33776v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f33777w;

    /* renamed from: x, reason: collision with root package name */
    public final a f33778x;

    /* renamed from: y, reason: collision with root package name */
    public tf.a f33779y;

    public /* synthetic */ d(Context context) {
        this(context, null);
    }

    public static final void a(d this$0) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.c();
    }

    public static final void b(d this$0) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.c();
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    public final void c() throws IllegalStateException {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.f33756a) {
            if (!e() || !this.k || this.f33766l) {
                if (this.f33764i.get() && (mediaPlayer = this.f33762g) != null && mediaPlayer.isPlaying()) {
                    boolean z2 = u.f33874a;
                    t.a("NativeAd-Video", "auto-pause: visibility NOT enough");
                    g();
                    return;
                }
                return;
            }
            if (!this.f33764i.get() || (surface = this.f33761f) == null || !surface.isValid()) {
                k();
                return;
            }
            MediaPlayer mediaPlayer2 = this.f33762g;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.f33771q) {
                boolean z10 = u.f33874a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.f33762g;
                sbA.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                sbA.append(" ms");
                t.a("NativeAd-Video", sbA.toString());
                MediaPlayer mediaPlayer4 = this.f33762g;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                f();
            }
        }
    }

    public final void d() throws IllegalArgumentException {
        if (this.f33762g != null) {
            return;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.f33779y.invoke();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: Lb.a
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) throws IllegalStateException {
                com.vungle.ads.internal.ui.view.d.a(this.f7059a, mediaPlayer2);
            }
        });
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: Lb.b
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i5, int i10) {
                com.vungle.ads.internal.ui.view.d.a(this.f7060a, mediaPlayer2, i5, i10);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: Lb.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                com.vungle.ads.internal.ui.view.d.b(this.f7061a, mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: Lb.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i5, int i10) {
                return com.vungle.ads.internal.ui.view.d.b(this.f7062a, mediaPlayer2, i5, i10);
            }
        });
        this.f33762g = mediaPlayer;
    }

    public final boolean e() {
        if (!isShown()) {
            return false;
        }
        if (!getGlobalVisibleRect(new Rect())) {
            return false;
        }
        long height = getHeight() * getWidth();
        return height > 0 && ((float) (r0.height() * r0.width())) / ((float) height) >= this.f33759d;
    }

    public final void f() {
        NativeVideoListener nativeVideoListener;
        this.f33777w.removeCallbacks(this.f33778x);
        this.f33777w.post(this.f33778x);
        com.vungle.ads.nativead.b bVar = this.f33774t;
        if (bVar == null || (nativeVideoListener = ((n) bVar).getNativeVideoListener()) == null) {
            return;
        }
        nativeVideoListener.onVideoPlay();
    }

    public final void g() throws IllegalStateException {
        Object objZ;
        NativeVideoListener nativeVideoListener;
        MediaPlayer mediaPlayer = this.f33762g;
        if (mediaPlayer != null && this.f33764i.get() && mediaPlayer.isPlaying()) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("pauseInternal(): pos=");
            sbA.append(mediaPlayer.getCurrentPosition());
            sbA.append(" ms");
            t.a("NativeAd-Video", sbA.toString());
            mediaPlayer.pause();
            this.f33777w.removeCallbacks(this.f33778x);
            b();
            com.vungle.ads.nativead.b bVar = this.f33774t;
            if (bVar != null && (nativeVideoListener = ((n) bVar).getNativeVideoListener()) != null) {
                nativeVideoListener.onVideoPause();
            }
        } else {
            boolean z10 = u.f33874a;
            t.a("NativeAd-Video", "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            objZ = Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.f33767m);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Object objValueOf = Integer.valueOf(this.f33767m);
        if (objZ instanceof C2529m) {
            objZ = objValueOf;
        }
        this.f33767m = ((Number) objZ).intValue();
    }

    public final int getCurrentPositionMs() {
        Object objZ;
        if (!this.f33764i.get()) {
            int i5 = this.f33767m;
            if (i5 < 0) {
                return 0;
            }
            return i5;
        }
        try {
            MediaPlayer mediaPlayer = this.f33762g;
            objZ = Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.f33767m);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Object objValueOf = Integer.valueOf(this.f33767m);
        if (objZ instanceof C2529m) {
            objZ = objValueOf;
        }
        int iIntValue = ((Number) objZ).intValue();
        if (iIntValue < 0) {
            return 0;
        }
        return iIntValue;
    }

    public final int getDurationMs() {
        return this.f33768n;
    }

    @NotNull
    public final tf.a getMediaPlayerFactory$vungle_ads_release() {
        return this.f33779y;
    }

    @Nullable
    public final Surface getSurface$vungle_ads_release() {
        return this.f33761f;
    }

    @NotNull
    public final TextureView getTexture$vungle_ads_release() {
        return this.f33760e;
    }

    public final void h() throws IllegalStateException {
        this.f33766l = true;
        g();
    }

    public final void i() throws IllegalStateException {
        Surface surface;
        this.k = true;
        this.f33766l = false;
        this.f33771q = false;
        boolean z2 = u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("play(): prepared=");
        sbA.append(this.f33764i);
        sbA.append(", surfaceValid=");
        Surface surface2 = this.f33761f;
        sbA.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sbA.append(", visible=");
        sbA.append(e());
        t.a("NativeAd-Video", sbA.toString());
        if (!this.f33764i.get() || (surface = this.f33761f) == null || !surface.isValid() || !e()) {
            k();
            return;
        }
        MediaPlayer mediaPlayer = this.f33762g;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("play(): pos=");
            MediaPlayer mediaPlayer2 = this.f33762g;
            sbA2.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
            sbA2.append(" ms");
            t.a("NativeAd-Video", sbA2.toString());
            MediaPlayer mediaPlayer3 = this.f33762g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
            }
            f();
        }
    }

    public final void j() throws IllegalStateException {
        if (this.k && this.f33766l && !this.f33771q) {
            i();
        }
    }

    public final void k() {
        Object objZ;
        Uri uri;
        try {
            uri = this.f33763h;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (uri != null && !this.f33764i.get() && !this.f33765j.get()) {
            d();
            this.f33765j.set(true);
            this.f33764i.set(false);
            MediaPlayer mediaPlayer = this.f33762g;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.f33762g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(this.f33770p);
            }
            MediaPlayer mediaPlayer3 = this.f33762g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setSurface(this.f33761f);
            }
            MediaPlayer mediaPlayer4 = this.f33762g;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setDataSource(getContext(), uri);
            }
            boolean z2 = u.f33874a;
            StringBuilder sb2 = new StringBuilder("prepareAsync(): uri=");
            sb2.append(uri);
            sb2.append(", surfaceValid=");
            Surface surface = this.f33761f;
            objZ = null;
            sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
            t.a("NativeAd-Video", sb2.toString());
            MediaPlayer mediaPlayer5 = this.f33762g;
            if (mediaPlayer5 != null) {
                mediaPlayer5.prepareAsync();
                objZ = C2515C.f34653a;
            }
            Throwable thA = C2530n.a(objZ);
            if (thA != null) {
                String strValueOf = String.valueOf(thA.getLocalizedMessage());
                com.vungle.ads.nativead.b bVar = this.f33774t;
                if (bVar != null) {
                    ((n) bVar).a(strValueOf, -1);
                }
            }
        }
    }

    public final void l() throws IllegalStateException {
        Object objZ;
        Object objZ2;
        Object objZ3 = C2515C.f34653a;
        boolean z2 = u.f33874a;
        t.a("NativeAd-Video", "release()");
        StringBuilder sb2 = new StringBuilder("pause() at pos=");
        MediaPlayer mediaPlayer = this.f33762g;
        sb2.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb2.append(" ms");
        t.a("NativeAd-Video", sb2.toString());
        this.f33766l = true;
        this.k = false;
        g();
        this.f33777w.removeCallbacks(this.f33778x);
        try {
            MediaPlayer mediaPlayer2 = this.f33762g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setSurface(null);
                objZ = objZ3;
            } else {
                objZ = null;
            }
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z10 = u.f33874a;
            t.a("NativeAd-Video", "Failed to clear Surface", thA);
        }
        try {
            MediaPlayer mediaPlayer3 = this.f33762g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.stop();
                objZ2 = objZ3;
            } else {
                objZ2 = null;
            }
        } catch (Throwable th2) {
            objZ2 = Fe.e.z(th2);
        }
        Throwable thA2 = C2530n.a(objZ2);
        if (thA2 != null) {
            boolean z11 = u.f33874a;
            t.a("NativeAd-Video", "Failed to stop MediaPlayer", thA2);
        }
        try {
            MediaPlayer mediaPlayer4 = this.f33762g;
            if (mediaPlayer4 != null) {
                mediaPlayer4.release();
            } else {
                objZ3 = null;
            }
        } catch (Throwable th3) {
            objZ3 = Fe.e.z(th3);
        }
        Throwable thA3 = C2530n.a(objZ3);
        if (thA3 != null) {
            boolean z12 = u.f33874a;
            t.a("NativeAd-Video", "Failed to release MediaPlayer", thA3);
        }
        this.f33762g = null;
        Surface surface = this.f33761f;
        if (surface != null) {
            surface.release();
        }
        this.f33761f = null;
        this.f33764i.set(false);
        this.f33765j.set(false);
    }

    public final void m() throws IllegalStateException {
        boolean z2 = u.f33874a;
        t.a("NativeAd-Video", "setAutoVisibility enabled=true threshold=0.01");
        this.f33756a = true;
        this.f33759d = android.support.v4.media.session.b.R(0.01f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z2 = u.f33874a;
        t.a("NativeAd-Video", "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f33757b);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f33758c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() throws IllegalStateException {
        boolean z2 = u.f33874a;
        t.a("NativeAd-Video", "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f33757b);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f33758c);
        g();
        Surface surface = this.f33761f;
        if (surface != null) {
            surface.release();
        }
        this.f33761f = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture st, int i5, int i10) throws IllegalStateException {
        Object objZ;
        AbstractC3340k.e(st, "st");
        Surface surface = this.f33761f;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(st);
        this.f33761f = surface2;
        try {
            MediaPlayer mediaPlayer = this.f33762g;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface2);
                objZ = C2515C.f34653a;
            } else {
                objZ = null;
            }
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z2 = u.f33874a;
            t.a("NativeAd-Video", "Failed to set surface", thA);
        }
        boolean z10 = objZ instanceof C2529m;
        boolean z11 = u.f33874a;
        StringBuilder sbH = v.h("onSurfaceTextureAvailable(): ", i5, " x ", i10, ", prepared=");
        sbH.append(this.f33764i);
        sbH.append(", wantPlay=");
        sbH.append(this.k);
        sbH.append(", surfaceRet=");
        sbH.append(!z10);
        t.a("NativeAd-Video", sbH.toString());
        if (!z10 && this.f33764i.get() && this.k) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onSurfaceTextureAvailable and videoCompleted=");
            sbA.append(this.f33771q);
            t.a("NativeAd-Video", sbA.toString());
            if (this.f33771q) {
                int i11 = this.f33768n;
                if (i11 < 0) {
                    i11 = 0;
                }
                this.f33767m = i11;
                StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("seekTo ");
                sbA2.append(this.f33767m);
                t.a("NativeAd-Video", sbA2.toString());
                if (this.f33764i.get()) {
                    MediaPlayer mediaPlayer2 = this.f33762g;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.seekTo(this.f33767m);
                    }
                    b();
                }
                MediaPlayer mediaPlayer3 = this.f33762g;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
                MediaPlayer mediaPlayer4 = this.f33762g;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.pause();
                }
            } else {
                MediaPlayer mediaPlayer5 = this.f33762g;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.start();
                }
                f();
            }
        } else {
            k();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture st) throws IllegalStateException {
        Object objZ;
        AbstractC3340k.e(st, "st");
        boolean z2 = u.f33874a;
        t.a("NativeAd-Video", "onSurfaceTextureDestroyed()");
        g();
        try {
            MediaPlayer mediaPlayer = this.f33762g;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                objZ = C2515C.f34653a;
            } else {
                objZ = null;
            }
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z10 = u.f33874a;
            t.a("NativeAd-Video", "Failed to clear surface", thA);
        }
        Surface surface = this.f33761f;
        if (surface != null) {
            surface.release();
        }
        this.f33761f = null;
        this.f33777w.removeCallbacks(this.f33778x);
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture st, int i5, int i10) {
        AbstractC3340k.e(st, "st");
        boolean z2 = u.f33874a;
        t.a("NativeAd-Video", "onSurfaceTextureSizeChanged() width=" + i5 + " height=" + i10);
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture st) {
        AbstractC3340k.e(st, "st");
    }

    public final void setLooping(boolean z2) {
        boolean z10 = u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("setLooping to ");
        sbA.append(this.f33770p);
        t.a("NativeAd-Video", sbA.toString());
        this.f33770p = z2;
        MediaPlayer mediaPlayer = this.f33762g;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z2);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(@NotNull tf.a aVar) {
        AbstractC3340k.e(aVar, "<set-?>");
        this.f33779y = aVar;
    }

    public final void setMuted(boolean z2) {
        boolean z10 = u.f33874a;
        t.a("NativeAd-Video", "setMuted to " + z2);
        this.f33769o = z2;
        float f10 = z2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        MediaPlayer mediaPlayer = this.f33762g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10, f10);
        }
        com.vungle.ads.nativead.b bVar = this.f33774t;
        if (bVar != null) {
            n nVar = (n) bVar;
            if (z2) {
                r1.a(nVar.getInternal(), "video.mute");
                nVar.getInternal().a(9, (Map) null);
                NativeVideoListener nativeVideoListener = nVar.getNativeVideoListener();
                if (nativeVideoListener != null) {
                    nativeVideoListener.onVideoMute();
                    return;
                }
                return;
            }
            r1.a(nVar.getInternal(), "video.unmute");
            nVar.getInternal().a(10, (Map) null);
            NativeVideoListener nativeVideoListener2 = nVar.getNativeVideoListener();
            if (nativeVideoListener2 != null) {
                nativeVideoListener2.onVideoUnmute();
            }
        }
    }

    public final void setSource(@NotNull Uri uri) {
        AbstractC3340k.e(uri, "uri");
        this.f33763h = uri;
        this.f33764i.set(false);
        this.f33765j.set(false);
        this.f33772r = 0;
        this.f33773s = 0;
        k();
    }

    public final void setSurface$vungle_ads_release(@Nullable Surface surface) {
        this.f33761f = surface;
    }

    public final void setTexture$vungle_ads_release(@NotNull TextureView textureView) {
        AbstractC3340k.e(textureView, "<set-?>");
        this.f33760e = textureView;
    }

    public final void setVideoLifecycleCallback(@NotNull com.vungle.ads.nativead.b lifecycleCallback) {
        AbstractC3340k.e(lifecycleCallback, "lifecycleCallback");
        this.f33774t = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(@Nullable b bVar) {
        this.f33775u = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC3340k.e(context, "context");
        this.f33757b = new Lb.e(this, 0);
        this.f33758c = new Lb.f(this, 0);
        this.f33759d = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.f33760e = textureView;
        this.f33764i = new AtomicBoolean(false);
        this.f33765j = new AtomicBoolean(false);
        this.f33776v = -1;
        this.f33777w = new Handler(Looper.getMainLooper());
        this.f33778x = new a(this);
        this.f33779y = c.f33755a;
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f33760e, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final void a(d this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        Surface surface;
        AbstractC3340k.e(this$0, "this$0");
        com.vungle.ads.nativead.b bVar = this$0.f33774t;
        if (bVar != null) {
            ((n) bVar).b();
        }
        this$0.f33768n = mediaPlayer.getDuration();
        this$0.f33765j.set(false);
        this$0.f33764i.set(true);
        int i5 = this$0.f33767m;
        if (i5 > 0) {
            mediaPlayer.seekTo(i5);
        }
        float f10 = this$0.f33769o ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        MediaPlayer mediaPlayer2 = this$0.f33762g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(f10, f10);
        }
        boolean z2 = u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onPrepared(): duration=");
        sbA.append(this$0.f33768n);
        sbA.append(" ms lastPos=");
        sbA.append(this$0.f33767m);
        sbA.append(" wantPlay=");
        sbA.append(this$0.k);
        t.a("NativeAd-Video", sbA.toString());
        if (this$0.k && (surface = this$0.f33761f) != null && surface.isValid()) {
            t.a("NativeAd-Video", "start video on prepared.");
            mediaPlayer.start();
            this$0.f();
        }
    }

    public static final void b(d this$0, MediaPlayer mediaPlayer) {
        AbstractC3340k.e(this$0, "this$0");
        boolean z2 = u.f33874a;
        t.a("NativeAd-Video", "onCompletion()");
        this$0.f33767m = this$0.f33768n;
        this$0.f33771q = true;
        this$0.f33777w.removeCallbacks(this$0.f33778x);
        this$0.b();
        this$0.f33776v = 100;
        com.vungle.ads.nativead.b bVar = this$0.f33774t;
        if (bVar != null) {
            ((n) bVar).a(100);
        }
        com.vungle.ads.nativead.b bVar2 = this$0.f33774t;
        if (bVar2 != null) {
            n nVar = (n) bVar2;
            r1.a(nVar.getInternal(), "video.close");
            nVar.getInternal().a(3, (Map) null);
            NativeVideoListener nativeVideoListener = nVar.getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoEnd();
            }
        }
    }

    public static final boolean b(d this$0, MediaPlayer mediaPlayer, int i5, int i10) {
        AbstractC3340k.e(this$0, "this$0");
        boolean z2 = u.f33874a;
        t.c("NativeAd-Video", "onError(): what=" + i5 + ", extra=" + i10);
        this$0.f33765j.set(false);
        this$0.f33764i.set(false);
        String strValueOf = String.valueOf(i10);
        com.vungle.ads.nativead.b bVar = this$0.f33774t;
        if (bVar == null) {
            return true;
        }
        ((n) bVar).a(strValueOf, i5);
        return true;
    }

    public static final void a(d this$0, MediaPlayer mediaPlayer, int i5, int i10) {
        AbstractC3340k.e(this$0, "this$0");
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        this$0.f33772r = i5;
        this$0.f33773s = i10;
        SurfaceTexture surfaceTexture = this$0.f33760e.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i5, i10);
        }
        this$0.a();
    }

    public final void b() {
        int iS;
        int i5 = this.f33768n;
        if (i5 <= 0 || !this.f33764i.get() || (iS = android.support.v4.media.session.b.S((int) ((getCurrentPositionMs() * 100) / i5), 0, 100)) == this.f33776v) {
            return;
        }
        this.f33776v = iS;
        com.vungle.ads.nativead.b bVar = this.f33774t;
        if (bVar != null) {
            ((n) bVar).a(iS);
        }
    }

    public final void a() {
        float f10;
        if (this.f33772r <= 0 || this.f33773s <= 0) {
            return;
        }
        int width = this.f33760e.getWidth();
        int height = this.f33760e.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f11 = width;
        float f12 = height;
        float f13 = f11 / f12;
        float f14 = this.f33772r / this.f33773s;
        Matrix matrix = new Matrix();
        if (f13 > f14) {
            f10 = f12 / this.f33773s;
        } else {
            f10 = f11 / this.f33772r;
        }
        matrix.setScale((this.f33772r * f10) / f11, (this.f33773s * f10) / f12, f11 / 2.0f, f12 / 2.0f);
        this.f33760e.setTransform(matrix);
        this.f33760e.invalidate();
        float f15 = (f11 - (this.f33772r * f10)) / 2.0f;
        float f16 = (f12 - (this.f33773s * f10)) / 2.0f;
        b bVar = this.f33775u;
        if (bVar != null) {
            bVar.a(this.f33760e.getX() + f15, this.f33760e.getY() + f16);
        }
    }
}
