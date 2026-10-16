package com.google.firebase.crashlytics.a.e;

import androidx.compose.foundation.style.StylePropertiesKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    private int f9461a;

    /* renamed from: b, reason: collision with root package name */
    private String f9462b;

    /* renamed from: c, reason: collision with root package name */
    private int f9463c;

    /* renamed from: d, reason: collision with root package name */
    private long f9464d;

    /* renamed from: e, reason: collision with root package name */
    private long f9465e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9466f;

    /* renamed from: g, reason: collision with root package name */
    private int f9467g;

    /* renamed from: h, reason: collision with root package name */
    private String f9468h;

    /* renamed from: i, reason: collision with root package name */
    private String f9469i;

    /* renamed from: j, reason: collision with root package name */
    private byte f9470j;

    public final bo a() {
        String str;
        String str2;
        String str3;
        if (this.f9470j == 63 && (str = this.f9462b) != null && (str2 = this.f9468h) != null && (str3 = this.f9469i) != null) {
            return new ak(this.f9461a, str, this.f9463c, this.f9464d, this.f9465e, this.f9466f, this.f9467g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f9470j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f9462b == null) {
            sb.append(" model");
        }
        if ((this.f9470j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f9470j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f9470j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f9470j & StylePropertiesKt.BottomId) == 0) {
            sb.append(" simulator");
        }
        if ((this.f9470j & StylePropertiesKt.ZIndexId) == 0) {
            sb.append(" state");
        }
        if (this.f9468h == null) {
            sb.append(" manufacturer");
        }
        if (this.f9469i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i2) {
        this.f9461a = i2;
        this.f9470j = (byte) (this.f9470j | 1);
    }

    public final void c(int i2) {
        this.f9463c = i2;
        this.f9470j = (byte) (this.f9470j | 2);
    }

    public final void d(long j2) {
        this.f9465e = j2;
        this.f9470j = (byte) (this.f9470j | 8);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f9468h = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f9462b = str;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f9469i = str;
    }

    public final void h(long j2) {
        this.f9464d = j2;
        this.f9470j = (byte) (this.f9470j | 4);
    }

    public final void i(boolean z) {
        this.f9466f = z;
        this.f9470j = (byte) (this.f9470j | StylePropertiesKt.BottomId);
    }

    public final void j(int i2) {
        this.f9467g = i2;
        this.f9470j = (byte) (this.f9470j | StylePropertiesKt.ZIndexId);
    }
}
