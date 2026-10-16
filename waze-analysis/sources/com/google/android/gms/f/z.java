package com.google.android.gms.f;

import android.os.Looper;
import android.os.Message;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class z extends com.waze.native_managers.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa f5264a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(aa aaVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(aaVar);
        this.f5264a = aaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        aa.f(this.f5264a, message);
    }
}
