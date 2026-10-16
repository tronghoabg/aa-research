package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum mm implements com.google.v.eg {
    TOLL_PASS_TYPE_UNSPECIFIED(0),
    TOLL_PASS_TYPE_E_ZPASS(1),
    TOLL_PASS_TYPE_E_ZPASS_FLEX(15),
    TOLL_PASS_TYPE_FASTRAK(2),
    TOLL_PASS_TYPE_FASTRAK_FLEX(16),
    TOLL_PASS_TYPE_EXPRESSTOLL(3),
    TOLL_PASS_TYPE_EXPRESSTOLL_PLUS(18),
    TOLL_PASS_TYPE_SUNPASS(4),
    TOLL_PASS_TYPE_E_PASS(5),
    TOLL_PASS_TYPE_PEACH_PASS(6),
    TOLL_PASS_TYPE_I_PASS(7),
    TOLL_PASS_TYPE_NC_QUICK_PASS(8),
    TOLL_PASS_TYPE_PIKEPASS(9),
    TOLL_PASS_TYPE_TXTAG(10),
    TOLL_PASS_TYPE_EZ_TAG(11),
    TOLL_PASS_TYPE_EXPRESS_PASS(12),
    TOLL_PASS_TYPE_GOOD_TO_GO(13),
    TOLL_PASS_TYPE_GOOD_TO_GO_FLEX_PASS(17),
    TOLL_PASS_TYPE_TOLLTAG(14),
    TOLL_PASS_TYPE_EXEMPTION_DECAL(19),
    UNRECOGNIZED(-1);

    private final int w;

    mm(int i2) {
        this.w = i2;
    }

    public static mm a(int i2) {
        switch (i2) {
            case 0:
                return TOLL_PASS_TYPE_UNSPECIFIED;
            case 1:
                return TOLL_PASS_TYPE_E_ZPASS;
            case 2:
                return TOLL_PASS_TYPE_FASTRAK;
            case 3:
                return TOLL_PASS_TYPE_EXPRESSTOLL;
            case 4:
                return TOLL_PASS_TYPE_SUNPASS;
            case 5:
                return TOLL_PASS_TYPE_E_PASS;
            case 6:
                return TOLL_PASS_TYPE_PEACH_PASS;
            case 7:
                return TOLL_PASS_TYPE_I_PASS;
            case 8:
                return TOLL_PASS_TYPE_NC_QUICK_PASS;
            case 9:
                return TOLL_PASS_TYPE_PIKEPASS;
            case 10:
                return TOLL_PASS_TYPE_TXTAG;
            case 11:
                return TOLL_PASS_TYPE_EZ_TAG;
            case 12:
                return TOLL_PASS_TYPE_EXPRESS_PASS;
            case 13:
                return TOLL_PASS_TYPE_GOOD_TO_GO;
            case 14:
                return TOLL_PASS_TYPE_TOLLTAG;
            case 15:
                return TOLL_PASS_TYPE_E_ZPASS_FLEX;
            case 16:
                return TOLL_PASS_TYPE_FASTRAK_FLEX;
            case 17:
                return TOLL_PASS_TYPE_GOOD_TO_GO_FLEX_PASS;
            case 18:
                return TOLL_PASS_TYPE_EXPRESSTOLL_PLUS;
            case 19:
                return TOLL_PASS_TYPE_EXEMPTION_DECAL;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
