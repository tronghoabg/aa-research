package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class en implements el {

    /* renamed from: a, reason: collision with root package name */
    final Object f7567a;

    /* renamed from: b, reason: collision with root package name */
    int f7568b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ep f7569c;

    en(ep epVar, int i2) {
        Objects.requireNonNull(epVar);
        this.f7569c = epVar;
        this.f7567a = epVar.f7571a[i2];
        this.f7568b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.google.d.d.el
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r4 = this;
            int r0 = r4.f7568b
            r1 = -1
            if (r0 == r1) goto L17
            com.google.d.d.ep r2 = r4.f7569c
            int r3 = r2.f7573c
            if (r0 >= r3) goto L17
            java.lang.Object r3 = r4.f7567a
            java.lang.Object[] r2 = r2.f7571a
            r0 = r2[r0]
            boolean r0 = j$.util.Objects.equals(r3, r0)
            if (r0 != 0) goto L21
        L17:
            com.google.d.d.ep r0 = r4.f7569c
            java.lang.Object r2 = r4.f7567a
            int r0 = r0.d(r2)
            r4.f7568b = r0
        L21:
            int r0 = r4.f7568b
            if (r0 != r1) goto L27
            r4 = 0
            return r4
        L27:
            com.google.d.d.ep r4 = r4.f7569c
            int[] r4 = r4.f7572b
            r4 = r4[r0]
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.d.en.a():int");
    }

    @Override // com.google.d.d.el
    public final Object b() {
        return this.f7567a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof el) {
            el elVar = (el) obj;
            if (a() == elVar.a() && Objects.equals(this.f7567a, elVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7567a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7567a);
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
