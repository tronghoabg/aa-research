package Ze;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f17086a;

    public e(Throwable th) {
        this.f17086a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        Object obj2 = ((e) obj).f17086a;
        Throwable th = this.f17086a;
        if (th != obj2) {
            return th != null && th.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return this.f17086a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f17086a + "]";
    }
}
