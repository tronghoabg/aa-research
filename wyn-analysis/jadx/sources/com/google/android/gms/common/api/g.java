package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.InterfaceC1715d;
import com.google.android.gms.common.internal.InterfaceC1716e;
import com.google.android.gms.common.internal.InterfaceC1726o;
import java.util.Set;

/* loaded from: classes3.dex */
public interface g extends b {
    void connect(InterfaceC1715d interfaceC1715d);

    void disconnect();

    void disconnect(String str);

    d7.d[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC1726o interfaceC1726o, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC1716e interfaceC1716e);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
