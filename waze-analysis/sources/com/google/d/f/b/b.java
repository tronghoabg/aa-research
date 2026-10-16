package com.google.d.f.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b {
    STRING('s', d.GENERAL, "-#", true),
    BOOLEAN('b', d.BOOLEAN, "-", true),
    CHAR('c', d.CHARACTER, "-", true),
    DECIMAL('d', d.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', d.INTEGRAL, "-#0(", false),
    HEX('x', d.INTEGRAL, "-#0(", true),
    FLOAT('f', d.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', d.FLOAT, "-#0+ (", true),
    GENERAL('g', d.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', d.FLOAT, "-#0+ ", true);


    /* renamed from: k, reason: collision with root package name */
    private static final b[] f7751k = new b[26];
    private final char m;
    private final d n;
    private final int o;
    private final String p;

    static {
        for (b bVar : values()) {
            f7751k[f(bVar.m)] = bVar;
        }
    }

    b(char c2, d dVar, String str, boolean z) {
        this.m = c2;
        this.n = dVar;
        this.o = c.d(str, z);
        this.p = "%" + c2;
    }

    public static b c(char c2) {
        b bVar = f7751k[f(c2)];
        if ((c2 & ' ') == 0 && (bVar == null || (bVar.o & 128) == 0)) {
            return null;
        }
        return bVar;
    }

    private static int f(char c2) {
        return (c2 | ' ') - 97;
    }

    public final char a() {
        return this.m;
    }

    final int b() {
        return this.o;
    }

    public final d d() {
        return this.n;
    }

    public final String e() {
        return this.p;
    }
}
