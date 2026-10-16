package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afft {
    private static final java.lang.Object[] a = new java.lang.Object[0];

    public static final java.lang.Object[] a(java.util.Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
        int i = 0;
        while (true) {
            objArrCopyOf[i] = it.next();
            i++;
            if (i >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
                objArrCopyOf.getClass();
            } else if (!it.hasNext()) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i);
                objArrCopyOf2.getClass();
                return objArrCopyOf2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final java.lang.Object[] b(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (java.lang.Object[]) objNewInstance;
                }
                while (true) {
                    objArrCopyOf[i] = it.next();
                    i++;
                    if (i >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i2 = ((i * 3) + 1) >>> 1;
                        if (i2 <= i) {
                            i2 = 2147483645;
                            if (i >= 2147483645) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
                        objArrCopyOf.getClass();
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i] = null;
                            return objArr;
                        }
                        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i);
                        objArrCopyOf2.getClass();
                        return objArrCopyOf2;
                    }
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }
}
