package com.vungle.ads.internal.ui;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class u extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str) {
        super(0);
        this.f33748a = str;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("mraid Injecting JS ");
        sbA.append(this.f33748a);
        return sbA.toString();
    }
}
