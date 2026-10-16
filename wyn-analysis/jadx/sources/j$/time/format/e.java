package j$.time.format;

import java.util.ArrayList;

/* loaded from: classes2.dex */
final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f[] f37573a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37574b;

    e(ArrayList arrayList, boolean z2) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z2);
    }

    e(f[] fVarArr, boolean z2) {
        this.f37573a = fVarArr;
        this.f37574b = z2;
    }

    public final e a() {
        return !this.f37574b ? this : new e(this.f37573a, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r9.setLength(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return true;
     */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(j$.time.format.t r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            boolean r1 = r7.f37574b
            if (r1 == 0) goto Lb
            r8.g()
        Lb:
            j$.time.format.f[] r2 = r7.f37573a     // Catch: java.lang.Throwable -> L23
            int r3 = r2.length     // Catch: java.lang.Throwable -> L23
            r4 = 0
        Lf:
            r5 = 1
            if (r4 >= r3) goto L28
            r6 = r2[r4]     // Catch: java.lang.Throwable -> L23
            boolean r6 = r6.o(r8, r9)     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L25
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L2d
            r8.a()
            return r5
        L23:
            r9 = move-exception
            goto L2e
        L25:
            int r4 = r4 + 1
            goto Lf
        L28:
            if (r1 == 0) goto L2d
            r8.a()
        L2d:
            return r5
        L2e:
            if (r1 == 0) goto L33
            r8.a()
        L33:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.e.o(j$.time.format.t, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i5) {
        boolean z2 = this.f37574b;
        f[] fVarArr = this.f37573a;
        if (z2) {
            qVar.q();
            int iQ = i5;
            for (f fVar : fVarArr) {
                iQ = fVar.q(qVar, charSequence, iQ);
                if (iQ < 0) {
                    qVar.e(false);
                    return i5;
                }
            }
            qVar.e(true);
            return iQ;
        }
        for (f fVar2 : fVarArr) {
            i5 = fVar2.q(qVar, charSequence, i5);
            if (i5 < 0) {
                return i5;
            }
        }
        return i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        f[] fVarArr = this.f37573a;
        if (fVarArr != null) {
            boolean z2 = this.f37574b;
            sb2.append(z2 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb2.append(fVar);
            }
            sb2.append(z2 ? "]" : ")");
        }
        return sb2.toString();
    }
}
