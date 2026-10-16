package com.waze.speech;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.speech.SpeechRecognizer;
import androidx.media3.common.MimeTypes;
import h.ab;
import java.util.UUID;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.br;
import kotlinx.coroutines.cj;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40475a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40476b;

    /* renamed from: c, reason: collision with root package name */
    private final m f40477c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40478d;

    /* renamed from: e, reason: collision with root package name */
    private SpeechRecognizer f40479e;

    /* renamed from: f, reason: collision with root package name */
    private h.g.a.l f40480f;

    /* renamed from: g, reason: collision with root package name */
    private final af f40481g;

    /* renamed from: h, reason: collision with root package name */
    private br f40482h;

    /* renamed from: i, reason: collision with root package name */
    private String f40483i;

    public /* synthetic */ w(Application application, k kVar, com.waze.shared_infra.i.b bVar, m mVar, com.waze.shared_infra.i.e eVar) {
        int i2 = av.f51370a;
        cj cjVar = ac.f51860a;
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        h.g.b.x.f(kVar, "factory");
        h.g.b.x.f(bVar, "nonFatalErrorReporterInterface");
        h.g.b.x.f(mVar, "config");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cjVar, "coroutineContext");
        this.f40475a = application;
        this.f40476b = bVar;
        this.f40477c = mVar;
        this.f40478d = eVar;
        this.f40481g = aj.e(cjVar.plus(aj.Q()));
    }

    public static final /* synthetic */ void d(w wVar) {
        h.g.a.l lVar = wVar.f40480f;
        if (lVar != null) {
            lVar.invoke(q.f40469a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void e(com.waze.speech.w r3, android.os.Bundle r4) {
        /*
            r3.m()
            kotlinx.coroutines.br r0 = r3.f40482h
            if (r0 == 0) goto La
            h.g.b.o.o(r0)
        La:
            r0 = 0
            if (r4 == 0) goto L14
            java.lang.String r1 = "results_recognition"
            java.util.ArrayList r4 = r4.getStringArrayList(r1)
            goto L15
        L14:
            r4 = r0
        L15:
            if (r4 == 0) goto L33
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = h.a.i.R(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L33
            h.g.a.l r1 = r3.f40480f
            if (r1 == 0) goto L30
            com.waze.speech.r r2 = new com.waze.speech.r
            r2.<init>(r4)
            r1.invoke(r2)
            h.ab r4 = h.ab.f48028a
            goto L31
        L30:
            r4 = r0
        L31:
            if (r4 != 0) goto L41
        L33:
            h.g.a.l r4 = r3.f40480f
            if (r4 == 0) goto L41
            com.waze.speech.p r1 = new com.waze.speech.p
            com.waze.speech.n r2 = com.waze.speech.n.f40462a
            r1.<init>(r2)
            r4.invoke(r1)
        L41:
            r3.f40480f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.speech.w.e(com.waze.speech.w, android.os.Bundle):void");
    }

    public static final /* synthetic */ void f(w wVar, int i2) {
        wVar.m();
        br brVar = wVar.f40482h;
        if (brVar != null) {
            brVar.s(null);
        }
        n nVar = i2 != 6 ? i2 != 7 ? i2 != 9 ? n.f40462a : n.f40463b : n.f40465d : n.f40464c;
        h.g.a.l lVar = wVar.f40480f;
        if (lVar != null) {
            lVar.invoke(new p(nVar));
        }
        wVar.f40480f = null;
    }

    public static /* synthetic */ ab l(w wVar) {
        wVar.f40482h = null;
        wVar.m();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.f40483i != null) {
            this.f40483i = null;
        }
    }

    private final void n(Intent intent, h.g.a.l lVar) {
        h.g.a.l lVar2 = this.f40480f;
        if (lVar2 != null) {
            lVar2.invoke(new p(n.f40462a));
        }
        br brVar = this.f40482h;
        if (brVar != null) {
            brVar.s(null);
        }
        String string = UUID.randomUUID().toString();
        h.g.b.x.e(string, "toString(...)");
        this.f40483i = string;
        SpeechRecognizer speechRecognizer = this.f40479e;
        if (speechRecognizer == null) {
            lVar.invoke(new p(n.f40462a));
            return;
        }
        speechRecognizer.startListening(intent);
        this.f40480f = lVar;
        br brVarZ = aj.z(this.f40481g, null, null, new v(this, null), 3);
        brVarZ.bY(new com.waze.sound.e.i(this, 2));
        this.f40482h = brVarZ;
    }

    private static final Intent o(String str) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        if (str != null) {
            if (true == h.n.o.G(str)) {
                str = null;
            }
            if (str != null) {
                intent.putExtra("android.speech.extra.LANGUAGE", str);
            }
        }
        return intent;
    }

    public final void h() {
        Object objA;
        SpeechRecognizer speechRecognizer = this.f40479e;
        if (speechRecognizer != null) {
            m();
            speechRecognizer.setRecognitionListener(null);
            try {
                speechRecognizer.cancel();
                speechRecognizer.stopListening();
                speechRecognizer.destroy();
                objA = ab.f48028a;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                this.f40476b.a(thC, null);
                this.f40478d.c("Crashed when trying to destroy: ", thC);
            }
        }
        this.f40480f = null;
        br brVar = this.f40482h;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f40482h = null;
        this.f40479e = null;
    }

    public final void i(String str, h.g.a.l lVar) {
        h.g.b.x.f(lVar, "callback");
        n(o(str), lVar);
    }

    public final void j(a aVar, String str, h.g.a.l lVar) {
        h.g.b.x.f(aVar, "customAudioSource");
        h.g.b.x.f(lVar, "callback");
        Intent intentO = o(str);
        intentO.putExtra("calling_package", this.f40475a.getPackageName());
        intentO.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        intentO.putExtra("android.speech.extra.AUDIO_SOURCE", aVar.a());
        intentO.putExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", com.waze.i.a.c(aVar.b().b()));
        intentO.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", aVar.b().c().a());
        intentO.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", aVar.b().d());
        intentO.putExtra("android.speech.extra.SEGMENTED_SESSION", "android.speech.extra.AUDIO_SOURCE");
        m mVar = this.f40477c;
        h.o.a aVarB = mVar.b();
        if (aVarB != null) {
            intentO.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", h.o.a.m(aVarB.w()));
        }
        h.o.a aVarA = mVar.a();
        if (aVarA != null) {
            intentO.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", h.o.a.m(aVarA.w()));
        }
        n(intentO, lVar);
    }

    public final boolean k(Context context, String str) {
        h.g.b.x.f(context, "context");
        String str2 = "Start called for SpeechToText service for tag " + str + ". instance: " + this.f40479e;
        com.waze.shared_infra.i.e eVar = this.f40478d;
        eVar.a(str2);
        if (this.f40479e != null) {
            this.f40476b.a(new t(str), null);
            return true;
        }
        h.g.b.x.f(context, "context");
        if (!SpeechRecognizer.isRecognitionAvailable(context)) {
            eVar.a("not available on device. Tag: ".concat(String.valueOf(str)));
            return false;
        }
        h.g.b.x.f(context, "context");
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context);
        if (speechRecognizerCreateSpeechRecognizer == null) {
            eVar.a("creation failed. Tag: ".concat(String.valueOf(str)));
            return false;
        }
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(new u(this, str));
        this.f40479e = speechRecognizerCreateSpeechRecognizer;
        return true;
    }
}
