package F5;

import E5.C0440a0;
import E5.C0465o;
import E5.H0;
import E5.I0;
import E5.J0;
import E5.T;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import f6.C2613z;
import java.util.HashMap;
import u6.v;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3915A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3916a;

    /* renamed from: b, reason: collision with root package name */
    public final h f3917b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f3918c;

    /* renamed from: i, reason: collision with root package name */
    public String f3924i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f3925j;
    public int k;

    /* renamed from: n, reason: collision with root package name */
    public C0465o f3928n;

    /* renamed from: o, reason: collision with root package name */
    public S3.e f3929o;

    /* renamed from: p, reason: collision with root package name */
    public S3.e f3930p;

    /* renamed from: q, reason: collision with root package name */
    public S3.e f3931q;

    /* renamed from: r, reason: collision with root package name */
    public T f3932r;

    /* renamed from: s, reason: collision with root package name */
    public T f3933s;

    /* renamed from: t, reason: collision with root package name */
    public T f3934t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3935u;

    /* renamed from: v, reason: collision with root package name */
    public int f3936v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3937w;

    /* renamed from: x, reason: collision with root package name */
    public int f3938x;

    /* renamed from: y, reason: collision with root package name */
    public int f3939y;

    /* renamed from: z, reason: collision with root package name */
    public int f3940z;

    /* renamed from: e, reason: collision with root package name */
    public final I0 f3920e = new I0();

    /* renamed from: f, reason: collision with root package name */
    public final H0 f3921f = new H0();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f3923h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3922g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f3919d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f3926l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3927m = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.f3916a = context.getApplicationContext();
        this.f3918c = playbackSession;
        h hVar = new h();
        this.f3917b = hVar;
        hVar.f3912d = this;
    }

    public final boolean a(S3.e eVar) {
        String str;
        if (eVar == null) {
            return false;
        }
        String str2 = (String) eVar.f10942c;
        h hVar = this.f3917b;
        synchronized (hVar) {
            str = hVar.f3914f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f3925j;
        if (builder != null && this.f3915A) {
            builder.setAudioUnderrunCount(this.f3940z);
            this.f3925j.setVideoFramesDropped(this.f3938x);
            this.f3925j.setVideoFramesPlayed(this.f3939y);
            Long l10 = (Long) this.f3922g.get(this.f3924i);
            this.f3925j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f3923h.get(this.f3924i);
            this.f3925j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f3925j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f3918c.reportPlaybackMetrics(this.f3925j.build());
        }
        this.f3925j = null;
        this.f3924i = null;
        this.f3940z = 0;
        this.f3938x = 0;
        this.f3939y = 0;
        this.f3932r = null;
        this.f3933s = null;
        this.f3934t = null;
        this.f3915A = false;
    }

    public final void c(J0 j02, C2613z c2613z) {
        int iB;
        PlaybackMetrics.Builder builder = this.f3925j;
        if (c2613z == null || (iB = j02.b(c2613z.f35112a)) == -1) {
            return;
        }
        H0 h02 = this.f3921f;
        int i5 = 0;
        j02.f(iB, h02, false);
        int i10 = h02.f3041c;
        I0 i02 = this.f3920e;
        j02.n(i10, i02);
        C0440a0 c0440a0 = i02.f3112c.f3305b;
        if (c0440a0 != null) {
            int iU = v.u(c0440a0.f3282a);
            i5 = iU != 0 ? iU != 1 ? iU != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i5);
        if (i02.f3121m != -9223372036854775807L && !i02.k && !i02.f3117h && !i02.a()) {
            builder.setMediaDurationMillis(v.F(i02.f3121m));
        }
        builder.setPlaybackType(i02.a() ? 2 : 1);
        this.f3915A = true;
    }

    public final void d(a aVar, String str) {
        C2613z c2613z = aVar.f3876d;
        if ((c2613z == null || !c2613z.a()) && str.equals(this.f3924i)) {
            b();
        }
        this.f3922g.remove(str);
        this.f3923h.remove(str);
    }

    public final void e(int i5, long j8, T t10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = i.j(i5).setTimeSinceCreatedMillis(j8 - this.f3919d);
        if (t10 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = t10.k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = t10.f3238l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = t10.f3236i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i10 = t10.f3235h;
            if (i10 != -1) {
                timeSinceCreatedMillis.setBitrate(i10);
            }
            int i11 = t10.f3243q;
            if (i11 != -1) {
                timeSinceCreatedMillis.setWidth(i11);
            }
            int i12 = t10.f3244r;
            if (i12 != -1) {
                timeSinceCreatedMillis.setHeight(i12);
            }
            int i13 = t10.f3251y;
            if (i13 != -1) {
                timeSinceCreatedMillis.setChannelCount(i13);
            }
            int i14 = t10.f3252z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i14);
            }
            String str4 = t10.f3230c;
            if (str4 != null) {
                int i15 = v.f46721a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = t10.f3245s;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f3915A = true;
        this.f3918c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
