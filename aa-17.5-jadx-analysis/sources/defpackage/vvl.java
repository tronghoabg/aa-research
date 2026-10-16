package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class vvl extends vzk {
    public vvl(ajgu ajguVar) {
        super(ajguVar);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        ajgu ajguVar = this.b;
        if ((ajguVar.b & 8) != 0) {
            ajfe ajfeVar = ajguVar.f;
            if (ajfeVar == null) {
                ajfeVar = ajfe.a;
            }
            yfu yfuVar = new yfu(4);
            ajfd ajfdVar = ajfeVar.c;
            if (ajfdVar == null) {
                ajfdVar = ajfd.a;
            }
            ajfb ajfbVar = ajfdVar.c;
            if (ajfbVar == null) {
                ajfbVar = ajfb.a;
            }
            if ((ajfbVar.b & 1) != 0) {
                yfuVar.e("DPS", Integer.valueOf(ajfbVar.c));
            }
            if ((ajfbVar.b & 2) != 0) {
                yfuVar.e("NPS", Integer.valueOf(ajfbVar.d));
            }
            if ((ajfbVar.b & 4) != 0) {
                yfuVar.e("OPS", Integer.valueOf(ajfbVar.e));
            }
            if ((ajfbVar.b & 8) != 0) {
                yfuVar.e("DPD", Integer.valueOf(ajfbVar.f));
            }
            if ((ajfbVar.b & 16) != 0) {
                yfuVar.e("NPD", Integer.valueOf(ajfbVar.g));
            }
            if ((ajfbVar.b & 32) != 0) {
                yfuVar.e("OPD", Integer.valueOf(ajfbVar.h));
            }
            if ((ajfbVar.b & 256) != 0) {
                yfuVar.e("TSD", Integer.valueOf(ajfbVar.j));
            }
            if ((ajfbVar.b & 524288) != 0) {
                yfuVar.e("RssHwm", Long.valueOf(ajfbVar.t));
            }
            if ((ajfbVar.b & 1048576) != 0) {
                yfuVar.e("RSS", Long.valueOf(ajfbVar.u));
            }
            if ((ajfbVar.b & 2097152) != 0) {
                yfuVar.e("RssAnon", Long.valueOf(ajfbVar.v));
            }
            int i = ajfbVar.b;
            if ((2097152 & i) != 0 && (i & 4194304) != 0) {
                yfuVar.e("RssAnonSWAP", Long.valueOf(ajfbVar.v + ajfbVar.w));
            }
            if ((ajfbVar.b & 4194304) != 0) {
                yfuVar.e("SWAP", Long.valueOf(ajfbVar.w));
            }
            if ((ajfbVar.b & 8388608) != 0) {
                yfuVar.e("VMS", Long.valueOf(ajfbVar.x));
            }
            ajfx ajfxVar = ajfeVar.d;
            if (ajfxVar == null) {
                ajfxVar = ajfx.a;
            }
            if ((ajfxVar.b & 1) != 0) {
                ajfx ajfxVar2 = ajfeVar.d;
                if (ajfxVar2 == null) {
                    ajfxVar2 = ajfx.a;
                }
                ajfw ajfwVar = ajfxVar2.c;
                if (ajfwVar == null) {
                    ajfwVar = ajfw.a;
                }
                if ((ajfwVar.b & 1) != 0) {
                    yfuVar.e("PET", Long.valueOf(ajfwVar.c));
                }
                yfuVar.e("IF", Integer.valueOf(ajfwVar.d ? 1 : 0));
                if ((4 & ajfwVar.b) != 0) {
                    yfuVar.e("THC", Integer.valueOf(ajfwVar.e));
                }
            }
            yfuVar.e("TPD", Integer.valueOf(ajfbVar.f + ajfbVar.g + ajfbVar.h));
            yfuVar.e("PSS", Integer.valueOf(ajfbVar.c + ajfbVar.d + ajfbVar.e));
            if ((ajfbVar.b & 128) != 0) {
                yfuVar.e("TPC", Integer.valueOf(ajfbVar.i));
            }
            if ((ajfbVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                yfuVar.e("TSP", Integer.valueOf(ajfbVar.k));
            }
            if ((ajfbVar.b & 2048) != 0) {
                yfuVar.e("SJH", Integer.valueOf(ajfbVar.l));
            }
            if ((ajfbVar.b & 8192) != 0) {
                yfuVar.e("SST", Integer.valueOf(ajfbVar.n));
            }
            if ((ajfbVar.b & 4096) != 0) {
                yfuVar.e("SCO", Integer.valueOf(ajfbVar.m));
            }
            if ((ajfbVar.b & 16384) != 0) {
                yfuVar.e("SGR", Integer.valueOf(ajfbVar.o));
            }
            if ((ajfbVar.b & 32768) != 0) {
                yfuVar.e("SPO", Integer.valueOf(ajfbVar.p));
            }
            if ((ajfbVar.b & 65536) != 0) {
                yfuVar.e("SSY", Integer.valueOf(ajfbVar.q));
            }
            yfy yfyVarD = yfuVar.d(true);
            if (yfyVarD.isEmpty()) {
                return;
            }
            ajfe ajfeVar2 = ajguVar.f;
            if (ajfeVar2 == null) {
                ajfeVar2 = ajfe.a;
            }
            rjuVar.x("MEC", Integer.valueOf((a.aD(ajfeVar2.e) != 0 ? r12 : 1) - 1));
            yno it = yfyVarD.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                rjuVar.z((String) entry.getKey(), (Number) entry.getValue());
            }
        }
    }

    @Override // defpackage.vzk
    protected final String b() {
        ajgu ajguVar = this.b;
        String strB = super.b();
        if ((ajguVar.b & 8) == 0) {
            return strB;
        }
        ajfe ajfeVar = ajguVar.f;
        if (ajfeVar == null) {
            ajfeVar = ajfe.a;
        }
        int iAD = a.aD(ajfeVar.e);
        if (iAD == 0) {
            iAD = 1;
        }
        return (iAD == 1 || iAD == 7 || !strB.isEmpty()) ? strB : Integer.toString(iAD - 1);
    }
}
