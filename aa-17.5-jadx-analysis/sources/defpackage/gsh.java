package defpackage;

/* loaded from: classes2.dex */
public final class gsh implements gmw {
    private final gmw a;

    public gsh(gmw gmwVar) {
        this.a = gmwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsh) && affa.f(this.a, ((gsh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MinimizedStateTemplateWrapperInternalModel(innerTemplateInternalModel=" + this.a + ")";
    }
}
