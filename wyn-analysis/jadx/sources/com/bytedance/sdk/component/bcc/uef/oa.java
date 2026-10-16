package com.bytedance.sdk.component.bcc.uef;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class oa extends ue implements yo {

    /* renamed from: oa, reason: collision with root package name */
    private final HandlerThread f24967oa;

    public oa(HandlerThread handlerThread, ue.uef uefVar) {
        super(handlerThread.getLooper(), uefVar);
        this.f24967oa = handlerThread;
    }

    public void oa() {
        HandlerThread handlerThread = this.f24967oa;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.bcc.uef.yo
    public void uef() {
        removeCallbacksAndMessages(null);
        WeakReference<ue.uef> weakReference = this.uef;
        if (weakReference != null) {
            weakReference.clear();
            this.uef = null;
        }
    }

    public void uef(ue.uef uefVar) {
        this.uef = new WeakReference<>(uefVar);
    }
}
