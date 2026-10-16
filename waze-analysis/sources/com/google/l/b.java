package com.google.l;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12217a = new b("", "", false);

    /* renamed from: b, reason: collision with root package name */
    private final String f12218b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12219c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12220d;

    static {
        new b("\n", "  ", true);
    }

    private b(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f12218b = str;
        this.f12219c = str2;
        this.f12220d = z;
    }

    public final String a() {
        return this.f12219c;
    }

    public final String b() {
        return this.f12218b;
    }

    public final boolean c() {
        return this.f12220d;
    }
}
