package com.google.android.gms.fido.a.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum x implements b {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* renamed from: i, reason: collision with root package name */
    private final int f5449i;

    x(int i2) {
        this.f5449i = i2;
    }

    @Override // com.google.android.gms.fido.a.a.a.b
    public final int a() {
        return this.f5449i;
    }
}
