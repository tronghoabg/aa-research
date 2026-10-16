package kotlinx.coroutines.f;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import h.k.n;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.e.al;
import kotlinx.coroutines.e.an;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f51967a = al.c();

    /* renamed from: b, reason: collision with root package name */
    public static final long f51968b = an.a("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1, Long.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final int f51969c = al.d("kotlinx.coroutines.scheduler.core.pool.size", n.h(al.a(), 2), 1, 0, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final int f51970d = al.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final long f51971e = TimeUnit.SECONDS.toNanos(an.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f, reason: collision with root package name */
    public static final h f51972f = f.f51961a;
}
