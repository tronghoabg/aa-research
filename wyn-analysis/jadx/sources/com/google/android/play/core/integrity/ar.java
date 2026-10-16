package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes4.dex */
final class ar extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f27165a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f27165a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        if (i5 == 1) {
            this.f27165a.f27166a.trySetResult(3);
        } else if (i5 == 2) {
            this.f27165a.f27166a.trySetResult(2);
        } else {
            if (i5 != 3) {
                return;
            }
            this.f27165a.f27166a.trySetResult(1);
        }
    }
}
