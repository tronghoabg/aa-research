package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w extends BasePendingResult {

    /* renamed from: b, reason: collision with root package name */
    private final aa f4894b;

    public w(aa aaVar) {
        super(null);
        this.f4894b = aaVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final aa a(Status status) {
        return this.f4894b;
    }
}
