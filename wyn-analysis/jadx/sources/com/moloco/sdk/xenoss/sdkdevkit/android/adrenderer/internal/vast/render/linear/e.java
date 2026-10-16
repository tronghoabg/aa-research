package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import ef.C2515C;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f32020b;

    public /* synthetic */ e(h hVar, int i5) {
        this.f32019a = i5;
        this.f32020b = hVar;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f32019a) {
            case 0:
                h hVar = this.f32020b;
                b7.k kVar = hVar.f32043r;
                Integer numValueOf = Integer.valueOf(hVar.f32026A);
                List list = (List) kVar.f19396b;
                if (list != null) {
                    ((L0) kVar.f19398d).a(list, null, numValueOf, hVar.f32034h);
                    kVar.f19396b = null;
                }
                break;
            default:
                h hVar2 = this.f32020b;
                b7.k kVar2 = hVar2.f32043r;
                Integer numValueOf2 = Integer.valueOf(hVar2.f32026A);
                List list2 = (List) kVar2.f19397c;
                if (list2 != null) {
                    ((L0) kVar2.f19398d).a(list2, null, numValueOf2, hVar2.f32034h);
                    kVar2.f19397c = null;
                }
                break;
        }
        return C2515C.f34653a;
    }
}
