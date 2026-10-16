package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class upc implements uok {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/diskcache/SqliteDiskStyleTableCache");
    public static final long b;
    public final uoz c;
    public final tmb d;
    private final achh e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = 3888000000L;
    }

    public upc(uoz uozVar, tmb tmbVar, achh achhVar) {
        this.c = uozVar;
        this.d = tmbVar;
        this.e = achhVar;
    }

    @Override // defpackage.uok
    public final ukh a(String str) throws IOException {
        abft abftVar;
        byte[] bArrD;
        long j;
        vaq.d();
        abnp abnpVarN = pjw.a.n();
        abnpVarN.t();
        pjw pjwVar = (pjw) abnpVarN.b;
        pjwVar.b |= 2;
        pjwVar.d = str;
        abnpVarN.t();
        pjw pjwVar2 = (pjw) abnpVarN.b;
        pjwVar2.c = 2;
        pjwVar2.b |= 1;
        pjw pjwVar3 = (pjw) abnpVarN.q();
        try {
            pjv pjvVarB = this.c.b(pjwVar3);
            if (pjvVarB != null) {
                pjx pjxVar = pjvVarB.b;
                if (pjxVar == null) {
                    pjxVar = pjx.a;
                }
                if (pjxVar.d.equals(CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE)) {
                    abftVar = abft.MULTIZOOM_STYLE_TABLE;
                } else {
                    pjx pjxVar2 = pjvVarB.b;
                    if (pjxVar2 == null) {
                        pjxVar2 = pjx.a;
                    }
                    if (pjxVar2.d.equals("2")) {
                        abftVar = abft.COMPACT_MULTIZOOM_STYLE_TABLE;
                    } else {
                        pjx pjxVar3 = pjvVarB.b;
                        if (pjxVar3 == null) {
                            pjxVar3 = pjx.a;
                        }
                        if (pjxVar3.d.equals("3")) {
                            abftVar = abft.COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING;
                        } else {
                            ynz ynzVar = (ynz) ((ynz) a.g()).ai(9545);
                            pjx pjxVar4 = pjvVarB.b;
                            if (pjxVar4 == null) {
                                pjxVar4 = pjx.a;
                            }
                            ynzVar.M("Unrecognized version %s loading style table %s", pjxVar4.d, str);
                            try {
                                this.c.e(pjwVar3);
                            } catch (uox e) {
                                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9546)).y("Failed to delete resource %s :", str);
                            }
                        }
                    }
                }
                try {
                    bArrD = pjvVarB.c.D();
                    pjx pjxVar5 = pjvVarB.b;
                    if (pjxVar5 == null) {
                        pjxVar5 = pjx.a;
                    }
                    j = pjxVar5.f;
                } catch (IOException e2) {
                    ((ynz) ((ynz) ((ynz) a.g()).p(e2)).ai(9549)).y("Failed to unpack style table table %s", str);
                }
                if (j != 0) {
                    return ukh.l(uxi.b(bArrD, bArrD.length, (int) j), abftVar, this.e);
                }
                ((ynz) ((ynz) a.g()).ai(9547)).u("Style table resource has zero uncompressed length; refusing to parse data");
                try {
                    this.c.e(pjwVar3);
                } catch (uox e3) {
                    ((ynz) ((ynz) ((ynz) a.g()).p(e3)).ai(9548)).y("Failed to delete resource %s :", str);
                }
                return null;
            }
            return null;
        } catch (IOException e4) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e4)).ai(9550)).y("Failed to get style table %s", str);
            return null;
        }
    }

    @Override // defpackage.uok
    public final rhj b(String str, boolean z) throws IOException {
        byte[] bArrD;
        long j;
        vaq.d();
        abnp abnpVarN = pjw.a.n();
        abnpVarN.t();
        pjw pjwVar = (pjw) abnpVarN.b;
        pjwVar.b |= 2;
        pjwVar.d = str;
        abnpVarN.t();
        pjw pjwVar2 = (pjw) abnpVarN.b;
        pjwVar2.c = 4;
        pjwVar2.b |= 1;
        pjw pjwVar3 = (pjw) abnpVarN.q();
        try {
            pjv pjvVarB = this.c.b(pjwVar3);
            if (pjvVarB != null) {
                try {
                    bArrD = pjvVarB.c.D();
                    pjx pjxVar = pjvVarB.b;
                    if (pjxVar == null) {
                        pjxVar = pjx.a;
                    }
                    j = pjxVar.f;
                } catch (IOException e) {
                    ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9540)).y("Failed to unpack common style data %s", str);
                }
                if (j != 0) {
                    return rhj.n(uxi.b(bArrD, bArrD.length, (int) j), z);
                }
                ((ynz) ((ynz) a.g()).ai(9538)).u("Common style data resource has zero uncompressed length; refusing to parse data");
                try {
                    this.c.e(pjwVar3);
                } catch (uox e2) {
                    ((ynz) ((ynz) ((ynz) a.g()).p(e2)).ai(9539)).y("Failed to delete resource %s :", str);
                }
            }
            return null;
        } catch (IOException e3) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e3)).ai(9541)).y("Failed to get common style data %s", str);
            return null;
        }
    }
}
