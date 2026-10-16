package androidx.car.app.media;

import android.util.Log;
import androidx.car.app.CarContext;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.utils.LogTags;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class ProjectedCarAudioRecord extends CarAudioRecord {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(CarContext carContext) {
        super(carContext);
    }

    @Override // androidx.car.app.media.CarAudioRecord
    protected int readInternal(byte[] bArr, int i2, int i3) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i2, i3);
        } catch (IOException unused) {
            this.stopRecording();
            return -1;
        }
    }

    @Override // androidx.car.app.media.CarAudioRecord
    protected void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // androidx.car.app.media.CarAudioRecord
    protected void stopRecordingInternal() throws IOException {
        try {
            InputStream inputStream = this.mInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.mInputStream = null;
            }
        } catch (IOException e2) {
            Log.e(LogTags.TAG, "Exception closing microphone pipe", e2);
        }
    }
}
