package s5;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class n extends x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f45026a;

    public n(ArrayList arrayList) {
        this.f45026a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return this.f45026a.equals(((n) ((x) obj)).f45026a);
    }

    public final int hashCode() {
        return this.f45026a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f45026a + "}";
    }
}
