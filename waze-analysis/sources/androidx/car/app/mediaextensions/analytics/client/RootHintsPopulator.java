package androidx.car.app.mediaextensions.analytics.client;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.Constants;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RootHintsPopulator {
    private final Bundle mRootHintsBundle;

    public RootHintsPopulator(Bundle bundle) {
        this.mRootHintsBundle = bundle;
    }

    public RootHintsPopulator setAnalyticsOptIn(boolean z) {
        this.mRootHintsBundle.putBoolean(Constants.ANALYTICS_ROOT_KEY_OPT_IN, z);
        return this;
    }

    public RootHintsPopulator setShareOem(boolean z) {
        this.mRootHintsBundle.putBoolean(Constants.ANALYTICS_SHARE_OEM_DIAGNOSTICS, z);
        return this;
    }

    public RootHintsPopulator setSharePlatform(boolean z) {
        this.mRootHintsBundle.putBoolean(Constants.ANALYTICS_SHARE_PLATFORM_DIAGNOSTICS, z);
        return this;
    }
}
