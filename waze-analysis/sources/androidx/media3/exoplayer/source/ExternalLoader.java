package androidx.media3.exoplayer.source;

import android.net.Uri;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ExternalLoader {

    /* compiled from: WazeSource */
    public final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }

    bm<?> load(LoadRequest loadRequest);
}
