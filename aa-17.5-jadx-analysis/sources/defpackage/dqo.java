package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class dqo extends dqv {
    public final dra a;
    public int aB;
    public boolean aC;
    public boolean aD;
    public WeakReference aE;
    public WeakReference aF;
    public WeakReference aG;
    public WeakReference aH;
    final HashSet aI;
    public final dqw aJ;
    final nfh aK;
    public int b;
    public dqx c;
    public boolean d;
    public final doy e;
    int f;
    int g;
    public int h;
    public int i;
    public dql[] j;
    public dql[] k;

    public dqo() {
        this.aK = new nfh(this);
        this.a = new dra(this);
        this.c = null;
        this.d = false;
        this.e = new doy();
        this.h = 0;
        this.i = 0;
        this.j = new dql[4];
        this.k = new dql[4];
        this.aB = 257;
        this.aC = false;
        this.aD = false;
        this.aE = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = new HashSet();
        this.aJ = new dqw();
    }

    public static void al(dqn dqnVar, dqx dqxVar, dqw dqwVar) {
        int i;
        int i2;
        if (dqxVar == null) {
            return;
        }
        if (dqnVar.ar == 8 || (dqnVar instanceof dqr) || (dqnVar instanceof dqk)) {
            dqwVar.c = 0;
            dqwVar.d = 0;
            return;
        }
        dqwVar.i = dqnVar.W();
        dqwVar.j = dqnVar.X();
        dqwVar.a = dqnVar.j();
        dqwVar.b = dqnVar.h();
        dqwVar.g = false;
        dqwVar.h = 0;
        boolean z = dqwVar.i == 3;
        boolean z2 = dqwVar.j == 3;
        boolean z3 = z && dqnVar.ah > BitmapDescriptorFactory.HUE_RED;
        boolean z4 = z2 && dqnVar.ah > BitmapDescriptorFactory.HUE_RED;
        if (z && dqnVar.P(0) && dqnVar.C == 0 && !z3) {
            dqwVar.i = 2;
            if (z2 && dqnVar.D == 0) {
                dqwVar.i = 1;
            }
            z = false;
        }
        if (z2 && dqnVar.P(1) && dqnVar.D == 0 && !z4) {
            dqwVar.j = 2;
            if (z && dqnVar.C == 0) {
                dqwVar.j = 1;
            }
            z2 = false;
        }
        if (dqnVar.e()) {
            dqwVar.i = 1;
            z = false;
        }
        if (dqnVar.f()) {
            dqwVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (dqnVar.E[0] == 4) {
                dqwVar.i = 1;
            } else if (!z2) {
                if (dqwVar.j == 1) {
                    i2 = dqwVar.b;
                } else {
                    dqwVar.i = 2;
                    dqxVar.b(dqnVar, dqwVar);
                    i2 = dqwVar.d;
                }
                dqwVar.i = 1;
                dqwVar.a = (int) (dqnVar.ah * i2);
            }
        }
        if (z4) {
            if (dqnVar.E[1] == 4) {
                dqwVar.j = 1;
            } else if (!z) {
                if (dqwVar.i == 1) {
                    i = dqwVar.a;
                } else {
                    dqwVar.j = 2;
                    dqxVar.b(dqnVar, dqwVar);
                    i = dqwVar.c;
                }
                dqwVar.j = 1;
                float f = i;
                if (dqnVar.ai == -1) {
                    dqwVar.b = (int) (f / dqnVar.ah);
                } else {
                    dqwVar.b = (int) (dqnVar.ah * f);
                }
            }
        }
        dqxVar.b(dqnVar, dqwVar);
        dqnVar.M(dqwVar.c);
        dqnVar.B(dqwVar.d);
        dqnVar.P = dqwVar.f;
        dqnVar.x(dqwVar.e);
        dqwVar.h = 0;
        boolean z5 = dqwVar.g;
    }

    private final void ap(dqm dqmVar, dpb dpbVar) {
        doy doyVar = this.e;
        doyVar.g(dpbVar, doyVar.b(dqmVar), 0, 5);
    }

    private final void aq(dqm dqmVar, dpb dpbVar) {
        doy doyVar = this.e;
        doyVar.g(doyVar.b(dqmVar), dpbVar, 0, 5);
    }

    private final void ar() {
        this.h = 0;
        this.i = 0;
    }

    @Override // defpackage.dqn
    public final void N(boolean z, boolean z2) {
        super.N(z, z2);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((dqn) this.aL.get(i)).N(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05ea A[PHI: r4
  0x05ea: PHI (r4v1 int) = (r4v0 int), (r4v43 int) binds: [B:139:0x0232, B:145:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x070e A[Catch: Exception -> 0x08d6, TryCatch #5 {Exception -> 0x08d6, blocks: (B:386:0x0685, B:395:0x06a8, B:397:0x06b4, B:398:0x06b7, B:400:0x06bb, B:402:0x06c5, B:425:0x06f4, B:405:0x06ce, B:424:0x06f1, B:426:0x06fb, B:427:0x0700, B:429:0x0708, B:431:0x070e, B:432:0x0716, B:434:0x071c), top: B:614:0x0685 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x08a8 A[Catch: Exception -> 0x08d4, TryCatch #7 {Exception -> 0x08d4, blocks: (B:522:0x0897, B:524:0x089b, B:531:0x08a8, B:533:0x08bf, B:535:0x08c3, B:536:0x08c7), top: B:618:0x0897 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0939 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0946 A[LOOP:14: B:562:0x0944->B:563:0x0946, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x076e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.dqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ae() {
        /*
            Method dump skipped, instructions count: 2611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqo.ae():void");
    }

    public final void af(dqx dqxVar) {
        this.c = dqxVar;
        this.a.f = dqxVar;
    }

    public final void ag(int i) {
        this.aB = i;
        doy.a = aj(sk.AUDIO_CONTENT_BUFFER_SIZE);
    }

    public final void ah() {
        this.aK.m(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ai(boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqo.ai(boolean, int):boolean");
    }

    public final boolean aj(int i) {
        return (this.aB & i) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ak(int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqo.ak(int, int, int, int, int, int, int):void");
    }

    final void b(dqn dqnVar, int i) {
        if (i == 0) {
            int i2 = this.h + 1;
            dql[] dqlVarArr = this.k;
            int length = dqlVarArr.length;
            if (i2 >= length) {
                dqlVarArr = (dql[]) Arrays.copyOf(dqlVarArr, length + length);
                this.k = dqlVarArr;
            }
            int i3 = this.h;
            dqlVarArr[i3] = new dql(dqnVar, 0, this.d);
            this.h = i3 + 1;
            return;
        }
        int i4 = this.i + 1;
        dql[] dqlVarArr2 = this.j;
        int length2 = dqlVarArr2.length;
        if (i4 >= length2) {
            dqlVarArr2 = (dql[]) Arrays.copyOf(dqlVarArr2, length2 + length2);
            this.j = dqlVarArr2;
        }
        int i5 = this.i;
        dqlVarArr2[i5] = new dql(dqnVar, 1, this.d);
        this.i = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.dqv, defpackage.dqn
    public final void u() {
        this.e.k();
        this.f = 0;
        this.g = 0;
        super.u();
    }

    public dqo(byte[] bArr) {
        super(null);
        this.aK = new nfh(this);
        this.a = new dra(this);
        this.c = null;
        this.d = false;
        this.e = new doy();
        this.h = 0;
        this.i = 0;
        this.j = new dql[4];
        this.k = new dql[4];
        this.aB = 257;
        this.aC = false;
        this.aD = false;
        this.aE = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = new HashSet();
        this.aJ = new dqw();
    }
}
