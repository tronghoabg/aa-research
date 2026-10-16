package kotlinx.coroutines;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bc extends bd {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f51748a;

    public bc(long j2, Runnable runnable) {
        super(j2);
        this.f51748a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51748a.run();
    }

    @Override // kotlinx.coroutines.bd
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.f51748a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
