package com.waze.jni.protos.reports;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.reports.SosProvider;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface SosProviderOrBuilder extends fj {
    String getEmail();

    v getEmailBytes();

    String getName();

    v getNameBytes();

    String getPhoneCall();

    v getPhoneCallBytes();

    String getPhoneSend();

    v getPhoneSendBytes();

    SosProvider.ProviderSubType getSubtype();

    int getSubtypeValue();

    SosProvider.ProviderType getType();

    int getTypeValue();

    String getUrl();

    v getUrlBytes();

    boolean hasEmail();

    boolean hasName();

    boolean hasPhoneCall();

    boolean hasPhoneSend();

    boolean hasSubtype();

    boolean hasType();

    boolean hasUrl();
}
