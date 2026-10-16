package com.waze.ab;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public q f13808a;

    /* renamed from: b, reason: collision with root package name */
    private String f13809b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f13810c;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    private DialogInterface.OnClickListener f13812e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f13813f;

    /* renamed from: g, reason: collision with root package name */
    private r f13814g;

    /* renamed from: h, reason: collision with root package name */
    private p f13815h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.sharedui.views.v f13816i;

    /* renamed from: j, reason: collision with root package name */
    private String f13817j;

    /* renamed from: k, reason: collision with root package name */
    private String f13818k;

    /* renamed from: l, reason: collision with root package name */
    private String f13819l;
    private int m;
    private Bitmap n;
    private Drawable o;
    private int p;
    private View q;
    private FrameLayout.LayoutParams r;
    private boolean s;
    private DialogInterface.OnCancelListener u;
    private boolean v;
    private h w;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13811d = true;
    private boolean t = true;

    public final void A(View view, FrameLayout.LayoutParams layoutParams) {
        this.q = view;
        this.r = layoutParams;
    }

    public final void B(FrameLayout.LayoutParams layoutParams) {
        this.r = layoutParams;
    }

    public final void C(boolean z) {
        this.f13811d = z;
    }

    public final void D(Bitmap bitmap) {
        this.n = bitmap;
    }

    public final void E(Drawable drawable) {
        this.o = drawable;
    }

    public final void F(int i2) {
        this.p = i2;
    }

    public final void G(h hVar) {
        this.w = hVar;
    }

    public final void H(DialogInterface.OnCancelListener onCancelListener) {
        this.u = onCancelListener;
    }

    public final void I(p pVar) {
        this.f13815h = pVar;
    }

    public final void J(r rVar) {
        this.f13814g = rVar;
    }

    @Deprecated
    public final void K(Runnable runnable) {
        this.f13813f = runnable;
    }

    public final void L(com.waze.sharedui.views.v vVar) {
        this.f13816i = vVar;
    }

    public final void M(String str) {
        this.f13817j = str;
    }

    public final void N(String str) {
        this.f13818k = str;
    }

    public final void O(CharSequence charSequence) {
        this.f13810c = charSequence;
    }

    public final void P(String str) {
        this.f13810c = str == null ? null : Html.fromHtml(str, 0);
    }

    public final void Q(String str) {
        this.f13809b = str;
    }

    public final void R(boolean z) {
        this.v = z;
    }

    public final void S(View view) {
        A(view, this.r);
    }

    public final void w(int i2) {
        this.m = i2;
    }

    @Deprecated
    public final void x(DialogInterface.OnClickListener onClickListener) {
        this.f13812e = onClickListener;
    }

    public final void y(boolean z) {
        this.t = z;
    }

    public final void z(String str) {
        this.f13819l = str;
    }
}
