package com.google.android.libraries.assistant.appintegration.proto;

import com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams;
import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface VoicePlateStateChangedParamsOrBuilder extends fj {
    VoicePlateStateChangedParams.DashboardMode getDashboardMode();

    int getDesiredPaddingOnScreenPixel();

    boolean getHideSystemNavigationBar();

    String getSource();

    v getSourceBytes();

    int getVoicePlateHeightPixel();

    VoicePlateStateChangedParams.VoicePlateMode getVoicePlateMode();

    VoicePlateStateChangedParams.VoicePlateState getVoicePlateState();

    boolean hasDashboardMode();

    boolean hasDesiredPaddingOnScreenPixel();

    boolean hasHideSystemNavigationBar();

    boolean hasSource();

    boolean hasVoicePlateHeightPixel();

    boolean hasVoicePlateMode();

    boolean hasVoicePlateState();
}
