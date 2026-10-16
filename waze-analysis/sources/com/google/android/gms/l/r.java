package com.google.android.gms.l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.o.w;
import com.google.v.de;
import com.google.v.eu;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends com.google.android.gms.l.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f5641a;

    r(v vVar, w wVar) {
        this.f5641a = wVar;
        Objects.requireNonNull(vVar);
    }

    @Override // com.google.android.gms.l.a.d
    public final void a(Status status, byte[] bArr) {
        if (!status.f()) {
            ab.d(status, null, this.f5641a);
            return;
        }
        try {
            ab.d(status, com.google.android.libraries.phenotype.client.b.u.parseFrom(bArr, de.a()), this.f5641a);
        } catch (eu e2) {
            this.f5641a.b(e2);
        }
    }
}
