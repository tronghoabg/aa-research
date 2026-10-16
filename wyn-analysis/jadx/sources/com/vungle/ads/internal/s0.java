package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.persistence.FilePreferences;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class s0 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context) {
        super(0);
        this.f33628a = context;
    }

    @Override // tf.a
    public final Object invoke() {
        return ServiceLocator.f32912d.a(this.f33628a).getService(FilePreferences.class);
    }
}
