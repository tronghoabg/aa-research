package com.waze.speech;

import com.waze.config.ConfigValues;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40459a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f40460b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f40461c;

    public /* synthetic */ m(byte[] bArr) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SpeechRecognizerServiceConfig");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(eVarD, "logger");
        this.f40459a = eVarD;
        this.f40460b = h.g.a(new l(this, 1));
        this.f40461c = h.g.a(new l(this, 0));
    }

    static final h.o.a c(m mVar) {
        Long lB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_AUDIO_MAX_COMPLETE_SILENCE_DETECTION_MILLIS.b();
        if (lB.longValue() <= 0) {
            lB = null;
        }
        h.o.a aVarZ = lB != null ? h.o.a.z(h.o.c.j(lB.longValue(), h.o.d.f48272c)) : null;
        com.waze.shared_infra.i.e eVar = mVar.f40459a;
        Objects.toString(aVarZ);
        eVar.a("maxCompleteSilenceDuration: ".concat(String.valueOf(aVarZ)));
        return aVarZ;
    }

    static final h.o.a d(m mVar) {
        Long lB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_AUDIO_MAX_PROBABLE_SILENCE_DETECTION_MILLIS.b();
        if (lB.longValue() <= 0) {
            lB = null;
        }
        h.o.a aVarZ = lB != null ? h.o.a.z(h.o.c.j(lB.longValue(), h.o.d.f48272c)) : null;
        com.waze.shared_infra.i.e eVar = mVar.f40459a;
        Objects.toString(aVarZ);
        eVar.a("maxProbablySilenceDuration: ".concat(String.valueOf(aVarZ)));
        return aVarZ;
    }

    public final h.o.a a() {
        return (h.o.a) this.f40460b.getValue();
    }

    public final h.o.a b() {
        return (h.o.a) this.f40461c.getValue();
    }

    public m() {
        this(null);
    }
}
