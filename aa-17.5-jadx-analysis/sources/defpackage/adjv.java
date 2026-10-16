package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class adjv {
    public static final adir a = new adir("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public static final adir b = new adir("io.grpc.EquivalentAddressGroup.LOCALITY");
    static final adir c = new adir("io.grpc.EquivalentAddressGroup.BACKEND_SERVICE");
    static final adir d = new adir("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");
    public final List e;
    public final adis f;
    private final int g;

    public adjv(List list, adis adisVar) {
        woy.O(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.e = listUnmodifiableList;
        adisVar.getClass();
        this.f = adisVar;
        this.g = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adjv)) {
            return false;
        }
        adjv adjvVar = (adjv) obj;
        List list = this.e;
        int size = list.size();
        List list2 = adjvVar.e;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.f.equals(adjvVar.f);
    }

    public final int hashCode() {
        return this.g;
    }

    public final String toString() {
        adis adisVar = this.f;
        return "[" + String.valueOf(this.e) + "/" + adisVar.toString() + "]";
    }

    public adjv(SocketAddress socketAddress, adis adisVar) {
        this(Collections.singletonList(socketAddress), adisVar);
    }

    public adjv(SocketAddress socketAddress) {
        this(socketAddress, adis.a);
    }
}
