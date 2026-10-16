package h.a.a;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i<K, V> implements Map<K, V>, Serializable, h.g.b.a.e {

    /* renamed from: a, reason: collision with root package name */
    private static final i f47946a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f47947b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f47948c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f47949d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f47950e;

    /* renamed from: f, reason: collision with root package name */
    private int f47951f;

    /* renamed from: g, reason: collision with root package name */
    private int f47952g;

    /* renamed from: h, reason: collision with root package name */
    private int f47953h;

    /* renamed from: i, reason: collision with root package name */
    private int f47954i;

    /* renamed from: j, reason: collision with root package name */
    private int f47955j;

    /* renamed from: k, reason: collision with root package name */
    private k f47956k;

    /* renamed from: l, reason: collision with root package name */
    private l f47957l;
    private j m;
    private boolean n;

    static {
        i iVar = new i(0);
        iVar.n = true;
        f47946a = iVar;
    }

    public i(int i2) {
        Object[] objArrH = h.g.h(i2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[Integer.highestOneBit(h.k.n.h(i2, 1) * 3)];
        this.f47947b = objArrH;
        this.f47948c = null;
        this.f47949d = iArr;
        this.f47950e = iArr2;
        this.f47951f = 2;
        this.f47952g = 0;
        this.f47953h = h.a.c.aO(v());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r3[r0] = r6;
        r5.f47949d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(int r6) {
        /*
            r5 = this;
            r5.z()
            int r0 = r5.f47952g
            int r1 = r5.f47955j
            r2 = 0
            if (r0 <= r1) goto Ld
            r5.x(r2)
        Ld:
            int[] r0 = new int[r6]
            r5.f47950e = r0
            int r6 = h.a.c.aO(r6)
            r5.f47953h = r6
        L17:
            int r6 = r5.f47952g
            if (r2 >= r6) goto L4e
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f47947b
            r0 = r0[r2]
            int r0 = r5.w(r0)
            int r1 = r5.f47951f
        L27:
            int[] r3 = r5.f47950e
            r4 = r3[r0]
            if (r4 != 0) goto L35
            r3[r0] = r6
            int[] r1 = r5.f47949d
            r1[r2] = r0
            r2 = r6
            goto L17
        L35:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L46
            int r3 = r0 + (-1)
            if (r0 != 0) goto L44
            int r0 = r5.v()
            int r0 = r0 + (-1)
            goto L27
        L44:
            r0 = r3
            goto L27
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.a.i.A(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i2) {
        int i3;
        int i4;
        h.g.e(this.f47947b, i2);
        Object[] objArr = this.f47948c;
        if (objArr != null) {
            h.g.e(objArr, i2);
        }
        int iV = this.f47949d[i2];
        loop0: while (true) {
            int i5 = iV;
            int i6 = 0;
            do {
                iV = iV == 0 ? v() - 1 : iV - 1;
                int[] iArr = this.f47950e;
                i3 = iArr[iV];
                i6++;
                if (i6 > this.f47951f) {
                    iArr[i5] = 0;
                    break loop0;
                } else {
                    if (i3 == 0) {
                        iArr[i5] = 0;
                        break loop0;
                    }
                    i4 = i3 - 1;
                }
            } while (((w(this.f47947b[i4]) - iV) & (v() - 1)) < i6);
            this.f47950e[i5] = i3;
            this.f47949d[i4] = i5;
        }
        this.f47949d[i2] = -1;
        this.f47955j--;
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] C() {
        Object[] objArr = this.f47948c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrH = h.g.h(d());
        this.f47948c = objArrH;
        return objArrH;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final int t(Object obj) {
        int iW = w(obj);
        int i2 = this.f47951f;
        while (true) {
            int i3 = this.f47950e[iW];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (x.n(this.f47947b[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            iW = iW == 0 ? v() - 1 : iW - 1;
        }
    }

    private final int u(Object obj) {
        int i2 = this.f47952g;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f47949d[i2] >= 0) {
                Object[] objArr = this.f47948c;
                x.c(objArr);
                if (x.n(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    private final int v() {
        return this.f47950e.length;
    }

    private final int w(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f47953h;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.n) {
            return new n(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void x(boolean z) {
        int i2;
        Object[] objArr = this.f47948c;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.f47952g;
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.f47949d;
            int i5 = iArr[i3];
            if (i5 >= 0) {
                int i6 = i4 + 1;
                Object[] objArr2 = this.f47947b;
                objArr2[i4] = objArr2[i3];
                if (objArr != null) {
                    objArr[i4] = objArr[i3];
                }
                if (z) {
                    iArr[i4] = i5;
                    this.f47950e[i5] = i6;
                }
                i4 = i6;
            }
            i3++;
        }
        h.g.f(this.f47947b, i4, i2);
        if (objArr != null) {
            h.g.f(objArr, i4, this.f47952g);
        }
        this.f47952g = i4;
    }

    private final void y(int i2) {
        int iD = d();
        int i3 = this.f47952g;
        int i4 = iD - i3;
        int i5 = i3 - this.f47955j;
        if (i4 < i2 && i4 + i5 >= i2 && i5 >= (d() >> 2)) {
            x(true);
            return;
        }
        int i6 = this.f47952g + i2;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > d()) {
            int iD2 = h.a.c.d(d(), i6);
            this.f47947b = h.g.i(this.f47947b, iD2);
            Object[] objArr = this.f47948c;
            this.f47948c = objArr != null ? h.g.i(objArr, iD2) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f47949d, iD2);
            x.e(iArrCopyOf, "copyOf(...)");
            this.f47949d = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit(h.k.n.h(iD2, 1) * 3);
            if (iHighestOneBit > v()) {
                A(iHighestOneBit);
            }
        }
    }

    private final void z() {
        this.f47954i++;
    }

    public final int c(Object obj) {
        i();
        while (true) {
            int iW = w(obj);
            int i2 = this.f47951f;
            int i3 = i2 + i2;
            int iV = v() >> 1;
            int i4 = 0;
            while (true) {
                int i5 = this.f47950e[iW];
                if (i5 == 0) {
                    if (this.f47952g < d()) {
                        int i6 = this.f47952g;
                        int i7 = i6 + 1;
                        this.f47952g = i7;
                        this.f47947b[i6] = obj;
                        this.f47949d[i6] = iW;
                        this.f47950e[iW] = i7;
                        this.f47955j++;
                        z();
                        if (i4 > this.f47951f) {
                            this.f47951f = i4;
                        }
                        return i6;
                    }
                    y(1);
                } else {
                    if (x.n(this.f47947b[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > h.k.n.i(i3, iV)) {
                        int iV2 = v();
                        A(iV2 + iV2);
                        break;
                    }
                    iW = iW == 0 ? v() - 1 : iW - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        i();
        int i2 = this.f47952g - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f47949d;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.f47950e[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        h.g.f(this.f47947b, 0, this.f47952g);
        Object[] objArr = this.f47948c;
        if (objArr != null) {
            h.g.f(objArr, 0, this.f47952g);
        }
        this.f47955j = 0;
        this.f47952g = 0;
        z();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return t(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return u(obj) >= 0;
    }

    public final int d() {
        return this.f47947b.length;
    }

    public final int e() {
        return this.f47955j;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        j jVar = this.m;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.m = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f47955j == map.size() && j(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final Map f() {
        i();
        this.n = true;
        if (this.f47955j > 0) {
            return this;
        }
        i iVar = f47946a;
        x.d(iVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return iVar;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        int iT = t(obj);
        if (iT < 0) {
            return null;
        }
        Object[] objArr = this.f47948c;
        x.c(objArr);
        return (V) objArr[iT];
    }

    @Override // java.util.Map
    public final int hashCode() {
        e eVar = new e(this);
        int i2 = 0;
        while (eVar.hasNext()) {
            if (eVar.a() >= eVar.c().f47952g) {
                throw new NoSuchElementException();
            }
            int iA = eVar.a();
            eVar.f(iA + 1);
            eVar.g(iA);
            Object obj = eVar.c().f47947b[eVar.b()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.c().f47948c;
            x.c(objArr);
            Object obj2 = objArr[eVar.b()];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            eVar.e();
            i2 += iHashCode ^ iHashCode2;
        }
        return i2;
    }

    public final void i() {
        if (this.n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f47955j == 0;
    }

    public final boolean j(Collection collection) {
        x.f(collection, CmcdData.OBJECT_TYPE_MANIFEST);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!k((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean k(Map.Entry entry) {
        x.f(entry, "entry");
        int iT = t(entry.getKey());
        if (iT < 0) {
            return false;
        }
        Object[] objArr = this.f47948c;
        x.c(objArr);
        return x.n(objArr[iT], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        k kVar = this.f47956k;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.f47956k = kVar2;
        return kVar2;
    }

    public final boolean l() {
        return this.n;
    }

    public final boolean m(Map.Entry entry) {
        x.f(entry, "entry");
        i();
        int iT = t(entry.getKey());
        if (iT < 0) {
            return false;
        }
        Object[] objArr = this.f47948c;
        x.c(objArr);
        if (!x.n(objArr[iT], entry.getValue())) {
            return false;
        }
        B(iT);
        return true;
    }

    public final boolean n(Object obj) {
        i();
        int iT = t(obj);
        if (iT < 0) {
            return false;
        }
        B(iT);
        return true;
    }

    public final boolean o(Object obj) {
        i();
        int iU = u(obj);
        if (iU < 0) {
            return false;
        }
        B(iU);
        return true;
    }

    @Override // java.util.Map
    public final V put(K k2, V v) {
        i();
        int iC = c(k2);
        Object[] objArrC = C();
        if (iC >= 0) {
            objArrC[iC] = v;
            return null;
        }
        int i2 = (-iC) - 1;
        V v2 = (V) objArrC[i2];
        objArrC[i2] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        x.f(map, TypedValues.TransitionType.S_FROM);
        i();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        y(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iC = c(entry.getKey());
            Object[] objArrC = C();
            if (iC >= 0) {
                objArrC[iC] = entry.getValue();
            } else {
                int i2 = (-iC) - 1;
                if (!x.n(entry.getValue(), objArrC[i2])) {
                    objArrC[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        i();
        int iT = t(obj);
        if (iT < 0) {
            return null;
        }
        Object[] objArr = this.f47948c;
        x.c(objArr);
        V v = (V) objArr[iT];
        B(iT);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f47955j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f47955j * 3) + 2);
        sb.append("{");
        e eVar = new e(this);
        int i2 = 0;
        while (eVar.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            x.f(sb, "sb");
            if (eVar.a() >= eVar.c().f47952g) {
                throw new NoSuchElementException();
            }
            int iA = eVar.a();
            eVar.f(iA + 1);
            eVar.g(iA);
            Object obj = eVar.c().f47947b[eVar.b()];
            if (obj == eVar.c()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.c().f47948c;
            x.c(objArr);
            Object obj2 = objArr[eVar.b()];
            if (obj2 == eVar.c()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            eVar.e();
            i2++;
        }
        sb.append("}");
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        l lVar = this.f47957l;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f47957l = lVar2;
        return lVar2;
    }

    public i() {
        this(8);
    }
}
