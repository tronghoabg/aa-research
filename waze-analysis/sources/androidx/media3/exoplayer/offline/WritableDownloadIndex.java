package androidx.media3.exoplayer.offline;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download);

    void removeDownload(String str);

    void setDownloadingStatesToQueued();

    void setStatesToRemoving();

    void setStopReason(int i2);

    void setStopReason(String str, int i2);
}
