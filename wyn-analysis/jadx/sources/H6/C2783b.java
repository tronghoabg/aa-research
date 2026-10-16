package h6;

import E5.InterfaceC0453h;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.Z0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import u6.AbstractC4256a;

/* renamed from: h6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2783b implements InterfaceC0453h {

    /* renamed from: r, reason: collision with root package name */
    public static final C2783b f36166r = new C2783b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: s, reason: collision with root package name */
    public static final Z0 f36167s = new Z0(25);

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f36168a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f36169b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f36170c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f36171d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36172e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36173f;

    /* renamed from: g, reason: collision with root package name */
    public final int f36174g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36175h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36176i;

    /* renamed from: j, reason: collision with root package name */
    public final float f36177j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f36178l;

    /* renamed from: m, reason: collision with root package name */
    public final int f36179m;

    /* renamed from: n, reason: collision with root package name */
    public final int f36180n;

    /* renamed from: o, reason: collision with root package name */
    public final float f36181o;

    /* renamed from: p, reason: collision with root package name */
    public final int f36182p;

    /* renamed from: q, reason: collision with root package name */
    public final float f36183q;

    public C2783b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i5, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z2, int i13, int i14, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC4256a.e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f36168a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f36168a = charSequence.toString();
        } else {
            this.f36168a = null;
        }
        this.f36169b = alignment;
        this.f36170c = alignment2;
        this.f36171d = bitmap;
        this.f36172e = f10;
        this.f36173f = i5;
        this.f36174g = i10;
        this.f36175h = f11;
        this.f36176i = i11;
        this.f36177j = f13;
        this.k = f14;
        this.f36178l = z2;
        this.f36179m = i13;
        this.f36180n = i12;
        this.f36181o = f12;
        this.f36182p = i14;
        this.f36183q = f15;
    }

    public final C2782a a() {
        C2782a c2782a = new C2782a();
        c2782a.f36150a = this.f36168a;
        c2782a.f36151b = this.f36171d;
        c2782a.f36152c = this.f36169b;
        c2782a.f36153d = this.f36170c;
        c2782a.f36154e = this.f36172e;
        c2782a.f36155f = this.f36173f;
        c2782a.f36156g = this.f36174g;
        c2782a.f36157h = this.f36175h;
        c2782a.f36158i = this.f36176i;
        c2782a.f36159j = this.f36180n;
        c2782a.k = this.f36181o;
        c2782a.f36160l = this.f36177j;
        c2782a.f36161m = this.k;
        c2782a.f36162n = this.f36178l;
        c2782a.f36163o = this.f36179m;
        c2782a.f36164p = this.f36182p;
        c2782a.f36165q = this.f36183q;
        return c2782a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2783b.class == obj.getClass()) {
            C2783b c2783b = (C2783b) obj;
            if (TextUtils.equals(this.f36168a, c2783b.f36168a) && this.f36169b == c2783b.f36169b && this.f36170c == c2783b.f36170c) {
                Bitmap bitmap = c2783b.f36171d;
                Bitmap bitmap2 = this.f36171d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f36172e == c2783b.f36172e && this.f36173f == c2783b.f36173f && this.f36174g == c2783b.f36174g && this.f36175h == c2783b.f36175h && this.f36176i == c2783b.f36176i && this.f36177j == c2783b.f36177j && this.k == c2783b.k && this.f36178l == c2783b.f36178l && this.f36179m == c2783b.f36179m && this.f36180n == c2783b.f36180n && this.f36181o == c2783b.f36181o && this.f36182p == c2783b.f36182p && this.f36183q == c2783b.f36183q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36168a, this.f36169b, this.f36170c, this.f36171d, Float.valueOf(this.f36172e), Integer.valueOf(this.f36173f), Integer.valueOf(this.f36174g), Float.valueOf(this.f36175h), Integer.valueOf(this.f36176i), Float.valueOf(this.f36177j), Float.valueOf(this.k), Boolean.valueOf(this.f36178l), Integer.valueOf(this.f36179m), Integer.valueOf(this.f36180n), Float.valueOf(this.f36181o), Integer.valueOf(this.f36182p), Float.valueOf(this.f36183q)});
    }
}
