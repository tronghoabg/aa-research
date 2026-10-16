package T9;

import Y2.B;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f11816a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return AbstractC1732v.m(this.f11816a, ((b) obj).f11816a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11816a});
    }

    public final String toString() {
        B b5 = new B(this);
        b5.g(this.f11816a, "token");
        return b5.toString();
    }
}
