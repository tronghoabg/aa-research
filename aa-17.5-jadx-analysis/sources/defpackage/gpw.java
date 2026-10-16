package defpackage;

import android.content.ComponentName;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
final class gpw extends IMediaPlaybackHost.Stub {
    final /* synthetic */ gpx a;

    public gpw(gpx gpxVar) {
        this.a = gpxVar;
    }

    @Override // androidx.car.app.media.IMediaPlaybackHost
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.media.IMediaPlaybackHost
    public final void registerMediaSessionToken(Bundleable bundleable) {
        bundleable.getClass();
        gpx gpxVar = this.a;
        gqb gqbVar = (gqb) gpxVar.a.l(gqb.class);
        boolean zE = gpxVar.a.d().e();
        ComponentName componentName = ((gmh) gpxVar.a.d()).a;
        if (gqbVar != null) {
            ((ynz) gpx.c.f().o(ypi.a, "CarApp.H.Media").ai(65)).u("playback token received");
            gpxVar.n("registerMediaSessionToken", new jlk(bundleable, gpxVar, gqbVar, componentName, zE, 1));
        }
    }
}
