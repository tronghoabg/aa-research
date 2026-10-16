package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeet {
    final java.util.Collection a;
    final int b;

    public aeet(defpackage.adkw adkwVar) {
        adkwVar.getClass();
        if (adkwVar.e.size() < 10) {
            this.a = adkwVar.e;
        } else {
            this.a = new java.util.HashSet(adkwVar.e);
        }
        java.util.Iterator it = adkwVar.e.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((java.net.SocketAddress) it.next()).hashCode();
        }
        this.b = iHashCode;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aeet)) {
            return false;
        }
        defpackage.aeet aeetVar = (defpackage.aeet) obj;
        if (aeetVar.b == this.b) {
            java.util.Collection collection = aeetVar.a;
            int size = collection.size();
            java.util.Collection<?> collection2 = this.a;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
