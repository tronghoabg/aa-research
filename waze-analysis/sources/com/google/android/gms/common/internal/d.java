package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends com.waze.native_managers.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f5041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(mVar);
        this.f5041a = mVar;
    }

    private static final void a(Message message) {
        e eVar = (e) message.obj;
        if (eVar != null) {
            eVar.f();
        }
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        m mVar = this.f5041a;
        if (mVar.f5057d.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !mVar.p()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            mVar.w = new com.google.android.gms.common.d(message.arg2);
            if (m.U(mVar) && !mVar.x) {
                mVar.i(3, null);
                return;
            }
            com.google.android.gms.common.d dVar = mVar.w != null ? mVar.w : new com.google.android.gms.common.d(8);
            mVar.f5056c.d(dVar);
            m.aa(dVar);
            return;
        }
        if (message.what == 5) {
            com.google.android.gms.common.d dVar2 = mVar.w != null ? mVar.w : new com.google.android.gms.common.d(8);
            mVar.f5056c.d(dVar2);
            m.aa(dVar2);
            return;
        }
        if (message.what == 3) {
            com.google.android.gms.common.d dVar3 = new com.google.android.gms.common.d(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            mVar.f5056c.d(dVar3);
            m.aa(dVar3);
            return;
        }
        if (message.what == 6) {
            mVar.i(5, null);
            if (mVar.q != null) {
                mVar.q.b(message.arg2);
            }
            int i2 = message.arg2;
            mVar.ab();
            m.T(mVar, 5, 1, null);
            return;
        }
        if (message.what == 2 && !mVar.o()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((e) message.obj).d();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
