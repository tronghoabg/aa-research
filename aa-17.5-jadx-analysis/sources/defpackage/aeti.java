package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aeti {
    int b;
    int c = -1;
    int d;
    boolean e;
    aetq f;
    final /* synthetic */ aetl g;

    public aeti(aetl aetlVar) {
        this.g = aetlVar;
        this.b = aetlVar.e;
        this.d = aetlVar.h;
        this.e = aetlVar.d;
    }

    public abstract void a(Object obj, int i);

    public final int b() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.d--;
        if (this.e) {
            this.e = false;
            int i2 = this.g.e;
            this.c = i2;
            return i2;
        }
        aetl aetlVar = this.g;
        Object[] objArr = aetlVar.a;
        do {
            i = this.b - 1;
            this.b = i;
            if (i < 0) {
                this.c = Integer.MIN_VALUE;
                Object obj = this.f.get((-i) - 1);
                int iHashCode = obj.hashCode() * (-1640531527);
                int i3 = aetlVar.c;
                int i4 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    int i5 = i4 & i3;
                    if (obj.equals(objArr[i5])) {
                        return i5;
                    }
                    i4 = i5 + 1;
                    i3 = aetlVar.c;
                }
            }
        } while (objArr[i] == null);
        this.c = i;
        return i;
    }

    public final void c(Object obj) {
        int i;
        if (this.e) {
            this.e = false;
            int i2 = this.g.e;
            this.c = i2;
            a(obj, i2);
            this.d--;
        }
        aetl aetlVar = this.g;
        Object[] objArr = aetlVar.a;
        while (this.d != 0) {
            int i3 = this.b - 1;
            this.b = i3;
            if (i3 < 0) {
                this.c = Integer.MIN_VALUE;
                Object obj2 = this.f.get((-i3) - 1);
                int iHashCode = obj2.hashCode() * (-1640531527);
                int i4 = aetlVar.c;
                int i5 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i = i5 & i4;
                    if (obj2.equals(objArr[i])) {
                        break;
                    }
                    i5 = i + 1;
                    i4 = aetlVar.c;
                }
                a(obj, i);
                this.d--;
            } else if (objArr[i3] != null) {
                this.c = i3;
                a(obj, i3);
                this.d--;
            }
        }
    }

    public final boolean hasNext() {
        return this.d != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        r8 = r11.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r8 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r8 = new defpackage.aetq((byte[]) null);
        r11.f = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r8.add(r5[r3]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            r11 = this;
            int r0 = r11.c
            r1 = -1
            if (r0 == r1) goto L7a
            aetl r2 = r11.g
            int r3 = r2.e
            r4 = 0
            if (r0 != r3) goto L18
            r0 = 0
            r2.d = r0
            java.lang.Object[] r0 = r2.a
            r0[r3] = r4
            java.lang.Object[] r0 = r2.b
            r0[r3] = r4
            goto L2d
        L18:
            int r3 = r11.b
            if (r3 < 0) goto L6c
            java.lang.Object[] r5 = r2.a
            java.lang.Object[] r6 = r2.b
        L20:
            int r3 = r0 + 1
            int r7 = r2.c
            r3 = r3 & r7
        L25:
            r7 = r5[r3]
            if (r7 != 0) goto L35
            r5[r0] = r4
            r6[r0] = r4
        L2d:
            int r0 = r2.h
            int r0 = r0 + r1
            r2.h = r0
            r11.c = r1
            return
        L35:
            int r8 = r7.hashCode()
            r9 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r8 = r8 * r9
            int r9 = r2.c
            int r10 = r8 >>> 16
            r8 = r8 ^ r10
            r8 = r8 & r9
            if (r0 > r3) goto L4a
            if (r0 >= r8) goto L4e
            if (r8 <= r3) goto L68
            goto L4e
        L4a:
            if (r0 < r8) goto L68
            if (r8 <= r3) goto L68
        L4e:
            if (r3 >= r0) goto L60
            aetq r8 = r11.f
            if (r8 != 0) goto L5b
            aetq r8 = new aetq
            r8.<init>(r4)
            r11.f = r8
        L5b:
            r9 = r5[r3]
            r8.add(r9)
        L60:
            r5[r0] = r7
            r7 = r6[r3]
            r6[r0] = r7
            r0 = r3
            goto L20
        L68:
            int r3 = r3 + 1
            r3 = r3 & r9
            goto L25
        L6c:
            aetq r0 = r11.f
            int r3 = -r3
            int r3 = r3 + r1
            java.lang.Object r0 = r0.set(r3, r4)
            r2.remove(r0)
            r11.c = r1
            return
        L7a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeti.remove():void");
    }
}
