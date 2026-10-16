package androidx.camera.featurecombinationquery;

import android.hardware.camera2.params.OutputConfiguration;
import androidx.camera.featurecombinationquery.SessionParametersLegacy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class SessionConfigurationLegacy {
    private final List<OutputConfiguration> mOutputConfigs;
    private final SessionParametersLegacy mSessionParams;

    /* compiled from: WazeSource */
    public final class Builder {
        private final ArrayList<OutputConfiguration> mOutputConfigs = new ArrayList<>();
        private SessionParametersLegacy mSessionParams = new SessionParametersLegacy.Builder().build();

        public Builder addOutputConfiguration(OutputConfiguration outputConfiguration) {
            this.mOutputConfigs.add(outputConfiguration);
            return this;
        }

        public Builder addOutputConfigurations(Collection<OutputConfiguration> collection) {
            this.mOutputConfigs.addAll(collection);
            return this;
        }

        public SessionConfigurationLegacy build() {
            return new SessionConfigurationLegacy(SessionConfigurationLegacy$Builder$$ExternalSyntheticBackport0.m(this.mOutputConfigs), this.mSessionParams);
        }

        public Builder setSessionParameters(SessionParametersLegacy sessionParametersLegacy) {
            this.mSessionParams = sessionParametersLegacy;
            return this;
        }
    }

    private SessionConfigurationLegacy(List<OutputConfiguration> list, SessionParametersLegacy sessionParametersLegacy) {
        this.mOutputConfigs = list;
        this.mSessionParams = sessionParametersLegacy;
    }

    public List<OutputConfiguration> getOutputConfigurations() {
        return this.mOutputConfigs;
    }

    public SessionParametersLegacy getSessionParameters() {
        return this.mSessionParams;
    }
}
