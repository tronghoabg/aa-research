package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import Ef.InterfaceC0501m0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class h0 implements N.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f31889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.V f31891c;

    public h0(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, N.V v2) {
        this.f31889a = list;
        this.f31890b = oVar;
        this.f31891c = v2;
    }

    @Override // N.B
    public final void dispose() {
        Iterator it = this.f31889a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0501m0) it.next()).cancel(null);
        }
        this.f31890b.destroy();
        ((tf.l) this.f31891c.getValue()).invoke(Boolean.FALSE);
    }
}
