package com.google.android.gms.l;

import com.google.android.gms.common.api.internal.au;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t extends com.google.android.gms.l.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ au f5643a;

    t(v vVar, au auVar) {
        this.f5643a = auVar;
        Objects.requireNonNull(vVar);
    }

    @Override // com.google.android.gms.l.a.b
    public final void a(byte[] bArr) {
        this.f5643a.d(new s(this, bArr));
    }
}
