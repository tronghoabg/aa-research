package v9;

import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import md.k0;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class y extends AbstractC3935e {

    /* renamed from: c, reason: collision with root package name */
    public final z f47130c;

    /* renamed from: d, reason: collision with root package name */
    public final Internal.IntList f47131d;

    /* renamed from: e, reason: collision with root package name */
    public final ByteString f47132e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f47133f;

    public y(z zVar, Internal.IntList intList, ByteString byteString, k0 k0Var) {
        A6.c.z(k0Var == null || zVar == z.f47136c, "Got cause for a target change that was not a removal", new Object[0]);
        this.f47130c = zVar;
        this.f47131d = intList;
        this.f47132e = byteString;
        if (k0Var == null || k0Var.f()) {
            this.f47133f = null;
        } else {
            this.f47133f = k0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f47130c != yVar.f47130c || !this.f47131d.equals(yVar.f47131d) || !this.f47132e.equals(yVar.f47132e)) {
            return false;
        }
        k0 k0Var = yVar.f47133f;
        k0 k0Var2 = this.f47133f;
        return k0Var2 != null ? k0Var != null && k0Var2.f40685a.equals(k0Var.f40685a) : k0Var == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f47132e.hashCode() + ((this.f47131d.hashCode() + (this.f47130c.hashCode() * 31)) * 31)) * 31;
        k0 k0Var = this.f47133f;
        return iHashCode + (k0Var != null ? k0Var.f40685a.hashCode() : 0);
    }

    public final String toString() {
        return "WatchTargetChange{changeType=" + this.f47130c + ", targetIds=" + this.f47131d + '}';
    }
}
