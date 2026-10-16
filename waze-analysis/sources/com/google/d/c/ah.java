package com.google.d.c;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends l implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    final al f7272a;

    /* renamed from: b, reason: collision with root package name */
    final al f7273b;

    /* renamed from: c, reason: collision with root package name */
    final com.google.d.b.s f7274c;

    /* renamed from: d, reason: collision with root package name */
    final com.google.d.b.s f7275d;

    /* renamed from: e, reason: collision with root package name */
    final long f7276e;

    /* renamed from: f, reason: collision with root package name */
    final long f7277f;

    /* renamed from: g, reason: collision with root package name */
    final long f7278g;

    /* renamed from: h, reason: collision with root package name */
    final bi f7279h;

    /* renamed from: i, reason: collision with root package name */
    final int f7280i;

    /* renamed from: j, reason: collision with root package name */
    final bg f7281j;

    /* renamed from: k, reason: collision with root package name */
    final com.google.d.b.aq f7282k;

    /* renamed from: l, reason: collision with root package name */
    transient b f7283l;

    ah(bd bdVar) {
        al alVar = bdVar.f7353j;
        al alVar2 = bdVar.f7354k;
        com.google.d.b.s sVar = bdVar.f7351h;
        com.google.d.b.s sVar2 = bdVar.f7352i;
        long j2 = bdVar.o;
        long j3 = bdVar.n;
        long j4 = bdVar.f7355l;
        bi biVar = bdVar.m;
        int i2 = bdVar.f7350g;
        bg bgVar = bdVar.q;
        com.google.d.b.aq aqVar = bdVar.r;
        this.f7272a = alVar;
        this.f7273b = alVar2;
        this.f7274c = sVar;
        this.f7275d = sVar2;
        this.f7276e = j2;
        this.f7277f = j3;
        this.f7278g = j4;
        this.f7279h = biVar;
        this.f7280i = i2;
        this.f7281j = bgVar;
        this.f7282k = (aqVar == com.google.d.b.aq.systemTicker() || aqVar == h.f7368b) ? null : aqVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        h hVarB = h.b();
        al alVar = hVarB.f7375i;
        com.google.d.b.an.y(alVar == null, "Key strength was already set to %s", alVar);
        al alVar2 = this.f7272a;
        com.google.d.b.an.B(alVar2);
        hVarB.f7375i = alVar2;
        al alVar3 = hVarB.f7376j;
        com.google.d.b.an.y(alVar3 == null, "Value strength was already set to %s", alVar3);
        al alVar4 = this.f7273b;
        com.google.d.b.an.B(alVar4);
        hVarB.f7376j = alVar4;
        com.google.d.b.s sVar = hVarB.m;
        com.google.d.b.an.y(sVar == null, "key equivalence was already set to %s", sVar);
        com.google.d.b.s sVar2 = this.f7274c;
        com.google.d.b.an.B(sVar2);
        hVarB.m = sVar2;
        com.google.d.b.s sVar3 = hVarB.n;
        com.google.d.b.an.y(sVar3 == null, "value equivalence was already set to %s", sVar3);
        com.google.d.b.s sVar4 = this.f7275d;
        com.google.d.b.an.B(sVar4);
        hVarB.n = sVar4;
        int i2 = hVarB.f7371e;
        com.google.d.b.an.w(i2 == -1, "concurrency level was already set to %s", i2);
        int i3 = this.f7280i;
        com.google.d.b.an.l(i3 > 0);
        hVarB.f7371e = i3;
        com.google.d.b.an.u(hVarB.o == null);
        bg bgVar = this.f7281j;
        com.google.d.b.an.B(bgVar);
        hVarB.o = bgVar;
        hVarB.f7369c = false;
        long j2 = this.f7276e;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j3 = hVarB.f7377k;
            com.google.d.b.an.x(j3 == -1, "expireAfterWrite was already set to %s ns", j3);
            hVarB.f7377k = j2;
        }
        long j4 = this.f7277f;
        if (j4 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j5 = hVarB.f7378l;
            com.google.d.b.an.x(j5 == -1, "expireAfterAccess was already set to %s ns", j5);
            hVarB.f7378l = j4;
        }
        bi biVar = this.f7279h;
        if (biVar != g.f7365a) {
            com.google.d.b.an.u(hVarB.f7374h == null);
            if (hVarB.f7369c) {
                long j6 = hVarB.f7372f;
                com.google.d.b.an.x(j6 == -1, "weigher can not be combined with maximum size (%s provided)", j6);
            }
            com.google.d.b.an.B(biVar);
            hVarB.f7374h = biVar;
            long j7 = this.f7278g;
            if (j7 != -1) {
                long j8 = hVarB.f7373g;
                com.google.d.b.an.x(j8 == -1, "maximum weight was already set to %s", j8);
                long j9 = hVarB.f7372f;
                com.google.d.b.an.x(j9 == -1, "maximum size was already set to %s", j9);
                com.google.d.b.an.m(true, "maximum weight must not be negative");
                hVarB.f7373g = j7;
            }
        } else {
            long j10 = this.f7278g;
            if (j10 != -1) {
                hVarB.f(j10);
            }
        }
        com.google.d.b.aq aqVar = this.f7282k;
        if (aqVar != null) {
            com.google.d.b.an.u(hVarB.p == null);
            hVarB.p = aqVar;
        }
        this.f7283l = hVarB.a();
    }

    private Object readResolve() {
        return this.f7283l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.d.c.l
    /* renamed from: b */
    public final b delegate() {
        return this.f7283l;
    }

    @Override // com.google.d.c.l, com.google.d.d.be
    protected final /* synthetic */ Object delegate() {
        return this.f7283l;
    }
}
