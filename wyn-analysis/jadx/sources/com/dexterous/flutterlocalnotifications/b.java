package com.dexterous.flutterlocalnotifications;

import java.io.Serializable;
import java.util.HashMap;
import kb.InterfaceC3287c;
import uc.InterfaceC4280q;

/* loaded from: classes3.dex */
public final class b implements i, InterfaceC3287c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4280q f26219a;

    @Override // com.dexterous.flutterlocalnotifications.i
    public void B(boolean z2) {
        this.f26219a.a(Boolean.valueOf(z2));
    }

    @Override // kb.InterfaceC3287c
    public void a(HashMap map, String str) {
        this.f26219a.b("sqlite_error", str, map);
    }

    @Override // kb.InterfaceC3287c
    public void b(Serializable serializable) {
        this.f26219a.a(serializable);
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void s() {
        this.f26219a.b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }
}
