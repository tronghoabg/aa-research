package androidx.media3.common.util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface TimestampIterator {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.common.util.TimestampIterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    TimestampIterator copyOf();

    long getLastTimestampUs();

    boolean hasNext();

    long next();
}
