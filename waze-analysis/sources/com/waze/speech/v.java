package com.waze.speech;

import android.speech.SpeechRecognizer;
import com.waze.config.ConfigValues;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40473a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f40474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(2, eVar);
        this.f40474b = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new v(this.f40474b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40473a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_MAX_LISTENING_TIME_SECONDS.b();
            h.g.b.x.e(lB, "getValue(...)");
            this.f40473a = 1;
            if (aj.q(h.o.a.m(h.o.c.j(lB.longValue(), h.o.d.f48273d)), this) == aVar) {
                return aVar;
            }
        }
        w wVar = this.f40474b;
        wVar.f40478d.a("stop listening after timeout");
        SpeechRecognizer speechRecognizer = wVar.f40479e;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
        wVar.m();
        return ab.f48028a;
    }
}
