package com.google.l.b;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f12399e = new o();

    /* renamed from: a, reason: collision with root package name */
    u f12400a;

    /* renamed from: b, reason: collision with root package name */
    int f12401b;

    /* renamed from: c, reason: collision with root package name */
    int f12402c;

    /* renamed from: d, reason: collision with root package name */
    final u f12403d;

    /* renamed from: f, reason: collision with root package name */
    private final Comparator f12404f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12405g;

    /* renamed from: h, reason: collision with root package name */
    private q f12406h;

    /* renamed from: i, reason: collision with root package name */
    private s f12407i;

    public v(Comparator comparator, boolean z) {
        this.f12401b = 0;
        this.f12402c = 0;
        this.f12404f = comparator;
        this.f12405g = z;
        this.f12403d = new u(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(com.google.l.b.u r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.l.b.u r0 = r9.f12391b
            com.google.l.b.u r1 = r9.f12392c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f12398i
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f12398i
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.l.b.u r0 = r1.f12391b
            com.google.l.b.u r3 = r1.f12392c
            if (r3 == 0) goto L22
            int r3 = r3.f12398i
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.f12398i
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.i(r1)
            r8.h(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.h(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.l.b.u r1 = r0.f12391b
            com.google.l.b.u r3 = r0.f12392c
            if (r3 == 0) goto L4e
            int r3 = r3.f12398i
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.f12398i
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.h(r0)
            r8.i(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.i(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.f12398i = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.f12398i = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.l.b.u r9 = r9.f12390a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.b.v.f(com.google.l.b.u, boolean):void");
    }

    private final void g(u uVar, u uVar2) {
        u uVar3 = uVar.f12390a;
        uVar.f12390a = null;
        if (uVar2 != null) {
            uVar2.f12390a = uVar3;
        }
        if (uVar3 == null) {
            this.f12400a = uVar2;
        } else if (uVar3.f12391b == uVar) {
            uVar3.f12391b = uVar2;
        } else {
            uVar3.f12392c = uVar2;
        }
    }

    private final void h(u uVar) {
        u uVar2 = uVar.f12391b;
        u uVar3 = uVar.f12392c;
        u uVar4 = uVar3.f12391b;
        u uVar5 = uVar3.f12392c;
        uVar.f12392c = uVar4;
        if (uVar4 != null) {
            uVar4.f12390a = uVar;
        }
        g(uVar, uVar3);
        uVar3.f12391b = uVar;
        uVar.f12390a = uVar3;
        int iMax = Math.max(uVar2 != null ? uVar2.f12398i : 0, uVar4 != null ? uVar4.f12398i : 0) + 1;
        uVar.f12398i = iMax;
        uVar3.f12398i = Math.max(iMax, uVar5 != null ? uVar5.f12398i : 0) + 1;
    }

    private final void i(u uVar) {
        u uVar2 = uVar.f12391b;
        u uVar3 = uVar.f12392c;
        u uVar4 = uVar2.f12391b;
        u uVar5 = uVar2.f12392c;
        uVar.f12391b = uVar5;
        if (uVar5 != null) {
            uVar5.f12390a = uVar;
        }
        g(uVar, uVar2);
        uVar2.f12392c = uVar;
        uVar.f12390a = uVar2;
        int iMax = Math.max(uVar3 != null ? uVar3.f12398i : 0, uVar5 != null ? uVar5.f12398i : 0) + 1;
        uVar.f12398i = iMax;
        uVar2.f12398i = Math.max(iMax, uVar4 != null ? uVar4.f12398i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    final u a(Object obj, boolean z) {
        int iCompareTo;
        u uVar;
        Comparator comparator = this.f12404f;
        u uVar2 = this.f12400a;
        if (uVar2 != null) {
            Comparable comparable = comparator == f12399e ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(uVar2.f12395f) : comparator.compare(obj, uVar2.f12395f);
                if (iCompareTo == 0) {
                    return uVar2;
                }
                u uVar3 = iCompareTo < 0 ? uVar2.f12391b : uVar2.f12392c;
                if (uVar3 == null) {
                    break;
                }
                uVar2 = uVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i2 = iCompareTo;
        if (!z) {
            return null;
        }
        u uVar4 = this.f12403d;
        if (uVar2 != null) {
            u uVar5 = uVar2;
            uVar = new u(this.f12405g, uVar5, obj, uVar4, uVar4.f12394e);
            if (i2 < 0) {
                uVar5.f12391b = uVar;
            } else {
                uVar5.f12392c = uVar;
            }
            f(uVar5, true);
        } else {
            if (comparator == f12399e && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            uVar = new u(this.f12405g, null, obj, uVar4, uVar4.f12394e);
            this.f12400a = uVar;
        }
        this.f12401b++;
        this.f12402c++;
        return uVar;
    }

    final u b(Map.Entry entry) {
        u uVarC = c(entry.getKey());
        if (uVarC == null || !Objects.equals(uVarC.f12397h, entry.getValue())) {
            return null;
        }
        return uVarC;
    }

    final u c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f12400a = null;
        this.f12401b = 0;
        this.f12402c++;
        u uVar = this.f12403d;
        uVar.f12394e = uVar;
        uVar.f12393d = uVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    final u d(Object obj) {
        u uVarC = c(obj);
        if (uVarC != null) {
            e(uVarC, true);
        }
        return uVarC;
    }

    final void e(u uVar, boolean z) {
        u uVar2;
        u uVar3;
        int i2;
        if (z) {
            u uVar4 = uVar.f12394e;
            uVar4.f12393d = uVar.f12393d;
            uVar.f12393d.f12394e = uVar4;
        }
        u uVar5 = uVar.f12391b;
        u uVar6 = uVar.f12392c;
        u uVar7 = uVar.f12390a;
        int i3 = 0;
        if (uVar5 == null || uVar6 == null) {
            if (uVar5 != null) {
                g(uVar, uVar5);
                uVar.f12391b = null;
            } else if (uVar6 != null) {
                g(uVar, uVar6);
                uVar.f12392c = null;
            } else {
                g(uVar, null);
            }
            f(uVar7, false);
            this.f12401b--;
            this.f12402c++;
            return;
        }
        if (uVar5.f12398i > uVar6.f12398i) {
            do {
                uVar3 = uVar5;
                uVar5 = uVar5.f12392c;
            } while (uVar5 != null);
        } else {
            do {
                uVar2 = uVar6;
                uVar6 = uVar6.f12391b;
            } while (uVar6 != null);
            uVar3 = uVar2;
        }
        e(uVar3, false);
        u uVar8 = uVar.f12391b;
        if (uVar8 != null) {
            i2 = uVar8.f12398i;
            uVar3.f12391b = uVar8;
            uVar8.f12390a = uVar3;
            uVar.f12391b = null;
        } else {
            i2 = 0;
        }
        u uVar9 = uVar.f12392c;
        if (uVar9 != null) {
            i3 = uVar9.f12398i;
            uVar3.f12392c = uVar9;
            uVar9.f12390a = uVar3;
            uVar.f12392c = null;
        }
        uVar3.f12398i = Math.max(i2, i3) + 1;
        g(uVar, uVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        q qVar = this.f12406h;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this.f12406h = qVar2;
        return qVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        u uVarC = c(obj);
        if (uVarC != null) {
            return (V) uVarC.f12397h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        s sVar = this.f12407i;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f12407i = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        if (v == null && !this.f12405g) {
            throw new NullPointerException("value == null");
        }
        u uVarA = a(k2, true);
        V v2 = (V) uVarA.f12397h;
        uVarA.f12397h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        u uVarD = d(obj);
        if (uVarD != null) {
            return (V) uVarD.f12397h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12401b;
    }

    public v() {
        this(f12399e, true);
    }

    public v(byte[] bArr) {
        this(f12399e, false);
    }
}
