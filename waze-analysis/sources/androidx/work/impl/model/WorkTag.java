package androidx.work.impl.model;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkTag {
    private final String tag;
    private final String workSpecId;

    public WorkTag(String str, String str2) {
        x.f(str, "tag");
        x.f(str2, "workSpecId");
        this.tag = str;
        this.workSpecId = str2;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
