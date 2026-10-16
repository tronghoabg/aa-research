package com.google.d.m.a;

import sun.misc.Unsafe;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class o {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }
}
