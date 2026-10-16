package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface PrefetchOperationCallbackBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    /* compiled from: WazeSource */
    /* renamed from: org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$onSuccess(PrefetchOperationCallbackBoundaryInterface prefetchOperationCallbackBoundaryInterface) {
            throw new UnsupportedOperationException("http://crbug.com/483041824 Replaced by onResult.");
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchResultTypeBoundaryInterface {
        public static final int DUPLICATE = 1;
        public static final int SUCCESS = 0;
    }

    void onFailure(int i2, String str, int i3);

    void onResult(int i2);

    @Deprecated
    void onSuccess();
}
