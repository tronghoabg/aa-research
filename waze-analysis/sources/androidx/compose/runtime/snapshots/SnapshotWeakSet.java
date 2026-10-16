package androidx.compose.runtime.snapshots;

import android.R;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import h.a.c;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;
    private int[] hashes = new int[16];
    private WeakReference<T>[] values = new WeakReference[16];

    private final int find(T t, int i2) {
        int i3 = this.size - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.hashes[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    WeakReference<T> weakReference = this.values[i5];
                    return t == (weakReference != null ? weakReference.get() : null) ? i5 : findExactIndex(i5, t, i2);
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r0 = r3.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        if (r4 >= r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r3.hashes[r4] == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        r2 = r3.values[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if (r2 != r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        return -(r3.size + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findExactIndex(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            if (r0 < 0) goto L1c
            int[] r2 = r3.hashes
            r2 = r2[r0]
            if (r2 == r6) goto Lc
            goto L1c
        Lc:
            androidx.compose.runtime.internal.WeakReference<T>[] r2 = r3.values
            r2 = r2[r0]
            if (r2 == 0) goto L16
            java.lang.Object r1 = r2.get()
        L16:
            if (r1 != r5) goto L19
            return r0
        L19:
            int r0 = r0 + (-1)
            goto L2
        L1c:
            int r0 = r3.size
        L1e:
            int r4 = r4 + 1
            if (r4 >= r0) goto L3b
            int[] r2 = r3.hashes
            r2 = r2[r4]
            if (r2 == r6) goto L2c
            int r4 = r4 + 1
            int r3 = -r4
            return r3
        L2c:
            androidx.compose.runtime.internal.WeakReference<T>[] r2 = r3.values
            r2 = r2[r4]
            if (r2 == 0) goto L37
            java.lang.Object r2 = r2.get()
            goto L38
        L37:
            r2 = r1
        L38:
            if (r2 != r5) goto L1e
            return r4
        L3b:
            int r3 = r3.size
            int r3 = r3 + 1
            int r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotWeakSet.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean add(T t) {
        int iFind;
        int i2 = this.size;
        int iIdentityHashCode = System_jvmKt.identityHashCode(t);
        if (i2 > 0) {
            iFind = find(t, iIdentityHashCode);
            if (iFind >= 0) {
                return false;
            }
        } else {
            iFind = -1;
        }
        int i3 = -(iFind + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        int i4 = i3 + 1;
        if (i2 == length) {
            int i5 = length + length;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i5];
            int[] iArr = new int[i5];
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr2, i4, i2 - i3);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i3);
            c.ar(this.hashes, iArr, i4, i3, i2);
            c.aM(this.hashes, iArr, 0, i3, 6);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr, i4, i2 - i3);
            int[] iArr2 = this.hashes;
            c.ar(iArr2, iArr2, i4, i3, i2);
        }
        this.values[i3] = new WeakReference<>(t);
        this.hashes[i3] = iIdentityHashCode;
        this.size++;
        return true;
    }

    public final int[] getHashes$runtime() {
        return this.hashes;
    }

    public final int getSize$runtime() {
        return this.size;
    }

    public final WeakReference<T>[] getValues$runtime() {
        return this.values;
    }

    public final boolean isValid$runtime() {
        WeakReference<T> weakReference;
        int i2 = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i2 > length) {
            return false;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = iArr[i4];
            if (i5 < i3 || (weakReference = weakReferenceArr[i4]) == null) {
                return false;
            }
            Object obj = weakReference.get();
            if (obj != null && i5 != System_jvmKt.identityHashCode(obj)) {
                return false;
            }
            i4++;
            i3 = i5;
        }
        while (i2 < length) {
            if (iArr[i2] != 0 || weakReferenceArr[i2] != null) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public final void removeIf(l<? super T, Boolean> lVar) {
        int size$runtime = getSize$runtime();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size$runtime) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime()[i2];
            R.array arrayVar = weakReference != null ? (Object) weakReference.get() : null;
            if (arrayVar != null && !lVar.invoke(arrayVar).booleanValue()) {
                if (i3 != i2) {
                    getValues$runtime()[i3] = weakReference;
                    getHashes$runtime()[i3] = getHashes$runtime()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < size$runtime; i4++) {
            getValues$runtime()[i4] = null;
            getHashes$runtime()[i4] = 0;
        }
        if (i3 != size$runtime) {
            setSize$runtime(i3);
        }
    }

    public final void setHashes$runtime(int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime(int i2) {
        this.size = i2;
    }

    public final void setValues$runtime(WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
