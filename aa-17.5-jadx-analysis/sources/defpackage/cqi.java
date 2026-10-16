package defpackage;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cqi {
    private long d;
    private boolean h;
    private boolean i;
    private cja j;
    private boolean k;
    public final SparseLongArray a = new SparseLongArray();
    public final SparseBooleanArray b = new SparseBooleanArray();
    private final List e = new ArrayList();
    public final zs c = new zs(10);
    private int f = -1;
    private int g = -1;

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f A[EDGE_INSN: B:90:0x017f->B:63:0x017f BREAK  A[LOOP:0: B:39:0x00d5->B:62:0x0179], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.cqw g(defpackage.crd r49, android.view.MotionEvent r50, defpackage.cja r51, int r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqi.g(crd, android.view.MotionEvent, cja, int, boolean):cqw");
    }

    private final void h() {
        this.h = false;
        this.i = false;
        this.j = null;
        this.k = false;
    }

    public final long a(int i) {
        SparseLongArray sparseLongArray = this.a;
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseLongArray.valueAt(iIndexOfKey);
        }
        long j = this.d;
        this.d = 1 + j;
        sparseLongArray.put(i, j);
        return j;
    }

    public final void b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            SparseLongArray sparseLongArray = this.a;
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.d;
                this.d = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        SparseLongArray sparseLongArray2 = this.a;
        if (sparseLongArray2.indexOfKey(pointerId2) < 0) {
            long j2 = this.d;
            this.d = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.b.put(pointerId2, true);
            }
        }
    }

    public final void c(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (source == 8194 || source == 1048584) {
            if (source == this.g && (toolType == this.f || toolType == 3 || toolType == 1)) {
                return;
            }
        } else if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.b.clear();
        this.a.clear();
    }

    public final void d(int i) {
        this.b.delete(i);
        this.a.delete(i);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            SparseBooleanArray sparseBooleanArray = this.b;
            if (!sparseBooleanArray.get(pointerId, false)) {
                this.a.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        SparseLongArray sparseLongArray = this.a;
        if (sparseLongArray.size() <= motionEvent.getPointerCount()) {
            return;
        }
        int size = sparseLongArray.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            int iKeyAt = sparseLongArray.keyAt(size);
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (true) {
                if (i >= pointerCount) {
                    sparseLongArray.removeAt(size);
                    this.b.delete(iKeyAt);
                    break;
                } else if (motionEvent.getPointerId(i) == iKeyAt) {
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tj f(android.view.MotionEvent r19, defpackage.crd r20) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqi.f(android.view.MotionEvent, crd):tj");
    }
}
