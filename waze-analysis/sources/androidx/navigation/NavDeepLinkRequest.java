package androidx.navigation;

import android.net.Uri;
import h.g.b.o;
import h.g.b.x;
import h.n.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class NavDeepLinkRequest {
    private final String action;
    private final String mimeType;
    private final Uri uri;

    public NavDeepLinkRequest(Uri uri, String str, String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    public String getAction() {
        return this.action;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public Uri getUri() {
        return this.uri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        return sb.toString();
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private Uri uri;

        private Builder() {
        }

        public static final Builder fromAction(String str) {
            return Companion.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return Companion.fromMimeType(str);
        }

        public static final Builder fromUri(Uri uri) {
            return Companion.fromUri(uri);
        }

        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        public final Builder setAction(String str) {
            x.f(str, "action");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.action = str;
            return this;
        }

        public final Builder setMimeType(String str) {
            x.f(str, "mimeType");
            if (new l("^[-\\w*.]+/[-\\w+*.]+$").g(str)) {
                this.mimeType = str;
                return this;
            }
            throw new IllegalArgumentException("The given mimeType " + str + " does not match to required \"type/subtype\" format");
        }

        public final Builder setUri(Uri uri) {
            x.f(uri, "uri");
            this.uri = uri;
            return this;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Builder fromAction(String str) {
                x.f(str, "action");
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                Builder builder = new Builder(null);
                builder.setAction(str);
                return builder;
            }

            public final Builder fromMimeType(String str) {
                x.f(str, "mimeType");
                Builder builder = new Builder(null);
                builder.setMimeType(str);
                return builder;
            }

            public final Builder fromUri(Uri uri) {
                x.f(uri, "uri");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Builder(o oVar) {
            this();
        }
    }
}
