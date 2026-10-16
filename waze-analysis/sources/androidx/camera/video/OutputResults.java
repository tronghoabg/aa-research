package androidx.camera.video;

import android.net.Uri;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class OutputResults {
    static OutputResults of(Uri uri) {
        Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new AutoValue_OutputResults(uri);
    }

    public abstract Uri getOutputUri();
}
