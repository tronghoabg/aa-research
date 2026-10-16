package com.waze.speech;

import android.os.Bundle;
import android.speech.RecognitionListener;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements RecognitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f40471a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f40472b;

    u(w wVar, String str) {
        this.f40471a = wVar;
        this.f40472b = str;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        String strConcat = "on end of speech. Tag: ".concat(String.valueOf(this.f40472b));
        w wVar = this.f40471a;
        wVar.f40478d.a(strConcat);
        h.g.a.l lVar = wVar.f40480f;
        if (lVar != null) {
            lVar.invoke(o.f40467a);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i2) {
        w wVar = this.f40471a;
        wVar.f40478d.a("on error. Tag: " + this.f40472b + ", code: " + i2);
        w.f(wVar, i2);
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i2, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        String strConcat = "on ready for speech. Tag: ".concat(String.valueOf(this.f40472b));
        w wVar = this.f40471a;
        wVar.f40478d.a(strConcat);
        w.d(wVar);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        String strConcat = "on result. Tag: ".concat(String.valueOf(this.f40472b));
        w wVar = this.f40471a;
        wVar.f40478d.a(strConcat);
        w.e(wVar, bundle);
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f2) {
    }
}
