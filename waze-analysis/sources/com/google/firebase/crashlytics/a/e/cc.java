package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    private String f9512a;

    /* renamed from: b, reason: collision with root package name */
    private int f9513b;

    /* renamed from: c, reason: collision with root package name */
    private int f9514c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9515d;

    /* renamed from: e, reason: collision with root package name */
    private byte f9516e;

    public final cd a() {
        String str;
        if (this.f9516e == 7 && (str = this.f9512a) != null) {
            return new at(str, this.f9513b, this.f9514c, this.f9515d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9512a == null) {
            sb.append(" processName");
        }
        if ((this.f9516e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f9516e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f9516e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f9515d = z;
        this.f9516e = (byte) (this.f9516e | 4);
    }

    public final void c(int i2) {
        this.f9514c = i2;
        this.f9516e = (byte) (this.f9516e | 2);
    }

    public final void d(int i2) {
        this.f9513b = i2;
        this.f9516e = (byte) (this.f9516e | 1);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null processName");
        }
        this.f9512a = str;
    }
}
