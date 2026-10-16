package com.google.d.f.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private static final f f7835a = new b();

    public static f b() {
        return f7835a;
    }

    @Override // com.google.d.f.e.f
    public final int a(c cVar, int i2, String str, int i3, int i4, int i5) {
        com.google.d.f.d.c cVarA;
        char cCharAt = str.charAt(i5);
        com.google.d.f.b.c cVarF = com.google.d.f.b.c.f(str, i4, i5, (cCharAt & ' ') == 0);
        com.google.d.f.b.b bVarC = com.google.d.f.b.b.c(cCharAt);
        int i6 = i5 + 1;
        if (bVarC != null) {
            if (!cVarF.g(bVarC)) {
                throw e.b("invalid format specifier", str, i3, i6);
            }
            cVarA = com.google.d.f.d.d.a(i2, bVarC, cVarF);
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!cVarF.j(160, false)) {
                throw e.b("invalid format specification", str, i3, i6);
            }
            int i7 = i5 + 2;
            if (i7 > str.length()) {
                throw e.a("truncated format specifier", str, i3);
            }
            com.google.d.f.d.a aVarB = com.google.d.f.d.a.b(str.charAt(i6));
            if (aVarB == null) {
                throw e.a("illegal date/time conversion", str, i6);
            }
            cVarA = com.google.d.f.d.b.a(aVarB, cVarF, i2);
            i6 = i7;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw e.b("invalid format specification", str, i3, i6);
            }
            if (!cVarF.j(160, false)) {
                throw e.b("invalid format specification", str, i3, i6);
            }
            cVarA = new a(cVarF, i2);
        }
        cVar.l(i3, i6, cVarA);
        return i6;
    }
}
