package com.google.android.gms.common;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final String f4664a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4665b;

    /* synthetic */ aa(String str, boolean z) {
        this.f4664a = str;
        this.f4665b = z;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.g.c] */
    final v a(Context context) {
        return new v(this.f4664a, this.f4665b, false, com.google.android.gms.g.b.b(context), false, true, false);
    }
}
