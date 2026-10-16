package com.google.android.gms.fido.a.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum au implements b {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* renamed from: j, reason: collision with root package name */
    private final int f5348j;

    au(int i2) {
        this.f5348j = i2;
    }

    @Override // com.google.android.gms.fido.a.a.a.b
    public final int a() {
        return this.f5348j;
    }
}
