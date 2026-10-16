package com.waze.sdk.b;

import com.b.b.a.v;
import com.b.b.d.p;
import com.b.b.d.s;
import com.b.b.d.u;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f35293a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35294b;

    l(m mVar, int i2, byte[] bArr) {
        this.f35294b = i2;
        Objects.requireNonNull(mVar);
        this.f35293a = mVar;
    }

    @Override // com.b.b.a.v
    public final /* synthetic */ void a(Object obj) {
        if (this.f35294b != 0) {
            p pVar = (p) obj;
            m.aj("Player Context = ".concat(String.valueOf(String.valueOf(pVar))));
            m mVar = this.f35293a;
            mVar.f35304j = pVar;
            m.J(mVar);
            return;
        }
        s sVar = (s) obj;
        u uVar = sVar.f2683a;
        m mVar2 = this.f35293a;
        if (mVar2.f35299e == null || mVar2.f35299e.f2696d == null || uVar == null || !mVar2.f35299e.f2696d.equals(uVar.f2696d)) {
            mVar2.f35299e = uVar;
            mVar2.t = null;
            if (uVar != null) {
                mVar2.am(uVar);
                m.I(mVar2, uVar);
            }
        }
        m.aj("subscribeToPlayerState result playerState=".concat(String.valueOf(String.valueOf(sVar))));
        if (uVar != null) {
            m.aj("subscribeToPlayerState changed ".concat(String.valueOf(uVar.f2695c)));
            m.O(mVar2, sVar);
        }
    }

    l(m mVar, int i2) {
        this.f35294b = i2;
        Objects.requireNonNull(mVar);
        this.f35293a = mVar;
    }
}
