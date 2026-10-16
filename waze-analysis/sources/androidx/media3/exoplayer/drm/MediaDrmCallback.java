package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.source.LoadEventInfo;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MediaDrmCallback {
    Response executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest);

    Response executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest);

    /* compiled from: WazeSource */
    public final class Response {
        public final byte[] data;
        public final LoadEventInfo loadEventInfo;

        /* compiled from: WazeSource */
        public final class Builder {
            private final byte[] data;
            private LoadEventInfo loadEventInfo;

            public Builder(byte[] bArr) {
                this.data = bArr;
            }

            public Response build() {
                return new Response(this);
            }

            public Builder setLoadEventInfo(LoadEventInfo loadEventInfo) {
                this.loadEventInfo = loadEventInfo;
                return this;
            }
        }

        private Response(Builder builder) {
            this.data = builder.data;
            this.loadEventInfo = builder.loadEventInfo;
        }

        public Response(byte[] bArr) {
            this.data = bArr;
            this.loadEventInfo = null;
        }
    }
}
