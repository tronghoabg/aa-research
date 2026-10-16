package androidx.media3.datasource;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface DataSink {

    /* compiled from: WazeSource */
    public interface Factory {
        DataSink createDataSink();
    }

    void close();

    void open(DataSpec dataSpec);

    void write(byte[] bArr, int i2, int i3);
}
