package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afgp extends defpackage.affq implements defpackage.afja {
    private final boolean syntheticJavaProperty;

    public afgp(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, 1 == (i & 1));
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.affq
    public defpackage.afid compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afgp) {
            defpackage.afgp afgpVar = (defpackage.afgp) obj;
            return getOwner().equals(afgpVar.getOwner()) && getName().equals(afgpVar.getName()) && getSignature().equals(afgpVar.getSignature()) && defpackage.afga.f(getBoundReceiver(), afgpVar.getBoundReceiver());
        }
        if (obj instanceof defpackage.afja) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.affq
    public defpackage.afja getReflected() {
        if (this.syntheticJavaProperty) {
            throw new java.lang.UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (defpackage.afja) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afja
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.afja
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public java.lang.String toString() {
        defpackage.afid afidVarCompute = compute();
        if (afidVarCompute != this) {
            return afidVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public afgp(java.lang.Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public afgp() {
        this.syntheticJavaProperty = false;
    }
}
