package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class gea implements defpackage.hew {
    public final defpackage.eqs a;
    public androidx.car.app.media.OpenMicrophoneRequest b;

    public gea() {
        defpackage.eqs eqsVar = new defpackage.eqs();
        this.a = eqsVar;
        eqsVar.j(defpackage.gdz.b);
    }

    public androidx.car.app.media.OpenMicrophoneResponse a(defpackage.ss ssVar) {
        return new androidx.car.app.media.OpenMicrophoneResponse(ssVar);
    }

    public final void b() {
        defpackage.eqs eqsVar = this.a;
        eqsVar.j(defpackage.gdz.b);
        synchronized (eqsVar) {
            androidx.car.app.media.OpenMicrophoneRequest openMicrophoneRequest = this.b;
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
