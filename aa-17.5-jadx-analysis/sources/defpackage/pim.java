package defpackage;

/* loaded from: classes2.dex */
public final class pim extends RuntimeException {
    public final ablt a;
    public final int b;
    private final int c;
    private final String d;

    public pim(String str, int i, int i2, int i3, String str2, Throwable th) {
        ablt abltVar;
        super(str, th);
        if (i != 20) {
            switch (i) {
                case 0:
                    abltVar = ablt.OK;
                    break;
                case 1:
                    abltVar = ablt.CANCELLED;
                    break;
                case 2:
                    abltVar = ablt.UNKNOWN;
                    break;
                case 3:
                    abltVar = ablt.INVALID_ARGUMENT;
                    break;
                case 4:
                    abltVar = ablt.DEADLINE_EXCEEDED;
                    break;
                case 5:
                    abltVar = ablt.NOT_FOUND;
                    break;
                case 6:
                    abltVar = ablt.ALREADY_EXISTS;
                    break;
                case 7:
                    abltVar = ablt.PERMISSION_DENIED;
                    break;
                case 8:
                    abltVar = ablt.RESOURCE_EXHAUSTED;
                    break;
                case 9:
                    abltVar = ablt.FAILED_PRECONDITION;
                    break;
                case 10:
                    abltVar = ablt.ABORTED;
                    break;
                case 11:
                    abltVar = ablt.OUT_OF_RANGE;
                    break;
                case 12:
                    abltVar = ablt.UNIMPLEMENTED;
                    break;
                case 13:
                    abltVar = ablt.INTERNAL;
                    break;
                case 14:
                    abltVar = ablt.UNAVAILABLE;
                    break;
                case 15:
                    abltVar = ablt.DATA_LOSS;
                    break;
                case 16:
                    abltVar = ablt.UNAUTHENTICATED;
                    break;
                default:
                    abltVar = null;
                    break;
            }
        } else {
            abltVar = ablt.DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_;
        }
        this.a = (ablt) xxh.g(abltVar).d(ablt.UNKNOWN);
        this.b = i2;
        this.c = i3;
        this.d = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = woy.al(super.getMessage()) + " {canonicalCode=" + this.a.name() + ", loggedCode=" + this.b + ", posixErrno=" + this.c + "}";
        String str2 = this.d;
        if (woy.am(str2)) {
            return str;
        }
        return str + "\n\nNative status source locations:\n" + str2 + "\n";
    }
}
