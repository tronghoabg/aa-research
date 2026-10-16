package androidx.car.app.media.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Banner;
import androidx.car.app.model.Header;
import androidx.car.app.model.Template;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(8)
/* loaded from: classes2.dex */
public class MediaPlaybackTemplate implements Template {

    @RequiresCarApi(9)
    private final Banner mBanner;
    private final Header mHeader;

    /* compiled from: WazeSource */
    @RequiresCarApi(8)
    public final class Builder {
        Banner mBanner;
        Header mHeader;

        public Builder(MediaPlaybackTemplate mediaPlaybackTemplate) {
            this.mHeader = mediaPlaybackTemplate.getHeader();
            this.mBanner = mediaPlaybackTemplate.getBanner();
        }

        public MediaPlaybackTemplate build() {
            return new MediaPlaybackTemplate(this);
        }

        @RequiresCarApi(9)
        public Builder setBanner(Banner banner) {
            this.mBanner = banner;
            return this;
        }

        public Builder setHeader(Header header) {
            this.mHeader = header;
            return this;
        }
    }

    MediaPlaybackTemplate(Builder builder) {
        this.mHeader = builder.mHeader;
        this.mBanner = builder.mBanner;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlaybackTemplate)) {
            return false;
        }
        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
        return Objects.equals(this.mHeader, mediaPlaybackTemplate.mHeader) && Objects.equals(this.mBanner, mediaPlaybackTemplate.mBanner);
    }

    @RequiresCarApi(9)
    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mBanner);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    private MediaPlaybackTemplate() {
        this.mHeader = null;
        this.mBanner = null;
    }
}
