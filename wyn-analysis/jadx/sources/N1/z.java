package N1;

import j$.util.Objects;
import java.util.Arrays;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: B, reason: collision with root package name */
    public static final z f8304B;

    /* renamed from: A, reason: collision with root package name */
    public final AbstractC3409K f8305A;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f8306a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f8307b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f8308c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f8309d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f8310e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f8311f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f8312g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f8313h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f8314i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f8315j;
    public final Boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f8316l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f8317m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f8318n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f8319o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f8320p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f8321q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f8322r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f8323s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f8324t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f8325u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f8326v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f8327w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f8328x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f8329y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f8330z;

    static {
        C0775y c0775y = new C0775y();
        C3407I c3407i = AbstractC3409K.f40056b;
        c0775y.f8303z = e0.f40101e;
        f8304B = new z(c0775y);
        N0.a.k(0, 1, 2, 3, 4);
        N0.a.k(5, 6, 8, 9, 10);
        N0.a.k(11, 12, 13, 14, 15);
        N0.a.k(16, 17, 18, 19, 20);
        N0.a.k(21, 22, 23, 24, 25);
        N0.a.k(26, 27, 28, 29, 30);
        N0.a.k(31, 32, 33, 34, 1000);
    }

    public z(C0775y c0775y) {
        Boolean boolValueOf = c0775y.k;
        Integer numValueOf = c0775y.f8288j;
        Integer numValueOf2 = c0775y.f8302y;
        int i5 = 1;
        int i10 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i5 = 0;
                            break;
                        case 21:
                            i5 = 2;
                            break;
                        case 22:
                            i5 = 3;
                            break;
                        case 23:
                            i5 = 4;
                            break;
                        case 24:
                            i5 = 5;
                            break;
                        case 25:
                            i5 = 6;
                            break;
                    }
                    i10 = i5;
                }
                numValueOf = Integer.valueOf(i10);
            }
        } else if (numValueOf != null) {
            boolean z2 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z2);
            if (z2 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i10);
            }
        }
        this.f8306a = c0775y.f8279a;
        this.f8307b = c0775y.f8280b;
        this.f8308c = c0775y.f8281c;
        this.f8309d = c0775y.f8282d;
        this.f8310e = c0775y.f8283e;
        this.f8311f = c0775y.f8284f;
        this.f8312g = c0775y.f8285g;
        this.f8313h = c0775y.f8286h;
        this.f8314i = c0775y.f8287i;
        this.f8315j = numValueOf;
        this.k = boolValueOf;
        Integer num = c0775y.f8289l;
        this.f8316l = num;
        this.f8317m = num;
        this.f8318n = c0775y.f8290m;
        this.f8319o = c0775y.f8291n;
        this.f8320p = c0775y.f8292o;
        this.f8321q = c0775y.f8293p;
        this.f8322r = c0775y.f8294q;
        this.f8323s = c0775y.f8295r;
        this.f8324t = c0775y.f8296s;
        this.f8325u = c0775y.f8297t;
        this.f8326v = c0775y.f8298u;
        this.f8327w = c0775y.f8299v;
        this.f8328x = c0775y.f8300w;
        this.f8329y = c0775y.f8301x;
        this.f8330z = numValueOf2;
        this.f8305A = c0775y.f8303z;
    }

    public final C0775y a() {
        C0775y c0775y = new C0775y();
        c0775y.f8279a = this.f8306a;
        c0775y.f8280b = this.f8307b;
        c0775y.f8281c = this.f8308c;
        c0775y.f8282d = this.f8309d;
        c0775y.f8283e = this.f8310e;
        c0775y.f8284f = this.f8311f;
        c0775y.f8285g = this.f8312g;
        c0775y.f8286h = this.f8313h;
        c0775y.f8287i = this.f8314i;
        c0775y.f8288j = this.f8315j;
        c0775y.k = this.k;
        c0775y.f8289l = this.f8317m;
        c0775y.f8290m = this.f8318n;
        c0775y.f8291n = this.f8319o;
        c0775y.f8292o = this.f8320p;
        c0775y.f8293p = this.f8321q;
        c0775y.f8294q = this.f8322r;
        c0775y.f8295r = this.f8323s;
        c0775y.f8296s = this.f8324t;
        c0775y.f8297t = this.f8325u;
        c0775y.f8298u = this.f8326v;
        c0775y.f8299v = this.f8327w;
        c0775y.f8300w = this.f8328x;
        c0775y.f8301x = this.f8329y;
        c0775y.f8302y = this.f8330z;
        c0775y.f8303z = this.f8305A;
        return c0775y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        int i5 = Q1.x.f9724a;
        return Objects.equals(this.f8306a, zVar.f8306a) && Objects.equals(this.f8307b, zVar.f8307b) && Objects.equals(this.f8308c, zVar.f8308c) && Objects.equals(this.f8309d, zVar.f8309d) && Objects.equals(this.f8310e, zVar.f8310e) && Arrays.equals(this.f8311f, zVar.f8311f) && Objects.equals(this.f8312g, zVar.f8312g) && Objects.equals(this.f8313h, zVar.f8313h) && Objects.equals(this.f8314i, zVar.f8314i) && Objects.equals(this.f8315j, zVar.f8315j) && Objects.equals(this.k, zVar.k) && Objects.equals(this.f8317m, zVar.f8317m) && Objects.equals(this.f8318n, zVar.f8318n) && Objects.equals(this.f8319o, zVar.f8319o) && Objects.equals(this.f8320p, zVar.f8320p) && Objects.equals(this.f8321q, zVar.f8321q) && Objects.equals(this.f8322r, zVar.f8322r) && Objects.equals(this.f8323s, zVar.f8323s) && Objects.equals(this.f8324t, zVar.f8324t) && Objects.equals(this.f8325u, zVar.f8325u) && Objects.equals(this.f8326v, zVar.f8326v) && Objects.equals(this.f8327w, zVar.f8327w) && Objects.equals(this.f8328x, zVar.f8328x) && Objects.equals(this.f8329y, zVar.f8329y) && Objects.equals(this.f8330z, zVar.f8330z) && Objects.equals(this.f8305A, zVar.f8305A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8306a, this.f8307b, this.f8308c, this.f8309d, null, null, this.f8310e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f8311f)), this.f8312g, null, this.f8313h, this.f8314i, this.f8315j, this.k, null, this.f8317m, this.f8318n, this.f8319o, this.f8320p, this.f8321q, this.f8322r, this.f8323s, this.f8324t, this.f8325u, this.f8326v, this.f8327w, this.f8328x, null, this.f8329y, this.f8330z, true, this.f8305A});
    }
}
