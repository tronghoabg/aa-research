package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4169a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4170b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4171c;

    g(Context context, com.google.android.datatransport.runtime.c.a aVar, com.google.android.datatransport.runtime.c.a aVar2) {
        this.f4169a = context;
        this.f4170b = aVar;
        this.f4171c = aVar2;
    }

    final f a(String str) {
        return new f(this.f4169a, this.f4170b, this.f4171c, str);
    }
}
