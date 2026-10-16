package com.waze.sound.e;

import com.waze.settings.eb;
import com.waze.sound.bj;
import com.waze.sound.bs;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final bs f39856a;

    /* renamed from: b, reason: collision with root package name */
    private final eb f39857b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sound.a.c f39858c;

    /* renamed from: d, reason: collision with root package name */
    private final bj f39859d;

    public k(bs bsVar, eb ebVar, com.waze.sound.a.c cVar, bj bjVar) {
        x.f(bsVar, "guidanceModeRepository");
        x.f(ebVar, "settingsStatsSender");
        x.f(cVar, "voiceRepository");
        x.f(bjVar, "customPromptsRepository");
        this.f39856a = bsVar;
        this.f39857b = ebVar;
        this.f39858c = cVar;
        this.f39859d = bjVar;
    }

    public final m a() {
        return new m(this.f39856a, this.f39857b, this.f39858c, this.f39859d);
    }
}
