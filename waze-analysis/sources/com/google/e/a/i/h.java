package com.google.e.a.i;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8630a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8631b = null;

    /* renamed from: c, reason: collision with root package name */
    private i f8632c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f8633d = null;

    public final j a() throws GeneralSecurityException {
        if (this.f8630a == null) {
            throw new GeneralSecurityException("keySizeBytes needs to be set");
        }
        Integer num = this.f8631b;
        if (num == null) {
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be set");
        }
        if (this.f8632c == null) {
            throw new GeneralSecurityException("hkdfHashType needs to be set");
        }
        if (this.f8633d == null) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        }
        if (num.intValue() != 16 && this.f8631b.intValue() != 32) {
            Integer num2 = this.f8631b;
            Objects.toString(num2);
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not ".concat(String.valueOf(num2)));
        }
        if (this.f8630a.intValue() < this.f8631b.intValue()) {
            Integer num3 = this.f8631b;
            Objects.toString(num3);
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., ".concat(String.valueOf(num3)));
        }
        if (this.f8633d.intValue() > this.f8631b.intValue() + 24) {
            return new j(this.f8630a, this.f8631b, this.f8632c, this.f8633d);
        }
        throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (this.f8631b.intValue() + 25));
    }

    public final void b(int i2) {
        this.f8633d = Integer.valueOf(i2);
    }

    public final void c(int i2) {
        this.f8631b = Integer.valueOf(i2);
    }

    public final void d(i iVar) {
        this.f8632c = iVar;
    }

    public final void e(int i2) {
        this.f8630a = Integer.valueOf(i2);
    }
}
