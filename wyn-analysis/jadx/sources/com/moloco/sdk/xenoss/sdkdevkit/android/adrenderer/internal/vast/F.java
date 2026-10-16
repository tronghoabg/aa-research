package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import ef.C2527k;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class F implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.E f31157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.E f31158c;

    public /* synthetic */ F(kotlin.jvm.internal.E e7, kotlin.jvm.internal.E e10, int i5) {
        this.f31156a = i5;
        this.f31157b = e7;
        this.f31158c = e10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2527k c2527k = (C2527k) obj;
        switch (this.f31156a) {
            case 0:
                AbstractC3340k.e(c2527k, "<destruct>");
                boolean zBooleanValue = ((Boolean) c2527k.f34671a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) c2527k.f34672b).booleanValue();
                if (zBooleanValue) {
                    this.f31157b.f39738a++;
                }
                if (zBooleanValue2) {
                    this.f31158c.f39738a++;
                }
                break;
            default:
                AbstractC3340k.e(c2527k, "<destruct>");
                boolean zBooleanValue3 = ((Boolean) c2527k.f34671a).booleanValue();
                boolean zBooleanValue4 = ((Boolean) c2527k.f34672b).booleanValue();
                if (zBooleanValue3) {
                    this.f31157b.f39738a++;
                }
                if (zBooleanValue4) {
                    this.f31158c.f39738a++;
                }
                break;
        }
        return C2515C.f34653a;
    }
}
