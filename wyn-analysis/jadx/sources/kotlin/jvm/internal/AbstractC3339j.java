package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3339j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f39756a = new Object[0];

    public static final void a(StringBuilder sb2, Class cls) {
        while (cls.isArray()) {
            sb2.append("[");
            cls = cls.getComponentType();
            AbstractC3340k.d(cls, "getComponentType(...)");
        }
        if (cls.equals(Void.TYPE)) {
            sb2.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb2.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb2.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb2.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb2.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb2.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb2.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb2.append("F");
        } else {
            if (cls.equals(Double.TYPE)) {
                sb2.append("D");
                return;
            }
            sb2.append("L");
            sb2.append((CharSequence) Bf.r.i0(cls.getName(), '.', '/'));
            sb2.append(";");
        }
    }

    public static final Object[] b(Collection collection) {
        AbstractC3340k.e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f39756a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i5 = 0;
        while (true) {
            int i10 = i5 + 1;
            objArrCopyOf[i5] = it.next();
            if (i10 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i11 = ((i10 * 3) + 1) >>> 1;
                if (i11 <= i10) {
                    i11 = 2147483645;
                    if (i10 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i10);
                AbstractC3340k.d(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i5 = i10;
        }
    }

    public static final Object[] c(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        AbstractC3340k.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i5 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    AbstractC3340k.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i10 = i5 + 1;
                    objArrCopyOf[i5] = it.next();
                    if (i10 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                        AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i10] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i10);
                        AbstractC3340k.d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i5 = i10;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
