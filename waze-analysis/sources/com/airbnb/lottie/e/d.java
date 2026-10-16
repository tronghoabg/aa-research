package com.airbnb.lottie.e;

import com.google.android.gms.common.internal.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2301a;

    public d() {
        this.f2301a = com.google.android.gms.k.f.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.airbnb.lottie.y] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.airbnb.lottie.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0152 -> B:92:0x0178). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.airbnb.lottie.y a(android.content.Context r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.d.a(android.content.Context, java.lang.String, java.lang.String):com.airbnb.lottie.y");
    }

    public final int b(int i2, v vVar) {
        com.google.android.gms.k.f.c cVarA = vVar.a(i2);
        if (cVarA == null) {
            return Integer.MIN_VALUE;
        }
        if (((com.google.android.gms.k.f.b) this.f2301a).b(i2, cVarA)) {
            return Integer.MIN_VALUE;
        }
        return cVarA.getMaxInflight();
    }

    public final void c(int i2) {
        ((com.google.android.gms.k.f.b) this.f2301a).a(i2);
    }

    public d(c cVar) {
        this.f2301a = cVar;
    }
}
