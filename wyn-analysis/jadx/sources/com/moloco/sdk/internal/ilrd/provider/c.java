package com.moloco.sdk.internal.ilrd.provider;

import Ef.H;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.C1948k0;
import com.moloco.sdk.C1950l0;
import com.moloco.sdk.internal.ilrd.t;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f28616a;

    public c(d dVar) {
        this.f28616a = dVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "Moloco";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage message) {
        AbstractC3340k.e(message, "message");
        d dVar = this.f28616a;
        if (H.y(dVar.f28618b) && "max_revenue_events".equals(message.getTopic())) {
            Bundle messageData = message.getMessageData();
            AbstractC3340k.d(messageData, "getMessageData(...)");
            double d3 = messageData.getDouble("revenue");
            String string = messageData.getString("country_code");
            String string2 = messageData.getString("network_name");
            String string3 = messageData.getString("max_ad_unit_id");
            String string4 = messageData.getString("third_party_ad_placement_id");
            String string5 = messageData.getString("ad_format");
            String string6 = messageData.getString("user_segment");
            String string7 = messageData.getString("id");
            C1948k0 c1948k0K = C1950l0.k();
            c1948k0K.f(d3);
            if (string != null) {
                c1948k0K.b(string);
            }
            if (string2 != null) {
                c1948k0K.e(string2);
            }
            if (string3 != null) {
                c1948k0K.d(string3);
            }
            if (string4 != null) {
                c1948k0K.g(string4);
            }
            if (string5 != null) {
                c1948k0K.a(string5);
            }
            if (string6 != null) {
                c1948k0K.h(string6);
            }
            if (string7 != null) {
                c1948k0K.c(string7);
            }
            GeneratedMessageLite generatedMessageLiteBuild = c1948k0K.build();
            AbstractC3340k.d(generatedMessageLiteBuild, "build(...)");
            H.D(dVar.f28618b, null, new b(dVar, new t((C1950l0) generatedMessageLiteBuild), null), 3);
        }
    }
}
