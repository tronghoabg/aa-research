package com.waze.sound.b;

import com.waze.copilot.data.ah;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.a.c f39506a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39507b;

    public f(com.waze.sound.a.c cVar, com.waze.shared_infra.i.e eVar) {
        x.f(cVar, "voiceRepository");
        x.f(eVar, "logger");
        this.f39506a = cVar;
        this.f39507b = eVar;
    }

    public final void a(String str) {
        x.f(str, "recordedVoiceId");
        com.waze.sound.a.c cVar = this.f39506a;
        com.waze.sound.a.b bVarC = cVar.c();
        if (bVarC != null) {
            ah ahVarD = bVarC.a().d();
            ah ahVar = ah.f22966b;
            com.waze.shared_infra.i.e eVar = this.f39507b;
            if (ahVarD == ahVar) {
                eVar.a("Setting recorded voiceId selection to ".concat(str));
                cVar.g(str);
                return;
            }
            eVar.g("not setting recorded voiceId selection as it is not a prompt: recordedVoiceId=" + str + " voiceType=" + bVarC.a().d());
        }
    }
}
