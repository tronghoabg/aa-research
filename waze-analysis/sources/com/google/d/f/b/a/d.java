package com.google.d.f.b.a;

import com.google.d.f.b.ad;
import com.google.d.f.r;
import dalvik.system.VMStack;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class d extends ad {
    d() {
    }

    @Override // com.google.d.f.b.ad
    public r a(Class<?> cls, int i2) {
        return r.f7872a;
    }

    @Override // com.google.d.f.b.ad
    public String b(Class<? extends com.google.d.f.a<?>> cls) {
        StackTraceElement stackTraceElementA;
        if (f.f7698a) {
            try {
                if (cls.equals(f.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        if (!f.f7699b || (stackTraceElementA = com.google.d.f.f.a.a(cls)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }
}
