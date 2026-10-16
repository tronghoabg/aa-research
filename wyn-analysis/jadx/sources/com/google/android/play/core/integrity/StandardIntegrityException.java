package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes4.dex */
public class StandardIntegrityException extends com.google.android.gms.common.api.j {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f27127a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIntegrityException(int i5, Throwable th) {
        super(new Status(i5, "Standard Integrity API error (" + i5 + "): " + com.google.android.play.core.integrity.model.b.a(i5) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i5 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f27127a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f27127a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
