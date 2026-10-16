package md;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: md.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3552u {

    /* renamed from: d, reason: collision with root package name */
    public static final C3533a f40727d = new C3533a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    public final List f40728a;

    /* renamed from: b, reason: collision with root package name */
    public final C3534b f40729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40730c;

    public C3552u(SocketAddress socketAddress) {
        C3534b c3534b = C3534b.f40612b;
        List listSingletonList = Collections.singletonList(socketAddress);
        Fe.e.p("addrs is empty", !listSingletonList.isEmpty());
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(listSingletonList));
        this.f40728a = listUnmodifiableList;
        Fe.e.t(c3534b, "attrs");
        this.f40729b = c3534b;
        this.f40730c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3552u)) {
            return false;
        }
        C3552u c3552u = (C3552u) obj;
        List list = this.f40728a;
        if (list.size() != c3552u.f40728a.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!((SocketAddress) list.get(i5)).equals(c3552u.f40728a.get(i5))) {
                return false;
            }
        }
        return this.f40729b.equals(c3552u.f40729b);
    }

    public final int hashCode() {
        return this.f40730c;
    }

    public final String toString() {
        return "[" + this.f40728a + "/" + this.f40729b + "]";
    }
}
