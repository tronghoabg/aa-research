package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class whb {
    public final abow a;
    private final abnj b;

    public whb(abow abowVar, abnj abnjVar) {
        if (abowVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = abowVar;
        if (abnjVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = abnjVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [abow, java.lang.Object] */
    public final abow a(InputStream inputStream) throws IOException {
        return this.a.M().i(inputStream, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof whb) {
            whb whbVar = (whb) obj;
            if (this.a.equals(whbVar.a) && this.b.equals(whbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        abnj abnjVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + abnjVar.toString() + "}";
    }

    public whb() {
        throw null;
    }
}
