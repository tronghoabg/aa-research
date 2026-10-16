package androidx.work;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface Tracer {
    void beginAsyncSection(String str, int i2);

    void beginSection(String str);

    void endAsyncSection(String str, int i2);

    void endSection();

    boolean isEnabled();
}
