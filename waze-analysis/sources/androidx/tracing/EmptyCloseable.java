package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyCloseable implements AutoCloseable {
    public static final EmptyCloseable INSTANCE = new EmptyCloseable();

    private EmptyCloseable() {
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
