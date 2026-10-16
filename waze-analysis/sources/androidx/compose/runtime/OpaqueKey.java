package androidx.compose.runtime;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OpaqueKey {
    public static final int $stable = 0;
    private final String key;

    public OpaqueKey(String str) {
        this.key = str;
    }

    public static /* synthetic */ OpaqueKey copy$default(OpaqueKey opaqueKey, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = opaqueKey.key;
        }
        return opaqueKey.copy(str);
    }

    public final String component1() {
        return this.key;
    }

    public final OpaqueKey copy(String str) {
        return new OpaqueKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && x.n(this.key, ((OpaqueKey) obj).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }
}
