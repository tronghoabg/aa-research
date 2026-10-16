package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TrackDescriptor {
    private String name;
    private long parentUuid;
    private int pid;
    private long tid;
    private int type;
    private long uuid;

    public TrackDescriptor(String str, long j2, long j3, int i2, int i3, long j4) {
        this.name = str;
        this.uuid = j2;
        this.parentUuid = j3;
        this.type = i2;
        this.pid = i3;
        this.tid = j4;
    }

    public final String getName() {
        return this.name;
    }

    public final long getParentUuid() {
        return this.parentUuid;
    }

    public final int getPid() {
        return this.pid;
    }

    public final long getTid() {
        return this.tid;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUuid() {
        return this.uuid;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setParentUuid(long j2) {
        this.parentUuid = j2;
    }

    public final void setPid(int i2) {
        this.pid = i2;
    }

    public final void setTid(long j2) {
        this.tid = j2;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public final void setUuid(long j2) {
        this.uuid = j2;
    }
}
