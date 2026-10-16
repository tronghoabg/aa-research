package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.proto.NavigationState;
import com.google.android.libraries.assistant.appintegration.proto.NightModeStatus;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface NavigationStateChangedEventDataOrBuilder extends fj {
    boolean getFromFragmentPause();

    boolean getGotMorrisEligible();

    NavigationState getNavigationState();

    NightModeStatus getNightModeStatus();

    boolean hasFromFragmentPause();

    boolean hasGotMorrisEligible();

    boolean hasNavigationState();

    boolean hasNightModeStatus();
}
