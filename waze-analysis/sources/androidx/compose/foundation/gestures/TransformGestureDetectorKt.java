package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2, reason: invalid class name */
    final class AnonymousClass2 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ r<Offset, Offset, Float, Float, ab> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z, r<? super Offset, ? super Offset, ? super Float, ? super Float, ab> rVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$panZoomLock = z;
            this.$onGesture = rVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$panZoomLock, this.$onGesture, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
        
            if (r3 != r1) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0097 -> B:15:0x0099). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m2343anglek4lQ0M(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (fIntBitsToFloat == 0.0f && Float.intBitsToFloat(i2) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat(i2)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z, l<? super PointerInputChange, Boolean> lVar) {
        long jM7996getZeroF1C5BW0 = Offset.Companion.m7996getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (lVar.invoke(pointerInputChange).booleanValue()) {
                jM7996getZeroF1C5BW0 = Offset.m7985plusMKHz9U(jM7996getZeroF1C5BW0, z ? pointerInputChange.m9608getPositionF1C5BW0() : pointerInputChange.m9609getPreviousPositionF1C5BW0());
                i2++;
            }
        }
        return i2 == 0 ? Offset.Companion.m7995getUnspecifiedF1C5BW0() : Offset.m7975divtuRUvjQ(jM7996getZeroF1C5BW0, i2);
    }

    static final boolean calculateCentroid$lambda$0(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed();
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z);
        float fM7978getDistanceimpl = 0.0f;
        if (Offset.m7977equalsimpl0(jCalculateCentroid, Offset.Companion.m7995getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM7978getDistanceimpl += Offset.m7978getDistanceimpl(Offset.m7984minusMKHz9U(z ? pointerInputChange.m9608getPositionF1C5BW0() : pointerInputChange.m9609getPreviousPositionF1C5BW0(), jCalculateCentroid));
                i2++;
            }
        }
        return fM7978getDistanceimpl / i2;
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        return Offset.m7977equalsimpl0(jCalculateCentroid, Offset.Companion.m7995getUnspecifiedF1C5BW0()) ? Offset.Companion.m7996getZeroF1C5BW0() : Offset.m7984minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        float f2;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i2);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i4 = 0;
            }
            i3 += i4;
            i2++;
        }
        if (i3 >= 2) {
            long jCalculateCentroid = calculateCentroid(pointerEvent, true);
            long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i5 = 0; i5 < size2; i5++) {
                PointerInputChange pointerInputChange2 = changes2.get(i5);
                if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                    long jM9608getPositionF1C5BW0 = pointerInputChange2.m9608getPositionF1C5BW0();
                    long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(pointerInputChange2.m9609getPreviousPositionF1C5BW0(), jCalculateCentroid2);
                    long jM7984minusMKHz9U2 = Offset.m7984minusMKHz9U(jM9608getPositionF1C5BW0, jCalculateCentroid);
                    float fM2343anglek4lQ0M = m2343anglek4lQ0M(jM7984minusMKHz9U2) - m2343anglek4lQ0M(jM7984minusMKHz9U);
                    float fM7978getDistanceimpl = Offset.m7978getDistanceimpl(Offset.m7985plusMKHz9U(jM7984minusMKHz9U2, jM7984minusMKHz9U)) / 2.0f;
                    if (fM2343anglek4lQ0M <= 180.0f) {
                        f2 = fM2343anglek4lQ0M < -180.0f ? 360.0f : -360.0f;
                        f4 += fM2343anglek4lQ0M * fM7978getDistanceimpl;
                        f3 += fM7978getDistanceimpl;
                    }
                    fM2343anglek4lQ0M += f2;
                    f4 += fM2343anglek4lQ0M * fM7978getDistanceimpl;
                    f3 += fM7978getDistanceimpl;
                }
            }
            if (f3 != 0.0f) {
                return f4 / f3;
            }
        }
        return 0.0f;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z, r<? super Offset, ? super Offset, ? super Float, ? super Float, ab> rVar, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(z, rVar, null), eVar);
        return objAwaitEachGesture == a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        return calculateCentroid(pointerEvent, z, new l() { // from class: androidx.compose.foundation.gestures.TransformGestureDetectorKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TransformGestureDetectorKt.calculateCentroid$lambda$0((PointerInputChange) obj));
            }
        });
    }
}
