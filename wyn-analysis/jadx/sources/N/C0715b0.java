package N;

import ef.C2532p;
import java.util.ArrayList;
import x.C4420m;

/* renamed from: N.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7747b;

    /* renamed from: c, reason: collision with root package name */
    public int f7748c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7749d;

    /* renamed from: e, reason: collision with root package name */
    public final C4420m f7750e;

    /* renamed from: f, reason: collision with root package name */
    public final C2532p f7751f;

    public C0715b0(ArrayList arrayList, int i5) {
        this.f7746a = arrayList;
        this.f7747b = i5;
        if (!(i5 >= 0)) {
            C0718d.O("Invalid start index");
            throw null;
        }
        this.f7749d = new ArrayList();
        C4420m c4420m = new C4420m();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            L l10 = (L) this.f7746a.get(i11);
            int i12 = l10.f7719c;
            int i13 = l10.f7720d;
            c4420m.d(i12, new F(i11, i10, i13));
            i10 += i13;
        }
        this.f7750e = c4420m;
        this.f7751f = Fe.c.z(new A0.p(this, 11));
    }

    public final boolean a(int i5, int i10) {
        int i11;
        C4420m c4420m = this.f7750e;
        F f10 = (F) c4420m.b(i5);
        if (f10 == null) {
            return false;
        }
        int i12 = f10.f7683b;
        int i13 = i10 - f10.f7684c;
        f10.f7684c = i10;
        if (i13 == 0) {
            return true;
        }
        Object[] objArr = c4420m.f47524c;
        long[] jArr = c4420m.f47522a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        F f11 = (F) objArr[(i14 << 3) + i16];
                        if (f11.f7683b >= i12 && !f11.equals(f10) && (i11 = f11.f7683b + i13) >= 0) {
                            f11.f7683b = i11;
                        }
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }
}
