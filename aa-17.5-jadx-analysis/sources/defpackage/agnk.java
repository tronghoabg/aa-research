package defpackage;

/* loaded from: classes3.dex */
public final class agnk extends agng {
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnk(String str) {
        super(null);
        str.getClass();
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnk) && affa.f(this.value, ((agnk) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // defpackage.agng
    public String getValue() {
        return this.value;
    }
}
