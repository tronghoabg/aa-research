package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gtj implements gmo {
    public final List a;

    public gtj(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtj) && affa.f(this.a, ((gtj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TurnCardInfoList(infoList=" + this.a + ")";
    }
}
