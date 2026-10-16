package androidx.compose.ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ChildLayerDependenciesTracker {
    public static final int $stable = 8;
    private MutableScatterSet<GraphicsLayer> dependenciesSet;
    private GraphicsLayer dependency;
    private MutableScatterSet<GraphicsLayer> oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null) {
            mutableScatterSet.add(graphicsLayer);
        } else if (this.dependency != null) {
            MutableScatterSet<GraphicsLayer> mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            GraphicsLayer graphicsLayer2 = this.dependency;
            if (graphicsLayer2 == null) {
                x.g();
            }
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer2);
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer);
            this.dependenciesSet = mutableScatterSetMutableScatterSetOf;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet2 = this.oldDependenciesSet;
        if (mutableScatterSet2 != null) {
            return !mutableScatterSet2.remove(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeDependencies(h.g.a.l<? super androidx.compose.ui.graphics.layer.GraphicsLayer, h.ab> r18) {
        /*
            r17 = this;
            r0 = r18
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = access$getDependency$p(r17)
            if (r1 == 0) goto L12
            r0.invoke(r1)
            r1 = 0
            r2 = r17
            access$setDependency$p(r2, r1)
            goto L14
        L12:
            r2 = r17
        L14:
            androidx.collection.MutableScatterSet r1 = access$getDependenciesSet$p(r2)
            if (r1 == 0) goto L63
            r2 = r1
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
            java.lang.Object[] r3 = r2.elements
            long[] r2 = r2.metadata
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L60
            r5 = 0
            r6 = r5
        L28:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5b
            int r9 = r6 - r4
            r10 = r5
        L3b:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L59
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L55
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            r0.invoke(r11)
        L55:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L3b
        L59:
            if (r11 != r12) goto L60
        L5b:
            if (r6 == r4) goto L60
            int r6 = r6 + 1
            goto L28
        L60:
            r1.clear()
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.removeDependencies(h.g.a.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void withTracking(h.g.a.l<? super androidx.compose.ui.graphics.layer.GraphicsLayer, h.ab> r18, h.g.a.a<h.ab> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = access$getDependency$p(r0)
            access$setOldDependency$p(r0, r2)
            androidx.collection.MutableScatterSet r2 = access$getDependenciesSet$p(r0)
            if (r2 == 0) goto L2d
            boolean r3 = r2.isNotEmpty()
            if (r3 == 0) goto L2d
            androidx.collection.MutableScatterSet r3 = access$getOldDependenciesSet$p(r0)
            if (r3 != 0) goto L24
            androidx.collection.MutableScatterSet r3 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            access$setOldDependenciesSet$p(r0, r3)
        L24:
            r4 = r2
            androidx.collection.ScatterSet r4 = (androidx.collection.ScatterSet) r4
            r3.addAll(r4)
            r2.clear()
        L2d:
            r2 = 1
            access$setTrackingInProgress$p(r0, r2)
            r19.invoke()
            r2 = 0
            access$setTrackingInProgress$p(r0, r2)
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = access$getOldDependency$p(r0)
            if (r3 == 0) goto L41
            r1.invoke(r3)
        L41:
            androidx.collection.MutableScatterSet r0 = access$getOldDependenciesSet$p(r0)
            if (r0 == 0) goto L95
            boolean r3 = r0.isNotEmpty()
            if (r3 == 0) goto L95
            r3 = r0
            androidx.collection.ScatterSet r3 = (androidx.collection.ScatterSet) r3
            java.lang.Object[] r4 = r3.elements
            long[] r3 = r3.metadata
            int r5 = r3.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L92
            r6 = r2
        L5a:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L8d
            int r9 = r6 - r5
            r10 = r2
        L6d:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L8b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L87
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r4[r11]
            r1.invoke(r11)
        L87:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L6d
        L8b:
            if (r11 != r12) goto L92
        L8d:
            if (r6 == r5) goto L92
            int r6 = r6 + 1
            goto L5a
        L92:
            r0.clear()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.withTracking(h.g.a.l, h.g.a.a):void");
    }
}
