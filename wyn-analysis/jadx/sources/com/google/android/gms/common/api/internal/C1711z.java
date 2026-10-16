package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1711z extends BasePendingResult {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1711z(com.google.android.gms.common.api.o oVar, int i5) {
        super(oVar);
        this.f26560a = i5;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final com.google.android.gms.common.api.t createFailedResult(Status status) {
        switch (this.f26560a) {
            case 0:
                return status;
            default:
                throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }
}
