package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cp {

    /* renamed from: a, reason: collision with root package name */
    private int f9538a;

    /* renamed from: b, reason: collision with root package name */
    private String f9539b;

    /* renamed from: c, reason: collision with root package name */
    private String f9540c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9541d;

    /* renamed from: e, reason: collision with root package name */
    private byte f9542e;

    public final cq a() {
        String str;
        String str2;
        if (this.f9542e == 3 && (str = this.f9539b) != null && (str2 = this.f9540c) != null) {
            return new az(this.f9538a, str, str2, this.f9541d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f9542e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f9539b == null) {
            sb.append(" version");
        }
        if (this.f9540c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f9542e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildVersion");
        }
        this.f9540c = str;
    }

    public final void c(boolean z) {
        this.f9541d = z;
        this.f9542e = (byte) (this.f9542e | 2);
    }

    public final void d(int i2) {
        this.f9538a = i2;
        this.f9542e = (byte) (this.f9542e | 1);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null version");
        }
        this.f9539b = str;
    }
}
