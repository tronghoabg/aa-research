package com.bytedance.adsdk.ugeno.xs;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class cz extends Handler {
    private final WeakReference<uef> uef;

    public interface uef {
        void uef(Message message);
    }

    public cz(Looper looper, uef uefVar) {
        super(looper);
        this.uef = new WeakReference<>(uefVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        uef uefVar = this.uef.get();
        if (uefVar == null || message == null) {
            return;
        }
        uefVar.uef(message);
    }
}
