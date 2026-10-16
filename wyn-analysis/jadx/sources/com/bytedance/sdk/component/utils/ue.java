package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ue extends Handler {
    protected WeakReference<uef> uef;

    public interface uef {
        void uef(Message message);
    }

    public ue(uef uefVar) {
        if (uefVar != null) {
            this.uef = new WeakReference<>(uefVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        uef uefVar;
        WeakReference<uef> weakReference = this.uef;
        if (weakReference == null || (uefVar = weakReference.get()) == null || message == null) {
            return;
        }
        uefVar.uef(message);
    }

    public ue(Looper looper, uef uefVar) {
        super(looper);
        if (uefVar != null) {
            this.uef = new WeakReference<>(uefVar);
        }
    }
}
