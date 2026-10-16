package com.waze.sound;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final SoundNativeManager f39537a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f39538b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39539c;

    public bj(SoundNativeManager soundNativeManager, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(soundNativeManager, "soundNativeManager");
        h.g.b.x.f(abVar, "dispatcher");
        this.f39537a = soundNativeManager;
        kotlinx.coroutines.ab abVar2 = abVar;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(abVar2);
        this.f39538b = afVarE;
        this.f39539c = kotlinx.coroutines.b.ck.b(new ArrayList());
        f();
        kotlinx.coroutines.aj.z(afVarE, abVar2, null, new bi(this, (h.c.e) null, 0), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f39539c.e(h.a.c.X(this.f39537a.getCustomPromptsNTV()));
    }

    public final kotlinx.coroutines.b.ch b() {
        return kotlinx.coroutines.b.ai.U(this.f39539c);
    }

    public final void d(String str) {
        this.f39537a.downloadPromptSet(str);
    }

    public final void e(String str) {
        this.f39537a.prepareEditCustomPromptSet(str);
    }
}
