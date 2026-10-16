package o5;

import A0.p;
import E5.Q;
import L0.i;
import N.C0718d;
import N.P;
import N.Y;
import N.q0;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.moloco.sdk.internal.publisher.H;
import d0.f;
import e0.AbstractC2451c;
import e0.C2450b;
import e0.InterfaceC2463o;
import e0.r;
import ef.C2532p;
import g0.InterfaceC2663d;
import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3647a extends AbstractC2765c implements q0 {

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f41360f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f41361g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f41362h;

    /* renamed from: i, reason: collision with root package name */
    public final C2532p f41363i;

    public C3647a(Drawable drawable) {
        AbstractC3340k.e(drawable, "drawable");
        this.f41360f = drawable;
        P p10 = P.f7730f;
        this.f41361g = C0718d.G(0, p10);
        Object obj = AbstractC3649c.f41365a;
        this.f41362h = C0718d.G(new f((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? f.f33950c : H.I(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())), p10);
        this.f41363i = Fe.c.z(new p(this, 28));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h0.AbstractC2765c
    public final boolean a(float f10) {
        this.f41360f.setAlpha(android.support.v4.media.session.b.S(AbstractC4345a.H(f10 * 255), 0, 255));
        return true;
    }

    @Override // h0.AbstractC2765c
    public final boolean b(r rVar) {
        this.f41360f.setColorFilter(rVar != null ? rVar.f34383a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // N.q0
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.f41363i.getValue();
        Drawable drawable = this.f41360f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // h0.AbstractC2765c
    public final void d(i layoutDirection) {
        int i5;
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i5 = 1;
            if (iOrdinal != 1) {
                throw new Q((byte) 0, 9);
            }
        } else {
            i5 = 0;
        }
        this.f41360f.setLayoutDirection(i5);
    }

    @Override // h0.AbstractC2765c
    public final long f() {
        return ((f) this.f41362h.getValue()).f33952a;
    }

    @Override // h0.AbstractC2765c
    public final void g(InterfaceC2663d interfaceC2663d) {
        AbstractC3340k.e(interfaceC2663d, "<this>");
        InterfaceC2463o interfaceC2463oV = interfaceC2663d.u().v();
        ((Number) this.f41361g.getValue()).intValue();
        int iH = AbstractC4345a.H(f.d(interfaceC2663d.c()));
        int iH2 = AbstractC4345a.H(f.b(interfaceC2663d.c()));
        Drawable drawable = this.f41360f;
        drawable.setBounds(0, 0, iH, iH2);
        try {
            interfaceC2463oV.m();
            Canvas canvas = AbstractC2451c.f34360a;
            drawable.draw(((C2450b) interfaceC2463oV).f34357a);
        } finally {
            interfaceC2463oV.restore();
        }
    }

    @Override // N.q0
    public final void j() {
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // N.q0
    public final void k() {
        Drawable drawable = this.f41360f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }
}
