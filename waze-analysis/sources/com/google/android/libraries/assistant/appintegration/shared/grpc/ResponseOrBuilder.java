package com.google.android.libraries.assistant.appintegration.shared.grpc;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ResponseOrBuilder extends fj {
    AppIntegrationService.AppIntegrationCallbackEvent getOnUpdate();

    boolean hasOnUpdate();
}
