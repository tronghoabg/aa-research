package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dqw extends defpackage.drd {
    public final defpackage.dri a;
    public int aB;
    public boolean aC;
    public boolean aD;
    public java.lang.ref.WeakReference aE;
    public java.lang.ref.WeakReference aF;
    public java.lang.ref.WeakReference aG;
    public java.lang.ref.WeakReference aH;
    final java.util.HashSet aI;
    public final defpackage.dre aJ;
    final defpackage.ngb aK;
    public int b;
    public defpackage.drf c;
    public boolean d;
    public final defpackage.dpg e;
    int f;
    int g;
    public int h;
    public int i;
    public defpackage.dqt[] j;
    public defpackage.dqt[] k;

    public dqw() {
        this.aK = new defpackage.ngb(this);
        this.a = new defpackage.dri(this);
        this.c = null;
        this.d = false;
        this.e = new defpackage.dpg();
        this.h = 0;
        this.i = 0;
        this.j = new defpackage.dqt[4];
        this.k = new defpackage.dqt[4];
        this.aB = 257;
        this.aC = false;
        this.aD = false;
        this.aE = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = new java.util.HashSet();
        this.aJ = new defpackage.dre();
    }

    public static void al(defpackage.dqv dqvVar, defpackage.drf drfVar, defpackage.dre dreVar) {
        int i;
        int i2;
        if (drfVar == null) {
            return;
        }
        if (dqvVar.ar == 8 || (dqvVar instanceof defpackage.dqz) || (dqvVar instanceof defpackage.dqs)) {
            dreVar.c = 0;
            dreVar.d = 0;
            return;
        }
        dreVar.i = dqvVar.W();
        dreVar.j = dqvVar.X();
        dreVar.a = dqvVar.j();
        dreVar.b = dqvVar.h();
        dreVar.g = false;
        dreVar.h = 0;
        boolean z = dreVar.i == 3;
        boolean z2 = dreVar.j == 3;
        boolean z3 = z && dqvVar.ah > 0.0f;
        boolean z4 = z2 && dqvVar.ah > 0.0f;
        if (z && dqvVar.P(0) && dqvVar.C == 0 && !z3) {
            dreVar.i = 2;
            if (z2 && dqvVar.D == 0) {
                dreVar.i = 1;
            }
            z = false;
        }
        if (z2 && dqvVar.P(1) && dqvVar.D == 0 && !z4) {
            dreVar.j = 2;
            if (z && dqvVar.C == 0) {
                dreVar.j = 1;
            }
            z2 = false;
        }
        if (dqvVar.e()) {
            dreVar.i = 1;
            z = false;
        }
        if (dqvVar.f()) {
            dreVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (dqvVar.E[0] == 4) {
                dreVar.i = 1;
            } else if (!z2) {
                if (dreVar.j == 1) {
                    i2 = dreVar.b;
                } else {
                    dreVar.i = 2;
                    drfVar.b(dqvVar, dreVar);
                    i2 = dreVar.d;
                }
                dreVar.i = 1;
                dreVar.a = (int) (dqvVar.ah * i2);
            }
        }
        if (z4) {
            if (dqvVar.E[1] == 4) {
                dreVar.j = 1;
            } else if (!z) {
                if (dreVar.i == 1) {
                    i = dreVar.a;
                } else {
                    dreVar.j = 2;
                    drfVar.b(dqvVar, dreVar);
                    i = dreVar.c;
                }
                dreVar.j = 1;
                float f = i;
                if (dqvVar.ai == -1) {
                    dreVar.b = (int) (f / dqvVar.ah);
                } else {
                    dreVar.b = (int) (dqvVar.ah * f);
                }
            }
        }
        drfVar.b(dqvVar, dreVar);
        dqvVar.M(dreVar.c);
        dqvVar.B(dreVar.d);
        dqvVar.P = dreVar.f;
        dqvVar.x(dreVar.e);
        dreVar.h = 0;
        boolean z5 = dreVar.g;
    }

    private final void ap(defpackage.dqu dquVar, defpackage.dpj dpjVar) {
        defpackage.dpg dpgVar = this.e;
        dpgVar.g(dpjVar, dpgVar.b(dquVar), 0, 5);
    }

    private final void aq(defpackage.dqu dquVar, defpackage.dpj dpjVar) {
        defpackage.dpg dpgVar = this.e;
        dpgVar.g(dpgVar.b(dquVar), dpjVar, 0, 5);
    }

    private final void ar() {
        this.h = 0;
        this.i = 0;
    }

    @Override // defpackage.dqv
    public final void N(boolean z, boolean z2) {
        super.N(z, z2);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.dqv) this.aL.get(i)).N(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x024a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0255  */
    /* JADX WARN: Code duplicated, block: B:157:0x0284  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02be  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:176:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:186:0x0302  */
    /* JADX WARN: Code duplicated, block: B:188:0x0307  */
    /* JADX WARN: Code duplicated, block: B:191:0x0311  */
    /* JADX WARN: Code duplicated, block: B:201:0x032d  */
    /* JADX WARN: Code duplicated, block: B:218:0x0372  */
    /* JADX WARN: Code duplicated, block: B:220:0x0379 A[LOOP:27: B:219:0x0377->B:220:0x0379, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x0389  */
    /* JADX WARN: Code duplicated, block: B:224:0x0390 A[LOOP:28: B:223:0x038e->B:224:0x0390, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:230:0x03b8 A[LOOP:29: B:228:0x03b2->B:230:0x03b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:236:0x03d9 A[LOOP:30: B:234:0x03d3->B:236:0x03d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:242:0x03fa A[LOOP:31: B:240:0x03f4->B:242:0x03fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x040c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0413 A[LOOP:32: B:246:0x0411->B:247:0x0413, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:249:0x0423  */
    /* JADX WARN: Code duplicated, block: B:251:0x042a A[LOOP:33: B:250:0x0428->B:251:0x042a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x043a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0441 A[LOOP:34: B:254:0x043f->B:255:0x0441, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:258:0x045f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0469 A[LOOP:35: B:259:0x0463->B:261:0x0469, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:264:0x0480  */
    /* JADX WARN: Code duplicated, block: B:267:0x048a A[LOOP:36: B:265:0x0484->B:267:0x048a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ab A[LOOP:37: B:271:0x04a5->B:273:0x04ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:276:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:279:0x04cb A[LOOP:38: B:277:0x04c5->B:279:0x04cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:284:0x04e4 A[LOOP:39: B:283:0x04e2->B:284:0x04e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:287:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:299:0x0535  */
    /* JADX WARN: Code duplicated, block: B:301:0x053c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0545  */
    /* JADX WARN: Code duplicated, block: B:305:0x054f  */
    /* JADX WARN: Code duplicated, block: B:307:0x0558  */
    /* JADX WARN: Code duplicated, block: B:309:0x055b  */
    /* JADX WARN: Code duplicated, block: B:312:0x0562  */
    /* JADX WARN: Code duplicated, block: B:313:0x056a  */
    /* JADX WARN: Code duplicated, block: B:316:0x0572  */
    /* JADX WARN: Code duplicated, block: B:318:0x057b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0585  */
    /* JADX WARN: Code duplicated, block: B:322:0x058e  */
    /* JADX WARN: Code duplicated, block: B:324:0x0591  */
    /* JADX WARN: Code duplicated, block: B:327:0x0597  */
    /* JADX WARN: Code duplicated, block: B:328:0x059f  */
    /* JADX WARN: Code duplicated, block: B:333:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:337:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:339:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:341:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:345:0x05db  */
    /* JADX WARN: Code duplicated, block: B:347:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:349:0x05ea A[PHI: r4
  0x05ea: PHI (r4v1 int) = (r4v0 int), (r4v43 int) binds: [B:139:0x0232, B:145:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:431:0x070e A[Catch: Exception -> 0x08d6, TryCatch #5 {Exception -> 0x08d6, blocks: (B:386:0x0685, B:395:0x06a8, B:397:0x06b4, B:398:0x06b7, B:400:0x06bb, B:402:0x06c5, B:425:0x06f4, B:405:0x06ce, B:424:0x06f1, B:426:0x06fb, B:427:0x0700, B:429:0x0708, B:431:0x070e, B:432:0x0716, B:434:0x071c), top: B:614:0x0685 }] */
    /* JADX WARN: Code duplicated, block: B:434:0x071c A[Catch: Exception -> 0x08d6, TRY_LEAVE, TryCatch #5 {Exception -> 0x08d6, blocks: (B:386:0x0685, B:395:0x06a8, B:397:0x06b4, B:398:0x06b7, B:400:0x06bb, B:402:0x06c5, B:425:0x06f4, B:405:0x06ce, B:424:0x06f1, B:426:0x06fb, B:427:0x0700, B:429:0x0708, B:431:0x070e, B:432:0x0716, B:434:0x071c), top: B:614:0x0685 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x072d A[Catch: Exception -> 0x08a5, TryCatch #6 {Exception -> 0x08a5, blocks: (B:436:0x0729, B:438:0x072d, B:440:0x0737, B:444:0x0748, B:446:0x074e, B:447:0x0752, B:449:0x0758, B:450:0x0762, B:441:0x073e, B:452:0x0768, B:457:0x0776, B:459:0x0784), top: B:616:0x0729 }] */
    /* JADX WARN: Code duplicated, block: B:441:0x073e A[Catch: Exception -> 0x08a5, LOOP:20: B:616:0x0729->B:441:0x073e, LOOP_END, TryCatch #6 {Exception -> 0x08a5, blocks: (B:436:0x0729, B:438:0x072d, B:440:0x0737, B:444:0x0748, B:446:0x074e, B:447:0x0752, B:449:0x0758, B:450:0x0762, B:441:0x073e, B:452:0x0768, B:457:0x0776, B:459:0x0784), top: B:616:0x0729 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x074e A[Catch: Exception -> 0x08a5, TryCatch #6 {Exception -> 0x08a5, blocks: (B:436:0x0729, B:438:0x072d, B:440:0x0737, B:444:0x0748, B:446:0x074e, B:447:0x0752, B:449:0x0758, B:450:0x0762, B:441:0x073e, B:452:0x0768, B:457:0x0776, B:459:0x0784), top: B:616:0x0729 }] */
    /* JADX WARN: Code duplicated, block: B:449:0x0758 A[Catch: Exception -> 0x08a5, LOOP:21: B:447:0x0752->B:449:0x0758, LOOP_END, TryCatch #6 {Exception -> 0x08a5, blocks: (B:436:0x0729, B:438:0x072d, B:440:0x0737, B:444:0x0748, B:446:0x074e, B:447:0x0752, B:449:0x0758, B:450:0x0762, B:441:0x073e, B:452:0x0768, B:457:0x0776, B:459:0x0784), top: B:616:0x0729 }] */
    /* JADX WARN: Code duplicated, block: B:457:0x0776 A[Catch: Exception -> 0x08a5, TRY_ENTER, TryCatch #6 {Exception -> 0x08a5, blocks: (B:436:0x0729, B:438:0x072d, B:440:0x0737, B:444:0x0748, B:446:0x074e, B:447:0x0752, B:449:0x0758, B:450:0x0762, B:441:0x073e, B:452:0x0768, B:457:0x0776, B:459:0x0784), top: B:616:0x0729 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0784 A[Catch: Exception -> 0x08a5, TRY_LEAVE, TryCatch #6 {Exception -> 0x08a5, blocks: (B:436:0x0729, B:438:0x072d, B:440:0x0737, B:444:0x0748, B:446:0x074e, B:447:0x0752, B:449:0x0758, B:450:0x0762, B:441:0x073e, B:452:0x0768, B:457:0x0776, B:459:0x0784), top: B:616:0x0729 }] */
    /* JADX WARN: Code duplicated, block: B:464:0x0791  */
    /* JADX WARN: Code duplicated, block: B:465:0x0793  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:470:0x07a9 A[Catch: Exception -> 0x08a2, LOOP:24: B:468:0x07a3->B:470:0x07a9, LOOP_END, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:474:0x07be  */
    /* JADX WARN: Code duplicated, block: B:476:0x07c5 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:478:0x07d1 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:480:0x07e1 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:482:0x07e7 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:485:0x07f0 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:487:0x07f5 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:488:0x07f9 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:490:0x0806 A[Catch: Exception -> 0x08a2, TryCatch #8 {Exception -> 0x08a2, blocks: (B:467:0x079c, B:468:0x07a3, B:470:0x07a9, B:492:0x080e, B:500:0x081e, B:501:0x0821, B:503:0x0825, B:505:0x082b, B:506:0x083f, B:508:0x0843, B:510:0x0849, B:511:0x085d, B:513:0x0861, B:515:0x0867, B:516:0x087b, B:518:0x087f, B:520:0x0885, B:476:0x07c5, B:478:0x07d1, B:480:0x07e1, B:482:0x07e7, B:483:0x07eb, B:485:0x07f0, B:487:0x07f5, B:491:0x0809, B:488:0x07f9, B:490:0x0806), top: B:620:0x079c }] */
    /* JADX WARN: Code duplicated, block: B:494:0x0812  */
    /* JADX WARN: Code duplicated, block: B:496:0x0818  */
    /* JADX WARN: Code duplicated, block: B:499:0x081d  */
    /* JADX WARN: Code duplicated, block: B:523:0x089a  */
    /* JADX WARN: Code duplicated, block: B:531:0x08a8 A[Catch: Exception -> 0x08d4, TryCatch #7 {Exception -> 0x08d4, blocks: (B:522:0x0897, B:524:0x089b, B:531:0x08a8, B:533:0x08bf, B:535:0x08c3, B:536:0x08c7), top: B:618:0x0897 }] */
    /* JADX WARN: Code duplicated, block: B:533:0x08bf A[Catch: Exception -> 0x08d4, TryCatch #7 {Exception -> 0x08d4, blocks: (B:522:0x0897, B:524:0x089b, B:531:0x08a8, B:533:0x08bf, B:535:0x08c3, B:536:0x08c7), top: B:618:0x0897 }] */
    /* JADX WARN: Code duplicated, block: B:535:0x08c3 A[Catch: Exception -> 0x08d4, TryCatch #7 {Exception -> 0x08d4, blocks: (B:522:0x0897, B:524:0x089b, B:531:0x08a8, B:533:0x08bf, B:535:0x08c3, B:536:0x08c7), top: B:618:0x0897 }] */
    /* JADX WARN: Code duplicated, block: B:536:0x08c7 A[Catch: Exception -> 0x08d4, TRY_LEAVE, TryCatch #7 {Exception -> 0x08d4, blocks: (B:522:0x0897, B:524:0x089b, B:531:0x08a8, B:533:0x08bf, B:535:0x08c3, B:536:0x08c7), top: B:618:0x0897 }] */
    /* JADX WARN: Code duplicated, block: B:548:0x090e  */
    /* JADX WARN: Code duplicated, block: B:550:0x0920  */
    /* JADX WARN: Code duplicated, block: B:554:0x0927  */
    /* JADX WARN: Code duplicated, block: B:558:0x0939 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:563:0x0946 A[LOOP:14: B:562:0x0944->B:563:0x0946, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:566:0x0977  */
    /* JADX WARN: Code duplicated, block: B:570:0x098b  */
    /* JADX WARN: Code duplicated, block: B:575:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:576:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:579:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:580:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:582:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:584:0x09e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:587:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:590:0x09fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:594:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:596:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:597:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:610:0x076e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x08ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0765 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0746 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0737 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x0809 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x0809 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x055c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x055c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // defpackage.drd
    public final void ae() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean zAj;
        int size;
        int i6;
        boolean z3;
        int iMax;
        ?? r5;
        boolean z4;
        int iMax2;
        ?? r0;
        ?? r1;
        int i7;
        ?? r4;
        ?? r2;
        ?? r3;
        int i8;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        defpackage.dqv dqvVar;
        boolean z5;
        int i9;
        java.util.HashSet hashSet;
        int i10;
        java.util.HashSet<defpackage.dqv> hashSet2;
        int i11;
        int i12;
        defpackage.dqv dqvVar2;
        java.util.ArrayList arrayList;
        java.lang.ref.WeakReference weakReference;
        java.lang.ref.WeakReference weakReference2;
        java.lang.ref.WeakReference weakReference3;
        java.lang.ref.WeakReference weakReference4;
        int i13;
        defpackage.dqv dqvVar3;
        int i14;
        int i15;
        int i16;
        int i17;
        int size2;
        java.util.Iterator it;
        java.util.Iterator it2;
        defpackage.drc drcVar;
        int i18;
        defpackage.dqv dqvVar4;
        defpackage.dqs dqsVar;
        boolean z6;
        char c;
        defpackage.drf drfVar;
        java.util.ArrayList arrayList2;
        int size3;
        int i19;
        java.util.ArrayList arrayList3;
        int i20;
        java.util.ArrayList arrayList4;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        java.util.ArrayList arrayList7;
        java.util.ArrayList arrayList8;
        int i21;
        int i22;
        int i23;
        java.util.ArrayList arrayList9;
        java.util.HashSet hashSet3;
        java.util.HashSet hashSet4;
        java.util.HashSet hashSet5;
        drq drqVar;
        int i24;
        java.util.HashSet hashSet6;
        java.util.HashSet hashSet7;
        java.util.HashSet hashSet8;
        java.util.HashSet hashSet9;
        drq drqVar2;
        int i25;
        int i26;
        int i27;
        drq drqVar3;
        drq drqVar4;
        char c2;
        int iJ;
        int iH;
        int size4;
        int i28;
        int i29;
        drq drqVar5;
        int iA;
        int size5;
        int i30;
        int i31;
        drq drqVar6;
        int iA2;
        int[] iArr;
        int size6;
        int i32;
        java.util.Iterator it3;
        java.util.Iterator it4;
        java.util.Iterator it5;
        java.util.Iterator it6;
        int size7;
        int i33;
        int size8;
        int i34;
        int size9;
        int i35;
        java.util.Iterator it7;
        java.util.Iterator it8;
        java.util.Iterator it9;
        int size10;
        int i36;
        int size11;
        int i37;
        defpackage.dqv dqvVar5;
        boolean z7;
        defpackage.dqs dqsVar2;
        defpackage.dqz dqzVar;
        defpackage.dqv dqvVar6;
        boolean z8;
        boolean z9;
        this.aj = 0;
        this.ak = 0;
        this.aC = false;
        this.aD = false;
        int size12 = this.aL.size();
        int iMax7 = java.lang.Math.max(0, j());
        int iMax8 = java.lang.Math.max(0, h());
        int[] iArr2 = this.aA;
        int i38 = iArr2[1];
        int i39 = iArr2[0];
        int i40 = -1;
        if (this.b == 0 && (this.aB & 1) == 1) {
            defpackage.drf drfVar2 = this.c;
            int iW = W();
            int iX = X();
            defpackage.drl.b = 0;
            defpackage.drl.c = 0;
            w();
            java.util.ArrayList arrayList10 = this.aL;
            int size13 = arrayList10.size();
            for (int i41 = 0; i41 < size13; i41++) {
                ((defpackage.dqv) arrayList10.get(i41)).w();
            }
            boolean z10 = this.d;
            if (iW == 1) {
                z(0, j());
            } else {
                this.T.f(0);
                this.aj = 0;
            }
            int i42 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i42 < size13) {
                defpackage.dqv dqvVar7 = (defpackage.dqv) arrayList10.get(i42);
                if (dqvVar7 instanceof defpackage.dqz) {
                    defpackage.dqz dqzVar2 = (defpackage.dqz) dqvVar7;
                    if (dqzVar2.e == 1) {
                        int i43 = dqzVar2.b;
                        if (i43 != i40) {
                            dqzVar2.b(i43);
                        } else if (dqzVar2.c != i40 && e()) {
                            dqzVar2.b(j() - dqzVar2.c);
                        } else if (e()) {
                            dqzVar2.b((int) ((dqzVar2.a * j()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else if ((dqvVar7 instanceof defpackage.dqs) && ((defpackage.dqs) dqvVar7).b() == 0) {
                    z12 = true;
                }
                i42++;
                i40 = -1;
                z11 = z11;
                z12 = z12;
            }
            if (z11) {
                for (int i44 = 0; i44 < size13; i44++) {
                    defpackage.dqv dqvVar8 = (defpackage.dqv) arrayList10.get(i44);
                    if (dqvVar8 instanceof defpackage.dqz) {
                        defpackage.dqz dqzVar3 = (defpackage.dqz) dqvVar8;
                        if (dqzVar3.e == 1) {
                            defpackage.drl.a(0, dqzVar3, drfVar2, z10);
                        }
                    }
                }
            }
            int i45 = 0;
            defpackage.drl.a(0, this, drfVar2, z10);
            if (z12) {
                for (int i46 = 0; i46 < size13; i46++) {
                    defpackage.dqv dqvVar9 = (defpackage.dqv) arrayList10.get(i46);
                    if (dqvVar9 instanceof defpackage.dqs) {
                        defpackage.dqs dqsVar3 = (defpackage.dqs) dqvVar9;
                        if (dqsVar3.b() == 0) {
                            defpackage.drl.d(dqsVar3, drfVar2, 0, z10);
                        }
                    }
                }
            }
            if (iX == 1) {
                A(0, h());
                z8 = false;
                z9 = false;
            } else {
                this.U.f(0);
                this.ak = 0;
                z8 = false;
                z9 = false;
                i45 = 0;
            }
            while (i45 < size13) {
                defpackage.dqv dqvVar10 = (defpackage.dqv) arrayList10.get(i45);
                if (dqvVar10 instanceof defpackage.dqz) {
                    defpackage.dqz dqzVar4 = (defpackage.dqz) dqvVar10;
                    if (dqzVar4.e == 0) {
                        int i47 = dqzVar4.b;
                        if (i47 != -1) {
                            dqzVar4.b(i47);
                        } else if (dqzVar4.c != -1 && f()) {
                            dqzVar4.b(h() - dqzVar4.c);
                        } else if (f()) {
                            dqzVar4.b((int) ((dqzVar4.a * h()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else if ((dqvVar10 instanceof defpackage.dqs) && ((defpackage.dqs) dqvVar10).b() == 1) {
                    z9 = true;
                }
                i45++;
            }
            if (z8) {
                for (int i48 = 0; i48 < size13; i48++) {
                    defpackage.dqv dqvVar11 = (defpackage.dqv) arrayList10.get(i48);
                    if (dqvVar11 instanceof defpackage.dqz) {
                        defpackage.dqz dqzVar5 = (defpackage.dqz) dqvVar11;
                        if (dqzVar5.e == 0) {
                            defpackage.drl.b(1, dqzVar5, drfVar2);
                        }
                    }
                }
            }
            defpackage.drl.b(0, this, drfVar2);
            if (z9) {
                for (int i49 = 0; i49 < size13; i49++) {
                    defpackage.dqv dqvVar12 = (defpackage.dqv) arrayList10.get(i49);
                    if (dqvVar12 instanceof defpackage.dqs) {
                        defpackage.dqs dqsVar4 = (defpackage.dqs) dqvVar12;
                        if (dqsVar4.b() == 1) {
                            defpackage.drl.d(dqsVar4, drfVar2, 1, z10);
                        }
                    }
                }
            }
            for (int i50 = 0; i50 < size13; i50++) {
                defpackage.dqv dqvVar13 = (defpackage.dqv) arrayList10.get(i50);
                if (dqvVar13.T() && defpackage.drl.c(dqvVar13)) {
                    al(dqvVar13, drfVar2, defpackage.drl.a);
                    if (!(dqvVar13 instanceof defpackage.dqz)) {
                        defpackage.drl.a(0, dqvVar13, drfVar2, z10);
                        defpackage.drl.b(0, dqvVar13, drfVar2);
                    } else if (((defpackage.dqz) dqvVar13).e == 0) {
                        defpackage.drl.b(0, dqvVar13, drfVar2);
                    } else {
                        defpackage.drl.a(0, dqvVar13, drfVar2, z10);
                    }
                }
            }
            for (int i51 = 0; i51 < size12; i51++) {
                defpackage.dqv dqvVar14 = (defpackage.dqv) this.aL.get(i51);
                if (dqvVar14.T() && !(dqvVar14 instanceof defpackage.dqz) && !(dqvVar14 instanceof defpackage.dqs) && !(dqvVar14 instanceof defpackage.drc) && !dqvVar14.Q) {
                    int iV = dqvVar14.V(0);
                    int iV2 = dqvVar14.V(1);
                    if (iV != 3 || dqvVar14.C == 1 || iV2 != 3 || dqvVar14.D == 1) {
                        al(dqvVar14, this.c, new defpackage.dre());
                    }
                }
            }
        }
        if (size12 <= 2) {
            i = size12;
            i2 = iMax7;
            i3 = i38;
            i4 = iMax8;
            z = false;
            break;
        }
        if (i39 == 2) {
            if ((this.aB & 1024) == 1024) {
                drfVar = this.c;
                arrayList2 = this.aL;
                size3 = arrayList2.size();
                i19 = 0;
                while (true) {
                    if (i19 < size3) {
                        dqvVar6 = (defpackage.dqv) arrayList2.get(i19);
                        if (!defpackage.xi.g(W(), X(), dqvVar6.W(), dqvVar6.X()) || (dqvVar6 instanceof defpackage.dqy)) {
                            i2 = iMax7;
                            i39 = i39;
                            i3 = i38;
                            i = size12;
                            z = false;
                            i4 = iMax8;
                            break;
                        }
                        i19++;
                    } else {
                        arrayList3 = null;
                        i20 = 0;
                        arrayList4 = null;
                        arrayList5 = null;
                        arrayList6 = null;
                        arrayList7 = null;
                        arrayList8 = null;
                        while (i20 < size3) {
                            int i52 = i20;
                            dqvVar5 = (defpackage.dqv) arrayList2.get(i20);
                            int i53 = size12;
                            int i54 = iMax8;
                            int i55 = i38;
                            int i56 = iMax7;
                            if (!defpackage.xi.g(W(), X(), dqvVar5.W(), dqvVar5.X())) {
                                al(dqvVar5, drfVar, this.aJ);
                            }
                            z7 = dqvVar5 instanceof defpackage.dqz;
                            if (z7) {
                                dqzVar = (defpackage.dqz) dqvVar5;
                                if (dqzVar.e == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new java.util.ArrayList();
                                    }
                                    arrayList5.add(dqzVar);
                                }
                                if (dqzVar.e == 1) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new java.util.ArrayList();
                                    }
                                    arrayList3.add(dqzVar);
                                }
                            }
                            if (dqvVar5 instanceof defpackage.dra) {
                                if (dqvVar5 instanceof defpackage.dqs) {
                                    dqsVar2 = (defpackage.dqs) dqvVar5;
                                    if (dqsVar2.b() == 0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new java.util.ArrayList();
                                        }
                                        arrayList4.add(dqsVar2);
                                    }
                                    if (dqsVar2.b() == 1) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new java.util.ArrayList();
                                        }
                                        arrayList6.add(dqsVar2);
                                    }
                                } else {
                                    defpackage.dra draVar = (defpackage.dra) dqvVar5;
                                    if (arrayList4 == null) {
                                        arrayList4 = new java.util.ArrayList();
                                    }
                                    arrayList4.add(draVar);
                                    if (arrayList6 == null) {
                                        arrayList6 = new java.util.ArrayList();
                                    }
                                    arrayList6.add(draVar);
                                }
                            }
                            if (dqvVar5.T.e == null && dqvVar5.V.e == null && !z7 && !(dqvVar5 instanceof defpackage.dqs)) {
                                if (arrayList7 == null) {
                                    arrayList7 = new java.util.ArrayList();
                                }
                                arrayList7.add(dqvVar5);
                            }
                            if (dqvVar5.U.e != null && dqvVar5.W.e == null && dqvVar5.X.e == null && !z7 && !(dqvVar5 instanceof defpackage.dqs)) {
                                if (arrayList8 == null) {
                                    arrayList8 = new java.util.ArrayList();
                                }
                                arrayList8.add(dqvVar5);
                            }
                            i20 = i52 + 1;
                            size12 = i53;
                            iMax8 = i54;
                            i38 = i55;
                            iMax7 = i56;
                        }
                        i21 = iMax7;
                        i22 = iMax8;
                        i23 = i38;
                        i = size12;
                        arrayList9 = new java.util.ArrayList();
                        if (arrayList3 != null) {
                            size11 = arrayList3.size();
                            while (i37 < size11) {
                                defpackage.xi.e((defpackage.dqz) arrayList3.get(i37), 0, arrayList9, null);
                            }
                        }
                        if (arrayList4 != null) {
                            size10 = arrayList4.size();
                            while (i36 < size10) {
                                defpackage.dra draVar2 = (defpackage.dra) arrayList4.get(i36);
                                drq drqVarE = defpackage.xi.e(draVar2, 0, arrayList9, null);
                                draVar2.ag(arrayList9, 0, drqVarE);
                                drqVarE.b(arrayList9);
                            }
                        }
                        hashSet3 = U(2).a;
                        if (hashSet3 != null) {
                            it9 = hashSet3.iterator();
                            while (it9.hasNext()) {
                                defpackage.xi.e(((defpackage.dqu) it9.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet4 = U(4).a;
                        if (hashSet4 != null) {
                            it8 = hashSet4.iterator();
                            while (it8.hasNext()) {
                                defpackage.xi.e(((defpackage.dqu) it8.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet5 = U(7).a;
                        if (hashSet5 != null) {
                            it7 = hashSet5.iterator();
                            while (it7.hasNext()) {
                                defpackage.xi.e(((defpackage.dqu) it7.next()).d, 0, arrayList9, null);
                            }
                        }
                        drqVar = null;
                        i24 = 0;
                        if (arrayList7 != null) {
                            size9 = arrayList7.size();
                            i35 = 0;
                            while (i35 < size9) {
                                defpackage.xi.e((defpackage.dqv) arrayList7.get(i35), i24, arrayList9, drqVar);
                                i35++;
                                drqVar = null;
                                i24 = 0;
                            }
                        }
                        if (arrayList5 != null) {
                            size8 = arrayList5.size();
                            while (i34 < size8) {
                                defpackage.xi.e((defpackage.dqz) arrayList5.get(i34), 1, arrayList9, null);
                            }
                        }
                        if (arrayList6 != null) {
                            size7 = arrayList6.size();
                            while (i33 < size7) {
                                defpackage.dra draVar3 = (defpackage.dra) arrayList6.get(i33);
                                drq drqVarE2 = defpackage.xi.e(draVar3, 1, arrayList9, null);
                                draVar3.ag(arrayList9, 1, drqVarE2);
                                drqVarE2.b(arrayList9);
                            }
                        }
                        hashSet6 = U(3).a;
                        if (hashSet6 != null) {
                            it6 = hashSet6.iterator();
                            while (it6.hasNext()) {
                                defpackage.xi.e(((defpackage.dqu) it6.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet7 = U(6).a;
                        if (hashSet7 != null) {
                            it5 = hashSet7.iterator();
                            while (it5.hasNext()) {
                                defpackage.xi.e(((defpackage.dqu) it5.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet8 = U(5).a;
                        if (hashSet8 != null) {
                            it4 = hashSet8.iterator();
                            while (it4.hasNext()) {
                                defpackage.xi.e(((defpackage.dqu) it4.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet9 = U(7).a;
                        if (hashSet9 != null) {
                            it3 = hashSet9.iterator();
                            while (it3.hasNext()) {
                                defpackage.xi.e(((defpackage.dqu) it3.next()).d, 1, arrayList9, null);
                            }
                        }
                        drqVar2 = null;
                        i25 = 1;
                        if (arrayList8 != null) {
                            size6 = arrayList8.size();
                            i32 = 0;
                            while (i32 < size6) {
                                defpackage.xi.e((defpackage.dqv) arrayList8.get(i32), i25, arrayList9, drqVar2);
                                i32++;
                                drqVar2 = null;
                                i25 = 1;
                            }
                        }
                        while (i26 < size3) {
                            defpackage.dqv dqvVar15 = (defpackage.dqv) arrayList2.get(i26);
                            iArr = dqvVar15.aA;
                            if (iArr[0] != 3 && iArr[1] == 3) {
                                drq drqVarF = defpackage.xi.f(arrayList9, dqvVar15.ay);
                                drq drqVarF2 = defpackage.xi.f(arrayList9, dqvVar15.az);
                                if (drqVarF != null && drqVarF2 != null) {
                                    drqVarF.c(0, drqVarF2);
                                    drqVarF2.d = 2;
                                    arrayList9.remove(drqVarF);
                                }
                            }
                        }
                        i27 = 1;
                        if (arrayList9.size() > 1) {
                            if (W() == 2) {
                                size5 = arrayList9.size();
                                drqVar3 = null;
                                i30 = 0;
                                i31 = 0;
                                while (i30 < size5) {
                                    drqVar6 = (drq) arrayList9.get(i30);
                                    if (drqVar6.d == i27) {
                                        iA2 = drqVar6.a(this.e, 0);
                                        if (iA2 > i31) {
                                            drqVar3 = drqVar6;
                                        }
                                        if (iA2 > i31) {
                                            i31 = iA2;
                                        }
                                    }
                                    i30++;
                                    i27 = 1;
                                }
                                if (drqVar3 != null) {
                                    aa(1);
                                    M(i31);
                                } else {
                                    drqVar3 = null;
                                }
                            } else {
                                drqVar3 = null;
                            }
                            if (X() == 2) {
                                size4 = arrayList9.size();
                                drqVar4 = null;
                                i29 = 0;
                                while (i28 < size4) {
                                    drqVar5 = (drq) arrayList9.get(i28);
                                    if (drqVar5.d == 0) {
                                        iA = drqVar5.a(this.e, 1);
                                        if (iA > i29) {
                                            drqVar4 = drqVar5;
                                        }
                                        if (iA > i29) {
                                            i29 = iA;
                                        }
                                    }
                                }
                                if (drqVar4 != null) {
                                    ab(1);
                                    B(i29);
                                } else {
                                    drqVar4 = null;
                                }
                            } else {
                                drqVar4 = null;
                            }
                            if (drqVar3 == null || drqVar4 != null) {
                                c2 = 2;
                                if (i39 == 2) {
                                    if (i21 < j() || i21 <= 0) {
                                        iJ = j();
                                    } else {
                                        M(i21);
                                        this.aC = true;
                                        iJ = i21;
                                    }
                                    i39 = 2;
                                    c2 = 2;
                                } else {
                                    iJ = i21;
                                }
                                if (i23 == c2) {
                                    if (i22 < h() || i22 <= 0) {
                                        iH = h();
                                    } else {
                                        B(i22);
                                        this.aD = true;
                                        iH = i22;
                                    }
                                    i23 = 2;
                                } else {
                                    iH = i22;
                                }
                                i2 = iJ;
                                i4 = iH;
                                i39 = i39;
                                i3 = i23;
                                z = true;
                                break;
                            }
                        }
                        i4 = i22;
                        i3 = i23;
                        i2 = i21;
                    }
                }
            } else {
                i = size12;
                i2 = iMax7;
                i3 = i38;
                i4 = iMax8;
            }
            z = false;
            break;
        } else {
            if (i38 != 2) {
                i2 = iMax7;
                i39 = i39;
                i3 = i38;
                i = size12;
                z = false;
                i4 = iMax8;
                break;
            }
            i38 = 2;
            if ((this.aB & 1024) == 1024) {
                drfVar = this.c;
                arrayList2 = this.aL;
                size3 = arrayList2.size();
                i19 = 0;
                while (true) {
                    if (i19 < size3) {
                        dqvVar6 = (defpackage.dqv) arrayList2.get(i19);
                        if (!defpackage.xi.g(W(), X(), dqvVar6.W(), dqvVar6.X())) {
                            i19++;
                        }
                        i2 = iMax7;
                        i39 = i39;
                        i3 = i38;
                        i = size12;
                        z = false;
                        i4 = iMax8;
                        break;
                    }
                    arrayList3 = null;
                    i20 = 0;
                    arrayList4 = null;
                    arrayList5 = null;
                    arrayList6 = null;
                    arrayList7 = null;
                    arrayList8 = null;
                    while (i20 < size3) {
                        int i57 = i20;
                        dqvVar5 = (defpackage.dqv) arrayList2.get(i20);
                        int i58 = size12;
                        int i59 = iMax8;
                        int i510 = i38;
                        int i511 = iMax7;
                        if (!defpackage.xi.g(W(), X(), dqvVar5.W(), dqvVar5.X())) {
                            al(dqvVar5, drfVar, this.aJ);
                        }
                        z7 = dqvVar5 instanceof defpackage.dqz;
                        if (z7) {
                            dqzVar = (defpackage.dqz) dqvVar5;
                            if (dqzVar.e == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new java.util.ArrayList();
                                }
                                arrayList5.add(dqzVar);
                            }
                            if (dqzVar.e == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new java.util.ArrayList();
                                }
                                arrayList3.add(dqzVar);
                            }
                        }
                        if (dqvVar5 instanceof defpackage.dra) {
                            if (dqvVar5 instanceof defpackage.dqs) {
                                dqsVar2 = (defpackage.dqs) dqvVar5;
                                if (dqsVar2.b() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new java.util.ArrayList();
                                    }
                                    arrayList4.add(dqsVar2);
                                }
                                if (dqsVar2.b() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new java.util.ArrayList();
                                    }
                                    arrayList6.add(dqsVar2);
                                }
                            } else {
                                defpackage.dra draVar4 = (defpackage.dra) dqvVar5;
                                if (arrayList4 == null) {
                                    arrayList4 = new java.util.ArrayList();
                                }
                                arrayList4.add(draVar4);
                                if (arrayList6 == null) {
                                    arrayList6 = new java.util.ArrayList();
                                }
                                arrayList6.add(draVar4);
                            }
                        }
                        if (dqvVar5.T.e == null) {
                            if (arrayList7 == null) {
                                arrayList7 = new java.util.ArrayList();
                            }
                            arrayList7.add(dqvVar5);
                        }
                        if (dqvVar5.U.e != null) {
                        }
                        i20 = i57 + 1;
                        size12 = i58;
                        iMax8 = i59;
                        i38 = i510;
                        iMax7 = i511;
                    }
                    i21 = iMax7;
                    i22 = iMax8;
                    i23 = i38;
                    i = size12;
                    arrayList9 = new java.util.ArrayList();
                    if (arrayList3 != null) {
                        size11 = arrayList3.size();
                        for (i37 = 0; i37 < size11; i37++) {
                            defpackage.xi.e((defpackage.dqz) arrayList3.get(i37), 0, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        size10 = arrayList4.size();
                        for (i36 = 0; i36 < size10; i36++) {
                            defpackage.dra draVar5 = (defpackage.dra) arrayList4.get(i36);
                            drq drqVarE3 = defpackage.xi.e(draVar5, 0, arrayList9, null);
                            draVar5.ag(arrayList9, 0, drqVarE3);
                            drqVarE3.b(arrayList9);
                        }
                    }
                    hashSet3 = U(2).a;
                    if (hashSet3 != null) {
                        it9 = hashSet3.iterator();
                        while (it9.hasNext()) {
                            defpackage.xi.e(((defpackage.dqu) it9.next()).d, 0, arrayList9, null);
                        }
                    }
                    hashSet4 = U(4).a;
                    if (hashSet4 != null) {
                        it8 = hashSet4.iterator();
                        while (it8.hasNext()) {
                            defpackage.xi.e(((defpackage.dqu) it8.next()).d, 0, arrayList9, null);
                        }
                    }
                    hashSet5 = U(7).a;
                    if (hashSet5 != null) {
                        it7 = hashSet5.iterator();
                        while (it7.hasNext()) {
                            defpackage.xi.e(((defpackage.dqu) it7.next()).d, 0, arrayList9, null);
                        }
                    }
                    drqVar = null;
                    i24 = 0;
                    if (arrayList7 != null) {
                        size9 = arrayList7.size();
                        i35 = 0;
                        while (i35 < size9) {
                            defpackage.xi.e((defpackage.dqv) arrayList7.get(i35), i24, arrayList9, drqVar);
                            i35++;
                            drqVar = null;
                            i24 = 0;
                        }
                    }
                    if (arrayList5 != null) {
                        size8 = arrayList5.size();
                        for (i34 = 0; i34 < size8; i34++) {
                            defpackage.xi.e((defpackage.dqz) arrayList5.get(i34), 1, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        size7 = arrayList6.size();
                        for (i33 = 0; i33 < size7; i33++) {
                            defpackage.dra draVar6 = (defpackage.dra) arrayList6.get(i33);
                            drq drqVarE4 = defpackage.xi.e(draVar6, 1, arrayList9, null);
                            draVar6.ag(arrayList9, 1, drqVarE4);
                            drqVarE4.b(arrayList9);
                        }
                    }
                    hashSet6 = U(3).a;
                    if (hashSet6 != null) {
                        it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            defpackage.xi.e(((defpackage.dqu) it6.next()).d, 1, arrayList9, null);
                        }
                    }
                    hashSet7 = U(6).a;
                    if (hashSet7 != null) {
                        it5 = hashSet7.iterator();
                        while (it5.hasNext()) {
                            defpackage.xi.e(((defpackage.dqu) it5.next()).d, 1, arrayList9, null);
                        }
                    }
                    hashSet8 = U(5).a;
                    if (hashSet8 != null) {
                        it4 = hashSet8.iterator();
                        while (it4.hasNext()) {
                            defpackage.xi.e(((defpackage.dqu) it4.next()).d, 1, arrayList9, null);
                        }
                    }
                    hashSet9 = U(7).a;
                    if (hashSet9 != null) {
                        it3 = hashSet9.iterator();
                        while (it3.hasNext()) {
                            defpackage.xi.e(((defpackage.dqu) it3.next()).d, 1, arrayList9, null);
                        }
                    }
                    drqVar2 = null;
                    i25 = 1;
                    if (arrayList8 != null) {
                        size6 = arrayList8.size();
                        i32 = 0;
                        while (i32 < size6) {
                            defpackage.xi.e((defpackage.dqv) arrayList8.get(i32), i25, arrayList9, drqVar2);
                            i32++;
                            drqVar2 = null;
                            i25 = 1;
                        }
                    }
                    for (i26 = 0; i26 < size3; i26++) {
                        defpackage.dqv dqvVar16 = (defpackage.dqv) arrayList2.get(i26);
                        iArr = dqvVar16.aA;
                        if (iArr[0] != 3) {
                        }
                    }
                    i27 = 1;
                    if (arrayList9.size() > 1) {
                        if (W() == 2) {
                            size5 = arrayList9.size();
                            drqVar3 = null;
                            i30 = 0;
                            i31 = 0;
                            while (i30 < size5) {
                                drqVar6 = (drq) arrayList9.get(i30);
                                if (drqVar6.d == i27) {
                                    iA2 = drqVar6.a(this.e, 0);
                                    if (iA2 > i31) {
                                        drqVar3 = drqVar6;
                                    }
                                    if (iA2 > i31) {
                                        i31 = iA2;
                                    }
                                }
                                i30++;
                                i27 = 1;
                            }
                            if (drqVar3 != null) {
                                aa(1);
                                M(i31);
                            } else {
                                drqVar3 = null;
                            }
                        } else {
                            drqVar3 = null;
                        }
                        if (X() == 2) {
                            size4 = arrayList9.size();
                            drqVar4 = null;
                            i29 = 0;
                            for (i28 = 0; i28 < size4; i28++) {
                                drqVar5 = (drq) arrayList9.get(i28);
                                if (drqVar5.d == 0) {
                                    iA = drqVar5.a(this.e, 1);
                                    if (iA > i29) {
                                        drqVar4 = drqVar5;
                                    }
                                    if (iA > i29) {
                                        i29 = iA;
                                    }
                                }
                            }
                            if (drqVar4 != null) {
                                ab(1);
                                B(i29);
                            } else {
                                drqVar4 = null;
                            }
                        } else {
                            drqVar4 = null;
                        }
                        if (drqVar3 == null) {
                        }
                        c2 = 2;
                        if (i39 == 2) {
                            if (i21 < j()) {
                                iJ = j();
                            } else {
                                iJ = j();
                            }
                            i39 = 2;
                            c2 = 2;
                        } else {
                            iJ = i21;
                        }
                        if (i23 == c2) {
                            if (i22 < h()) {
                                iH = h();
                            } else {
                                iH = h();
                            }
                            i23 = 2;
                        } else {
                            iH = i22;
                        }
                        i2 = iJ;
                        i4 = iH;
                        i39 = i39;
                        i3 = i23;
                        z = true;
                        break;
                    }
                    i4 = i22;
                    i3 = i23;
                    i2 = i21;
                }
            } else {
                i = size12;
                i2 = iMax7;
                i3 = i38;
                i4 = iMax8;
            }
            z = false;
            break;
        }
        int i60 = 64;
        boolean z13 = aj(64) || aj(128);
        defpackage.dpg dpgVar = this.e;
        dpgVar.f = false;
        dpgVar.g = false;
        if (this.aB != 0 && z13) {
            dpgVar.g = true;
        }
        java.util.ArrayList arrayList11 = this.aL;
        boolean z14 = W() == 2 || X() == 2;
        ar();
        int i61 = i;
        for (int i62 = 0; i62 < i61; i62++) {
            defpackage.dqv dqvVar17 = (defpackage.dqv) this.aL.get(i62);
            if (dqvVar17 instanceof defpackage.drd) {
                ((defpackage.drd) dqvVar17).ae();
            }
        }
        boolean z15 = z;
        int i63 = 1;
        int i64 = 0;
        while (i63 != 0) {
            int i65 = i64 + 1;
            try {
                dpgVar.k();
                ar();
                s(dpgVar);
                for (int i66 = 0; i66 < i61; i66++) {
                    ((defpackage.dqv) this.aL.get(i66)).s(dpgVar);
                }
                boolean zAj2 = aj(i60);
                a(dpgVar, zAj2);
                int size14 = this.aL.size();
                int i67 = 0;
                boolean z16 = false;
                while (i67 < size14) {
                    try {
                        defpackage.dqv dqvVar18 = (defpackage.dqv) this.aL.get(i67);
                        i9 = i65;
                        try {
                            dqvVar18.E(0, false);
                            dqvVar18.E(1, false);
                            z16 |= dqvVar18 instanceof defpackage.dqs;
                            i67++;
                            i65 = i9;
                        } catch (java.lang.Exception e) {
                            e = e;
                            z2 = z14;
                            i5 = i9;
                            e.printStackTrace();
                            java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                            boolean[] zArr = defpackage.drb.a;
                            zArr[2] = false;
                            zAj = aj(64);
                            ac(zAj);
                            size = this.aL.size();
                            i6 = 0;
                            z3 = false;
                            while (i6 < size) {
                                dqvVar = (defpackage.dqv) this.aL.get(i6);
                                dqvVar.ac(zAj);
                                defpackage.dpg dpgVar2 = dpgVar;
                                if (dqvVar.s == -1) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                z3 = z5 | z3;
                                i6++;
                                dpgVar = dpgVar2;
                            }
                            defpackage.dpg dpgVar3 = dpgVar;
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                for (i8 = 0; i8 < i61; i8++) {
                                    defpackage.dqv dqvVar19 = (defpackage.dqv) this.aL.get(i8);
                                    iMax3 = java.lang.Math.max(iMax3, dqvVar19.aj + dqvVar19.j());
                                    iMax4 = java.lang.Math.max(iMax4, dqvVar19.ak + dqvVar19.h());
                                }
                                iMax5 = java.lang.Math.max(this.am, iMax3);
                                iMax6 = java.lang.Math.max(this.an, iMax4);
                                if (i39 == 2) {
                                    M(iMax5);
                                    this.aA[0] = 2;
                                    z15 = true;
                                    z3 = true;
                                }
                                if (i3 == 2) {
                                    B(iMax6);
                                    this.aA[1] = 2;
                                    z15 = true;
                                    z3 = true;
                                }
                            }
                            iMax = java.lang.Math.max(this.am, j());
                            if (iMax > j()) {
                                M(iMax);
                                r5 = 1;
                                this.aA[0] = 1;
                                z15 = true;
                                z4 = true;
                            } else {
                                r5 = 1;
                                z4 = z3;
                            }
                            iMax2 = java.lang.Math.max(this.an, h());
                            if (iMax2 > h()) {
                                B(iMax2);
                                this.aA[r5] = r5;
                                r3 = r5;
                                z15 = r3 == true ? 1 : 0;
                            } else {
                                r0 = z4;
                            }
                            if (z15) {
                                r0 = r3;
                                r1 = r0;
                            } else {
                                r4 = this.aA;
                                if (r4[0] == 2) {
                                    r2 = r0;
                                    if (j() > i2) {
                                        this.aC = r5;
                                        r4[0] = r5;
                                        M(i2);
                                        ?? r6 = r5;
                                        z15 = r6 == true ? 1 : 0;
                                        r2 = r6;
                                    }
                                }
                                r0 = r3;
                                r2 = r0;
                                r2 = r0;
                                r1 = r2;
                                r1 = r2;
                                if (r4[r5] == 2) {
                                    r1 = r2;
                                    this.aD = r5;
                                    r4[r5] = r5;
                                    B(i4);
                                    r1 = 1;
                                    z15 = true;
                                }
                            }
                            if (i5 > 8) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            i63 = r1 & i7;
                            i64 = i5;
                            dpgVar = dpgVar3;
                            z14 = z2;
                            i60 = 64;
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        i9 = i65;
                    }
                }
                i9 = i65;
                if (z16) {
                    int i68 = 0;
                    while (i68 < size14) {
                        defpackage.dqv dqvVar20 = (defpackage.dqv) this.aL.get(i68);
                        if (dqvVar20 instanceof defpackage.dqs) {
                            defpackage.dqs dqsVar5 = (defpackage.dqs) dqvVar20;
                            int i69 = 0;
                            while (i69 < dqsVar5.aM) {
                                defpackage.dqv dqvVar21 = dqsVar5.aL[i69];
                                int i70 = i68;
                                if (dqsVar5.b || dqvVar21.ay()) {
                                    int i71 = dqsVar5.a;
                                    dqsVar = dqsVar5;
                                    if (i71 == 0) {
                                        z6 = true;
                                    } else if (i71 == 1) {
                                        z6 = true;
                                    } else {
                                        if (i71 != 2) {
                                            c = 3;
                                            if (i71 != 3) {
                                                continue;
                                            }
                                        } else {
                                            c = 3;
                                        }
                                        try {
                                            dqvVar21.E(1, true);
                                        } catch (java.lang.Exception e3) {
                                            e = e3;
                                            z2 = z14;
                                            i5 = i9;
                                            e.printStackTrace();
                                            java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                                            boolean[] zArr2 = defpackage.drb.a;
                                            zArr2[2] = false;
                                            zAj = aj(64);
                                            ac(zAj);
                                            size = this.aL.size();
                                            i6 = 0;
                                            z3 = false;
                                            while (i6 < size) {
                                                dqvVar = (defpackage.dqv) this.aL.get(i6);
                                                dqvVar.ac(zAj);
                                                defpackage.dpg dpgVar4 = dpgVar;
                                                if (dqvVar.s == -1) {
                                                    z5 = true;
                                                } else {
                                                    z5 = true;
                                                }
                                                z3 = z5 | z3;
                                                i6++;
                                                dpgVar = dpgVar4;
                                            }
                                            defpackage.dpg dpgVar5 = dpgVar;
                                            if (z2) {
                                                iMax3 = 0;
                                                iMax4 = 0;
                                                while (i8 < i61) {
                                                    defpackage.dqv dqvVar110 = (defpackage.dqv) this.aL.get(i8);
                                                    iMax3 = java.lang.Math.max(iMax3, dqvVar110.aj + dqvVar110.j());
                                                    iMax4 = java.lang.Math.max(iMax4, dqvVar110.ak + dqvVar110.h());
                                                }
                                                iMax5 = java.lang.Math.max(this.am, iMax3);
                                                iMax6 = java.lang.Math.max(this.an, iMax4);
                                                if (i39 == 2) {
                                                    M(iMax5);
                                                    this.aA[0] = 2;
                                                    z15 = true;
                                                    z3 = true;
                                                }
                                                if (i3 == 2) {
                                                    B(iMax6);
                                                    this.aA[1] = 2;
                                                    z15 = true;
                                                    z3 = true;
                                                }
                                            }
                                            iMax = java.lang.Math.max(this.am, j());
                                            if (iMax > j()) {
                                                M(iMax);
                                                r5 = 1;
                                                this.aA[0] = 1;
                                                z15 = true;
                                                z4 = true;
                                            } else {
                                                r5 = 1;
                                                z4 = z3;
                                            }
                                            iMax2 = java.lang.Math.max(this.an, h());
                                            if (iMax2 > h()) {
                                                B(iMax2);
                                                this.aA[r5] = r5;
                                                r3 = r5;
                                                z15 = r3 == true ? 1 : 0;
                                            } else {
                                                r0 = z4;
                                            }
                                            if (z15) {
                                                r4 = this.aA;
                                                if (r4[0] == 2) {
                                                    r2 = r0;
                                                    if (j() > i2) {
                                                        this.aC = r5;
                                                        r4[0] = r5;
                                                        M(i2);
                                                        ?? r7 = r5;
                                                        z15 = r7 == true ? 1 : 0;
                                                        r2 = r7;
                                                    }
                                                }
                                                r0 = r3;
                                                r2 = r0;
                                                r2 = r0;
                                                r1 = r2;
                                                r1 = r2;
                                                if (r4[r5] == 2) {
                                                    r1 = r2;
                                                    this.aD = r5;
                                                    r4[r5] = r5;
                                                    B(i4);
                                                    r1 = 1;
                                                    z15 = true;
                                                }
                                            } else {
                                                r0 = r3;
                                                r1 = r0;
                                            }
                                            if (i5 > 8) {
                                                i7 = 0;
                                            } else {
                                                i7 = 1;
                                            }
                                            i63 = r1 & i7;
                                            i64 = i5;
                                            dpgVar = dpgVar5;
                                            z14 = z2;
                                            i60 = 64;
                                        }
                                    }
                                    dqvVar21.E(0, z6);
                                } else {
                                    dqsVar = dqsVar5;
                                }
                                i69++;
                                i68 = i70;
                                dqsVar5 = dqsVar;
                            }
                        }
                        i68++;
                    }
                    hashSet = this.aI;
                    hashSet.clear();
                    i10 = 0;
                    while (i10 < size14) {
                        int i72 = size14;
                        boolean z17 = z14;
                        int i73 = i9;
                        dqvVar4 = (defpackage.dqv) this.aL.get(i10);
                        if (!dqvVar4.O()) {
                            if (dqvVar4 instanceof defpackage.drc) {
                                hashSet.add(dqvVar4);
                            } else {
                                dqvVar4.a(dpgVar, zAj2);
                            }
                        }
                        i10++;
                        i9 = i73;
                        size14 = i72;
                        z14 = z17;
                    }
                    while (hashSet.size() > 0) {
                        size2 = hashSet.size();
                        it = hashSet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z2 = z14;
                                break;
                            }
                            drcVar = (defpackage.drc) ((defpackage.dqv) it.next());
                            java.util.Iterator it10 = it;
                            z2 = z14;
                            for (i18 = 0; i18 < drcVar.aM; i18++) {
                                try {
                                    if (hashSet.contains(drcVar.aL[i18])) {
                                        drcVar.a(dpgVar, zAj2);
                                        hashSet.remove(drcVar);
                                        break;
                                    }
                                } catch (java.lang.Exception e4) {
                                    e = e4;
                                    i5 = i9;
                                    e.printStackTrace();
                                    java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                                    boolean[] zArr3 = defpackage.drb.a;
                                    zArr3[2] = false;
                                    zAj = aj(64);
                                    ac(zAj);
                                    size = this.aL.size();
                                    i6 = 0;
                                    z3 = false;
                                    while (i6 < size) {
                                        dqvVar = (defpackage.dqv) this.aL.get(i6);
                                        dqvVar.ac(zAj);
                                        defpackage.dpg dpgVar6 = dpgVar;
                                        if (dqvVar.s == -1) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        z3 = z5 | z3;
                                        i6++;
                                        dpgVar = dpgVar6;
                                    }
                                    defpackage.dpg dpgVar7 = dpgVar;
                                    if (z2) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i8 < i61) {
                                            defpackage.dqv dqvVar111 = (defpackage.dqv) this.aL.get(i8);
                                            iMax3 = java.lang.Math.max(iMax3, dqvVar111.aj + dqvVar111.j());
                                            iMax4 = java.lang.Math.max(iMax4, dqvVar111.ak + dqvVar111.h());
                                        }
                                        iMax5 = java.lang.Math.max(this.am, iMax3);
                                        iMax6 = java.lang.Math.max(this.an, iMax4);
                                        if (i39 == 2) {
                                            M(iMax5);
                                            this.aA[0] = 2;
                                            z15 = true;
                                            z3 = true;
                                        }
                                        if (i3 == 2) {
                                            B(iMax6);
                                            this.aA[1] = 2;
                                            z15 = true;
                                            z3 = true;
                                        }
                                    }
                                    iMax = java.lang.Math.max(this.am, j());
                                    if (iMax > j()) {
                                        M(iMax);
                                        r5 = 1;
                                        this.aA[0] = 1;
                                        z15 = true;
                                        z4 = true;
                                    } else {
                                        r5 = 1;
                                        z4 = z3;
                                    }
                                    iMax2 = java.lang.Math.max(this.an, h());
                                    if (iMax2 > h()) {
                                        B(iMax2);
                                        this.aA[r5] = r5;
                                        r3 = r5;
                                        z15 = r3 == true ? 1 : 0;
                                    } else {
                                        r0 = z4;
                                    }
                                    if (z15) {
                                        r4 = this.aA;
                                        if (r4[0] == 2) {
                                            r2 = r0;
                                            if (j() > i2) {
                                                this.aC = r5;
                                                r4[0] = r5;
                                                M(i2);
                                                ?? r8 = r5;
                                                z15 = r8 == true ? 1 : 0;
                                                r2 = r8;
                                            }
                                        }
                                        r0 = r3;
                                        r2 = r0;
                                        r2 = r0;
                                        r1 = r2;
                                        r1 = r2;
                                        if (r4[r5] == 2) {
                                            r1 = r2;
                                            this.aD = r5;
                                            r4[r5] = r5;
                                            B(i4);
                                            r1 = 1;
                                            z15 = true;
                                        }
                                    } else {
                                        r0 = r3;
                                        r1 = r0;
                                    }
                                    if (i5 > 8) {
                                        i7 = 0;
                                    } else {
                                        i7 = 1;
                                    }
                                    i63 = r1 & i7;
                                    i64 = i5;
                                    dpgVar = dpgVar7;
                                    z14 = z2;
                                    i60 = 64;
                                }
                            }
                            it = it10;
                            z14 = z2;
                        }
                        if (size2 == hashSet.size()) {
                            it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                ((defpackage.dqv) it2.next()).a(dpgVar, zAj2);
                            }
                            hashSet.clear();
                        }
                        z14 = z2;
                    }
                    z2 = z14;
                    if (defpackage.dpg.a) {
                        try {
                            hashSet2 = new java.util.HashSet();
                            for (i11 = 0; i11 < size14; i11++) {
                                dqvVar2 = (defpackage.dqv) this.aL.get(i11);
                                if (!dqvVar2.O()) {
                                    hashSet2.add(dqvVar2);
                                }
                            }
                            if (W() == 2) {
                                i12 = 0;
                            } else {
                                i12 = 1;
                            }
                            i5 = i9;
                            try {
                                p(this, dpgVar, hashSet2, i12, false);
                                for (defpackage.dqv dqvVar22 : hashSet2) {
                                    defpackage.drb.a(this, dpgVar, dqvVar22);
                                    dqvVar22.a(dpgVar, zAj2);
                                }
                            } catch (java.lang.Exception e5) {
                                e = e5;
                                e.printStackTrace();
                                java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                                boolean[] zArr4 = defpackage.drb.a;
                                zArr4[2] = false;
                                zAj = aj(64);
                                ac(zAj);
                                size = this.aL.size();
                                i6 = 0;
                                z3 = false;
                                while (i6 < size) {
                                    dqvVar = (defpackage.dqv) this.aL.get(i6);
                                    dqvVar.ac(zAj);
                                    defpackage.dpg dpgVar8 = dpgVar;
                                    if (dqvVar.s == -1) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                    z3 = z5 | z3;
                                    i6++;
                                    dpgVar = dpgVar8;
                                }
                                defpackage.dpg dpgVar9 = dpgVar;
                                if (z2) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i8 < i61) {
                                        defpackage.dqv dqvVar112 = (defpackage.dqv) this.aL.get(i8);
                                        iMax3 = java.lang.Math.max(iMax3, dqvVar112.aj + dqvVar112.j());
                                        iMax4 = java.lang.Math.max(iMax4, dqvVar112.ak + dqvVar112.h());
                                    }
                                    iMax5 = java.lang.Math.max(this.am, iMax3);
                                    iMax6 = java.lang.Math.max(this.an, iMax4);
                                    if (i39 == 2) {
                                        M(iMax5);
                                        this.aA[0] = 2;
                                        z15 = true;
                                        z3 = true;
                                    }
                                    if (i3 == 2) {
                                        B(iMax6);
                                        this.aA[1] = 2;
                                        z15 = true;
                                        z3 = true;
                                    }
                                }
                                iMax = java.lang.Math.max(this.am, j());
                                if (iMax > j()) {
                                    M(iMax);
                                    r5 = 1;
                                    this.aA[0] = 1;
                                    z15 = true;
                                    z4 = true;
                                } else {
                                    r5 = 1;
                                    z4 = z3;
                                }
                                iMax2 = java.lang.Math.max(this.an, h());
                                if (iMax2 > h()) {
                                    B(iMax2);
                                    this.aA[r5] = r5;
                                    r3 = r5;
                                    z15 = r3 == true ? 1 : 0;
                                } else {
                                    r0 = z4;
                                }
                                if (z15) {
                                    r4 = this.aA;
                                    if (r4[0] == 2) {
                                        r2 = r0;
                                        if (j() > i2) {
                                            this.aC = r5;
                                            r4[0] = r5;
                                            M(i2);
                                            ?? r9 = r5;
                                            z15 = r9 == true ? 1 : 0;
                                            r2 = r9;
                                        }
                                    }
                                    r0 = r3;
                                    r2 = r0;
                                    r2 = r0;
                                    r1 = r2;
                                    r1 = r2;
                                    if (r4[r5] == 2) {
                                        r1 = r2;
                                        this.aD = r5;
                                        r4[r5] = r5;
                                        B(i4);
                                        r1 = 1;
                                        z15 = true;
                                    }
                                } else {
                                    r0 = r3;
                                    r1 = r0;
                                }
                                if (i5 > 8) {
                                    i7 = 0;
                                } else {
                                    i7 = 1;
                                }
                                i63 = r1 & i7;
                                i64 = i5;
                                dpgVar = dpgVar9;
                                z14 = z2;
                                i60 = 64;
                            }
                        } catch (java.lang.Exception e6) {
                            e = e6;
                            i5 = i9;
                        }
                    } else {
                        i5 = i9;
                        i13 = 0;
                        while (i13 < size14) {
                            dqvVar3 = (defpackage.dqv) this.aL.get(i13);
                            if (dqvVar3 instanceof defpackage.dqw) {
                                int[] iArr3 = dqvVar3.aA;
                                i16 = iArr3[0];
                                i14 = i13;
                                i17 = iArr3[1];
                                i15 = size14;
                                if (i16 == 2) {
                                    dqvVar3.aa(1);
                                    i16 = 2;
                                }
                                if (i17 == 2) {
                                    dqvVar3.ab(1);
                                    i17 = 2;
                                }
                                dqvVar3.a(dpgVar, zAj2);
                                if (i16 == 2) {
                                    dqvVar3.aa(2);
                                }
                                if (i17 == 2) {
                                    dqvVar3.ab(2);
                                }
                            } else {
                                i14 = i13;
                                i15 = size14;
                                defpackage.drb.a(this, dpgVar, dqvVar3);
                                if (!dqvVar3.O()) {
                                    dqvVar3.a(dpgVar, zAj2);
                                }
                            }
                            i13 = i14 + 1;
                            size14 = i15;
                        }
                    }
                    if (this.h > 0) {
                        arrayList = null;
                        try {
                            defpackage.xi.h(this, dpgVar, null, 0);
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            e.printStackTrace();
                            java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                            boolean[] zArr5 = defpackage.drb.a;
                            zArr5[2] = false;
                            zAj = aj(64);
                            ac(zAj);
                            size = this.aL.size();
                            i6 = 0;
                            z3 = false;
                            while (i6 < size) {
                                dqvVar = (defpackage.dqv) this.aL.get(i6);
                                dqvVar.ac(zAj);
                                defpackage.dpg dpgVar10 = dpgVar;
                                if (dqvVar.s == -1) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                z3 = z5 | z3;
                                i6++;
                                dpgVar = dpgVar10;
                            }
                            defpackage.dpg dpgVar11 = dpgVar;
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i8 < i61) {
                                    defpackage.dqv dqvVar113 = (defpackage.dqv) this.aL.get(i8);
                                    iMax3 = java.lang.Math.max(iMax3, dqvVar113.aj + dqvVar113.j());
                                    iMax4 = java.lang.Math.max(iMax4, dqvVar113.ak + dqvVar113.h());
                                }
                                iMax5 = java.lang.Math.max(this.am, iMax3);
                                iMax6 = java.lang.Math.max(this.an, iMax4);
                                if (i39 == 2) {
                                    M(iMax5);
                                    this.aA[0] = 2;
                                    z15 = true;
                                    z3 = true;
                                }
                                if (i3 == 2) {
                                    B(iMax6);
                                    this.aA[1] = 2;
                                    z15 = true;
                                    z3 = true;
                                }
                            }
                            iMax = java.lang.Math.max(this.am, j());
                            if (iMax > j()) {
                                M(iMax);
                                r5 = 1;
                                this.aA[0] = 1;
                                z15 = true;
                                z4 = true;
                            } else {
                                r5 = 1;
                                z4 = z3;
                            }
                            iMax2 = java.lang.Math.max(this.an, h());
                            if (iMax2 > h()) {
                                B(iMax2);
                                this.aA[r5] = r5;
                                r3 = r5;
                                z15 = r3 == true ? 1 : 0;
                            } else {
                                r0 = z4;
                            }
                            if (z15) {
                                r4 = this.aA;
                                if (r4[0] == 2) {
                                    r2 = r0;
                                    if (j() > i2) {
                                        this.aC = r5;
                                        r4[0] = r5;
                                        M(i2);
                                        ?? r10 = r5;
                                        z15 = r10 == true ? 1 : 0;
                                        r2 = r10;
                                    }
                                }
                                r0 = r3;
                                r2 = r0;
                                r2 = r0;
                                r1 = r2;
                                r1 = r2;
                                if (r4[r5] == 2) {
                                    r1 = r2;
                                    this.aD = r5;
                                    r4[r5] = r5;
                                    B(i4);
                                    r1 = 1;
                                    z15 = true;
                                }
                            } else {
                                r0 = r3;
                                r1 = r0;
                            }
                            if (i5 > 8) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            i63 = r1 & i7;
                            i64 = i5;
                            dpgVar = dpgVar11;
                            z14 = z2;
                            i60 = 64;
                        }
                    } else {
                        arrayList = null;
                    }
                    if (this.i > 0) {
                        defpackage.xi.h(this, dpgVar, arrayList, 1);
                    }
                    weakReference = this.aE;
                    if (weakReference != null && weakReference.get() != null) {
                        aq((defpackage.dqu) this.aE.get(), dpgVar.b(this.U));
                        this.aE = null;
                    }
                    weakReference2 = this.aG;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ap((defpackage.dqu) this.aG.get(), dpgVar.b(this.W));
                        this.aG = null;
                    }
                    weakReference3 = this.aF;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        aq((defpackage.dqu) this.aF.get(), dpgVar.b(this.T));
                        this.aF = null;
                    }
                    weakReference4 = this.aH;
                    if (weakReference4 == null && weakReference4.get() != null) {
                        ap((defpackage.dqu) this.aH.get(), dpgVar.b(this.V));
                        try {
                            this.aH = null;
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            e.printStackTrace();
                            java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                        }
                    }
                    dpgVar.j();
                } else {
                    hashSet = this.aI;
                    hashSet.clear();
                    i10 = 0;
                    while (i10 < size14) {
                        int i74 = size14;
                        boolean z18 = z14;
                        int i75 = i9;
                        dqvVar4 = (defpackage.dqv) this.aL.get(i10);
                        if (!dqvVar4.O()) {
                            if (dqvVar4 instanceof defpackage.drc) {
                                hashSet.add(dqvVar4);
                            } else {
                                dqvVar4.a(dpgVar, zAj2);
                            }
                        }
                        i10++;
                        i9 = i75;
                        size14 = i74;
                        z14 = z18;
                    }
                    while (hashSet.size() > 0) {
                        size2 = hashSet.size();
                        it = hashSet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z2 = z14;
                                break;
                            }
                            drcVar = (defpackage.drc) ((defpackage.dqv) it.next());
                            java.util.Iterator it11 = it;
                            z2 = z14;
                            while (i18 < drcVar.aM) {
                                if (hashSet.contains(drcVar.aL[i18])) {
                                    drcVar.a(dpgVar, zAj2);
                                    hashSet.remove(drcVar);
                                    break;
                                }
                            }
                            it = it11;
                            z14 = z2;
                        }
                        if (size2 == hashSet.size()) {
                            it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                ((defpackage.dqv) it2.next()).a(dpgVar, zAj2);
                            }
                            hashSet.clear();
                        }
                        z14 = z2;
                    }
                    z2 = z14;
                    if (defpackage.dpg.a) {
                        hashSet2 = new java.util.HashSet();
                        while (i11 < size14) {
                            dqvVar2 = (defpackage.dqv) this.aL.get(i11);
                            if (!dqvVar2.O()) {
                                hashSet2.add(dqvVar2);
                            }
                        }
                        if (W() == 2) {
                            i12 = 0;
                        } else {
                            i12 = 1;
                        }
                        i5 = i9;
                        p(this, dpgVar, hashSet2, i12, false);
                        while (r2.hasNext()) {
                            defpackage.drb.a(this, dpgVar, dqvVar22);
                            dqvVar22.a(dpgVar, zAj2);
                        }
                    } else {
                        i5 = i9;
                        i13 = 0;
                        while (i13 < size14) {
                            dqvVar3 = (defpackage.dqv) this.aL.get(i13);
                            if (dqvVar3 instanceof defpackage.dqw) {
                                int[] iArr4 = dqvVar3.aA;
                                i16 = iArr4[0];
                                i14 = i13;
                                i17 = iArr4[1];
                                i15 = size14;
                                if (i16 == 2) {
                                    dqvVar3.aa(1);
                                    i16 = 2;
                                }
                                if (i17 == 2) {
                                    dqvVar3.ab(1);
                                    i17 = 2;
                                }
                                dqvVar3.a(dpgVar, zAj2);
                                if (i16 == 2) {
                                    dqvVar3.aa(2);
                                }
                                if (i17 == 2) {
                                    dqvVar3.ab(2);
                                }
                            } else {
                                i14 = i13;
                                i15 = size14;
                                defpackage.drb.a(this, dpgVar, dqvVar3);
                                if (!dqvVar3.O()) {
                                    dqvVar3.a(dpgVar, zAj2);
                                }
                            }
                            i13 = i14 + 1;
                            size14 = i15;
                        }
                    }
                    if (this.h > 0) {
                        arrayList = null;
                        defpackage.xi.h(this, dpgVar, null, 0);
                    } else {
                        arrayList = null;
                    }
                    if (this.i > 0) {
                        defpackage.xi.h(this, dpgVar, arrayList, 1);
                    }
                    weakReference = this.aE;
                    if (weakReference != null) {
                        aq((defpackage.dqu) this.aE.get(), dpgVar.b(this.U));
                        this.aE = null;
                    }
                    weakReference2 = this.aG;
                    if (weakReference2 != null) {
                        ap((defpackage.dqu) this.aG.get(), dpgVar.b(this.W));
                        this.aG = null;
                    }
                    weakReference3 = this.aF;
                    if (weakReference3 != null) {
                        aq((defpackage.dqu) this.aF.get(), dpgVar.b(this.T));
                        this.aF = null;
                    }
                    weakReference4 = this.aH;
                    if (weakReference4 == null) {
                    }
                    dpgVar.j();
                }
            } catch (java.lang.Exception e9) {
                e = e9;
                i5 = i65;
                z2 = z14;
            }
            boolean[] zArr6 = defpackage.drb.a;
            zArr6[2] = false;
            zAj = aj(64);
            ac(zAj);
            size = this.aL.size();
            i6 = 0;
            z3 = false;
            while (i6 < size) {
                dqvVar = (defpackage.dqv) this.aL.get(i6);
                dqvVar.ac(zAj);
                defpackage.dpg dpgVar12 = dpgVar;
                if (dqvVar.s == -1 || dqvVar.t != -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z3 = z5 | z3;
                i6++;
                dpgVar = dpgVar12;
            }
            defpackage.dpg dpgVar13 = dpgVar;
            if (z2 && i5 < 8 && zArr6[2]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i8 < i61) {
                    defpackage.dqv dqvVar114 = (defpackage.dqv) this.aL.get(i8);
                    iMax3 = java.lang.Math.max(iMax3, dqvVar114.aj + dqvVar114.j());
                    iMax4 = java.lang.Math.max(iMax4, dqvVar114.ak + dqvVar114.h());
                }
                iMax5 = java.lang.Math.max(this.am, iMax3);
                iMax6 = java.lang.Math.max(this.an, iMax4);
                if (i39 == 2 && j() < iMax5) {
                    M(iMax5);
                    this.aA[0] = 2;
                    z15 = true;
                    z3 = true;
                }
                if (i3 == 2 && h() < iMax6) {
                    B(iMax6);
                    this.aA[1] = 2;
                    z15 = true;
                    z3 = true;
                }
            }
            iMax = java.lang.Math.max(this.am, j());
            if (iMax > j()) {
                M(iMax);
                r5 = 1;
                this.aA[0] = 1;
                z15 = true;
                z4 = true;
            } else {
                r5 = 1;
                z4 = z3;
            }
            iMax2 = java.lang.Math.max(this.an, h());
            if (iMax2 > h()) {
                B(iMax2);
                this.aA[r5] = r5;
                r3 = r5;
                z15 = r3 == true ? 1 : 0;
            } else {
                r0 = z4;
            }
            if (z15) {
                r4 = this.aA;
                if (r4[0] == 2 && i2 > 0) {
                    r2 = r0;
                    if (j() > i2) {
                        this.aC = r5;
                        r4[0] = r5;
                        M(i2);
                        ?? r11 = r5;
                        z15 = r11 == true ? 1 : 0;
                        r2 = r11;
                    }
                }
                r0 = r3;
                r2 = r0;
                r2 = r0;
                r1 = r2;
                r1 = r2;
                if (r4[r5] == 2 && i4 > 0 && h() > i4) {
                    r1 = r2;
                    this.aD = r5;
                    r4[r5] = r5;
                    B(i4);
                    r1 = 1;
                    z15 = true;
                }
            } else {
                r0 = r3;
                r1 = r0;
            }
            if (i5 > 8) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            i63 = r1 & i7;
            i64 = i5;
            dpgVar = dpgVar13;
            z14 = z2;
            i60 = 64;
        }
        this.aL = arrayList11;
        if (z15) {
            int[] iArr5 = this.aA;
            iArr5[0] = i39;
            iArr5[1] = i3;
        }
        ad(this.e.j);
    }

    public final void af(defpackage.drf drfVar) {
        this.c = drfVar;
        this.a.f = drfVar;
    }

    public final void ag(int i) {
        this.aB = i;
        defpackage.dpg.a = aj(512);
    }

    public final void ah() {
        this.aK.m(this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:71:0x003c A[SYNTHETIC] */
    public final boolean ai(boolean z, int i) {
        boolean z2;
        java.util.ArrayList arrayList;
        int size;
        int i2;
        boolean z3;
        defpackage.drr drrVar;
        defpackage.dri driVar = this.a;
        defpackage.dqw dqwVar = driVar.a;
        boolean z4 = false;
        int iV = dqwVar.V(0);
        int iV2 = dqwVar.V(1);
        int iK = dqwVar.k();
        int iL = dqwVar.l();
        if (z) {
            if (iV == 2) {
                arrayList = driVar.e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    drrVar = (defpackage.drr) arrayList.get(i2);
                    if (drrVar.f != i && !drrVar.e()) {
                        z3 = false;
                        break;
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3 && iV == 2) {
                        dqwVar.aa(1);
                        dqwVar.M(driVar.a(dqwVar, 0));
                        dqwVar.o.e.c(dqwVar.j());
                    }
                } else if (z3 && iV2 == 2) {
                    dqwVar.ab(1);
                    dqwVar.B(driVar.a(dqwVar, 1));
                    dqwVar.p.e.c(dqwVar.h());
                }
            } else if (iV2 == 2) {
                iV2 = 2;
                arrayList = driVar.e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    drrVar = (defpackage.drr) arrayList.get(i2);
                    if (drrVar.f != i) {
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3) {
                        dqwVar.aa(1);
                        dqwVar.M(driVar.a(dqwVar, 0));
                        dqwVar.o.e.c(dqwVar.j());
                    }
                } else if (z3) {
                    dqwVar.ab(1);
                    dqwVar.B(driVar.a(dqwVar, 1));
                    dqwVar.p.e.c(dqwVar.h());
                }
            }
        }
        if (i == 0) {
            int i3 = dqwVar.aA[0];
            if (i3 == 1 || i3 == 4) {
                int iJ = dqwVar.j() + iK;
                dqwVar.o.i.c(iJ);
                dqwVar.o.e.c(iJ - iK);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = dqwVar.aA[1];
            if (i4 == 1 || i4 == 4) {
                int iH = dqwVar.h() + iL;
                dqwVar.p.i.c(iH);
                dqwVar.p.e.c(iH - iL);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        driVar.c();
        java.util.ArrayList arrayList2 = driVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            defpackage.drr drrVar2 = (defpackage.drr) arrayList2.get(i5);
            if (drrVar2.f == i && (drrVar2.d != dqwVar || drrVar2.g)) {
                drrVar2.c();
            }
        }
        int size3 = arrayList2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            defpackage.drr drrVar3 = (defpackage.drr) arrayList2.get(i6);
            if (drrVar3.f == i && ((z2 || drrVar3.d != dqwVar) && !(drrVar3.h.i && drrVar3.i.i && ((drrVar3 instanceof drg) || drrVar3.e.i)))) {
                dqwVar.aa(iV);
                dqwVar.ab(iV2);
                return z4;
            }
        }
        z4 = true;
        dqwVar.aa(iV);
        dqwVar.ab(iV2);
        return z4;
    }

    public final boolean aj(int i) {
        return (this.aB & i) == i;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01df  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:117:0x0203  */
    /* JADX WARN: Code duplicated, block: B:121:0x0211  */
    /* JADX WARN: Code duplicated, block: B:125:0x021e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0268  */
    /* JADX WARN: Code duplicated, block: B:153:0x0273 A[LOOP:9: B:152:0x0271->B:153:0x0273, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:162:0x0301  */
    /* JADX WARN: Code duplicated, block: B:177:0x033d  */
    /* JADX WARN: Code duplicated, block: B:333:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:86:0x015b A[PHI: r12
  0x015b: PHI (r12v40 int) = (r12v42 int), (r12v39 int) binds: [B:91:0x0164, B:84:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    public final void ak(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        boolean z2;
        int i8;
        boolean zAi;
        int i9;
        int i10;
        java.util.ArrayList arrayList;
        int i11;
        int i12;
        char c;
        boolean z3;
        boolean z4;
        dro droVar;
        drp drpVar;
        defpackage.dri driVar;
        boolean z5;
        int i13;
        boolean zAi2;
        java.util.ArrayList arrayList2;
        int size;
        int i14;
        int i15;
        boolean z6;
        boolean z7;
        int[] iArr;
        int i16;
        int i17;
        boolean z8;
        java.util.ArrayList arrayList3;
        int size2;
        int i18;
        int size3;
        int i19;
        defpackage.drr drrVar;
        int i20;
        boolean zE;
        this.f = i6;
        this.g = i7;
        defpackage.drf drfVar = this.c;
        int size4 = this.aL.size();
        boolean z9 = false;
        boolean z10 = (i & 128) == 128;
        int iJ = j();
        int iH = h();
        boolean z11 = z10 || (i & 64) == 64;
        if (z11) {
            int i21 = 0;
            while (i21 < size4) {
                defpackage.dqv dqvVar = (defpackage.dqv) this.aL.get(i21);
                boolean z12 = dqvVar.W() == 3 && dqvVar.X() == 3 && dqvVar.ah > 0.0f;
                if (dqvVar.R()) {
                    if (!z12) {
                        z12 = false;
                        i21 = dqvVar.S() ? i21 + 1 : i21 + 1;
                    }
                } else if ((dqvVar.S() || !z12) && !(dqvVar instanceof defpackage.drc) && !dqvVar.R() && !dqvVar.S()) {
                }
                z11 = false;
                break;
            }
        }
        int i22 = i2;
        int i23 = i4;
        if (i22 != 1073741824) {
            if (z10) {
                z = true;
            } else {
                z = false;
            }
        } else if (i23 != 1073741824) {
            i22 = 1073741824;
            if (z10) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
            i22 = 1073741824;
            i23 = 1073741824;
        }
        boolean z13 = z11 & z;
        if (z13) {
            int[] iArr2 = this.N;
            int iMin = java.lang.Math.min(iArr2[0], i3);
            int iMin2 = java.lang.Math.min(iArr2[1], i5);
            boolean z14 = i22 != 1073741824;
            if (i22 == 1073741824 && j() != iMin) {
                M(iMin);
                c();
            }
            boolean z15 = i23 != 1073741824;
            if (i23 == 1073741824 && h() != iMin2) {
                B(iMin2);
                c();
            }
            if (i22 != 1073741824) {
                z2 = z13;
                driVar = this.a;
                if (driVar.b) {
                    defpackage.dqw dqwVar = driVar.a;
                    arrayList2 = dqwVar.aL;
                    size = arrayList2.size();
                    i14 = 0;
                    while (i14 < size) {
                        defpackage.dqv dqvVar2 = (defpackage.dqv) arrayList2.get(i14);
                        dqvVar2.t();
                        dqvVar2.l = false;
                        java.util.ArrayList arrayList4 = arrayList2;
                        dro droVar2 = dqvVar2.o;
                        droVar2.e.i = false;
                        droVar2.g = false;
                        droVar2.g();
                        drp drpVar2 = dqvVar2.p;
                        drpVar2.e.i = false;
                        drpVar2.g = false;
                        drpVar2.g();
                        i14++;
                        z15 = z15;
                        arrayList2 = arrayList4;
                        size4 = size4;
                    }
                    i8 = size4;
                    z5 = z15;
                    i13 = 0;
                    dqwVar.t();
                    dqwVar.l = false;
                    dro droVar3 = dqwVar.o;
                    droVar3.e.i = false;
                    droVar3.g = false;
                    droVar3.g();
                    drp drpVar3 = dqwVar.p;
                    drpVar3.e.i = false;
                    drpVar3.g = false;
                    drpVar3.g();
                    driVar.b();
                } else {
                    i8 = size4;
                    z5 = z15;
                    i13 = 0;
                }
                driVar.d(driVar.d);
                defpackage.dqw dqwVar2 = driVar.a;
                dqwVar2.aj = i13;
                dqwVar2.ak = i13;
                dqwVar2.o.h.c(i13);
                dqwVar2.p.h.c(i13);
                if (i22 == 1073741824) {
                    zAi2 = ai(z10, i13);
                    i9 = 1;
                } else {
                    i9 = 0;
                    zAi2 = true;
                }
                if (i23 == 1073741824) {
                    zAi = ai(z10, 1) & zAi2;
                    i9++;
                } else {
                    zAi = zAi2;
                }
            } else if (i23 == 1073741824) {
                defpackage.dri driVar2 = this.a;
                if (driVar2.b || driVar2.c) {
                    defpackage.dqw dqwVar3 = driVar2.a;
                    java.util.ArrayList arrayList5 = dqwVar3.aL;
                    int size5 = arrayList5.size();
                    int i24 = 0;
                    while (i24 < size5) {
                        defpackage.dqv dqvVar3 = (defpackage.dqv) arrayList5.get(i24);
                        dqvVar3.t();
                        dqvVar3.l = z9;
                        dqvVar3.o.g();
                        dqvVar3.p.g();
                        i24++;
                        z9 = false;
                    }
                    dqwVar3.t();
                    i15 = 0;
                    dqwVar3.l = false;
                    dqwVar3.o.g();
                    dqwVar3.p.g();
                    driVar2.c = false;
                } else {
                    i15 = 0;
                }
                driVar2.d(driVar2.d);
                defpackage.dqw dqwVar4 = driVar2.a;
                dqwVar4.aj = i15;
                dqwVar4.ak = i15;
                int iV = dqwVar4.V(i15);
                int iV2 = dqwVar4.V(1);
                if (driVar2.b) {
                    driVar2.b();
                }
                int iK = dqwVar4.k();
                int iL = dqwVar4.l();
                dqwVar4.o.h.c(iK);
                dqwVar4.p.h.c(iL);
                driVar2.c();
                if (iV != 2) {
                    if (iV2 == 2) {
                        z6 = true;
                        z7 = !z10;
                        iV2 = 2;
                    } else {
                        z2 = z13;
                    }
                    iArr = dqwVar4.aA;
                    i16 = iArr[0];
                    if (i16 != 1 || i16 == 4) {
                        int iJ2 = dqwVar4.j() + iK;
                        dqwVar4.o.i.c(iJ2);
                        dqwVar4.o.e.c(iJ2 - iK);
                        driVar2.c();
                        i17 = iArr[1];
                        if (i17 != 1 || i17 == 4) {
                            int iH2 = dqwVar4.h() + iL;
                            dqwVar4.p.i.c(iH2);
                            dqwVar4.p.e.c(iH2 - iL);
                        }
                        driVar2.c();
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    arrayList3 = driVar2.e;
                    size2 = arrayList3.size();
                    for (i18 = 0; i18 < size2; i18++) {
                        drrVar = (defpackage.drr) arrayList3.get(i18);
                        if (drrVar.d == dqwVar4 || drrVar.g) {
                            drrVar.c();
                        }
                    }
                    size3 = arrayList3.size();
                    i19 = 0;
                    while (true) {
                        if (i19 < size3) {
                            zAi = true;
                            break;
                        }
                        defpackage.drr drrVar2 = (defpackage.drr) arrayList3.get(i19);
                        if ((!z8 || drrVar2.d != dqwVar4) && (!drrVar2.h.i || ((!drrVar2.i.i && !(drrVar2 instanceof drm)) || (!drrVar2.e.i && !(drrVar2 instanceof drg) && !(drrVar2 instanceof drm))))) {
                            zAi = false;
                            break;
                        }
                        i19++;
                    }
                    dqwVar4.aa(iV);
                    dqwVar4.ab(iV2);
                    i8 = size4;
                    z5 = z15;
                    i9 = 2;
                } else {
                    z6 = true;
                    z7 = !z10;
                }
                if (z6 != z7) {
                    java.util.ArrayList arrayList6 = driVar2.e;
                    int size6 = arrayList6.size();
                    z2 = z13;
                    int i25 = 0;
                    do {
                        if (i25 >= size6) {
                            if (iV == 2) {
                                i20 = 1;
                                dqwVar4.aa(1);
                                dqwVar4.M(driVar2.a(dqwVar4, 0));
                                dqwVar4.o.e.c(dqwVar4.j());
                                iV = 2;
                            } else {
                                i20 = 1;
                            }
                            if (iV2 != 2) {
                                break;
                            }
                            dqwVar4.ab(i20);
                            dqwVar4.B(driVar2.a(dqwVar4, i20));
                            dqwVar4.p.e.c(dqwVar4.h());
                            break;
                        }
                        zE = ((defpackage.drr) arrayList6.get(i25)).e();
                        i25++;
                    } while (zE);
                } else {
                    z2 = z13;
                }
                iArr = dqwVar4.aA;
                i16 = iArr[0];
                if (i16 != 1) {
                    int iJ3 = dqwVar4.j() + iK;
                    dqwVar4.o.i.c(iJ3);
                    dqwVar4.o.e.c(iJ3 - iK);
                    driVar2.c();
                    i17 = iArr[1];
                    if (i17 != 1) {
                        int iH3 = dqwVar4.h() + iL;
                        dqwVar4.p.i.c(iH3);
                        dqwVar4.p.e.c(iH3 - iL);
                    } else {
                        int iH4 = dqwVar4.h() + iL;
                        dqwVar4.p.i.c(iH4);
                        dqwVar4.p.e.c(iH4 - iL);
                    }
                    driVar2.c();
                    z8 = true;
                } else {
                    int iJ4 = dqwVar4.j() + iK;
                    dqwVar4.o.i.c(iJ4);
                    dqwVar4.o.e.c(iJ4 - iK);
                    driVar2.c();
                    i17 = iArr[1];
                    if (i17 != 1) {
                        int iH5 = dqwVar4.h() + iL;
                        dqwVar4.p.i.c(iH5);
                        dqwVar4.p.e.c(iH5 - iL);
                    } else {
                        int iH6 = dqwVar4.h() + iL;
                        dqwVar4.p.i.c(iH6);
                        dqwVar4.p.e.c(iH6 - iL);
                    }
                    driVar2.c();
                    z8 = true;
                }
                arrayList3 = driVar2.e;
                size2 = arrayList3.size();
                while (i18 < size2) {
                    drrVar = (defpackage.drr) arrayList3.get(i18);
                    if (drrVar.d == dqwVar4) {
                        drrVar.c();
                    } else {
                        drrVar.c();
                    }
                }
                size3 = arrayList3.size();
                i19 = 0;
                while (true) {
                    if (i19 < size3) {
                        zAi = true;
                        break;
                    }
                    defpackage.drr drrVar3 = (defpackage.drr) arrayList3.get(i19);
                    if (!z8) {
                        zAi = false;
                        break;
                    } else {
                        zAi = false;
                        break;
                    }
                    i19++;
                }
                dqwVar4.aa(iV);
                dqwVar4.ab(iV2);
                i8 = size4;
                z5 = z15;
                i9 = 2;
            } else {
                i22 = 1073741824;
                z2 = z13;
                driVar = this.a;
                if (driVar.b) {
                    defpackage.dqw dqwVar5 = driVar.a;
                    arrayList2 = dqwVar5.aL;
                    size = arrayList2.size();
                    i14 = 0;
                    while (i14 < size) {
                        defpackage.dqv dqvVar4 = (defpackage.dqv) arrayList2.get(i14);
                        dqvVar4.t();
                        dqvVar4.l = false;
                        java.util.ArrayList arrayList7 = arrayList2;
                        dro droVar4 = dqvVar4.o;
                        droVar4.e.i = false;
                        droVar4.g = false;
                        droVar4.g();
                        drp drpVar4 = dqvVar4.p;
                        drpVar4.e.i = false;
                        drpVar4.g = false;
                        drpVar4.g();
                        i14++;
                        z15 = z15;
                        arrayList2 = arrayList7;
                        size4 = size4;
                    }
                    i8 = size4;
                    z5 = z15;
                    i13 = 0;
                    dqwVar5.t();
                    dqwVar5.l = false;
                    dro droVar5 = dqwVar5.o;
                    droVar5.e.i = false;
                    droVar5.g = false;
                    droVar5.g();
                    drp drpVar5 = dqwVar5.p;
                    drpVar5.e.i = false;
                    drpVar5.g = false;
                    drpVar5.g();
                    driVar.b();
                } else {
                    i8 = size4;
                    z5 = z15;
                    i13 = 0;
                }
                driVar.d(driVar.d);
                defpackage.dqw dqwVar6 = driVar.a;
                dqwVar6.aj = i13;
                dqwVar6.ak = i13;
                dqwVar6.o.h.c(i13);
                dqwVar6.p.h.c(i13);
                if (i22 == 1073741824) {
                    zAi2 = ai(z10, i13);
                    i9 = 1;
                } else {
                    i9 = 0;
                    zAi2 = true;
                }
                if (i23 == 1073741824) {
                    zAi = ai(z10, 1) & zAi2;
                    i9++;
                } else {
                    zAi = zAi2;
                }
            }
            if (zAi) {
                N(!z14, !z5);
            }
        } else {
            z2 = z13;
            i8 = size4;
            zAi = false;
            i9 = 0;
        }
        if (zAi && i9 == 2) {
            return;
        }
        defpackage.ngb ngbVar = this.aK;
        int i26 = this.aB;
        if (i8 > 0) {
            int size7 = this.aL.size();
            boolean zAj = aj(64);
            defpackage.drf drfVar2 = this.c;
            for (int i27 = 0; i27 < size7; i27++) {
                defpackage.dqv dqvVar5 = (defpackage.dqv) this.aL.get(i27);
                if (!(dqvVar5 instanceof defpackage.dqz) && !(dqvVar5 instanceof defpackage.dqs) && !dqvVar5.Q && (!zAj || (droVar = dqvVar5.o) == null || (drpVar = dqvVar5.p) == null || !droVar.e.i || !drpVar.e.i)) {
                    int iV3 = dqvVar5.V(0);
                    int iV4 = dqvVar5.V(1);
                    if (iV3 != 3) {
                        z4 = false;
                    } else {
                        if (dqvVar5.C != 1 && iV4 == 3) {
                            if (dqvVar5.D != 1) {
                                z4 = true;
                                iV4 = 3;
                                iV3 = 3;
                            } else {
                                iV4 = 3;
                            }
                        }
                        iV3 = 3;
                        z4 = false;
                    }
                    if (!z4) {
                        if (aj(1) && !(dqvVar5 instanceof defpackage.drc)) {
                            boolean z16 = iV3 == 3 && dqvVar5.C == 0 && iV4 != 3 && !dqvVar5.R();
                            if (iV4 == 3 && dqvVar5.D == 0 && iV3 != 3 && !dqvVar5.R()) {
                                z16 = true;
                            }
                            if (((iV3 == 3 || iV4 == 3) && dqvVar5.ah > 0.0f) || z16) {
                            }
                        }
                        ngbVar.n(drfVar2, dqvVar5, 0);
                    }
                }
            }
            drfVar2.a();
        }
        ngbVar.m(this);
        java.util.ArrayList arrayList8 = (java.util.ArrayList) ngbVar.c;
        int size8 = arrayList8.size();
        if (i8 > 0) {
            ngbVar.o(this, 0, iJ, iH);
        }
        if (size8 > 0) {
            int iW = W();
            int iX = X();
            int iJ5 = j();
            defpackage.dqv dqvVar6 = (defpackage.dqv) ngbVar.a;
            int iMax = java.lang.Math.max(iJ5, dqvVar6.am);
            int i28 = 0;
            int iMax2 = java.lang.Math.max(h(), dqvVar6.an);
            boolean z17 = false;
            while (i28 < size8) {
                defpackage.dqv dqvVar7 = (defpackage.dqv) arrayList8.get(i28);
                if (dqvVar7 instanceof defpackage.drc) {
                    int iJ6 = dqvVar7.j();
                    int iH7 = dqvVar7.h();
                    boolean zN = z17 | ngbVar.n(drfVar, dqvVar7, 1);
                    int iJ7 = dqvVar7.j();
                    int iH8 = dqvVar7.h();
                    if (iJ7 != iJ6) {
                        dqvVar7.M(iJ7);
                        if (iW == 2 && dqvVar7.i() > iMax) {
                            iMax = java.lang.Math.max(iMax, dqvVar7.i() + dqvVar7.U(4).b());
                        }
                        z3 = true;
                    }
                    if (iH8 != iH7) {
                        z3 = zN;
                        dqvVar7.B(iH8);
                        if (iX == 2 && dqvVar7.g() > iMax2) {
                            iMax2 = java.lang.Math.max(iMax2, dqvVar7.g() + dqvVar7.U(5).b());
                        }
                        z3 = true;
                    }
                    z3 = zN;
                    z17 = ((defpackage.drc) dqvVar7).aT | z3;
                }
                i28++;
                i26 = i26;
            }
            int i29 = i26;
            boolean z18 = z17;
            int i30 = 0;
            int i31 = 2;
            while (i30 < i31) {
                boolean z19 = z18;
                int i32 = 0;
                while (i32 < size8) {
                    defpackage.dqv dqvVar8 = (defpackage.dqv) arrayList8.get(i32);
                    if ((!(dqvVar8 instanceof defpackage.dra) || (dqvVar8 instanceof defpackage.drc)) && !(dqvVar8 instanceof defpackage.dqz)) {
                        arrayList = arrayList8;
                        if (dqvVar8.ar != 8 && ((!z2 || !dqvVar8.o.e.i || !dqvVar8.p.e.i) && !(dqvVar8 instanceof defpackage.drc))) {
                            int iJ8 = dqvVar8.j();
                            int iH9 = dqvVar8.h();
                            i11 = size8;
                            int i33 = dqvVar8.al;
                            i12 = i32;
                            boolean zN2 = ngbVar.n(drfVar, dqvVar8, i30 == 1 ? 2 : 1) | z19;
                            int iJ9 = dqvVar8.j();
                            drfVar = drfVar;
                            int iH10 = dqvVar8.h();
                            if (iJ9 != iJ8) {
                                dqvVar8.M(iJ9);
                                if (iW != 2 || dqvVar8.i() <= iMax) {
                                    c = 4;
                                } else {
                                    c = 4;
                                    iMax = java.lang.Math.max(iMax, dqvVar8.i() + dqvVar8.U(4).b());
                                }
                                zN2 = true;
                            } else {
                                c = 4;
                            }
                            if (iH10 != iH9) {
                                dqvVar8.B(iH10);
                                if (iX == 2 && dqvVar8.g() > iMax2) {
                                    iMax2 = java.lang.Math.max(iMax2, dqvVar8.g() + dqvVar8.U(5).b());
                                }
                                zN2 = true;
                            }
                            z19 = (!dqvVar8.P || i33 == dqvVar8.al) ? zN2 : true;
                        }
                        i32 = i12 + 1;
                        arrayList8 = arrayList;
                        size8 = i11;
                        drfVar = drfVar;
                    } else {
                        arrayList = arrayList8;
                    }
                    i11 = size8;
                    i12 = i32;
                    i32 = i12 + 1;
                    arrayList8 = arrayList;
                    size8 = i11;
                    drfVar = drfVar;
                }
                defpackage.drf drfVar3 = drfVar;
                java.util.ArrayList arrayList9 = arrayList8;
                int i34 = size8;
                if (!z19) {
                    break;
                }
                i30++;
                ngbVar.o(this, i30, iJ, iH);
                size8 = i34;
                i31 = 2;
                drfVar = drfVar3;
                z18 = false;
                arrayList8 = arrayList9;
            }
            i10 = i29;
        } else {
            i10 = i26;
        }
        ag(i10);
    }

    final void b(defpackage.dqv dqvVar, int i) {
        if (i == 0) {
            int i2 = this.h + 1;
            defpackage.dqt[] dqtVarArr = this.k;
            int length = dqtVarArr.length;
            if (i2 >= length) {
                dqtVarArr = (defpackage.dqt[]) java.util.Arrays.copyOf(dqtVarArr, length + length);
                this.k = dqtVarArr;
            }
            int i3 = this.h;
            dqtVarArr[i3] = new defpackage.dqt(dqvVar, 0, this.d);
            this.h = i3 + 1;
            return;
        }
        int i4 = this.i + 1;
        defpackage.dqt[] dqtVarArr2 = this.j;
        int length2 = dqtVarArr2.length;
        if (i4 >= length2) {
            dqtVarArr2 = (defpackage.dqt[]) java.util.Arrays.copyOf(dqtVarArr2, length2 + length2);
            this.j = dqtVarArr2;
        }
        int i5 = this.i;
        dqtVarArr2[i5] = new defpackage.dqt(dqvVar, 1, this.d);
        this.i = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.drd, defpackage.dqv
    public final void u() {
        this.e.k();
        this.f = 0;
        this.g = 0;
        super.u();
    }

    public dqw(byte[] bArr) {
        super(null);
        this.aK = new defpackage.ngb(this);
        this.a = new defpackage.dri(this);
        this.c = null;
        this.d = false;
        this.e = new defpackage.dpg();
        this.h = 0;
        this.i = 0;
        this.j = new defpackage.dqt[4];
        this.k = new defpackage.dqt[4];
        this.aB = 257;
        this.aC = false;
        this.aD = false;
        this.aE = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = new java.util.HashSet();
        this.aJ = new defpackage.dre();
    }
}
