package com.waze.sdk.b;

import com.b.b.d.u;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements com.b.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f35275a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f35276b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35277c;

    d(m mVar, u uVar, int i2, byte[] bArr) {
        this.f35277c = i2;
        this.f35275a = uVar;
        Objects.requireNonNull(mVar);
        this.f35276b = mVar;
    }

    @Override // com.b.b.a.a
    public final /* synthetic */ void a(Object obj) {
        int i2 = this.f35277c;
        if (i2 == 0) {
            m.aj("Remove from collection successful");
            m mVar = this.f35276b;
            if (mVar.f35299e == null || mVar.f35299e.f2696d == null || !mVar.f35299e.f2696d.equals(this.f35275a.f2696d)) {
                return;
            }
            m.L(mVar, false);
            return;
        }
        if (i2 != 1) {
            com.b.b.d.k kVar = (com.b.b.d.k) obj;
            m mVar2 = this.f35276b;
            if (mVar2.f35299e == null || mVar2.f35299e.f2696d == null || !mVar2.f35299e.f2696d.equals(this.f35275a.f2696d) || mVar2.t != null) {
                return;
            }
            m.L(mVar2, kVar.f2656b);
            return;
        }
        m.aj("Add to collection successful");
        m mVar3 = this.f35276b;
        if (mVar3.f35299e == null || mVar3.f35299e.f2696d == null || !mVar3.f35299e.f2696d.equals(this.f35275a.f2696d)) {
            return;
        }
        m.L(mVar3, true);
    }

    d(m mVar, u uVar, int i2) {
        this.f35277c = i2;
        this.f35275a = uVar;
        Objects.requireNonNull(mVar);
        this.f35276b = mVar;
    }

    d(m mVar, u uVar, int i2, char[] cArr) {
        this.f35277c = i2;
        this.f35275a = uVar;
        Objects.requireNonNull(mVar);
        this.f35276b = mVar;
    }
}
