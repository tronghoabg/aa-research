package androidx.work;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SystemClock implements Clock {
    @Override // androidx.work.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
