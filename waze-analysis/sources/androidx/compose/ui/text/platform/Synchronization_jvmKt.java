package androidx.compose.ui.text.platform;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Synchronization_jvmKt {
    public static final SynchronizedObject makeSynchronizedObject(Object obj) {
        return new SynchronizedObject();
    }

    public static /* synthetic */ SynchronizedObject makeSynchronizedObject$default(Object obj, int i2, Object obj2) {
        return new SynchronizedObject();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m10851synchronized(SynchronizedObject synchronizedObject, a<? extends R> aVar) {
        R rInvoke;
        synchronized (synchronizedObject) {
            rInvoke = aVar.invoke();
        }
        return rInvoke;
    }
}
