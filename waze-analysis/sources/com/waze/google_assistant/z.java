package com.waze.google_assistant;

import com.google.android.libraries.assistant.appintegration.AssistantConfig;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z implements com.google.d.m.a.ay {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa f24255a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f24256b;

    z(aa aaVar, boolean z) {
        this.f24255a = aaVar;
        this.f24256b = z;
    }

    @Override // com.google.d.m.a.ay
    public final void onFailure(Throwable th) {
        h.g.b.x.f(th, "t");
        aa aaVar = this.f24255a;
        aaVar.f24071l.c("failed to load assistant configuration", th);
        aaVar.J(0);
    }

    @Override // com.google.d.m.a.ay
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AssistantConfig assistantConfig = (AssistantConfig) obj;
        h.g.b.x.f(assistantConfig, "assistantConfig");
        aa aaVar = this.f24255a;
        aaVar.f24071l.e("successfully loaded assistant configuration");
        boolean z = assistantConfig.isAvailable(1) && assistantConfig.isAvailable(2);
        boolean zC = c.c();
        if (!zC || !z) {
            aaVar.f24071l.e("sdk not available isFeatureEnabled=" + zC + " isVoicePlateAvailable=" + z);
            aaVar.J(0);
            return;
        }
        aaVar.f24071l.e("assistant mini voice plate available");
        boolean zB = c.b();
        if (zB && this.f24256b) {
            aaVar.f24071l.e("binding to assistant service");
            aaVar.f24067h.invoke(new com.google.android.material.textfield.ao(aaVar, 2));
            return;
        }
        boolean z2 = this.f24256b;
        aaVar.f24071l.e("not binding to assistant service. hasAgreedToTermsOrDisclosure=" + zB + " shouldConnectIfAvailable=" + z2);
        aaVar.J(1);
    }
}
