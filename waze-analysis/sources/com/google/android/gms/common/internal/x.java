package com.google.android.gms.common.internal;

import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f5103a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.ao f5104b;

    x(Intent intent, com.google.android.gms.common.api.internal.ao aoVar) {
        this.f5103a = intent;
        this.f5104b = aoVar;
    }

    @Override // com.google.android.gms.common.internal.y
    public final void a() {
        Intent intent = this.f5103a;
        if (intent != null) {
            this.f5104b.startActivityForResult(intent, 2);
        }
    }
}
