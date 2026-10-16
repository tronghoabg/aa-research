package com.google.firebase.sessions.b;

import android.content.Context;
import androidx.camera.video.AudioStats;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.google.firebase.sessions.aj;
import com.google.firebase.sessions.v;
import com.google.firebase.sessions.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10898a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.i.c f10899b;

    /* renamed from: c, reason: collision with root package name */
    private final p f10900c;

    /* renamed from: d, reason: collision with root package name */
    private final p f10901d;

    static {
        int i2 = i.f10894b;
        int i3 = v.f10996a;
        f10899b = PreferenceDataStoreDelegateKt.preferencesDataStore$default(v.b(), new ReplaceFileCorruptionHandler(new x(2)), null, null, 12, null);
    }

    public k(com.google.firebase.e eVar, h.c.j jVar, h.c.j jVar2, com.google.firebase.installations.d dVar) {
        h.g.b.x.f(eVar, "firebaseApp");
        h.g.b.x.f(jVar, "blockingDispatcher");
        h.g.b.x.f(jVar2, "backgroundDispatcher");
        h.g.b.x.f(dVar, "firebaseInstallationsApi");
        Context contextA = eVar.a();
        h.g.b.x.e(contextA, "getApplicationContext(...)");
        aj ajVar = aj.f10806a;
        com.google.firebase.sessions.b bVarB = aj.b(eVar);
        a aVar = new a(contextA);
        g gVar = new g(bVarB, jVar);
        int i2 = i.f10894b;
        e eVar2 = new e(jVar2, dVar, bVarB, gVar, (DataStore) f10899b.getValue(contextA, i.f10893a[0]));
        h.g.b.x.f(aVar, "localOverrideSettings");
        h.g.b.x.f(eVar2, "remoteSettings");
        this.f10900c = aVar;
        this.f10901d = eVar2;
    }

    private static final boolean e(double d2) {
        return d2 >= AudioStats.AUDIO_AMPLITUDE_NONE && d2 <= 1.0d;
    }

    private static final boolean f(long j2) {
        return h.o.a.E(j2) && h.o.a.B(j2);
    }

    public final double a() {
        Double dB = this.f10900c.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            if (e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dB2 = this.f10901d.b();
        if (dB2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dB2.doubleValue();
        if (e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        h.o.a aVarD = this.f10900c.d();
        if (aVarD != null) {
            long jW = aVarD.w();
            if (f(jW)) {
                return jW;
            }
        }
        h.o.a aVarD2 = this.f10901d.d();
        if (aVarD2 != null) {
            long jW2 = aVarD2.w();
            if (f(jW2)) {
                return jW2;
            }
        }
        h.o.c cVar = h.o.a.f48264a;
        return h.o.c.i(30, h.o.d.f48274e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r5.c(r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.b.j
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.b.j r0 = (com.google.firebase.sessions.b.j) r0
            int r1 = r0.f10897c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10897c = r1
            goto L18
        L13:
            com.google.firebase.sessions.b.j r0 = new com.google.firebase.sessions.b.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10895a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f10897c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            goto L4e
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r6)
            goto L44
        L36:
            e.b.c.b(r6)
            com.google.firebase.sessions.b.p r6 = r5.f10900c
            r0.f10897c = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L44
            goto L51
        L44:
            com.google.firebase.sessions.b.p r5 = r5.f10901d
            r0.f10897c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L51
        L4e:
            h.ab r5 = h.ab.f48028a
            return r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.b.k.c(h.c.e):java.lang.Object");
    }

    public final boolean d() {
        Boolean boolA = this.f10900c.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f10901d.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }
}
