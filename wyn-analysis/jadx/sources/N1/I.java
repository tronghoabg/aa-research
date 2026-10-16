package N1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8036a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8037b;

    /* renamed from: c, reason: collision with root package name */
    public final C0773w f8038c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8039d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8040e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8041f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8042g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8043h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8044i;

    static {
        N0.a.k(0, 1, 2, 3, 4);
        Q1.x.E(5);
        Q1.x.E(6);
    }

    public I(Object obj, int i5, C0773w c0773w, Object obj2, int i10, long j8, long j10, int i11, int i12) {
        this.f8036a = obj;
        this.f8037b = i5;
        this.f8038c = c0773w;
        this.f8039d = obj2;
        this.f8040e = i10;
        this.f8041f = j8;
        this.f8042g = j10;
        this.f8043h = i11;
        this.f8044i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I.class == obj.getClass()) {
            I i5 = (I) obj;
            if (this.f8037b == i5.f8037b && this.f8040e == i5.f8040e && this.f8041f == i5.f8041f && this.f8042g == i5.f8042g && this.f8043h == i5.f8043h && this.f8044i == i5.f8044i && Fe.b.v(this.f8038c, i5.f8038c) && Fe.b.v(this.f8036a, i5.f8036a) && Fe.b.v(this.f8039d, i5.f8039d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8036a, Integer.valueOf(this.f8037b), this.f8038c, this.f8039d, Integer.valueOf(this.f8040e), Long.valueOf(this.f8041f), Long.valueOf(this.f8042g), Integer.valueOf(this.f8043h), Integer.valueOf(this.f8044i)});
    }
}
