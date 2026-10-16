package Wf;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.TopicsManager;
import android.app.sdksandbox.sdkprovider.SdkSandboxController;

/* renamed from: Wf.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1258p {
    public static /* synthetic */ void A() {
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager e(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ SdkSandboxController g(Object obj) {
        return (SdkSandboxController) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return SdkSandboxController.class;
    }

    public static /* synthetic */ void k() {
        new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return MeasurementManager.class;
    }
}
