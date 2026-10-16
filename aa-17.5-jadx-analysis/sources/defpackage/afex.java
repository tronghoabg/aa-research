package defpackage;

/* loaded from: classes.dex */
public class afex extends afeq implements afew, afhh {
    private final int arity;

    public afex(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == (i2 & 1));
        this.arity = i;
    }

    @Override // defpackage.afeq
    protected afhd computeReflected() {
        return affw.a.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afex) {
            afex afexVar = (afex) obj;
            return getName().equals(afexVar.getName()) && getSignature().equals(afexVar.getSignature()) && affa.f(getBoundReceiver(), afexVar.getBoundReceiver()) && affa.f(getOwner(), afexVar.getOwner());
        }
        if (obj instanceof afhh) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.afew
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afeq
    public afhh getReflected() {
        return (afhh) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afhh
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.afeq, defpackage.afhd
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        afhd afhdVarCompute = compute();
        if (afhdVarCompute != this) {
            return afhdVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public afex(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public afex(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }
}
