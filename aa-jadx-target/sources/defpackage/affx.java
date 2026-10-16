package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class affx extends defpackage.affq implements defpackage.affw, defpackage.afih {
    private final int arity;

    public affx(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        super(obj, cls, str, str2, 1 == (i2 & 1));
        this.arity = i;
    }

    @Override // defpackage.affq
    protected defpackage.afid computeReflected() {
        return defpackage.afgw.a.function(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.affx) {
            defpackage.affx affxVar = (defpackage.affx) obj;
            return getName().equals(affxVar.getName()) && getSignature().equals(affxVar.getSignature()) && defpackage.afga.f(getBoundReceiver(), affxVar.getBoundReceiver()) && defpackage.afga.f(getOwner(), affxVar.getOwner());
        }
        if (obj instanceof defpackage.afih) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.affw
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.affq
    public defpackage.afih getReflected() {
        return (defpackage.afih) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afih
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.afih
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.afih
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.afih
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.affq, defpackage.afid
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public java.lang.String toString() {
        defpackage.afid afidVarCompute = compute();
        if (afidVarCompute != this) {
            return afidVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public affx(int i, java.lang.Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public affx(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }
}
