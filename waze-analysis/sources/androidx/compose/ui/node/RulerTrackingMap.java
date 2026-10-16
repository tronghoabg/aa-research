package androidx.compose.ui.node;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.layout.Ruler;
import h.a.c;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RulerTrackingMap {
    private int size;
    private Ruler[] rulers = new Ruler[32];
    private float[] values = new float[32];
    private byte[] accessFlags = new byte[32];
    private MutableScatterSet<WeakReference<LayoutNode>> layoutNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<Ruler> newRulers = ScatterSetKt.mutableScatterSetOf();

    public final void clear() {
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            this.rulers[i3] = null;
            this.values[i3] = Float.NaN;
            this.accessFlags[i3] = 0;
        }
        this.size = 0;
    }

    public final boolean contains(Ruler ruler) {
        return c.aj(this.rulers, ruler);
    }

    public final float getOrDefault(Ruler ruler, float f2) {
        int iC = c.C(this.rulers, ruler);
        return iC < 0 ? f2 : this.values[iC];
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void notifyChanged(boolean r22, androidx.compose.ui.node.LookaheadCapablePlaceable r23, androidx.collection.MutableScatterMap<androidx.compose.ui.layout.Ruler, androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>>> r24) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.RulerTrackingMap.notifyChanged(boolean, androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.collection.MutableScatterMap):void");
    }

    public final void set(Ruler ruler, float f2) {
        int iC = c.C(this.rulers, ruler);
        if (iC >= 0) {
            float[] fArr = this.values;
            if (fArr[iC] != f2) {
                fArr[iC] = f2;
                this.accessFlags[iC] = 1;
                return;
            } else {
                byte[] bArr = this.accessFlags;
                if (bArr[iC] == 2) {
                    bArr[iC] = 0;
                    return;
                }
                return;
            }
        }
        int i2 = this.size;
        Ruler[] rulerArr = this.rulers;
        if (i2 == rulerArr.length) {
            int i3 = i2 + i2;
            Object[] objArrCopyOf = Arrays.copyOf(rulerArr, i3);
            x.e(objArrCopyOf, "copyOf(...)");
            this.rulers = (Ruler[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(this.values, i3);
            x.e(fArrCopyOf, "copyOf(...)");
            this.values = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(this.accessFlags, i3);
            x.e(bArrCopyOf, "copyOf(...)");
            this.accessFlags = bArrCopyOf;
        }
        this.rulers[i2] = ruler;
        this.accessFlags[i2] = 3;
        this.values[i2] = f2;
        this.size++;
    }
}
