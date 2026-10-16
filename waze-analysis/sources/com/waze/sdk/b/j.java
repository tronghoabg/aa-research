package com.waze.sdk.b;

import com.waze.t;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements com.b.b.a.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f35286a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.b.b.d.i f35287b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f35288c;

    j(m mVar, int i2, com.b.b.d.i iVar) {
        this.f35286a = i2;
        this.f35287b = iVar;
        Objects.requireNonNull(mVar);
        this.f35288c = mVar;
    }

    @Override // com.b.b.a.j
    public final void a(Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder("getTrackImage getImage ");
        sb.append(message);
        sb.append("  (retryCount=");
        int i2 = this.f35286a;
        sb.append(i2);
        sb.append(")");
        m.ak(sb.toString());
        if (i2 > 2) {
            return;
        }
        t.m(new i(this, this.f35287b, i2), 500L);
    }
}
