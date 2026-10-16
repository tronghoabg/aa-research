package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kyi implements nmv {
    public static final defpackage.kyi a;
    public static final defpackage.kyi b;
    public static final defpackage.kyi c;
    public static final defpackage.kyi d;
    public static final defpackage.kyi e;
    public static final defpackage.kyi f;
    public static final defpackage.kyi g;
    public static final defpackage.kyi h;
    private static final /* synthetic */ defpackage.kyi[] i;
    private final defpackage.odx j;

    static {
        int i2;
        defpackage.kyi kyiVar = new defpackage.kyi("FIRST_RUN", 0, (int) defpackage.acza.b(), (int) defpackage.acza.c(), defpackage.acza.v(), defpackage.acbk.a, defpackage.zbe.USER_EDUCATION_ASSISTANT_FIRST_RUN);
        a = kyiVar;
        defpackage.kyi kyiVar2 = new defpackage.kyi(defpackage.mkp.a.c.getString(2132083174), defpackage.acza.K(), defpackage.acbk.Q, defpackage.zbe.USER_EDUCATION_ROCA_CLASSIC_UPGRADE);
        b = kyiVar2;
        defpackage.kyi kyiVar3 = new defpackage.kyi("NTH_RUN", 2, (int) defpackage.acza.g(), (int) defpackage.acza.i(), defpackage.acza.A(), defpackage.acbk.b, defpackage.zbe.USER_EDUCATION_ASSISTANT_NTH_RUN);
        c = kyiVar3;
        defpackage.kyi kyiVar4 = new defpackage.kyi("NTH_RUN_BUTTON", 3, (int) defpackage.acza.d(), (int) defpackage.acza.f(), defpackage.acza.y(), defpackage.acbk.c, defpackage.zbe.USER_EDUCATION_ASSISTANT_NTH_RUN_BUTTON);
        d = kyiVar4;
        defpackage.kyi kyiVar5 = new defpackage.kyi("DIALER_FIRST_OPEN", 4, 2132083173, defpackage.acza.t(), defpackage.acbk.p, defpackage.zbe.USER_EDUCATION_ASSISTANT_DIALER_FIRST_OPEN);
        e = kyiVar5;
        int iJ = (int) defpackage.acza.j();
        if (iJ != 1) {
            i2 = iJ != 2 ? 2132083182 : 2132083184;
        } else {
            i2 = 2132083183;
        }
        defpackage.kyi kyiVar6 = new defpackage.kyi("LONG_DRIVE_START", 5, i2, defpackage.acza.D(), defpackage.acbk.z, defpackage.zbe.USER_EDUCATION_ASSISTANT_LONG_DRIVE_START);
        f = kyiVar6;
        defpackage.kyi kyiVar7 = new defpackage.kyi("PHONE_CALL_ENDED", 6, 2132083178, defpackage.acza.C(), defpackage.acbk.r, defpackage.zbe.USER_EDUCATION_ASSISTANT_PHONE_CALL_ENDED);
        g = kyiVar7;
        defpackage.kyi kyiVar8 = new defpackage.kyi(defpackage.acza.q(), defpackage.acbk.w, defpackage.zbe.USER_EDUCATION_ASSISTANT_LAUNCHER_OPEN);
        h = kyiVar8;
        i = new defpackage.kyi[]{kyiVar, kyiVar2, kyiVar3, kyiVar4, kyiVar5, kyiVar6, kyiVar7, kyiVar8};
    }

    private kyi(java.lang.String str, int i2, int i3, int i4, boolean z, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        super(str, i2);
        int i5 = 2132083156;
        switch (i3) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                i5 = 2132083157;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                i5 = 2132083165;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i5 = 2132083166;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i5 = 2132083167;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i5 = 2132083168;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i5 = 2132083169;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i5 = 2132083170;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                i5 = 2132083171;
                break;
            case 9:
                i5 = 2132083172;
                break;
            case 10:
                i5 = 2132083158;
                break;
            case 11:
                i5 = 2132083159;
                break;
            case 12:
                i5 = 2132083160;
                break;
            case 13:
                i5 = 2132083161;
                break;
            case 14:
            default:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kyj.a.h()).ai((char) 3535)).w("Unknown copy variant: %d, using default", i3);
                break;
            case 15:
                i5 = 2132083162;
                break;
            case 16:
                i5 = 2132083163;
                break;
            case 17:
                i5 = 2132083164;
                break;
        }
        int i6 = 0;
        switch (i4) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                i6 = 2131231883;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                i6 = 2131231884;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i6 = 2131231885;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i6 = 2131231886;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i6 = 2131231887;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i6 = 2131231888;
                break;
            default:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kyj.a.h()).ai((char) 3534)).w("Unknown graphic variant: %d, using default", i4);
                break;
        }
        this.j = new defpackage.odx(i5, i6, z, acbkVar, zbeVar);
    }

    public static defpackage.kyi valueOf(java.lang.String str) {
        return (defpackage.kyi) java.lang.Enum.valueOf(defpackage.kyi.class, str);
    }

    public static defpackage.kyi[] values() {
        return (defpackage.kyi[]) i.clone();
    }

    public final defpackage.nmu a() {
        return defpackage.nmu.c;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        odl odlVarA = this.j.a((odj) obj, this);
        defpackage.yhe yheVar = defpackage.kyj.b;
        if (yheVar.containsKey(this)) {
            defpackage.kxc kxcVarN = defpackage.ebo.n();
            defpackage.abor aborVarN = ott.a.n();
            defpackage.ots otsVar = (defpackage.ots) yheVar.get(this);
            aborVarN.t();
            ott ottVar = aborVarN.b;
            ottVar.c = otsVar.C;
            ottVar.b |= 1;
            kxcVarN.v((ott) aborVarN.q());
        }
        return odlVarA;
    }

    public final java.lang.String c() {
        return "assistant";
    }

    public final java.lang.String d() {
        return name();
    }

    private kyi(java.lang.String str, int i2, int i3, boolean z, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        super(str, i2);
        this.j = new defpackage.odx(i3, 0, z, acbkVar, zbeVar);
    }

    private kyi(java.lang.String str, boolean z, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        super("FIRST_RUN_ROCA", 1);
        this.j = new defpackage.odx(str, 2131233030, z, acbkVar, zbeVar);
    }

    private kyi(java.lang.String str, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        super("LAUNCHER_OPEN_ITERATION", 7);
        this.j = new defpackage.odx(str, 0, false, acbkVar, zbeVar);
    }
}
