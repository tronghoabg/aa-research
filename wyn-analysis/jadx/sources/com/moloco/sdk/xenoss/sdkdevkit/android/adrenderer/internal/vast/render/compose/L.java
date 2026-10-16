package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.net.Uri;
import android.webkit.ValueCallback;
import ef.C2515C;
import j$.util.Objects;
import java.util.List;
import kd.C3300K;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class L implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31765d;

    public /* synthetic */ L(Object obj, boolean z2, Object obj2, int i5) {
        this.f31762a = i5;
        this.f31764c = obj;
        this.f31763b = z2;
        this.f31765d = obj2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f31762a) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d it = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(it, "it");
                N.V v2 = (N.V) this.f31765d;
                v2.setValue(it);
                ((tf.p) this.f31764c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) v2.getValue(), this.f31763b ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32408d : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32409e);
                return C2515C.f34653a;
            default:
                C3300K c3300k = (C3300K) obj;
                kd.P p10 = (kd.P) this.f31764c;
                if (c3300k.f39580d) {
                    C8.i iVar = p10.f39598b.f39663a;
                    Throwable th = c3300k.f39579c;
                    Objects.requireNonNull(th);
                    iVar.getClass();
                    C8.i.t(th);
                    return null;
                }
                List list = (List) c3300k.f39578b;
                Objects.requireNonNull(list);
                List list2 = list;
                if (!this.f31763b) {
                    return null;
                }
                Uri[] uriArr = new Uri[list2.size()];
                for (int i5 = 0; i5 < list2.size(); i5++) {
                    uriArr[i5] = Uri.parse((String) list2.get(i5));
                }
                ((ValueCallback) this.f31765d).onReceiveValue(uriArr);
                return null;
        }
    }
}
