package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhn {
    static final defpackage.rhm b;
    static final defpackage.rhm c;
    private static final j$.time.Duration r;
    private static final defpackage.rhm s;
    private static final java.lang.Object t;
    private static final java.lang.Object u;
    private static final java.lang.Object v;
    private static final java.lang.Object w;
    private static final java.lang.Object x;
    private final defpackage.ris A;
    private final defpackage.rho B;
    private defpackage.rhm C;
    private boolean D;
    private final defpackage.wyz E;
    public final defpackage.rib d;
    public final defpackage.rxs e;
    final java.util.Map f;
    public defpackage.rhk g;
    public rhq h;
    public boolean i;
    public boolean j;
    public boolean k;
    public defpackage.rhj l;
    public final java.util.concurrent.atomic.AtomicBoolean m;
    public int n;
    public int o;
    public final defpackage.khb p;
    private final android.os.Handler y;
    private final defpackage.rhi z;
    public static final defpackage.yqk a = defpackage.omv.n("CAR.BT");
    private static final j$.time.Duration q = j$.time.Duration.ofSeconds(6);

    static {
        j$.time.Duration.ofSeconds(25L);
        r = j$.time.Duration.ofSeconds(1L);
        b = new defpackage.rhm(defpackage.rhk.STATE_NONE);
        s = new defpackage.rhm(defpackage.rhk.STATE_UNPAIRED);
        c = new defpackage.rhm(defpackage.rhk.STATE_WRONG);
        t = new java.lang.Object();
        u = new java.lang.Object();
        v = new java.lang.Object();
        w = new java.lang.Object();
        x = new java.lang.Object();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x05f1 A[PHI: r25
  0x05f1: PHI (r25v6 rhk) = (r25v4 rhk), (r25v7 rhk) binds: [B:9:0x05ef, B:5:0x05e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0697  */
    /* JADX WARN: Code duplicated, block: B:15:0x069c  */
    /* JADX WARN: Code duplicated, block: B:18:0x071a  */
    /* JADX WARN: Code duplicated, block: B:19:0x071f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0739  */
    /* JADX WARN: Code duplicated, block: B:23:0x073e  */
    /* JADX WARN: Code duplicated, block: B:27:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:29:0x0803  */
    /* JADX WARN: Code duplicated, block: B:30:0x0809  */
    public rhn(android.os.Looper looper, defpackage.rib ribVar, defpackage.rhi rhiVar, defpackage.wyz wyzVar, defpackage.ris risVar, defpackage.rxs rxsVar, defpackage.rho rhoVar) {
        defpackage.rhk rhkVar;
        defpackage.rhk rhkVar2;
        defpackage.rhk rhkVar3;
        defpackage.rhk rhkVar4;
        j$.time.Duration durationOfSeconds;
        defpackage.rhm rhmVar;
        j$.time.Duration durationOfSeconds2;
        java.util.EnumMap enumMap;
        defpackage.rhm rhmVar2;
        java.util.EnumMap enumMap2 = new java.util.EnumMap(defpackage.rhk.class);
        this.f = enumMap2;
        defpackage.rhk rhkVar5 = defpackage.rhk.STATE_INITIAL;
        this.g = rhkVar5;
        this.i = false;
        this.j = false;
        this.k = false;
        defpackage.rhj rhjVar = defpackage.rhj.EVENT_UNKNOWN_ERROR;
        this.l = rhjVar;
        this.m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.D = false;
        this.y = new defpackage.rce(this, looper);
        this.d = ribVar;
        this.z = rhiVar;
        this.E = wyzVar;
        this.p = new defpackage.khb((byte[]) null);
        this.A = risVar;
        this.e = rxsVar;
        this.B = rhoVar;
        java.util.EnumMap enumMap3 = new java.util.EnumMap(defpackage.rhj.class);
        defpackage.rhk rhkVar6 = defpackage.rhk.STATE_FAILED;
        enumMap3.put(rhjVar, new defpackage.rhm(rhkVar6));
        defpackage.rhj rhjVar2 = defpackage.rhj.EVENT_SKIP_REQUESTED;
        enumMap3.put(rhjVar2, new defpackage.rhm(rhkVar6));
        defpackage.rhj rhjVar3 = defpackage.rhj.EVENT_STATE_TIMEOUT;
        defpackage.rhm rhmVar3 = c;
        enumMap3.put(rhjVar3, rhmVar3);
        defpackage.rhj rhjVar4 = defpackage.rhj.EVENT_SERVICE_INITIALIZATION_FAILED;
        enumMap3.put(rhjVar4, new defpackage.rhm(rhkVar6));
        defpackage.rhj rhjVar5 = defpackage.rhj.EVENT_SERVICE_INITIALIZED;
        defpackage.rhk rhkVar7 = defpackage.rhk.STATE_WAITING_FOR_ENDPOINT_READY;
        enumMap3.put(rhjVar5, new defpackage.rhm(rhkVar7));
        defpackage.rhj rhjVar6 = defpackage.rhj.EVENT_ENDPOINT_READY;
        enumMap3.put(rhjVar6, rhmVar3);
        defpackage.rhj rhjVar7 = defpackage.rhj.EVENT_ENDPOINT_READY_WAIT_FOR_USER_AUTHORIZATION;
        enumMap3.put(rhjVar7, rhmVar3);
        defpackage.rhj rhjVar8 = defpackage.rhj.EVENT_USER_AUTHORIZED;
        enumMap3.put(rhjVar8, rhmVar3);
        defpackage.rhj rhjVar9 = defpackage.rhj.EVENT_ENABLING_FAILED;
        enumMap3.put(rhjVar9, rhmVar3);
        defpackage.rhj rhjVar10 = defpackage.rhj.EVENT_ENABLED;
        defpackage.rhm rhmVar4 = b;
        enumMap3.put(rhjVar10, rhmVar4);
        defpackage.rhj rhjVar11 = defpackage.rhj.EVENT_BLUETOOTH_PROFILE_UTIL_READY;
        enumMap3.put(rhjVar11, rhmVar4);
        defpackage.rhj rhjVar12 = defpackage.rhj.EVENT_CAR_CANNOT_BE_PAIRED;
        enumMap3.put(rhjVar12, rhmVar3);
        defpackage.rhj rhjVar13 = defpackage.rhj.EVENT_CAR_DELAYING_PAIRING;
        enumMap3.put(rhjVar13, rhmVar3);
        defpackage.rhj rhjVar14 = defpackage.rhj.EVENT_CAR_READY_FOR_PAIRING;
        enumMap3.put(rhjVar14, rhmVar3);
        defpackage.rhj rhjVar15 = defpackage.rhj.EVENT_PAIRED;
        enumMap3.put(rhjVar15, rhmVar4);
        defpackage.rhj rhjVar16 = defpackage.rhj.EVENT_HFP_CONNECTED;
        enumMap3.put(rhjVar16, rhmVar4);
        defpackage.rhj rhjVar17 = defpackage.rhj.EVENT_DISABLED;
        enumMap3.put(rhjVar17, rhmVar4);
        defpackage.rhj rhjVar18 = defpackage.rhj.EVENT_UNPAIRED;
        enumMap3.put(rhjVar18, rhmVar4);
        defpackage.rhj rhjVar19 = defpackage.rhj.EVENT_HFP_DISCONNECTED;
        enumMap3.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar5, enumMap3);
        java.util.EnumMap enumMap4 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap4.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap4.put(rhjVar2, rhmVar3);
        enumMap4.put(rhjVar3, new defpackage.rhm(rhkVar7));
        enumMap4.put(rhjVar4, rhmVar3);
        enumMap4.put(rhjVar5, rhmVar3);
        defpackage.rhk rhkVar8 = defpackage.rhk.STATE_ENABLING;
        enumMap4.put(rhjVar6, new defpackage.rhm(rhkVar8));
        defpackage.rhk rhkVar9 = defpackage.rhk.STATE_WAITING_FOR_USER_AUTHORIZATION;
        enumMap4.put(rhjVar7, new defpackage.rhm(rhkVar9));
        enumMap4.put(rhjVar8, rhmVar3);
        enumMap4.put(rhjVar9, rhmVar3);
        enumMap4.put(rhjVar10, rhmVar4);
        enumMap4.put(rhjVar11, rhmVar4);
        enumMap4.put(rhjVar12, rhmVar3);
        enumMap4.put(rhjVar13, rhmVar3);
        enumMap4.put(rhjVar14, rhmVar3);
        enumMap4.put(rhjVar15, rhmVar4);
        enumMap4.put(rhjVar16, rhmVar4);
        enumMap4.put(rhjVar17, rhmVar4);
        enumMap4.put(rhjVar18, rhmVar4);
        enumMap4.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar7, enumMap4);
        java.util.EnumMap enumMap5 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap5.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap5.put(rhjVar2, rhmVar3);
        enumMap5.put(rhjVar3, new defpackage.rhm(rhkVar9));
        enumMap5.put(rhjVar4, rhmVar3);
        enumMap5.put(rhjVar5, rhmVar3);
        enumMap5.put(rhjVar6, rhmVar3);
        enumMap5.put(rhjVar7, rhmVar3);
        enumMap5.put(rhjVar8, new defpackage.rhm(rhkVar8));
        enumMap5.put(rhjVar9, rhmVar3);
        enumMap5.put(rhjVar10, rhmVar4);
        enumMap5.put(rhjVar11, rhmVar4);
        enumMap5.put(rhjVar12, rhmVar3);
        enumMap5.put(rhjVar13, rhmVar3);
        enumMap5.put(rhjVar14, rhmVar3);
        enumMap5.put(rhjVar15, rhmVar4);
        enumMap5.put(rhjVar16, rhmVar4);
        enumMap5.put(rhjVar17, rhmVar4);
        enumMap5.put(rhjVar18, rhmVar4);
        enumMap5.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar9, enumMap5);
        java.util.EnumMap enumMap6 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap6.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap6.put(rhjVar2, rhmVar3);
        enumMap6.put(rhjVar3, new defpackage.rhm(rhkVar8));
        enumMap6.put(rhjVar4, rhmVar3);
        enumMap6.put(rhjVar5, rhmVar3);
        enumMap6.put(rhjVar6, rhmVar3);
        enumMap6.put(rhjVar7, rhmVar3);
        enumMap6.put(rhjVar8, rhmVar3);
        enumMap6.put(rhjVar9, new defpackage.rhm(rhkVar8, j$.time.Duration.ofSeconds(10L)));
        defpackage.rhk rhkVar10 = defpackage.rhk.STATE_WAITING_FOR_BLUETOOTH_PROFILE_UTIL;
        enumMap6.put(rhjVar10, new defpackage.rhm(rhkVar10));
        enumMap6.put(rhjVar11, rhmVar4);
        enumMap6.put(rhjVar12, rhmVar3);
        enumMap6.put(rhjVar13, rhmVar3);
        enumMap6.put(rhjVar14, rhmVar3);
        enumMap6.put(rhjVar15, rhmVar4);
        enumMap6.put(rhjVar16, rhmVar4);
        enumMap6.put(rhjVar17, new defpackage.rhm(rhkVar8, j$.time.Duration.ofSeconds(10L)));
        enumMap6.put(rhjVar18, rhmVar4);
        enumMap6.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar8, enumMap6);
        java.util.EnumMap enumMap7 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap7.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap7.put(rhjVar2, rhmVar3);
        enumMap7.put(rhjVar3, new defpackage.rhm(rhkVar10, j$.time.Duration.ZERO, 3, rhkVar8, j$.time.Duration.ZERO));
        enumMap7.put(rhjVar4, rhmVar3);
        enumMap7.put(rhjVar5, rhmVar3);
        enumMap7.put(rhjVar6, rhmVar3);
        enumMap7.put(rhjVar7, rhmVar3);
        enumMap7.put(rhjVar8, rhmVar3);
        enumMap7.put(rhjVar9, rhmVar3);
        enumMap7.put(rhjVar10, rhmVar4);
        defpackage.rhk rhkVar11 = defpackage.rhk.STATE_REQUESTING_CAR_PAIRING_PREPARATION;
        enumMap7.put(rhjVar11, new defpackage.rhm(rhkVar11));
        enumMap7.put(rhjVar12, rhmVar3);
        enumMap7.put(rhjVar13, rhmVar3);
        enumMap7.put(rhjVar14, rhmVar3);
        enumMap7.put(rhjVar15, rhmVar4);
        enumMap7.put(rhjVar16, rhmVar4);
        enumMap7.put(rhjVar17, new defpackage.rhm(rhkVar8));
        enumMap7.put(rhjVar18, rhmVar4);
        enumMap7.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar10, enumMap7);
        java.util.EnumMap enumMap8 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap8.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap8.put(rhjVar2, rhmVar3);
        enumMap8.put(rhjVar3, new defpackage.rhm(rhkVar11));
        enumMap8.put(rhjVar4, rhmVar3);
        enumMap8.put(rhjVar5, rhmVar3);
        enumMap8.put(rhjVar6, rhmVar3);
        enumMap8.put(rhjVar7, rhmVar3);
        enumMap8.put(rhjVar8, rhmVar3);
        enumMap8.put(rhjVar9, rhmVar3);
        enumMap8.put(rhjVar10, rhmVar4);
        enumMap8.put(rhjVar11, rhmVar4);
        enumMap8.put(rhjVar12, new defpackage.rhm(rhkVar11, j$.time.Duration.ofSeconds(1L)));
        enumMap8.put(rhjVar13, new defpackage.rhm(rhkVar11, j$.time.Duration.ofMinutes(2L)));
        defpackage.rhk rhkVar12 = defpackage.rhk.STATE_HFP_CONNECTION_CHECKING;
        enumMap8.put(rhjVar14, new defpackage.rhm(rhkVar12));
        enumMap8.put(rhjVar15, rhmVar4);
        enumMap8.put(rhjVar16, rhmVar4);
        enumMap8.put(rhjVar17, new defpackage.rhm(rhkVar8));
        enumMap8.put(rhjVar18, rhmVar4);
        enumMap8.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar11, enumMap8);
        java.util.EnumMap enumMap9 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap9.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap9.put(rhjVar2, rhmVar3);
        j$.time.Duration duration = j$.time.Duration.ZERO;
        defpackage.rhk rhkVar13 = defpackage.rhk.STATE_UNPAIRING;
        enumMap9.put(rhjVar3, new defpackage.rhm(rhkVar12, duration, 2, rhkVar13, j$.time.Duration.ZERO));
        enumMap9.put(rhjVar4, rhmVar3);
        enumMap9.put(rhjVar5, rhmVar3);
        enumMap9.put(rhjVar6, rhmVar3);
        enumMap9.put(rhjVar7, rhmVar3);
        enumMap9.put(rhjVar8, rhmVar3);
        enumMap9.put(rhjVar9, rhmVar3);
        enumMap9.put(rhjVar10, rhmVar4);
        enumMap9.put(rhjVar11, rhmVar4);
        enumMap9.put(rhjVar12, rhmVar3);
        enumMap9.put(rhjVar13, rhmVar3);
        enumMap9.put(rhjVar14, rhmVar3);
        enumMap9.put(rhjVar15, rhmVar4);
        defpackage.rhk rhkVar14 = defpackage.rhk.STATE_HFP_CONNECTED;
        enumMap9.put(rhjVar16, new defpackage.rhm(rhkVar14));
        enumMap9.put(rhjVar17, new defpackage.rhm(rhkVar8));
        enumMap9.put(rhjVar18, rhmVar4);
        defpackage.rhk rhkVar15 = defpackage.rhk.STATE_PREPARING_FOR_PAIRING;
        enumMap9.put(rhjVar19, new defpackage.rhm(rhkVar15));
        enumMap2.put(rhkVar12, enumMap9);
        java.util.EnumMap enumMap10 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap10.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap10.put(rhjVar2, rhmVar3);
        enumMap10.put(rhjVar3, new defpackage.rhm(rhkVar13));
        enumMap10.put(rhjVar4, rhmVar3);
        enumMap10.put(rhjVar5, rhmVar3);
        enumMap10.put(rhjVar6, rhmVar3);
        enumMap10.put(rhjVar7, rhmVar3);
        enumMap10.put(rhjVar8, rhmVar3);
        enumMap10.put(rhjVar9, rhmVar3);
        enumMap10.put(rhjVar10, rhmVar4);
        enumMap10.put(rhjVar11, rhmVar4);
        enumMap10.put(rhjVar12, rhmVar3);
        enumMap10.put(rhjVar13, rhmVar3);
        enumMap10.put(rhjVar14, rhmVar3);
        defpackage.rhk rhkVar16 = defpackage.rhk.STATE_HFP_CONNECTING;
        enumMap10.put(rhjVar15, new defpackage.rhm(rhkVar16));
        enumMap10.put(rhjVar16, new defpackage.rhm(rhkVar14));
        enumMap10.put(rhjVar17, new defpackage.rhm(rhkVar8));
        defpackage.rhk rhkVar17 = defpackage.rhk.STATE_PAIRING;
        enumMap10.put(rhjVar18, new defpackage.rhm(rhkVar17));
        enumMap10.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar15, enumMap10);
        java.util.EnumMap enumMap11 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap11.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap11.put(rhjVar2, rhmVar3);
        enumMap11.put(rhjVar3, new defpackage.rhm(rhkVar13));
        enumMap11.put(rhjVar4, rhmVar3);
        enumMap11.put(rhjVar5, rhmVar3);
        enumMap11.put(rhjVar6, rhmVar3);
        enumMap11.put(rhjVar7, rhmVar3);
        enumMap11.put(rhjVar8, rhmVar3);
        enumMap11.put(rhjVar9, rhmVar3);
        enumMap11.put(rhjVar10, rhmVar4);
        enumMap11.put(rhjVar11, rhmVar4);
        enumMap11.put(rhjVar12, rhmVar3);
        enumMap11.put(rhjVar13, rhmVar3);
        enumMap11.put(rhjVar14, rhmVar3);
        enumMap11.put(rhjVar15, new defpackage.rhm(rhkVar16));
        enumMap11.put(rhjVar16, new defpackage.rhm(rhkVar14));
        enumMap11.put(rhjVar17, new defpackage.rhm(rhkVar8));
        enumMap11.put(rhjVar18, new defpackage.rhm(rhkVar13));
        enumMap11.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar17, enumMap11);
        java.util.EnumMap enumMap12 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap12.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap12.put(rhjVar2, rhmVar3);
        enumMap12.put(rhjVar3, new defpackage.rhm(rhkVar13));
        enumMap12.put(rhjVar4, rhmVar3);
        enumMap12.put(rhjVar5, rhmVar3);
        enumMap12.put(rhjVar6, rhmVar3);
        enumMap12.put(rhjVar7, rhmVar3);
        enumMap12.put(rhjVar8, rhmVar3);
        enumMap12.put(rhjVar9, rhmVar3);
        enumMap12.put(rhjVar10, rhmVar4);
        enumMap12.put(rhjVar11, rhmVar4);
        enumMap12.put(rhjVar12, rhmVar3);
        enumMap12.put(rhjVar13, rhmVar3);
        enumMap12.put(rhjVar14, rhmVar3);
        enumMap12.put(rhjVar15, new defpackage.rhm(rhkVar16));
        enumMap12.put(rhjVar16, new defpackage.rhm(rhkVar14));
        enumMap12.put(rhjVar17, new defpackage.rhm(rhkVar8));
        enumMap12.put(rhjVar18, rhmVar4);
        enumMap12.put(rhjVar19, rhmVar4);
        enumMap2.put(defpackage.rhk.STATE_BLUETOOTH_CONNECTING, enumMap12);
        java.util.EnumMap enumMap13 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap13.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap13.put(rhjVar2, rhmVar3);
        enumMap13.put(rhjVar3, new defpackage.rhm(rhkVar16, j$.time.Duration.ZERO, 2, rhkVar13, j$.time.Duration.ZERO));
        enumMap13.put(rhjVar4, rhmVar3);
        enumMap13.put(rhjVar5, rhmVar3);
        enumMap13.put(rhjVar6, rhmVar3);
        enumMap13.put(rhjVar7, rhmVar3);
        enumMap13.put(rhjVar8, rhmVar3);
        enumMap13.put(rhjVar9, rhmVar3);
        enumMap13.put(rhjVar10, rhmVar4);
        enumMap13.put(rhjVar11, rhmVar4);
        enumMap13.put(rhjVar12, rhmVar3);
        enumMap13.put(rhjVar13, rhmVar3);
        enumMap13.put(rhjVar14, rhmVar3);
        enumMap13.put(rhjVar15, rhmVar4);
        enumMap13.put(rhjVar16, new defpackage.rhm(rhkVar14));
        enumMap13.put(rhjVar17, new defpackage.rhm(rhkVar8));
        enumMap13.put(rhjVar18, new defpackage.rhm(rhkVar11));
        if (wyzVar != null) {
            rhkVar = rhkVar11;
            if (wyzVar.h() == 2) {
                enumMap13.put(rhjVar19, rhmVar4);
                rhkVar3 = rhkVar;
                rhkVar2 = rhkVar16;
            }
            enumMap2.put(rhkVar2, enumMap13);
            java.util.EnumMap enumMap14 = new java.util.EnumMap(defpackage.rhj.class);
            enumMap14.put(rhjVar, new defpackage.rhm(rhkVar6));
            enumMap14.put(rhjVar2, rhmVar3);
            defpackage.rhk rhkVar18 = defpackage.rhk.STATE_HFP_MONITORING;
            enumMap14.put(rhjVar3, new defpackage.rhm(rhkVar18));
            enumMap14.put(rhjVar4, rhmVar3);
            enumMap14.put(rhjVar5, rhmVar3);
            enumMap14.put(rhjVar6, rhmVar3);
            enumMap14.put(rhjVar7, rhmVar3);
            enumMap14.put(rhjVar8, rhmVar3);
            enumMap14.put(rhjVar9, rhmVar3);
            enumMap14.put(rhjVar10, rhmVar4);
            enumMap14.put(rhjVar11, rhmVar4);
            enumMap14.put(rhjVar12, rhmVar3);
            enumMap14.put(rhjVar13, rhmVar3);
            enumMap14.put(rhjVar14, rhmVar3);
            enumMap14.put(rhjVar15, rhmVar4);
            enumMap14.put(rhjVar16, rhmVar4);
            enumMap14.put(rhjVar17, new defpackage.rhm(rhkVar8));
            rhkVar4 = rhkVar3;
            enumMap14.put(r15, new defpackage.rhm(rhkVar3));
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                durationOfSeconds = j$.time.Duration.ofSeconds(5L);
            } else {
                durationOfSeconds = j$.time.Duration.ofSeconds(1L);
            }
            enumMap14.put(rhjVar19, new defpackage.rhm(rhkVar12, durationOfSeconds));
            enumMap2.put(rhkVar14, enumMap14);
            java.util.EnumMap enumMap15 = new java.util.EnumMap(defpackage.rhj.class);
            enumMap15.put(rhjVar, new defpackage.rhm(rhkVar6));
            enumMap15.put(rhjVar2, rhmVar3);
            enumMap15.put(rhjVar3, new defpackage.rhm(rhkVar18));
            enumMap15.put(rhjVar4, rhmVar3);
            enumMap15.put(rhjVar5, rhmVar3);
            enumMap15.put(rhjVar6, rhmVar3);
            enumMap15.put(rhjVar7, rhmVar3);
            enumMap15.put(rhjVar8, rhmVar3);
            enumMap15.put(rhjVar9, rhmVar3);
            enumMap15.put(rhjVar10, rhmVar4);
            enumMap15.put(rhjVar11, rhmVar4);
            enumMap15.put(rhjVar12, rhmVar3);
            enumMap15.put(rhjVar13, rhmVar3);
            enumMap15.put(rhjVar14, rhmVar3);
            enumMap15.put(rhjVar15, rhmVar4);
            enumMap15.put(rhjVar16, rhmVar4);
            enumMap15.put(rhjVar17, new defpackage.rhm(rhkVar8));
            if (h()) {
                rhmVar = s;
            } else {
                rhmVar = new defpackage.rhm(rhkVar4);
            }
            enumMap15.put(rhjVar18, rhmVar);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                durationOfSeconds2 = j$.time.Duration.ofSeconds(5L);
            } else {
                durationOfSeconds2 = j$.time.Duration.ofSeconds(1L);
            }
            enumMap15.put(rhjVar19, new defpackage.rhm(rhkVar12, durationOfSeconds2));
            enumMap2.put(rhkVar18, enumMap15);
            java.util.EnumMap enumMap16 = new java.util.EnumMap(defpackage.rhj.class);
            enumMap16.put(rhjVar, new defpackage.rhm(rhkVar6));
            enumMap16.put(rhjVar2, rhmVar3);
            enumMap16.put(rhjVar3, new defpackage.rhm(rhkVar13, j$.time.Duration.ZERO, 2, rhkVar4, j$.time.Duration.ZERO));
            enumMap16.put(rhjVar4, rhmVar3);
            enumMap16.put(rhjVar5, rhmVar3);
            enumMap16.put(rhjVar6, rhmVar3);
            enumMap16.put(rhjVar7, rhmVar3);
            enumMap16.put(rhjVar8, rhmVar3);
            enumMap16.put(rhjVar9, rhmVar3);
            enumMap16.put(rhjVar10, rhmVar4);
            enumMap16.put(rhjVar11, rhmVar4);
            enumMap16.put(rhjVar12, rhmVar3);
            enumMap16.put(rhjVar13, rhmVar3);
            enumMap16.put(rhjVar14, rhmVar3);
            enumMap16.put(rhjVar15, new defpackage.rhm(rhkVar13, j$.time.Duration.ZERO, 2, rhkVar4, j$.time.Duration.ZERO));
            enumMap16.put(rhjVar16, new defpackage.rhm(rhkVar14));
            enumMap16.put(rhjVar17, new defpackage.rhm(rhkVar8));
            enumMap16.put(rhjVar18, new defpackage.rhm(rhkVar4));
            enumMap16.put(rhjVar19, rhmVar4);
            enumMap2.put(rhkVar13, enumMap16);
            enumMap = new java.util.EnumMap(defpackage.rhj.class);
            for (defpackage.rhj rhjVar20 : java.util.EnumSet.allOf(defpackage.rhj.class)) {
                if (rhjVar20 == rhjVar15) {
                    rhmVar2 = new defpackage.rhm(rhkVar4);
                } else {
                    rhmVar2 = rhmVar4;
                }
                enumMap.put(rhjVar20, rhmVar2);
            }
            enumMap2.put(defpackage.rhk.STATE_UNPAIRED, defpackage.ysr.F(enumMap));
            java.util.EnumMap enumMap17 = new java.util.EnumMap(defpackage.rhj.class);
            enumMap17.put(rhjVar, rhmVar4);
            enumMap17.put(rhjVar2, rhmVar4);
            enumMap17.put(rhjVar3, rhmVar3);
            enumMap17.put(rhjVar4, rhmVar4);
            enumMap17.put(rhjVar5, rhmVar4);
            enumMap17.put(rhjVar6, rhmVar4);
            enumMap17.put(rhjVar7, rhmVar3);
            enumMap17.put(rhjVar8, rhmVar3);
            enumMap17.put(rhjVar9, rhmVar4);
            enumMap17.put(rhjVar10, rhmVar4);
            enumMap17.put(rhjVar11, rhmVar4);
            enumMap17.put(rhjVar12, rhmVar4);
            enumMap17.put(rhjVar13, rhmVar4);
            enumMap17.put(rhjVar14, rhmVar4);
            enumMap17.put(rhjVar15, rhmVar4);
            enumMap17.put(rhjVar16, rhmVar4);
            enumMap17.put(rhjVar17, rhmVar4);
            enumMap17.put(rhjVar18, rhmVar4);
            enumMap17.put(rhjVar19, rhmVar4);
            enumMap2.put(rhkVar6, enumMap17);
            enumMap2.put(defpackage.rhk.STATE_WRONG, enumMap17);
            enumMap2.put(defpackage.rhk.STATE_NONE, enumMap17);
        }
        rhkVar = rhkVar11;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            enumMap13.put(rhjVar19, rhmVar4);
            rhkVar3 = rhkVar;
            rhkVar2 = rhkVar16;
        } else {
            defpackage.rhm rhmVar5 = new defpackage.rhm(rhkVar16, j$.time.Duration.ZERO, 3, rhkVar, j$.time.Duration.ofSeconds(4L));
            rhkVar2 = rhkVar16;
            rhkVar3 = rhkVar;
            enumMap13.put(rhjVar19, rhmVar5);
        }
        enumMap2.put(rhkVar2, enumMap13);
        java.util.EnumMap enumMap18 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap18.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap18.put(rhjVar2, rhmVar3);
        defpackage.rhk rhkVar19 = defpackage.rhk.STATE_HFP_MONITORING;
        enumMap18.put(rhjVar3, new defpackage.rhm(rhkVar19));
        enumMap18.put(rhjVar4, rhmVar3);
        enumMap18.put(rhjVar5, rhmVar3);
        enumMap18.put(rhjVar6, rhmVar3);
        enumMap18.put(rhjVar7, rhmVar3);
        enumMap18.put(rhjVar8, rhmVar3);
        enumMap18.put(rhjVar9, rhmVar3);
        enumMap18.put(rhjVar10, rhmVar4);
        enumMap18.put(rhjVar11, rhmVar4);
        enumMap18.put(rhjVar12, rhmVar3);
        enumMap18.put(rhjVar13, rhmVar3);
        enumMap18.put(rhjVar14, rhmVar3);
        enumMap18.put(rhjVar15, rhmVar4);
        enumMap18.put(rhjVar16, rhmVar4);
        enumMap18.put(rhjVar17, new defpackage.rhm(rhkVar8));
        rhkVar4 = rhkVar3;
        enumMap18.put(r15, new defpackage.rhm(rhkVar3));
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            durationOfSeconds = j$.time.Duration.ofSeconds(5L);
        } else {
            durationOfSeconds = j$.time.Duration.ofSeconds(1L);
        }
        enumMap18.put(rhjVar19, new defpackage.rhm(rhkVar12, durationOfSeconds));
        enumMap2.put(rhkVar14, enumMap18);
        java.util.EnumMap enumMap19 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap19.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap19.put(rhjVar2, rhmVar3);
        enumMap19.put(rhjVar3, new defpackage.rhm(rhkVar19));
        enumMap19.put(rhjVar4, rhmVar3);
        enumMap19.put(rhjVar5, rhmVar3);
        enumMap19.put(rhjVar6, rhmVar3);
        enumMap19.put(rhjVar7, rhmVar3);
        enumMap19.put(rhjVar8, rhmVar3);
        enumMap19.put(rhjVar9, rhmVar3);
        enumMap19.put(rhjVar10, rhmVar4);
        enumMap19.put(rhjVar11, rhmVar4);
        enumMap19.put(rhjVar12, rhmVar3);
        enumMap19.put(rhjVar13, rhmVar3);
        enumMap19.put(rhjVar14, rhmVar3);
        enumMap19.put(rhjVar15, rhmVar4);
        enumMap19.put(rhjVar16, rhmVar4);
        enumMap19.put(rhjVar17, new defpackage.rhm(rhkVar8));
        if (h()) {
            rhmVar = s;
        } else {
            rhmVar = new defpackage.rhm(rhkVar4);
        }
        enumMap19.put(rhjVar18, rhmVar);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            durationOfSeconds2 = j$.time.Duration.ofSeconds(5L);
        } else {
            durationOfSeconds2 = j$.time.Duration.ofSeconds(1L);
        }
        enumMap19.put(rhjVar19, new defpackage.rhm(rhkVar12, durationOfSeconds2));
        enumMap2.put(rhkVar19, enumMap19);
        java.util.EnumMap enumMap110 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap110.put(rhjVar, new defpackage.rhm(rhkVar6));
        enumMap110.put(rhjVar2, rhmVar3);
        enumMap110.put(rhjVar3, new defpackage.rhm(rhkVar13, j$.time.Duration.ZERO, 2, rhkVar4, j$.time.Duration.ZERO));
        enumMap110.put(rhjVar4, rhmVar3);
        enumMap110.put(rhjVar5, rhmVar3);
        enumMap110.put(rhjVar6, rhmVar3);
        enumMap110.put(rhjVar7, rhmVar3);
        enumMap110.put(rhjVar8, rhmVar3);
        enumMap110.put(rhjVar9, rhmVar3);
        enumMap110.put(rhjVar10, rhmVar4);
        enumMap110.put(rhjVar11, rhmVar4);
        enumMap110.put(rhjVar12, rhmVar3);
        enumMap110.put(rhjVar13, rhmVar3);
        enumMap110.put(rhjVar14, rhmVar3);
        enumMap110.put(rhjVar15, new defpackage.rhm(rhkVar13, j$.time.Duration.ZERO, 2, rhkVar4, j$.time.Duration.ZERO));
        enumMap110.put(rhjVar16, new defpackage.rhm(rhkVar14));
        enumMap110.put(rhjVar17, new defpackage.rhm(rhkVar8));
        enumMap110.put(rhjVar18, new defpackage.rhm(rhkVar4));
        enumMap110.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar13, enumMap110);
        enumMap = new java.util.EnumMap(defpackage.rhj.class);
        while (r6.hasNext()) {
            if (rhjVar20 == rhjVar15) {
                rhmVar2 = new defpackage.rhm(rhkVar4);
            } else {
                rhmVar2 = rhmVar4;
            }
            enumMap.put(rhjVar20, rhmVar2);
        }
        enumMap2.put(defpackage.rhk.STATE_UNPAIRED, defpackage.ysr.F(enumMap));
        java.util.EnumMap enumMap111 = new java.util.EnumMap(defpackage.rhj.class);
        enumMap111.put(rhjVar, rhmVar4);
        enumMap111.put(rhjVar2, rhmVar4);
        enumMap111.put(rhjVar3, rhmVar3);
        enumMap111.put(rhjVar4, rhmVar4);
        enumMap111.put(rhjVar5, rhmVar4);
        enumMap111.put(rhjVar6, rhmVar4);
        enumMap111.put(rhjVar7, rhmVar3);
        enumMap111.put(rhjVar8, rhmVar3);
        enumMap111.put(rhjVar9, rhmVar4);
        enumMap111.put(rhjVar10, rhmVar4);
        enumMap111.put(rhjVar11, rhmVar4);
        enumMap111.put(rhjVar12, rhmVar4);
        enumMap111.put(rhjVar13, rhmVar4);
        enumMap111.put(rhjVar14, rhmVar4);
        enumMap111.put(rhjVar15, rhmVar4);
        enumMap111.put(rhjVar16, rhmVar4);
        enumMap111.put(rhjVar17, rhmVar4);
        enumMap111.put(rhjVar18, rhmVar4);
        enumMap111.put(rhjVar19, rhmVar4);
        enumMap2.put(rhkVar6, enumMap111);
        enumMap2.put(defpackage.rhk.STATE_WRONG, enumMap111);
        enumMap2.put(defpackage.rhk.STATE_NONE, enumMap111);
    }

    private final void f() {
        this.y.removeCallbacksAndMessages(x);
    }

    private final boolean g() {
        rhq rhqVar;
        if (this.h != null && (!defpackage.acoo.e() || (rhqVar = this.h) == null || rhqVar.c())) {
            return true;
        }
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8092).u("bluetoothProfileUtil is not prepared due to being null or uninitialized");
        yqkVar.h().ai(8066).u("bluetoothProfileUtil should be prepared but isn't, retry enabling.");
        e(defpackage.rhk.STATE_ENABLING);
        return false;
    }

    private final boolean h() {
        defpackage.wyz wyzVar = this.E;
        wyzVar.getClass();
        int iH = wyzVar.h();
        if (iH == 1) {
            this.A.getClass();
            return defpackage.acoo.i();
        }
        if (iH != 2) {
            return false;
        }
        this.A.getClass();
        return defpackage.acoo.j();
    }

    public final void a() {
        android.os.Handler handler = this.y;
        handler.removeCallbacksAndMessages(t);
        handler.removeCallbacksAndMessages(u);
        handler.removeCallbacksAndMessages(v);
        handler.removeCallbacksAndMessages(w);
        handler.removeCallbacksAndMessages(x);
    }

    public final void b(int i) {
        defpackage.rib ribVar = this.d;
        if (!ribVar.i() && (android.os.Build.VERSION.SDK_INT >= 30 || !ribVar.h())) {
            e(defpackage.rhk.STATE_REQUESTING_CAR_PAIRING_PREPARATION);
            return;
        }
        if (this.E.h() == 2) {
            a.l().ai(8065).u("Ignored unpair request of BT device over wireless connection");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            ribVar.c();
        } else {
            ribVar.j(ria.a);
        }
        this.y.postAtTime(new defpackage.rhh(this, i, 2), v, android.os.SystemClock.uptimeMillis() + q.toMillis());
    }

    public final void c(defpackage.rhj rhjVar) {
        defpackage.rhk rhkVar;
        j$.time.Duration duration;
        this.g.name();
        rhjVar.name();
        this.l = rhjVar;
        java.lang.String strName = rhjVar.name();
        java.lang.String strName2 = this.g.name();
        defpackage.rhm rhmVar = this.C;
        ((defpackage.yfi) this.p.a).add(android.util.Pair.create(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.String.format("Current State: %s, Event : %s, Transition: %s", strName2, strName, rhmVar != null ? rhmVar.toString() : "transition null")));
        if (this.k) {
            a.f().ai(8074).M("event fired after cleanup. currentState=%s event%s", this.g.name(), rhjVar.name());
            return;
        }
        if (rhjVar == defpackage.rhj.EVENT_UNPAIRED && h() && this.D) {
            a.f().ai(8073).u("Unpaired after reaching monitoring state. Preventing repairing.");
            a();
            d(defpackage.rhk.STATE_UNPAIRED);
            return;
        }
        java.util.Map map = (java.util.Map) this.f.get(this.g);
        if (map == null) {
            a.f().ai(8072).y("No transition map defined for state %s", this.g.name());
            return;
        }
        defpackage.rhm rhmVar2 = (defpackage.rhm) map.get(rhjVar);
        if (rhmVar2 == null) {
            a.f().ai(8071).M("No transition defined. state=%s event=%s", this.g.name(), rhjVar.name());
            return;
        }
        if (rhmVar2 == b) {
            a.l().ai(8070).u("No transition");
            return;
        }
        if (rhmVar2 == c) {
            a.g().ai(8069).M("Wrong transition. state=%s event=%s", this.g.name(), rhjVar.name());
            return;
        }
        defpackage.rhm rhmVar3 = this.C;
        if (rhmVar2 != rhmVar3) {
            if (rhmVar3 != null) {
                rhmVar3.f = 0;
            }
            this.C = rhmVar2;
        }
        rhmVar2.f++;
        a.l().ai(8068).y("%s", rhmVar2);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            a();
        } else {
            this.y.removeCallbacksAndMessages(t);
        }
        int i = rhmVar2.c;
        if (i == 0 || rhmVar2.f <= i) {
            rhkVar = rhmVar2.a;
            duration = rhmVar2.b;
        } else {
            rhkVar = rhmVar2.d;
            duration = rhmVar2.e;
            if (this.g == defpackage.rhk.STATE_HFP_CONNECTING && rhjVar == defpackage.rhj.EVENT_HFP_DISCONNECTED) {
                this.j = true;
            }
        }
        if (duration.isZero()) {
            d(rhkVar);
        } else {
            this.y.postAtTime(new rhl(this, rhkVar, 0), t, android.os.SystemClock.uptimeMillis() + duration.toMillis());
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x043c  */
    /* JADX WARN: Code duplicated, block: B:170:0x044c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0455  */
    /* JADX WARN: Code duplicated, block: B:173:0x0466  */
    /* JADX WARN: Code duplicated, block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:? A[RETURN, SYNTHETIC] */
    final void d(defpackage.rhk rhkVar) {
        java.lang.String str;
        defpackage.rhs rhsVar;
        boolean zC;
        boolean z;
        defpackage.yqk yqkVar = a;
        defpackage.ypu ypuVarAi = yqkVar.f().ai(8075);
        java.lang.String strName = rhkVar.name();
        defpackage.zke zkeVar = defpackage.zke.a;
        defpackage.zkf zkfVar = new defpackage.zkf(zkeVar, strName);
        int i = rhkVar.t;
        java.lang.String str2 = "null";
        switch (i) {
            case 1:
                str = "BT_FSM_STATE_UNKNOWN";
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                str = "BT_FSM_STATE_INITIAL";
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                str = "BT_FSM_STATE_WAITING_FOR_ENDPOINT_READY";
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                str = "BT_FSM_STATE_ENABLING";
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                str = "BT_FSM_STATE_WAITING_FOR_BLUETOOTH_PROFILE_UTIL";
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "BT_FSM_STATE_REQUESTING_CAR_PAIRING_PREPARATION";
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "BT_FSM_STATE_HFP_CONNECTION_CHECKING";
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                str = "BT_FSM_STATE_PREPARING_FOR_PAIRING";
                break;
            case 9:
                str = "BT_FSM_STATE_PAIRING";
                break;
            case 10:
                str = "BT_FSM_STATE_HFP_CONNECTING";
                break;
            case 11:
                str = "BT_FSM_STATE_HFP_CONNECTED";
                break;
            case 12:
                str = "BT_FSM_STATE_HFP_MONITORING";
                break;
            case 13:
                str = "BT_FSM_STATE_UNPAIRING";
                break;
            case 14:
                str = "BT_FSM_STATE_PAIRING_FAILURE_BACKOFF";
                break;
            case 15:
                str = "BT_FSM_STATE_FAILED";
                break;
            case 16:
                str = "BT_FSM_STATE_WAITING_FOR_USER_AUTHORIZATION";
                break;
            case 17:
                str = "BT_FSM_STATE_BLUETOOTH_CONNECTING";
                break;
            case 18:
                str = "BT_FSM_STATE_NON_HFP_MONITORING";
                break;
            case 19:
                str = "BT_FSM_STATE_UNPAIRED";
                break;
            default:
                str = "null";
                break;
        }
        java.lang.String strC = null;
        if (i == 0) {
            throw null;
        }
        defpackage.zkf zkfVar2 = new defpackage.zkf(zkeVar, str);
        defpackage.rhj rhjVar = this.l;
        java.lang.String str3 = "Null";
        defpackage.zkf zkfVar3 = new defpackage.zkf(zkeVar, rhjVar != null ? rhjVar.name() : "Null");
        defpackage.rhj rhjVar2 = this.l;
        if (rhjVar2 != null) {
            int i2 = rhjVar2.t;
            switch (i2) {
                case 1:
                    str2 = "BT_FSM_EVENT_UNKNOWN_ERROR";
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    str2 = "BT_FSM_EVENT_SKIP_REQUESTED";
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    str2 = "BT_FSM_EVENT_STATE_TIMEOUT";
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "BT_FSM_EVENT_SERVICE_INITIALIZATION_FAILED";
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "BT_FSM_EVENT_SERVICE_INITIALIZED";
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "BT_FSM_EVENT_ENDPOINT_READY";
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "BT_FSM_EVENT_ENABLING_FAILED";
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "BT_FSM_EVENT_ENABLED";
                    break;
                case 9:
                    str2 = "BT_FSM_EVENT_BLUETOOTH_PROFILE_UTIL_READY";
                    break;
                case 10:
                    str2 = "BT_FSM_EVENT_CAR_CANNOT_BE_PAIRED";
                    break;
                case 11:
                    str2 = "BT_FSM_EVENT_CAR_DELAYING_PAIRING";
                    break;
                case 12:
                    str2 = "BT_FSM_EVENT_CAR_READY_FOR_PAIRING";
                    break;
                case 13:
                    str2 = "BT_FSM_EVENT_PAIRED";
                    break;
                case 14:
                    str2 = "BT_FSM_EVENT_HFP_CONNECTED";
                    break;
                case 15:
                    str2 = "BT_FSM_EVENT_DISABLED";
                    break;
                case 16:
                    str2 = "BT_FSM_EVENT_UNPAIRED";
                    break;
                case 17:
                    str2 = "BT_FSM_EVENT_HFP_DISCONNECTED";
                    break;
                case 18:
                    str2 = "BT_FSM_EVENT_ENDPOINT_READY_WAIT_FOR_USER_AUTHORIZATION";
                    break;
                case 19:
                    str2 = "BT_FSM_EVENT_USER_AUTHORIZED";
                    break;
            }
            if (i2 == 0) {
                throw null;
            }
            str3 = str2;
        }
        ypuVarAi.S("handleTransition: Entering into state %s BluetoothFsmStateType=%s, previous event %s, BluetoothFsmEventType=%s", zkfVar, zkfVar2, zkfVar3, new defpackage.zkf(zkeVar, str3));
        defpackage.rho rhoVar = this.B;
        defpackage.rhk rhkVar2 = this.g;
        defpackage.rhj rhjVar3 = this.l;
        if (rhkVar2 != rhkVar) {
            if (rhoVar.e) {
                defpackage.rhk rhkVar3 = defpackage.rhk.STATE_UNPAIRED;
                if (rhkVar.equals(rhkVar3)) {
                    rhoVar.d.e(defpackage.yyn.BLUETOOTH_FSM_STATE_UNPAIRED);
                } else {
                    if (rhkVar2.equals(rhkVar3) && rhkVar.equals(defpackage.rhk.STATE_REQUESTING_CAR_PAIRING_PREPARATION)) {
                        rhoVar.d.e(defpackage.yyn.BLUETOOTH_FSM_STATE_UNPAIRED_TO_STATE_REQUESTING_CAR_PAIRING_PREPARATION);
                    } else {
                        z = false;
                    }
                    defpackage.rho.a.l().ai(8096).R("BluetoothFsm Transition from %s to %s logged as connection event: %s", rhkVar2.name(), rhkVar.name(), java.lang.Boolean.valueOf(z));
                }
                z = true;
                defpackage.rho.a.l().ai(8096).R("BluetoothFsm Transition from %s to %s logged as connection event: %s", rhkVar2.name(), rhkVar.name(), java.lang.Boolean.valueOf(z));
            }
            defpackage.yhx yhxVar = rhoVar.c;
            int i3 = rhkVar2.t;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            int i5 = i - 1;
            if (yhxVar.contains(java.lang.Integer.valueOf(i4)) || yhxVar.contains(java.lang.Integer.valueOf(i5))) {
                java.lang.String.valueOf(rhjVar3);
                defpackage.abor aborVarN = defpackage.zas.a.n();
                aborVarN.t();
                defpackage.zas zasVar = (defpackage.zas) aborVarN.b;
                zasVar.b |= 2;
                zasVar.d = i4;
                aborVarN.t();
                defpackage.zas zasVar2 = (defpackage.zas) aborVarN.b;
                zasVar2.b |= 1;
                zasVar2.c = i5;
                if (rhjVar3 != null) {
                    aborVarN.t();
                    defpackage.zas zasVar3 = (defpackage.zas) aborVarN.b;
                    zasVar3.b |= 4;
                    int i6 = rhjVar3.t;
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    zasVar3.e = i7;
                }
                defpackage.rxs rxsVar = rhoVar.b;
                defpackage.abor aborVarN2 = defpackage.yyg.a.n();
                aborVarN2.t();
                defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
                defpackage.zas zasVar4 = (defpackage.zas) aborVarN.q();
                zasVar4.getClass();
                yygVar.U = zasVar4;
                yygVar.c |= 4194304;
                rxsVar.a(((defpackage.yyg) aborVarN2.q()).h(), defpackage.yyh.BT_FSM_STATE_CHANGE);
                if (android.os.Build.VERSION.SDK_INT >= 30 && defpackage.rhk.STATE_INITIAL.equals(rhkVar2)) {
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.BLUETOOTH, defpackage.zbd.qB);
                    defpackage.abor aborVarF = rrvVarH.F();
                    aborVarF.t();
                    defpackage.zas zasVar5 = (defpackage.zas) aborVarF.b;
                    zasVar5.b |= 2;
                    zasVar5.d = i4;
                    aborVarF.t();
                    defpackage.zas zasVar6 = (defpackage.zas) aborVarF.b;
                    zasVar6.b |= 1;
                    zasVar6.c = i5;
                    if (rhjVar3 != null) {
                        defpackage.abor aborVarF2 = rrvVarH.F();
                        aborVarF2.t();
                        defpackage.zas zasVar7 = (defpackage.zas) aborVarF2.b;
                        zasVar7.b |= 4;
                        int i8 = rhjVar3.t;
                        int i9 = i8 - 1;
                        if (i8 == 0) {
                            throw null;
                        }
                        zasVar7.e = i9;
                    }
                    rxsVar.b(rrvVarH.l());
                }
            }
        }
        android.os.Handler handler = this.y;
        java.lang.Object obj = u;
        handler.removeCallbacksAndMessages(obj);
        this.g = rhkVar;
        j$.time.Duration duration = rhkVar.s;
        if (defpackage.a.W(duration)) {
            this.g.name();
            handler.postAtTime(new defpackage.qtk(this, 8, null), obj, android.os.SystemClock.uptimeMillis() + duration.toMillis());
        }
        switch (this.g.ordinal()) {
            case defpackage.abnt.b /* 0 */:
            case 1:
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                f();
                handler.postAtTime(new defpackage.qth(this, 19), x, android.os.SystemClock.uptimeMillis() + r.toMillis());
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                f();
                defpackage.rhi rhiVar = this.z;
                defpackage.qsa.a.l().ai(7756).u("prepareBluetoothProfileUtil");
                defpackage.qsa qsaVar = (defpackage.qsa) rhiVar;
                if (qsaVar.h != null) {
                    defpackage.ris risVar = qsaVar.q;
                    if (!defpackage.acoo.e() || qsaVar.h.c()) {
                        defpackage.rhn rhnVar = qsaVar.e;
                        rhnVar.h = qsaVar.h;
                        rhnVar.c(defpackage.rhj.EVENT_BLUETOOTH_PROFILE_UTIL_READY);
                        return;
                    }
                }
                defpackage.rib ribVar = qsaVar.d;
                defpackage.xei xeiVar = new defpackage.xei(rhiVar);
                defpackage.yqk yqkVar2 = defpackage.rib.a;
                yqkVar2.l().ai(8168).u("getProfileUtil");
                if (ribVar.n != 0) {
                    yqkVar2.l().ai(8171).u("getProfileUtil: This object wasn't initialized successfully.");
                    xeiVar.w(null);
                    return;
                }
                defpackage.rhs rhsVar2 = ribVar.o;
                if (rhsVar2 != null) {
                    if (!rhsVar2.c()) {
                        yqkVar2.l().ai(8169).u("mProfileUtil not initialized yet");
                        return;
                    } else {
                        yqkVar2.l().ai(8170).u("mProfileUtil already initialized");
                        xeiVar.w(ribVar.o);
                        return;
                    }
                }
                defpackage.rhf rhfVar = ribVar.d;
                rhfVar.getClass();
                ribVar.f.getClass();
                ribVar.o = new defpackage.rhs(rhfVar, ribVar.f.a, new defpackage.rft(ribVar, xeiVar, 11));
                defpackage.rhs rhsVar3 = ribVar.o;
                rhsVar3.b.f(ribVar.c, new defpackage.rhr(rhsVar3), 1);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.i = false;
                if (this.d.i()) {
                    yqkVar.h().ai(8077).u("Already pairing. Should cancel bonding process");
                    e(defpackage.rhk.STATE_UNPAIRING);
                    return;
                }
                defpackage.qsa qsaVar2 = (defpackage.qsa) this.z;
                if (qsaVar2.d == null) {
                    defpackage.qsa.a.g().ai(7765).u("Cannot send pairing request, bluetooth util is null");
                    qsaVar2.e.c(defpackage.rhj.EVENT_CAR_CANNOT_BE_PAIRED);
                    return;
                }
                if (qsaVar2.g == null) {
                    defpackage.qsa.a.g().ai(7764).u("Cannot send pairing request, bluetooth endpoint is null");
                    qsaVar2.e.c(defpackage.rhj.EVENT_CAR_CANNOT_BE_PAIRED);
                    return;
                }
                defpackage.yqk yqkVar3 = defpackage.qsa.a;
                yqkVar3.l().ai(7758).u("requestCarPairingPreparation");
                qsaVar2.d.d();
                yqkVar3.l().ai(7759).u("Sending a pairing request");
                defpackage.rib ribVar2 = qsaVar2.d;
                if (ribVar2.n == 0) {
                    defpackage.rhf rhfVar2 = ribVar2.d;
                    rhfVar2.getClass();
                    strC = rhfVar2.c();
                }
                if (strC == null) {
                    yqkVar3.g().ai(7763).u("Cannot send pairing request, bluetooth address is null");
                    qsaVar2.e.c(defpackage.rhj.EVENT_CAR_CANNOT_BE_PAIRED);
                    return;
                }
                if (!qsaVar2.s) {
                    yqkVar3.l().ai(7761).u("Initial pairing requested");
                    qsaVar2.s = true;
                    if (qsaVar2.t.g() == 2) {
                        com.google.android.gms.car.CarInfo carInfoL = qsaVar2.p.l();
                        if (carInfoL == null) {
                            yqkVar3.l().ai(7736).u("not sending result: failed to get head unit protocol version");
                        } else {
                            int i10 = carInfoL.e;
                            int i11 = carInfoL.f;
                            yqkVar3.l().ai(7735).B("current head unit protocol version %d.%d", i10, i11);
                            if (i10 > 0 && i11 >= 6 && qsaVar2.d.h()) {
                                yqkVar3.f().ai(7762).u("Bypassing the initial pairing request on purpose");
                                qsaVar2.o.e(defpackage.zaa.BLUETOOTH_PAIRING_REQUEST_BYPASSED);
                                return;
                            }
                        }
                    }
                }
                yqkVar3.f().ai(7760).y("Sending pairing request using method: %s", qsaVar2.c);
                qsaVar2.g.g(strC, qsaVar2.c);
                qsaVar2.o.e(defpackage.zaa.BLUETOOTH_PAIRING_REQUEST_SENT);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                if (g()) {
                    rhq rhqVar = this.h;
                    rhqVar.getClass();
                    if (rhqVar.a()) {
                        e(defpackage.rhk.STATE_HFP_CONNECTED);
                        return;
                    }
                    if (!rhqVar.b()) {
                        yqkVar.l().ai(8078).u("Prepare for pairing");
                        e(defpackage.rhk.STATE_PREPARING_FOR_PAIRING);
                        return;
                    } else if (this.d.h() && this.i) {
                        yqkVar.l().ai(8080).u("Already connecting. Waiting");
                        return;
                    } else {
                        yqkVar.h().ai(8079).u("Already connecting but will fail. Prepare for pairing");
                        e(defpackage.rhk.STATE_PREPARING_FOR_PAIRING);
                        return;
                    }
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.rib ribVar3 = this.d;
                if (ribVar3.i()) {
                    yqkVar.f().ai(8082).u("Already pairing. Cancelling bonding process");
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        e(defpackage.rhk.STATE_UNPAIRING);
                        return;
                    } else {
                        ribVar3.j(ria.c);
                        return;
                    }
                }
                if (!ribVar3.h()) {
                    e(defpackage.rhk.STATE_PAIRING);
                    return;
                }
                if (this.i) {
                    e(defpackage.rhk.STATE_HFP_CONNECTING);
                    return;
                } else if (android.os.Build.VERSION.SDK_INT >= 30) {
                    e(defpackage.rhk.STATE_BLUETOOTH_CONNECTING);
                    return;
                } else {
                    yqkVar.h().ai(8081).u("Phone thinks it's paired but car doesn't think so. Unpairing and re-pairing");
                    ribVar3.j(ria.d);
                    return;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.rib ribVar4 = this.d;
                defpackage.yqk yqkVar4 = defpackage.rib.a;
                yqkVar4.l().ai(8186).u("pair");
                if (ribVar4.n != 0) {
                    yqkVar4.l().ai(8187).u("pair: This object wasn't initialized successfully.");
                } else {
                    defpackage.rhf rhfVar3 = ribVar4.d;
                    rhfVar3.getClass();
                    if (rhfVar3.a.isDiscovering()) {
                        rhfVar3.g();
                    }
                    ribVar4.e(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_PAIRING_CREATE);
                    defpackage.rhg rhgVar = ribVar4.f;
                    rhgVar.getClass();
                    if (rhgVar.a.createBond()) {
                        return;
                    }
                }
                yqkVar.h().ai(8083).u("pair failed");
                e(defpackage.rhk.STATE_UNPAIRING);
                return;
            case 9:
                if (android.os.Build.VERSION.SDK_INT < 30 || !g()) {
                    return;
                }
                rhq rhqVar2 = this.h;
                rhqVar2.getClass();
                defpackage.rhs rhsVar4 = (defpackage.rhs) rhqVar2;
                defpackage.rhp rhpVar = rhsVar4.e;
                rhpVar.getClass();
                if (rhpVar.b(rhsVar4.c)) {
                    rhsVar4.e.c(rhsVar4.c);
                    return;
                } else {
                    yqkVar.h().ai(8064).u("enabling hfp profile and connecting failed");
                    return;
                }
            case 10:
                defpackage.rib ribVar5 = this.d;
                if (!ribVar5.h()) {
                    e(defpackage.rhk.STATE_REQUESTING_CAR_PAIRING_PREPARATION);
                    return;
                }
                if (g()) {
                    rhq rhqVar3 = this.h;
                    rhqVar3.getClass();
                    this.i = true;
                    if (rhqVar3.a()) {
                        e(defpackage.rhk.STATE_HFP_CONNECTED);
                        return;
                    }
                    if (rhqVar3.b()) {
                        yqkVar.l().ai(8085).u("Already started connecting. Waiting");
                        return;
                    }
                    java.util.Map map = this.f;
                    defpackage.rhk rhkVar4 = defpackage.rhk.STATE_HFP_CONNECTING;
                    if (map.containsKey(rhkVar4)) {
                        java.util.Map map2 = (java.util.Map) map.get(rhkVar4);
                        defpackage.rhj rhjVar4 = defpackage.rhj.EVENT_HFP_DISCONNECTED;
                        if (map2.containsKey(rhjVar4)) {
                            int i12 = ((defpackage.rhm) ((java.util.Map) map.get(rhkVar4)).get(rhjVar4)).f;
                            defpackage.yqk yqkVar5 = defpackage.rib.a;
                            yqkVar5.l().ai(8172).u("hasHfpUuids");
                            if (ribVar5.n == 0) {
                                defpackage.rhg rhgVar2 = ribVar5.f;
                                rhgVar2.getClass();
                                if (!android.bluetooth.BluetoothUuid.containsAnyUuid(rhgVar2.a.getUuids(), defpackage.rib.b)) {
                                }
                                if (g()) {
                                    rhq rhqVar4 = this.h;
                                    rhqVar4.getClass();
                                    rhsVar = (defpackage.rhs) rhqVar4;
                                    rhsVar.e.getClass();
                                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                                        zC = rhsVar.e.b(rhsVar.c);
                                    } else {
                                        rhsVar.e.d(rhsVar.c);
                                        zC = rhsVar.e.c(rhsVar.c);
                                    }
                                    if (zC) {
                                        return;
                                    }
                                    yqkVar.f().ai(8063).u("connectHfp failed");
                                    c(rhjVar4);
                                    return;
                                }
                                return;
                            }
                            yqkVar5.l().ai(8173).u("isPaired: This object wasn't initialized successfully.");
                            yqkVar.g().ai(8084).u("handleTransition Device missing Hfp Uuid");
                            if (this.m.compareAndSet(false, true)) {
                                yqkVar5.l().ai(8166).u("BluetoothUtils#fetchUuids");
                                if (ribVar5.n != 0) {
                                    yqkVar5.l().ai(8167).u("isPaired: This object wasn't initialized successfully.");
                                } else {
                                    defpackage.rhg rhgVar3 = ribVar5.f;
                                    rhgVar3.getClass();
                                    if (rhgVar3.a.fetchUuidsWithSdp()) {
                                        return;
                                    }
                                }
                                yqkVar.f().ai(8094).u("tryFetchUuids failed");
                                c(rhjVar4);
                                return;
                            }
                            if (g()) {
                                rhq rhqVar5 = this.h;
                                rhqVar5.getClass();
                                rhsVar = (defpackage.rhs) rhqVar5;
                                rhsVar.e.getClass();
                                if (android.os.Build.VERSION.SDK_INT >= 30) {
                                    zC = rhsVar.e.b(rhsVar.c);
                                } else {
                                    rhsVar.e.d(rhsVar.c);
                                    zC = rhsVar.e.c(rhsVar.c);
                                }
                                if (zC) {
                                    yqkVar.f().ai(8063).u("connectHfp failed");
                                    c(rhjVar4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    throw new java.lang.NullPointerException("transitionMap.get(STATE_HFP_CONNECTING) or transitionMap.get(STATE_HFP_CONNECTING).get(EVENT_HFP_DISCONNECTED) is null");
                }
                return;
            case 11:
                this.i = true;
                this.o = 0;
                ((defpackage.qsa) this.z).m(new qrv(1));
                return;
            case 12:
                if (h()) {
                    this.D = true;
                }
                if (g()) {
                    rhq rhqVar6 = this.h;
                    rhqVar6.getClass();
                    if (rhqVar6.a()) {
                        return;
                    }
                    e(defpackage.rhk.STATE_HFP_CONNECTION_CHECKING);
                    return;
                }
                return;
            case 13:
                int i13 = this.n + 1;
                this.n = i13;
                int i14 = this.o;
                int i15 = i14 + 1;
                this.o = i15;
                if (i15 <= 2) {
                    b(i13);
                    return;
                } else {
                    handler.postAtTime(new defpackage.rhh(this, this.n, 0), v, android.os.SystemClock.uptimeMillis() + j$.time.Duration.ofSeconds(defpackage.ysr.cZ(java.lang.Math.max(0, i14 - 2))).toMillis());
                    return;
                }
            case 14:
                yqkVar.f().ai(8086).u("HU has been unpaired.");
                defpackage.wyz wyzVar = this.E;
                wyzVar.getClass();
                int iH = wyzVar.h();
                if (iH == 1) {
                    yqkVar.f().ai(8088).u("Unpairing occurred during wired projection, nothing to do.");
                    return;
                }
                if (iH != 2) {
                    yqkVar.h().ai(8087).w("Unpairing occurred during wireless projection with unexpected connection type %s. Do nothing.", iH);
                    return;
                }
                yqkVar.f().ai(8089).u("Unpairing occurred during wireless projection, disconnecting GAL.");
                defpackage.rib ribVar6 = this.d;
                android.content.Intent action = new android.content.Intent().setAction("com.google.android.apps.auto.carservice.service.impl.ACTION_STOP_PROJECTION");
                android.content.Context context = ribVar6.c;
                android.content.Intent component = action.setComponent(new android.content.ComponentName(context, "com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks$CarModeBroadcastReceiver"));
                if (defpackage.acoo.a.fF().e()) {
                    component.putExtra("stop_projection_reason", "USER_UNPAIRED_BLUETOOTH");
                }
                context.sendBroadcast(component);
                return;
            case 15:
                yqkVar.g().ai(8090).u("Failed");
                return;
            default:
                yqkVar.g().ai(8076).y("handleTransition: Wrong state %s", this.g.name());
                return;
        }
    }

    public final void e(defpackage.rhk rhkVar) {
        a.l().ai(8093).M("switchToState: from %s to %s", this.g.name(), rhkVar.name());
        defpackage.rhm rhmVar = this.C;
        if (rhmVar != null) {
            rhmVar.f = 0;
            this.C = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            a();
        } else {
            this.y.removeCallbacksAndMessages(t);
        }
        d(rhkVar);
    }
}
