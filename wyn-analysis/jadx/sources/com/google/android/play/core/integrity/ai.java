package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class ai extends i8.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f27145a;

    /* renamed from: b, reason: collision with root package name */
    private final i8.y f27146b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f27147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f27145a = ajVar;
        this.f27146b = new i8.y("OnRequestIntegrityTokenCallback");
        this.f27147c = taskCompletionSource;
    }

    @Override // i8.v
    public final void b(Bundle bundle) {
        this.f27145a.f27148a.d(this.f27147c);
        this.f27146b.b("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f27145a.f27152e.a(bundle);
        if (jVarA != null) {
            this.f27147c.trySetException(jVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f27147c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f27145a.f27150c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f27147c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
