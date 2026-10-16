package androidx.car.app.media.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class MediaPlaybackTemplate implements defpackage.wi {
    private final androidx.car.app.model.Banner mBanner;
    private final androidx.car.app.model.Header mHeader;

    MediaPlaybackTemplate(defpackage.st stVar) {
        androidx.car.app.model.Header header = stVar.a;
        this.mHeader = null;
        androidx.car.app.model.Banner banner = stVar.b;
        this.mBanner = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.media.model.MediaPlaybackTemplate)) {
            return false;
        }
        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
        return j$.util.Objects.equals(this.mHeader, mediaPlaybackTemplate.mHeader) && j$.util.Objects.equals(this.mBanner, mediaPlaybackTemplate.mBanner);
    }

    public androidx.car.app.model.Banner getBanner() {
        return this.mBanner;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mHeader, this.mBanner);
    }

    public java.lang.String toString() {
        return "MediaPlaybackTemplate";
    }

    private MediaPlaybackTemplate() {
        this.mHeader = null;
        this.mBanner = null;
    }
}
