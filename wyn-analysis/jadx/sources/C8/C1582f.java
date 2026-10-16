package c8;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: c8.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1582f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public C1587k f19713a;

    /* renamed from: b, reason: collision with root package name */
    public V7.a f19714b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f19715c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f19716d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f19717e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f19718f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f19719g;

    /* renamed from: h, reason: collision with root package name */
    public final float f19720h;

    /* renamed from: i, reason: collision with root package name */
    public float f19721i;

    /* renamed from: j, reason: collision with root package name */
    public float f19722j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public float f19723l;

    /* renamed from: m, reason: collision with root package name */
    public float f19724m;

    /* renamed from: n, reason: collision with root package name */
    public int f19725n;

    /* renamed from: o, reason: collision with root package name */
    public int f19726o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f19727p;

    public C1582f(C1587k c1587k) {
        this.f19715c = null;
        this.f19716d = null;
        this.f19717e = null;
        this.f19718f = PorterDuff.Mode.SRC_IN;
        this.f19719g = null;
        this.f19720h = 1.0f;
        this.f19721i = 1.0f;
        this.k = 255;
        this.f19723l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f19724m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f19725n = 0;
        this.f19726o = 0;
        this.f19727p = Paint.Style.FILL_AND_STROKE;
        this.f19713a = c1587k;
        this.f19714b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1583g c1583g = new C1583g(this);
        c1583g.f19733e = true;
        return c1583g;
    }

    public C1582f(C1582f c1582f) {
        this.f19715c = null;
        this.f19716d = null;
        this.f19717e = null;
        this.f19718f = PorterDuff.Mode.SRC_IN;
        this.f19719g = null;
        this.f19720h = 1.0f;
        this.f19721i = 1.0f;
        this.k = 255;
        this.f19723l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f19724m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f19725n = 0;
        this.f19726o = 0;
        this.f19727p = Paint.Style.FILL_AND_STROKE;
        this.f19713a = c1582f.f19713a;
        this.f19714b = c1582f.f19714b;
        this.f19722j = c1582f.f19722j;
        this.f19715c = c1582f.f19715c;
        this.f19716d = c1582f.f19716d;
        this.f19718f = c1582f.f19718f;
        this.f19717e = c1582f.f19717e;
        this.k = c1582f.k;
        this.f19720h = c1582f.f19720h;
        this.f19726o = c1582f.f19726o;
        this.f19721i = c1582f.f19721i;
        this.f19723l = c1582f.f19723l;
        this.f19724m = c1582f.f19724m;
        this.f19725n = c1582f.f19725n;
        this.f19727p = c1582f.f19727p;
        if (c1582f.f19719g != null) {
            this.f19719g = new Rect(c1582f.f19719g);
        }
    }
}
