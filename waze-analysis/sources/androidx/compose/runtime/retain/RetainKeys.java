package androidx.compose.runtime.retain;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RetainKeys {
    private final Object[] keys;
    private final long positionalKey;
    private final int typeHash;

    public RetainKeys(Object[] objArr, long j2, int i2) {
        this.keys = objArr;
        this.positionalKey = j2;
        this.typeHash = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RetainKeys)) {
            return false;
        }
        RetainKeys retainKeys = (RetainKeys) obj;
        return retainKeys.positionalKey == this.positionalKey && retainKeys.typeHash == this.typeHash && Arrays.equals(retainKeys.keys, this.keys);
    }

    public final long getPositionalKey() {
        return this.positionalKey;
    }

    public final int getTypeHash() {
        return this.typeHash;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        return ((((objArr != null ? Arrays.hashCode(objArr) : 0) * 31) + RetainKeys$$ExternalSyntheticBackport0.m(this.positionalKey)) * 31) + this.typeHash;
    }
}
