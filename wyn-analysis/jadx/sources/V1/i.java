package V1;

import E4.n;
import N1.C0765n;
import N1.C0770t;
import N1.E;
import N1.L;
import N1.M;
import N1.N;
import Q1.x;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import k2.H;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: A, reason: collision with root package name */
    public boolean f12924A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12925a;

    /* renamed from: b, reason: collision with root package name */
    public final f f12926b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f12927c;

    /* renamed from: i, reason: collision with root package name */
    public String f12933i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f12934j;
    public int k;

    /* renamed from: n, reason: collision with root package name */
    public E f12937n;

    /* renamed from: o, reason: collision with root package name */
    public n f12938o;

    /* renamed from: p, reason: collision with root package name */
    public n f12939p;

    /* renamed from: q, reason: collision with root package name */
    public n f12940q;

    /* renamed from: r, reason: collision with root package name */
    public C0765n f12941r;

    /* renamed from: s, reason: collision with root package name */
    public C0765n f12942s;

    /* renamed from: t, reason: collision with root package name */
    public C0765n f12943t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12944u;

    /* renamed from: v, reason: collision with root package name */
    public int f12945v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12946w;

    /* renamed from: x, reason: collision with root package name */
    public int f12947x;

    /* renamed from: y, reason: collision with root package name */
    public int f12948y;

    /* renamed from: z, reason: collision with root package name */
    public int f12949z;

    /* renamed from: e, reason: collision with root package name */
    public final M f12929e = new M();

    /* renamed from: f, reason: collision with root package name */
    public final L f12930f = new L();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f12932h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f12931g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f12928d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f12935l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f12936m = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f12925a = context.getApplicationContext();
        this.f12927c = playbackSession;
        f fVar = new f();
        this.f12926b = fVar;
        fVar.f12920d = this;
    }

    public final boolean a(n nVar) {
        String str;
        if (nVar == null) {
            return false;
        }
        String str2 = (String) nVar.f2940d;
        f fVar = this.f12926b;
        synchronized (fVar) {
            str = fVar.f12922f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f12934j;
        if (builder != null && this.f12924A) {
            builder.setAudioUnderrunCount(this.f12949z);
            this.f12934j.setVideoFramesDropped(this.f12947x);
            this.f12934j.setVideoFramesPlayed(this.f12948y);
            Long l10 = (Long) this.f12931g.get(this.f12933i);
            this.f12934j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f12932h.get(this.f12933i);
            this.f12934j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f12934j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f12927c.reportPlaybackMetrics(this.f12934j.build());
        }
        this.f12934j = null;
        this.f12933i = null;
        this.f12949z = 0;
        this.f12947x = 0;
        this.f12948y = 0;
        this.f12941r = null;
        this.f12942s = null;
        this.f12943t = null;
        this.f12924A = false;
    }

    public final void c(N n10, H h10) {
        int iB;
        PlaybackMetrics.Builder builder = this.f12934j;
        if (h10 == null || (iB = n10.b(h10.f38903a)) == -1) {
            return;
        }
        L l10 = this.f12930f;
        int i5 = 0;
        n10.f(iB, l10, false);
        int i10 = l10.f8050c;
        M m10 = this.f12929e;
        n10.n(i10, m10);
        C0770t c0770t = m10.f8059c.f8272b;
        if (c0770t != null) {
            int iD = x.D(c0770t.f8264a, c0770t.f8265b);
            i5 = iD != 0 ? iD != 1 ? iD != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i5);
        if (m10.f8068m != -9223372036854775807L && !m10.k && !m10.f8065i && !m10.a()) {
            builder.setMediaDurationMillis(x.W(m10.f8068m));
        }
        builder.setPlaybackType(m10.a() ? 2 : 1);
        this.f12924A = true;
    }

    public final void d(a aVar, String str) {
        H h10 = aVar.f12890d;
        if ((h10 == null || !h10.b()) && str.equals(this.f12933i)) {
            b();
        }
        this.f12931g.remove(str);
        this.f12932h.remove(str);
    }

    public final void e(int i5, long j8, C0765n c0765n, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = F5.i.j(i5).setTimeSinceCreatedMillis(j8 - this.f12928d);
        if (c0765n != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = c0765n.f8231m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0765n.f8232n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0765n.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = c0765n.f8229j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = c0765n.f8239u;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = c0765n.f8240v;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = c0765n.f8210C;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = c0765n.f8211D;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = c0765n.f8223d;
            if (str4 != null) {
                int i17 = x.f9724a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = c0765n.f8241w;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f12924A = true;
        this.f12927c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
