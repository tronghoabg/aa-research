package com.waze.sound;

import android.speech.tts.TextToSpeech;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.c.bs f40400a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40401b;

    /* renamed from: c, reason: collision with root package name */
    private final fm f40402c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40403d;

    /* renamed from: e, reason: collision with root package name */
    private TextToSpeech f40404e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f40405f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f40406g;

    /* renamed from: h, reason: collision with root package name */
    private final ec f40407h;

    public /* synthetic */ m(com.waze.reports_v2.c.bs bsVar, com.waze.shared_infra.i.b bVar, fm fmVar, com.waze.shared_infra.i.e eVar, int i2) {
        ec ecVar = (i2 & 8) != 0 ? new ec(null) : null;
        if ((i2 & 16) != 0) {
            eVar = com.waze.shared_infra.i.a.d("AndroidTextToSpeechService");
            h.g.b.x.e(eVar, "create(...)");
        }
        h.g.b.x.f(bsVar, "conversationalReportingSupportedLocaleState");
        h.g.b.x.f(bVar, "nonFatalErrorReporterInterface");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(ecVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f40400a = bsVar;
        this.f40401b = bVar;
        this.f40402c = fmVar;
        this.f40407h = ecVar;
        this.f40403d = eVar;
        this.f40405f = new LinkedHashMap();
        this.f40406g = new AtomicBoolean(false);
    }

    public static final /* synthetic */ void g(m mVar) {
        if (mVar.f40406g.compareAndSet(true, false)) {
            mVar.l();
        }
    }

    private final void l() {
        this.f40403d.a("Stopping android text-to-speech service");
        TextToSpeech textToSpeech = this.f40404e;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this.f40404e;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        this.f40404e = null;
        Map map = this.f40405f;
        for (fb fbVar : h.a.i.ao(map.values())) {
            fbVar.a().s(null);
            if (fbVar instanceof c) {
                fb.g(((c) fbVar).b());
            }
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fb m(String str) {
        fb fbVar = (fb) this.f40405f.remove(str);
        if (fbVar == null) {
            return null;
        }
        if (fbVar instanceof c) {
            fb.g(((c) fbVar).b());
        }
        return fbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, boolean r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.m.c(java.lang.String, boolean, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r9, java.lang.String r10, h.c.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.waze.sound.l
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.sound.l r0 = (com.waze.sound.l) r0
            int r1 = r0.f40399d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40399d = r1
            goto L18
        L13:
            com.waze.sound.l r0 = new com.waze.sound.l
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f40397b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40399d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r9 = r0.f40396a
            android.speech.tts.TextToSpeech r9 = (android.speech.tts.TextToSpeech) r9
            e.b.c.b(r11)     // Catch: java.lang.Exception -> L9c
            goto L7a
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            e.b.c.b(r11)
            com.waze.shared_infra.i.e r11 = r8.f40403d
            android.speech.tts.TextToSpeech r2 = r8.f40404e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Start called for android text-to-speech service. instance: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = ", tag: '"
            r5.append(r2)
            r5.append(r10)
            java.lang.String r2 = "'"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r11.a(r2)
            android.speech.tts.TextToSpeech r11 = r8.f40404e
            if (r11 != 0) goto Lab
            kotlinx.coroutines.CompletableDeferred r10 = kotlinx.coroutines.bo.j()     // Catch: java.lang.Exception -> L9c
            android.speech.tts.TextToSpeech r11 = new android.speech.tts.TextToSpeech     // Catch: java.lang.Exception -> L9c
            com.waze.sound.a r2 = new com.waze.sound.a     // Catch: java.lang.Exception -> L9c
            r2.<init>()     // Catch: java.lang.Exception -> L9c
            r11.<init>(r9, r2)     // Catch: java.lang.Exception -> L9c
            r0.f40396a = r11     // Catch: java.lang.Exception -> L9c
            r0.f40399d = r4     // Catch: java.lang.Exception -> L9c
            java.lang.Object r9 = r10.c(r0)     // Catch: java.lang.Exception -> L9c
            if (r9 == r1) goto L9b
            r7 = r11
            r11 = r9
            r9 = r7
        L7a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Exception -> L9c
            boolean r10 = r11.booleanValue()     // Catch: java.lang.Exception -> L9c
            if (r10 != 0) goto L8a
            r9.shutdown()     // Catch: java.lang.Exception -> L9c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L9c
            return r8
        L8a:
            com.waze.sound.i r10 = new com.waze.sound.i     // Catch: java.lang.Exception -> L9c
            r10.<init>(r8)     // Catch: java.lang.Exception -> L9c
            android.speech.tts.UtteranceProgressListener r10 = (android.speech.tts.UtteranceProgressListener) r10     // Catch: java.lang.Exception -> L9c
            r9.setOnUtteranceProgressListener(r10)     // Catch: java.lang.Exception -> L9c
            r8.f40404e = r9     // Catch: java.lang.Exception -> L9c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L9c
            return r8
        L9b:
            return r1
        L9c:
            r9 = move-exception
            com.waze.shared_infra.i.e r8 = r8.f40403d
            java.lang.String r10 = "Failed to initialize android text-to-speech service"
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.c(r10, r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        Lab:
            com.waze.shared_infra.i.b r8 = r8.f40401b
            com.waze.sound.g r9 = new com.waze.sound.g
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.waze.shared_infra.h.b.f(r8, r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.m.d(android.content.Context, java.lang.String, h.c.e):java.lang.Object");
    }

    public final Locale e(String str) {
        h.g.b.x.f(str, "languageCode");
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        TextToSpeech textToSpeech = this.f40404e;
        if (textToSpeech == null) {
            return null;
        }
        int iIsLanguageAvailable = textToSpeech.isLanguageAvailable(localeForLanguageTag);
        this.f40403d.a("Availability for locale: " + iIsLanguageAvailable);
        if (iIsLanguageAvailable == 0 || iIsLanguageAvailable == 1 || iIsLanguageAvailable == 2) {
            return localeForLanguageTag;
        }
        return null;
    }

    public final boolean h() {
        return this.f40404e != null;
    }

    public final void i() {
        this.f40406g.set(false);
        l();
    }
}
