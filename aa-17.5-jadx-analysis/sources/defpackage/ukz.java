package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class ukz {
    private static final yob c = yob.c("com/google/android/libraries/geo/mapcore/internal/model/ZoomTableManager");
    public final List a = new ArrayList();
    public boolean b = false;
    private yfy d;
    private yfy e;
    private final tsn f;

    public ukz(tsn tsnVar) {
        yfy yfyVar = ylx.a;
        this.d = yfyVar;
        this.e = yfyVar;
        this.f = tsnVar;
    }

    private final synchronized void d(yfy yfyVar, yfy yfyVar2) {
        this.d = yfyVar;
        this.e = yfyVar2;
        ((ynz) ((ynz) c.f()).ai((char) 9408)).u("Zoom tables loaded");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized uky a(too tooVar, abgl abglVar) {
        yfq yfqVar = (yfq) this.e.get(abglVar);
        Object obj = null;
        if (yfqVar != null) {
            int i = 0;
            loop0: while (true) {
                if (i >= yfqVar.size()) {
                    break;
                }
                rjg rjgVar = (rjg) yfqVar.get(i);
                int i2 = 0;
                while (true) {
                    Object obj2 = rjgVar.b;
                    if (i2 < ((ArrayList) obj2).size()) {
                        if (((ukp) ((ArrayList) obj2).get(i2)).e().f(tooVar)) {
                            obj = rjgVar.a;
                            break loop0;
                        }
                        i2++;
                    }
                }
                i++;
            }
        }
        if (obj == null) {
            obj = (uky) this.d.get(abglVar);
        }
        if (obj == null) {
            return uky.b;
        }
        return (uky) obj;
    }

    public final void b() {
        yfy yfyVarF;
        vaq.d();
        synchronized (this) {
            abgn abgnVar = this.f.a().c;
            if (abgnVar == null) {
                abgnVar = abgn.a;
            }
            aboh<abgk> abohVar = abgnVar.c;
            int i = pyz.a;
            HashMap map = new HashMap(abohVar.size(), 1.0f);
            int i2 = 0;
            for (abgk abgkVar : abohVar) {
                if (abgkVar.f.size() > 0) {
                    i2++;
                    int[] iArr = new int[abgkVar.f.size()];
                    for (int i3 = 0; i3 < abgkVar.f.size(); i3++) {
                        iArr[i3] = abgkVar.f.e(i3);
                    }
                    uky ukyVar = new uky(iArr);
                    abgl abglVarB = abgl.b(abgkVar.c);
                    if (abglVarB == null) {
                        abglVarB = abgl.UNKNOWN;
                    }
                    if (abglVarB != abgl.UNKNOWN) {
                        if (map.containsKey(abglVarB)) {
                            ((ynz) ((ynz) c.g()).ai((char) 9407)).y("Multiple zoom tables exist for type %s", abglVarB.name());
                        } else {
                            map.put(abglVarB, ukyVar);
                        }
                    }
                } else {
                    int i4 = abgkVar.c;
                    abgl abglVarB2 = abgl.b(i4);
                    if (abglVarB2 == null) {
                        abglVarB2 = abgl.UNKNOWN;
                    }
                    if (abglVarB2 != abgl.GMM_LABELS_ONLY) {
                        abgl abglVarB3 = abgl.b(i4);
                        if (abglVarB3 == null) {
                            abglVarB3 = abgl.UNKNOWN;
                        }
                        if (abglVarB3 != abgl.GMM_ROAD_GRAPH) {
                            abgl abglVarB4 = abgl.b(i4);
                            if (abglVarB4 == null) {
                                abglVarB4 = abgl.UNKNOWN;
                            }
                            if (abglVarB4 != abgl.GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS_PER_TILE) {
                                ynz ynzVar = (ynz) ((ynz) c.h()).ai(9406);
                                abgl abglVarB5 = abgl.b(abgkVar.c);
                                if (abglVarB5 == null) {
                                    abglVarB5 = abgl.UNKNOWN;
                                }
                                ynzVar.y("No zoom table mapping defined for paint template type %s", abglVarB5.name());
                            }
                        }
                    }
                }
            }
            ((ynz) ((ynz) c.f()).ai(9405)).w("Found %d zoom mappings", i2);
            if (i2 == 0) {
                yfyVarF = ylx.a;
            } else {
                map.put(abgl.GMM_API_TILE_OVERLAY, uky.a);
                yfyVarF = yrm.F(map);
            }
            HashMap map2 = new HashMap(abohVar.size(), 1.0f);
            for (abgk abgkVar2 : abohVar) {
                if (abgkVar2.f.size() > 0) {
                    abgl abglVarB6 = abgl.b(abgkVar2.c);
                    if (abglVarB6 == null) {
                        abglVarB6 = abgl.UNKNOWN;
                    }
                    if (abglVarB6 != abgl.UNKNOWN && !map2.containsKey(abglVarB6)) {
                        yfl yflVar = new yfl(4);
                        for (abhc abhcVar : abgkVar2.g) {
                            int[] iArr2 = new int[abhcVar.b.size()];
                            for (int i5 = 0; i5 < abhcVar.b.size(); i5++) {
                                iArr2[i5] = abhcVar.b.e(i5);
                            }
                            yflVar.i(new rjg(new uky(iArr2), (List) abhcVar.c));
                        }
                        map2.put(abglVarB6, yflVar.g());
                    }
                }
            }
            d(yfyVarF, yrm.F(map2));
        }
        List list = this.a;
        synchronized (list) {
            this.b = true;
            while (list.size() > 0) {
                ((ykd) list.get(0)).q();
                list.remove(0);
            }
        }
    }

    public final synchronized boolean c() {
        return !this.d.isEmpty();
    }
}
