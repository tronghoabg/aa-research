package com.waze.perf;

import com.waze.stats.ax;
import l.a.abi;
import l.a.abj;
import l.a.apx;
import l.a.apz;
import l.a.io;
import l.a.ip;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    private final ax f33077a;

    public v(ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f33077a = axVar;
    }

    @Override // com.waze.perf.u
    public final void a(Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Boolean bool, Long l13, Long l14) {
        io ioVarNewBuilder = ip.newBuilder();
        h.g.b.x.e(ioVarNewBuilder, "newBuilder(...)");
        if (l2 != null) {
            ioVarNewBuilder.e(l2.longValue());
        }
        if (l3 != null) {
            ioVarNewBuilder.a(l3.longValue());
        }
        if (l4 != null) {
            ioVarNewBuilder.b(l4.longValue());
        }
        if (l5 != null) {
            ioVarNewBuilder.d(l5.longValue());
        }
        if (l6 != null) {
            ioVarNewBuilder.c(l6.longValue());
        }
        if (l7 != null) {
            ioVarNewBuilder.f(l7.longValue());
        }
        if (l8 != null) {
            ioVarNewBuilder.l(l8.longValue());
        }
        if (l9 != null) {
            ioVarNewBuilder.h(l9.longValue());
        }
        if (l10 != null) {
            ioVarNewBuilder.i(l10.longValue());
        }
        if (l11 != null) {
            ioVarNewBuilder.k(l11.longValue());
        }
        if (l12 != null) {
            ioVarNewBuilder.n(l12.longValue());
        }
        ioVarNewBuilder.m(bool.booleanValue());
        if (l13 != null) {
            ioVarNewBuilder.g(l13.longValue());
        }
        if (l14 != null) {
            ioVarNewBuilder.j(l14.longValue());
        }
        apx apxVarNewBuilder = apz.newBuilder();
        apxVarNewBuilder.a(ioVarNewBuilder);
        apz apzVarBuild = apxVarNewBuilder.build();
        h.g.b.x.e(apzVarBuild, "build(...)");
        com.waze.sharedui.utils.o.A(this.f33077a, apzVarBuild);
    }

    @Override // com.waze.perf.u
    public final void b(Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12) {
        abi abiVarNewBuilder = abj.newBuilder();
        h.g.b.x.e(abiVarNewBuilder, "newBuilder(...)");
        abiVarNewBuilder.i(l2.longValue());
        abiVarNewBuilder.j(l3.longValue());
        abiVarNewBuilder.g(l4.longValue());
        abiVarNewBuilder.f(l5.longValue());
        abiVarNewBuilder.e(l6.longValue());
        abiVarNewBuilder.d(l7.longValue());
        if (l8 != null) {
            abiVarNewBuilder.a(l8.longValue());
        }
        if (l9 != null) {
            abiVarNewBuilder.c(l9.longValue());
        }
        if (l10 != null) {
            abiVarNewBuilder.b(l10.longValue());
        }
        abiVarNewBuilder.k(l11.longValue());
        abiVarNewBuilder.h(l12.longValue());
        abj abjVarBuild = abiVarNewBuilder.build();
        h.g.b.x.e(abjVarBuild, "build(...)");
        apx apxVarNewBuilder = apz.newBuilder();
        apxVarNewBuilder.b(abjVarBuild);
        apz apzVarBuild = apxVarNewBuilder.build();
        h.g.b.x.e(apzVarBuild, "build(...)");
        com.waze.sharedui.utils.o.A(this.f33077a, apzVarBuild);
    }
}
