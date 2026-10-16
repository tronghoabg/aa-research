package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.source.LoadEventInfo;
import com.google.d.d.bi;
import com.google.d.d.bn;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class KeyRequestInfo {
    public final bn<LoadEventInfo> loadInfos;
    public final bn<DrmInitData.SchemeData> schemeDatas;

    /* compiled from: WazeSource */
    public final class Builder {
        private final bi<LoadEventInfo> loadEventInfos;
        private bn<DrmInitData.SchemeData> schemeDatas;

        public Builder() {
            int i2 = bn.f7456d;
            this.loadEventInfos = new bi<>();
        }

        public Builder addLoadInfo(LoadEventInfo loadEventInfo) {
            this.loadEventInfos.g(loadEventInfo);
            return this;
        }

        public KeyRequestInfo build() {
            return new KeyRequestInfo(this);
        }

        public Builder setSchemeDatas(List<DrmInitData.SchemeData> list) {
            this.schemeDatas = bn.n(list);
            return this;
        }
    }

    private KeyRequestInfo(Builder builder) {
        this.loadInfos = builder.loadEventInfos.f();
        this.schemeDatas = builder.schemeDatas;
    }
}
