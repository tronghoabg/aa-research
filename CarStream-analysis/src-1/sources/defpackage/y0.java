package defpackage;

import android.content.ClipData;
import android.location.LocationRequest;
import android.view.ContentInfo;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y0 {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ LocationRequest.Builder d(long j) {
        return new LocationRequest.Builder(j);
    }

    public static /* bridge */ /* synthetic */ LocationRequest i(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* synthetic */ ContentInfo.Builder m(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder n(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo p(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return LocationRequest.class;
    }

    public static /* synthetic */ void s() {
    }
}
