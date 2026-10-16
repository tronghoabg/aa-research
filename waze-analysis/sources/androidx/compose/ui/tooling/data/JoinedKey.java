package androidx.compose.ui.tooling.data;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class JoinedKey {
    public static final int $stable = 8;
    private final Object left;
    private final Object right;

    public JoinedKey(Object obj, Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i2 & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.copy(obj, obj2);
    }

    public final Object component1() {
        return this.left;
    }

    public final Object component2() {
        return this.right;
    }

    public final JoinedKey copy(Object obj, Object obj2) {
        return new JoinedKey(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        return x.n(this.left, joinedKey.left) && x.n(this.right, joinedKey.right);
    }

    public final Object getLeft() {
        return this.left;
    }

    public final Object getRight() {
        return this.right;
    }

    public int hashCode() {
        Object obj = this.left;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.right;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }
}
