package m9;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public Executor f40439a;

    /* renamed from: b, reason: collision with root package name */
    public Vc.c f40440b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        return this.f40440b.equals(((M) obj).f40440b);
    }

    public final int hashCode() {
        return this.f40440b.hashCode();
    }
}
