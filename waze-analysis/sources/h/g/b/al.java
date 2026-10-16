package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class al extends j implements h.l.r {
    private final boolean syntheticJavaProperty;

    public al(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == (i2 & 1));
        this.syntheticJavaProperty = (i2 & 2) == 2;
    }

    @Override // h.g.b.j
    public h.l.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof al) {
            al alVar = (al) obj;
            return getOwner().equals(alVar.getOwner()) && getName().equals(alVar.getName()) && getSignature().equals(alVar.getSignature()) && x.n(getBoundReceiver(), alVar.getBoundReceiver());
        }
        if (obj instanceof h.l.r) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h.g.b.j
    public h.l.r getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (h.l.r) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // h.l.r
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // h.l.r
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        h.l.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public al(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public al() {
        this.syntheticJavaProperty = false;
    }
}
