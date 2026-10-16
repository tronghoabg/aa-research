package androidx.work.impl;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class SynchronizedStartStopTokensImpl implements StartStopTokens {
    private final StartStopTokens delegate;
    private final Object lock;

    public SynchronizedStartStopTokensImpl(StartStopTokens startStopTokens) {
        x.f(startStopTokens, "delegate");
        this.delegate = startStopTokens;
        this.lock = new Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(WorkGenerationalId workGenerationalId) {
        boolean zContains;
        x.f(workGenerationalId, TtmlNode.ATTR_ID);
        synchronized (this.lock) {
            zContains = this.delegate.contains(workGenerationalId);
        }
        return zContains;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken remove(WorkGenerationalId workGenerationalId) {
        StartStopToken startStopTokenRemove;
        x.f(workGenerationalId, TtmlNode.ATTR_ID);
        synchronized (this.lock) {
            startStopTokenRemove = this.delegate.remove(workGenerationalId);
        }
        return startStopTokenRemove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken tokenFor(WorkGenerationalId workGenerationalId) {
        StartStopToken startStopToken;
        x.f(workGenerationalId, TtmlNode.ATTR_ID);
        synchronized (this.lock) {
            startStopToken = this.delegate.tokenFor(workGenerationalId);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public /* synthetic */ StartStopToken remove(WorkSpec workSpec) {
        return StartStopTokens.CC.$default$remove(this, workSpec);
    }

    @Override // androidx.work.impl.StartStopTokens
    public /* synthetic */ StartStopToken tokenFor(WorkSpec workSpec) {
        return StartStopTokens.CC.$default$tokenFor(this, workSpec);
    }

    @Override // androidx.work.impl.StartStopTokens
    public List<StartStopToken> remove(String str) {
        List<StartStopToken> listRemove;
        x.f(str, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(str);
        }
        return listRemove;
    }
}
