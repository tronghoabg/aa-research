package com.qonversion.android.sdk.internal.billing;

import tf.l;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32644b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f32643a = i5;
        this.f32644b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32643a) {
            case 0:
                BillingClientHolder.startConnection$lambda$1((BillingClientHolder) this.f32644b);
                break;
            default:
                ((l) this.f32644b).invoke(null);
                break;
        }
    }
}
