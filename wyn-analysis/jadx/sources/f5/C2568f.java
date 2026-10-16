package f5;

import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.speech.SpeechRecognizer;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;

/* renamed from: f5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2568f implements RecognitionSupportCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Wa.h f34836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2570h f34837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f34838c;

    public C2568f(Wa.h hVar, C2570h c2570h, G g9) {
        this.f34836a = hVar;
        this.f34837b = c2570h;
        this.f34838c = g9;
    }

    public final void onError(int i5) {
        this.f34837b.c("error from checkRecognitionSupport: " + i5);
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.f34838c.f39740a;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        AbstractC3340k.e(recognitionSupport, "recognitionSupport");
        new C2563a(this.f34836a, this.f34837b.f34852i).b(recognitionSupport.getSupportedOnDeviceLanguages());
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.f34838c.f39740a;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }
}
