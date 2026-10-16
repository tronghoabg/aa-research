package com.google.firebase.crashlytics.a.e;

import androidx.compose.foundation.style.StylePropertiesKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cg {

    /* renamed from: a, reason: collision with root package name */
    private Double f9524a;

    /* renamed from: b, reason: collision with root package name */
    private int f9525b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9526c;

    /* renamed from: d, reason: collision with root package name */
    private int f9527d;

    /* renamed from: e, reason: collision with root package name */
    private long f9528e;

    /* renamed from: f, reason: collision with root package name */
    private long f9529f;

    /* renamed from: g, reason: collision with root package name */
    private byte f9530g;

    public final ch a() {
        if (this.f9530g == 31) {
            return new au(this.f9524a, this.f9525b, this.f9526c, this.f9527d, this.f9528e, this.f9529f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f9530g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f9530g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f9530g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f9530g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f9530g & StylePropertiesKt.BottomId) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Double d2) {
        this.f9524a = d2;
    }

    public final void c(int i2) {
        this.f9525b = i2;
        this.f9530g = (byte) (this.f9530g | 1);
    }

    public final void d(long j2) {
        this.f9529f = j2;
        this.f9530g = (byte) (this.f9530g | StylePropertiesKt.BottomId);
    }

    public final void e(int i2) {
        this.f9527d = i2;
        this.f9530g = (byte) (this.f9530g | 4);
    }

    public final void f(boolean z) {
        this.f9526c = z;
        this.f9530g = (byte) (this.f9530g | 2);
    }

    public final void g(long j2) {
        this.f9528e = j2;
        this.f9530g = (byte) (this.f9530g | 8);
    }
}
