package androidx.window.embedding;

import androidx.window.embedding.OverlayAttributes;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverlayCreateParams {
    public static final Companion Companion = new Companion(null);
    private final OverlayAttributes overlayAttributes;
    private final String tag;

    /* compiled from: WazeSource */
    public final class Builder {
        private OverlayAttributes launchAttrs;
        private String tag;

        public final OverlayCreateParams build() {
            String strGenerateOverlayTag = this.tag;
            if (strGenerateOverlayTag == null) {
                strGenerateOverlayTag = OverlayCreateParams.Companion.generateOverlayTag();
            }
            OverlayAttributes overlayAttributesBuild = this.launchAttrs;
            if (overlayAttributesBuild == null) {
                overlayAttributesBuild = new OverlayAttributes.Builder().build();
            }
            return new OverlayCreateParams(strGenerateOverlayTag, overlayAttributesBuild);
        }

        public final Builder setOverlayAttributes(OverlayAttributes overlayAttributes) {
            x.f(overlayAttributes, "attrs");
            this.launchAttrs = overlayAttributes;
            return this;
        }

        public final Builder setTag(String str) {
            x.f(str, "tag");
            this.tag = str;
            return this;
        }
    }

    public /* synthetic */ OverlayCreateParams(String str, OverlayAttributes overlayAttributes, int i2, o oVar) {
        this((i2 & 1) != 0 ? Companion.generateOverlayTag() : str, (i2 & 2) != 0 ? new OverlayAttributes.Builder().build() : overlayAttributes);
    }

    public static final String generateOverlayTag() {
        return Companion.generateOverlayTag();
    }

    public final OverlayAttributes getOverlayAttributes() {
        return this.overlayAttributes;
    }

    public final String getTag() {
        return this.tag;
    }

    public String toString() {
        int i2 = ar.f48106a;
        return new m(OverlayCreateParams.class).c() + ":{ , tag=" + this.tag + ", attrs=" + this.overlayAttributes + "}";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final String generateOverlayTag() {
            String string = UUID.randomUUID().toString();
            x.e(string, "toString(...)");
            return h.n.o.z(string, new j(0, 32));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OverlayCreateParams(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        x.f(str, "tag");
    }

    public OverlayCreateParams(String str, OverlayAttributes overlayAttributes) {
        x.f(str, "tag");
        x.f(overlayAttributes, "overlayAttributes");
        this.tag = str;
        this.overlayAttributes = overlayAttributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayCreateParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
