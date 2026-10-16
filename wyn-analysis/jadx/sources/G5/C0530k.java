package G5;

import Va.M6;
import java.util.Arrays;

/* renamed from: G5.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0530k {

    /* renamed from: e, reason: collision with root package name */
    public static final C0530k f4421e = new C0530k(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4423b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4424c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4425d;

    public C0530k(int i5, int i10, int i11) {
        this.f4422a = i5;
        this.f4423b = i10;
        this.f4424c = i11;
        this.f4425d = u6.v.w(i11) ? u6.v.p(i11, i10) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0530k)) {
            return false;
        }
        C0530k c0530k = (C0530k) obj;
        return this.f4422a == c0530k.f4422a && this.f4423b == c0530k.f4423b && this.f4424c == c0530k.f4424c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4422a), Integer.valueOf(this.f4423b), Integer.valueOf(this.f4424c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f4422a);
        sb2.append(", channelCount=");
        sb2.append(this.f4423b);
        sb2.append(", encoding=");
        return M6.r(sb2, this.f4424c, ']');
    }
}
