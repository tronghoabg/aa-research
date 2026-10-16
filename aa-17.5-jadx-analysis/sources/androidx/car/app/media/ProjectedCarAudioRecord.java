package androidx.car.app.media;

import android.util.Log;
import defpackage.qn;
import defpackage.rb;
import defpackage.sk;
import java.io.IOException;
import java.io.InputStream;

@rb
/* loaded from: classes2.dex */
public class ProjectedCarAudioRecord extends sk {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(qn qnVar) {
        super(qnVar);
    }

    @Override // defpackage.sk
    protected int readInternal(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException unused) {
            this.stopRecording();
            return -1;
        }
    }

    @Override // defpackage.sk
    protected void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // defpackage.sk
    protected void stopRecordingInternal() throws IOException {
        try {
            InputStream inputStream = this.mInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.mInputStream = null;
            }
        } catch (IOException e) {
            Log.e("CarApp", "Exception closing microphone pipe", e);
        }
    }
}
