package com.google.android.play.core.integrity;

import Va.M6;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes4.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final long f27231a;

    public /* synthetic */ e(long j8, int i5, d dVar) {
        this.f27231a = j8;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.f27231a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f27231a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f27231a;
        return (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return M6.s(new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="), this.f27231a, ", webViewRequestMode=0}");
    }
}
