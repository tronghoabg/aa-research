package com.vungle.ads.internal.ui;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class c extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f33720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i5, int i10, Intent intent) {
        super(0);
        this.f33718a = i5;
        this.f33719b = i10;
        this.f33720c = intent;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onActivityResult: ");
        sbA.append(this.f33718a);
        sbA.append(", ");
        sbA.append(this.f33719b);
        sbA.append(", ");
        sbA.append(this.f33720c);
        return sbA.toString();
    }
}
