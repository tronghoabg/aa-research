package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
abstract class bm extends i8.z {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f27210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f27210f = bnVar;
    }

    @Override // i8.z
    public final void a(Exception exc) {
        if (!(exc instanceof i8.e)) {
            super.a(exc);
        } else if (bn.k(this.f27210f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
