package com.waze.sound;

import android.speech.tts.UtteranceProgressListener;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends UtteranceProgressListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40213b = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f40214a;

    i(m mVar) {
        this.f40214a = mVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(final String str) {
        String strConcat = "Finished utterance for id: ".concat(String.valueOf(str));
        final m mVar = this.f40214a;
        mVar.f40403d.a(strConcat);
        if (str != null) {
            final fb fbVar = (fb) mVar.f40405f.remove(str);
            if (fbVar instanceof b) {
                ((b) fbVar).a().a(e.f39834a);
                mVar.f40403d.a(f.a(str, "Deferred for id ", " found and completed with success"));
                m.g(mVar);
            } else if (!(fbVar instanceof c)) {
                if (fbVar != null) {
                    throw new h.i();
                }
                mVar.f40403d.a(f.a(str, "Deferred for id ", " not found"));
            } else {
                mVar.f40403d.a(f.a(str, "Deferred for id ", " found, playing speech..."));
                fm fmVar = mVar.f40402c;
                String absolutePath = ((c) fbVar).b().getAbsolutePath();
                h.g.b.x.e(absolutePath, "getAbsolutePath(...)");
                com.waze.sharedui.e.e.i(fmVar, absolutePath, null, false, true, new h.g.a.a() { // from class: com.waze.sound.h
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i2 = i.f40213b;
                        c cVar = (c) fbVar;
                        cVar.a().a(e.f39834a);
                        mVar.f40403d.a("Playing speech for id " + str + " completed");
                        fb.g(cVar.b());
                        return h.ab.f48028a;
                    }
                }, 6);
            }
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        String strConcat = "Error when running speech for id: ".concat(String.valueOf(str));
        m mVar = this.f40214a;
        mVar.f40403d.a(strConcat);
        if (str != null) {
            fb fbVarM = mVar.m(str);
            if (fbVarM != null) {
                mVar.f40403d.a(f.a(str, "Deferred for id ", " found and completed with error"));
                fbVarM.a().a(d.f39735a);
            } else {
                mVar.f40403d.a(f.a(str, "Deferred for id ", " not found"));
            }
        }
        m.g(mVar);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        this.f40214a.f40403d.a("Started utterance for id: ".concat(String.valueOf(str)));
    }
}
