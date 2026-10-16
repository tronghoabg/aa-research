package com.google.android.gms.l;

import com.google.android.gms.common.api.internal.at;
import com.google.android.libraries.phenotype.client.stable.w;
import com.google.v.de;
import com.google.v.eu;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s implements at {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f5642a;

    s(t tVar, byte[] bArr) {
        this.f5642a = bArr;
        Objects.requireNonNull(tVar);
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((w) obj).a(com.google.android.libraries.phenotype.client.stable.v.parseFrom(this.f5642a, de.a()));
        } catch (eu unused) {
        }
    }
}
