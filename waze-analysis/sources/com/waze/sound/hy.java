package com.waze.sound;

import l.a.asm;
import l.a.asn;
import l.a.bcf;
import l.a.bcg;
import l.a.bmm;
import l.a.bmo;
import l.a.bqd;
import l.a.bqe;
import l.a.bqf;
import l.a.pj;
import l.a.pk;
import l.a.pl;
import l.a.pn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hy implements hx {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.stats.ax f40210b;

    public hy(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f40210b = axVar;
    }

    @Override // com.waze.sound.hx
    public final void a(ht htVar, String str) {
        pj pjVar;
        h.g.b.x.f(htVar, "action");
        pk pkVarNewBuilder = pl.newBuilder();
        h.g.b.x.e(pkVarNewBuilder, "newBuilder(...)");
        ht htVar2 = ht.f40179a;
        switch (htVar.ordinal()) {
            case 0:
                pjVar = pj.SAVE_VOICE;
                break;
            case 1:
                pjVar = pj.RECORD_INSTRUCTION;
                break;
            case 2:
                pjVar = pj.PLAY_RECORDING;
                break;
            case 3:
                pjVar = pj.EDIT_VOICE_NAME;
                break;
            case 4:
                pjVar = pj.DELETE_RECORDING;
                break;
            case 5:
                pjVar = pj.SELECT_FALLBACK;
                break;
            case 6:
                pjVar = pj.DELETE_ALL_RECORDINGS;
                break;
            default:
                throw new h.i();
        }
        pkVarNewBuilder.a(pjVar);
        if (str != null) {
            pkVarNewBuilder.b(str);
        }
        pl plVarBuild = pkVarNewBuilder.build();
        h.g.b.x.e(plVarBuild, "build(...)");
        bmm bmmVarNewBuilder = bmo.newBuilder();
        bmmVarNewBuilder.a(plVarBuild);
        bmo bmoVarBuild = bmmVarNewBuilder.build();
        h.g.b.x.e(bmoVarBuild, "build(...)");
        com.waze.sharedui.utils.o.K(this.f40210b, bmoVarBuild);
    }

    @Override // com.waze.sound.hx
    public final void b() {
        pn pnVarBuild = pn.newBuilder().build();
        h.g.b.x.e(pnVarBuild, "build(...)");
        bmm bmmVarNewBuilder = bmo.newBuilder();
        bmmVarNewBuilder.b(pnVarBuild);
        bmo bmoVarBuild = bmmVarNewBuilder.build();
        h.g.b.x.e(bmoVarBuild, "build(...)");
        com.waze.sharedui.utils.o.K(this.f40210b, bmoVarBuild);
    }

    @Override // com.waze.sound.hx
    public final void c(String str) {
        h.g.b.x.f(str, "audioFilePath");
        asm asmVarNewBuilder = asn.newBuilder();
        asmVarNewBuilder.a(str);
        asn asnVarBuild = asmVarNewBuilder.build();
        h.g.b.x.e(asnVarBuild, "build(...)");
        bmm bmmVarNewBuilder = bmo.newBuilder();
        bmmVarNewBuilder.c(asnVarBuild);
        bmo bmoVarBuild = bmmVarNewBuilder.build();
        h.g.b.x.e(bmoVarBuild, "build(...)");
        com.waze.sharedui.utils.o.K(this.f40210b, bmoVarBuild);
    }

    @Override // com.waze.sound.hx
    public final void d(String str) {
        bcf bcfVarNewBuilder = bcg.newBuilder();
        if (str != null) {
            bcfVarNewBuilder.a(str);
        }
        bcg bcgVarBuild = bcfVarNewBuilder.build();
        h.g.b.x.e(bcgVarBuild, "build(...)");
        bmm bmmVarNewBuilder = bmo.newBuilder();
        bmmVarNewBuilder.d(bcgVarBuild);
        bmo bmoVarBuild = bmmVarNewBuilder.build();
        h.g.b.x.e(bmoVarBuild, "build(...)");
        com.waze.sharedui.utils.o.K(this.f40210b, bmoVarBuild);
    }

    @Override // com.waze.sound.hx
    public final void e(hv hvVar, String str, Boolean bool) {
        bqd bqdVar;
        h.g.b.x.f(hvVar, "action");
        bmm bmmVarNewBuilder = bmo.newBuilder();
        h.g.b.x.f(bmmVarNewBuilder, "builder");
        bqe bqeVarNewBuilder = bqf.newBuilder();
        h.g.b.x.f(bqeVarNewBuilder, "builder");
        hv hvVar2 = hv.f40196a;
        hu huVar = hu.f40187a;
        hw hwVar = hw.f40204a;
        switch (hvVar.ordinal()) {
            case 0:
                bqdVar = bqd.ACTION_UNSPECIFIED;
                break;
            case 1:
                bqdVar = bqd.CUSTOM_VOICE_DOWNLOAD;
                break;
            case 2:
                bqdVar = bqd.CUSTOM_VOICE_EDIT;
                break;
            case 3:
                bqdVar = bqd.CUSTOM_VOICE_INFO;
                break;
            case 4:
                bqdVar = bqd.CUSTOM_VOICE_SHARE;
                break;
            case 5:
                bqdVar = bqd.RECORD_NEW_VOICE;
                break;
            case 6:
                bqdVar = bqd.SET_VOICE;
                break;
            default:
                throw new h.i();
        }
        h.g.b.x.f(bqdVar, "value");
        bqeVarNewBuilder.a(bqdVar);
        if (str != null) {
            h.g.b.x.f(str, "value");
            bqeVarNewBuilder.c(str);
        }
        if (bool != null) {
            bool.booleanValue();
            bqeVarNewBuilder.b(bool.booleanValue());
        }
        com.waze.stats.ax axVar = this.f40210b;
        bqf bqfVarBuild = bqeVarNewBuilder.build();
        h.g.b.x.e(bqfVarBuild, "build(...)");
        bqf bqfVar = bqfVarBuild;
        h.g.b.x.f(bqfVar, "value");
        bmmVarNewBuilder.e(bqfVar);
        bmo bmoVarBuild = bmmVarNewBuilder.build();
        h.g.b.x.e(bmoVarBuild, "build(...)");
        com.waze.sharedui.utils.o.K(axVar, bmoVarBuild);
    }
}
