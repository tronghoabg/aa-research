package defpackage;

/* loaded from: classes2.dex */
public final class gie implements hem {
    public final ajab a;

    public gie(ajab ajabVar) {
        this.a = ajabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gie) && affa.f(this.a, ((gie) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserEngagementStateHolder(isUserEngagedFlow=" + this.a + ")";
    }

    public gie() {
        throw null;
    }
}
