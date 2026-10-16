package defpackage;

/* loaded from: classes2.dex */
public final class aiui extends Exception {
    public final Throwable a;

    public aiui(Throwable th, aitu aituVar, afco afcoVar) {
        super(a.bt(afcoVar, aituVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
