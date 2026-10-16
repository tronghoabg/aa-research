package defpackage;

/* loaded from: classes2.dex */
public final class ncf extends mjv {
    public final moe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncf(moe moeVar) {
        super(null);
        moeVar.getClass();
        this.a = moeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncf) && affa.f(this.a, ((ncf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TemplateClientSuggestion(templateSuggestion=" + this.a + ")";
    }
}
