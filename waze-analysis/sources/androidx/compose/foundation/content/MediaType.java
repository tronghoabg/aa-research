package androidx.compose.foundation.content;

import androidx.webkit.internal.AssetHelper;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MediaType {
    public static final int $stable = 0;
    private final String representation;
    public static final Companion Companion = new Companion(null);
    private static final MediaType Text = new MediaType("text/*");
    private static final MediaType PlainText = new MediaType(AssetHelper.DEFAULT_MIME_TYPE);
    private static final MediaType HtmlText = new MediaType("text/html");
    private static final MediaType Image = new MediaType("image/*");
    private static final MediaType All = new MediaType("*/*");

    public MediaType(String str) {
        this.representation = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaType) {
            return x.n(this.representation, ((MediaType) obj).representation);
        }
        return false;
    }

    public final String getRepresentation() {
        return this.representation;
    }

    public int hashCode() {
        return this.representation.hashCode();
    }

    public String toString() {
        return "MediaType(representation='" + this.representation + "')";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final MediaType getAll() {
            return MediaType.All;
        }

        public final MediaType getHtmlText() {
            return MediaType.HtmlText;
        }

        public final MediaType getImage() {
            return MediaType.Image;
        }

        public final MediaType getPlainText() {
            return MediaType.PlainText;
        }

        public final MediaType getText() {
            return MediaType.Text;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
