package com.waze.google_assistant;

import android.os.Handler;
import com.google.android.libraries.assistant.appintegration.CallbackExt;
import com.google.android.libraries.assistant.appintegration.proto.AssistantConversationState;
import com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams;
import com.google.d.d.bn;
import com.waze.config.ConfigValues;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.navigate.dj;
import com.waze.strings.DisplayStrings;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w extends CallbackExt {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa f24244a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f24245b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f24246c = new v(this);

    /* renamed from: d, reason: collision with root package name */
    private final dj f24247d = new u(this);

    /* renamed from: e, reason: collision with root package name */
    private final String f24248e = "assistant.api.params.NavigationAppParam";

    /* renamed from: f, reason: collision with root package name */
    private final int f24249f = DisplayStrings.DS_REPORT_ALERT_ON;

    public w(aa aaVar) {
        this.f24244a = aaVar;
    }

    static final h.ab c(aa aaVar, w wVar, String str) {
        try {
            aaVar.f24063d.setAppContexts(bn.q(com.waze.utils.a.b(str)), bn.q(wVar.f24248e));
        } catch (IOException e2) {
            aaVar.f24071l.c("error decoding base64 encoded appContext=".concat(String.valueOf(str)), e2);
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void d(final w wVar) {
        final aa aaVar = wVar.f24244a;
        if (aaVar.C()) {
            GoogleAssistantNativeManager googleAssistantNativeManager = GoogleAssistantNativeManager.getInstance();
            Long lB = ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_SHARE_ROUTE_INFO_TOGGLE_STATE.b();
            boolean z = true;
            if (((lB.longValue() != -1 && lB.longValue() != 1) || !ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AGREED_TO_TERMS.b().booleanValue()) && (!ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AGREED_TO_DISCLOSURE.b().booleanValue() || lB.longValue() != 1)) {
                z = false;
            }
            googleAssistantNativeManager.generateAppContextBaseEncoded(z, new h.g.a.l() { // from class: com.waze.google_assistant.t
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return w.c(aaVar, wVar, (String) obj);
                }
            });
        }
    }

    public final void e() {
        aa aaVar = this.f24244a;
        aaVar.J(4);
        this.f24245b.removeCallbacks(this.f24246c);
        NavigationInfoNativeManager.getInstance().removeNavigationUpdateListener(this.f24247d);
        aaVar.I(false);
    }

    @Override // com.google.android.libraries.assistant.appintegration.CallbackExt
    public final void onAssistantConnectionLost() {
        this.f24244a.f24071l.e("assistant service connection lost");
        e();
    }

    @Override // com.google.android.libraries.assistant.appintegration.CallbackExt
    public final void onAssistantConversationStateChanged(AssistantConversationState assistantConversationState) {
        h.g.b.x.f(assistantConversationState, "assistantConversationState");
        aa aaVar = this.f24244a;
        com.waze.shared_infra.i.e eVar = aaVar.f24071l;
        Objects.toString(assistantConversationState);
        eVar.e("assistant conversation state changed = ".concat(String.valueOf(assistantConversationState)));
        if (assistantConversationState == AssistantConversationState.ASSISTANT_CONVERSATION_STATE_STARTED) {
            aa.i(aaVar);
        } else {
            aaVar.H();
        }
    }

    @Override // com.google.android.libraries.assistant.appintegration.CallbackExt, com.google.android.libraries.assistant.appintegration.Callback
    public final void onServiceConnected() {
        aa aaVar = this.f24244a;
        aaVar.f24071l.e("assistant service connected");
        aaVar.l();
        this.f24245b.post(this.f24246c);
        NavigationInfoNativeManager.getInstance().addNavigationUpdateListener(this.f24247d);
        aaVar.J(2);
    }

    @Override // com.google.android.libraries.assistant.appintegration.CallbackExt, com.google.android.libraries.assistant.appintegration.Callback
    public final void onServiceDisconnected() {
        this.f24244a.f24071l.e("assistant service disconnected");
        e();
    }

    @Override // com.google.android.libraries.assistant.appintegration.CallbackExt
    public final void onVoicePlateStateChanged(VoicePlateStateChangedParams voicePlateStateChangedParams) {
        h.g.b.x.f(voicePlateStateChangedParams, "voicePlateStateChangedParams");
        super.onVoicePlateStateChanged(voicePlateStateChangedParams);
        if (voicePlateStateChangedParams.getVoicePlateState() == VoicePlateStateChangedParams.VoicePlateState.VOICE_PLATE_STATE_OPENED) {
            aa aaVar = this.f24244a;
            if (true != voicePlateStateChangedParams.hasSource()) {
                voicePlateStateChangedParams = null;
            }
            aaVar.y(voicePlateStateChangedParams != null ? voicePlateStateChangedParams.getSource() : null);
            aaVar.f24070k.c(aaVar.f());
        }
    }
}
