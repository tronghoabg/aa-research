package e1;

import android.content.ClipData;
import android.location.LocationRequest;
import android.media.EncoderProfiles;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ LocationRequest d(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ EncoderProfiles.VideoProfile e(Object obj) {
        return (EncoderProfiles.VideoProfile) obj;
    }

    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i5) {
        return new ContentInfo.Builder(clipData, i5);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }
}
