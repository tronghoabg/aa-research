package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.climate.CarClimateFeature;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class RegisterClimateStateRequest {
    static final Set<Integer> ALL_FEATURES = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
    private final List<CarClimateFeature> mRequestFeatures;

    /* compiled from: WazeSource */
    public final class Builder {
        List<CarClimateFeature> mFeatures = new ArrayList();
        final boolean mRegisterAllFeatures;

        public Builder(boolean z) {
            this.mRegisterAllFeatures = z;
        }

        public Builder addClimateRegisterFeatures(CarClimateFeature... carClimateFeatureArr) {
            for (CarClimateFeature carClimateFeature : carClimateFeatureArr) {
                if (!RegisterClimateStateRequest.ALL_FEATURES.contains(Integer.valueOf(carClimateFeature.getFeature()))) {
                    throw new IllegalArgumentException("Invalid flag for registering climate request: " + carClimateFeature.getFeature());
                }
                this.mFeatures.add(carClimateFeature);
            }
            return this;
        }

        public RegisterClimateStateRequest build() {
            return new RegisterClimateStateRequest(this);
        }
    }

    RegisterClimateStateRequest(Builder builder) {
        if (builder.mRegisterAllFeatures) {
            this.mRequestFeatures = DesugarCollections.unmodifiableList(constructAllFeatures());
        } else {
            this.mRequestFeatures = DesugarCollections.unmodifiableList(builder.mFeatures);
        }
    }

    private List<CarClimateFeature> constructAllFeatures() {
        Set<Integer> set = ALL_FEATURES;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new CarClimateFeature.Builder(it.next().intValue()).build());
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.mRequestFeatures, ((RegisterClimateStateRequest) obj).mRequestFeatures);
    }

    public List<CarClimateFeature> getClimateRegisterFeatures() {
        return this.mRequestFeatures;
    }

    public int hashCode() {
        return Objects.hash(this.mRequestFeatures);
    }

    public String toString() {
        return "RegisterClimateStateRequest{mRequestFeatures=" + this.mRequestFeatures + '}';
    }
}
