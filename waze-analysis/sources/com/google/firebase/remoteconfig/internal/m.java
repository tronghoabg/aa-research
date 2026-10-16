package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.o.ag;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10699a;

    /* renamed from: b, reason: collision with root package name */
    static final int[] f10700b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.d f10701c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g.c f10702d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f10703e;

    /* renamed from: f, reason: collision with root package name */
    private final Random f10704f;

    /* renamed from: g, reason: collision with root package name */
    private final f f10705g;

    /* renamed from: h, reason: collision with root package name */
    private final ConfigFetchHttpClient f10706h;

    /* renamed from: i, reason: collision with root package name */
    private final v f10707i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f10708j;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f10699a = 43200L;
        f10700b = new int[]{2, 4, 8, 16, 32, 64, 128, 256};
    }

    public m(com.google.firebase.installations.d dVar, com.google.firebase.g.c cVar, Executor executor, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, v vVar, Map map) {
        this.f10701c = dVar;
        this.f10702d = cVar;
        this.f10703e = executor;
        this.f10704f = random;
        this.f10705g = fVar;
        this.f10706h = configFetchHttpClient;
        this.f10707i = vVar;
        this.f10708j = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010b A[Catch: d -> 0x019e, TryCatch #1 {d -> 0x019e, blocks: (B:11:0x003d, B:21:0x0082, B:26:0x00a0, B:28:0x00a6, B:30:0x00b0, B:31:0x00bb, B:33:0x00c1, B:34:0x00c8, B:35:0x00ce, B:37:0x00d4, B:39:0x00d9, B:46:0x00f5, B:56:0x0144, B:59:0x0156, B:66:0x0168, B:74:0x0181, B:75:0x0190, B:70:0x0174, B:71:0x017b, B:76:0x0191, B:77:0x019d, B:55:0x010b, B:25:0x0093, B:14:0x0053, B:15:0x005f, B:17:0x0065), top: B:83:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.android.gms.o.t f(com.google.firebase.remoteconfig.internal.m r10, com.google.android.gms.o.t r11, com.google.android.gms.o.t r12, java.util.Date r13, java.util.Map r14) throws com.google.firebase.remoteconfig.c, com.google.firebase.remoteconfig.f, com.google.firebase.remoteconfig.e {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.m.f(com.google.firebase.remoteconfig.internal.m, com.google.android.gms.o.t, com.google.android.gms.o.t, java.util.Date, java.util.Map):com.google.android.gms.o.t");
    }

    public static /* synthetic */ void g(m mVar, Date date, com.google.android.gms.o.t tVar) {
        if (tVar.k()) {
            mVar.f10707i.o(date);
            return;
        }
        Exception excF = tVar.f();
        if (excF == null) {
            return;
        }
        if (excF instanceof com.google.firebase.remoteconfig.e) {
            mVar.f10707i.p();
        } else {
            mVar.f10707i.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.o.t h(com.google.android.gms.o.t tVar, long j2, final Map map) {
        final m mVar;
        com.google.android.gms.o.t tVarC;
        final Date date = new Date(System.currentTimeMillis());
        if (tVar.k()) {
            Date dateG = this.f10707i.g();
            if (!dateG.equals(v.f10740a) && date.before(new Date(dateG.getTime() + TimeUnit.SECONDS.toMillis(j2)))) {
                return ag.c(k.f());
            }
        }
        Date dateB = this.f10707i.d().b();
        if (true != date.before(dateB)) {
            dateB = null;
        }
        if (dateB != null) {
            long time = dateB.getTime() - date.getTime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            String str = String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(time / 1000));
            dateB.getTime();
            tVarC = ag.b(new com.google.firebase.remoteconfig.e(str));
            mVar = this;
        } else {
            com.google.firebase.installations.d dVar = this.f10701c;
            final com.google.android.gms.o.t tVarA = dVar.a();
            final com.google.android.gms.o.t tVarH = dVar.h();
            mVar = this;
            tVarC = ag.e(tVarA, tVarH).c(this.f10703e, new com.google.android.gms.o.a() { // from class: com.google.firebase.remoteconfig.internal.j
                @Override // com.google.android.gms.o.a
                public final Object a(com.google.android.gms.o.t tVar2) {
                    return m.f(this.f10687a, tVarA, tVarH, date, map);
                }
            });
        }
        return tVarC.c(mVar.f10703e, new com.google.android.gms.l.q(mVar, date, 3));
    }

    public final long a() {
        return this.f10707i.b();
    }

    public final com.google.android.gms.o.t d() {
        final long jC = this.f10707i.c();
        final HashMap map = new HashMap(this.f10708j);
        map.put("X-Firebase-RC-Fetch-Type", String.valueOf(l.BASE.a()).concat("/1"));
        return this.f10705g.a().c(this.f10703e, new com.google.android.gms.o.a() { // from class: com.google.firebase.remoteconfig.internal.i
            @Override // com.google.android.gms.o.a
            public final Object a(com.google.android.gms.o.t tVar) {
                return this.f10684a.h(tVar, jC, map);
            }
        });
    }

    public final com.google.android.gms.o.t e(l lVar, int i2) {
        HashMap map = new HashMap(this.f10708j);
        map.put("X-Firebase-RC-Fetch-Type", lVar.a() + DomExceptionUtils.SEPARATOR + i2);
        return this.f10705g.a().c(this.f10703e, new com.google.android.gms.l.q(this, map, 4));
    }
}
