package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface WebViewNavigationListenerBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onFirstContentfulPaint(InvocationHandler invocationHandler, long j2);

    void onFirstContentfulPaintMillis(InvocationHandler invocationHandler, long j2);

    void onLargestContentfulPaintMillis(InvocationHandler invocationHandler, long j2);

    void onNavigationCompleted(InvocationHandler invocationHandler);

    void onNavigationRedirected(InvocationHandler invocationHandler);

    void onNavigationStarted(InvocationHandler invocationHandler);

    void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler);

    void onPageDeleted(InvocationHandler invocationHandler);

    void onPageLoadEventFired(InvocationHandler invocationHandler);

    void onPerformanceMarkMillis(InvocationHandler invocationHandler, String str, long j2);
}
