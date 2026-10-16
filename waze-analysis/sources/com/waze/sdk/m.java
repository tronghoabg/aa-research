package com.waze.sdk;

import android.content.Context;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends ag {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f35392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(ae aeVar, Context context) {
        super(context);
        Objects.requireNonNull(aeVar);
        this.f35392a = aeVar;
    }

    @Override // com.waze.sdk.ag
    public final boolean a() {
        this.f35392a.ag();
        return true;
    }
}
