package com.google.firebase.installations;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private String f10035a;

    /* renamed from: b, reason: collision with root package name */
    private long f10036b;

    /* renamed from: c, reason: collision with root package name */
    private long f10037c;

    /* renamed from: d, reason: collision with root package name */
    private byte f10038d;

    public final j a() {
        String str;
        if (this.f10038d == 3 && (str = this.f10035a) != null) {
            return new j(str, this.f10036b, this.f10037c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10035a == null) {
            sb.append(" token");
        }
        if ((this.f10038d & 1) == 0) {
            sb.append(" tokenExpirationTimestamp");
        }
        if ((this.f10038d & 2) == 0) {
            sb.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f10035a = str;
    }

    public final void c(long j2) {
        this.f10037c = j2;
        this.f10038d = (byte) (this.f10038d | 2);
    }

    public final void d(long j2) {
        this.f10036b = j2;
        this.f10038d = (byte) (this.f10038d | 1);
    }
}
