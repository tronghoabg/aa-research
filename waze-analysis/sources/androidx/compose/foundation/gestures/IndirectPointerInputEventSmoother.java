package androidx.compose.foundation.gestures;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IndirectPointerInputEventSmoother {
    private static final int SmoothingFactor = 3;
    private MutableObjectList<IndirectPointerInputChange> eventRotatingArray = new MutableObjectList<>(0, 1, null);
    private int eventRotatingIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private static final <T> float smoothEventPosition_tuRUvjQ$averageBy(ObjectList<T> objectList, l<? super T, Float> lVar) {
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        float fFloatValue = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            fFloatValue += lVar.invoke(objArr[i3]).floatValue();
        }
        return fFloatValue / objectList.getSize();
    }

    /* renamed from: smoothEventPosition-tuRUvjQ, reason: not valid java name */
    public final long m2247smoothEventPositiontuRUvjQ(IndirectPointerInputChange indirectPointerInputChange) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m9108getPositionF1C5BW0() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (indirectPointerInputChange.m9108getPositionF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(indirectPointerInputChange)) {
            this.eventRotatingIndex = 0;
            this.eventRotatingArray.clear();
        }
        if (!IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange) && !IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(indirectPointerInputChange)) {
            int size = this.eventRotatingArray.getSize();
            MutableObjectList<IndirectPointerInputChange> mutableObjectList = this.eventRotatingArray;
            if (size == 3) {
                int i2 = this.eventRotatingIndex;
                this.eventRotatingIndex = i2 + 1;
                mutableObjectList.set(i2, indirectPointerInputChange);
            } else {
                mutableObjectList.add(indirectPointerInputChange);
            }
            if (this.eventRotatingIndex == 3) {
                this.eventRotatingIndex = 0;
            }
            fIntBitsToFloat = smoothEventPosition_tuRUvjQ$averageBy(this.eventRotatingArray, new l() { // from class: androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Float.valueOf(Float.intBitsToFloat((int) (((IndirectPointerInputChange) obj).m9108getPositionF1C5BW0() >> 32)));
                }
            });
            fIntBitsToFloat2 = smoothEventPosition_tuRUvjQ$averageBy(this.eventRotatingArray, new l() { // from class: androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Float.valueOf(Float.intBitsToFloat((int) (((IndirectPointerInputChange) obj).m9108getPositionF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
                }
            });
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
