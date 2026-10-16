package com.waze.sound.f;

import androidx.core.app.NotificationCompat;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.ayl;
import l.a.aym;
import l.a.bqa;
import l.a.bqm;
import l.a.bqn;
import l.a.bqo;
import l.a.bqp;
import l.a.sh;
import l.a.si;
import l.a.sj;
import l.a.sk;
import l.a.sl;
import l.a.sm;
import l.a.sn;
import l.a.so;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    private final ax f39989b;

    public e(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f39989b = axVar;
    }

    @Override // com.waze.sound.f.d
    public final void a(b bVar, boolean z) {
        sh shVar;
        x.f(bVar, "action");
        com.waze.sharedui.d.a.b bVarS = h.c.a.h.s(bqa.newBuilder());
        si siVarNewBuilder = sj.newBuilder();
        x.f(siVarNewBuilder, "builder");
        b bVar2 = b.f39977a;
        c cVar = c.f39981a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            shVar = sh.CLOSE;
        } else if (iOrdinal == 1) {
            shVar = sh.CHANGE_LANGUAGE;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            shVar = sh.TRY_AGAIN;
        }
        ax axVar = this.f39989b;
        x.f(shVar, "value");
        siVarNewBuilder.a(shVar);
        siVarNewBuilder.b(z);
        sj sjVarBuild = siVarNewBuilder.build();
        x.e(sjVarBuild, "build(...)");
        bVarS.av(sjVarBuild);
        o.N(axVar, bVarS.au());
    }

    @Override // com.waze.sound.f.d
    public final void b(c cVar) {
        sl slVar;
        x.f(cVar, NotificationCompat.CATEGORY_STATUS);
        com.waze.sharedui.d.a.b bVarS = h.c.a.h.s(bqa.newBuilder());
        sk skVarNewBuilder = sm.newBuilder();
        x.f(skVarNewBuilder, "builder");
        b bVar = b.f39977a;
        c cVar2 = c.f39981a;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            slVar = sl.SUCCESS;
        } else if (iOrdinal == 1) {
            slVar = sl.NETWORK_ERROR;
        } else if (iOrdinal == 2) {
            slVar = sl.NO_MATCH_ERROR;
        } else if (iOrdinal == 3) {
            slVar = sl.NO_PERMISSIONS;
        } else if (iOrdinal == 4) {
            slVar = sl.SPEECH_TIMEOUT_ERROR;
        } else {
            if (iOrdinal != 5) {
                throw new h.i();
            }
            slVar = sl.UNSPECIFIED_ERROR;
        }
        ax axVar = this.f39989b;
        x.f(slVar, "value");
        skVarNewBuilder.a(slVar);
        sm smVarBuild = skVarNewBuilder.build();
        x.e(smVarBuild, "build(...)");
        bVarS.aw(smVarBuild);
        o.N(axVar, bVarS.au());
    }

    @Override // com.waze.sound.f.d
    public final void c() {
        com.waze.sharedui.d.a.b bVarS = h.c.a.h.s(bqa.newBuilder());
        sn snVarNewBuilder = so.newBuilder();
        x.f(snVarNewBuilder, "builder");
        so soVarBuild = snVarNewBuilder.build();
        x.e(soVarBuild, "build(...)");
        bVarS.ax(soVarBuild);
        o.N(this.f39989b, bVarS.au());
    }

    @Override // com.waze.sound.f.d
    public final void d() {
        com.waze.sharedui.d.a.b bVarS = h.c.a.h.s(bqa.newBuilder());
        ayl aylVarNewBuilder = aym.newBuilder();
        x.f(aylVarNewBuilder, "builder");
        aym aymVarBuild = aylVarNewBuilder.build();
        x.e(aymVarBuild, "build(...)");
        bVarS.ay(aymVarBuild);
        o.N(this.f39989b, bVarS.au());
    }

    @Override // com.waze.sound.f.d
    public final void e() {
        com.waze.sharedui.d.a.b bVarS = h.c.a.h.s(bqa.newBuilder());
        bqm bqmVarNewBuilder = bqn.newBuilder();
        x.f(bqmVarNewBuilder, "builder");
        bqn bqnVarBuild = bqmVarNewBuilder.build();
        x.e(bqnVarBuild, "build(...)");
        bVarS.az(bqnVarBuild);
        o.N(this.f39989b, bVarS.au());
    }

    @Override // com.waze.sound.f.d
    public final void f(String str, boolean z) {
        x.f(str, "language");
        com.waze.sharedui.d.a.b bVarS = h.c.a.h.s(bqa.newBuilder());
        bqo bqoVarNewBuilder = bqp.newBuilder();
        x.f(bqoVarNewBuilder, "builder");
        x.f(str, "value");
        bqoVarNewBuilder.b(str);
        bqoVarNewBuilder.a(z);
        bqp bqpVarBuild = bqoVarNewBuilder.build();
        x.e(bqpVarBuild, "build(...)");
        bVarS.aA(bqpVarBuild);
        o.N(this.f39989b, bVarS.au());
    }
}
