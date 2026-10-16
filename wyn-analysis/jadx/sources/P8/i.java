package p8;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, m mVar, long j8, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(mVar, j8, obj, obj2)) {
            if (unsafe.getObject(mVar, j8) != obj) {
                return false;
            }
        }
        return true;
    }
}
