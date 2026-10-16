package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ii implements com.waze.shared_infra.f.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.a.ac f40233a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.a.u f40234b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40235c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f40236d;

    public ii(com.waze.copilot.a.ac acVar, com.waze.copilot.a.u uVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(acVar, "downloadCopilotMetadataAndAssetsUseCase");
        h.g.b.x.f(uVar, "downloadAndSelectPromptVoiceFilesUseCase");
        h.g.b.x.f(eVar, "logger");
        this.f40233a = acVar;
        this.f40234b = uVar;
        this.f40235c = eVar;
        this.f40236d = kotlinx.coroutines.aj.f();
    }

    @Override // com.waze.shared_infra.f.b
    public final boolean a(com.waze.shared_infra.f.a aVar) {
        h.g.b.x.f(aVar, "deeplink");
        String strB = aVar.b("voice_id");
        String str = strB;
        if (str != null && str.length() != 0) {
            this.f40235c.a("Handling voice deeplink for id: ".concat(String.valueOf(strB)));
            kotlinx.coroutines.aj.z(this.f40236d, null, null, new dz(this, strB, (h.c.e) null, 6), 3);
            return true;
        }
        com.waze.shared_infra.i.e eVar = this.f40235c;
        if (strB == null) {
            eVar.a("voiceId is null");
            return false;
        }
        eVar.b("voiceId is empty");
        return false;
    }
}
