package defpackage;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zya extends zsm {
    final /* synthetic */ zyb b;
    private final boolean c;
    private final aauw d;

    public zya(zyb zybVar, boolean z, aauw aauwVar) {
        this.b = zybVar;
        this.c = z;
        this.d = aauwVar;
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final boolean f() {
        return true;
    }

    @Override // defpackage.zsr
    public final int h() {
        return 75;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zsr
    public final void i(DataOutputStream dataOutputStream) throws IOException {
        String string;
        abnp abnpVarN = acbt.a.n();
        zyb zybVar = this.b;
        synchronized (zybVar) {
            for (aceg acegVar : addm.f() ? zybVar.e : zybVar.d) {
                abnp abnpVarN2 = aceg.a.n();
                if ((acegVar.b & 1) != 0) {
                    acef acefVarB = acef.b(acegVar.e);
                    if (acefVarB == null) {
                        acefVarB = acef.UNKNOWN_TYPE;
                    }
                    abnpVarN2.t();
                    aceg acegVar2 = (aceg) abnpVarN2.b;
                    acegVar2.e = acefVarB.eO;
                    acegVar2.b = 1 | acegVar2.b;
                }
                if ((acegVar.b & 2) != 0) {
                    long j = acegVar.f;
                    abnpVarN2.t();
                    aceg acegVar3 = (aceg) abnpVarN2.b;
                    acegVar3.b |= 2;
                    acegVar3.f = j;
                }
                abnpVarN.t();
                acbt acbtVar = (acbt) abnpVarN.b;
                aceg acegVar4 = (aceg) abnpVarN2.q();
                acegVar4.getClass();
                acbtVar.b();
                acbtVar.c.add(acegVar4);
            }
        }
        zyb zybVar2 = this.b;
        acbs acbsVar = acbs.a;
        abnp abnpVarN3 = acbsVar.n();
        abnpVarN3.t();
        acbs acbsVar2 = (acbs) abnpVarN3.b;
        acbsVar2.b |= 1;
        acbsVar2.c = true;
        boolean z = zrs.c(zybVar2.r) || zrs.b();
        abnpVarN3.t();
        acbs acbsVar3 = (acbs) abnpVarN3.b;
        acbsVar3.b |= 2;
        acbsVar3.d = z;
        abnpVarN3.t();
        acbs acbsVar4 = (acbs) abnpVarN3.b;
        acbsVar4.b |= 8;
        acbsVar4.f = true;
        abgf abgfVar = (abgf) zybVar2.u.gu();
        abnpVarN3.t();
        acbs acbsVar5 = (acbs) abnpVarN3.b;
        abgfVar.getClass();
        acbsVar5.h = abgfVar;
        acbsVar5.b |= 32;
        aauw aauwVar = this.d;
        abnpVarN3.t();
        acbs acbsVar6 = (acbs) abnpVarN3.b;
        aauwVar.getClass();
        acbsVar6.k = aauwVar;
        acbsVar6.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        acbs acbsVar7 = (acbs) abnpVarN3.q();
        abnpVarN.t();
        acbt acbtVar2 = (acbt) abnpVarN.b;
        acbsVar7.getClass();
        acbtVar2.d = acbsVar7;
        acbtVar2.b |= 1;
        String str = zyb.a;
        if (zrn.e(str, 4)) {
            if (abnpVarN == null) {
                string = "null";
            } else {
                zsa zsaVarA = zsa.a(abnpVarN);
                for (int i = 0; i < ((acbt) abnpVarN.b).c.size(); i++) {
                    zsaVarA.b(a.bp(i, "ParameterGroup$"), zyb.d((aceg) ((acbt) abnpVarN.b).c.get(i)));
                }
                acbt acbtVar3 = (acbt) abnpVarN.b;
                if ((acbtVar3.b & 1) != 0) {
                    acbs acbsVar8 = acbtVar3.d;
                    if (acbsVar8 != null) {
                        acbsVar = acbsVar8;
                    }
                    zsa zsaVarA2 = zsa.a(acbsVar);
                    if ((acbsVar.b & 1) != 0) {
                        zsaVarA2.g("opengl_es_1x_supported", acbsVar.c);
                    }
                    if ((acbsVar.b & 2) != 0) {
                        zsaVarA2.g("opengl_es_2x_supported", acbsVar.d);
                    }
                    if ((acbsVar.b & 8) != 0) {
                        zsaVarA2.g("full_base_zoom_table_supported", acbsVar.f);
                    }
                    if ((acbsVar.b & 32) != 0) {
                        abgf abgfVar2 = acbsVar.h;
                        if (abgfVar2 == null) {
                            abgfVar2 = abgf.a;
                        }
                        zsa zsaVarA3 = zsa.a(acbsVar);
                        if ((abgfVar2.b & 2) != 0) {
                            zsaVarA3.b("client_platform", abgfVar2.d);
                        }
                        if ((4 & abgfVar2.b) != 0) {
                            zsaVarA3.b("distribution_channel", abgfVar2.e);
                        }
                        if ((abgfVar2.b & 8) != 0) {
                            zsaVarA3.b("os_version", abgfVar2.f);
                        }
                        if ((abgfVar2.b & 16) != 0) {
                            zsaVarA3.b("application_name", abgfVar2.g);
                        }
                        if ((abgfVar2.b & 64) != 0) {
                            zsaVarA3.b("application_version", abgfVar2.h);
                        }
                        if ((abgfVar2.b & 128) != 0) {
                            zsaVarA3.b("maps_api_version", abgfVar2.i);
                        }
                        if ((abgfVar2.b & 1024) != 0) {
                            zsaVarA3.d("dpi_ratio", abgfVar2.l);
                        }
                        if ((abgfVar2.b & 2048) != 0) {
                            zsaVarA3.g("include_copyrights", abgfVar2.n);
                        }
                        if (addm.c() && (abgfVar2.b & 256) != 0) {
                            zsaVarA3.b("renderer_version", abgfVar2.j);
                        }
                        zsaVarA2.b("paintfe_client_properties", zsaVarA3.toString());
                    }
                    zsaVarA.b("request_info", zsaVarA2.toString());
                }
                string = zsaVarA.toString();
            }
            Log.i(str, String.format("ClientParameters requested: %s", string));
        }
        zrp.b(dataOutputStream, abnpVarN.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zsr
    public final void j(DataInputStream dataInputStream) throws IOException {
        aavd aavdVar;
        zxy zxyVar;
        int i;
        String string;
        acbu acbuVar = acbu.a;
        acbu acbuVar2 = (acbu) zrp.a(abnv.L(acbu.class), dataInputStream);
        String str = zyb.a;
        if (zrn.e(str, 4)) {
            if (acbuVar2 == null) {
                string = "null";
            } else {
                zsa zsaVarA = zsa.a(acbuVar2);
                for (int i2 = 0; i2 < acbuVar2.c.size(); i2++) {
                    zsaVarA.b(a.bp(i2, "ParameterGroup$"), zyb.d((aceg) acbuVar2.c.get(i2)));
                }
                string = zsaVarA.toString();
            }
            Log.i(str, String.format("ClientParameters received: %s", string));
        }
        zyb zybVar = this.b;
        synchronized (zybVar) {
            aavdVar = null;
            boolean z = false;
            for (aceg acegVar : acbuVar2.c) {
                if ((acegVar.b & 2) != 0 && zybVar.k(acegVar)) {
                    zybVar.j(acegVar);
                    acef acefVarB = acef.b(acegVar.e);
                    if (acefVarB == null) {
                        acefVarB = acef.UNKNOWN_TYPE;
                    }
                    if (acefVarB == acef.MAPS_API_PARAMETERS && (i = acegVar.c) == 151) {
                        aavdVar = i == 151 ? (aavd) acegVar.d : aavd.a;
                    }
                    z = true;
                }
            }
            if (z) {
                abnp abnpVarN = acbu.a.n();
                abnpVarN.ao(addm.f() ? zybVar.e : zybVar.d);
                zybVar.w = (acbu) abnpVarN.q();
                ((zri) zybVar.v.gu()).b(zybVar.w);
            }
            zybVar.p = true;
        }
        zyb zybVar2 = this.b;
        zybVar2.f();
        if (aavdVar != null && (zxyVar = zybVar2.s) != null) {
            ((zwn) zxyVar).c.e(aavdVar);
        }
        synchronized (zybVar2.o) {
            zybVar2.n = false;
            if (zybVar2.m) {
                zybVar2.h();
            } else {
                zybVar2.l = zyb.c.schedule(new zte(this, 16), 3L, TimeUnit.HOURS);
            }
        }
    }
}
