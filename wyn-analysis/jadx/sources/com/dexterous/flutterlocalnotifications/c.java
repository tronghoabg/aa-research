package com.dexterous.flutterlocalnotifications;

import h5.InterfaceC2781e;
import java.io.Serializable;
import java.util.HashMap;
import uc.InterfaceC4280q;

/* loaded from: classes3.dex */
public final class c implements i, InterfaceC2781e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4280q f26220a;

    @Override // com.dexterous.flutterlocalnotifications.i
    public void B(boolean z2) {
        this.f26220a.a(Boolean.valueOf(z2));
    }

    @Override // h5.InterfaceC2781e
    public void a(HashMap map, String str) {
        this.f26220a.b("sqlite_error", str, map);
    }

    @Override // h5.InterfaceC2781e
    public void b(Serializable serializable) {
        this.f26220a.a(serializable);
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void s() {
        this.f26220a.b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }
}
