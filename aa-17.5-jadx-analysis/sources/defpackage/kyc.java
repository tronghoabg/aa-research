package defpackage;

import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
final class kyc implements nma {
    public static final kyc a;
    public static final kyc b;
    public static final kyc c;
    public static final kyc d;
    public static final kyc e;
    public static final kyc f;
    public static final kyc g;
    public static final kyc h;
    private static final /* synthetic */ kyc[] i;
    private final odd j;

    static {
        kyc kycVar = new kyc("FIRST_RUN", 0, (int) acxy.b(), (int) acxy.c(), acxy.v(), acai.a, yzz.USER_EDUCATION_ASSISTANT_FIRST_RUN);
        a = kycVar;
        kyc kycVar2 = new kyc(mki.a.c.getString(R.string.assistant_education_tooltip_gemini_upgrade), acxy.K(), acai.Q, yzz.USER_EDUCATION_ROCA_CLASSIC_UPGRADE);
        b = kycVar2;
        kyc kycVar3 = new kyc("NTH_RUN", 2, (int) acxy.g(), (int) acxy.i(), acxy.A(), acai.b, yzz.USER_EDUCATION_ASSISTANT_NTH_RUN);
        c = kycVar3;
        kyc kycVar4 = new kyc("NTH_RUN_BUTTON", 3, (int) acxy.d(), (int) acxy.f(), acxy.y(), acai.c, yzz.USER_EDUCATION_ASSISTANT_NTH_RUN_BUTTON);
        d = kycVar4;
        kyc kycVar5 = new kyc("DIALER_FIRST_OPEN", 4, R.string.assistant_education_tooltip_dialer_open, acxy.t(), acai.p, yzz.USER_EDUCATION_ASSISTANT_DIALER_FIRST_OPEN);
        e = kycVar5;
        int iJ = (int) acxy.j();
        kyc kycVar6 = new kyc("LONG_DRIVE_START", 5, iJ != 1 ? iJ != 2 ? R.string.assistant_tooltip_add_a_stop_0 : R.string.assistant_tooltip_share_eta : R.string.assistant_tooltip_add_a_stop_1, acxy.D(), acai.z, yzz.USER_EDUCATION_ASSISTANT_LONG_DRIVE_START);
        f = kycVar6;
        kyc kycVar7 = new kyc("PHONE_CALL_ENDED", 6, R.string.assistant_education_tooltip_phone_call_ended, acxy.C(), acai.r, yzz.USER_EDUCATION_ASSISTANT_PHONE_CALL_ENDED);
        g = kycVar7;
        kyc kycVar8 = new kyc(acxy.q(), acai.w, yzz.USER_EDUCATION_ASSISTANT_LAUNCHER_OPEN);
        h = kycVar8;
        i = new kyc[]{kycVar, kycVar2, kycVar3, kycVar4, kycVar5, kycVar6, kycVar7, kycVar8};
    }

    private kyc(String str, int i2, int i3, int i4, boolean z, acai acaiVar, yzz yzzVar) {
        int i5 = R.string.assistant_education_tooltip_copy_0;
        switch (i3) {
            case 0:
                break;
            case 1:
                i5 = R.string.assistant_education_tooltip_copy_1;
                break;
            case 2:
                i5 = R.string.assistant_education_tooltip_copy_2;
                break;
            case 3:
                i5 = R.string.assistant_education_tooltip_copy_3;
                break;
            case 4:
                i5 = R.string.assistant_education_tooltip_copy_4;
                break;
            case 5:
                i5 = R.string.assistant_education_tooltip_copy_5;
                break;
            case 6:
                i5 = R.string.assistant_education_tooltip_copy_6;
                break;
            case 7:
                i5 = R.string.assistant_education_tooltip_copy_7;
                break;
            case 8:
                i5 = R.string.assistant_education_tooltip_copy_8;
                break;
            case 9:
                i5 = R.string.assistant_education_tooltip_copy_9;
                break;
            case 10:
                i5 = R.string.assistant_education_tooltip_copy_10;
                break;
            case 11:
                i5 = R.string.assistant_education_tooltip_copy_11;
                break;
            case 12:
                i5 = R.string.assistant_education_tooltip_copy_12;
                break;
            case 13:
                i5 = R.string.assistant_education_tooltip_copy_13;
                break;
            case 14:
            default:
                ((ype) ((ype) kyd.a.h()).ai((char) 3532)).w("Unknown copy variant: %d, using default", i3);
                break;
            case 15:
                i5 = R.string.assistant_education_tooltip_copy_15;
                break;
            case 16:
                i5 = R.string.assistant_education_tooltip_copy_16;
                break;
            case 17:
                i5 = R.string.assistant_education_tooltip_copy_17;
                break;
        }
        int i6 = 0;
        switch (i4) {
            case 0:
                break;
            case 1:
                i6 = R.drawable.ic_assistant_education_tooltip_graphic_1;
                break;
            case 2:
                i6 = R.drawable.ic_assistant_education_tooltip_graphic_2;
                break;
            case 3:
                i6 = R.drawable.ic_assistant_education_tooltip_graphic_3;
                break;
            case 4:
                i6 = R.drawable.ic_assistant_education_tooltip_graphic_4;
                break;
            case 5:
                i6 = R.drawable.ic_assistant_education_tooltip_graphic_5;
                break;
            case 6:
                i6 = R.drawable.ic_assistant_education_tooltip_graphic_6;
                break;
            default:
                ((ype) ((ype) kyd.a.h()).ai((char) 3531)).w("Unknown graphic variant: %d, using default", i4);
                break;
        }
        this.j = new odd(i5, i6, z, acaiVar, yzzVar);
    }

    public static kyc valueOf(String str) {
        return (kyc) Enum.valueOf(kyc.class, str);
    }

    public static kyc[] values() {
        return (kyc[]) i.clone();
    }

    @Override // defpackage.nma
    public final nlz a() {
        return nlz.c;
    }

    @Override // defpackage.nge
    @ResultIgnorabilityUnspecified
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        ocq ocqVarA = this.j.a((oco) obj, this);
        yfy yfyVar = kyd.b;
        if (yfyVar.containsKey(this)) {
            kwv kwvVarH = kfl.h();
            abnp abnpVarN = osw.a.n();
            osv osvVar = (osv) yfyVar.get(this);
            abnpVarN.t();
            osw oswVar = (osw) abnpVarN.b;
            oswVar.c = osvVar.C;
            oswVar.b |= 1;
            kwvVarH.v((osw) abnpVarN.q());
        }
        return ocqVarA;
    }

    @Override // defpackage.nge
    public final String c() {
        return "assistant";
    }

    @Override // defpackage.nge
    public final String d() {
        return name();
    }

    private kyc(String str, int i2, int i3, boolean z, acai acaiVar, yzz yzzVar) {
        this.j = new odd(i3, 0, z, acaiVar, yzzVar);
    }

    private kyc(String str, boolean z, acai acaiVar, yzz yzzVar) {
        this.j = new odd(str, 2131233030, z, acaiVar, yzzVar);
    }

    private kyc(String str, acai acaiVar, yzz yzzVar) {
        this.j = new odd(str, 0, false, acaiVar, yzzVar);
    }
}
