package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajdv<T> {
    public volatile java.util.concurrent.atomic.AtomicReferenceArray<T> array;

    public ajdv(int i) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
    }

    public final java.lang.Object a(int i) {
        java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void b(int i, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(defpackage.afqt.e(i + 1, length + length));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}
