package com.vungle.ads.internal.ui;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class x extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33808a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(0);
        this.f33808a = str;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Requested range exceeds cached file: ");
        sbA.append(this.f33808a);
        return sbA.toString();
    }
}
