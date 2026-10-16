package s6;

import E5.C0465o;
import E5.w0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.ironsource.adqualitysdk.sdk.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.C3137y;
import l8.AbstractC3409K;
import u6.AbstractC4256a;
import u6.InterfaceC4259d;

/* loaded from: classes3.dex */
public final class C extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final z f45053a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f45054b;

    /* renamed from: c, reason: collision with root package name */
    public final View f45055c;

    /* renamed from: d, reason: collision with root package name */
    public final View f45056d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45057e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f45058f;

    /* renamed from: g, reason: collision with root package name */
    public final SubtitleView f45059g;

    /* renamed from: h, reason: collision with root package name */
    public final View f45060h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f45061i;

    /* renamed from: j, reason: collision with root package name */
    public final t f45062j;
    public final FrameLayout k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f45063l;

    /* renamed from: m, reason: collision with root package name */
    public w0 f45064m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45065n;

    /* renamed from: o, reason: collision with root package name */
    public s f45066o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45067p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f45068q;

    /* renamed from: r, reason: collision with root package name */
    public int f45069r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f45070s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f45071t;

    /* renamed from: u, reason: collision with root package name */
    public int f45072u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f45073v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f45074w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f45075x;

    /* renamed from: y, reason: collision with root package name */
    public int f45076y;

    public C(Context context) {
        super(context, null, 0);
        z zVar = new z(this);
        this.f45053a = zVar;
        if (isInEditMode()) {
            this.f45054b = null;
            this.f45055c = null;
            this.f45056d = null;
            this.f45057e = false;
            this.f45058f = null;
            this.f45059g = null;
            this.f45060h = null;
            this.f45061i = null;
            this.f45062j = null;
            this.k = null;
            this.f45063l = null;
            ImageView imageView = new ImageView(context);
            if (u6.v.f46721a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(com.wynauto.wyn.R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(com.wynauto.wyn.R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(com.wynauto.wyn.R.layout.exo_styled_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(com.wynauto.wyn.R.id.exo_content_frame);
        this.f45054b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f45055c = findViewById(com.wynauto.wyn.R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            this.f45056d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(zVar);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f45056d = null;
        }
        this.f45057e = false;
        this.k = (FrameLayout) findViewById(com.wynauto.wyn.R.id.exo_ad_overlay);
        this.f45063l = (FrameLayout) findViewById(com.wynauto.wyn.R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(com.wynauto.wyn.R.id.exo_artwork);
        this.f45058f = imageView2;
        this.f45067p = imageView2 != null;
        SubtitleView subtitleView = (SubtitleView) findViewById(com.wynauto.wyn.R.id.exo_subtitles);
        this.f45059g = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById = findViewById(com.wynauto.wyn.R.id.exo_buffering);
        this.f45060h = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f45069r = 0;
        TextView textView = (TextView) findViewById(com.wynauto.wyn.R.id.exo_error_message);
        this.f45061i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        t tVar = (t) findViewById(com.wynauto.wyn.R.id.exo_controller);
        View viewFindViewById2 = findViewById(com.wynauto.wyn.R.id.exo_controller_placeholder);
        if (tVar != null) {
            this.f45062j = tVar;
        } else if (viewFindViewById2 != null) {
            t tVar2 = new t(context);
            this.f45062j = tVar2;
            tVar2.setId(com.wynauto.wyn.R.id.exo_controller);
            tVar2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(tVar2, iIndexOfChild);
        } else {
            this.f45062j = null;
        }
        t tVar3 = this.f45062j;
        this.f45072u = tVar3 != null ? 5000 : 0;
        this.f45075x = true;
        this.f45073v = true;
        this.f45074w = true;
        this.f45065n = tVar3 != null;
        if (tVar3 != null) {
            y yVar = tVar3.f45226a;
            int i5 = yVar.f45309z;
            if (i5 != 3 && i5 != 2) {
                yVar.f();
                yVar.i(2);
            }
            this.f45062j.f45232d.add(zVar);
        }
        setClickable(true);
        j();
    }

    public static void a(TextureView textureView, int i5) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i5 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i5, f10, f11);
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        w0 w0Var = this.f45064m;
        return w0Var != null && ((E5.I) w0Var).x0() && ((E5.I) this.f45064m).s0();
    }

    public final void c(boolean z2) {
        if (!(b() && this.f45074w) && m()) {
            t tVar = this.f45062j;
            boolean z10 = tVar.g() && tVar.getShowTimeoutMs() <= 0;
            boolean zE = e();
            if (z2 || z10 || zE) {
                f(zE);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f45054b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                ImageView imageView = this.f45058f;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        w0 w0Var = this.f45064m;
        if (w0Var != null && ((E5.I) w0Var).x0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z2 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        t tVar = this.f45062j;
        if (z2 && m() && !tVar.g()) {
            c(true);
            return true;
        }
        if ((m() && tVar.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            c(true);
            return true;
        }
        if (z2 && m()) {
            c(true);
        }
        return false;
    }

    public final boolean e() {
        w0 w0Var = this.f45064m;
        if (w0Var == null) {
            return true;
        }
        int iT0 = ((E5.I) w0Var).t0();
        if (!this.f45073v || ((E5.I) this.f45064m).o0().p()) {
            return false;
        }
        if (iT0 != 1 && iT0 != 4) {
            w0 w0Var2 = this.f45064m;
            w0Var2.getClass();
            if (((E5.I) w0Var2).s0()) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z2) {
        if (m()) {
            int i5 = z2 ? 0 : this.f45072u;
            t tVar = this.f45062j;
            tVar.setShowTimeoutMs(i5);
            y yVar = tVar.f45226a;
            t tVar2 = yVar.f45285a;
            if (!tVar2.h()) {
                tVar2.setVisibility(0);
                tVar2.i();
                View view = tVar2.f45253o;
                if (view != null) {
                    view.requestFocus();
                }
            }
            yVar.k();
        }
    }

    public final void g() {
        if (!m() || this.f45064m == null) {
            return;
        }
        t tVar = this.f45062j;
        if (!tVar.g()) {
            c(true);
        } else if (this.f45075x) {
            tVar.f();
        }
    }

    public List<C3137y> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f45063l;
        if (frameLayout != null) {
            arrayList.add(new C3137y(frameLayout));
        }
        t tVar = this.f45062j;
        if (tVar != null) {
            arrayList.add(new C3137y(tVar));
        }
        return AbstractC3409K.j(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.k;
        AbstractC4256a.k(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f45073v;
    }

    public boolean getControllerHideOnTouch() {
        return this.f45075x;
    }

    public int getControllerShowTimeoutMs() {
        return this.f45072u;
    }

    public Drawable getDefaultArtwork() {
        return this.f45068q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f45063l;
    }

    public w0 getPlayer() {
        return this.f45064m;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f45054b;
        AbstractC4256a.j(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f45059g;
    }

    public boolean getUseArtwork() {
        return this.f45067p;
    }

    public boolean getUseController() {
        return this.f45065n;
    }

    public View getVideoSurfaceView() {
        return this.f45056d;
    }

    public final void h() {
        v6.o oVar;
        w0 w0Var = this.f45064m;
        if (w0Var != null) {
            E5.I i5 = (E5.I) w0Var;
            i5.Q0();
            oVar = i5.f3085h0;
        } else {
            oVar = v6.o.f46898e;
        }
        int i10 = oVar.f46899a;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i11 = oVar.f46900b;
        float f11 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * oVar.f46902d) / i11;
        View view = this.f45056d;
        if (view instanceof TextureView) {
            int i12 = oVar.f46901c;
            if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i12 == 90 || i12 == 270)) {
                f11 = 1.0f / f11;
            }
            int i13 = this.f45076y;
            z zVar = this.f45053a;
            if (i13 != 0) {
                view.removeOnLayoutChangeListener(zVar);
            }
            this.f45076y = i12;
            if (i12 != 0) {
                view.addOnLayoutChangeListener(zVar);
            }
            a((TextureView) view, this.f45076y);
        }
        if (!this.f45057e) {
            f10 = f11;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f45054b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            android.view.View r0 = r5.f45060h
            if (r0 == 0) goto L2d
            E5.w0 r1 = r5.f45064m
            r2 = 0
            if (r1 == 0) goto L24
            E5.I r1 = (E5.I) r1
            int r1 = r1.t0()
            r3 = 2
            if (r1 != r3) goto L24
            int r1 = r5.f45069r
            r4 = 1
            if (r1 == r3) goto L25
            if (r1 != r4) goto L24
            E5.w0 r1 = r5.f45064m
            E5.I r1 = (E5.I) r1
            boolean r1 = r1.s0()
            if (r1 == 0) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r2 = 8
        L2a:
            r0.setVisibility(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C.i():void");
    }

    public final void j() {
        t tVar = this.f45062j;
        if (tVar == null || !this.f45065n) {
            setContentDescription(null);
        } else if (tVar.g()) {
            setContentDescription(this.f45075x ? getResources().getString(com.wynauto.wyn.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.wynauto.wyn.R.string.exo_controls_show));
        }
    }

    public final void k() {
        TextView textView = this.f45061i;
        if (textView != null) {
            CharSequence charSequence = this.f45071t;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            w0 w0Var = this.f45064m;
            if (w0Var != null) {
                E5.I i5 = (E5.I) w0Var;
                i5.Q0();
                C0465o c0465o = i5.f3089j0.f3504f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z2) {
        w0 w0Var = this.f45064m;
        View view = this.f45055c;
        ImageView imageView = this.f45058f;
        boolean zD = false;
        if (w0Var != null) {
            E5.I i5 = (E5.I) w0Var;
            if (!i5.p0().f3139a.isEmpty()) {
                if (z2 && !this.f45070s && view != null) {
                    view.setVisibility(0);
                }
                if (i5.p0().a(2)) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.f45067p) {
                    AbstractC4256a.j(imageView);
                    i5.Q0();
                    byte[] bArr = i5.f3060P.f3373j;
                    if (bArr != null) {
                        zD = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                    if (zD || d(this.f45068q)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (this.f45070s) {
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean m() {
        if (!this.f45065n) {
            return false;
        }
        AbstractC4256a.j(this.f45062j);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m() || this.f45064m == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setAspectRatioListener(InterfaceC4014a interfaceC4014a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f45054b;
        AbstractC4256a.j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC4014a);
    }

    public void setControllerAutoShow(boolean z2) {
        this.f45073v = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.f45074w = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        AbstractC4256a.j(this.f45062j);
        this.f45075x = z2;
        j();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(InterfaceC4024k interfaceC4024k) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setOnFullScreenModeChangedListener(interfaceC4024k);
    }

    public void setControllerShowTimeoutMs(int i5) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        this.f45072u = i5;
        if (tVar.g()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(InterfaceC4012A interfaceC4012A) {
        setControllerVisibilityListener((s) null);
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC4256a.i(this.f45061i != null);
        this.f45071t = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f45068q != drawable) {
            this.f45068q = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC4259d interfaceC4259d) {
        if (interfaceC4259d != null) {
            k();
        }
    }

    public void setFullscreenButtonClickListener(InterfaceC4013B interfaceC4013B) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setOnFullScreenModeChangedListener(this.f45053a);
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.f45070s != z2) {
            this.f45070s = z2;
            l(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPlayer(E5.w0 r12) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C.setPlayer(E5.w0):void");
    }

    public void setRepeatToggleModes(int i5) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setRepeatToggleModes(i5);
    }

    public void setResizeMode(int i5) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f45054b;
        AbstractC4256a.j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i5);
    }

    public void setShowBuffering(int i5) {
        if (this.f45069r != i5) {
            this.f45069r = i5;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowFastForwardButton(z2);
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowMultiWindowTimeBar(z2);
    }

    public void setShowNextButton(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowNextButton(z2);
    }

    public void setShowPreviousButton(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowPreviousButton(z2);
    }

    public void setShowRewindButton(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowRewindButton(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowShuffleButton(z2);
    }

    public void setShowSubtitleButton(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowSubtitleButton(z2);
    }

    public void setShowVrButton(boolean z2) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        tVar.setShowVrButton(z2);
    }

    public void setShutterBackgroundColor(int i5) {
        View view = this.f45055c;
        if (view != null) {
            view.setBackgroundColor(i5);
        }
    }

    public void setUseArtwork(boolean z2) {
        AbstractC4256a.i((z2 && this.f45058f == null) ? false : true);
        if (this.f45067p != z2) {
            this.f45067p = z2;
            l(false);
        }
    }

    public void setUseController(boolean z2) {
        boolean z10 = true;
        t tVar = this.f45062j;
        AbstractC4256a.i((z2 && tVar == null) ? false : true);
        if (!z2 && !hasOnClickListeners()) {
            z10 = false;
        }
        setClickable(z10);
        if (this.f45065n == z2) {
            return;
        }
        this.f45065n = z2;
        if (m()) {
            tVar.setPlayer(this.f45064m);
        } else if (tVar != null) {
            tVar.f();
            tVar.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        View view = this.f45056d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i5);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(s sVar) {
        t tVar = this.f45062j;
        AbstractC4256a.j(tVar);
        s sVar2 = this.f45066o;
        if (sVar2 == sVar) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = tVar.f45232d;
        if (sVar2 != null) {
            copyOnWriteArrayList.remove(sVar2);
        }
        this.f45066o = sVar;
        if (sVar != null) {
            copyOnWriteArrayList.add(sVar);
        }
        setControllerVisibilityListener((InterfaceC4012A) null);
    }
}
