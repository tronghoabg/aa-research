package androidx.car.app.media.model;

import androidx.car.app.model.Banner;
import androidx.car.app.model.Header;
import defpackage.rb;
import defpackage.so;
import defpackage.wb;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public class MediaPlaybackTemplate implements wb {
    private final Banner mBanner;
    private final Header mHeader;

    MediaPlaybackTemplate(so soVar) {
        Header header = soVar.a;
        this.mHeader = null;
        Banner banner = soVar.b;
        this.mBanner = null;
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
