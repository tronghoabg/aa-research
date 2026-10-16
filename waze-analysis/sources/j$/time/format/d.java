package j$.time.format;

import java.util.ArrayList;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f49935a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f49936b;

    public d(ArrayList arrayList, boolean z) {
        this((e[]) arrayList.toArray(new e[arrayList.size()]), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.time.format.w r7, java.lang.StringBuilder r8) {
        /*
            r6 = this;
            int r0 = r8.length()
            r1 = 1
            boolean r2 = r6.f49936b
            if (r2 == 0) goto Le
            int r3 = r7.f50001c
            int r3 = r3 + r1
            r7.f50001c = r3
        Le:
            j$.time.format.e[] r6 = r6.f49935a     // Catch: java.lang.Throwable -> L27
            int r3 = r6.length     // Catch: java.lang.Throwable -> L27
            r4 = 0
        L12:
            if (r4 >= r3) goto L2c
            r5 = r6[r4]     // Catch: java.lang.Throwable -> L27
            boolean r5 = r5.f(r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r5 != 0) goto L29
            r8.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r6 = r7.f50001c
            int r6 = r6 - r1
            r7.f50001c = r6
            return r1
        L27:
            r6 = move-exception
            goto L30
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r8 = r7.f50001c
            int r8 = r8 - r1
            r7.f50001c = r8
        L37:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.d.f(j$.time.format.w, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        ArrayList arrayList = uVar.f49993d;
        boolean z = this.f49936b;
        e[] eVarArr = this.f49935a;
        int i3 = 0;
        if (!z) {
            int length = eVarArr.length;
            while (i3 < length) {
                i2 = eVarArr[i3].h(uVar, charSequence, i2);
                if (i2 < 0) {
                    return i2;
                }
                i3++;
            }
            return i2;
        }
        a0 a0VarC = uVar.c();
        a0VarC.getClass();
        a0 a0Var = new a0();
        a0Var.f49923a.putAll(a0VarC.f49923a);
        a0Var.f49924b = a0VarC.f49924b;
        a0Var.f49925c = a0VarC.f49925c;
        a0Var.f49926d = a0VarC.f49926d;
        arrayList.add(a0Var);
        int length2 = eVarArr.length;
        int iH = i2;
        while (i3 < length2) {
            iH = eVarArr[i3].h(uVar, charSequence, iH);
            if (iH < 0) {
                arrayList.remove(arrayList.size() - 1);
                return i2;
            }
            i3++;
        }
        arrayList.remove(arrayList.size() - 2);
        return iH;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e[] eVarArr = this.f49935a;
        if (eVarArr != null) {
            boolean z = this.f49936b;
            sb.append(z ? "[" : "(");
            for (e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public d(e[] eVarArr, boolean z) {
        this.f49935a = eVarArr;
        this.f49936b = z;
    }
}
