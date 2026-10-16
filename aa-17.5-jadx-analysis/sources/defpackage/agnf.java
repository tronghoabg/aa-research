package defpackage;

/* loaded from: classes3.dex */
public final class agnf extends agnp {
    private final String className;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnf(String str) {
        super(null);
        str.getClass();
        this.className = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnf) && affa.f(this.className, ((agnf) obj).className);
    }

    public final String getClassName() {
        return this.className;
    }

    public int hashCode() {
        return this.className.hashCode();
    }

    @Override // defpackage.agnp
    public String toString() {
        return "KClassValue(" + this.className + ')';
    }
}
