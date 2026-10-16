package E;

import android.view.View;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import p7.AbstractC3772b;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: s, reason: collision with root package name */
    public static final WeakHashMap f2713s = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0411a f2714a = C0416f.d(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final C0411a f2715b;

    /* renamed from: c, reason: collision with root package name */
    public final C0411a f2716c;

    /* renamed from: d, reason: collision with root package name */
    public final C0411a f2717d;

    /* renamed from: e, reason: collision with root package name */
    public final C0411a f2718e;

    /* renamed from: f, reason: collision with root package name */
    public final C0411a f2719f;

    /* renamed from: g, reason: collision with root package name */
    public final C0411a f2720g;

    /* renamed from: h, reason: collision with root package name */
    public final C0411a f2721h;

    /* renamed from: i, reason: collision with root package name */
    public final C0411a f2722i;

    /* renamed from: j, reason: collision with root package name */
    public final P f2723j;
    public final P k;

    /* renamed from: l, reason: collision with root package name */
    public final P f2724l;

    /* renamed from: m, reason: collision with root package name */
    public final P f2725m;

    /* renamed from: n, reason: collision with root package name */
    public final P f2726n;

    /* renamed from: o, reason: collision with root package name */
    public final P f2727o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2728p;

    /* renamed from: q, reason: collision with root package name */
    public int f2729q;

    /* renamed from: r, reason: collision with root package name */
    public final z f2730r;

    public S(View view) {
        C0411a c0411aD = C0416f.d(128, "displayCutout");
        this.f2715b = c0411aD;
        C0411a c0411aD2 = C0416f.d(8, "ime");
        this.f2716c = c0411aD2;
        C0411a c0411aD3 = C0416f.d(32, "mandatorySystemGestures");
        this.f2717d = c0411aD3;
        this.f2718e = C0416f.d(2, "navigationBars");
        this.f2719f = C0416f.d(1, "statusBars");
        C0411a c0411aD4 = C0416f.d(519, "systemBars");
        this.f2720g = c0411aD4;
        C0411a c0411aD5 = C0416f.d(16, "systemGestures");
        this.f2721h = c0411aD5;
        C0411a c0411aD6 = C0416f.d(64, "tappableElement");
        this.f2722i = c0411aD6;
        P p10 = new P(new C(0, 0, 0, 0), "waterfall");
        this.f2723j = p10;
        AbstractC3772b.V(AbstractC3772b.V(AbstractC3772b.V(c0411aD4, c0411aD2), c0411aD), AbstractC3772b.V(AbstractC3772b.V(AbstractC3772b.V(c0411aD6, c0411aD3), c0411aD5), p10));
        this.k = C0416f.e(4, "captionBarIgnoringVisibility");
        this.f2724l = C0416f.e(2, "navigationBarsIgnoringVisibility");
        this.f2725m = C0416f.e(1, "statusBarsIgnoringVisibility");
        this.f2726n = C0416f.e(519, "systemBarsIgnoringVisibility");
        this.f2727o = C0416f.e(64, "tappableElementIgnoringVisibility");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f2728p = bool != null ? bool.booleanValue() : true;
        this.f2730r = new z(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(k1.v0 r4, int r5) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.S.a(k1.v0, int):void");
    }
}
