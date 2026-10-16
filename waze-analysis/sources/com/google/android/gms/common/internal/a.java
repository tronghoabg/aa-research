package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4951a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f4952b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f4953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected a(m mVar, int i2, Bundle bundle) {
        super(mVar, true);
        Objects.requireNonNull(mVar);
        this.f4953c = mVar;
        this.f4951a = i2;
        this.f4952b = bundle;
    }

    @Override // com.google.android.gms.common.internal.e
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        int i2 = this.f4951a;
        if (i2 != 0) {
            this.f4953c.i(1, null);
            Bundle bundle = this.f4952b;
            b(new com.google.android.gms.common.d(i2, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (c()) {
                return;
            }
            this.f4953c.i(1, null);
            b(new com.google.android.gms.common.d(8, null));
        }
    }

    protected abstract void b(com.google.android.gms.common.d dVar);

    protected abstract boolean c();
}
