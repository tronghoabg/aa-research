package defpackage;

import android.content.Context;
import android.speech.SpeechRecognizer;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class rc {
    public final Context a;
    public final q9 b;
    public SpeechRecognizer c;
    public boolean d;
    public final qc e = new qc(this);

    public rc(Context context, q9 q9Var) {
        this.a = context;
        this.b = q9Var;
    }

    public final void a() {
        SpeechRecognizer speechRecognizer;
        if (!this.d || (speechRecognizer = this.c) == null) {
            return;
        }
        try {
            speechRecognizer.stopListening();
        } catch (Exception unused) {
        }
        this.d = false;
    }

    public final void b() {
        if (this.c != null) {
            return;
        }
        try {
            SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this.a);
            this.c = speechRecognizerCreateSpeechRecognizer;
            speechRecognizerCreateSpeechRecognizer.setRecognitionListener(this.e);
        } catch (Exception e) {
            this.c = null;
            e.getMessage();
        }
    }
}
