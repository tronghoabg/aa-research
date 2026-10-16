package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioMixingRule;
import android.media.audiopolicy.AudioPolicy;
import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class rhj {
    public final Object a;
    public final Object b;
    public final Object c;

    private rhj(Context context, byte[] bArr) {
        this.a = wub.L(new joa(19));
        this.c = new AtomicLong(-1L);
        this.b = wub.L(new plm(context, new sou("auth:gau"), 4));
    }

    public static AudioMix c(int i, int i2, int i3) throws IllegalArgumentException {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        try {
            builder = (AudioAttributes.Builder) builder.getClass().getMethod("addTag", String.class).invoke(builder, "fixedVolume");
        } catch (ReflectiveOperationException unused) {
        }
        builder.getClass();
        builder.setUsage(i);
        AudioAttributes audioAttributesBuild = builder.build();
        AudioFormat.Builder builder2 = new AudioFormat.Builder();
        builder2.setEncoding(2);
        builder2.setSampleRate(i3);
        builder2.setChannelMask(i2);
        return new AudioMix.Builder(new AudioMixingRule.Builder().addRule(audioAttributesBuild, 1).build()).setFormat(builder2.build()).setRouteFlags(2).build();
    }

    public static rhj l(Context context) {
        wae.c(context);
        return new rhj(context, (byte[]) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rhj n(byte[] bArr, boolean z) throws abon {
        abaq abaqVar;
        abfe abfeVar;
        vaq.d();
        abfj abfjVar = new abfj(abnj.a());
        try {
            abfjVar.i(bArr, bArr.length);
            vaq.d();
            ukj ukjVar = new ukj(abfjVar);
            vaq.d();
            abfm abfmVar = abfjVar.b;
            if (abfmVar.e(0)) {
                abaq abaqVar2 = abaq.a;
                abaqVar = (abaq) abnv.L(abaq.class).k(abfjVar.s, abfmVar.b(0), abfmVar.a(0), abfjVar.a);
            } else {
                abaqVar = abaq.a;
            }
            if (abaqVar.b.size() != abaqVar.c.size()) {
                ((ynz) ((ynz) uio.a.h()).ai(9373)).B("Mismatched parallel array lengths; had %d style_ids and %d attributes_index.", abaqVar.b.size(), abaqVar.c.size());
            }
            int iMin = Math.min(abaqVar.b.size(), abaqVar.c.size());
            aehy aehyVar = new aehy(iMin);
            for (int i = 0; i < iMin; i++) {
                int iE = abaqVar.b.e(i);
                int iE2 = abaqVar.c.e(i);
                if (iE2 < 0 || iE2 >= abaqVar.d.size()) {
                    ((ynz) ((ynz) uio.a.h()).ai(9372)).R("Invalid attribute mapping. InternalStyle id=%d had attribute index=%d; there are %d attribute entries.", Integer.valueOf(iE), Integer.valueOf(iE2), Integer.valueOf(abaqVar.d.size()));
                } else {
                    aehyVar.a(iE, ((abap) abaqVar.d.get(iE2)).b);
                }
            }
            vaq.d();
            abfm abfmVar2 = abfjVar.b;
            if (abfmVar2.e(1)) {
                abfe abfeVar2 = abfe.a;
                abfeVar = (abfe) abnv.L(abfe.class).k(abfjVar.s, abfmVar2.b(1), abfmVar2.a(1), abfjVar.a);
            } else {
                abfeVar = abfe.a;
            }
            rjg rjgVar = new rjg(abfeVar);
            return z ? new rhj(ukjVar, rjgVar, abms.v(bArr)) : new rhj(ukjVar, rjgVar, (abms) null);
        } catch (IndexOutOfBoundsException e) {
            throw new abon(a.bX(e, "Error during lazy parsing "));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rhr] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rho] */
    public final void a() {
        try {
            ?? r0 = this.c;
            ((rhq) r0).a = null;
            this.b.h(r0);
        } catch (RemoteException unused) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final int b() {
        AudioManager audioManager = (AudioManager) ((Context) this.b).getSystemService("audio");
        audioManager.getClass();
        return audioManager.registerAudioPolicy((AudioPolicy) this.c);
    }

    public final rge d(int i) {
        if (i >= 0) {
            yfq yfqVar = (yfq) this.a;
            if (i < yfqVar.size()) {
                return rge.e(((AudioPolicy) this.c).createAudioRecordSink((AudioMix) yfqVar.get(i)));
            }
        }
        throw new IllegalArgumentException(a.bp(i, "AudioPolicy not configured with token "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rge e(int i, yfq yfqVar) {
        AudioMixingRule.Builder builder = new AudioMixingRule.Builder();
        int size = yfqVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = (Integer) yfqVar.get(i2);
            num.getClass();
            builder.addRule(new AudioAttributes.Builder().setUsage(num.intValue()).build(), 1);
        }
        AudioMixingRule audioMixingRuleBuild = builder.build();
        AudioMix audioMixBuild = new AudioMix.Builder(audioMixingRuleBuild).setFormat(new AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i).build()).setRouteFlags(2).build();
        AudioPolicy audioPolicy = (AudioPolicy) this.c;
        audioPolicy.attachMixes(yfq.q(audioMixBuild));
        return rge.e(audioPolicy.createAudioRecordSink(audioMixBuild));
    }

    public final void f() {
        AudioManager audioManager = (AudioManager) ((Context) this.b).getSystemService("audio");
        audioManager.getClass();
        audioManager.unregisterAudioPolicyAsync((AudioPolicy) this.c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final int g(int i, int i2, int i3) throws IllegalArgumentException {
        AudioMix audioMixC = c(i, i2, i3);
        if (audioMixC == null) {
            return -1;
        }
        ((AudioPolicy.Builder) this.b).addMix(audioMixC);
        this.c.add(audioMixC);
        return r0.size() - 1;
    }

    public final void h(rfx rfxVar) {
        ((AudioPolicy.Builder) this.b).setAudioPolicyFocusListener(new rgc(rfxVar));
    }

    public final void i(Looper looper) {
        ((AudioPolicy.Builder) this.b).setLooper(looper);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r4 > 1800000) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, xyc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j(int r19, int r20, long r21, long r23, long r25) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            java.lang.Object r0 = r1.a     // Catch: java.lang.Throwable -> L85
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r0.gu()     // Catch: java.lang.Throwable -> L85
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Throwable -> L85
            double r4 = r0.doubleValue()     // Catch: java.lang.Throwable -> L85
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            float r0 = r0.nextFloat()     // Catch: java.lang.Throwable -> L85
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L85
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L22
            goto L83
        L22:
            java.lang.Object r0 = r1.c     // Catch: java.lang.Throwable -> L85
            r4 = r0
            java.util.concurrent.atomic.AtomicLong r4 = (java.util.concurrent.atomic.AtomicLong) r4     // Catch: java.lang.Throwable -> L85
            long r4 = r4.get()     // Catch: java.lang.Throwable -> L85
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L32
            goto L43
        L32:
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch: java.lang.Throwable -> L85
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L85
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L85
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L83
        L43:
            java.lang.Object r0 = r1.b     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r0.gu()     // Catch: java.lang.Throwable -> L85
            spg r0 = (defpackage.spg) r0     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L85
            r5 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.common.internal.MethodInvocation r6 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L85
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L85
            long r7 = r7 - r25
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L85
            r9 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r8 = r20
            r10 = r21
            r12 = r23
            r17 = r7
            r7 = r19
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L85
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L85
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L85
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L85
            svz r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L85
            qod r4 = new qod     // Catch: java.lang.Throwable -> L85
            r4.<init>(r1, r2, r7)     // Catch: java.lang.Throwable -> L85
            r0.j(r4)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r18)
            return
        L83:
            monitor-exit(r18)
            return
        L85:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L85
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhj.j(int, int, long, long, long):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final rhj k() {
        return new rhj(((AudioPolicy.Builder) this.b).build(), yfq.o(this.c), (Context) this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tmb] */
    public final void m(zcf zcfVar) {
        ?? r0 = this.b;
        synchronized (r0) {
            long jA = this.c.a();
            boolean z = true;
            if (r0.get(zcfVar) != null && jA - ((Long) r0.get(zcfVar)).longValue() < 500) {
                z = false;
            }
            r0.put(zcfVar, Long.valueOf(jA));
            if (z) {
                ((psj) this.a).c(new tua());
            }
        }
    }

    private rhj(ukj ukjVar, rjg rjgVar, abms abmsVar) {
        this.a = ukjVar;
        this.c = rjgVar;
        this.b = abmsVar;
    }

    public rhj() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        DesugarCollections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        DesugarCollections.unmodifiableList(arrayList2);
        this.b = new EnumMap(uld.class);
    }

    public rhj(AudioPolicy audioPolicy, yfq yfqVar, Context context) {
        this.c = audioPolicy;
        this.a = yfqVar;
        this.b = context;
    }

    public rhj(rho rhoVar) {
        this.a = new rox(new rcn(5));
        this.b = rhoVar;
        this.c = new rhq();
    }

    public rhj(tmb tmbVar, psj psjVar) {
        this.c = tmbVar;
        this.a = psjVar;
        this.b = new HashMap();
    }

    public rhj(Context context) {
        this.c = new ArrayList();
        this.b = new AudioPolicy.Builder(context);
        this.a = context;
    }

    public rhj(Executor executor, aaau aaauVar) {
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.b = executor;
        this.a = aaauVar;
    }
}
