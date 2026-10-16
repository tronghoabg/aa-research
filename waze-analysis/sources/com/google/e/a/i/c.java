package com.google.e.a.i;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8607a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8608b = null;

    /* renamed from: c, reason: collision with root package name */
    private d f8609c = null;

    /* renamed from: d, reason: collision with root package name */
    private d f8610d = null;

    /* renamed from: e, reason: collision with root package name */
    private Integer f8611e = null;

    /* renamed from: f, reason: collision with root package name */
    private Integer f8612f = null;

    public final e a() throws GeneralSecurityException {
        if (this.f8607a == null) {
            throw new GeneralSecurityException("keySizeBytes needs to be set");
        }
        Integer num = this.f8608b;
        if (num == null) {
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be set");
        }
        if (this.f8609c == null) {
            throw new GeneralSecurityException("hkdfHashType needs to be set");
        }
        if (this.f8610d == null) {
            throw new GeneralSecurityException("hmacHashType needs to be set");
        }
        if (this.f8611e == null) {
            throw new GeneralSecurityException("hmacTagSizeBytes needs to be set");
        }
        if (this.f8612f == null) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        }
        if (num.intValue() != 16 && this.f8608b.intValue() != 32) {
            Integer num2 = this.f8608b;
            Objects.toString(num2);
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not ".concat(String.valueOf(num2)));
        }
        if (this.f8607a.intValue() < this.f8608b.intValue()) {
            Integer num3 = this.f8608b;
            Objects.toString(num3);
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., ".concat(String.valueOf(num3)));
        }
        if (this.f8612f.intValue() <= this.f8608b.intValue() + this.f8611e.intValue() + 8) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (this.f8608b.intValue() + this.f8611e.intValue() + 9));
        }
        d dVar = this.f8610d;
        int i2 = dVar != d.f8614b ? dVar == d.f8613a ? 20 : 0 : 32;
        if (dVar == d.f8615c) {
            i2 = 64;
        }
        if (this.f8611e.intValue() >= 10 && this.f8611e.intValue() <= i2) {
            return new e(this.f8607a, this.f8608b, this.f8609c, this.f8610d, this.f8611e, this.f8612f);
        }
        throw new GeneralSecurityException("hmacTagSize must be in range [10, " + i2 + "], but is " + this.f8611e);
    }

    public final void b(int i2) {
        this.f8612f = Integer.valueOf(i2);
    }

    public final void c(int i2) {
        this.f8608b = Integer.valueOf(i2);
    }

    public final void d(d dVar) {
        this.f8609c = dVar;
    }

    public final void e(d dVar) {
        this.f8610d = dVar;
    }

    public final void f(Integer num) {
        this.f8611e = num;
    }

    public final void g(int i2) {
        this.f8607a = Integer.valueOf(i2);
    }
}
