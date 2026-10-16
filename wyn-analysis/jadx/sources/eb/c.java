package eb;

import A.AbstractC0213f;
import A7.V;
import E5.C0466p;
import E5.C0474y;
import E5.J;
import E5.Y;
import Mf.d;
import N1.A;
import N1.B;
import N1.C0754c;
import N1.C0767p;
import N1.C0769s;
import N1.C0770t;
import N1.C0771u;
import N1.C0773w;
import N1.E;
import N1.F;
import N1.G;
import N1.H;
import N1.I;
import N1.O;
import N1.P;
import N1.Q;
import N1.U;
import N1.z;
import Q1.k;
import Q1.x;
import R8.v;
import U1.C0836f;
import U1.C0838h;
import U1.C0839i;
import U1.C0840j;
import U1.C0841k;
import U1.C0846p;
import U1.C0850u;
import U1.W;
import U1.Z;
import U1.r;
import V1.c;
import X1.f;
import X2.j;
import Y1.e;
import a2.C1323c;
import a2.C1324d;
import a2.n;
import a9.C1342b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.X;
import b2.p;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k2.AbstractC3144a;
import k2.C3151h;
import k2.C3162t;
import k2.g0;
import k2.j0;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import n2.C3585h;
import n2.C3586i;
import n2.o;
import n2.s;
import tc.g;
import uc.C4271h;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import wa.C4398a;

/* loaded from: classes4.dex */
public final class c implements InterfaceC4279p, H {

    /* renamed from: F, reason: collision with root package name */
    public static final Random f34598F = new Random();

    /* renamed from: A, reason: collision with root package name */
    public String f34599A;

    /* renamed from: B, reason: collision with root package name */
    public Integer f34600B;

    /* renamed from: E, reason: collision with root package name */
    public int f34603E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f34604a;

    /* renamed from: b, reason: collision with root package name */
    public final d f34605b;

    /* renamed from: c, reason: collision with root package name */
    public final d f34606c;

    /* renamed from: d, reason: collision with root package name */
    public long f34607d;

    /* renamed from: e, reason: collision with root package name */
    public long f34608e;

    /* renamed from: f, reason: collision with root package name */
    public long f34609f;

    /* renamed from: g, reason: collision with root package name */
    public Long f34610g;

    /* renamed from: h, reason: collision with root package name */
    public g f34611h;

    /* renamed from: i, reason: collision with root package name */
    public g f34612i;

    /* renamed from: j, reason: collision with root package name */
    public g f34613j;

    /* renamed from: l, reason: collision with root package name */
    public F2.c f34614l;

    /* renamed from: m, reason: collision with root package name */
    public F2.b f34615m;

    /* renamed from: n, reason: collision with root package name */
    public C0754c f34616n;

    /* renamed from: o, reason: collision with root package name */
    public final C0838h f34617o;

    /* renamed from: p, reason: collision with root package name */
    public final Q f34618p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f34619q;

    /* renamed from: r, reason: collision with root package name */
    public final C0836f f34620r;

    /* renamed from: s, reason: collision with root package name */
    public final List f34621s;

    /* renamed from: w, reason: collision with root package name */
    public HashMap f34625w;

    /* renamed from: x, reason: collision with root package name */
    public C0850u f34626x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f34627y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f34628z;
    public final HashMap k = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f34622t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f34623u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public int f34624v = 0;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f34601C = new Handler(Looper.getMainLooper());

    /* renamed from: D, reason: collision with root package name */
    public final V f34602D = new V(this, 29);

    public c(Context context, InterfaceC4269f interfaceC4269f, String str, Map map, List list, Map map2, Boolean bool, boolean z2) {
        boolean z10 = false;
        this.f34604a = context;
        this.f34621s = list;
        this.f34619q = z2;
        if (map2 != null) {
            P p10 = new P();
            p10.f8079b = ((Boolean) map2.get("isGaplessSupportRequired")).booleanValue();
            p10.f8080c = ((Boolean) map2.get("isSpeedChangeSupportRequired")).booleanValue();
            p10.f8078a = ((Integer) map2.get("audioOffloadMode")).intValue();
            this.f34618p = new Q(p10);
        } else {
            boolean zBooleanValue = bool.booleanValue();
            P p11 = new P();
            p11.f8079b = !bool.booleanValue();
            p11.f8080c = !bool.booleanValue();
            p11.f8078a = zBooleanValue ? 1 : 0;
            this.f34618p = new Q(p11);
        }
        new C4281r(interfaceC4269f, v.f("com.ryanheise.just_audio.methods.", str)).b(this);
        this.f34605b = new d(interfaceC4269f, v.f("com.ryanheise.just_audio.events.", str));
        this.f34606c = new d(interfaceC4269f, v.f("com.ryanheise.just_audio.data.", str));
        this.f34603E = 1;
        if (map != null) {
            Map map3 = (Map) map.get("androidLoadControl");
            if (map3 != null) {
                int iLongValue = (int) (Q(map3.get("minBufferDuration")).longValue() / 1000);
                int iLongValue2 = (int) (Q(map3.get("maxBufferDuration")).longValue() / 1000);
                int iLongValue3 = (int) (Q(map3.get("bufferForPlaybackDuration")).longValue() / 1000);
                int iLongValue4 = (int) (Q(map3.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000);
                C0838h.a(iLongValue3, 0, "bufferForPlaybackMs", "0");
                C0838h.a(iLongValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                C0838h.a(iLongValue, iLongValue3, "minBufferMs", "bufferForPlaybackMs");
                C0838h.a(iLongValue, iLongValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                C0838h.a(iLongValue2, iLongValue, "maxBufferMs", "minBufferMs");
                boolean zBooleanValue2 = ((Boolean) map3.get("prioritizeTimeOverSizeThresholds")).booleanValue();
                int iLongValue5 = (int) (Q(map3.get("backBufferDuration")).longValue() / 1000);
                C0838h.a(iLongValue5, 0, "backBufferDurationMs", "0");
                this.f34617o = new C0838h(new o2.e(0), iLongValue, iLongValue2, iLongValue3, iLongValue4, map3.get("targetBufferBytes") != null ? ((Integer) map3.get("targetBufferBytes")).intValue() : -1, zBooleanValue2, iLongValue5);
            }
            Map map4 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map4 != null) {
                int i5 = x.f9724a;
                float fDoubleValue = (float) ((Double) map4.get("fallbackMinPlaybackSpeed")).doubleValue();
                k.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT < fDoubleValue && fDoubleValue <= 1.0f);
                float fDoubleValue2 = (float) ((Double) map4.get("fallbackMaxPlaybackSpeed")).doubleValue();
                k.c(fDoubleValue2 >= 1.0f);
                long jLongValue = Q(map4.get("minUpdateInterval")).longValue() / 1000;
                k.c(jLongValue > 0);
                float fDoubleValue3 = (float) ((Double) map4.get("proportionalControlFactor")).doubleValue();
                k.c(fDoubleValue3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f10 = fDoubleValue3 / 1000000.0f;
                long jLongValue2 = Q(map4.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000;
                k.c(jLongValue2 > 0);
                long jK = x.K(jLongValue2);
                long jLongValue3 = Q(map4.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000;
                k.c(jLongValue3 >= 0);
                long jK2 = x.K(jLongValue3);
                float fDoubleValue4 = (float) ((Double) map4.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
                if (fDoubleValue4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fDoubleValue4 < 1.0f) {
                    z10 = true;
                }
                k.c(z10);
                this.f34620r = new C0836f(fDoubleValue, fDoubleValue2, jLongValue, f10, jK, jK2, fDoubleValue4);
            }
        }
    }

    public static g0 G(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = ((Integer) list.get(i5)).intValue();
        }
        return new g0(Arrays.copyOf(iArr, size), new Random(f34598F.nextLong()));
    }

    public static Long Q(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static Object T(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    public static HashMap U(Object... objArr) {
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < objArr.length; i5 += 2) {
            map.put((String) objArr[i5], objArr[i5 + 1]);
        }
        return map;
    }

    @Override // N1.H
    public final /* synthetic */ void A(F f10) {
    }

    public final void B() {
        Iterator it = this.f34622t.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.f34623u.clear();
    }

    @Override // N1.H
    public final void C(E e7) {
        if (!(e7 instanceof C0840j)) {
            Log.e("AudioPlayer", "default PlaybackException: " + e7.getMessage());
            Y(e7.f8029a, e7.getMessage(), U("index", this.f34600B), true);
            return;
        }
        C0840j c0840j = (C0840j) e7;
        int i5 = c0840j.f12083c;
        if (i5 == 0) {
            StringBuilder sb2 = new StringBuilder("TYPE_SOURCE: ");
            k.g(i5 == 0);
            Throwable cause = c0840j.getCause();
            cause.getClass();
            sb2.append(((IOException) cause).getMessage());
            Log.e("AudioPlayer", sb2.toString());
        } else if (i5 != 1) {
            int i10 = c0840j.f12083c;
            if (i5 != 2) {
                StringBuilder sb3 = new StringBuilder("default ExoPlaybackException: ");
                k.g(i10 == 2);
                Throwable cause2 = c0840j.getCause();
                cause2.getClass();
                sb3.append(((RuntimeException) cause2).getMessage());
                Log.e("AudioPlayer", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder("TYPE_UNEXPECTED: ");
                k.g(i10 == 2);
                Throwable cause3 = c0840j.getCause();
                cause3.getClass();
                sb4.append(((RuntimeException) cause3).getMessage());
                Log.e("AudioPlayer", sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder("TYPE_RENDERER: ");
            k.g(i5 == 1);
            Throwable cause4 = c0840j.getCause();
            cause4.getClass();
            sb5.append(((Exception) cause4).getMessage());
            Log.e("AudioPlayer", sb5.toString());
        }
        Y(i5, c0840j.getMessage(), U("index", this.f34600B), true);
    }

    public final C3162t D(Object obj) {
        return (C3162t) this.k.get((String) obj);
    }

    @Override // N1.H
    public final /* synthetic */ void E(G g9) {
    }

    @Override // N1.H
    public final void F(N1.V v2) {
        for (int i5 = 0; i5 < v2.f8123a.size(); i5++) {
            O o7 = ((U) v2.f8123a.get(i5)).f8118b;
            for (int i10 = 0; i10 < o7.f8073a; i10++) {
                B b5 = o7.f8076d[i10].f8230l;
                if (b5 != null) {
                    int i11 = 0;
                    while (true) {
                        A[] aArr = b5.f8023a;
                        if (i11 < aArr.length) {
                            A a5 = aArr[i11];
                            if (a5 instanceof F2.b) {
                                this.f34615m = (F2.b) a5;
                                r();
                            }
                            i11++;
                        }
                    }
                }
            }
        }
    }

    public final void H() {
        if (this.f34603E == 2) {
            Y(10000000, "Connection aborted", null, true);
        }
        g gVar = this.f34612i;
        if (gVar != null) {
            gVar.a(new HashMap());
            this.f34612i = null;
        }
        this.k.clear();
        B();
        C0850u c0850u = this.f34626x;
        if (c0850u != null) {
            c0850u.A0();
            this.f34626x = null;
            this.f34603E = 1;
            r();
        }
        this.f34605b.b();
        this.f34606c.b();
    }

    public final void I() {
        HashMap map = new HashMap();
        Long lValueOf = P() == -9223372036854775807L ? null : Long.valueOf(P() * 1000);
        C0850u c0850u = this.f34626x;
        this.f34609f = c0850u != null ? c0850u.h0() : 0L;
        map.put("processingState", Integer.valueOf(AbstractC0213f.f(this.f34603E)));
        map.put("updatePosition", Long.valueOf(this.f34607d * 1000));
        map.put("updateTime", Long.valueOf(this.f34608e));
        map.put("bufferedPosition", Long.valueOf(Math.max(this.f34607d, this.f34609f) * 1000));
        HashMap map2 = new HashMap();
        if (this.f34614l != null) {
            HashMap map3 = new HashMap();
            map3.put("title", this.f34614l.f3820b);
            map3.put("url", this.f34614l.f3821c);
            map2.put("info", map3);
        }
        if (this.f34615m != null) {
            HashMap map4 = new HashMap();
            map4.put("bitrate", Integer.valueOf(this.f34615m.f3813a));
            map4.put("genre", this.f34615m.f3814b);
            map4.put(MediationMetaData.KEY_NAME, this.f34615m.f3815c);
            map4.put("metadataInterval", Integer.valueOf(this.f34615m.f3818f));
            map4.put("url", this.f34615m.f3816d);
            map4.put("isPublic", Boolean.valueOf(this.f34615m.f3817e));
            map2.put("headers", map4);
        }
        map.put("icyMetadata", map2);
        map.put("duration", lValueOf);
        map.put("currentIndex", this.f34600B);
        map.put("androidAudioSessionId", this.f34627y);
        map.put("errorCode", this.f34628z);
        map.put("errorMessage", this.f34599A);
        this.f34625w = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J() throws IllegalStateException, UnsupportedOperationException, IllegalArgumentException {
        Equalizer equalizer;
        int i5 = 1;
        if (this.f34626x == null) {
            J j8 = new J(new Z() { // from class: eb.a
                @Override // U1.Z
                public final W[] a(Handler handler, r rVar, r rVar2, r rVar3, r rVar4) {
                    c cVar = this.f34591a;
                    W[] wArrA = new C0839i(cVar.f34604a).a(handler, rVar, rVar2, rVar3, rVar4);
                    W[] wArr = (W[]) Arrays.copyOf(wArrA, wArrA.length + 1);
                    wArr[wArrA.length] = new b(cVar);
                    return wArr;
                }
            }, 2);
            Context context = this.f34604a;
            C0841k c0841k = new C0841k(context, j8, new C0466p(context, 5));
            k.g(!c0841k.f12107s);
            c0841k.f12101m = this.f34619q;
            C0838h c0838h = this.f34617o;
            if (c0838h != null) {
                k.g(!c0841k.f12107s);
                c0841k.f12095f = new J(c0838h, i5);
            }
            C0836f c0836f = this.f34620r;
            if (c0836f != null) {
                k.g(!c0841k.f12107s);
                c0841k.f12103o = c0836f;
            }
            C0850u c0850uA = c0841k.a();
            this.f34626x = c0850uA;
            c0850uA.S0();
            s sVar = c0850uA.f12158h;
            C3586i c3586iD = ((o) sVar).d();
            c3586iD.getClass();
            C3585h c3585h = new C3585h(c3586iD);
            c3585h.f8096m = this.f34618p;
            C3586i c3586i = new C3586i(c3585h);
            c0850uA.S0();
            sVar.getClass();
            o oVar = (o) sVar;
            if (!c3586i.equals(oVar.d())) {
                oVar.j(c3586i);
                C3585h c3585h2 = new C3585h(oVar.d());
                c3585h2.a(c3586i);
                oVar.j(new C3586i(c3585h2));
                c0850uA.f12161l.e(19, new C0846p(c3586i));
            }
            C0850u c0850u = this.f34626x;
            c0850u.S0();
            int i10 = c0850u.f12139T;
            if (i10 == 0) {
                this.f34627y = null;
            } else {
                this.f34627y = Integer.valueOf(i10);
            }
            B();
            if (this.f34627y != null) {
                for (Map map : this.f34621s) {
                    int iIntValue = this.f34627y.intValue();
                    String str = (String) map.get("type");
                    str.getClass();
                    if (str.equals("AndroidEqualizer")) {
                        equalizer = new Equalizer(0, iIntValue);
                    } else {
                        if (!str.equals("AndroidLoudnessEnhancer")) {
                            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
                        }
                        int iRound = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 100.0d);
                        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(iIntValue);
                        loudnessEnhancer.setTargetGain(iRound);
                        equalizer = loudnessEnhancer;
                    }
                    if (((Boolean) map.get("enabled")).booleanValue()) {
                        equalizer.setEnabled(true);
                    }
                    this.f34622t.add(equalizer);
                    this.f34623u.put((String) map.get("type"), equalizer);
                }
            }
            I();
            C0850u c0850u2 = this.f34626x;
            c0850u2.getClass();
            c0850u2.f12161l.a(this);
        }
    }

    public final HashMap K() {
        short s10 = 1;
        Equalizer equalizer = (Equalizer) this.f34623u.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        short s11 = 0;
        while (s11 < equalizer.getNumberOfBands()) {
            Short shValueOf = Short.valueOf(s11);
            Double dValueOf = Double.valueOf(equalizer.getBandFreqRange(s11)[0] / 1000.0d);
            Double dValueOf2 = Double.valueOf(equalizer.getBandFreqRange(s11)[s10] / 1000.0d);
            short s12 = s10;
            Double dValueOf3 = Double.valueOf(equalizer.getCenterFreq(s11) / 1000.0d);
            Double dValueOf4 = Double.valueOf(equalizer.getBandLevel(s11) / 100.0d);
            Object[] objArr = new Object[10];
            objArr[0] = "index";
            objArr[s12] = shValueOf;
            objArr[2] = "lowerFrequency";
            objArr[3] = dValueOf;
            objArr[4] = "upperFrequency";
            objArr[5] = dValueOf2;
            objArr[6] = "centerFrequency";
            objArr[7] = dValueOf3;
            objArr[8] = "gain";
            objArr[9] = dValueOf4;
            arrayList.add(U(objArr));
            s11 = (short) (s11 + s12);
            s10 = s12;
        }
        short s13 = s10;
        Double dValueOf5 = Double.valueOf(equalizer.getBandLevelRange()[0] / 100.0d);
        Double dValueOf6 = Double.valueOf(equalizer.getBandLevelRange()[s13] / 100.0d);
        Object[] objArr2 = new Object[6];
        objArr2[0] = "minDecibels";
        objArr2[s13] = dValueOf5;
        objArr2[2] = "maxDecibels";
        objArr2[3] = dValueOf6;
        objArr2[4] = "bands";
        objArr2[5] = arrayList;
        HashMap mapU = U(objArr2);
        Object[] objArr3 = new Object[2];
        objArr3[0] = "parameters";
        objArr3[s13] = mapU;
        return U(objArr3);
    }

    public final void L(double d3, int i5) throws IllegalStateException, UnsupportedOperationException, IllegalArgumentException {
        ((Equalizer) this.f34623u.get("AndroidEqualizer")).setBandLevel((short) i5, (short) Math.round(d3 * 100.0d));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    public final AbstractC3144a M(Object obj) {
        Map map;
        String str;
        AbstractC3144a c3162t;
        int iIntValue;
        Map map2;
        boolean zBooleanValue = true;
        Map map3 = (Map) obj;
        String str2 = (String) map3.get("id");
        HashMap map4 = this.k;
        AbstractC3144a abstractC3144a = (AbstractC3144a) map4.get(str2);
        if (abstractC3144a != null) {
            return abstractC3144a;
        }
        map = map3;
        str = (String) map.get("id");
        String str3 = (String) map.get("type");
        str3.getClass();
        switch (str3) {
            case "concatenating":
                boolean zBooleanValue2 = ((Boolean) map.get("useLazyPreparation")).booleanValue();
                g0 g0VarG = G((List) T(map, "shuffleOrder"));
                ArrayList arrayListN = N(map.get("children"));
                AbstractC3144a[] abstractC3144aArr = new AbstractC3144a[arrayListN.size()];
                arrayListN.toArray(abstractC3144aArr);
                c3162t = new C3162t(zBooleanValue2, g0VarG, abstractC3144aArr);
                break;
            case "hls":
                final S3.c cVarY = y((Map) T(map, "headers"));
                ?? r02 = new k2.G(cVarY) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory

                    /* renamed from: a, reason: collision with root package name */
                    public final C1323c f18721a;

                    /* renamed from: b, reason: collision with root package name */
                    public C1324d f18722b;

                    /* renamed from: c, reason: collision with root package name */
                    public C4398a f18723c;

                    /* renamed from: h, reason: collision with root package name */
                    public final d f18728h = new d();

                    /* renamed from: e, reason: collision with root package name */
                    public final X f18725e = new X(1);

                    /* renamed from: f, reason: collision with root package name */
                    public final c f18726f = b2.c.f19157o;

                    /* renamed from: i, reason: collision with root package name */
                    public final ae.d f18729i = new ae.d(10);

                    /* renamed from: g, reason: collision with root package name */
                    public final C1342b f18727g = new C1342b();
                    public final int k = 1;

                    /* renamed from: l, reason: collision with root package name */
                    public final long f18731l = -9223372036854775807L;

                    /* renamed from: j, reason: collision with root package name */
                    public final boolean f18730j = true;

                    /* renamed from: d, reason: collision with root package name */
                    public boolean f18724d = true;

                    {
                        this.f18721a = new C1323c(cVarY, 0);
                    }

                    @Override // k2.G
                    public final k2.G a(C4398a c4398a) {
                        this.f18723c = c4398a;
                        return this;
                    }

                    @Override // k2.G
                    public final k2.G b(boolean z2) {
                        this.f18724d = z2;
                        return this;
                    }

                    @Override // k2.G
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final n c(C0773w c0773w) {
                        c0773w.f8272b.getClass();
                        if (this.f18722b == null) {
                            C1324d c1324d = new C1324d();
                            c1324d.f17158a = new C4398a(24);
                            this.f18722b = c1324d;
                        }
                        C4398a c4398a = this.f18723c;
                        if (c4398a != null) {
                            this.f18722b.f17158a = c4398a;
                        }
                        C1324d c1324d2 = this.f18722b;
                        c1324d2.f17159b = this.f18724d;
                        p jVar = this.f18725e;
                        List list = c0773w.f8272b.f8266c;
                        if (!list.isEmpty()) {
                            jVar = new j(6, jVar, list);
                        }
                        Z1.g gVarB = this.f18728h.b(c0773w);
                        ae.d dVar = this.f18729i;
                        this.f18726f.getClass();
                        C1323c c1323c = this.f18721a;
                        return new n(c0773w, c1323c, c1324d2, this.f18727g, gVarB, dVar, new b2.c(c1323c, dVar, jVar), this.f18731l, this.f18730j, this.k);
                    }
                };
                J5.n nVar = new J5.n(3);
                C3407I c3407i = AbstractC3409K.f40056b;
                e0 e0Var = e0.f40101e;
                List list = Collections.EMPTY_LIST;
                e0 e0Var2 = e0.f40101e;
                Y y10 = new Y();
                C0771u c0771u = C0771u.f8270a;
                Uri uri = Uri.parse((String) map.get("uri"));
                c3162t = r02.c(new C0773w("", new N1.r(nVar), uri != null ? new C0770t(uri, "application/x-mpegURL", null, list, e0Var2, null, -9223372036854775807L) : null, new C0769s(y10), z.f8304B, c0771u));
                break;
            case "dash":
                final S3.c cVarY2 = y((Map) T(map, "headers"));
                ?? r03 = new k2.G(cVarY2) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory

                    /* renamed from: a, reason: collision with root package name */
                    public final E4.n f18714a;

                    /* renamed from: b, reason: collision with root package name */
                    public final S1.g f18715b;

                    /* renamed from: c, reason: collision with root package name */
                    public final d f18716c;

                    /* renamed from: d, reason: collision with root package name */
                    public final C1342b f18717d;

                    /* renamed from: e, reason: collision with root package name */
                    public final ae.d f18718e;

                    /* renamed from: f, reason: collision with root package name */
                    public final long f18719f;

                    /* renamed from: g, reason: collision with root package name */
                    public final long f18720g;

                    {
                        E4.n nVar2 = new E4.n(cVarY2);
                        this.f18714a = nVar2;
                        this.f18715b = cVarY2;
                        this.f18716c = new d();
                        this.f18718e = new ae.d(10);
                        this.f18719f = 30000L;
                        this.f18720g = 5000000L;
                        this.f18717d = new C1342b();
                        ((E4.F) nVar2.f2940d).f2853b = true;
                    }

                    @Override // k2.G
                    public final k2.G a(C4398a c4398a) {
                        E4.F f10 = (E4.F) this.f18714a.f2940d;
                        f10.getClass();
                        f10.f2854c = c4398a;
                        return this;
                    }

                    @Override // k2.G
                    public final k2.G b(boolean z2) {
                        ((E4.F) this.f18714a.f2940d).f2853b = z2;
                        return this;
                    }

                    @Override // k2.G
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final f c(C0773w c0773w) {
                        c0773w.f8272b.getClass();
                        e eVar = new e();
                        List list2 = c0773w.f8272b.f8266c;
                        return new f(c0773w, this.f18715b, !list2.isEmpty() ? new Y2.B(13, eVar, list2) : eVar, this.f18714a, this.f18717d, this.f18716c.b(c0773w), this.f18718e, this.f18719f, this.f18720g);
                    }
                };
                J5.n nVar2 = new J5.n(3);
                C3407I c3407i2 = AbstractC3409K.f40056b;
                e0 e0Var3 = e0.f40101e;
                List list2 = Collections.EMPTY_LIST;
                e0 e0Var4 = e0.f40101e;
                Y y11 = new Y();
                C0771u c0771u2 = C0771u.f8270a;
                Uri uri2 = Uri.parse((String) map.get("uri"));
                c3162t = r03.c(new C0773w("", new N1.r(nVar2), uri2 != null ? new C0770t(uri2, "application/dash+xml", null, list2, e0Var4, str, -9223372036854775807L) : null, new C0769s(y11), z.f8304B, c0771u2));
                break;
            case "looping":
                Integer num = (Integer) map.get("count");
                AbstractC3144a abstractC3144aM = M(map.get("child"));
                int iIntValue2 = num.intValue();
                AbstractC3144a[] abstractC3144aArr2 = new AbstractC3144a[iIntValue2];
                for (int i5 = 0; i5 < iIntValue2; i5++) {
                    abstractC3144aArr2[i5] = abstractC3144aM;
                }
                c3162t = new C3162t(false, new g0(), abstractC3144aArr2);
                break;
            case "clipping":
                Long lQ = Q(map.get("start"));
                Long lQ2 = Q(map.get("end"));
                c3162t = new C3151h(M(map.get("child")), lQ != null ? lQ.longValue() : 0L, lQ2 != null ? lQ2.longValue() : Long.MIN_VALUE, true);
                break;
            case "progressive":
                S3.c cVarY3 = y((Map) T(map, "headers"));
                Map map5 = (Map) T(map, "options");
                s2.k kVar = new s2.k();
                if (map5 == null || (map2 = (Map) map5.get("androidExtractorOptions")) == null) {
                    iIntValue = 0;
                } else {
                    zBooleanValue = ((Boolean) map2.get("constantBitrateSeekingEnabled")).booleanValue();
                    zBooleanValue = ((Boolean) map2.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
                    iIntValue = ((Integer) map2.get("mp3Flags")).intValue();
                }
                synchronized (kVar) {
                    kVar.f44905a = zBooleanValue;
                }
                kVar.c(zBooleanValue);
                kVar.d(iIntValue);
                com.unity3d.services.core.webview.b bVar = new com.unity3d.services.core.webview.b(kVar, 11);
                Mf.d dVar = new Mf.d();
                ae.d dVar2 = new ae.d(10);
                J5.n nVar3 = new J5.n(3);
                C3407I c3407i3 = AbstractC3409K.f40056b;
                e0 e0Var5 = e0.f40101e;
                List list3 = Collections.EMPTY_LIST;
                e0 e0Var6 = e0.f40101e;
                Y y12 = new Y();
                C0771u c0771u3 = C0771u.f8270a;
                Uri uri3 = Uri.parse((String) map.get("uri"));
                C0770t c0770t = uri3 != null ? new C0770t(uri3, null, null, list3, e0Var6, str, -9223372036854775807L) : null;
                C0773w c0773w = new C0773w("", new N1.r(nVar3), c0770t, new C0769s(y12), z.f8304B, c0771u3);
                c0770t.getClass();
                c3162t = new k2.Z(c0773w, cVarY3, bVar, dVar.b(c0773w), dVar2, 1048576, false);
                break;
            case "silence":
                long jLongValue = Q(map.get("duration")).longValue();
                k.g(jLongValue > 0);
                C0767p c0767pA = j0.k.a();
                c0767pA.f8254h = str;
                c3162t = new j0(jLongValue, c0767pA.a());
                break;
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
        }
        map4.put(str2, c3162t);
        return c3162t;
    }

    public final ArrayList N(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            arrayList.add(M(list.get(i5)));
        }
        return arrayList;
    }

    public final long O() {
        int i5 = this.f34603E;
        if (i5 != 1 && i5 != 2) {
            Long l10 = this.f34610g;
            return (l10 == null || l10.longValue() == -9223372036854775807L) ? this.f34626x.m0() : this.f34610g.longValue();
        }
        long jM0 = this.f34626x.m0();
        if (jM0 < 0) {
            return 0L;
        }
        return jM0;
    }

    public final long P() {
        C0850u c0850u;
        int i5 = this.f34603E;
        if (i5 == 1 || i5 == 2 || (c0850u = this.f34626x) == null) {
            return -9223372036854775807L;
        }
        return c0850u.q0();
    }

    public final void R(List list, g0 g0Var, long j8, Integer num, g gVar) {
        this.f34600B = Integer.valueOf(num != null ? num.intValue() : 0);
        int iF = AbstractC0213f.f(this.f34603E);
        if (iF != 0) {
            if (iF != 1) {
                C0850u c0850u = this.f34626x;
                c0850u.S0();
                c0850u.f12174y.d(1, c0850u.s0());
                c0850u.N0(null);
                e0 e0Var = e0.f40101e;
                long j10 = c0850u.f12152d0.f11994s;
                new P1.c(e0Var);
            } else {
                Y(10000000, "Connection aborted", null, false);
                C0850u c0850u2 = this.f34626x;
                c0850u2.S0();
                c0850u2.f12174y.d(1, c0850u2.s0());
                c0850u2.N0(null);
                e0 e0Var2 = e0.f40101e;
                long j11 = c0850u2.f12152d0.f11994s;
                new P1.c(e0Var2);
            }
        }
        this.f34611h = gVar;
        h0();
        this.f34603E = 2;
        this.f34628z = null;
        this.f34599A = null;
        I();
        int iIntValue = num != null ? num.intValue() : 0;
        C0850u c0850u3 = this.f34626x;
        c0850u3.S0();
        c0850u3.F0(list, false, j8, iIntValue);
        this.f34626x.J0(g0Var);
        this.f34626x.z0();
    }

    public final void S(double d3) throws IllegalStateException, UnsupportedOperationException, IllegalArgumentException {
        ((LoudnessEnhancer) this.f34623u.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d3 * 100.0d));
    }

    public final void V() {
        if (this.f34626x.s0()) {
            this.f34626x.G0(false);
            h0();
            I();
            g gVar = this.f34612i;
            if (gVar != null) {
                gVar.a(new HashMap());
                this.f34612i = null;
            }
        }
    }

    public final void W(g gVar) {
        g gVar2;
        if (this.f34626x.s0()) {
            gVar.a(new HashMap());
            return;
        }
        g gVar3 = this.f34612i;
        if (gVar3 != null) {
            gVar3.a(new HashMap());
        }
        this.f34612i = gVar;
        this.f34626x.G0(true);
        h0();
        if (this.f34603E != 5 || (gVar2 = this.f34612i) == null) {
            return;
        }
        gVar2.a(new HashMap());
        this.f34612i = null;
    }

    public final void X(long j8, Integer num, g gVar) {
        int i5 = this.f34603E;
        if (i5 == 1 || i5 == 2) {
            gVar.a(new HashMap());
            return;
        }
        g gVar2 = this.f34613j;
        if (gVar2 != null) {
            try {
                gVar2.a(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f34613j = null;
            this.f34610g = null;
        }
        this.f34610g = Long.valueOf(j8);
        this.f34613j = gVar;
        try {
            this.f34626x.O(j8, num != null ? num.intValue() : this.f34626x.l0(), false);
        } catch (RuntimeException e7) {
            this.f34613j = null;
            this.f34610g = null;
            throw e7;
        }
    }

    public final void Y(int i5, String str, HashMap map, boolean z2) {
        d dVar = this.f34605b;
        String strValueOf = String.valueOf(i5);
        C4271h c4271h = dVar.f34629a;
        if (c4271h != null) {
            c4271h.c(strValueOf, str, map);
        }
        this.f34628z = Integer.valueOf(i5);
        this.f34599A = str;
        if (z2) {
            this.f34603E = 1;
        }
        r();
        g gVar = this.f34611h;
        if (gVar != null) {
            gVar.b(String.valueOf(i5), str, map);
            this.f34611h = null;
        }
    }

    public final void Z(int i5, int i10, int i11) {
        C0754c c0754c = new C0754c(i5, i10, i11);
        if (this.f34603E == 2) {
            this.f34616n = c0754c;
        } else {
            this.f34626x.E0(c0754c, false);
        }
    }

    @Override // N1.H
    public final /* synthetic */ void a(int i5) {
    }

    public final void a0(int i5) {
        this.f34626x.I0(i5);
    }

    @Override // N1.H
    public final void b(int i5) {
        if (i5 == 2) {
            i0();
            int i10 = this.f34603E;
            if (i10 != 3 && i10 != 2) {
                this.f34603E = 3;
                this.f34628z = null;
                this.f34599A = null;
                r();
            }
            Handler handler = this.f34601C;
            V v2 = this.f34602D;
            handler.removeCallbacks(v2);
            handler.post(v2);
            return;
        }
        if (i5 == 3) {
            if (this.f34626x.s0()) {
                h0();
            }
            this.f34603E = 4;
            this.f34628z = null;
            this.f34599A = null;
            r();
            if (this.f34611h != null) {
                HashMap map = new HashMap();
                map.put("duration", P() == -9223372036854775807L ? null : Long.valueOf(P() * 1000));
                this.f34611h.a(map);
                this.f34611h = null;
                C0754c c0754c = this.f34616n;
                if (c0754c != null) {
                    this.f34626x.E0(c0754c, false);
                    this.f34616n = null;
                }
            }
            g gVar = this.f34613j;
            if (gVar != null) {
                this.f34610g = null;
                gVar.a(new HashMap());
                this.f34613j = null;
                return;
            }
            return;
        }
        if (i5 != 4) {
            return;
        }
        if (this.f34603E != 5) {
            h0();
            this.f34603E = 5;
            this.f34628z = null;
            this.f34599A = null;
            r();
        }
        if (this.f34611h != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", P() == -9223372036854775807L ? null : Long.valueOf(P() * 1000));
            this.f34611h.a(map2);
            this.f34611h = null;
            C0754c c0754c2 = this.f34616n;
            if (c0754c2 != null) {
                this.f34626x.E0(c0754c2, false);
                this.f34616n = null;
            }
        }
        g gVar2 = this.f34612i;
        if (gVar2 != null) {
            gVar2.a(new HashMap());
            this.f34612i = null;
        }
    }

    public final void b0(float f10) {
        C0850u c0850u = this.f34626x;
        c0850u.S0();
        F f11 = c0850u.f12152d0.f11990o;
        if (f11.f8033b == f10) {
            return;
        }
        this.f34626x.H0(new F(f11.f8032a, f10));
        I();
    }

    @Override // N1.H
    public final /* synthetic */ void c(boolean z2) {
    }

    public final void c0(boolean z2) {
        C0850u c0850u = this.f34626x;
        c0850u.S0();
        if (c0850u.f12124D != z2) {
            c0850u.f12124D = z2;
            Q1.s sVar = c0850u.k.f12218i;
            sVar.getClass();
            Q1.r rVarB = Q1.s.b();
            rVarB.f9709a = sVar.f9711a.obtainMessage(12, z2 ? 1 : 0, 0);
            rVarB.b();
            C0474y c0474y = new C0474y(z2, 3);
            Q1.j jVar = c0850u.f12161l;
            jVar.c(9, c0474y);
            c0850u.O0();
            jVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:7:0x0020, B:9:0x002b, B:11:0x002f, B:13:0x003e, B:16:0x0048, B:27:0x0077, B:35:0x009f, B:36:0x00a3, B:38:0x00ae, B:39:0x00b6, B:30:0x0088, B:33:0x0094, B:19:0x005b, B:22:0x0067, B:40:0x00ba, B:42:0x00cf), top: B:47:0x0020 }] */
    @Override // N1.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r8) {
        /*
            r7 = this;
            U1.u r8 = r7.f34626x
            int r8 = r8.l0()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = r7.f34600B
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L17
            r7.f34600B = r8
            r7.r()
        L17:
            U1.u r8 = r7.f34626x
            int r8 = r8.t0()
            r0 = 4
            if (r8 != r0) goto Ldc
            U1.u r8 = r7.f34626x     // Catch: java.lang.Exception -> L45
            boolean r8 = r8.s0()     // Catch: java.lang.Exception -> L45
            r0 = 0
            r1 = 0
            if (r8 == 0) goto Lba
            int r8 = r7.f34624v     // Catch: java.lang.Exception -> L45
            if (r8 != 0) goto L48
            U1.u r8 = r7.f34626x     // Catch: java.lang.Exception -> L45
            r8.getClass()     // Catch: java.lang.Exception -> L45
            N1.N r8 = r8.o0()     // Catch: java.lang.Exception -> L45
            int r8 = r8.o()     // Catch: java.lang.Exception -> L45
            if (r8 <= 0) goto L48
            U1.u r8 = r7.f34626x     // Catch: java.lang.Exception -> L45
            r8.O(r1, r0, r0)     // Catch: java.lang.Exception -> L45
            goto Ldc
        L45:
            r8 = move-exception
            goto Ld9
        L48:
            U1.u r8 = r7.f34626x     // Catch: java.lang.Exception -> L45
            r8.getClass()     // Catch: java.lang.Exception -> L45
            N1.N r1 = r8.o0()     // Catch: java.lang.Exception -> L45
            boolean r2 = r1.p()     // Catch: java.lang.Exception -> L45
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L5b
            r8 = r3
            goto L70
        L5b:
            int r2 = r8.l0()     // Catch: java.lang.Exception -> L45
            r8.S0()     // Catch: java.lang.Exception -> L45
            int r5 = r8.f12123C     // Catch: java.lang.Exception -> L45
            if (r5 != r4) goto L67
            r5 = r0
        L67:
            r8.S0()     // Catch: java.lang.Exception -> L45
            boolean r8 = r8.f12124D     // Catch: java.lang.Exception -> L45
            int r8 = r1.e(r2, r5, r8)     // Catch: java.lang.Exception -> L45
        L70:
            if (r8 == r3) goto L74
            r8 = r4
            goto L75
        L74:
            r8 = r0
        L75:
            if (r8 == 0) goto Ldc
            U1.u r8 = r7.f34626x     // Catch: java.lang.Exception -> L45
            r8.getClass()     // Catch: java.lang.Exception -> L45
            N1.N r1 = r8.o0()     // Catch: java.lang.Exception -> L45
            boolean r2 = r1.p()     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto L88
            r1 = r3
            goto L9d
        L88:
            int r2 = r8.l0()     // Catch: java.lang.Exception -> L45
            r8.S0()     // Catch: java.lang.Exception -> L45
            int r5 = r8.f12123C     // Catch: java.lang.Exception -> L45
            if (r5 != r4) goto L94
            r5 = r0
        L94:
            r8.S0()     // Catch: java.lang.Exception -> L45
            boolean r6 = r8.f12124D     // Catch: java.lang.Exception -> L45
            int r1 = r1.e(r2, r5, r6)     // Catch: java.lang.Exception -> L45
        L9d:
            if (r1 != r3) goto La3
            r8.S0()     // Catch: java.lang.Exception -> L45
            goto Ldc
        La3:
            int r2 = r8.l0()     // Catch: java.lang.Exception -> L45
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != r2) goto Lb6
            int r0 = r8.l0()     // Catch: java.lang.Exception -> L45
            r8.O(r5, r0, r4)     // Catch: java.lang.Exception -> L45
            goto Ldc
        Lb6:
            r8.O(r5, r1, r0)     // Catch: java.lang.Exception -> L45
            goto Ldc
        Lba:
            U1.u r8 = r7.f34626x     // Catch: java.lang.Exception -> L45
            int r8 = r8.l0()     // Catch: java.lang.Exception -> L45
            U1.u r3 = r7.f34626x     // Catch: java.lang.Exception -> L45
            r3.getClass()     // Catch: java.lang.Exception -> L45
            N1.N r3 = r3.o0()     // Catch: java.lang.Exception -> L45
            int r3 = r3.o()     // Catch: java.lang.Exception -> L45
            if (r8 >= r3) goto Ldc
            U1.u r8 = r7.f34626x     // Catch: java.lang.Exception -> L45
            int r3 = r8.l0()     // Catch: java.lang.Exception -> L45
            r8.O(r1, r3, r0)     // Catch: java.lang.Exception -> L45
            goto Ldc
        Ld9:
            r8.printStackTrace()
        Ldc:
            U1.u r8 = r7.f34626x
            r8.getClass()
            N1.N r8 = r8.o0()
            int r8 = r8.o()
            r7.f34624v = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.d(int):void");
    }

    public final void d0(Object obj) {
        Map map = (Map) obj;
        AbstractC3144a abstractC3144a = (AbstractC3144a) this.k.get((String) T(map, "id"));
        if (abstractC3144a == null) {
            return;
        }
        String str = (String) T(map, "type");
        str.getClass();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                d0(T(map, "child"));
            }
        } else {
            ((C3162t) abstractC3144a).M(G((List) T(map, "shuffleOrder")));
            Iterator it = ((List) T(map, "children")).iterator();
            while (it.hasNext()) {
                d0(it.next());
            }
        }
    }

    @Override // N1.H
    public final /* synthetic */ void e(boolean z2) {
    }

    public final void e0(boolean z2) {
        C0850u c0850u = this.f34626x;
        c0850u.S0();
        if (c0850u.f12142W == z2) {
            return;
        }
        c0850u.f12142W = z2;
        c0850u.D0(1, 9, Boolean.valueOf(z2));
        c0850u.f12161l.e(23, new C0474y(z2, 2));
    }

    @Override // N1.H
    public final /* synthetic */ void f(List list) {
    }

    public final void f0(float f10) {
        C0850u c0850u = this.f34626x;
        c0850u.S0();
        F f11 = c0850u.f12152d0.f11990o;
        if (f11.f8032a == f10) {
            return;
        }
        this.f34626x.H0(new F(f10, f11.f8033b));
        if (this.f34626x.s0()) {
            h0();
        }
        I();
    }

    @Override // N1.H
    public final /* synthetic */ void g(int i5, int i10) {
    }

    public final void g0(float f10) {
        this.f34626x.M0(f10);
    }

    @Override // N1.H
    public final /* synthetic */ void h(boolean z2) {
    }

    public final void h0() {
        this.f34607d = O();
        this.f34608e = System.currentTimeMillis();
    }

    @Override // N1.H
    public final /* synthetic */ void i(int i5, boolean z2) {
    }

    public final boolean i0() {
        C0850u c0850u = this.f34626x;
        if (c0850u == null) {
            return false;
        }
        if (!(c0850u.s0() && this.f34603E == 4) && O() == this.f34607d) {
            return false;
        }
        this.f34607d = O();
        this.f34608e = System.currentTimeMillis();
        return true;
    }

    @Override // N1.H
    public final /* synthetic */ void j(float f10) {
    }

    @Override // N1.H
    public final /* synthetic */ void k(int i5) {
    }

    @Override // N1.H
    public final /* synthetic */ void l(int i5, boolean z2) {
    }

    @Override // N1.H
    public final /* synthetic */ void m(boolean z2) {
    }

    @Override // N1.H
    public final /* synthetic */ void n(C3586i c3586i) {
    }

    @Override // N1.H
    public final void o(B b5) {
        int i5 = 0;
        while (true) {
            A[] aArr = b5.f8023a;
            if (i5 >= aArr.length) {
                return;
            }
            A a5 = aArr[i5];
            if (a5 instanceof F2.c) {
                this.f34614l = (F2.c) a5;
                r();
            }
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(uc.C4278o r19, uc.InterfaceC4280q r20) throws java.lang.IllegalStateException, java.lang.UnsupportedOperationException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.onMethodCall(uc.o, uc.q):void");
    }

    @Override // N1.H
    public final /* synthetic */ void p(N1.Y y10) {
    }

    public final void q(String str, boolean z2) throws IllegalStateException {
        ((AudioEffect) this.f34623u.get(str)).setEnabled(z2);
    }

    public final void r() {
        I();
        s();
    }

    public final void s() {
        HashMap map = this.f34625w;
        if (map != null) {
            this.f34605b.a(map);
            this.f34625w = null;
        }
    }

    @Override // N1.H
    public final void t(I i5, I i10, int i11) {
        h0();
        if (i11 == 0 || i11 == 1) {
            Integer numValueOf = Integer.valueOf(this.f34626x.l0());
            if (!numValueOf.equals(this.f34600B)) {
                this.f34600B = numValueOf;
            }
        }
        r();
    }

    @Override // N1.H
    public final /* synthetic */ void u(P1.c cVar) {
    }

    @Override // N1.H
    public final /* synthetic */ void v(C0754c c0754c) {
    }

    @Override // N1.H
    public final /* synthetic */ void w(z zVar) {
    }

    @Override // N1.H
    public final /* synthetic */ void x(E e7) {
    }

    public final S3.c y(Map map) {
        HashMap map2;
        String str;
        String strC = null;
        if (map == null) {
            map2 = null;
        } else {
            map2 = new HashMap();
            for (Object obj : map.keySet()) {
                map2.put((String) obj, (String) map.get(obj));
            }
        }
        if (map2 != null && (strC = (String) map2.remove("User-Agent")) == null) {
            strC = (String) map2.remove("user-agent");
        }
        Context context = this.f34604a;
        if (strC == null) {
            int i5 = x.f9724a;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "?";
            }
            strC = wg.b.c(com.google.android.gms.internal.consent_sdk.a.w("just_audio/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") AndroidXMedia3/1.5.1");
        }
        N2.e eVar = new N2.e(1);
        eVar.f8354f = strC;
        eVar.f8352d = true;
        if (map2 != null && map2.size() > 0) {
            eVar.e(map2);
        }
        return new S3.c(context, eVar);
    }

    @Override // N1.H
    public final /* synthetic */ void z(C0773w c0773w, int i5) {
    }
}
