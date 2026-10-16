package androidx.car.app.media.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Header;
import androidx.car.app.model.Template;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(8)
/* loaded from: classes.dex */
public class MediaPlaybackTemplate implements Template {
    private final Header mHeader;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Header mHeader;

        public Builder() {
        }

        public MediaPlaybackTemplate build() {
            return new MediaPlaybackTemplate(this);
        }

        public Builder setHeader(Header header) {
            this.mHeader = header;
            return this;
        }

        public Builder(MediaPlaybackTemplate mediaPlaybackTemplate) {
            this.mHeader = mediaPlaybackTemplate.getHeader();
        }
    }

    private MediaPlaybackTemplate() {
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaPlaybackTemplate) {
            return Objects.equals(this.mHeader, ((MediaPlaybackTemplate) obj).mHeader);
        }
        return false;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    public MediaPlaybackTemplate(Builder builder) {
        this.mHeader = builder.mHeader;
    }
}
