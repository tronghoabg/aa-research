package O1;

import Q1.x;
import Va.M6;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f8801e = new b(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f8802a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8803b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8804c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8805d;

    public b(int i5, int i10, int i11) {
        this.f8802a = i5;
        this.f8803b = i10;
        this.f8804c = i11;
        this.f8805d = x.F(i11) ? x.z(i11, i10) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8802a == bVar.f8802a && this.f8803b == bVar.f8803b && this.f8804c == bVar.f8804c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8802a), Integer.valueOf(this.f8803b), Integer.valueOf(this.f8804c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f8802a);
        sb2.append(", channelCount=");
        sb2.append(this.f8803b);
        sb2.append(", encoding=");
        return M6.r(sb2, this.f8804c, ']');
    }
}
