package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public final class aewk<K, V> extends aerc<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient Object[] a;
    protected transient Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    public int h;
    protected transient aexn i;
    protected transient aetv j;
    protected transient aewg k;

    public aewk(int i) {
        int iP = adqs.p(i, 0.75f);
        this.e = iP;
        this.g = iP;
        this.c = iP - 1;
        this.f = adqs.q(iP, 0.75f);
        int i2 = this.e + 1;
        this.a = new Object[i2];
        this.b = new Object[i2];
    }

    private final int k(Object obj) {
        Object obj2;
        if (obj == null) {
            boolean z = this.d;
            int i = this.e;
            return z ? i : -(i + 1);
        }
        Object[] objArr = this.a;
        int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
        int i2 = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i2];
        if (obj3 == null) {
            return -(i2 + 1);
        }
        if (obj != obj3) {
            do {
                i2 = (i2 + 1) & this.c;
                obj2 = objArr[i2];
                if (obj2 == null) {
                    return -(i2 + 1);
                }
            } while (obj != obj2);
        }
        return i2;
    }

    private final void l(int i, Object obj, Object obj2) {
        if (i == this.e) {
            this.d = true;
        }
        this.a[i] = obj;
        this.b[i] = obj2;
        int i2 = this.h;
        this.h = i2 + 1;
        if (i2 >= this.f) {
            i(adqs.p(i2 + 2, 0.75f));
        }
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
        Object[] objArr2 = new Object[i3];
        this.b = objArr2;
        int i4 = this.h;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (object == null) {
                i = this.e;
                this.d = true;
            } else {
                int iIdentityHashCode = System.identityHashCode(object) * (-1640531527);
                int i6 = this.c;
                int i7 = iIdentityHashCode ^ (iIdentityHashCode >>> 16);
                while (true) {
                    i = i7 & i6;
                    if (objArr[i] != null) {
                        i7 = i + 1;
                        i6 = this.c;
                    }
                }
            }
            objArr[i] = object;
            objArr2[i] = object2;
            i4 = i5;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        aewc aewcVar = new aewc(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aewcVar.b();
            objectOutputStream.writeObject(objArr[iB]);
            objectOutputStream.writeObject(objArr2[iB]);
        }
    }

    @Override // defpackage.aerc
    /* renamed from: a */
    public final aetv values() {
        if (this.j == null) {
            this.j = new aewb(this);
        }
        return this.j;
    }

    @Override // defpackage.aerc
    /* renamed from: c */
    public final aexn keySet() {
        if (this.i == null) {
            this.i = new aewe(this);
        }
        return this.i;
    }

    @Override // defpackage.aerc, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        Arrays.fill(this.a, (Object) null);
        Arrays.fill(this.b, (Object) null);
    }

    @Override // defpackage.aerc, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        biFunction.getClass();
        int iK = k(obj);
        Object objApply = biFunction.apply(obj, iK >= 0 ? this.b[iK] : null);
        if (objApply == null) {
            if (iK >= 0) {
                if (obj == null) {
                    h();
                } else {
                    g(iK);
                }
            }
            return null;
        }
        if (iK < 0) {
            l((-iK) - 1, obj, objApply);
            return objApply;
        }
        this.b[iK] = objApply;
        return objApply;
    }

    @Override // defpackage.aerc, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        biFunction.getClass();
        int iK = k(obj);
        if (iK < 0 || (obj2 = this.b[iK]) == null) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            this.b[iK] = objApply;
            return objApply;
        }
        if (obj == null) {
            h();
            return null;
        }
        g(iK);
        return null;
    }

    @Override // defpackage.aerc, defpackage.aerb, defpackage.aeee
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

    @Override // defpackage.aerc, java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (this.d && Objects.equals(objArr2[this.e], obj)) {
            return true;
        }
        int i = this.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null && Objects.equals(objArr2[i], obj)) {
                return true;
            }
        }
        return false;
    }

    public final int e() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aewk clone() {
        try {
            aewk aewkVar = (aewk) super.clone();
            aewkVar.i = null;
            aewkVar.j = null;
            aewkVar.k = null;
            aewkVar.d = this.d;
            aewkVar.a = (Object[]) this.a.clone();
            aewkVar.b = (Object[]) this.b.clone();
            return aewkVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final Object g(int i) {
        Object obj;
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.h--;
        Object[] objArr2 = this.a;
        loop0: while (true) {
            int i2 = (i + 1) & this.c;
            while (true) {
                obj = objArr2[i2];
                if (obj == null) {
                    break loop0;
                }
                int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
                int i3 = this.c;
                int i4 = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & i3;
                if (i <= i2) {
                    if (i >= i4 || i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                } else if (i < i4 || i4 <= i2) {
                    i2 = (i2 + 1) & i3;
                }
            }
            objArr2[i] = obj;
            objArr[i] = objArr[i2];
            i = i2;
        }
        objArr2[i] = null;
        objArr[i] = null;
        int i5 = this.e;
        if (i5 > this.g && this.h < this.f / 4 && i5 > 16) {
            i(i5 >> 1);
        }
        return obj2;
    }

    @Override // defpackage.aevu, defpackage.aeee
    public final V get(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) this.b[this.e];
            }
            return null;
        }
        Object[] objArr = this.a;
        int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return null;
        }
        if (obj == obj3) {
            return (V) this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return null;
            }
        } while (obj != obj2);
        return (V) this.b[i];
    }

    @Override // defpackage.aerc, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        if (obj != null) {
            Object[] objArr = this.a;
            int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
            int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
            Object obj4 = objArr[i];
            if (obj4 != null) {
                if (obj == obj4) {
                    return this.b[i];
                }
                do {
                    i = (i + 1) & this.c;
                    obj3 = objArr[i];
                    if (obj3 != null) {
                    }
                } while (obj != obj3);
                return this.b[i];
            }
        } else if (this.d) {
            return this.b[this.e];
        }
        return obj2;
    }

    public final Object h() {
        this.d = false;
        Object[] objArr = this.a;
        int i = this.e;
        objArr[i] = null;
        Object[] objArr2 = this.b;
        Object obj = objArr2[i];
        objArr2[i] = null;
        int i2 = this.h - 1;
        this.h = i2;
        if (i > this.g && i2 < this.f / 4 && i > 16) {
            i(i >> 1);
        }
        return obj;
    }

    @Override // defpackage.aerc, java.util.Map
    public final int hashCode() {
        Object obj;
        int i;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int iE = e();
        int i2 = 0;
        int i3 = 0;
        int iHashCode = 0;
        while (iE != 0) {
            while (true) {
                obj = objArr[i2];
                i = i2 + 1;
                if (obj != null) {
                    break;
                }
                i2 = i;
            }
            if (this != obj) {
                iHashCode = System.identityHashCode(obj);
            }
            Object obj2 = objArr2[i2];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i3 += iHashCode;
            iE--;
            i2 = i;
        }
        if (!this.d) {
            return i3;
        }
        Object obj3 = objArr2[this.e];
        return i3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    protected final void i(int i) {
        Object obj;
        int i2 = i + 1;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        Object[] objArr3 = new Object[i2];
        Object[] objArr4 = new Object[i2];
        int i3 = this.e;
        int iE = e();
        while (true) {
            int i4 = i - 1;
            if (iE == 0) {
                objArr4[i] = objArr2[this.e];
                this.e = i;
                this.c = i4;
                this.f = adqs.q(i, 0.75f);
                this.a = objArr3;
                this.b = objArr4;
                return;
            }
            do {
                i3--;
                obj = objArr[i3];
            } while (obj == null);
            int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
            int i5 = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & i4;
            if (objArr3[i5] != null) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (objArr3[i5] != null);
            }
            objArr3[i5] = objArr[i3];
            objArr4[i5] = objArr2[i3];
            iE--;
        }
    }

    @Override // defpackage.aerc, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // defpackage.aevy
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final aewg d() {
        aewg aewgVar = this.k;
        if (aewgVar != null) {
            return aewgVar;
        }
        aewg aewgVar2 = new aewg(this);
        this.k = aewgVar2;
        return aewgVar2;
    }

    @Override // defpackage.aerc, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // defpackage.aerc, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj3;
        biFunction.getClass();
        obj2.getClass();
        int iK = k(obj);
        if (iK < 0 || (obj3 = this.b[iK]) == null) {
            if (iK < 0) {
                l((-iK) - 1, obj, obj2);
                return obj2;
            }
            this.b[iK] = obj2;
            return obj2;
        }
        Object objApply = biFunction.apply(obj3, obj2);
        if (objApply != null) {
            this.b[iK] = objApply;
            return objApply;
        }
        if (obj == null) {
            h();
            return null;
        }
        g(iK);
        return null;
    }

    @Override // defpackage.aerc, defpackage.aevy, java.util.Map
    public final V put(K k, V v) {
        int iK = k(k);
        if (iK < 0) {
            l((-iK) - 1, k, v);
            return null;
        }
        Object[] objArr = this.b;
        V v2 = (V) objArr[iK];
        objArr[iK] = v;
        return v2;
    }

    @Override // defpackage.aerc, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            i(iMin);
        }
        if (map instanceof aevy) {
            aety aetyVarA = aewa.a((aevy) map);
            while (aetyVarA.hasNext()) {
                aewx aewxVar = (aewx) aetyVarA.next();
                put(aewxVar.getKey(), aewxVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends K, ? extends V> next = it.next();
            put(next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aerc, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        int iK = k(obj);
        if (iK >= 0) {
            return this.b[iK];
        }
        l((-iK) - 1, obj, obj2);
        return null;
    }

    @Override // defpackage.aerc, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if (obj == null) {
            if (!this.d || !Objects.equals(obj2, this.b[this.e])) {
                return false;
            }
            h();
            return true;
        }
        Object[] objArr = this.a;
        int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (obj == obj3 && Objects.equals(obj2, this.b[i])) {
            g(i);
            return true;
        }
        while (true) {
            i = (i + 1) & this.c;
            Object obj4 = objArr[i];
            if (obj4 == null) {
                return false;
            }
            if (obj == obj4 && Objects.equals(obj2, this.b[i])) {
                g(i);
                return true;
            }
        }
    }

    @Override // defpackage.aerc, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iK = k(obj);
        if (iK < 0 || !Objects.equals(obj2, this.b[iK])) {
            return false;
        }
        this.b[iK] = obj3;
        return true;
    }

    @Override // defpackage.aerb, defpackage.aeee
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aerc, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    @Override // defpackage.aerc, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.b;
        Object obj3 = objArr[iK];
        objArr[iK] = obj2;
        return obj3;
    }

    public aewk() {
        throw null;
    }

    @Override // defpackage.aerc, defpackage.aevy, java.util.Map
    public final V remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) h();
            }
            return null;
        }
        Object[] objArr = this.a;
        int iIdentityHashCode = System.identityHashCode(obj) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return null;
        }
        if (obj != obj3) {
            do {
                i = (i + 1) & this.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return null;
                }
            } while (obj != obj2);
            return (V) g(i);
        }
        return (V) g(i);
    }
}
