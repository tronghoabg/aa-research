package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.graphics.shapes.Feature;
import h.a.i;
import h.b.a;
import h.g.b.x;
import h.k;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FeatureMappingKt {
    private static final List<k<Float, Float>> IdentityMapping;
    private static final String LOG_TAG;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.5f);
        IdentityMapping = i.i(new k(fValueOf, fValueOf), new k(fValueOf2, fValueOf2));
        LOG_TAG = "FeatureMapping";
    }

    public static final List<k<Float, Float>> doMapping(List<ProgressableFeature> list, List<ProgressableFeature> list2) {
        x.f(list, "features1");
        x.f(list2, "features2");
        List listB = i.b();
        for (ProgressableFeature progressableFeature : list) {
            for (ProgressableFeature progressableFeature2 : list2) {
                float fFeatureDistSquared = featureDistSquared(progressableFeature.getFeature(), progressableFeature2.getFeature());
                if (fFeatureDistSquared != Float.MAX_VALUE) {
                    listB.add(new DistanceVertex(fFeatureDistSquared, progressableFeature, progressableFeature2));
                }
            }
        }
        List<DistanceVertex> listAl = i.al(i.a(listB), new Comparator() { // from class: androidx.graphics.shapes.FeatureMappingKt$doMapping$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(Float.valueOf(((DistanceVertex) t).getDistance()), Float.valueOf(((DistanceVertex) t2).getDistance()));
            }
        });
        if (listAl.isEmpty()) {
            return IdentityMapping;
        }
        if (listAl.size() == 1) {
            DistanceVertex distanceVertex = (DistanceVertex) i.P(listAl);
            float progress = distanceVertex.getF1().getProgress();
            float progress2 = distanceVertex.getF2().getProgress();
            return i.i(new k(Float.valueOf(progress), Float.valueOf(progress2)), new k(Float.valueOf((progress + 0.5f) % 1.0f), Float.valueOf((progress2 + 0.5f) % 1.0f)));
        }
        MappingHelper mappingHelper = new MappingHelper();
        for (DistanceVertex distanceVertex2 : listAl) {
            mappingHelper.addMapping(distanceVertex2.getF1(), distanceVertex2.getF2());
        }
        return mappingHelper.getMapping();
    }

    public static final float featureDistSquared(Feature feature, Feature feature2) {
        x.f(feature, "f1");
        x.f(feature2, "f2");
        if ((feature instanceof Feature.Corner) && (feature2 instanceof Feature.Corner) && ((Feature.Corner) feature).getConvex() != ((Feature.Corner) feature2).getConvex()) {
            return Float.MAX_VALUE;
        }
        return PointKt.m11939getDistanceSquaredDnnuFBc(PointKt.m11943minusybeJwSQ(featureRepresentativePoint(feature), featureRepresentativePoint(feature2)));
    }

    public static final DoubleMapper featureMapper(List<ProgressableFeature> list, List<ProgressableFeature> list2) {
        x.f(list, "features1");
        x.f(list2, "features2");
        List listB = i.b();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getFeature() instanceof Feature.Corner) {
                listB.add(list.get(i2));
            }
        }
        List listA = i.a(listB);
        List listB2 = i.b();
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (list2.get(i3).getFeature() instanceof Feature.Corner) {
                listB2.add(list2.get(i3));
            }
        }
        k[] kVarArr = (k[]) doMapping(listA, i.a(listB2)).toArray(new k[0]);
        return new DoubleMapper((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
    }

    private static final CharSequence featureMapper$lambda$2$0(k kVar) {
        x.f(kVar, "it");
        return kVar.c() + " -> " + kVar.d();
    }

    public static final long featureRepresentativePoint(Feature feature) {
        x.f(feature, "feature");
        return FloatFloatPair.m1675constructorimpl((((Cubic) i.P(feature.getCubics())).getAnchor0X() + ((Cubic) i.T(feature.getCubics())).getAnchor1X()) / 2.0f, (((Cubic) i.P(feature.getCubics())).getAnchor0Y() + ((Cubic) i.T(feature.getCubics())).getAnchor1Y()) / 2.0f);
    }
}
