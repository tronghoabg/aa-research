package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class abwo implements Serializable, ywg {
    public final int a;

    public abwo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof abwo) && this.a == ((abwo) obj).a;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        return "veType: " + this.a;
    }
}
