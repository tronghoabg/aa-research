package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private String f4364a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f4365b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.datatransport.c f4366c;

    public final x a() {
        com.google.android.datatransport.c cVar;
        String str = this.f4364a;
        if (str != null && (cVar = this.f4366c) != null) {
            return new x(str, this.f4365b, cVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4364a == null) {
            sb.append(" backendName");
        }
        if (this.f4366c == null) {
            sb.append(" priority");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4364a = str;
    }

    public final void c(byte[] bArr) {
        this.f4365b = bArr;
    }

    public final void d(com.google.android.datatransport.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f4366c = cVar;
    }
}
