package androidx.media3.datasource;

import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseDataSource implements DataSource {
    private DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<TransferListener> listeners = new ArrayList<>(1);

    protected BaseDataSource(boolean z) {
        this.isNetwork = z;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        an.B(transferListener);
        if (this.listeners.contains(transferListener)) {
            return;
        }
        this.listeners.add(transferListener);
        this.listenerCount++;
    }

    protected final void bytesTransferred(int i2) {
        DataSpec dataSpec = this.dataSpec;
        int i3 = Util.SDK_INT;
        for (int i4 = 0; i4 < this.listenerCount; i4++) {
            this.listeners.get(i4).onBytesTransferred(this, dataSpec, this.isNetwork, i2);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    protected final void transferEnded() {
        DataSpec dataSpec = this.dataSpec;
        int i2 = Util.SDK_INT;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }

    protected final void transferInitializing(DataSpec dataSpec) {
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    protected final void transferStarted(DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }
}
