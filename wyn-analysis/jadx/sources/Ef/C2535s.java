package ef;

import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;

/* renamed from: ef.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2535s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final byte f34684a;

    public /* synthetic */ C2535s(byte b5) {
        this.f34684a = b5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC3340k.g(this.f34684a & ForkServer.ERROR, ((C2535s) obj).f34684a & ForkServer.ERROR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2535s) {
            return this.f34684a == ((C2535s) obj).f34684a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34684a;
    }

    public final String toString() {
        return String.valueOf(this.f34684a & ForkServer.ERROR);
    }
}
