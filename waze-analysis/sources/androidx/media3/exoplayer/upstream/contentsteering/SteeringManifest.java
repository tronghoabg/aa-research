package androidx.media3.exoplayer.upstream.contentsteering;

import android.net.Uri;
import com.google.d.d.bn;
import com.google.d.d.bs;
import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SteeringManifest {
    public final bn<PathwayClone> pathwayClones;
    public final bn<String> pathwayPriority;
    public final Uri reloadUri;
    public final long timeToLiveMs;
    public final int version;

    /* compiled from: WazeSource */
    public final class PathwayClone {
        public final String baseId;
        public final String id;
        public final UriReplacement uriReplacement;

        public PathwayClone(String str, String str2, UriReplacement uriReplacement) {
            this.baseId = str;
            this.id = str2;
            this.uriReplacement = uriReplacement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PathwayClone)) {
                return false;
            }
            PathwayClone pathwayClone = (PathwayClone) obj;
            return Objects.equals(this.baseId, pathwayClone.baseId) && Objects.equals(this.id, pathwayClone.id) && Objects.equals(this.uriReplacement, pathwayClone.uriReplacement);
        }

        public int hashCode() {
            return Objects.hash(this.baseId, this.id, this.uriReplacement);
        }
    }

    /* compiled from: WazeSource */
    public final class UriReplacement {
        public final String host;
        public final bs<String, String> params;
        public final bs<String, Uri> perRenditionUris;
        public final bs<String, Uri> perVariantUris;

        public UriReplacement(String str, Map<String, String> map, Map<String, Uri> map2, Map<String, Uri> map3) {
            this.host = str;
            this.params = bs.e(map);
            this.perVariantUris = bs.e(map2);
            this.perRenditionUris = bs.e(map3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UriReplacement)) {
                return false;
            }
            UriReplacement uriReplacement = (UriReplacement) obj;
            return Objects.equals(this.host, uriReplacement.host) && Objects.equals(this.params, uriReplacement.params) && Objects.equals(this.perVariantUris, uriReplacement.perVariantUris) && Objects.equals(this.perRenditionUris, uriReplacement.perRenditionUris);
        }

        public int hashCode() {
            return Objects.hash(this.host, this.params, this.perVariantUris, this.perRenditionUris);
        }
    }

    public SteeringManifest(int i2, long j2, Uri uri, List<String> list, List<PathwayClone> list2) {
        this.version = i2;
        this.timeToLiveMs = j2;
        this.reloadUri = uri;
        this.pathwayPriority = bn.n(list);
        this.pathwayClones = bn.n(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteeringManifest)) {
            return false;
        }
        SteeringManifest steeringManifest = (SteeringManifest) obj;
        return this.version == steeringManifest.version && this.timeToLiveMs == steeringManifest.timeToLiveMs && Objects.equals(this.reloadUri, steeringManifest.reloadUri) && Objects.equals(this.pathwayPriority, steeringManifest.pathwayPriority) && Objects.equals(this.pathwayClones, steeringManifest.pathwayClones);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.version), Long.valueOf(this.timeToLiveMs), this.reloadUri, this.pathwayPriority, this.pathwayClones);
    }
}
