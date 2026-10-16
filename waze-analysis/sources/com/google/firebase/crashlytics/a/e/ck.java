package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    private String f9536a;

    /* renamed from: b, reason: collision with root package name */
    private Object f9537b;

    public final cl a() {
        Object obj;
        String str = this.f9536a;
        if (str != null && (obj = this.f9537b) != null) {
            return new ax(str, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9536a == null) {
            sb.append(" rolloutId");
        }
        if (this.f9537b == null) {
            sb.append(" variantId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f9536a = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f9537b = str;
    }

    public final bh d() {
        Object obj;
        String str = this.f9536a;
        if (str != null && (obj = this.f9537b) != null) {
            return new ag(str, (byte[]) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9536a == null) {
            sb.append(" filename");
        }
        if (this.f9537b == null) {
            sb.append(" contents");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null contents");
        }
        this.f9537b = bArr;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null filename");
        }
        this.f9536a = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final bi g() {
        ?? r0 = this.f9537b;
        if (r0 != 0) {
            return new af(r0, this.f9536a);
        }
        throw new IllegalStateException("Missing required properties: files");
    }

    public final void h(List list) {
        if (list == null) {
            throw new NullPointerException("Null files");
        }
        this.f9537b = list;
    }

    public final void i(String str) {
        this.f9536a = str;
    }

    public final bg j() {
        Object obj;
        String str = this.f9536a;
        if (str != null && (obj = this.f9537b) != null) {
            return new ae(str, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9536a == null) {
            sb.append(" key");
        }
        if (this.f9537b == null) {
            sb.append(" value");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f9536a = str;
    }

    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null value");
        }
        this.f9537b = str;
    }
}
