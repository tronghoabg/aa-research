package androidx.work.impl.model;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SystemIdInfo {
    private final int generation;
    public final int systemId;
    public final String workSpecId;

    public SystemIdInfo(String str, int i2, int i3) {
        x.f(str, "workSpecId");
        this.workSpecId = str;
        this.generation = i2;
        this.systemId = i3;
    }

    public static /* synthetic */ SystemIdInfo copy$default(SystemIdInfo systemIdInfo, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i4 & 2) != 0) {
            i2 = systemIdInfo.generation;
        }
        if ((i4 & 4) != 0) {
            i3 = systemIdInfo.systemId;
        }
        return systemIdInfo.copy(str, i2, i3);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final int component3() {
        return this.systemId;
    }

    public final SystemIdInfo copy(String str, int i2, int i3) {
        x.f(str, "workSpecId");
        return new SystemIdInfo(str, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return x.n(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public int hashCode() {
        return (((this.workSpecId.hashCode() * 31) + this.generation) * 31) + this.systemId;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ", systemId=" + this.systemId + ")";
    }
}
