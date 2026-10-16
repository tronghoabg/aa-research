package androidx.constraintlayout.compose;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintSetRef {
    public static final int $stable = 0;
    private final String name;

    public ConstraintSetRef(String str) {
        this.name = str;
    }

    public static /* synthetic */ ConstraintSetRef copy$default(ConstraintSetRef constraintSetRef, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = constraintSetRef.name;
        }
        return constraintSetRef.copy(str);
    }

    public final String component1$constraintlayout_compose() {
        return this.name;
    }

    public final ConstraintSetRef copy(String str) {
        return new ConstraintSetRef(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConstraintSetRef) && x.n(this.name, ((ConstraintSetRef) obj).name);
    }

    public final String getName$constraintlayout_compose() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "ConstraintSetRef(name=" + this.name + ')';
    }
}
