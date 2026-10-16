package F5;

import E5.J0;
import f6.C2613z;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3873a;

    /* renamed from: b, reason: collision with root package name */
    public final J0 f3874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3875c;

    /* renamed from: d, reason: collision with root package name */
    public final C2613z f3876d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3877e;

    /* renamed from: f, reason: collision with root package name */
    public final J0 f3878f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3879g;

    /* renamed from: h, reason: collision with root package name */
    public final C2613z f3880h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3881i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3882j;

    public a(long j8, J0 j02, int i5, C2613z c2613z, long j10, J0 j03, int i10, C2613z c2613z2, long j11, long j12) {
        this.f3873a = j8;
        this.f3874b = j02;
        this.f3875c = i5;
        this.f3876d = c2613z;
        this.f3877e = j10;
        this.f3878f = j03;
        this.f3879g = i10;
        this.f3880h = c2613z2;
        this.f3881i = j11;
        this.f3882j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f3873a == aVar.f3873a && this.f3875c == aVar.f3875c && this.f3877e == aVar.f3877e && this.f3879g == aVar.f3879g && this.f3881i == aVar.f3881i && this.f3882j == aVar.f3882j && Fe.b.v(this.f3874b, aVar.f3874b) && Fe.b.v(this.f3876d, aVar.f3876d) && Fe.b.v(this.f3878f, aVar.f3878f) && Fe.b.v(this.f3880h, aVar.f3880h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3873a), this.f3874b, Integer.valueOf(this.f3875c), this.f3876d, Long.valueOf(this.f3877e), this.f3878f, Integer.valueOf(this.f3879g), this.f3880h, Long.valueOf(this.f3881i), Long.valueOf(this.f3882j)});
    }
}
