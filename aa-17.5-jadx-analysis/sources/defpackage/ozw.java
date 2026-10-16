package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ozw extends ebj implements ozx {
    public final yze a;

    public ozw(yze yzeVar) {
        this.a = yzeVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ozw) && Objects.equals(this.a, ((ozw) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return String.format("FailedUserDecision(%s)", this.a.name());
    }
}
