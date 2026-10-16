package N1;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0763l f8035a;

    static {
        new SparseBooleanArray();
        Q1.k.g(!false);
        Q1.x.E(0);
    }

    public G(C0763l c0763l) {
        this.f8035a = c0763l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return this.f8035a.equals(((G) obj).f8035a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8035a.hashCode();
    }
}
