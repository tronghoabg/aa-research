package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Synchronized_androidKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m13401synchronized(Object obj, h.g.a.a<? extends R> aVar) {
        R rInvoke;
        synchronized (obj) {
            rInvoke = aVar.invoke();
        }
        return rInvoke;
    }
}
