package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class xxk implements Serializable, xxj {
    private static final long serialVersionUID = 0;
    private final Object a;

    public xxk(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xxj
    public final boolean a(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.xxj
    public final boolean equals(Object obj) {
        if (obj instanceof xxk) {
            return this.a.equals(((xxk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + this.a.toString() + ")";
    }
}
