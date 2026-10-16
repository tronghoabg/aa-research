package com.google.android.play.core.a;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends com.google.android.gms.common.api.i {

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f6949b;

    n(int i2, Throwable th, byte[] bArr) {
        super(new Status(i2, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i2), com.google.android.play.core.a.a.a.a(i2))));
        if (i2 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f6949b = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f6949b;
    }

    n(int i2, Throwable th) {
        this(i2, th, null);
    }

    public n(int i2) {
        this(i2, null, null);
    }
}
