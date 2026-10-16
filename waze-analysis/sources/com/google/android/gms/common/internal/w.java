package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f5101a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f5102b;

    w(Intent intent, Activity activity) {
        this.f5101a = intent;
        this.f5102b = activity;
    }

    @Override // com.google.android.gms.common.internal.y
    public final void a() {
        Intent intent = this.f5101a;
        if (intent != null) {
            this.f5102b.startActivityForResult(intent, 2);
        }
    }
}
