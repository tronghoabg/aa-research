package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zau;

/* loaded from: classes3.dex */
public final class G implements InterfaceC1689c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1695i f26453a;

    public G(C1695i c1695i) {
        this.f26453a = c1695i;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1689c
    public final void a(boolean z2) {
        zau zauVar = this.f26453a.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z2)));
    }
}
