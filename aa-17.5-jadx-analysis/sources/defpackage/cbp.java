package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cbp<E> extends cbi<E> implements List<E>, cbe {
    public static final cbp a = new cbp(new Object[0]);
    private final Object[] b;

    public cbp(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.cbf
    public final cbf b(Object obj) {
        if (a() >= 32) {
            return new cbk(this.b, czz.ag(obj), a() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + 1);
        objArrCopyOf.getClass();
        objArrCopyOf[a()] = obj;
        return new cbp(objArrCopyOf);
    }

    @Override // defpackage.cbf
    public final cbf c(int i, Object obj) {
        a.aH(i, a());
        if (i == a()) {
            return b(obj);
        }
        int i2 = i + 1;
        if (a() >= 32) {
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            woy.dq(objArr, objArrCopyOf, i2, i, a() - 1);
            objArrCopyOf[i] = obj;
            return new cbk(objArrCopyOf, czz.ag(objArr[31]), a() + 1, 0);
        }
        int iA = a() + 1;
        Object[] objArr2 = this.b;
        Object[] objArr3 = new Object[iA];
        woy.dB(objArr2, objArr3, 0, i, 6);
        woy.dq(objArr2, objArr3, i2, i, a());
        objArr3[i] = obj;
        return new cbp(objArr3);
    }

    @Override // defpackage.cbi, defpackage.cbf
    public final cbf d(Collection collection) {
        if (a() + collection.size() > 32) {
            cbl cblVarJ = j();
            cblVarJ.addAll(collection);
            return cblVarJ.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + collection.size());
        objArrCopyOf.getClass();
        int iA = a();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[iA] = it.next();
            iA++;
        }
        return new cbp(objArrCopyOf);
    }

    @Override // defpackage.cbf
    public final cbf g(afec afecVar) {
        Object[] objArr = this.b;
        int iA = a();
        int iA2 = a();
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < iA2; i++) {
            Object obj = objArr[i];
            if (((Boolean) afecVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    objArrCopyOf.getClass();
                    z = true;
                    iA = i;
                }
            } else if (z) {
                objArrCopyOf[iA] = obj;
                iA++;
            }
        }
        return iA == a() ? this : iA == 0 ? a : new cbp(woy.cI(objArrCopyOf, 0, iA));
    }

    @Override // defpackage.afar, java.util.List
    public final E get(int i) {
        a.aG(i, a());
        return (E) this.b[i];
    }

    @Override // defpackage.cbf
    public final cbf h(int i) {
        a.aG(i, a());
        if (a() == 1) {
            return a;
        }
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, a() - 1);
        objArrCopyOf.getClass();
        woy.dq(objArr, objArrCopyOf, i, i + 1, a());
        return new cbp(objArrCopyOf);
    }

    @Override // defpackage.cbf
    public final cbf i(int i, Object obj) {
        a.aG(i, a());
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = obj;
        return new cbp(objArrCopyOf);
    }

    @Override // defpackage.afar, java.util.List
    public final int indexOf(Object obj) {
        return woy.cP(this.b, obj);
    }

    @Override // defpackage.cbf
    public final cbl j() {
        return new cbl(this, null, this.b, 0);
    }

    @Override // defpackage.afar, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (affa.f(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.afar, java.util.List
    public final ListIterator<E> listIterator(int i) {
        a.aH(i, a());
        return new cbj(this.b, i, a());
    }
}
