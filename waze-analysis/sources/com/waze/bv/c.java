package com.waze.bv;

import android.content.Context;
import com.waze.sound.SoundNativeManager;
import com.waze.sound.fm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17493a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f17494b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17495c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17496d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17497e;

    /* renamed from: f, reason: collision with root package name */
    private final SoundNativeManager f17498f;

    /* renamed from: g, reason: collision with root package name */
    private final fm f17499g;

    /* renamed from: h, reason: collision with root package name */
    private b f17500h;

    /* renamed from: i, reason: collision with root package name */
    private d f17501i;

    public c(Context context, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.i.e eVar2, long j2, long j3, SoundNativeManager soundNativeManager, fm fmVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(soundNativeManager, "soundNativeManager");
        h.g.b.x.f(fmVar, "soundPlayer");
        this.f17493a = context;
        this.f17494b = eVar;
        this.f17495c = eVar2;
        this.f17496d = j2;
        this.f17497e = j3;
        this.f17498f = soundNativeManager;
        this.f17499g = fmVar;
        this.f17500h = new b(null);
        this.f17501i = new d(false, false, "never", false, false, 0, null);
    }

    public final void a(int i2) {
        Integer numB = this.f17500h.b();
        if (numB != null && numB.intValue() == i2) {
            return;
        }
        this.f17500h = b.c(this.f17500h, Integer.valueOf(i2), null, 2);
    }

    public final void b(d dVar) {
        h.g.b.x.f(dVar, "newConfigs");
        this.f17501i = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r13.f17498f.shouldMute() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r13.f17498f.shouldMute() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r13.f17495c.a("playing alert sound!");
        r13.f17500h = com.waze.bv.b.c(r13.f17500h, null, new com.waze.bv.a(r2, r0), 1);
        com.waze.sharedui.e.e.i(r13.f17499g, com.waze.resources.h.e(r13.f17493a, "speed_limit"), null, false, false, null, 30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r13 = this;
            com.waze.shared_infra.q.e r0 = r13.f17494b
            long r0 = r0.a()
            com.waze.bv.b r2 = r13.f17500h
            java.lang.Integer r2 = r2.b()
            r3 = 0
            if (r2 == 0) goto La8
            int r2 = r2.intValue()
            com.waze.bv.d r4 = r13.f17501i
            boolean r4 = r4.f17505d
            if (r4 != 0) goto L1b
            goto La8
        L1b:
            com.waze.bv.b r4 = r13.f17500h
            com.waze.bv.a r4 = r4.a()
            r5 = 1
            if (r4 != 0) goto L36
            com.waze.shared_infra.i.e r4 = r13.f17495c
            java.lang.String r6 = "no previous alert sound"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.a(r6)
            com.waze.sound.SoundNativeManager r4 = r13.f17498f
            boolean r4 = r4.shouldMute()
            if (r4 != 0) goto La8
            goto L7d
        L36:
            long r6 = r4.b()
            long r6 = r0 - r6
            int r4 = r4.a()
            if (r2 != r4) goto L45
            long r8 = r13.f17496d
            goto L47
        L45:
            long r8 = r13.f17497e
        L47:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L4d
            r4 = r5
            goto L4e
        L4d:
            r4 = r3
        L4e:
            com.waze.shared_infra.i.e r10 = r13.f17495c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "sufficientTimeDelta? "
            r11.<init>(r12)
            r11.append(r4)
            java.lang.String r12 = " -  time(ms) since last beep: "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r6 = ", allowed delta before re-beep: "
            r11.append(r6)
            r11.append(r8)
            java.lang.String r6 = r11.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r10.a(r6)
            if (r4 == 0) goto La8
            com.waze.sound.SoundNativeManager r4 = r13.f17498f
            boolean r4 = r4.shouldMute()
            if (r4 != 0) goto La8
        L7d:
            com.waze.shared_infra.i.e r3 = r13.f17495c
            java.lang.String r4 = "playing alert sound!"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.a(r4)
            com.waze.bv.b r3 = r13.f17500h
            com.waze.bv.a r4 = new com.waze.bv.a
            r4.<init>(r2, r0)
            r0 = 0
            com.waze.bv.b r0 = com.waze.bv.b.c(r3, r0, r4, r5)
            r13.f17500h = r0
            com.waze.sound.fm r6 = r13.f17499g
            android.content.Context r13 = r13.f17493a
            java.lang.String r0 = "speed_limit"
            java.lang.String r7 = com.waze.resources.h.e(r13, r0)
            r11 = 0
            r12 = 30
            r8 = 0
            r9 = 0
            r10 = 0
            com.waze.sharedui.e.e.i(r6, r7, r8, r9, r10, r11, r12)
            return r5
        La8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bv.c.c():boolean");
    }
}
