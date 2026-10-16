package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes4.dex */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f27227a;

    public bt(bn bnVar) {
        this.f27227a = bnVar;
    }

    public final /* synthetic */ Task a(long j8, long j10, int i5, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f27227a.d(standardIntegrityTokenRequest.a(), j8, j10, 0);
    }
}
