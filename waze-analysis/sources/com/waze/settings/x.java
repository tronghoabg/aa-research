package com.waze.settings;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.config.ConfigValues;
import com.waze.sound.PromptDefinition;
import com.waze.sound.SoundNativeManager;
import com.waze.sound.ht;
import com.waze.sound.hx;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.bl f37673a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.bg f37674b;

    /* renamed from: c, reason: collision with root package name */
    private final hx f37675c;

    /* renamed from: d, reason: collision with root package name */
    private final SoundNativeManager f37676d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sound.a.c f37677e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f37678f;

    public x(com.waze.sound.bl blVar, com.waze.sound.bg bgVar, hx hxVar, SoundNativeManager soundNativeManager, com.waze.sound.a.c cVar, v vVar) {
        h.g.b.x.f(blVar, "getSelectedVoiceNameUseCase");
        h.g.b.x.f(bgVar, "customPromptManager");
        h.g.b.x.f(hxVar, "ttsStatsSender");
        h.g.b.x.f(soundNativeManager, "soundNativeManager");
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(vVar, "config");
        this.f37673a = blVar;
        this.f37674b = bgVar;
        this.f37675c = hxVar;
        this.f37676d = soundNativeManager;
        this.f37677e = cVar;
        this.f37678f = kotlinx.coroutines.b.ck.b(new w(null, h.g.b.x.n(ConfigValues.CONFIG_VALUE_GENERAL_UNITS.b(), "metric")));
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new u(this, (h.c.e) null, 0), 3);
    }

    public final kotlinx.coroutines.b.ch d() {
        return kotlinx.coroutines.b.ai.U(this.f37678f);
    }

    public final void e() {
        this.f37674b.j();
    }

    public final void f() {
        this.f37674b.l();
        this.f37675c.a(ht.f40185g, null);
    }

    public final void g(PromptDefinition promptDefinition) {
        h.g.b.x.f(promptDefinition, "data");
        this.f37674b.m(promptDefinition.getId(), false);
        this.f37675c.a(ht.f40183e, promptDefinition.getId());
    }

    public final void h(PromptDefinition promptDefinition) {
        h.g.b.x.f(promptDefinition, "data");
        this.f37674b.x(promptDefinition.getId(), false, null);
        this.f37675c.a(ht.f40181c, promptDefinition.getId());
    }

    public final void i(String str) {
        this.f37676d.removeSetFromUser(str);
    }

    public final void j() {
        this.f37675c.a(ht.f40184f, null);
    }

    public final void k() {
        this.f37675c.b();
    }

    public final void l(String str, boolean z) {
        h.g.b.x.f(str, "setName");
        this.f37674b.p(str, z);
    }

    public final boolean m(PromptDefinition promptDefinition) {
        h.g.b.x.f(promptDefinition, "data");
        return this.f37674b.t(promptDefinition.getId(), false);
    }

    public final boolean n() {
        return this.f37674b.u();
    }

    public final PromptDefinition[] o() {
        PromptDefinition[] promptDefinitionArrY = this.f37674b.y();
        return promptDefinitionArrY == null ? new PromptDefinition[0] : promptDefinitionArrY;
    }
}
