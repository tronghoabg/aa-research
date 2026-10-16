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
public final class aeit<V> extends aegi<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] a;
    protected transient Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    protected int h;
    protected transient aekf i;
    protected transient aexk j;
    protected transient aeio k;

    public aeit(byte[] bArr) {
        int iP = adqs.p(16, 0.75f);
        this.e = iP;
        this.g = iP;
        this.c = iP - 1;
        this.f = adqs.q(iP, 0.75f);
        int i = this.e + 1;
        this.a = new int[i];
        this.b = new Object[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        int i2;
        int i3;
        objectInputStream.defaultReadObject();
        int iP = adqs.p(this.h, 0.75f);
        this.e = iP;
        this.f = adqs.q(iP, 0.75f);
        int i4 = this.e;
        this.c = i4 - 1;
        int i5 = i4 + 1;
        int[] iArr = new int[i5];
        this.a = iArr;
        Object[] objArr = new Object[i5];
        this.b = objArr;
        int i6 = this.h;
        while (true) {
            int i7 = i6 - 1;
            if (i6 == 0) {
                return;
            }
            int i8 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (i8 == 0) {
                i3 = this.e;
                this.d = true;
                i2 = 0;
            } else {
                int i9 = this.c;
                int i10 = (-1640531527) * i8;
                int i11 = i10 ^ (i10 >>> 16);
                while (true) {
                    i = i9 & i11;
                    if (iArr[i] == 0) {
                        break;
                    }
                    i9 = i + 1;
                    i11 = this.c;
                }
                i2 = i8;
                i3 = i;
            }
            iArr[i3] = i2;
            objArr[i3] = object;
            i6 = i7;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        aeii aeiiVar = new aeii(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aeiiVar.b();
            objectOutputStream.writeInt(iArr[iB]);
            objectOutputStream.writeObject(objArr[iB]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[EDGE_INSN: B:9:0x001a->B:15:0x002b BREAK  A[LOOP:0: B:11:0x0020->B:28:?], PHI: r2
  0x001a: PHI (r2v7 int) = (r2v1 int), (r2v4 int), (r2v10 int) binds: [B:8:0x0018, B:26:0x001a, B:5:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aegh, defpackage.aeia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != 0) goto La
            boolean r1 = r5.d
            int r2 = r5.e
            if (r1 == 0) goto L1a
            goto L2b
        La:
            int[] r1 = r5.a
            int r2 = r5.c
            r3 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r3 = r3 * r6
            int r4 = r3 >>> 16
            r3 = r3 ^ r4
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L1e
        L1a:
            int r2 = r2 + 1
            int r2 = -r2
            goto L2b
        L1e:
            if (r6 == r3) goto L2b
        L20:
            int r2 = r2 + r0
            int r3 = r5.c
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L29
            goto L1a
        L29:
            if (r6 != r3) goto L20
        L2b:
            if (r2 >= 0) goto L55
            int r1 = -r2
            int r1 = r1 + (-1)
            int r2 = r5.e
            if (r1 != r2) goto L36
            r5.d = r0
        L36:
            int[] r0 = r5.a
            r0[r1] = r6
            java.lang.Object[] r6 = r5.b
            r6[r1] = r7
            int r6 = r5.h
            int r7 = r6 + 1
            r5.h = r7
            int r7 = r5.f
            if (r6 < r7) goto L53
            int r6 = r6 + 2
            r7 = 1061158912(0x3f400000, float:0.75)
            int r6 = defpackage.adqs.p(r6, r7)
            r5.n(r6)
        L53:
            r5 = 0
            return r5
        L55:
            java.lang.Object[] r5 = r5.b
            r6 = r5[r2]
            r5[r2] = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeit.a(int, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aegh, defpackage.aeia
    public final Object b(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return m();
            }
            return null;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return null;
        }
        if (i == i5) {
            return l(i4);
        }
        do {
            i4 = (i4 + 1) & this.c;
            i2 = iArr[i4];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return l(i4);
    }

    @Override // defpackage.aegi, defpackage.aegh, defpackage.aeia
    public final boolean c(int i) {
        int i2;
        if (i == 0) {
            return this.d;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return false;
        }
        if (i != i5) {
            do {
                i4 = (i4 + 1) & this.c;
                i2 = iArr[i4];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // defpackage.aegi, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        Arrays.fill(this.a, 0);
        Arrays.fill(this.b, (Object) null);
    }

    @Override // defpackage.aegi, java.util.Map
    public final boolean containsValue(Object obj) {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        if (this.d && objArr[this.e] == obj) {
            return true;
        }
        int i = this.e;
        while (i != 0) {
            i--;
            if (iArr[i] != 0 && objArr[i] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aegi
    /* renamed from: d */
    public final aekf keySet() {
        if (this.i == null) {
            this.i = new aeil(this);
        }
        return this.i;
    }

    @Override // defpackage.aegi
    /* renamed from: f */
    public final aexk values() {
        if (this.j == null) {
            this.j = new aeih(this);
        }
        return this.j;
    }

    @Override // defpackage.aeia
    public final Object h(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return this.b[this.e];
            }
            return null;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return null;
        }
        if (i == i5) {
            return this.b[i4];
        }
        do {
            i4 = (i4 + 1) & this.c;
            i2 = iArr[i4];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return this.b[i4];
    }

    @Override // defpackage.aegi, java.util.Map
    public final int hashCode() {
        int iIdentityHashCode;
        int i;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int iJ = j();
        int i2 = 0;
        int i3 = 0;
        while (iJ != 0) {
            while (true) {
                iIdentityHashCode = iArr[i2];
                i = i2 + 1;
                if (iIdentityHashCode != 0) {
                    break;
                }
                i2 = i;
            }
            Object obj = objArr[i2];
            if (this != obj) {
                iIdentityHashCode ^= obj == null ? 0 : System.identityHashCode(obj);
            }
            i3 += iIdentityHashCode;
            iJ--;
            i2 = i;
        }
        if (!this.d) {
            return i3;
        }
        Object obj2 = objArr[this.e];
        return i3 + (obj2 != null ? System.identityHashCode(obj2) : 0);
    }

    @Override // defpackage.aeie
    public final /* bridge */ /* synthetic */ aeum i() {
        aeio aeioVar = this.k;
        if (aeioVar != null) {
            return aeioVar;
        }
        aeio aeioVar2 = new aeio(this);
        this.k = aeioVar2;
        return aeioVar2;
    }

    @Override // defpackage.aegi, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final int j() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final aeit clone() {
        try {
            aeit aeitVar = (aeit) super.clone();
            aeitVar.i = null;
            aeitVar.j = null;
            aeitVar.k = null;
            aeitVar.d = this.d;
            aeitVar.a = (int[]) this.a.clone();
            aeitVar.b = (Object[]) this.b.clone();
            return aeitVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.aegi, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Integer> keySet() {
        return keySet();
    }

    public final Object l(int i) {
        int i2;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.h--;
        int[] iArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                i2 = iArr[i3];
                if (i2 == 0) {
                    break loop0;
                }
                int i4 = this.c;
                int i5 = (-1640531527) * i2;
                int i6 = (i5 ^ (i5 >>> 16)) & i4;
                if (i <= i3) {
                    if (i >= i6 || i6 > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < i6 || i6 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            iArr[i] = i2;
            objArr[i] = objArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        objArr[i] = null;
        int i7 = this.e;
        if (i7 > this.g && this.h < this.f / 4 && i7 > 16) {
            n(i7 >> 1);
        }
        return obj;
    }

    public final Object m() {
        this.d = false;
        Object[] objArr = this.b;
        int i = this.e;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.h - 1;
        this.h = i2;
        if (i > this.g && i2 < this.f / 4 && i > 16) {
            n(i >> 1);
        }
        return obj;
    }

    protected final void n(int i) {
        int i2;
        int i3 = i + 1;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int[] iArr2 = new int[i3];
        Object[] objArr2 = new Object[i3];
        int i4 = this.e;
        int iJ = j();
        while (true) {
            int i5 = i - 1;
            if (iJ == 0) {
                objArr2[i] = objArr[this.e];
                this.e = i;
                this.c = i5;
                this.f = adqs.q(i, 0.75f);
                this.a = iArr2;
                this.b = objArr2;
                return;
            }
            do {
                i4--;
                i2 = iArr[i4];
            } while (i2 == 0);
            int i6 = i2 * (-1640531527);
            int i7 = (i6 ^ (i6 >>> 16)) & i5;
            if (iArr2[i7] != 0) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (iArr2[i7] != 0);
            }
            iArr2[i7] = iArr[i4];
            objArr2[i7] = objArr[i4];
            iJ--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aegi, java.util.Map
    public final void putAll(Map<? extends Integer, ? extends V> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            n(iMin);
        }
        if (map instanceof aeie) {
            aety aetyVarA = aeig.a((aeie) map);
            while (aetyVarA.hasNext()) {
                aein aeinVar = (aein) aetyVarA.next();
                a(aeinVar.a(), aeinVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Integer, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Integer, ? extends V> next = it.next();
            adzo.v(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aegh, defpackage.aeee
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aegi, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    public aeit() {
        throw null;
    }
}
