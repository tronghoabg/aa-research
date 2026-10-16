package com.vungle.ads.internal.presenter;

import com.vungle.ads.MraidTemplateError;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class k extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f33527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MraidTemplateError f33528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, MraidTemplateError mraidTemplateError, boolean z2, String str) {
        super(0);
        this.f33527a = rVar;
        this.f33528b = mraidTemplateError;
        this.f33529c = z2;
        this.f33530d = str;
    }

    @Override // tf.a
    public final Object invoke() {
        this.f33527a.a(this.f33528b, this.f33529c, this.f33530d);
        return C2515C.f34653a;
    }
}
