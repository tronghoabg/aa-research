package androidx.camera.video;

import android.content.Context;
import android.net.Uri;
import androidx.camera.video.Recorder;
import androidx.core.util.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class Recorder$RecordingRecord$$ExternalSyntheticLambda5 implements Consumer {
    public /* synthetic */ MediaStoreOutputOptions f$0;
    public /* synthetic */ Context f$1;

    public /* synthetic */ Recorder$RecordingRecord$$ExternalSyntheticLambda5(MediaStoreOutputOptions mediaStoreOutputOptions, Context context) {
        this.f$0 = mediaStoreOutputOptions;
        this.f$1 = context;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) throws Throwable {
        Recorder.RecordingRecord.lambda$initializeRecording$4(this.f$0, this.f$1, (Uri) obj);
    }
}
