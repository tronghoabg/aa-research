package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a3;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class a0 extends a3 implements a1 {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f32472b;

    public a0(HandlerThread handlerThread, a3.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f32472b = handlerThread;
    }

    public void a(a3.a aVar) {
        this.f32475a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f32472b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
