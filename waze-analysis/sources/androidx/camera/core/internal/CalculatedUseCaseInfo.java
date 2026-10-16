package androidx.camera.core.internal;

import androidx.camera.core.UseCase;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.streamsharing.StreamSharing;
import h.g.b.x;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CalculatedUseCaseInfo {
    private final Collection<UseCase> appUseCases;
    private final Collection<UseCase> cameraUseCases;
    private final List<UseCase> cameraUseCasesToAttach;
    private final List<UseCase> cameraUseCasesToDetach;
    private final List<UseCase> cameraUseCasesToKeep;
    private final UseCase placeholderForExtensions;
    private final StreamSpecQueryResult primaryStreamSpecResult;
    private final StreamSpecQueryResult secondaryStreamSpecResult;
    private final StreamSharing streamSharing;
    private final Map<UseCase, CameraUseCaseAdapter.ConfigPair> useCaseConfigs;

    /* JADX WARN: Multi-variable type inference failed */
    public CalculatedUseCaseInfo(Collection<? extends UseCase> collection, Collection<? extends UseCase> collection2, List<? extends UseCase> list, List<? extends UseCase> list2, List<? extends UseCase> list3, StreamSharing streamSharing, UseCase useCase, Map<UseCase, ? extends CameraUseCaseAdapter.ConfigPair> map, StreamSpecQueryResult streamSpecQueryResult, StreamSpecQueryResult streamSpecQueryResult2) {
        x.f(collection, "appUseCases");
        x.f(collection2, "cameraUseCases");
        x.f(list, "cameraUseCasesToAttach");
        x.f(list2, "cameraUseCasesToKeep");
        x.f(list3, "cameraUseCasesToDetach");
        x.f(map, "useCaseConfigs");
        x.f(streamSpecQueryResult, "primaryStreamSpecResult");
        this.appUseCases = collection;
        this.cameraUseCases = collection2;
        this.cameraUseCasesToAttach = list;
        this.cameraUseCasesToKeep = list2;
        this.cameraUseCasesToDetach = list3;
        this.streamSharing = streamSharing;
        this.placeholderForExtensions = useCase;
        this.useCaseConfigs = map;
        this.primaryStreamSpecResult = streamSpecQueryResult;
        this.secondaryStreamSpecResult = streamSpecQueryResult2;
    }

    public static /* synthetic */ CalculatedUseCaseInfo copy$default(CalculatedUseCaseInfo calculatedUseCaseInfo, Collection collection, Collection collection2, List list, List list2, List list3, StreamSharing streamSharing, UseCase useCase, Map map, StreamSpecQueryResult streamSpecQueryResult, StreamSpecQueryResult streamSpecQueryResult2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            collection = calculatedUseCaseInfo.appUseCases;
        }
        if ((i2 & 2) != 0) {
            collection2 = calculatedUseCaseInfo.cameraUseCases;
        }
        if ((i2 & 4) != 0) {
            list = calculatedUseCaseInfo.cameraUseCasesToAttach;
        }
        if ((i2 & 8) != 0) {
            list2 = calculatedUseCaseInfo.cameraUseCasesToKeep;
        }
        if ((i2 & 16) != 0) {
            list3 = calculatedUseCaseInfo.cameraUseCasesToDetach;
        }
        if ((i2 & 32) != 0) {
            streamSharing = calculatedUseCaseInfo.streamSharing;
        }
        if ((i2 & 64) != 0) {
            useCase = calculatedUseCaseInfo.placeholderForExtensions;
        }
        if ((i2 & 128) != 0) {
            map = calculatedUseCaseInfo.useCaseConfigs;
        }
        if ((i2 & 256) != 0) {
            streamSpecQueryResult = calculatedUseCaseInfo.primaryStreamSpecResult;
        }
        if ((i2 & 512) != 0) {
            streamSpecQueryResult2 = calculatedUseCaseInfo.secondaryStreamSpecResult;
        }
        StreamSpecQueryResult streamSpecQueryResult3 = streamSpecQueryResult;
        StreamSpecQueryResult streamSpecQueryResult4 = streamSpecQueryResult2;
        UseCase useCase2 = useCase;
        Map map2 = map;
        List list4 = list3;
        StreamSharing streamSharing2 = streamSharing;
        return calculatedUseCaseInfo.copy(collection, collection2, list, list2, list4, streamSharing2, useCase2, map2, streamSpecQueryResult3, streamSpecQueryResult4);
    }

    public final Collection<UseCase> component1() {
        return this.appUseCases;
    }

    public final StreamSpecQueryResult component10() {
        return this.secondaryStreamSpecResult;
    }

    public final Collection<UseCase> component2() {
        return this.cameraUseCases;
    }

    public final List<UseCase> component3() {
        return this.cameraUseCasesToAttach;
    }

    public final List<UseCase> component4() {
        return this.cameraUseCasesToKeep;
    }

    public final List<UseCase> component5() {
        return this.cameraUseCasesToDetach;
    }

    public final StreamSharing component6() {
        return this.streamSharing;
    }

    public final UseCase component7() {
        return this.placeholderForExtensions;
    }

    public final Map<UseCase, CameraUseCaseAdapter.ConfigPair> component8() {
        return this.useCaseConfigs;
    }

    public final StreamSpecQueryResult component9() {
        return this.primaryStreamSpecResult;
    }

    public final CalculatedUseCaseInfo copy(Collection<? extends UseCase> collection, Collection<? extends UseCase> collection2, List<? extends UseCase> list, List<? extends UseCase> list2, List<? extends UseCase> list3, StreamSharing streamSharing, UseCase useCase, Map<UseCase, ? extends CameraUseCaseAdapter.ConfigPair> map, StreamSpecQueryResult streamSpecQueryResult, StreamSpecQueryResult streamSpecQueryResult2) {
        x.f(collection, "appUseCases");
        x.f(collection2, "cameraUseCases");
        x.f(list, "cameraUseCasesToAttach");
        x.f(list2, "cameraUseCasesToKeep");
        x.f(list3, "cameraUseCasesToDetach");
        x.f(map, "useCaseConfigs");
        x.f(streamSpecQueryResult, "primaryStreamSpecResult");
        return new CalculatedUseCaseInfo(collection, collection2, list, list2, list3, streamSharing, useCase, map, streamSpecQueryResult, streamSpecQueryResult2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculatedUseCaseInfo)) {
            return false;
        }
        CalculatedUseCaseInfo calculatedUseCaseInfo = (CalculatedUseCaseInfo) obj;
        return x.n(this.appUseCases, calculatedUseCaseInfo.appUseCases) && x.n(this.cameraUseCases, calculatedUseCaseInfo.cameraUseCases) && x.n(this.cameraUseCasesToAttach, calculatedUseCaseInfo.cameraUseCasesToAttach) && x.n(this.cameraUseCasesToKeep, calculatedUseCaseInfo.cameraUseCasesToKeep) && x.n(this.cameraUseCasesToDetach, calculatedUseCaseInfo.cameraUseCasesToDetach) && x.n(this.streamSharing, calculatedUseCaseInfo.streamSharing) && x.n(this.placeholderForExtensions, calculatedUseCaseInfo.placeholderForExtensions) && x.n(this.useCaseConfigs, calculatedUseCaseInfo.useCaseConfigs) && x.n(this.primaryStreamSpecResult, calculatedUseCaseInfo.primaryStreamSpecResult) && x.n(this.secondaryStreamSpecResult, calculatedUseCaseInfo.secondaryStreamSpecResult);
    }

    public final Collection<UseCase> getAppUseCases() {
        return this.appUseCases;
    }

    public final Collection<UseCase> getCameraUseCases() {
        return this.cameraUseCases;
    }

    public final List<UseCase> getCameraUseCasesToAttach() {
        return this.cameraUseCasesToAttach;
    }

    public final List<UseCase> getCameraUseCasesToDetach() {
        return this.cameraUseCasesToDetach;
    }

    public final List<UseCase> getCameraUseCasesToKeep() {
        return this.cameraUseCasesToKeep;
    }

    public final UseCase getPlaceholderForExtensions() {
        return this.placeholderForExtensions;
    }

    public final StreamSpecQueryResult getPrimaryStreamSpecResult() {
        return this.primaryStreamSpecResult;
    }

    public final StreamSpecQueryResult getSecondaryStreamSpecResult() {
        return this.secondaryStreamSpecResult;
    }

    public final StreamSharing getStreamSharing() {
        return this.streamSharing;
    }

    public final Map<UseCase, CameraUseCaseAdapter.ConfigPair> getUseCaseConfigs() {
        return this.useCaseConfigs;
    }

    public int hashCode() {
        int iHashCode = (((((((this.appUseCases.hashCode() * 31) + this.cameraUseCases.hashCode()) * 31) + this.cameraUseCasesToAttach.hashCode()) * 31) + this.cameraUseCasesToKeep.hashCode()) * 31) + this.cameraUseCasesToDetach.hashCode();
        StreamSharing streamSharing = this.streamSharing;
        int iHashCode2 = ((iHashCode * 31) + (streamSharing == null ? 0 : streamSharing.hashCode())) * 31;
        UseCase useCase = this.placeholderForExtensions;
        int iHashCode3 = (((((iHashCode2 + (useCase == null ? 0 : useCase.hashCode())) * 31) + this.useCaseConfigs.hashCode()) * 31) + this.primaryStreamSpecResult.hashCode()) * 31;
        StreamSpecQueryResult streamSpecQueryResult = this.secondaryStreamSpecResult;
        return iHashCode3 + (streamSpecQueryResult != null ? streamSpecQueryResult.hashCode() : 0);
    }

    public String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.appUseCases + ", cameraUseCases=" + this.cameraUseCases + ", cameraUseCasesToAttach=" + this.cameraUseCasesToAttach + ", cameraUseCasesToKeep=" + this.cameraUseCasesToKeep + ", cameraUseCasesToDetach=" + this.cameraUseCasesToDetach + ", streamSharing=" + this.streamSharing + ", placeholderForExtensions=" + this.placeholderForExtensions + ", useCaseConfigs=" + this.useCaseConfigs + ", primaryStreamSpecResult=" + this.primaryStreamSpecResult + ", secondaryStreamSpecResult=" + this.secondaryStreamSpecResult + ")";
    }
}
