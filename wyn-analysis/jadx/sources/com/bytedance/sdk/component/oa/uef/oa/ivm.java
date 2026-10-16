package com.bytedance.sdk.component.oa.uef.oa;

/* loaded from: classes.dex */
final class ivm {

    /* renamed from: oa, reason: collision with root package name */
    static long f25061oa;
    static lw uef;

    private ivm() {
    }

    public static lw uef() {
        synchronized (ivm.class) {
            lw lwVar = uef;
            if (lwVar == null) {
                return new lw();
            }
            uef = lwVar.ivm;
            lwVar.ivm = null;
            f25061oa -= 8192;
            return lwVar;
        }
    }

    public static void uef(lw lwVar) {
        if (lwVar.ivm == null && lwVar.xs == null) {
            if (lwVar.moa) {
                return;
            }
            synchronized (ivm.class) {
                try {
                    long j8 = f25061oa;
                    if (j8 + 8192 > 65536) {
                        return;
                    }
                    f25061oa = j8 + 8192;
                    lwVar.ivm = uef;
                    lwVar.yo = 0;
                    lwVar.f25062oa = 0;
                    uef = lwVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
