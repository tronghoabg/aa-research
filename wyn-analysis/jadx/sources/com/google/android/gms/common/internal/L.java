package com.google.android.gms.common.internal;

/* loaded from: classes3.dex */
public final class L extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final d7.b f26604a;

    public L(d7.b bVar) {
        AbstractC1732v.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f34115b == 0 || bVar.f34116c == null) ? false : true);
        this.f26604a = bVar;
    }
}
