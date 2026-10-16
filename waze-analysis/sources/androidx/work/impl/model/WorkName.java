package androidx.work.impl.model;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkName {
    private final String name;
    private final String workSpecId;

    public WorkName(String str, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(str2, "workSpecId");
        this.name = str;
        this.workSpecId = str2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
