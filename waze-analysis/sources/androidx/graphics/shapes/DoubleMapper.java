package androidx.graphics.shapes;

import androidx.collection.MutableFloatList;
import h.g.b.o;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DoubleMapper {
    public static final Companion Companion = new Companion(null);
    public static final DoubleMapper Identity;
    private final MutableFloatList sourceValues;
    private final MutableFloatList targetValues;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.5f);
        Identity = new DoubleMapper(new k(fValueOf, fValueOf), new k(fValueOf2, fValueOf2));
    }

    public DoubleMapper(k<Float, Float>... kVarArr) {
        x.f(kVarArr, "mappings");
        int length = kVarArr.length;
        this.sourceValues = new MutableFloatList(length);
        this.targetValues = new MutableFloatList(length);
        int i2 = 0;
        while (true) {
            MutableFloatList mutableFloatList = this.sourceValues;
            if (i2 >= length) {
                FloatMappingKt.validateProgress(mutableFloatList);
                FloatMappingKt.validateProgress(this.targetValues);
                return;
            } else {
                mutableFloatList.add(((Number) kVarArr[i2].c()).floatValue());
                this.targetValues.add(((Number) kVarArr[i2].d()).floatValue());
                i2++;
            }
        }
    }

    public final float map(float f2) {
        return FloatMappingKt.linearMap(this.sourceValues, this.targetValues, f2);
    }

    public final float mapBack(float f2) {
        return FloatMappingKt.linearMap(this.targetValues, this.sourceValues, f2);
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
