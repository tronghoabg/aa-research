package androidx.car.app.mediaextensions.analytics.client;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.Constants;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
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
