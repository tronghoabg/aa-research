package d2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class g implements LoudnessCodecController$OnLoudnessCodecUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd.c f33988a;

    public g(Dd.c cVar) {
        this.f33988a = cVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((h) this.f33988a.f2643c).getClass();
        return bundle;
    }
}
