package P1;

import Q1.k;
import Q1.x;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final String f9001A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f9002B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f9003C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f9004D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f9005E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f9006F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f9007G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f9008H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f9009I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f9010J;

    /* renamed from: r, reason: collision with root package name */
    public static final String f9011r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f9012s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f9013t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f9014u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f9015v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f9016w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f9017x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f9018y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f9019z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f9020a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f9021b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f9022c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f9023d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9024e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9025f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9026g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9027h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9028i;

    /* renamed from: j, reason: collision with root package name */
    public final float f9029j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9030l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9031m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9032n;

    /* renamed from: o, reason: collision with root package name */
    public final float f9033o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9034p;

    /* renamed from: q, reason: collision with root package name */
    public final float f9035q;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i5 = x.f9724a;
        f9011r = Integer.toString(0, 36);
        f9012s = Integer.toString(17, 36);
        f9013t = Integer.toString(1, 36);
        f9014u = Integer.toString(2, 36);
        f9015v = Integer.toString(3, 36);
        f9016w = Integer.toString(18, 36);
        f9017x = Integer.toString(4, 36);
        f9018y = Integer.toString(5, 36);
        f9019z = Integer.toString(6, 36);
        f9001A = Integer.toString(7, 36);
        f9002B = Integer.toString(8, 36);
        f9003C = Integer.toString(9, 36);
        f9004D = Integer.toString(10, 36);
        f9005E = Integer.toString(11, 36);
        f9006F = Integer.toString(12, 36);
        f9007G = Integer.toString(13, 36);
        f9008H = Integer.toString(14, 36);
        f9009I = Integer.toString(15, 36);
        f9010J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i5, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z2, int i13, int i14, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            k.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f9020a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f9020a = charSequence.toString();
        } else {
            this.f9020a = null;
        }
        this.f9021b = alignment;
        this.f9022c = alignment2;
        this.f9023d = bitmap;
        this.f9024e = f10;
        this.f9025f = i5;
        this.f9026g = i10;
        this.f9027h = f11;
        this.f9028i = i11;
        this.f9029j = f13;
        this.k = f14;
        this.f9030l = z2;
        this.f9031m = i13;
        this.f9032n = i12;
        this.f9033o = f12;
        this.f9034p = i14;
        this.f9035q = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f9020a, bVar.f9020a) && this.f9021b == bVar.f9021b && this.f9022c == bVar.f9022c) {
                Bitmap bitmap = bVar.f9023d;
                Bitmap bitmap2 = this.f9023d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f9024e == bVar.f9024e && this.f9025f == bVar.f9025f && this.f9026g == bVar.f9026g && this.f9027h == bVar.f9027h && this.f9028i == bVar.f9028i && this.f9029j == bVar.f9029j && this.k == bVar.k && this.f9030l == bVar.f9030l && this.f9031m == bVar.f9031m && this.f9032n == bVar.f9032n && this.f9033o == bVar.f9033o && this.f9034p == bVar.f9034p && this.f9035q == bVar.f9035q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9020a, this.f9021b, this.f9022c, this.f9023d, Float.valueOf(this.f9024e), Integer.valueOf(this.f9025f), Integer.valueOf(this.f9026g), Float.valueOf(this.f9027h), Integer.valueOf(this.f9028i), Float.valueOf(this.f9029j), Float.valueOf(this.k), Boolean.valueOf(this.f9030l), Integer.valueOf(this.f9031m), Integer.valueOf(this.f9032n), Float.valueOf(this.f9033o), Integer.valueOf(this.f9034p), Float.valueOf(this.f9035q)});
    }
}
