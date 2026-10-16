package defpackage;

/* loaded from: classes.dex */
public abstract class affp extends afeq implements afia {
    private final boolean syntheticJavaProperty;

    public affp(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == (i & 1));
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.afeq
    public afhd compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof affp) {
            affp affpVar = (affp) obj;
            return getOwner().equals(affpVar.getOwner()) && getName().equals(affpVar.getName()) && getSignature().equals(affpVar.getSignature()) && affa.f(getBoundReceiver(), affpVar.getBoundReceiver());
        }
        if (obj instanceof afia) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afeq
    public afia getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (afia) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afia
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.afia
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        afhd afhdVarCompute = compute();
        if (afhdVarCompute != this) {
            return afhdVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public affp(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public affp() {
        this.syntheticJavaProperty = false;
    }
}
