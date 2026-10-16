package com.waze.sound;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ks {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getTranslationActual$default(ks ksVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTranslationActual");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        ksVar.getTranslationActual(str, lVar);
    }

    static final String getTranslationActual$lambda$0(ks ksVar, String str) {
        h.g.b.x.d(ksVar, "null cannot be cast to non-null type com.waze.sound.WazeTtsStringsProviderNativeManager");
        return ((WazeTtsStringsProviderNativeManager) ksVar).getTranslationActualNTV(str);
    }

    public void getTranslationActual(String str, h.g.a.l<? super String, h.ab> lVar) {
        h.g.b.x.f(str, "key");
        NativeManager.runNativeTask(new ex(this, str, 9), lVar != null ? new ew(lVar, 19) : null);
    }

    public final void getTranslationActual(String str) {
        h.g.b.x.f(str, "key");
        getTranslationActual$default(this, str, null, 2, null);
    }
}
