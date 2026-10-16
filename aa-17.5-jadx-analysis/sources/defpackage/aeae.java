package defpackage;

import java.net.URI;

/* loaded from: classes3.dex */
public final class aeae implements aeaf {
    private final URI a;

    public aeae(URI uri) {
        uri.getClass();
        this.a = uri;
    }

    @Override // defpackage.aeaf
    public final admr a(admo admoVar, admm admmVar) {
        return admoVar.b(this.a, admmVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeae) {
            return this.a.equals(((aeae) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
