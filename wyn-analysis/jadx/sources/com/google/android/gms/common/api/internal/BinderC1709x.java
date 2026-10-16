package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC1709x extends AbstractBinderC1696j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1692f f26559a;

    public BinderC1709x(InterfaceC1692f interfaceC1692f) {
        this.f26559a = interfaceC1692f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1697k
    public final void onResult(Status status) {
        this.f26559a.setResult(status);
    }
}
