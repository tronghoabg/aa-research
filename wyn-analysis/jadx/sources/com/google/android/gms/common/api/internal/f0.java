package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes3.dex */
public final class f0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26523a;

    public /* synthetic */ f0(int i5) {
        this.f26523a = i5;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f26523a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return 0L;
            case 2:
                Choreographer choreographer = Choreographer.getInstance();
                AbstractC3340k.d(choreographer, "getInstance()");
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                Handler handlerV = xg.g.v(looperMyLooper);
                AbstractC3340k.d(handlerV, "createAsync(\n           …d\")\n                    )");
                u0.B b5 = new u0.B(choreographer, handlerV);
                return b5.plus(b5.k);
            default:
                return new Random();
        }
    }
}
