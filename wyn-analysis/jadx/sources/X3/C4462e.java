package x3;

import Va.M6;
import j$.util.Objects;

/* renamed from: x3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4462e {

    /* renamed from: a, reason: collision with root package name */
    public final String f47671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47672b;

    public C4462e(String str) {
        this.f47671a = str;
        this.f47672b = 0;
    }

    public final String a() {
        int i5 = this.f47672b;
        if (i5 == 0) {
            return this.f47671a;
        }
        throw new IllegalStateException(M6.t(new StringBuilder("Wrong data accessor type detected. "), i5 != 0 ? i5 != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", "String"));
    }

    public C4462e(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f47671a = null;
        this.f47672b = 1;
    }
}
