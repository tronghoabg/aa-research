package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gow implements hju {
    public final List a;
    public final int b;

    public gow(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gow)) {
            return false;
        }
        gow gowVar = (gow) obj;
        return affa.f(this.a, gowVar.a) && this.b == gowVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "MapActionStripUiModel(actions=" + this.a + ", orientation=" + ((Object) gvq.e(this.b)) + ")";
    }
}
