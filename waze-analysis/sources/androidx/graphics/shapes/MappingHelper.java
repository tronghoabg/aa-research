package androidx.graphics.shapes;

import h.a.i;
import h.b.a;
import h.g.a.l;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MappingHelper {
    private final List<k<Float, Float>> mapping = new ArrayList();
    private final Set<ProgressableFeature> usedF1 = new LinkedHashSet();
    private final Set<ProgressableFeature> usedF2 = new LinkedHashSet();

    public final void addMapping(ProgressableFeature progressableFeature, ProgressableFeature progressableFeature2) {
        x.f(progressableFeature, "f1");
        x.f(progressableFeature2, "f2");
        if (this.usedF1.contains(progressableFeature) || this.usedF2.contains(progressableFeature2)) {
            return;
        }
        List<k<Float, Float>> list = this.mapping;
        final Float fValueOf = Float.valueOf(progressableFeature.getProgress());
        int iAG = i.aG(list, list.size(), new l<k<? extends Float, ? extends Float>, Integer>() { // from class: androidx.graphics.shapes.MappingHelper$addMapping$$inlined$binarySearchBy$default$1
            @Override // h.g.a.l
            public final Integer invoke(k<? extends Float, ? extends Float> kVar) {
                return Integer.valueOf(a.a((Float) kVar.c(), fValueOf));
            }
        });
        if (iAG >= 0) {
            throw new IllegalArgumentException("There can't be two features with the same progress");
        }
        int i2 = (-iAG) - 1;
        int size = this.mapping.size();
        if (size > 0) {
            k<Float, Float> kVar = this.mapping.get(((i2 + size) - 1) % size);
            float fFloatValue = ((Number) kVar.a()).floatValue();
            float fFloatValue2 = ((Number) kVar.b()).floatValue();
            k<Float, Float> kVar2 = this.mapping.get(i2 % size);
            float fFloatValue3 = ((Number) kVar2.a()).floatValue();
            float fFloatValue4 = ((Number) kVar2.b()).floatValue();
            if (FloatMappingKt.progressDistance(progressableFeature.getProgress(), fFloatValue) < 1.0E-4f || FloatMappingKt.progressDistance(progressableFeature.getProgress(), fFloatValue3) < 1.0E-4f || FloatMappingKt.progressDistance(progressableFeature2.getProgress(), fFloatValue2) < 1.0E-4f || FloatMappingKt.progressDistance(progressableFeature2.getProgress(), fFloatValue4) < 1.0E-4f) {
                return;
            }
            if (size > 1 && !FloatMappingKt.progressInRange(progressableFeature2.getProgress(), fFloatValue2, fFloatValue4)) {
                return;
            }
        }
        this.mapping.add(i2, new k<>(Float.valueOf(progressableFeature.getProgress()), Float.valueOf(progressableFeature2.getProgress())));
        this.usedF1.add(progressableFeature);
        this.usedF2.add(progressableFeature2);
    }

    public final List<k<Float, Float>> getMapping() {
        return this.mapping;
    }
}
