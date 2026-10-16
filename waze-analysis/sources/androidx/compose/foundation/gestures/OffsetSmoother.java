package androidx.compose.foundation.gestures;

import androidx.collection.LongList;
import androidx.collection.MutableLongList;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OffsetSmoother {
    public static final int $stable = 8;
    private MutableLongList eventRotatingArray = new MutableLongList(0, 1, null);
    private int eventRotatingIndex;

    private static final float smoothEventPosition_MK_Hz9U$averageBy(LongList longList, l<? super Long, Float> lVar) {
        long[] jArr = longList.content;
        int i2 = longList._size;
        float fFloatValue = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            fFloatValue += lVar.invoke(Long.valueOf(jArr[i3])).floatValue();
        }
        return fFloatValue / longList._size;
    }

    public final void reset() {
        this.eventRotatingIndex = 0;
        this.eventRotatingArray.clear();
    }

    /* renamed from: smoothEventPosition-MK-Hz9U, reason: not valid java name */
    public final long m2257smoothEventPositionMKHz9U(long j2) {
        MutableLongList mutableLongList = this.eventRotatingArray;
        if (mutableLongList._size == 3) {
            int i2 = this.eventRotatingIndex;
            this.eventRotatingIndex = i2 + 1;
            mutableLongList.set(i2, j2);
        } else {
            mutableLongList.add(j2);
        }
        if (this.eventRotatingIndex == 3) {
            this.eventRotatingIndex = 0;
        }
        float fSmoothEventPosition_MK_Hz9U$averageBy = smoothEventPosition_MK_Hz9U$averageBy(this.eventRotatingArray, new l() { // from class: androidx.compose.foundation.gestures.OffsetSmoother$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Float.valueOf(Float.intBitsToFloat((int) (((Long) obj).longValue() >> 32)));
            }
        });
        float fSmoothEventPosition_MK_Hz9U$averageBy2 = smoothEventPosition_MK_Hz9U$averageBy(this.eventRotatingArray, new l() { // from class: androidx.compose.foundation.gestures.OffsetSmoother$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Float.valueOf(Float.intBitsToFloat((int) (((Long) obj).longValue() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            }
        });
        return (Float.floatToRawIntBits(fSmoothEventPosition_MK_Hz9U$averageBy) << 32) | (Float.floatToRawIntBits(fSmoothEventPosition_MK_Hz9U$averageBy2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
