package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class nkl {
    public static final yph a = yph.c("GH.FanDirectionControl");

    public static final Set a(bym bymVar) {
        return (Set) bymVar.a();
    }

    public static final void b(boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1886293641);
        if (i3 == 0) {
            i2 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cmw cmwVarB = dao.b(e(not.a, z), buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ngv(11);
                bvvVar.ad(objS);
            }
            c(cmwVarB, false, (afdr) objS, buxVarC, 440);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nkz(z, i, 1);
        }
    }

    public static final void c(cmw cmwVar, boolean z, afdr afdrVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(406985145);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bcm bcmVar = czz.au(buxVarC).b;
            ksy ksyVar = nly.a;
            ksy ksyVar2 = nly.a;
            ksy ksyVar3 = ksy.a;
            khc.l(cmwVar, afdrVar, null, ksyVar2, z, bcmVar, null, null, null, buxVarC, (i2 & 14) | 8 | ((i2 >> 3) & 112) | ((i2 << 9) & 57344), 0, 4004);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(cmwVar, z, afdrVar, i, 9, null);
        }
    }

    public static final void d(kjk kjkVar, bux buxVar, int i) {
        int i2;
        bxf bxfVarJ;
        kda kdaVar;
        kjkVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-812207429);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS);
            }
            kjz kjzVar = kjkVar.a;
            aitx aitxVar = (aitx) objS;
            boolean zC = buxVarC.C(kjzVar);
            Object objS2 = bvvVar.S();
            int i4 = 18;
            if (zC || objS2 == obj) {
                npc npcVarA = npc.a.a();
                kll kllVar = kjzVar.a.b;
                objS2 = (nov) npcVarA.a(new npb("fanDirectionControl", kllVar), new njb(kllVar, i4));
                bvvVar.ad(objS2);
            }
            nov novVar = (nov) objS2;
            boolean zC2 = buxVarC.C(kjzVar);
            Object objS3 = bvvVar.S();
            if (zC2 || objS3 == obj) {
                int i5 = ((kln) kjzVar.a.b).a;
                objS3 = Boolean.valueOf(jup.f(i5) ? true : !jup.e(i5, 1638) ? false : nsr.c().b().J());
                bvvVar.ad(objS3);
            }
            Boolean bool = (Boolean) objS3;
            boolean zBooleanValue = bool.booleanValue();
            if (novVar == null) {
                buxVarC.v(1374887170);
                ((ype) a.h()).y("FanDirectionControl: No fanDirectionProperty found for %s", kjzVar.a.b);
                b(zBooleanValue, buxVarC, 0);
                bvvVar.Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ == null) {
                    return;
                } else {
                    kdaVar = new kda(kjkVar, i, 17);
                }
            } else {
                buxVarC.v(1375076487);
                bvvVar.Y(false);
                afco afcoVar = tby.a;
                not notVar = (not) kkg.b(roc.ao(bxc.f(tby.v(novVar.a(), new nji(15)), kke.a, buxVarC)));
                if (notVar == null) {
                    notVar = not.a;
                }
                not notVar2 = notVar;
                bym bymVarF = bxc.f(tby.v(novVar.a, new nji(16)), afbg.a, buxVarC);
                boolean zC3 = buxVarC.C(a(bymVarF));
                Object objS4 = bvvVar.S();
                if (zC3 || objS4 == obj) {
                    List list = not.i;
                    ArrayList arrayList = new ArrayList();
                    afao afaoVar = new afao((afar) list);
                    while (afaoVar.hasNext()) {
                        Object next = afaoVar.next();
                        afao afaoVar2 = afaoVar;
                        if (((not) next) != not.a) {
                            arrayList.add(next);
                        }
                        afaoVar = afaoVar2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        Iterator it2 = it;
                        if (a(bymVarF).contains((not) next2)) {
                            arrayList2.add(next2);
                        }
                        it = it2;
                    }
                    a.l().y("Filtered Available Directions: %s", arrayList2);
                    bvvVar.ad(arrayList2);
                    objS4 = arrayList2;
                }
                List list2 = (List) objS4;
                if (list2.isEmpty()) {
                    buxVarC.v(1375892872);
                    ((ype) a.h()).y("FanDirectionControl: No available directions for %s", kjzVar.a.b);
                    b(zBooleanValue, buxVarC, 0);
                    bvvVar.Y(false);
                    bxfVarJ = buxVarC.J();
                    if (bxfVarJ == null) {
                        return;
                    } else {
                        kdaVar = new kda(kjkVar, i, 18);
                    }
                } else {
                    buxVarC.v(1376076423);
                    bvvVar.Y(false);
                    Set setA = a(bymVarF);
                    boolean zA = buxVarC.A(notVar2.ordinal()) | buxVarC.E(list2) | buxVarC.C(bymVarF);
                    Object objS5 = bvvVar.S();
                    if (zA || objS5 == obj) {
                        gqj gqjVar = new gqj(notVar2, list2, bymVarF, (afck) null, 4);
                        bvvVar.ad(gqjVar);
                        objS5 = gqjVar;
                    }
                    bvq.f(notVar2, setA, (afeg) objS5, buxVarC);
                    Iterator it3 = list2.iterator();
                    int i6 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i6 = -1;
                            break;
                        } else if (((not) it3.next()) == notVar2) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    int i7 = i6;
                    not notVar3 = (not) woy.bI(list2, i7);
                    if (notVar3 == null) {
                        notVar3 = not.a;
                    }
                    boolean zA2 = buxVarC.A(notVar3.ordinal()) | buxVarC.A(i7);
                    Object objS6 = bvvVar.S();
                    if (zA2 || objS6 == obj) {
                        objS6 = new nkj(notVar3, i7, (afck) null, 0);
                        bvvVar.ad(objS6);
                    }
                    bvq.g(notVar3, (afeg) objS6, buxVarC);
                    boolean zD = buxVarC.D(zBooleanValue);
                    Object objS7 = bvvVar.S();
                    if (zD || objS7 == obj) {
                        objS7 = new nkk(zBooleanValue, null);
                        bvvVar.ad(objS7);
                    }
                    bvq.g(bool, (afeg) objS7, buxVarC);
                    cmw cmwVarB = dao.b(e(notVar3, zBooleanValue), buxVarC, 0);
                    boolean z = notVar3 != not.a;
                    boolean zA3 = buxVarC.A(i7) | buxVarC.E(list2) | buxVarC.E(aitxVar) | buxVarC.E(novVar);
                    Object objS8 = bvvVar.S();
                    if (zA3 || objS8 == obj) {
                        nnn nnnVar = new nnn(i7, list2, aitxVar, novVar, 1);
                        bvvVar.ad(nnnVar);
                        objS8 = nnnVar;
                    }
                    c(cmwVarB, z, (afdr) objS8, buxVarC, 8);
                }
            }
            bxfVarJ.c = kdaVar;
        }
        buxVarC.s();
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            kdaVar = new kda(kjkVar, i, 19);
            bxfVarJ.c = kdaVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int e(defpackage.not r2, boolean r3) {
        /*
            int r2 = r2.ordinal()
            r0 = 2131231626(0x7f08038a, float:1.8079338E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 2131231623(0x7f080387, float:1.8079332E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L86;
                case 2: goto L72;
                case 3: goto L6c;
                case 4: goto L58;
                case 5: goto L44;
                case 6: goto L30;
                case 7: goto L1b;
                default: goto L15;
            }
        L15:
            aezs r2 = new aezs
            r2.<init>()
            throw r2
        L1b:
            r2 = 2131231618(0x7f080382, float:1.8079322E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 2131231619(0x7f080383, float:1.8079324E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aezu r1 = new aezu
            r1.<init>(r2, r0)
            goto La0
        L30:
            r2 = 2131231615(0x7f08037f, float:1.8079316E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 2131231616(0x7f080380, float:1.8079318E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aezu r1 = new aezu
            r1.<init>(r2, r0)
            goto La0
        L44:
            r2 = 2131231617(0x7f080381, float:1.807932E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 2131231620(0x7f080384, float:1.8079326E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aezu r1 = new aezu
            r1.<init>(r2, r0)
            goto La0
        L58:
            r2 = 2131231614(0x7f08037e, float:1.8079314E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 2131231621(0x7f080385, float:1.8079328E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aezu r1 = new aezu
            r1.<init>(r2, r0)
            goto La0
        L6c:
            aezu r2 = new aezu
            r2.<init>(r1, r0)
            goto L9f
        L72:
            r2 = 2131231622(0x7f080386, float:1.807933E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 2131231624(0x7f080388, float:1.8079334E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aezu r1 = new aezu
            r1.<init>(r2, r0)
            goto La0
        L86:
            r2 = 2131231625(0x7f080389, float:1.8079336E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 2131231627(0x7f08038b, float:1.807934E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aezu r1 = new aezu
            r1.<init>(r2, r0)
            goto La0
        L9a:
            aezu r2 = new aezu
            r2.<init>(r1, r0)
        L9f:
            r1 = r2
        La0:
            java.lang.Object r2 = r1.a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r1.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r3 == 0) goto Lb3
            return r2
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkl.e(not, boolean):int");
    }
}
