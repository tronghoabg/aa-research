package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
final class hgs {
    public final Map a;

    public hgs(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgs) && affa.f(this.a, ((hgs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiState(contentUiState=" + this.a + ")";
    }
}
