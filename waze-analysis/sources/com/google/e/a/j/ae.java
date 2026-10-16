package com.google.e.a.j;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae implements com.google.e.a.q {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8668a = {0};

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.g.c f8669b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8670c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8671d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f8672e;

    private ae(com.google.e.a.f.h hVar) {
        String strValueOf = String.valueOf(String.valueOf(hVar.h().j()));
        this.f8669b = new ad("HMAC".concat(strValueOf), new SecretKeySpec(hVar.i().e(), "HMAC"));
        this.f8670c = hVar.h().f();
        this.f8671d = hVar.g().c();
        if (hVar.h().k().equals(com.google.e.a.f.m.f8523c)) {
            this.f8672e = Arrays.copyOf(f8668a, 1);
        } else {
            this.f8672e = new byte[0];
        }
    }

    public static com.google.e.a.q b(com.google.e.a.f.a aVar) {
        return new ae(aVar);
    }

    public static com.google.e.a.q c(com.google.e.a.f.h hVar) {
        return new ae(hVar);
    }

    @Override // com.google.e.a.q
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f8672e;
        int length = bArr2.length;
        byte[] bArr3 = this.f8671d;
        return length > 0 ? com.google.e.a.d.a.d.d(bArr3, this.f8669b.a(com.google.e.a.d.a.d.d(bArr, bArr2), this.f8670c)) : com.google.e.a.d.a.d.d(bArr3, this.f8669b.a(bArr, this.f8670c));
    }

    private ae(com.google.e.a.f.a aVar) {
        this.f8669b = ab.b(com.google.e.a.g.a.f(com.google.e.a.g.b.g(aVar.f().g()), aVar.h()));
        this.f8670c = aVar.f().f();
        this.f8671d = aVar.g().c();
        if (aVar.f().i().equals(com.google.e.a.f.c.f8490c)) {
            this.f8672e = Arrays.copyOf(f8668a, 1);
        } else {
            this.f8672e = new byte[0];
        }
    }

    public ae(com.google.e.a.g.c cVar, int i2) {
        this.f8669b = cVar;
        this.f8670c = i2;
        this.f8671d = new byte[0];
        this.f8672e = new byte[0];
        cVar.a(new byte[0], i2);
    }
}
