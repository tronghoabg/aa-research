package f5;

import android.speech.SpeechRecognizer;

/* renamed from: f5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2565c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2570h f34829b;

    public /* synthetic */ RunnableC2565c(C2570h c2570h, int i5) {
        this.f34828a = i5;
        this.f34829b = c2570h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34828a) {
            case 0:
                C2570h c2570h = this.f34829b;
                c2570h.c("Recognizer destroy");
                SpeechRecognizer speechRecognizer = c2570h.f34858p;
                if (speechRecognizer != null) {
                    speechRecognizer.destroy();
                }
                c2570h.f34858p = null;
                break;
            case 1:
                C2570h c2570h2 = this.f34829b;
                SpeechRecognizer speechRecognizer2 = c2570h2.f34858p;
                if (speechRecognizer2 != null) {
                    speechRecognizer2.startListening(c2570h2.f34859q);
                    break;
                }
                break;
            case 2:
                SpeechRecognizer speechRecognizer3 = this.f34829b.f34858p;
                if (speechRecognizer3 != null) {
                    speechRecognizer3.cancel();
                    break;
                }
                break;
            default:
                SpeechRecognizer speechRecognizer4 = this.f34829b.f34858p;
                if (speechRecognizer4 != null) {
                    speechRecognizer4.stopListening();
                    break;
                }
                break;
        }
    }
}
