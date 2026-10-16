package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class xxl implements Serializable, xxj {
    private static final long serialVersionUID = 0;
    final xxj a;

    public xxl(xxj xxjVar) {
        this.a = xxjVar;
    }

    @Override // defpackage.xxj
    public final boolean a(Object obj) {
        return !this.a.a(obj);
    }

    @Override // defpackage.xxj
    public final boolean equals(Object obj) {
        if (obj instanceof xxl) {
            return this.a.equals(((xxl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.a.toString() + ")";
    }
}
