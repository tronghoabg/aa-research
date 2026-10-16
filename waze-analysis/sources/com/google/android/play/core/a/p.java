package com.google.android.play.core.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private String f6953a;

    /* renamed from: b, reason: collision with root package name */
    private Long f6954b;

    public final q a() {
        String str = this.f6953a;
        if (str != null) {
            return new q(str, this.f6954b);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    public final void b(long j2) {
        this.f6954b = Long.valueOf(j2);
    }

    public final void c(String str) {
        this.f6953a = str;
    }
}
