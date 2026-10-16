package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    @Deprecated
    String getData();

    InvocationHandler getMessagePayload();

    InvocationHandler[] getPorts();
}
