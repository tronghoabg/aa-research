package com.google.b.d.b;

import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f7130a;

    /* renamed from: b, reason: collision with root package name */
    private final t f7131b;

    /* renamed from: c, reason: collision with root package name */
    private t f7132c;

    /* renamed from: d, reason: collision with root package name */
    private int f7133d;

    /* renamed from: e, reason: collision with root package name */
    private int f7134e;

    /* renamed from: f, reason: collision with root package name */
    private int f7135f;

    private v(int[] iArr) {
        this.f7130a = iArr;
        t tVar = new t(-1, -1);
        this.f7131b = tVar;
        this.f7132c = tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r6 = r7.f7126d;
        r7 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r6.containsKey(r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r0.f7132c.f7126d.put(r7, new com.google.b.d.b.t(r1, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r5.f7125c = r0.f7132c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r5.f7125c = r0.f7132c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r0.f7133d = r1;
        r0.f7134e++;
        r0.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.b.d.b.v b(int[] r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.d.b.v.b(int[]):com.google.b.d.b.v");
    }

    private final void e(t tVar, StringBuilder sb) {
        for (t tVar2 : tVar.f7126d.values()) {
            sb.append("  ");
            sb.append(tVar);
            sb.append(" -> ");
            sb.append(tVar2);
            sb.append(" [label=\"");
            int[] iArr = this.f7130a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, tVar2.f7123a, Math.min(iArr.length, tVar2.f7124b + 1))));
            sb.append("\"]\n");
            e(tVar2, sb);
        }
    }

    private final boolean f(int i2, int i3, int i4, int i5) {
        if (i2 >= 0 && i4 >= 0) {
            int[] iArr = this.f7130a;
            int length = iArr.length;
            int iMin = Math.min(length, i3);
            if (iMin - i2 == Math.min(length, i5) - i4) {
                for (int i6 = i2; i6 <= iMin; i6++) {
                    if (iArr[i6] != iArr[(i4 + i6) - i2]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.b.d.b.u a() {
        /*
            r13 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.google.b.d.b.s r1 = new com.google.b.d.b.s
            com.google.b.d.b.t r2 = r13.f7131b
            r3 = -1
            r4 = 0
            r1.<init>(r2, r4, r3, r3)
            r0.push(r1)
        L11:
            boolean r3 = r0.isEmpty()
            r5 = 1
            if (r3 != 0) goto L74
            java.lang.Object r3 = r0.pop()
            com.google.b.d.b.s r3 = (com.google.b.d.b.s) r3
            com.google.b.d.b.t r6 = r3.f7122d
            java.util.Map r6 = r6.f7126d
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L11
            java.lang.Object r7 = r6.next()
            com.google.b.d.b.t r7 = (com.google.b.d.b.t) r7
            int r8 = r3.f7120b
            int r9 = r3.f7121c
            int r10 = r7.f7123a
            int r11 = r7.f7124b
            boolean r10 = r13.f(r8, r9, r10, r11)
            if (r10 != 0) goto L60
            java.util.Map r10 = r7.f7126d
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L58
            int r10 = r7.f7123a
            int r12 = r10 + r9
            int r12 = r12 - r8
            boolean r10 = r13.f(r8, r9, r10, r12)
            if (r10 == 0) goto L58
            goto L60
        L58:
            com.google.b.d.b.s r8 = new com.google.b.d.b.s
            int r9 = r7.f7123a
            r8.<init>(r7, r5, r9, r11)
            goto L69
        L60:
            com.google.b.d.b.s r10 = new com.google.b.d.b.s
            int r11 = r3.f7119a
            int r11 = r11 + r5
            r10.<init>(r7, r11, r8, r9)
            r8 = r10
        L69:
            int r7 = r1.f7119a
            int r9 = r8.f7119a
            if (r7 >= r9) goto L70
            r1 = r8
        L70:
            r0.push(r8)
            goto L2a
        L74:
            int[] r13 = r13.f7130a
            int r0 = r1.f7121c
            int r0 = r0 + r5
            int r3 = r13.length
            int r0 = java.lang.Math.min(r3, r0)
        L7e:
            int r3 = r1.f7120b
            int r6 = r0 - r3
            int r7 = r4 % r6
            int r7 = r7 + r3
            r7 = r13[r7]
            java.util.Map r2 = r2.f7126d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r2 = r2.get(r7)
            com.google.b.d.b.t r2 = (com.google.b.d.b.t) r2
            if (r2 != 0) goto L96
            goto Lae
        L96:
            int r7 = r2.f7123a
        L98:
            int r8 = r2.f7124b
            int r8 = r8 + r5
            if (r7 >= r8) goto L7e
            int r8 = r13.length
            if (r7 >= r8) goto L7e
            int r8 = r4 % r6
            int r8 = r8 + r3
            r8 = r13[r8]
            r9 = r13[r7]
            if (r8 != r9) goto Lae
            int r4 = r4 + 1
            int r7 = r7 + 1
            goto L98
        Lae:
            com.google.b.d.b.u r13 = new com.google.b.d.b.u
            int r4 = r4 / r6
            r13.<init>(r3, r0, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.d.b.v.a():com.google.b.d.b.u");
    }

    final void c() {
        t tVar = this.f7132c.f7125c;
        if (tVar != null) {
            this.f7132c = tVar;
        } else {
            this.f7132c = this.f7131b;
            int i2 = this.f7134e;
            if (i2 > 0) {
                this.f7134e = i2 - 1;
            }
            if (this.f7135f > 0) {
                this.f7133d++;
            }
        }
        d();
    }

    final void d() {
        if (this.f7134e == 0) {
            return;
        }
        Map map = this.f7132c.f7126d;
        int[] iArr = this.f7130a;
        t tVar = (t) map.get(Integer.valueOf(iArr[this.f7133d]));
        while (true) {
            int i2 = (tVar.f7124b - tVar.f7123a) + 1;
            int i3 = this.f7134e;
            if (i2 > i3) {
                return;
            }
            int i4 = this.f7133d + i2;
            this.f7133d = i4;
            this.f7132c = tVar;
            int i5 = i3 - i2;
            this.f7134e = i5;
            if (i5 > 0) {
                tVar = (t) tVar.f7126d.get(Integer.valueOf(iArr[i4]));
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        e(this.f7131b, sb);
        sb.append("}");
        return sb.toString();
    }
}
