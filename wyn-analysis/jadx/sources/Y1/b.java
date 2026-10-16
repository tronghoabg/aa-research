package Y1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f16306a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16308c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16309d;

    public b(String str, String str2, int i5, int i10) {
        this.f16306a = str;
        this.f16307b = str2;
        this.f16308c = i5;
        this.f16309d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16308c == bVar.f16308c && this.f16309d == bVar.f16309d && Fe.b.v(this.f16306a, bVar.f16306a) && Fe.b.v(this.f16307b, bVar.f16307b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16306a, this.f16307b, Integer.valueOf(this.f16308c), Integer.valueOf(this.f16309d)});
    }
}
