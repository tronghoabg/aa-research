package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class t extends j implements s, h.l.f {
    private final int arity;

    public t(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, 1 == (i3 & 1));
        this.arity = i2;
    }

    @Override // h.g.b.j
    protected h.l.b computeReflected() {
        int i2 = ar.f48106a;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return getName().equals(tVar.getName()) && getSignature().equals(tVar.getSignature()) && x.n(getBoundReceiver(), tVar.getBoundReceiver()) && x.n(getOwner(), tVar.getOwner());
        }
        if (obj instanceof h.l.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // h.g.b.s
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h.g.b.j
    public h.l.f getReflected() {
        return (h.l.f) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // h.l.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // h.l.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // h.l.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // h.l.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // h.g.b.j, h.l.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        h.l.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public t(int i2, Object obj) {
        this(i2, obj, null, null, null, 0);
    }

    public t(int i2) {
        this(i2, NO_RECEIVER, null, null, null, 0);
    }
}
