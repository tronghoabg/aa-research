package V1;

import N1.N;
import java.util.Arrays;
import k2.H;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12887a;

    /* renamed from: b, reason: collision with root package name */
    public final N f12888b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12889c;

    /* renamed from: d, reason: collision with root package name */
    public final H f12890d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12891e;

    /* renamed from: f, reason: collision with root package name */
    public final N f12892f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12893g;

    /* renamed from: h, reason: collision with root package name */
    public final H f12894h;

    /* renamed from: i, reason: collision with root package name */
    public final long f12895i;

    /* renamed from: j, reason: collision with root package name */
    public final long f12896j;

    public a(long j8, N n10, int i5, H h10, long j10, N n11, int i10, H h11, long j11, long j12) {
        this.f12887a = j8;
        this.f12888b = n10;
        this.f12889c = i5;
        this.f12890d = h10;
        this.f12891e = j10;
        this.f12892f = n11;
        this.f12893g = i10;
        this.f12894h = h11;
        this.f12895i = j11;
        this.f12896j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12887a == aVar.f12887a && this.f12889c == aVar.f12889c && this.f12891e == aVar.f12891e && this.f12893g == aVar.f12893g && this.f12895i == aVar.f12895i && this.f12896j == aVar.f12896j && Fe.b.v(this.f12888b, aVar.f12888b) && Fe.b.v(this.f12890d, aVar.f12890d) && Fe.b.v(this.f12892f, aVar.f12892f) && Fe.b.v(this.f12894h, aVar.f12894h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f12887a), this.f12888b, Integer.valueOf(this.f12889c), this.f12890d, Long.valueOf(this.f12891e), this.f12892f, Integer.valueOf(this.f12893g), this.f12894h, Long.valueOf(this.f12895i), Long.valueOf(this.f12896j)});
    }
}
