package defpackage;

/* loaded from: classes3.dex */
public final class ahva extends ahvb {
    private final ahug value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahva(ahug ahugVar) {
        super(null);
        ahugVar.getClass();
        this.value = ahugVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahva) && affa.f(this.value, ((ahva) obj).value);
    }

    public final int getArrayDimensions() {
        return this.value.getArrayNestedness();
    }

    public final ahnd getClassId() {
        return this.value.getClassId();
    }

    public final ahug getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "NormalClass(value=" + this.value + ')';
    }
}
