package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes4.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f27229a;

    /* renamed from: b, reason: collision with root package name */
    private byte f27230b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i5) {
        this.f27230b = (byte) (this.f27230b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f27230b == 3) {
            return new e(this.f27229a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f27230b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f27230b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j8) {
        this.f27229a = j8;
        this.f27230b = (byte) (this.f27230b | 1);
        return this;
    }
}
