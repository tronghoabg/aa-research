package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adkw {
    public static final defpackage.adjr a = new defpackage.adjr("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public static final defpackage.adjr b = new defpackage.adjr("io.grpc.EquivalentAddressGroup.LOCALITY");
    static final defpackage.adjr c = new defpackage.adjr("io.grpc.EquivalentAddressGroup.BACKEND_SERVICE");
    static final defpackage.adjr d = new defpackage.adjr("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");
    public final java.util.List e;
    public final defpackage.adjs f;
    private final int g;

    public adkw(java.util.List list, defpackage.adjs adjsVar) {
        defpackage.ysr.aY(!list.isEmpty(), "addrs is empty");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
        this.e = listUnmodifiableList;
        adjsVar.getClass();
        this.f = adjsVar;
        this.g = listUnmodifiableList.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.adkw)) {
            return false;
        }
        defpackage.adkw adkwVar = (defpackage.adkw) obj;
        java.util.List list = this.e;
        int size = list.size();
        java.util.List list2 = adkwVar.e;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((java.net.SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.f.equals(adkwVar.f);
    }

    public final int hashCode() {
        return this.g;
    }

    public final java.lang.String toString() {
        defpackage.adjs adjsVar = this.f;
        return "[" + java.lang.String.valueOf(this.e) + "/" + adjsVar.toString() + "]";
    }

    public adkw(java.net.SocketAddress socketAddress, defpackage.adjs adjsVar) {
        this(java.util.Collections.singletonList(socketAddress), adjsVar);
    }

    public adkw(java.net.SocketAddress socketAddress) {
        this(socketAddress, defpackage.adjs.a);
    }
}
