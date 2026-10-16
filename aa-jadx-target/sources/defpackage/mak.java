package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mak implements defpackage.lhn {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.yqm e = defpackage.yqm.c("GH.GhNavDataManager");
    private static final defpackage.yhx f = defpackage.yhx.r(32, 34, 33, 35);
    public final defpackage.eqs a = new defpackage.eqs(null);
    public final defpackage.eqs b = new defpackage.eqs(null);
    public final defpackage.eqs c = new defpackage.eqs(0);
    private final defpackage.eqs g;
    private final java.util.Map h;
    private final java.util.Map i;
    private android.content.ComponentName j;
    private long k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final defpackage.us p;
    private final defpackage.us q;
    private final akan r;

    public mak(akan akanVar) {
        int i = defpackage.ygw.d;
        this.g = new defpackage.eqs(defpackage.ymx.a);
        this.h = new java.util.HashMap();
        this.i = new java.util.HashMap();
        this.j = new android.content.ComponentName("", "");
        this.q = new defpackage.us(null, null);
        this.p = new defpackage.us((char[]) null);
        this.k = -1L;
        this.l = -1L;
        this.r = akanVar;
    }

    public static defpackage.mak e() {
        return (defpackage.mak) defpackage.mkp.a.b(defpackage.mak.class, new defpackage.lqb(20));
    }

    public static boolean l(int i) {
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3 && i != 4 && i != 5) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unknown navigation status: "));
            }
        }
        return true;
    }

    private static defpackage.kit m() {
        defpackage.kit kitVarB = defpackage.kit.b();
        if (!kitVarB.q()) {
            ((defpackage.yqj) ((defpackage.yqj) e.g()).ai((char) 4572)).u("Car client is not connected");
            return null;
        }
        if (kitVarB.r()) {
            return kitVarB;
        }
        ((defpackage.yqj) ((defpackage.yqj) e.g()).ai((char) 4571)).u("Car client is not connected to car");
        return null;
    }

    private final com.google.android.apps.auto.sdk.nav.state.NavigationSummary n() {
        return (com.google.android.apps.auto.sdk.nav.state.NavigationSummary) this.q.a;
    }

    private final void o() {
        this.q.a = new com.google.android.apps.auto.sdk.nav.state.NavigationSummary();
        this.p.a = new com.google.android.apps.auto.sdk.nav.state.TurnEvent();
        this.k = -1L;
        this.l = -1L;
        this.a.j(null);
        this.b.j(null);
        this.c.j(0);
        int i = defpackage.ygw.d;
        this.g.j(defpackage.ymx.a);
    }

    private final synchronized void p(android.content.ComponentName componentName, boolean z) {
        if (componentName.equals(this.j)) {
            if (z) {
                ((defpackage.yqj) e.l().ai((char) 4613)).y("Component already set as %s", componentName.flattenToString());
                return;
            }
            return;
        }
        ((defpackage.yqj) e.l().ai((char) 4612)).y("Updating component: %s", componentName.flattenToString());
        this.j = componentName;
        o();
    }

    private static boolean q(int i, int i2) {
        return i == i2 && r(i);
    }

    private static boolean r(int i) {
        return f.contains(java.lang.Integer.valueOf(i));
    }

    private final boolean s(int i, int i2) {
        int i3;
        java.lang.ThreadLocal threadLocal = mao.a;
        switch (i) {
            case defpackage.abnt.b /* 0 */:
            case 1:
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case 29:
            case 30:
            case 31:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            default:
                i3 = 0;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 32:
            case 33:
            case 41:
            case 43:
            case 44:
            case 47:
            case 49:
                i3 = 1;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 28:
            case 34:
            case 35:
            case 42:
            case 45:
            case 46:
            case 48:
            case 50:
                i3 = 2;
                break;
        }
        if (i3 == f().c || i2 != 0) {
            return false;
        }
        this.p.q(i3);
        return true;
    }

    private final boolean t(com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent) {
        boolean z;
        int i = turnEvent.c;
        if (i != f().c) {
            this.p.q(i);
            int i2 = turnEvent.c;
            z = true;
        } else {
            z = false;
        }
        if (!turnEvent.b.toString().contentEquals(f().b) && !android.text.TextUtils.isEmpty(turnEvent.b)) {
            this.p.n(turnEvent.b);
            java.lang.CharSequence charSequence = turnEvent.b;
            z = true;
        }
        byte[] bArr = turnEvent.f;
        if (j$.util.Objects.deepEquals(bArr, f().f) || bArr == null) {
            return z;
        }
        this.p.p(bArr);
        return true;
    }

    private static defpackage.rpb u() {
        defpackage.kit kitVarM = m();
        if (kitVarM != null) {
            try {
                defpackage.mkp.a.f();
                return defpackage.ooa.e(kitVarM.e());
            } catch (defpackage.qst e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e2)).ai((char) 4573)).u("Error while getting CarNavigationStatusManager");
            } catch (defpackage.qsu unused) {
            }
        }
        return null;
    }

    private static defpackage.rpb v() {
        defpackage.kit kitVarM = m();
        if (kitVarM != null) {
            try {
                defpackage.mkp.a.f();
                defpackage.rei reiVarD = ((defpackage.qtv) kitVarM.e()).d();
                return (defpackage.rpb) reiVarD.f.a(new defpackage.rdg(reiVarD, 6));
            } catch (defpackage.qst e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e2)).ai((char) 4574)).u("Error while getting CarNavigationMetadataManager");
            } catch (defpackage.qsu unused) {
            }
        }
        return null;
    }

    private static final boolean w(long j) {
        if (defpackage.acyc.aw()) {
            return j == -1 || android.os.SystemClock.elapsedRealtime() - j >= ((long) ((int) defpackage.acyc.p()));
        }
        return false;
    }

    public final synchronized defpackage.eqp a(android.content.ComponentName componentName) {
        java.util.Map map;
        defpackage.eqs eqsVar = new defpackage.eqs(0);
        map = this.h;
        j$.util.Map.-EL.putIfAbsent(map, componentName, eqsVar);
        return (defpackage.eqp) map.get(componentName);
    }

    public final defpackage.eqp b() {
        return defpackage.ebo.f(this.c, new defpackage.ltk(19));
    }

    @Override // defpackage.lhn
    public final void d() {
        synchronized (this) {
            o();
            j$.util.Map.-EL.forEach(this.h, new defpackage.maj(0));
            this.i.clear();
            this.m = false;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        boolean z;
        synchronized (this) {
            defpackage.ysr.bk(!this.m, "start() was called when the instance was already started");
            defpackage.kit kitVarM = m();
            if (kitVarM == null) {
                z = false;
            } else {
                defpackage.mkp.a.g();
                z = defpackage.oml.z(kitVarM.e(), defpackage.rbf.u);
            }
            this.n = z;
            this.m = true;
        }
    }

    final synchronized com.google.android.apps.auto.sdk.nav.state.TurnEvent f() {
        return (com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.p.a;
    }

    public final synchronized void g(com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo adasRouteInfo) {
        defpackage.rpb rpbVarV = v();
        if (rpbVarV == null) {
            ((defpackage.yqj) ((defpackage.yqj) e.h()).ai((char) 4611)).u("Can't send ADAS route info, metadataManager is null");
            return;
        }
        try {
            java.lang.ThreadLocal threadLocal = mao.a;
            com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path path = adasRouteInfo.a;
            path.getClass();
            com.google.android.gms.car.navigation.AdasRouteInfo.Path pathA = mao.a(path);
            com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip trip = adasRouteInfo.b;
            trip.getClass();
            java.lang.String str = trip.a;
            str.getClass();
            int i = trip.b;
            com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path path2 = trip.c;
            path2.getClass();
            try {
                rpbVarV.a.g(new com.google.android.gms.car.navigation.AdasRouteInfo(pathA, new com.google.android.gms.car.navigation.AdasRouteInfo.Trip(str, i, mao.a(path2))));
            } catch (android.os.RemoteException e2) {
                defpackage.oml.I(e2);
            } catch (java.lang.IllegalStateException e3) {
                defpackage.oml.G(e3);
            }
        } catch (defpackage.qst e4) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e4)).ai((char) 4610)).u("Unable to send ADAS route info.");
        }
    }

    public final synchronized void h(android.content.ComponentName componentName) {
        p(componentName, true);
    }

    final synchronized void i(android.content.ComponentName componentName, com.google.android.apps.auto.sdk.nav.state.NavigationSummary navigationSummary) {
        int i = navigationSummary.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.util.Map map = this.i;
        map.put(componentName, numValueOf);
        if (!l(i) && j$.util.Collection.-EL.stream(map.entrySet()).anyMatch(new defpackage.lpa(componentName, 12))) {
            ((defpackage.yqj) e.l().ai((char) 4618)).y("Ignoring inactive navigation summary from %s because another component is navigating", componentName.flattenToShortString());
            return;
        }
        p(componentName, false);
        int i2 = navigationSummary.a;
        if (i2 != 0 && i2 != n().a) {
            ((defpackage.yqj) e.l().ai(4576)).B("Navigation status changed from %d to %d, will update the navigation summary", n().a, navigationSummary.a);
            this.q.r(navigationSummary.a);
            int i3 = n().a;
            if (defpackage.acqn.j() && i3 == 1) {
                defpackage.lby.n.e(defpackage.mkp.a.c);
                i3 = 1;
            }
            if (this.n) {
                defpackage.eqs eqsVar = this.c;
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i3);
                eqsVar.j(numValueOf2);
                java.util.Map map2 = this.h;
                if (j$.util.Map.-EL.putIfAbsent(map2, componentName, new defpackage.eqs(numValueOf2)) != null) {
                    ((defpackage.eqs) map2.get(componentName)).j(numValueOf2);
                }
            }
            defpackage.rpb rpbVarU = u();
            if (rpbVarU != null) {
                boolean z = this.n;
                try {
                    if (i3 == 0) {
                        rpbVarU.b(0);
                        return;
                    }
                    if (i3 == 1) {
                        rpbVarU.b(1);
                    } else if (i3 == 2) {
                        rpbVarU.b(2);
                    } else if (i3 == 5 && z) {
                        rpbVarU.b(3);
                    }
                } catch (defpackage.qst e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e2)).ai((char) 4608)).u("Unable to send navigation status");
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0175  */
    /* JADX WARN: Code duplicated, block: B:101:0x0178  */
    /* JADX WARN: Code duplicated, block: B:102:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x017f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0180  */
    /* JADX WARN: Code duplicated, block: B:106:0x0183  */
    /* JADX WARN: Code duplicated, block: B:107:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:110:0x018b  */
    /* JADX WARN: Code duplicated, block: B:111:0x018e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0194  */
    /* JADX WARN: Code duplicated, block: B:115:0x0195  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:117:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x019e  */
    /* JADX WARN: Code duplicated, block: B:120:0x019f  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01af A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ed A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x01fc A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0207 A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006b A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[Catch: all -> 0x0881, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:503:0x079a A[Catch: all -> 0x0881, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:506:0x07a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:507:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:508:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:509:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:541:0x0842  */
    /* JADX WARN: Code duplicated, block: B:544:0x084c A[Catch: all -> 0x0881, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000e, B:25:0x006e, B:27:0x0077, B:29:0x0093, B:42:0x00c2, B:44:0x00cd, B:45:0x00d5, B:125:0x01a8, B:126:0x01ab, B:128:0x01af, B:131:0x01c0, B:141:0x01ed, B:143:0x01fc, B:145:0x0207, B:146:0x020c, B:148:0x0211, B:152:0x022c, B:153:0x0234, B:155:0x0238, B:159:0x024e, B:160:0x0256, B:162:0x025a, B:164:0x026c, B:167:0x0275, B:168:0x027d, B:170:0x0281, B:174:0x0297, B:175:0x029f, B:177:0x02a3, B:179:0x02ae, B:181:0x02b4, B:183:0x02ba, B:185:0x02be, B:187:0x02c6, B:189:0x02cc, B:260:0x03ff, B:264:0x040c, B:274:0x0443, B:276:0x044a, B:280:0x0455, B:283:0x045e, B:291:0x046f, B:293:0x0476, B:288:0x0467, B:290:0x046c, B:294:0x0483, B:296:0x048f, B:298:0x0495, B:300:0x049f, B:302:0x04a5, B:304:0x04af, B:305:0x04b5, B:307:0x04bf, B:309:0x04c5, B:310:0x04cd, B:313:0x04d9, B:314:0x04df, B:316:0x04e5, B:318:0x04eb, B:320:0x04f9, B:321:0x04ff, B:323:0x0503, B:325:0x050f, B:327:0x0519, B:329:0x0525, B:331:0x052b, B:333:0x052f, B:375:0x05c9, B:411:0x0643, B:415:0x064a, B:417:0x0651, B:421:0x065c, B:423:0x0664, B:431:0x0675, B:434:0x067d, B:428:0x066d, B:430:0x0672, B:410:0x063e, B:378:0x05d1, B:379:0x05da, B:381:0x05e0, B:383:0x05ea, B:385:0x05f5, B:386:0x05f8, B:388:0x05fc, B:390:0x0602, B:391:0x0604, B:393:0x0608, B:394:0x060b, B:396:0x0613, B:399:0x0618, B:407:0x0631, B:404:0x0623, B:405:0x062e, B:337:0x0539, B:339:0x053f, B:341:0x0545, B:366:0x05a8, B:368:0x05ae, B:374:0x05c4, B:371:0x05b6, B:372:0x05c1, B:345:0x054c, B:347:0x0557, B:348:0x055c, B:350:0x0562, B:352:0x0569, B:357:0x0575, B:359:0x0586, B:358:0x057e, B:360:0x0591, B:361:0x059c, B:362:0x059d, B:364:0x05a1, B:365:0x05a4, B:273:0x043e, B:267:0x0414, B:268:0x041d, B:270:0x0423, B:263:0x0407, B:193:0x02d6, B:195:0x02da, B:197:0x02e0, B:226:0x0347, B:228:0x034f, B:230:0x035a, B:234:0x0363, B:236:0x0369, B:237:0x0372, B:239:0x0378, B:243:0x0388, B:244:0x0391, B:246:0x0397, B:249:0x03a3, B:250:0x03b0, B:251:0x03c6, B:252:0x03c7, B:242:0x0384, B:253:0x03d7, B:255:0x03e1, B:257:0x03e7, B:259:0x03f1, B:201:0x02e9, B:209:0x0305, B:211:0x030b, B:217:0x0323, B:219:0x0329, B:225:0x0341, B:222:0x032e, B:223:0x033f, B:214:0x0310, B:215:0x0321, B:206:0x02f2, B:207:0x0303, B:135:0x01cd, B:137:0x01d9, B:139:0x01e3, B:31:0x0097, B:35:0x00a4, B:38:0x00ae, B:40:0x00b8, B:439:0x0690, B:441:0x0696, B:446:0x06a6, B:450:0x06ba, B:452:0x06c2, B:454:0x06c6, B:456:0x06d0, B:458:0x06da, B:459:0x06e6, B:462:0x06f7, B:463:0x0700, B:484:0x0732, B:488:0x0747, B:490:0x0751, B:501:0x0791, B:503:0x079a, B:504:0x079e, B:510:0x07ac, B:511:0x07ba, B:517:0x07d1, B:514:0x07c9, B:516:0x07ce, B:520:0x07d9, B:521:0x07e6, B:523:0x07f0, B:525:0x07f6, B:527:0x0800, B:529:0x080a, B:531:0x0810, B:532:0x0818, B:534:0x0822, B:536:0x0828, B:537:0x0830, B:540:0x083c, B:542:0x0843, B:544:0x084c, B:545:0x0850, B:546:0x0858, B:552:0x0867, B:549:0x085f, B:551:0x0864, B:556:0x0870, B:485:0x073e, B:487:0x0742, B:492:0x0757, B:494:0x0763, B:496:0x076d, B:498:0x0777, B:500:0x078c, B:447:0x06b2, B:8:0x001e, B:11:0x0023, B:13:0x0027, B:15:0x002b, B:16:0x0033, B:18:0x0046, B:20:0x004c, B:21:0x0054, B:23:0x0063, B:24:0x006b), top: B:566:0x000e, inners: #0, #5, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:66:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x014b  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x015b  */
    /* JADX WARN: Code duplicated, block: B:90:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0161  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0169  */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX WARN: Code duplicated, block: B:96:0x016d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0174  */
    final synchronized void j(android.content.ComponentName componentName, com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent) {
        long jElapsedRealtime;
        boolean z;
        defpackage.rpb rpbVarU;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        com.google.android.gms.car.navigation.Maneuver maneuver;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        boolean z5;
        com.google.android.gms.car.navigation.Distance distanceA;
        long j;
        com.google.android.gms.car.navigation.StepDistance stepDistance;
        java.util.ArrayList arrayList4;
        long j2;
        com.google.android.gms.car.navigation.Distance distanceA2;
        int i9;
        defpackage.us usVar;
        defpackage.us usVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        p(componentName, false);
        com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig carInstrumentClusterConfigF = defpackage.luq.a().f();
        boolean z6 = true;
        if (carInstrumentClusterConfigF == null) {
            z = false;
        } else {
            akan akanVar = this.r;
            if (turnEvent != null) {
                if (turnEvent.f == null) {
                    jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    if (jElapsedRealtime - akanVar.a < carInstrumentClusterConfigF.a) {
                        android.util.Log.w("NavigationStateManager", "Rate limiting turn event message");
                    } else {
                        akanVar.a = jElapsedRealtime;
                        z = true;
                    }
                } else if (carInstrumentClusterConfigF.e) {
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    byte[] bArr = turnEvent.f;
                    android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (options.outWidth == carInstrumentClusterConfigF.b && options.outHeight == carInstrumentClusterConfigF.c) {
                        jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - akanVar.a < carInstrumentClusterConfigF.a) {
                            android.util.Log.w("NavigationStateManager", "Rate limiting turn event message");
                        } else {
                            akanVar.a = jElapsedRealtime;
                            z = true;
                        }
                    } else {
                        android.util.Log.w("NavigationStateManager", "Dropping turn event since it contains an image with dimensions that do not match the head unit's configuration");
                    }
                } else {
                    android.util.Log.w("NavigationStateManager", "Dropping turn event since it contains an image but the HU does not support images.");
                }
            }
            z = false;
        }
        int i14 = 9;
        if (!this.n) {
            if (z && (rpbVarU = u()) != null) {
                int i15 = turnEvent.a;
                if (i15 == f().a || i15 == 0) {
                    z2 = false;
                } else {
                    defpackage.us usVar3 = this.p;
                    if (i15 == 13) {
                        usVar3.i(turnEvent.d, turnEvent.e);
                        int i16 = turnEvent.d;
                        int i17 = turnEvent.e;
                    } else {
                        usVar3.o(i15);
                        int i18 = turnEvent.a;
                    }
                    z2 = true;
                }
                if (f().a == 13 && turnEvent.a == 13 && ((i6 = turnEvent.d) != f().d || turnEvent.e != f().e)) {
                    this.p.i(i6, turnEvent.e);
                    int i19 = turnEvent.d;
                    int i20 = turnEvent.e;
                    z2 = true;
                }
                boolean zT = z2 | t(turnEvent);
                int i21 = turnEvent.k;
                if (i21 == f().k || i21 == 0) {
                    if (!q(i21, f().k) || ((i = turnEvent.d) == f().d && turnEvent.e == f().e)) {
                        if (zT | w(this.k)) {
                            com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEventF = f();
                            try {
                                i3 = turnEventF.c;
                                if (i3 != 1) {
                                    i4 = 1;
                                } else if (i3 != 2) {
                                    i4 = 3;
                                } else {
                                    i4 = 2;
                                }
                                try {
                                    rpbVarU.a.o(turnEventF.a, turnEventF.b.toString(), turnEventF.d, turnEventF.e, turnEventF.f, i4);
                                } catch (android.os.RemoteException e2) {
                                    defpackage.oml.I(e2);
                                } catch (java.lang.IllegalStateException e3) {
                                    defpackage.oml.G(e3);
                                }
                                this.k = android.os.SystemClock.elapsedRealtime();
                            } catch (defpackage.qst e4) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e4)).ai((char) 4605)).u("Unable to send navigation status");
                            }
                        }
                        if (turnEvent.g == f().g && turnEvent.m()) {
                            this.p.l(turnEvent.g);
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (turnEvent.i != f().i && turnEvent.l()) {
                            this.p.k(turnEvent.i);
                            z3 = true;
                        }
                        if (turnEvent.h != f().h && turnEvent.j()) {
                            this.p.j(turnEvent.h);
                            z3 = true;
                        }
                        i2 = turnEvent.j;
                        if (i2 != f().j || i2 == 0) {
                            z6 = z3;
                        } else {
                            this.p.m(i2);
                        }
                        if (w(this.l) | z6) {
                            com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEventF2 = f();
                            try {
                                try {
                                    rpbVarU.a.k(turnEventF2.g, turnEventF2.h, turnEventF2.i, turnEventF2.j);
                                } catch (android.os.RemoteException e5) {
                                    defpackage.oml.I(e5);
                                } catch (java.lang.IllegalStateException e6) {
                                    defpackage.oml.G(e6);
                                }
                                this.l = android.os.SystemClock.elapsedRealtime();
                                return;
                            } catch (defpackage.qst e7) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e7)).ai((char) 4604)).u("Unable to send navigation status.");
                                return;
                            }
                        }
                    } else {
                        this.p.i(i, turnEvent.e);
                        int i22 = turnEvent.d;
                        int i23 = turnEvent.e;
                        if (s(turnEvent.k, turnEvent.c)) {
                            int i24 = turnEvent.k;
                            int i25 = turnEvent.c;
                        }
                    }
                    throw th;
                }
                defpackage.us usVar4 = this.p;
                usVar4.f(i21);
                int i26 = turnEvent.k;
                java.lang.ThreadLocal threadLocal = mao.a;
                switch (i26) {
                    case defpackage.abnt.b /* 0 */:
                        i5 = 0;
                        break;
                    case 1:
                        i5 = 1;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        i5 = 2;
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    case 36:
                        i5 = 14;
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        i5 = 3;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        i5 = 4;
                        break;
                    case 9:
                    case 10:
                        i5 = 5;
                        break;
                    case 11:
                    case 12:
                        i5 = 6;
                        break;
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        i5 = 7;
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        i5 = 8;
                        break;
                    case 25:
                    case 26:
                        i5 = 9;
                        break;
                    case 27:
                    case 28:
                    case 29:
                        i5 = 10;
                        break;
                    case 30:
                    case 43:
                    case 45:
                        i5 = 11;
                        break;
                    case 31:
                    case 44:
                    case 46:
                        i5 = 12;
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        i5 = 13;
                        break;
                    case 37:
                    case 47:
                    case 48:
                        i5 = 16;
                        break;
                    case 38:
                    case 49:
                    case 50:
                        i5 = 17;
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        i5 = 19;
                        break;
                    default:
                        i5 = 0;
                        break;
                }
                if (i5 == 13) {
                    usVar4.i(turnEvent.d, turnEvent.e);
                    int i27 = turnEvent.d;
                    int i28 = turnEvent.e;
                } else if (turnEvent.a == 0) {
                    usVar4.o(i5);
                    int i29 = turnEvent.a;
                }
                if (s(turnEvent.k, turnEvent.c)) {
                    int i30 = turnEvent.k;
                    int i31 = turnEvent.c;
                }
                zT = true;
                if (zT | w(this.k)) {
                    com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEventF3 = f();
                    i3 = turnEventF3.c;
                    if (i3 != 1) {
                        i4 = 1;
                    } else if (i3 != 2) {
                        i4 = 3;
                    } else {
                        i4 = 2;
                    }
                    rpbVarU.a.o(turnEventF3.a, turnEventF3.b.toString(), turnEventF3.d, turnEventF3.e, turnEventF3.f, i4);
                    this.k = android.os.SystemClock.elapsedRealtime();
                }
                if (turnEvent.g == f().g) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (turnEvent.i != f().i) {
                    this.p.k(turnEvent.i);
                    z3 = true;
                }
                if (turnEvent.h != f().h) {
                    this.p.j(turnEvent.h);
                    z3 = true;
                }
                i2 = turnEvent.j;
                if (i2 != f().j) {
                    z6 = z3;
                } else {
                    z6 = z3;
                }
                if (w(this.l) | z6) {
                    com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEventF4 = f();
                    rpbVarU.a.k(turnEventF4.g, turnEventF4.h, turnEventF4.i, turnEventF4.j);
                    this.l = android.os.SystemClock.elapsedRealtime();
                    return;
                }
            }
        }
        this.o = false;
        defpackage.rpb rpbVarV = v();
        defpackage.ysr.aO(!this.o, "Navigation state must be updated before navigation current position", new java.lang.Object[0]);
        if (turnEvent.c == f().c || turnEvent.a == 0) {
            int i32 = turnEvent.a;
            if (i32 == f().a) {
                if (f().a == 13 || i32 != 13 || (turnEvent.d == f().d && turnEvent.e == f().e)) {
                    z4 = false;
                } else {
                    usVar2 = this.p;
                    usVar2.o(turnEvent.a);
                    if (turnEvent.k == 0) {
                        i10 = turnEvent.a;
                        i11 = turnEvent.d;
                        i12 = turnEvent.c;
                        java.lang.ThreadLocal threadLocal2 = mao.a;
                        switch (i10) {
                            case defpackage.abnt.b /* 0 */:
                                i13 = 0;
                                break;
                            case 1:
                                i13 = 1;
                                break;
                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                i13 = 2;
                                break;
                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                if (i12 == 1) {
                                    i13 = 5;
                                } else if (i12 != 2) {
                                    i13 = 0;
                                } else {
                                    i13 = 6;
                                }
                                break;
                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                if (i12 == 1) {
                                    i13 = 7;
                                } else if (i12 != 2) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                break;
                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                if (i12 == 1) {
                                    i13 = 9;
                                } else if (i12 != 2) {
                                    i13 = 0;
                                } else {
                                    i13 = 10;
                                }
                                break;
                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (i12 == 1) {
                                    i13 = 11;
                                } else if (i12 != 2) {
                                    i13 = 0;
                                } else {
                                    i13 = 12;
                                }
                                break;
                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                if (i12 == 1) {
                                    i13 = 15;
                                } else if (i12 != 2) {
                                    i13 = 0;
                                } else {
                                    i13 = 16;
                                }
                                break;
                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                if (i12 == 1) {
                                    i13 = 23;
                                } else if (i12 != 2) {
                                    i13 = 0;
                                } else {
                                    i13 = 24;
                                }
                                break;
                            case 9:
                                if (i12 == 1) {
                                    i13 = 25;
                                } else if (i12 != 2) {
                                    i13 = 0;
                                } else {
                                    i13 = 26;
                                }
                                break;
                            case 10:
                                if (i12 == 1) {
                                    i13 = 27;
                                } else if (i12 != 2) {
                                    i13 = 29;
                                } else {
                                    i13 = 28;
                                }
                                break;
                            case 11:
                                if (i12 == 1) {
                                    i13 = 43;
                                } else if (i12 != 2) {
                                    i13 = 30;
                                } else {
                                    i13 = 45;
                                }
                                break;
                            case 12:
                                if (i12 == 1) {
                                    i13 = 44;
                                } else if (i12 != 2) {
                                    i13 = 31;
                                } else {
                                    i13 = 46;
                                }
                                break;
                            case 13:
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        i13 = 0;
                                    } else if (i11 > 0) {
                                        i13 = 35;
                                    } else {
                                        i13 = 34;
                                    }
                                } else if (i11 > 0) {
                                    i13 = 33;
                                } else {
                                    i13 = 32;
                                }
                                break;
                            case 14:
                                i13 = 36;
                                break;
                            case 15:
                            case 18:
                            default:
                                i13 = 0;
                                break;
                            case 16:
                                if (i12 == 1) {
                                    i13 = 47;
                                } else if (i12 != 2) {
                                    i13 = 37;
                                } else {
                                    i13 = 48;
                                }
                                break;
                            case 17:
                                if (i12 == 1) {
                                    i13 = 49;
                                } else if (i12 != 2) {
                                    i13 = 38;
                                } else {
                                    i13 = 50;
                                }
                                break;
                            case 19:
                                if (i12 == 1) {
                                    i13 = 41;
                                } else if (i12 != 2) {
                                    i13 = 39;
                                } else {
                                    i13 = 42;
                                }
                                break;
                        }
                        usVar2.f(i13);
                    }
                    if (turnEvent.a == 13) {
                        usVar2.h(turnEvent.e);
                        usVar2.g(turnEvent.d);
                        int i33 = turnEvent.e;
                        int i34 = turnEvent.d;
                    }
                    z4 = true;
                }
            } else if (i32 == 0) {
                i32 = 0;
                if (f().a == 13) {
                }
                z4 = false;
            } else {
                usVar2 = this.p;
                usVar2.o(turnEvent.a);
                if (turnEvent.k == 0) {
                    i10 = turnEvent.a;
                    i11 = turnEvent.d;
                    i12 = turnEvent.c;
                    java.lang.ThreadLocal threadLocal3 = mao.a;
                    switch (i10) {
                        case defpackage.abnt.b /* 0 */:
                            i13 = 0;
                            break;
                        case 1:
                            i13 = 1;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            i13 = 2;
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            if (i12 == 1) {
                                i13 = 5;
                            } else if (i12 != 2) {
                                i13 = 0;
                            } else {
                                i13 = 6;
                            }
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            if (i12 == 1) {
                                i13 = 7;
                            } else if (i12 != 2) {
                                i13 = 0;
                            } else {
                                i13 = 8;
                            }
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            if (i12 == 1) {
                                i13 = 9;
                            } else if (i12 != 2) {
                                i13 = 0;
                            } else {
                                i13 = 10;
                            }
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (i12 == 1) {
                                i13 = 11;
                            } else if (i12 != 2) {
                                i13 = 0;
                            } else {
                                i13 = 12;
                            }
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (i12 == 1) {
                                i13 = 15;
                            } else if (i12 != 2) {
                                i13 = 0;
                            } else {
                                i13 = 16;
                            }
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            if (i12 == 1) {
                                i13 = 23;
                            } else if (i12 != 2) {
                                i13 = 0;
                            } else {
                                i13 = 24;
                            }
                            break;
                        case 9:
                            if (i12 == 1) {
                                i13 = 25;
                            } else if (i12 != 2) {
                                i13 = 0;
                            } else {
                                i13 = 26;
                            }
                            break;
                        case 10:
                            if (i12 == 1) {
                                i13 = 27;
                            } else if (i12 != 2) {
                                i13 = 29;
                            } else {
                                i13 = 28;
                            }
                            break;
                        case 11:
                            if (i12 == 1) {
                                i13 = 43;
                            } else if (i12 != 2) {
                                i13 = 30;
                            } else {
                                i13 = 45;
                            }
                            break;
                        case 12:
                            if (i12 == 1) {
                                i13 = 44;
                            } else if (i12 != 2) {
                                i13 = 31;
                            } else {
                                i13 = 46;
                            }
                            break;
                        case 13:
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    i13 = 0;
                                } else if (i11 > 0) {
                                    i13 = 35;
                                } else {
                                    i13 = 34;
                                }
                            } else if (i11 > 0) {
                                i13 = 33;
                            } else {
                                i13 = 32;
                            }
                            break;
                        case 14:
                            i13 = 36;
                            break;
                        case 15:
                        case 18:
                        default:
                            i13 = 0;
                            break;
                        case 16:
                            if (i12 == 1) {
                                i13 = 47;
                            } else if (i12 != 2) {
                                i13 = 37;
                            } else {
                                i13 = 48;
                            }
                            break;
                        case 17:
                            if (i12 == 1) {
                                i13 = 49;
                            } else if (i12 != 2) {
                                i13 = 38;
                            } else {
                                i13 = 50;
                            }
                            break;
                        case 19:
                            if (i12 == 1) {
                                i13 = 41;
                            } else if (i12 != 2) {
                                i13 = 39;
                            } else {
                                i13 = 42;
                            }
                            break;
                    }
                    usVar2.f(i13);
                }
                if (turnEvent.a == 13) {
                    usVar2.h(turnEvent.e);
                    usVar2.g(turnEvent.d);
                    int i35 = turnEvent.e;
                    int i36 = turnEvent.d;
                }
                z4 = true;
            }
        } else {
            usVar2 = this.p;
            usVar2.o(turnEvent.a);
            if (turnEvent.k == 0) {
                i10 = turnEvent.a;
                i11 = turnEvent.d;
                i12 = turnEvent.c;
                java.lang.ThreadLocal threadLocal4 = mao.a;
                switch (i10) {
                    case defpackage.abnt.b /* 0 */:
                        i13 = 0;
                        break;
                    case 1:
                        i13 = 1;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        i13 = 2;
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        if (i12 == 1) {
                            i13 = 5;
                        } else if (i12 != 2) {
                            i13 = 0;
                        } else {
                            i13 = 6;
                        }
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        if (i12 == 1) {
                            i13 = 7;
                        } else if (i12 != 2) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        if (i12 == 1) {
                            i13 = 9;
                        } else if (i12 != 2) {
                            i13 = 0;
                        } else {
                            i13 = 10;
                        }
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (i12 == 1) {
                            i13 = 11;
                        } else if (i12 != 2) {
                            i13 = 0;
                        } else {
                            i13 = 12;
                        }
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (i12 == 1) {
                            i13 = 15;
                        } else if (i12 != 2) {
                            i13 = 0;
                        } else {
                            i13 = 16;
                        }
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        if (i12 == 1) {
                            i13 = 23;
                        } else if (i12 != 2) {
                            i13 = 0;
                        } else {
                            i13 = 24;
                        }
                        break;
                    case 9:
                        if (i12 == 1) {
                            i13 = 25;
                        } else if (i12 != 2) {
                            i13 = 0;
                        } else {
                            i13 = 26;
                        }
                        break;
                    case 10:
                        if (i12 == 1) {
                            i13 = 27;
                        } else if (i12 != 2) {
                            i13 = 29;
                        } else {
                            i13 = 28;
                        }
                        break;
                    case 11:
                        if (i12 == 1) {
                            i13 = 43;
                        } else if (i12 != 2) {
                            i13 = 30;
                        } else {
                            i13 = 45;
                        }
                        break;
                    case 12:
                        if (i12 == 1) {
                            i13 = 44;
                        } else if (i12 != 2) {
                            i13 = 31;
                        } else {
                            i13 = 46;
                        }
                        break;
                    case 13:
                        if (i12 != 1) {
                            if (i12 != 2) {
                                i13 = 0;
                            } else if (i11 > 0) {
                                i13 = 35;
                            } else {
                                i13 = 34;
                            }
                        } else if (i11 > 0) {
                            i13 = 33;
                        } else {
                            i13 = 32;
                        }
                        break;
                    case 14:
                        i13 = 36;
                        break;
                    case 15:
                    case 18:
                    default:
                        i13 = 0;
                        break;
                    case 16:
                        if (i12 == 1) {
                            i13 = 47;
                        } else if (i12 != 2) {
                            i13 = 37;
                        } else {
                            i13 = 48;
                        }
                        break;
                    case 17:
                        if (i12 == 1) {
                            i13 = 49;
                        } else if (i12 != 2) {
                            i13 = 38;
                        } else {
                            i13 = 50;
                        }
                        break;
                    case 19:
                        if (i12 == 1) {
                            i13 = 41;
                        } else if (i12 != 2) {
                            i13 = 39;
                        } else {
                            i13 = 42;
                        }
                        break;
                }
                usVar2.f(i13);
            }
            if (turnEvent.a == 13) {
                usVar2.h(turnEvent.e);
                usVar2.g(turnEvent.d);
                int i37 = turnEvent.e;
                int i38 = turnEvent.d;
            }
            z4 = true;
        }
        int i39 = turnEvent.k;
        if (i39 == f().k) {
            if (q(i39, f().k) && (turnEvent.d != f().d || turnEvent.e != f().e)) {
                usVar = this.p;
                usVar.f(turnEvent.k);
                if (r(turnEvent.k)) {
                    usVar.h(turnEvent.e);
                    if (turnEvent.k()) {
                        usVar.g(turnEvent.d);
                    }
                    int i40 = turnEvent.e;
                    int i41 = turnEvent.d;
                }
                z4 = true;
            }
        } else if (i39 == 0) {
            i39 = 0;
            if (q(i39, f().k)) {
                usVar = this.p;
                usVar.f(turnEvent.k);
                if (r(turnEvent.k)) {
                    usVar.h(turnEvent.e);
                    if (turnEvent.k()) {
                        usVar.g(turnEvent.d);
                    }
                    int i42 = turnEvent.e;
                    int i43 = turnEvent.d;
                }
                z4 = true;
            }
        } else {
            usVar = this.p;
            usVar.f(turnEvent.k);
            if (r(turnEvent.k)) {
                usVar.h(turnEvent.e);
                if (turnEvent.k()) {
                    usVar.g(turnEvent.d);
                }
                int i44 = turnEvent.e;
                int i45 = turnEvent.d;
            }
            z4 = true;
        }
        boolean zT2 = z4 | t(turnEvent);
        java.util.List listI = turnEvent.i();
        if (!j$.util.Objects.equals(listI, f().i())) {
            defpackage.us usVar5 = this.p;
            if (listI == null) {
                int i46 = defpackage.ygw.d;
                usVar5.e(defpackage.ymx.a);
            } else {
                usVar5.e(listI);
            }
            zT2 = true;
        }
        java.util.List listE = turnEvent.e();
        if (!j$.util.Objects.equals(listE, f().e())) {
            defpackage.us usVar6 = this.p;
            if (listE == null) {
                int i47 = defpackage.ygw.d;
                usVar6.a(defpackage.ymx.a);
            } else {
                usVar6.a(listE);
            }
            zT2 = true;
        }
        java.util.List listF = turnEvent.f();
        if (!j$.util.Objects.equals(listF, f().f())) {
            this.g.j(listF);
            defpackage.us usVar7 = this.p;
            if (listF == null) {
                int i48 = defpackage.ygw.d;
                usVar7.b(defpackage.ymx.a);
            } else {
                usVar7.b(listF);
            }
            zT2 = true;
        }
        java.util.List listG = turnEvent.g();
        if (!j$.util.Objects.equals(listG, f().g())) {
            defpackage.us usVar8 = this.p;
            if (listG == null) {
                int i49 = defpackage.ygw.d;
                usVar8.c(defpackage.ymx.a);
            } else {
                usVar8.c(listG);
            }
            zT2 = true;
        }
        com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEventF5 = f();
        java.lang.ThreadLocal threadLocal5 = mao.a;
        if (turnEventF5.k == 0 && !turnEventF5.n() && !turnEventF5.k() && turnEventF5.f == null && android.text.TextUtils.isEmpty(turnEventF5.b) && turnEventF5.i() == null && turnEventF5.e() == null) {
            arrayList2 = null;
        } else {
            if (turnEventF5.k != 0 || turnEventF5.n() || turnEventF5.k()) {
                int i50 = turnEventF5.k;
                if (i50 == 0) {
                    i50 = 0;
                } else if (i50 < 0 || i50 > 50) {
                    throw new java.lang.IllegalArgumentException("maneuver type value is inavlid: " + i50);
                }
                if (turnEventF5.n()) {
                    i7 = turnEventF5.e;
                    if (i7 < 0) {
                        throw new java.lang.IllegalArgumentException("Exit number is invalid: " + i7);
                    }
                } else {
                    i7 = -1;
                }
                if (turnEventF5.k()) {
                    i8 = turnEventF5.d;
                    if (i8 < 0) {
                        throw new java.lang.IllegalArgumentException("Exit angle is invalid: " + i8);
                    }
                } else {
                    i8 = -1;
                }
                maneuver = new com.google.android.gms.car.navigation.Maneuver(i50, i7, i8);
            } else {
                maneuver = null;
            }
            java.lang.String string = !android.text.TextUtils.isEmpty(turnEventF5.b) ? turnEventF5.b.toString() : null;
            byte[] bArr2 = turnEventF5.f;
            byte[] bArr3 = bArr2 == null ? null : bArr2;
            java.util.List listI2 = turnEventF5.i();
            if (listI2 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it = listI2.iterator();
                while (it.hasNext()) {
                    java.util.List list = ((com.google.android.apps.auto.sdk.nav.state.Lane) it.next()).a;
                    java.util.List<com.google.android.apps.auto.sdk.nav.state.LaneDirection> listUnmodifiableList = list == null ? null : j$.util.DesugarCollections.unmodifiableList(list);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (com.google.android.apps.auto.sdk.nav.state.LaneDirection laneDirection : listUnmodifiableList) {
                        int i51 = laneDirection.a;
                        if (i51 < 0 || i51 > i14) {
                            throw new java.lang.IllegalArgumentException("Lane shape is invalid: " + i51);
                        }
                        arrayList6.add(new com.google.android.gms.car.navigation.LaneDirection(i51, laneDirection.b));
                        i14 = 9;
                    }
                    arrayList5.add(new com.google.android.gms.car.navigation.Lane(new java.util.ArrayList(arrayList6)));
                    i14 = 9;
                }
                arrayList = new java.util.ArrayList(arrayList5);
            } else {
                arrayList = null;
            }
            java.util.List listE2 = turnEventF5.e();
            arrayList2 = new java.util.ArrayList(defpackage.ygw.q(new com.google.android.gms.car.navigation.NavigationStep(maneuver, string, arrayList, listE2 != null ? new java.util.ArrayList(listE2) : null, bArr3)));
        }
        java.util.List listF2 = turnEventF5.f();
        java.util.ArrayList arrayList7 = listF2 == null ? null : new java.util.ArrayList(listF2);
        java.util.List<com.google.android.apps.auto.sdk.nav.state.DestinationDetails> listG2 = turnEventF5.g();
        if (listG2 == null) {
            arrayList3 = null;
        } else {
            arrayList3 = new java.util.ArrayList();
            for (com.google.android.apps.auto.sdk.nav.state.DestinationDetails destinationDetails : listG2) {
                arrayList3.add(new com.google.android.gms.car.navigation.DestinationDetails(destinationDetails.a, mao.b(destinationDetails.b)));
            }
        }
        com.google.android.gms.car.navigation.NavigationState navigationState = new com.google.android.gms.car.navigation.NavigationState(arrayList2, arrayList7, arrayList3 == null ? null : new java.util.ArrayList(arrayList3));
        if (zT2) {
            this.a.j(navigationState);
        }
        if (z && rpbVarV != null && (zT2 || w(this.k))) {
            try {
                try {
                    rpbVarV.a.i(navigationState);
                } catch (defpackage.qst e8) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e8)).ai((char) 4607)).u("Unable to send navigation state.");
                }
            } catch (android.os.RemoteException e9) {
                defpackage.oml.I(e9);
            } catch (java.lang.IllegalStateException e10) {
                defpackage.oml.G(e10);
            }
            this.k = android.os.SystemClock.elapsedRealtime();
        }
        this.o = true;
        if (turnEvent.g == f().g || !turnEvent.m()) {
            z5 = false;
        } else {
            this.p.l(turnEvent.g);
            z5 = true;
        }
        if (turnEvent.l() && (i9 = turnEvent.i) != f().i) {
            this.p.k(i9);
            z5 = true;
        }
        if (turnEvent.h != f().h && turnEvent.j()) {
            this.p.j(turnEvent.h);
            z5 = true;
        }
        int i52 = turnEvent.j;
        if (i52 != f().j && i52 != 0) {
            this.p.m(i52);
            z5 = true;
        }
        java.util.List listH = turnEvent.h();
        if (listH != null && !listH.isEmpty() && !listH.equals(f().h())) {
            this.p.d(listH);
            z5 = true;
        }
        java.lang.String str = turnEvent.q;
        if (str == null || str.equals(f().q)) {
            z6 = z5;
        } else {
            ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.p.a).q = str;
        }
        com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEventF6 = f();
        if (turnEventF6.m() || turnEventF6.l() || turnEventF6.j != 0 || turnEventF6.j()) {
            if (turnEventF6.m() || turnEventF6.l() || turnEventF6.j != 0) {
                uhk uhkVar = new uhk();
                if (turnEventF6.m()) {
                    uhkVar.c(turnEventF6.g);
                }
                if (turnEventF6.l()) {
                    int i53 = turnEventF6.i;
                    long j3 = i53;
                    if (j3 < 0) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bM(j3, "displayDistanceMillis value is invalid: "));
                    }
                    uhkVar.c = j3;
                    float f2 = i53;
                    int i54 = turnEventF6.j;
                    uhkVar.d = ((i54 == 3 || i54 == 5) ? (java.text.DecimalFormat) mao.a.get() : (java.text.DecimalFormat) mao.b.get()).format(f2 / 1000.0f);
                }
                int i55 = turnEventF6.j;
                if (i55 != 0) {
                    uhkVar.b(i55);
                }
                distanceA = uhkVar.a();
            } else {
                distanceA = null;
            }
            if (turnEventF6.j()) {
                j = turnEventF6.h;
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bM(j, "Time to step seconds is invalid: "));
                }
            } else {
                j = -1;
            }
            stepDistance = new com.google.android.gms.car.navigation.StepDistance(distanceA, j);
        } else {
            stepDistance = null;
        }
        java.util.List<com.google.android.apps.auto.sdk.nav.state.DestinationDistance> listH2 = turnEventF6.h();
        if (listH2 == null) {
            arrayList4 = null;
        } else {
            arrayList4 = new java.util.ArrayList();
            for (com.google.android.apps.auto.sdk.nav.state.DestinationDistance destinationDistance : listH2) {
                com.google.android.apps.auto.sdk.nav.state.Distance distance = destinationDistance.a;
                if (distance != null) {
                    uhk uhkVar2 = new uhk();
                    j2 = -1;
                    int i56 = distance.a;
                    if (i56 != -1) {
                        uhkVar2.c(i56);
                    }
                    java.lang.String str2 = distance.b;
                    if (str2 != null && !str2.isEmpty()) {
                        uhkVar2.d = str2;
                    }
                    int i57 = distance.c;
                    if (i57 != 0) {
                        uhkVar2.b(i57);
                    }
                    distanceA2 = uhkVar2.a();
                } else {
                    j2 = -1;
                    distanceA2 = null;
                }
                java.lang.String str3 = destinationDistance.b;
                if (str3 == null) {
                    str3 = null;
                }
                long j4 = destinationDistance.c;
                if (j4 == j2) {
                    j4 = j2;
                } else if (j4 < 0) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bM(j4, "Time to destination is invalid: "));
                }
                arrayList4.add(new com.google.android.gms.car.navigation.DestinationDistance(distanceA2, str3, j4));
            }
        }
        java.util.ArrayList arrayList8 = arrayList4 == null ? null : new java.util.ArrayList(arrayList4);
        java.lang.String str4 = turnEventF6.q;
        com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition = new com.google.android.gms.car.navigation.NavigationCurrentPosition(stepDistance, arrayList8, str4 == null ? null : str4);
        if (z6) {
            this.b.j(navigationCurrentPosition);
        }
        if (z && rpbVarV != null && (z6 || w(this.l))) {
            try {
                try {
                    rpbVarV.a.h(navigationCurrentPosition);
                } catch (defpackage.qst e11) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e11)).ai((char) 4606)).u("Unable to send navigation current position.");
                    return;
                }
            } catch (android.os.RemoteException e12) {
                defpackage.oml.I(e12);
            } catch (java.lang.IllegalStateException e13) {
                defpackage.oml.G(e13);
            }
            this.l = android.os.SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void k(com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast vehicleEnergyForecast) {
        com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetailsB;
        com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetailsB2;
        if (!this.n) {
            ((defpackage.yqj) ((defpackage.yqj) e.h()).ai((char) 4624)).u("Can't send vehicle energy forecast without enhanced nav metadata enabled.");
            return;
        }
        defpackage.rpb rpbVarV = v();
        if (rpbVarV == null) {
            ((defpackage.yqj) ((defpackage.yqj) e.h()).ai((char) 4623)).u("Can't send vehicle energy forecast, metadataManager is null");
            return;
        }
        try {
            java.lang.ThreadLocal threadLocal = mao.a;
            com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance = vehicleEnergyForecast.a;
            com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistanceC = energyAtDistance != null ? mao.c(energyAtDistance) : null;
            com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance2 = vehicleEnergyForecast.b;
            com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistanceC2 = energyAtDistance2 != null ? mao.c(energyAtDistance2) : null;
            int i = vehicleEnergyForecast.c;
            com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails chargingStationDetails = vehicleEnergyForecast.d;
            if (chargingStationDetails != null) {
                chargingStationDetailsB = mao.b(chargingStationDetails);
                chargingStationDetailsB.getClass();
            } else {
                chargingStationDetailsB = null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            defpackage.ygw ygwVarO = defpackage.ygw.o(vehicleEnergyForecast.e);
            int size = ygwVarO.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.google.android.apps.auto.sdk.nav.state.StopDetails stopDetails = (com.google.android.apps.auto.sdk.nav.state.StopDetails) ygwVarO.get(i2);
                com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance3 = stopDetails.a;
                com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistanceC3 = energyAtDistance3 != null ? mao.c(energyAtDistance3) : null;
                com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails chargingStationDetails2 = stopDetails.b;
                if (chargingStationDetails2 != null) {
                    chargingStationDetailsB2 = mao.b(chargingStationDetails2);
                    chargingStationDetailsB2.getClass();
                } else {
                    chargingStationDetailsB2 = null;
                }
                arrayList.add(new com.google.android.gms.car.navigation.StopDetails(energyAtDistanceC3, chargingStationDetailsB2));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            defpackage.ygw ygwVarO2 = defpackage.ygw.o(vehicleEnergyForecast.f);
            int size2 = ygwVarO2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                java.lang.String str = ((com.google.android.apps.auto.sdk.nav.state.DataAuthorization) ygwVarO2.get(i3)).a;
                if (str == null) {
                    str = null;
                }
                arrayList3.add(new com.google.android.gms.car.navigation.DataAuthorization(str));
            }
            try {
                rpbVarV.a.p(new com.google.android.gms.car.navigation.VehicleEnergyForecast(energyAtDistanceC, energyAtDistanceC2, i, chargingStationDetailsB, arrayList2, new java.util.ArrayList(arrayList3)));
            } catch (android.os.RemoteException e2) {
                defpackage.oml.I(e2);
            } catch (java.lang.IllegalStateException e3) {
                defpackage.oml.G(e3);
            }
        } catch (defpackage.qst e4) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e4)).ai((char) 4622)).u("Unable to send vehicle energy forecast.");
        }
    }
}
