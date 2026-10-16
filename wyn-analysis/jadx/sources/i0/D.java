package i0;

import A7.S;
import N.C0718d;
import N.Y;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import e0.AbstractC2451c;
import e0.AbstractC2457i;
import e0.C2450b;
import e0.C2452d;
import e0.C2465q;
import e0.InterfaceC2463o;
import f0.C2549e;
import g0.C2660a;
import g0.C2661b;
import g0.InterfaceC2663d;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class D extends AbstractC2822B {

    /* renamed from: b, reason: collision with root package name */
    public final C2823a f36466b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36467c;

    /* renamed from: d, reason: collision with root package name */
    public final S f36468d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC3343n f36469e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f36470f;

    /* renamed from: g, reason: collision with root package name */
    public float f36471g;

    /* renamed from: h, reason: collision with root package name */
    public float f36472h;

    /* renamed from: i, reason: collision with root package name */
    public long f36473i;

    /* renamed from: j, reason: collision with root package name */
    public final B.F f36474j;

    public D() {
        C2823a c2823a = new C2823a();
        c2823a.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2823a.f36588q = true;
        c2823a.c();
        c2823a.f36583l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2823a.f36588q = true;
        c2823a.c();
        c2823a.d(new A0.p(this, 22));
        this.f36466b = c2823a;
        this.f36467c = true;
        this.f36468d = new S(2);
        this.f36469e = C2827e.k;
        this.f36470f = C0718d.G(null, N.P.f7730f);
        this.f36473i = d0.f.f33950c;
        this.f36474j = new B.F(this, 15);
    }

    @Override // i0.AbstractC2822B
    public final void a(InterfaceC2663d interfaceC2663d) {
        AbstractC3340k.e(interfaceC2663d, "<this>");
        e(interfaceC2663d, 1.0f, null);
    }

    public final void e(InterfaceC2663d interfaceC2663d, float f10, e0.r rVar) {
        S s10;
        char c10;
        long j8;
        Bitmap bitmapCreateBitmap;
        e0.r rVar2;
        AbstractC3340k.e(interfaceC2663d, "<this>");
        e0.r rVar3 = rVar != null ? rVar : (e0.r) this.f36470f.getValue();
        boolean z2 = this.f36467c;
        S s11 = this.f36468d;
        if (z2 || !d0.f.a(this.f36473i, interfaceC2663d.c())) {
            float fD = d0.f.d(interfaceC2663d.c()) / this.f36471g;
            C2823a c2823a = this.f36466b;
            c2823a.f36584m = fD;
            c2823a.f36588q = true;
            c2823a.c();
            c2823a.f36585n = d0.f.b(interfaceC2663d.c()) / this.f36472h;
            c2823a.f36588q = true;
            c2823a.c();
            long jA = Ba.c.a((int) Math.ceil(d0.f.d(interfaceC2663d.c())), (int) Math.ceil(d0.f.b(interfaceC2663d.c())));
            L0.i layoutDirection = interfaceC2663d.getLayoutDirection();
            s11.getClass();
            AbstractC3340k.e(layoutDirection, "layoutDirection");
            B.F block = this.f36474j;
            AbstractC3340k.e(block, "block");
            C2452d c2452d = (C2452d) s11.f691c;
            C2450b c2450b = (C2450b) s11.f692d;
            if (c2452d == null || c2450b == null) {
                s10 = s11;
                c10 = ' ';
                j8 = 4294967295L;
            } else {
                j8 = 4294967295L;
                int i5 = (int) (jA >> 32);
                Bitmap bitmap = c2452d.f34361a;
                c10 = ' ';
                if (i5 <= bitmap.getWidth()) {
                    s10 = s11;
                    if (((int) (jA & 4294967295L)) > bitmap.getHeight()) {
                    }
                    s10.f690b = jA;
                    long jR = Ba.c.R(jA);
                    C2661b c2661b = (C2661b) s10.f693e;
                    C2660a c2660a = c2661b.f35483a;
                    L0.b bVar = c2660a.f35479a;
                    L0.i iVar = c2660a.f35480b;
                    InterfaceC2463o interfaceC2463o = c2660a.f35481c;
                    rVar2 = rVar3;
                    long j10 = c2660a.f35482d;
                    c2660a.f35479a = interfaceC2663d;
                    c2660a.f35480b = layoutDirection;
                    c2660a.f35481c = c2450b;
                    c2660a.f35482d = jR;
                    c2450b.m();
                    com.google.android.gms.internal.consent_sdk.a.g(c2661b, C2465q.f34373b, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62);
                    block.invoke(c2661b);
                    c2450b.restore();
                    C2660a c2660a2 = c2661b.f35483a;
                    c2660a2.getClass();
                    AbstractC3340k.e(bVar, "<set-?>");
                    c2660a2.f35479a = bVar;
                    AbstractC3340k.e(iVar, "<set-?>");
                    c2660a2.f35480b = iVar;
                    c2660a2.f35481c = interfaceC2463o;
                    c2660a2.f35482d = j10;
                    c2452d.f34361a.prepareToDraw();
                    this.f36467c = false;
                    this.f36473i = interfaceC2663d.c();
                } else {
                    s10 = s11;
                }
            }
            int i10 = (int) (jA >> c10);
            S s12 = s10;
            int i11 = (int) (jA & j8);
            f0.n colorSpace = C2549e.f34746c;
            AbstractC3340k.e(colorSpace, "colorSpace");
            Bitmap.Config configT = e0.z.t(0);
            if (Build.VERSION.SDK_INT >= 26) {
                bitmapCreateBitmap = AbstractC2457i.c(i10, i11, 0, true, colorSpace);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configT);
                AbstractC3340k.d(bitmapCreateBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
                bitmapCreateBitmap.setHasAlpha(true);
            }
            c2452d = new C2452d(bitmapCreateBitmap);
            Canvas canvas = AbstractC2451c.f34360a;
            c2450b = new C2450b();
            c2450b.f34357a = new Canvas(e0.z.f(c2452d));
            s10 = s12;
            s10.f691c = c2452d;
            s10.f692d = c2450b;
            s10.f690b = jA;
            long jR2 = Ba.c.R(jA);
            C2661b c2661b2 = (C2661b) s10.f693e;
            C2660a c2660a3 = c2661b2.f35483a;
            L0.b bVar2 = c2660a3.f35479a;
            L0.i iVar2 = c2660a3.f35480b;
            InterfaceC2463o interfaceC2463o2 = c2660a3.f35481c;
            rVar2 = rVar3;
            long j102 = c2660a3.f35482d;
            c2660a3.f35479a = interfaceC2663d;
            c2660a3.f35480b = layoutDirection;
            c2660a3.f35481c = c2450b;
            c2660a3.f35482d = jR2;
            c2450b.m();
            com.google.android.gms.internal.consent_sdk.a.g(c2661b2, C2465q.f34373b, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62);
            block.invoke(c2661b2);
            c2450b.restore();
            C2660a c2660a22 = c2661b2.f35483a;
            c2660a22.getClass();
            AbstractC3340k.e(bVar2, "<set-?>");
            c2660a22.f35479a = bVar2;
            AbstractC3340k.e(iVar2, "<set-?>");
            c2660a22.f35480b = iVar2;
            c2660a22.f35481c = interfaceC2463o2;
            c2660a22.f35482d = j102;
            c2452d.f34361a.prepareToDraw();
            this.f36467c = false;
            this.f36473i = interfaceC2663d.c();
        } else {
            s10 = s11;
            rVar2 = rVar3;
        }
        s10.getClass();
        C2452d c2452d2 = (C2452d) s10.f691c;
        if (c2452d2 == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        com.google.android.gms.internal.consent_sdk.a.d(interfaceC2663d, c2452d2, 0L, s10.f690b, 0L, f10, rVar2, 0, 858);
    }

    public final String toString() {
        String str = "Params: \tname: " + this.f36466b.f36581i + "\n\tviewportWidth: " + this.f36471g + "\n\tviewportHeight: " + this.f36472h + "\n";
        AbstractC3340k.d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
