package defpackage;

/* loaded from: classes3.dex */
public final class ahuz extends ahvb {
    private final aigl type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahuz(aigl aiglVar) {
        super(null);
        aiglVar.getClass();
        this.type = aiglVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahuz) && affa.f(this.type, ((ahuz) obj).type);
    }

    public final aigl getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "LocalClass(type=" + this.type + ')';
    }
}
