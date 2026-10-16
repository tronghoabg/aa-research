package androidx.camera.video;

import androidx.camera.video.HighSpeedVideoSessionConfig;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HighSpeedVideoSessionConfigKt {
    public static final /* synthetic */ HighSpeedVideoSessionConfig highSpeedVideoSessionConfig(VideoCapture<?> videoCapture, l<? super HighSpeedVideoSessionConfig.Builder, ab> lVar) {
        x.f(videoCapture, "videoCapture");
        x.f(lVar, "block");
        HighSpeedVideoSessionConfig.Builder builder = new HighSpeedVideoSessionConfig.Builder(videoCapture);
        lVar.invoke(builder);
        return builder.build();
    }
}
