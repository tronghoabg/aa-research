package defpackage;

import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;

/* loaded from: classes2.dex */
public class gdu implements hem {
    public final eqm a;
    public OpenMicrophoneRequest b;

    public gdu() {
        eqm eqmVar = new eqm();
        this.a = eqmVar;
        eqmVar.j(gdt.b);
    }

    public OpenMicrophoneResponse a(sn snVar) {
        return new OpenMicrophoneResponse(snVar);
    }

    public final void b() {
        eqm eqmVar = this.a;
        eqmVar.j(gdt.b);
        synchronized (eqmVar) {
            OpenMicrophoneRequest openMicrophoneRequest = this.b;
            if (openMicrophoneRequest != null) {
                openMicrophoneRequest.getCarAudioCallbackDelegate().onStopRecording();
                this.b = null;
            }
        }
        c();
    }

    protected void c() {
    }
}
