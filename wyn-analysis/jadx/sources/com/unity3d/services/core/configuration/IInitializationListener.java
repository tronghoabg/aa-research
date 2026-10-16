package com.unity3d.services.core.configuration;

/* loaded from: classes5.dex */
public interface IInitializationListener {
    void onSdkInitializationFailed(String str, ErrorState errorState, int i5);

    void onSdkInitialized();
}
