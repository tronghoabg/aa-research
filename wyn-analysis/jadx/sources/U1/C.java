package U1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final long f11907a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11908b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11909c;

    public C(B b5) {
        this.f11907a = b5.f11904a;
        this.f11908b = b5.f11905b;
        this.f11909c = b5.f11906c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f11907a == c10.f11907a && this.f11908b == c10.f11908b && this.f11909c == c10.f11909c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11907a), Float.valueOf(this.f11908b), Long.valueOf(this.f11909c)});
    }
}
