package p8;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ boolean a(Unsafe unsafe, m mVar, long j8, c cVar, c cVar2) {
        while (!unsafe.compareAndSwapObject(mVar, j8, cVar, cVar2)) {
            if (unsafe.getObject(mVar, j8) != cVar) {
                return false;
            }
        }
        return true;
    }
}
