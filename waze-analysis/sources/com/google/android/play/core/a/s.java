package com.google.android.play.core.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private String f6958a;

    /* renamed from: b, reason: collision with root package name */
    private byte f6959b;

    /* renamed from: c, reason: collision with root package name */
    private t f6960c;

    final r a() {
        String str;
        if (this.f6959b == 1 && (str = this.f6958a) != null && this.f6960c != null) {
            return new r(str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6958a == null) {
            sb.append(" token");
        }
        if (this.f6959b == 0) {
            sb.append(" requestTokenSessionId");
        }
        if (this.f6960c == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    final void b(String str) {
        this.f6958a = str;
    }

    final void c() {
        this.f6959b = (byte) 1;
    }

    final void d(t tVar) {
        this.f6960c = tVar;
    }
}
