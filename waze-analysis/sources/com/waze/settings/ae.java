package com.waze.settings;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.a.c f36754a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.a.h f36755b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.copilot.a.u f36756c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f36757d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.ab f36758e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f36759f;

    public ae(com.waze.sound.a.c cVar, com.waze.sound.a.h hVar, com.waze.copilot.a.u uVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(hVar, "voicesListRepository");
        h.g.b.x.f(uVar, "downloadAndSelectPromptVoiceFilesUseCase");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.f36754a = cVar;
        this.f36755b = hVar;
        this.f36756c = uVar;
        this.f36757d = eVar;
        this.f36758e = abVar;
        this.f36759f = kotlinx.coroutines.b.ck.b(new ac(h.a.i.h(), false, null));
    }

    public static final /* synthetic */ String d(ae aeVar) {
        com.waze.copilot.data.ag agVarA;
        com.waze.sound.a.b bVarC = aeVar.f36754a.c();
        if (bVarC == null || (agVarA = bVarC.a()) == null) {
            return null;
        }
        return agVarA.f();
    }

    public final kotlinx.coroutines.b.ch f() {
        return kotlinx.coroutines.b.ai.U(this.f36759f);
    }

    public final void g() {
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), this.f36758e, null, new ad(this, null), 2);
    }

    public final void h(gw gwVar) {
        Object next;
        h.g.b.x.f(gwVar, "settingsValue");
        Iterator it = this.f36755b.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (h.g.b.x.n(((com.waze.copilot.data.ag) next).f(), gwVar.f37349b)) {
                    break;
                }
            }
        }
        com.waze.copilot.data.ag agVar = (com.waze.copilot.data.ag) next;
        if (agVar != null) {
            this.f36756c.e(agVar, false, com.waze.mywaze.ag.f30571e);
            return;
        }
        com.waze.shared_infra.i.e eVar = this.f36757d;
        int i2 = gwVar.f37358k;
        eVar.b("Voice selection failed. Index 0 doesn't exist in the new voices list");
    }
}
