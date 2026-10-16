package com.google.b.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        com.google.android.libraries.d.a.a.c();
        w wVar = new w();
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (j.f7096d) {
            j.f7096d.put(threadCurrentThread, wVar);
        }
        return wVar;
    }
}
