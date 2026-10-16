package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ncg {
    public final String a;
    public final List b;

    public ncg(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncg)) {
            return false;
        }
        ncg ncgVar = (ncg) obj;
        return affa.f(this.a, ncgVar.a) && affa.f(this.b, ncgVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NavigationSuggestionsCollection(sourcePackageName=" + this.a + ", suggestions=" + this.b + ")";
    }
}
