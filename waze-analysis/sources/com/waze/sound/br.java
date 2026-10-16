package com.waze.sound;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class br implements com.waze.shared_infra.f.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39563a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39564b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f39565c;

    public br(com.waze.sharedrive.d.aq aqVar, com.waze.shared_infra.i.e eVar, int i2) {
        this.f39564b = i2;
        h.g.b.x.f(aqVar, "shareDriveController");
        h.g.b.x.f(eVar, "logger");
        this.f39565c = aqVar;
        this.f39563a = eVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.waze.sound.bs, java.lang.Object] */
    @Override // com.waze.shared_infra.f.b
    public final boolean a(com.waze.shared_infra.f.a aVar) {
        bp bpVarE;
        if (this.f39564b != 0) {
            h.g.b.x.f(aVar, "deeplink");
            String strA = aVar.a();
            if (h.g.b.x.n(strA, "sd3")) {
                this.f39563a.a("Handling 'sd3' deeplink.");
                ((com.waze.sharedrive.d.aq) this.f39565c).B(aVar.b("token"));
            } else {
                boolean zN = h.g.b.x.n(strA, "share_drive");
                com.waze.shared_infra.i.e eVar = this.f39563a;
                if (!zN) {
                    eVar.a(f.a(strA, "Not a share drive v3 deeplink (action: ", "), not handling."));
                    return false;
                }
                eVar.a("Intercepting legacy 'share_drive' deeplink.");
                ((com.waze.sharedrive.d.aq) this.f39565c).A();
            }
            this.f39563a.a("Share drive v3 deeplink handled.");
            return true;
        }
        h.g.b.x.f(aVar, "deeplink");
        if (!h.g.b.x.n(aVar.a(), "set_voice_guidance_mode")) {
            return false;
        }
        String strB = aVar.b(TypedValues.TransitionType.S_TO);
        if (strB != null) {
            bp bpVar = bp.f39554a;
            bpVarE = com.waze.sharedui.api.i.e(strB);
        } else {
            bpVarE = null;
        }
        if (bpVarE == null) {
            this.f39563a.a("Received deeplink with invalid guidance mode value: ".concat(String.valueOf(strB)));
            return true;
        }
        ?? r6 = this.f39565c;
        if (!((List) r6.a().d()).contains(bpVarE)) {
            com.waze.shared_infra.i.e eVar2 = this.f39563a;
            Objects.toString(bpVarE);
            eVar2.a("Received deeplink with unavailable guidance mode: ".concat(bpVarE.toString()));
            return true;
        }
        bp bpVar2 = (bp) r6.b().d();
        com.waze.shared_infra.i.e eVar3 = this.f39563a;
        if (bpVarE == bpVar2) {
            eVar3.a("Received deeplink with current guidance mode, not updating.");
            return true;
        }
        eVar3.a("Received deeplink to set guidance mode: " + bpVarE + " from " + bpVar2);
        r6.d(bpVarE, bu.f39574c);
        return true;
    }

    public br(bs bsVar, com.waze.shared_infra.i.e eVar, int i2) {
        this.f39564b = i2;
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(eVar, "logger");
        this.f39565c = bsVar;
        this.f39563a = eVar;
    }
}
