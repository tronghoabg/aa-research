package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xtr extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        wer.h(Thread.currentThread());
        nrd nrdVar = new nrd((byte[]) null);
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = xts.b;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, nrdVar);
        }
        return nrdVar;
    }
}
