package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes4.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.j {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f27126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i5, Throwable th) {
        super(new Status(i5, "Integrity API error (" + i5 + "): " + com.google.android.play.core.integrity.model.a.a(i5) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i5 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f27126a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f27126a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
