package androidx.compose.runtime.tooling;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ObjectLocation {
    public static final int $stable = 0;
    private final Integer dataOffset;
    private final int group;

    public ObjectLocation(int i2, Integer num) {
        this.group = i2;
        this.dataOffset = num;
    }

    public static /* synthetic */ ObjectLocation copy$default(ObjectLocation objectLocation, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = objectLocation.group;
        }
        if ((i3 & 2) != 0) {
            num = objectLocation.dataOffset;
        }
        return objectLocation.copy(i2, num);
    }

    public final int component1() {
        return this.group;
    }

    public final Integer component2() {
        return this.dataOffset;
    }

    public final ObjectLocation copy(int i2, Integer num) {
        return new ObjectLocation(i2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectLocation)) {
            return false;
        }
        ObjectLocation objectLocation = (ObjectLocation) obj;
        return this.group == objectLocation.group && x.n(this.dataOffset, objectLocation.dataOffset);
    }

    public final Integer getDataOffset() {
        return this.dataOffset;
    }

    public final int getGroup() {
        return this.group;
    }

    public int hashCode() {
        Integer num = this.dataOffset;
        return (this.group * 31) + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ObjectLocation(group=" + this.group + ", dataOffset=" + this.dataOffset + ')';
    }
}
