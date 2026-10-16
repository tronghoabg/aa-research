package G5;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: A, reason: collision with root package name */
    public long f4454A;

    /* renamed from: B, reason: collision with root package name */
    public long f4455B;

    /* renamed from: C, reason: collision with root package name */
    public long f4456C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4457D;

    /* renamed from: E, reason: collision with root package name */
    public long f4458E;

    /* renamed from: F, reason: collision with root package name */
    public long f4459F;

    /* renamed from: a, reason: collision with root package name */
    public final xa.d f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f4461b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f4462c;

    /* renamed from: d, reason: collision with root package name */
    public int f4463d;

    /* renamed from: e, reason: collision with root package name */
    public int f4464e;

    /* renamed from: f, reason: collision with root package name */
    public v f4465f;

    /* renamed from: g, reason: collision with root package name */
    public int f4466g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4467h;

    /* renamed from: i, reason: collision with root package name */
    public long f4468i;

    /* renamed from: j, reason: collision with root package name */
    public float f4469j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f4470l;

    /* renamed from: m, reason: collision with root package name */
    public long f4471m;

    /* renamed from: n, reason: collision with root package name */
    public Method f4472n;

    /* renamed from: o, reason: collision with root package name */
    public long f4473o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4474p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4475q;

    /* renamed from: r, reason: collision with root package name */
    public long f4476r;

    /* renamed from: s, reason: collision with root package name */
    public long f4477s;

    /* renamed from: t, reason: collision with root package name */
    public long f4478t;

    /* renamed from: u, reason: collision with root package name */
    public long f4479u;

    /* renamed from: v, reason: collision with root package name */
    public int f4480v;

    /* renamed from: w, reason: collision with root package name */
    public int f4481w;

    /* renamed from: x, reason: collision with root package name */
    public long f4482x;

    /* renamed from: y, reason: collision with root package name */
    public long f4483y;

    /* renamed from: z, reason: collision with root package name */
    public long f4484z;

    public w(xa.d dVar) {
        this.f4460a = dVar;
        if (u6.v.f46721a >= 18) {
            try {
                this.f4472n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f4461b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f4462c;
        audioTrack.getClass();
        if (this.f4482x != -9223372036854775807L) {
            return Math.min(this.f4454A, this.f4484z + ((((SystemClock.elapsedRealtime() * 1000) - this.f4482x) * this.f4466g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f4467h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f4479u = this.f4477s;
            }
            playbackHeadPosition += this.f4479u;
        }
        if (u6.v.f46721a <= 29) {
            if (playbackHeadPosition == 0 && this.f4477s > 0 && playState == 3) {
                if (this.f4483y == -9223372036854775807L) {
                    this.f4483y = SystemClock.elapsedRealtime();
                }
                return this.f4477s;
            }
            this.f4483y = -9223372036854775807L;
        }
        if (this.f4477s > playbackHeadPosition) {
            this.f4478t++;
        }
        this.f4477s = playbackHeadPosition;
        return playbackHeadPosition + (this.f4478t << 32);
    }

    public final boolean b(long j8) {
        if (j8 > a()) {
            return true;
        }
        if (!this.f4467h) {
            return false;
        }
        AudioTrack audioTrack = this.f4462c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }
}
