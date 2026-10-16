package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.a.c f34342a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34343b;

    public cj(com.waze.sound.a.c cVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(eVar, "logger");
        this.f34342a = cVar;
        this.f34343b = eVar;
    }

    public final ci a() {
        com.waze.copilot.data.ag agVarA;
        com.waze.sound.a.b bVarC = this.f34342a.c();
        if (bVarC == null || (agVarA = bVarC.a()) == null) {
            return null;
        }
        this.f34343b.e("isServerVoicesListEnabled is on, selected voice id: " + agVarA.f() + " locale: " + agVarA.h());
        return new ci(agVarA.f(), agVarA.h(), agVarA.g(), agVarA.d());
    }
}
