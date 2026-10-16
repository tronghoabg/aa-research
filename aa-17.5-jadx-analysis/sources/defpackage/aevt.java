package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aevt<K> extends aera<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient Object[] a;
    protected transient int[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    public int h;
    protected transient aexn i;
    protected transient aejf j;
    protected transient aevo k;

    public aevt(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        int iP = adqs.p(i, 0.75f);
        this.e = iP;
        this.g = iP;
        this.c = iP - 1;
        this.f = adqs.q(iP, 0.75f);
        int i2 = this.e + 1;
        this.a = new Object[i2];
        this.b = new int[i2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iP = adqs.p(this.h, 0.75f);
        this.e = iP;
        this.f = adqs.q(iP, 0.75f);
        int i2 = this.e;
        this.c = i2 - 1;
        int i3 = i2 + 1;
        Object[] objArr = new Object[i3];
        this.a = objArr;
        int[] iArr = new int[i3];
        this.b = iArr;
        int i4 = this.h;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            int i6 = objectInputStream.readInt();
            if (object == null) {
                i = this.e;
                this.d = true;
            } else {
                int iIdentityHashCode = System.identityHashCode(object) * (-1640531527);
                int i7 = this.c;
                int i8 = iIdentityHashCode ^ (iIdentityHashCode >>> 16);
                while (true) {
                    i = i8 & i7;
                    if (objArr[i] != null) {
                        i8 = i + 1;
                        i7 = this.c;
                    }
                }
            }
            objArr[i] = object;
            iArr[i] = i6;
            i4 = i5;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.a;
        int[] iArr = this.b;
        aevi aeviVar = new aevi(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aeviVar.b();
            objectOutputStream.writeObject(objArr[iB]);
            objectOutputStream.writeInt(iArr[iB]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[EDGE_INSN: B:9:0x001e->B:15:0x002f BREAK  A[LOOP:0: B:11:0x0024->B:28:?], PHI: r2
  0x001e: PHI (r2v9 int) = (r2v3 int), (r2v6 int), (r2v12 int) binds: [B:8:0x001c, B:26:0x001e, B:5:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aeqz, defpackage.aeva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != 0) goto La
            boolean r1 = r5.d
            int r2 = r5.e
            if (r1 == 0) goto L1e
            goto L2f
        La:
            java.lang.Object[] r1 = r5.a
            int r2 = java.lang.System.identityHashCode(r6)
            r3 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r3
            int r3 = r5.c
            int r4 = r2 >>> 16
            r2 = r2 ^ r4
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L22
        L1e:
            int r2 = r2 + 1
            int r2 = -r2
            goto L2f
        L22:
            if (r6 == r3) goto L2f
        L24:
            int r2 = r2 + r0
            int r3 = r5.c
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L2d
            goto L1e
        L2d:
            if (r6 != r3) goto L24
        L2f:
            if (r2 >= 0) goto L59
            int r1 = -r2
            int r1 = r1 + (-1)
            int r2 = r5.e
            if (r1 != r2) goto L3a
            r5.d = r0
        L3a:
            java.lang.Object[] r0 = r5.a
            r0[r1] = r6
            int[] r6 = r5.b
            r6[r1] = r7
            int r6 = r5.h
            int r7 = r6 + 1
            r5.h = r7
            int r7 = r5.f
            if (r6 < r7) goto L57
            int r6 = r6 + 2
            r7 = 1061158912(0x3f400000, float:0.75)
            int r6 = defpackage.adqs.p(r6, r7)
            r5.u(r6)
        L57:
            r5 = 0
            return r5
        L59:
            int[] r5 = r5.b
            r6 = r5[r2]
            r5[r2] = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevt.a(java.lang.Object, int):int");
    }

    @Override // defpackage.aeqz, defpackage.aeva
    public final int b(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.d) {
                return s();
            }
            return 0;
        }
        Object[] objArr = this.a;
        int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return 0;
        }
        if (obj == obj3) {
            return r(i);
        }
        do {
            i = (i + 1) & this.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return 0;
            }
        } while (obj != obj2);
        return r(i);
    }

    @Override // defpackage.aera, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        Arrays.fill(this.a, (Object) null);
    }

    @Override // defpackage.aera, defpackage.aeqz, defpackage.aeee
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.d;
        }
        Object[] objArr = this.a;
        int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (obj != obj3) {
            do {
                i = (i + 1) & this.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return false;
                }
            } while (obj != obj2);
        }
        return true;
    }

    @Override // defpackage.aera
    /* renamed from: d */
    public final aejf values() {
        if (this.j == null) {
            this.j = new aevh(this);
        }
        return this.j;
    }

    @Override // defpackage.aera
    /* renamed from: f */
    public final aexn keySet() {
        if (this.i == null) {
            this.i = new aevl(this);
        }
        return this.i;
    }

    @Override // defpackage.aera, java.util.Map
    public final int hashCode() {
        Object obj;
        int i;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int iQ = q();
        int i2 = 0;
        int i3 = 0;
        int iIdentityHashCode = 0;
        while (iQ != 0) {
            while (true) {
                obj = objArr[i2];
                i = i2 + 1;
                if (obj != null) {
                    break;
                }
                i2 = i;
            }
            if (this != obj) {
                iIdentityHashCode = System.identityHashCode(obj);
            }
            iQ--;
            iIdentityHashCode ^= iArr[i2];
            i3 += iIdentityHashCode;
            i2 = i;
        }
        return this.d ? i3 + iArr[this.e] : i3;
    }

    @Override // defpackage.aera, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // defpackage.aera, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // defpackage.aera, defpackage.aeve
    public final boolean m(int i) {
        Object[] objArr = this.a;
        int[] iArr = this.b;
        if (this.d && iArr[this.e] == i) {
            return true;
        }
        int i2 = this.e;
        while (i2 != 0) {
            i2--;
            if (objArr[i2] != null && iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeva
    public final int o(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.d) {
                return this.b[this.e];
            }
            return 0;
        }
        Object[] objArr = this.a;
        int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return 0;
        }
        if (obj == obj3) {
            return this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return 0;
            }
        } while (obj != obj2);
        return this.b[i];
    }

    @Override // defpackage.aera, java.util.Map
    public final void putAll(Map<? extends K, ? extends Integer> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            u(iMin);
        }
        if (map instanceof aeve) {
            aety aetyVarA = aevg.a((aeve) map);
            while (aetyVarA.hasNext()) {
                aevn aevnVar = (aevn) aetyVarA.next();
                a(aevnVar.getKey(), aevnVar.a());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends Integer>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends K, ? extends Integer> next = it.next();
            adqs.aA(this, next.getKey(), next.getValue());
        }
    }

    public final int q() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    public final int r(int i) {
        Object obj;
        int[] iArr = this.b;
        int i2 = iArr[i];
        this.h--;
        Object[] objArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                obj = objArr[i3];
                if (obj == null) {
                    break loop0;
                }
                int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
                int i4 = this.c;
                int i5 = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & i4;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < i5 || i5 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            objArr[i] = obj;
            iArr[i] = iArr[i3];
            i = i3;
        }
        objArr[i] = null;
        int i6 = this.e;
        if (i6 > this.g && this.h < this.f / 4 && i6 > 16) {
            u(i6 >> 1);
        }
        return i2;
    }

    public final int s() {
        this.d = false;
        Object[] objArr = this.a;
        int i = this.e;
        objArr[i] = null;
        int i2 = this.b[i];
        int i3 = this.h - 1;
        this.h = i3;
        if (i > this.g && i3 < this.f / 4 && i > 16) {
            u(i >> 1);
        }
        return i2;
    }

    @Override // defpackage.aeqz, defpackage.aeee
    public final int size() {
        return this.h;
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final aevt clone() {
        try {
            aevt aevtVar = (aevt) super.clone();
            aevtVar.i = null;
            aevtVar.j = null;
            aevtVar.k = null;
            aevtVar.d = this.d;
            aevtVar.a = (Object[]) this.a.clone();
            aevtVar.b = (int[]) this.b.clone();
            return aevtVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    protected final void u(int i) {
        Object obj;
        int i2 = i + 1;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        Object[] objArr2 = new Object[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.e;
        int iQ = q();
        while (true) {
            int i4 = i - 1;
            if (iQ == 0) {
                iArr2[i] = iArr[this.e];
                this.e = i;
                this.c = i4;
                this.f = adqs.q(i, 0.75f);
                this.a = objArr2;
                this.b = iArr2;
                return;
            }
            do {
                i3--;
                obj = objArr[i3];
            } while (obj == null);
            int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
            int i5 = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & i4;
            if (objArr2[i5] != null) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (objArr2[i5] != null);
            }
            objArr2[i5] = objArr[i3];
            iArr2[i5] = iArr[i3];
            iQ--;
        }
    }

    @Override // defpackage.aeve
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final aevo p() {
        aevo aevoVar = this.k;
        if (aevoVar != null) {
            return aevoVar;
        }
        aevo aevoVar2 = new aevo(this);
        this.k = aevoVar2;
        return aevoVar2;
    }

    @Override // defpackage.aera, java.util.Map
    public final /* bridge */ /* synthetic */ Collection<Integer> values() {
        return values();
    }

    public aevt() {
        throw null;
    }
}
