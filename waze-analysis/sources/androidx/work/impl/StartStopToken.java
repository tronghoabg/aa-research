package androidx.work.impl;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.impl.model.WorkGenerationalId;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class StartStopToken {
    private final WorkGenerationalId id;

    public StartStopToken(WorkGenerationalId workGenerationalId) {
        x.f(workGenerationalId, TtmlNode.ATTR_ID);
        this.id = workGenerationalId;
    }

    public final WorkGenerationalId getId() {
        return this.id;
    }
}
