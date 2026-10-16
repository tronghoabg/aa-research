package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.l;
import j.w;
import k1.X;
import p.k;
import q.C3808e;
import q.C3816i;
import q.InterfaceC3815h0;
import q.InterfaceC3817i0;
import q.o1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f17866a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f17867b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f17868c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f17869d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f17870e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f17871f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f17872g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3815h0 f17873h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f17872g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f17870e == null) {
            this.f17870e = new TypedValue();
        }
        return this.f17870e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f17871f == null) {
            this.f17871f = new TypedValue();
        }
        return this.f17871f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f17868c == null) {
            this.f17868c = new TypedValue();
        }
        return this.f17868c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f17869d == null) {
            this.f17869d = new TypedValue();
        }
        return this.f17869d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f17866a == null) {
            this.f17866a = new TypedValue();
        }
        return this.f17866a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f17867b == null) {
            this.f17867b = new TypedValue();
        }
        return this.f17867b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC3815h0 interfaceC3815h0 = this.f17873h;
        if (interfaceC3815h0 != null) {
            interfaceC3815h0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C3816i c3816i;
        super.onDetachedFromWindow();
        InterfaceC3815h0 interfaceC3815h0 = this.f17873h;
        if (interfaceC3815h0 != null) {
            w wVar = (w) ((l) interfaceC3815h0).f26356b;
            InterfaceC3817i0 interfaceC3817i0 = wVar.f38544r;
            if (interfaceC3817i0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3817i0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((o1) actionBarOverlayLayout.f17819e).f43850a.f17977a;
                if (actionMenuView != null && (c3816i = actionMenuView.f17844t) != null) {
                    c3816i.i();
                    C3808e c3808e = c3816i.f43808t;
                    if (c3808e != null && c3808e.b()) {
                        c3808e.f43114i.dismiss();
                    }
                }
            }
            if (wVar.f38549w != null) {
                wVar.f38538l.getDecorView().removeCallbacks(wVar.f38550x);
                if (wVar.f38549w.isShowing()) {
                    try {
                        wVar.f38549w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                wVar.f38549w = null;
            }
            X x5 = wVar.f38551y;
            if (x5 != null) {
                x5.b();
            }
            k kVar = wVar.A(0).f38493h;
            if (kVar != null) {
                kVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC3815h0 interfaceC3815h0) {
        this.f17873h = interfaceC3815h0;
    }
}
