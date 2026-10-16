package com.google.android.libraries.assistant.appintegration.shared.grpc;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface RequestOrBuilder extends fj {
    boolean getIsTngMorris();

    String getPackageName();

    v getPackageNameBytes();

    boolean getSendToken();

    AppIntegrationService.AppIntegrationData getSentData();

    boolean hasIsTngMorris();

    boolean hasPackageName();

    boolean hasSendToken();

    boolean hasSentData();
}
