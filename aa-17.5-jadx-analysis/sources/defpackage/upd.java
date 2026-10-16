package defpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class upd implements uol {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/diskcache/SqliteDiskTileCache");
    public final abgl b;
    public final tox c;
    public final ukr d;
    public final uoz e;
    public final tpa f;
    public final tmb g;
    public final kex h;
    public final ykd i;
    private final uom j;
    private final erb k;

    public upd(tpa tpaVar, uoz uozVar, tox toxVar, ukr ukrVar, uom uomVar, kex kexVar, ykd ykdVar, tmb tmbVar, erb erbVar) {
        this.f = tpaVar;
        this.e = uozVar;
        this.b = toxVar.c;
        this.c = toxVar;
        this.d = ukrVar;
        this.j = uomVar;
        this.h = kexVar;
        this.i = ykdVar;
        this.g = tmbVar;
        this.k = erbVar;
    }

    public static pka k(pka pkaVar, tmb tmbVar) {
        pka pkaVarO = o(pkaVar);
        abnp abnpVarK = pkaVarO.K();
        if ((pkaVarO.b & 32) != 0) {
            long jN = n(tmbVar, pkaVarO.h);
            abnpVarK.t();
            pka pkaVar2 = (pka) abnpVarK.b;
            pkaVar2.b |= 32;
            pkaVar2.h = jN;
        }
        if ((pkaVarO.b & 64) != 0) {
            long jN2 = n(tmbVar, pkaVarO.i);
            abnpVarK.t();
            pka pkaVar3 = (pka) abnpVarK.b;
            pkaVar3.b |= 64;
            pkaVar3.i = jN2;
        }
        return (pka) abnpVarK.q();
    }

    public static pka l(pka pkaVar, tmb tmbVar) {
        pka pkaVarO = o(pkaVar);
        abnp abnpVarK = pkaVarO.K();
        if ((pkaVarO.b & 32) != 0) {
            long j = tmo.j(tmbVar, pkaVarO.h);
            abnpVarK.t();
            pka pkaVar2 = (pka) abnpVarK.b;
            pkaVar2.b |= 32;
            pkaVar2.h = j;
        }
        if ((pkaVarO.b & 64) != 0) {
            long j2 = tmo.j(tmbVar, pkaVarO.i);
            abnpVarK.t();
            pka pkaVar3 = (pka) abnpVarK.b;
            pkaVar3.b |= 64;
            pkaVar3.i = j2;
        }
        return (pka) abnpVarK.q();
    }

    private static long n(tmb tmbVar, long j) {
        if (j >= 0) {
            return Math.max(0L, (j + tmbVar.a()) - tmbVar.f().toEpochMilli());
        }
        return -1L;
    }

    private static pka o(pka pkaVar) {
        if ((pkaVar.b & 4) != 0 && pkaVar.e == 0) {
            ((ynz) ((ynz) a.e()).ai((char) 9565)).u("Clearing default experimentEpoch.");
            abnp abnpVarK = pkaVar.K();
            abnpVarK.t();
            pka pkaVar2 = (pka) abnpVarK.b;
            pkaVar2.b &= -5;
            pkaVar2.e = 0;
            pkaVar = (pka) abnpVarK.q();
        }
        if ((pkaVar.b & 32) != 0 && pkaVar.h == -1) {
            ((ynz) ((ynz) a.e()).ai((char) 9564)).u("Clearing default expirationTime.");
            abnp abnpVarK2 = pkaVar.K();
            abnpVarK2.t();
            pka pkaVar3 = (pka) abnpVarK2.b;
            pkaVar3.b &= -33;
            pkaVar3.h = 0L;
            pkaVar = (pka) abnpVarK2.q();
        }
        if ((pkaVar.b & 64) != 0 && pkaVar.i == -1) {
            ((ynz) ((ynz) a.e()).ai((char) 9563)).u("Clearing default nextUpdateTime.");
            abnp abnpVarK3 = pkaVar.K();
            abnpVarK3.t();
            pka pkaVar4 = (pka) abnpVarK3.b;
            pkaVar4.b &= -65;
            pkaVar4.i = 0L;
            pkaVar = (pka) abnpVarK3.q();
        }
        if ((pkaVar.b & 8) != 0 && pkaVar.f == -1) {
            ((ynz) ((ynz) a.e()).ai((char) 9562)).u("Clearing default pertileEpoch.");
            abnp abnpVarK4 = pkaVar.K();
            abnpVarK4.t();
            pka pkaVar5 = (pka) abnpVarK4.b;
            pkaVar5.b &= -9;
            pkaVar5.f = 0;
            pkaVar = (pka) abnpVarK4.q();
        }
        if ((pkaVar.b & 16) != 0 && pkaVar.g == -1) {
            ((ynz) ((ynz) a.e()).ai((char) 9561)).u("Clearing default serverPertileEpoch.");
            abnp abnpVarK5 = pkaVar.K();
            abnpVarK5.t();
            pka pkaVar6 = (pka) abnpVarK5.b;
            pkaVar6.b &= -17;
            pkaVar6.g = 0;
            pkaVar = (pka) abnpVarK5.q();
        }
        if ((pkaVar.b & 256) != 0 && pkaVar.k == 0) {
            ((ynz) ((ynz) a.e()).ai((char) 9560)).u("Clearing default paintMajorEpoch.");
            abnp abnpVarK6 = pkaVar.K();
            abnpVarK6.t();
            pka pkaVar7 = (pka) abnpVarK6.b;
            pkaVar7.b &= -257;
            pkaVar7.k = 0;
            pkaVar = (pka) abnpVarK6.q();
        }
        if ((pkaVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 && pkaVar.l.equals("")) {
            ((ynz) ((ynz) a.e()).ai((char) 9559)).u("Clearing default paintVersionId.");
            abnp abnpVarK7 = pkaVar.K();
            abnpVarK7.t();
            pka pkaVar8 = (pka) abnpVarK7.b;
            pkaVar8.b &= -513;
            pkaVar8.l = pka.a.l;
            pkaVar = (pka) abnpVarK7.q();
        }
        if ((pkaVar.b & 2) == 0 || pkaVar.d != -1) {
            return pkaVar;
        }
        ((ynz) ((ynz) a.e()).ai((char) 9558)).u("Clearing default dataVersion.");
        abnp abnpVarK8 = pkaVar.K();
        abnpVarK8.t();
        pka pkaVar9 = (pka) abnpVarK8.b;
        pkaVar9.b &= -3;
        pkaVar9.d = 0;
        return (pka) abnpVarK8.q();
    }

    @Override // defpackage.uol
    public final void a(pka pkaVar, byte[] bArr, tmb tmbVar) throws Throwable {
        if (pkaVar.o) {
            ((ynz) a.a(uys.a).ai((char) 9576)).u("Attempting to insert an offroad tile into the SqliteDiskTileCache should not happen.");
            return;
        }
        abnp abnpVarK = pkaVar.K();
        long epochMilli = tmbVar.f().toEpochMilli();
        abnpVarK.t();
        pka pkaVar2 = (pka) abnpVarK.b;
        pkaVar2.b |= 1024;
        pkaVar2.m = epochMilli;
        pka pkaVarL = (pka) abnpVarK.q();
        try {
            pkaVarL = l(pkaVarL, tmbVar);
            uoz uozVar = this.e;
            try {
                uozVar.c.insertOrUpdateTile(pkaVarL, bArr);
                uozVar.j();
            } catch (uox e) {
                uozVar.i(e);
                throw e;
            }
        } catch (IOException e2) {
            ynz ynzVar = (ynz) ((ynz) ((ynz) a.g()).p(e2)).ai(9575);
            pjy pjyVar = pkaVarL.c;
            if (pjyVar == null) {
                pjyVar = pjy.a;
            }
            abls ablsVar = pjyVar.f;
            if (ablsVar == null) {
                ablsVar = abls.a;
            }
            ynzVar.M("Tile insert failed: coords= %s , tileType= %s :", ablsVar, this.b.name());
        }
    }

    @Override // defpackage.uol
    public final boolean c() {
        return true;
    }

    @Override // defpackage.uol
    public final boolean d() {
        return true;
    }

    @Override // defpackage.uol
    public final byte[] e(ukp ukpVar) {
        pjz pjzVarC;
        try {
            pjzVarC = this.e.c(uqw.m(this.c, this.d, ukpVar, this.i.p(), this.h.h().toLanguageTag()));
        } catch (IOException e) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9572)).M("getTileData failed: coords= %s , paintRequestTemplateTileType= %s :", ukpVar, this.b.name());
            pjzVarC = null;
        }
        if (pjzVarC != null) {
            pka pkaVar = pjzVarC.b;
            if (pkaVar == null) {
                pkaVar = pka.a;
            }
            if (!m(ukpVar, pkaVar)) {
                return pjzVarC.c.D();
            }
        }
        return null;
    }

    @Override // defpackage.uoo
    public final uko f(ukp ukpVar) {
        pjz pjzVarC;
        pjy pjyVarM = uqw.m(this.c, this.d, ukpVar, this.i.p(), Locale.getDefault().toLanguageTag());
        try {
            pjzVarC = this.e.c(pjyVarM);
        } catch (IOException e) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9571)).M("getTile failed: coords= %s , paintRequestTemplateTileType= %s :", ukpVar, this.b.name());
            pjzVarC = null;
        }
        if (pjzVarC != null) {
            pka pkaVar = pjzVarC.b;
            if (pkaVar == null) {
                pkaVar = pka.a;
            }
            if (m(ukpVar, pkaVar)) {
                pjzVarC = null;
            }
        }
        if (pjzVarC == null) {
            return null;
        }
        pka pkaVar2 = pjzVarC.b;
        if (pkaVar2 == null) {
            pkaVar2 = pka.a;
        }
        if (pjzVarC.c.d() == 0) {
            return new uit(k(pkaVar2, this.g), this.b, ukpVar, toz.c);
        }
        byte[] bArrD = pjzVarC.c.D();
        pka pkaVarK = k(pkaVar2, this.g);
        uom uomVar = this.j;
        abgl abglVar = this.b;
        uku ukuVarA = uomVar.a(pkaVarK, abglVar, ukpVar, bArrD, true, toz.c);
        ukt uktVar = ukuVarA.a;
        if (uktVar == ukt.d || uktVar == ukt.a) {
            ((ynz) ((ynz) a.h()).ai(9568)).R("getTile failed to unpack tile: coords= %s , paintRequestTemplateTileType= %s : %s", ukpVar, abglVar.name(), uktVar);
            try {
                this.e.f(pjyVarM);
            } catch (IOException e2) {
                ((ynz) ((ynz) ((ynz) a.g()).p(e2)).ai(9570)).M("Failed to delete corrupt tile: coords= %s , paintRequestTemplateTileType= %s :", ukpVar, this.b.name());
            }
        }
        erb erbVar = this.k;
        abgl abglVar2 = this.b;
        int i = abglVar2.am;
        tss.D(erbVar, ukuVarA);
        ukt uktVar2 = ukuVarA.a;
        ((ynz) a.a(uktVar2 == ukt.h ? Level.FINE : Level.WARNING).ai(9569)).R("Sqlite disk unpack result for tile type %s and coords %s - %s", abglVar2.name(), ukpVar, uktVar2);
        return (uko) ukuVarA.b.e();
    }

    @Override // defpackage.uoo
    public final void g(ukp ukpVar, uko ukoVar) {
        throw null;
    }

    @Override // defpackage.uyl
    public final /* synthetic */ void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.uoo
    public final boolean h(ukp ukpVar) throws uox {
        try {
            uoz uozVar = this.e;
            try {
                return uozVar.c.hasTile(uqw.m(this.c, this.d, ukpVar, this.i.p(), Locale.getDefault().toLanguageTag()));
            } catch (uox e) {
                uozVar.i(e);
                throw e;
            }
        } catch (IOException e2) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e2)).ai(9574)).M("Failed to query tile: coords= %s , paintRequestTemplateTileType= %s :", ukpVar, this.b.name());
            return false;
        }
    }

    @Override // defpackage.uoo
    public final boolean i(uko ukoVar) {
        throw null;
    }

    @Override // defpackage.uoo
    public final void j() {
        throw null;
    }

    public final boolean m(ukp ukpVar, pka pkaVar) {
        long epochMilli = this.g.f().toEpochMilli();
        long j = pkaVar.m;
        if (j < epochMilli || (pkaVar.b & 32) == 0 || j - epochMilli <= pkaVar.h - j) {
            return false;
        }
        ynz ynzVar = (ynz) ((ynz) a.g()).ai(9566);
        abgl abglVar = this.b;
        ynzVar.M("Tile expiration is not valid: coords= %s , paintRequestTemplateTileType= %s", ukpVar, abglVar.name());
        try {
            this.e.f(uqw.m(this.c, this.d, ukpVar, this.i.p(), Locale.getDefault().toLanguageTag()));
            int i = abglVar.am;
            return true;
        } catch (IOException e) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9567)).M("Failed to delete tile with invalid timestamp: coords= %s , paintRequestTemplateTileType= %s :", ukpVar, this.b.name());
            return true;
        }
    }
}
