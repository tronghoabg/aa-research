package com.google.d.f.b;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class z extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final k f7791a;

    /* renamed from: b, reason: collision with root package name */
    private final k f7792b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f7793c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7794d;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ z(com.google.d.f.b.k r10, com.google.d.f.b.k r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = r10
            com.google.d.f.b.k r0 = (com.google.d.f.b.k) r0
            r9.f7791a = r10
            r10 = r11
            com.google.d.f.b.k r10 = (com.google.d.f.b.k) r10
            r9.f7792b = r11
            int r10 = r11.a()
            r11 = 28
            r0 = 0
            r1 = 1
            if (r10 > r11) goto L19
            r11 = r1
            goto L1a
        L19:
            r11 = r0
        L1a:
            java.lang.String r2 = "metadata size too large"
            com.google.d.d.fo.l(r11, r2)
            int[] r10 = new int[r10]
            r9.f7793c = r10
            r2 = 0
            r11 = r0
            r4 = r11
        L27:
            int r5 = r10.length
            if (r11 >= r5) goto L6b
            com.google.d.f.aa r5 = r9.i(r11)
            long r6 = r5.c()
            long r6 = r6 | r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L62
            r2 = r0
        L38:
            r3 = -1
            if (r2 >= r4) goto L4d
            r8 = r10[r2]
            r8 = r8 & 31
            com.google.d.f.aa r8 = r9.i(r8)
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L4a
            goto L4e
        L4a:
            int r2 = r2 + 1
            goto L38
        L4d:
            r2 = r3
        L4e:
            if (r2 == r3) goto L62
            boolean r3 = r5.i()
            if (r3 == 0) goto L5e
            r3 = r10[r2]
            int r5 = r11 + 4
            int r5 = r1 << r5
            r3 = r3 | r5
            goto L5f
        L5e:
            r3 = r11
        L5f:
            r10[r2] = r3
            goto L67
        L62:
            int r2 = r4 + 1
            r10[r4] = r11
            r4 = r2
        L67:
            int r11 = r11 + 1
            r2 = r6
            goto L27
        L6b:
            r9.f7794d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.b.z.<init>(com.google.d.f.b.k, com.google.d.f.b.k):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.d.f.aa i(int i2) {
        k kVar = this.f7791a;
        int iA = kVar.a();
        return i2 >= iA ? this.f7792b.b(i2 - iA) : kVar.b(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(int i2) {
        k kVar = this.f7791a;
        int iA = kVar.a();
        return i2 >= iA ? this.f7792b.d(i2 - iA) : kVar.d(i2);
    }

    @Override // com.google.d.f.b.ab
    public final int a() {
        return this.f7794d;
    }

    @Override // com.google.d.f.b.ab
    public final Set b() {
        return new x(this);
    }

    @Override // com.google.d.f.b.ab
    public final void c(r rVar, Object obj) {
        for (int i2 = 0; i2 < this.f7794d; i2++) {
            int i3 = this.f7793c[i2];
            com.google.d.f.aa aaVarI = i(i3 & 31);
            if (aaVarI.i()) {
                rVar.b(aaVarI, new y(this, aaVarI, i3), obj);
            } else {
                rVar.a(aaVarI, aaVarI.e(j(i3)), obj);
            }
        }
    }
}
