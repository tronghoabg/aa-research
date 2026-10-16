package androidx.datastore.core;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001¨\u0006\f"}, d2 = {"Landroidx/datastore/core/NativeSharedCounter;", "", "<init>", "()V", "nativeTruncateFile", "", "fd", "nativeCreateSharedCounter", "", "nativeGetCounterValue", "address", "nativeIncrementAndGetCounterValue", "datastore-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i);

    public final native int nativeGetCounterValue(long j);

    public final native int nativeIncrementAndGetCounterValue(long j);

    public final native int nativeTruncateFile(int i);
}
