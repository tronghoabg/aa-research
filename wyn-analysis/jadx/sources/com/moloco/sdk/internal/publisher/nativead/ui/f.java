package com.moloco.sdk.internal.publisher.nativead.ui;

import N.C0740o;
import Z.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import tf.q;

/* loaded from: classes4.dex */
public final class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f29258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f29259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S8.d f29260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f29261d;

    public f(v vVar, g gVar, S8.d dVar, S s10) {
        this.f29258a = vVar;
        this.f29259b = gVar;
        this.f29260c = dVar;
        this.f29261d = s10;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k modifier = (k) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC3340k.e(modifier, "modifier");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0740o.e(modifier) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            this.f29258a.a(V.e.b(c0740o, 1035844210, new e(this.f29259b, this.f29260c, modifier, this.f29261d)), c0740o, 6);
        }
        return C2515C.f34653a;
    }
}
