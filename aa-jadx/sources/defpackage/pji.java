package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pji extends java.lang.RuntimeException {
    public final defpackage.abmw a;
    public final int b;
    private final int c;
    private final java.lang.String d;

    public pji(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.Throwable th) {
        defpackage.abmw abmwVar;
        super(str, th);
        if (i != 20) {
            switch (i) {
                case 0:
                    abmwVar = defpackage.abmw.OK;
                    break;
                case 1:
                    abmwVar = defpackage.abmw.CANCELLED;
                    break;
                case 2:
                    abmwVar = defpackage.abmw.UNKNOWN;
                    break;
                case 3:
                    abmwVar = defpackage.abmw.INVALID_ARGUMENT;
                    break;
                case 4:
                    abmwVar = defpackage.abmw.DEADLINE_EXCEEDED;
                    break;
                case 5:
                    abmwVar = defpackage.abmw.NOT_FOUND;
                    break;
                case 6:
                    abmwVar = defpackage.abmw.ALREADY_EXISTS;
                    break;
                case 7:
                    abmwVar = defpackage.abmw.PERMISSION_DENIED;
                    break;
                case 8:
                    abmwVar = defpackage.abmw.RESOURCE_EXHAUSTED;
                    break;
                case 9:
                    abmwVar = defpackage.abmw.FAILED_PRECONDITION;
                    break;
                case 10:
                    abmwVar = defpackage.abmw.ABORTED;
                    break;
                case 11:
                    abmwVar = defpackage.abmw.OUT_OF_RANGE;
                    break;
                case 12:
                    abmwVar = defpackage.abmw.UNIMPLEMENTED;
                    break;
                case 13:
                    abmwVar = defpackage.abmw.INTERNAL;
                    break;
                case 14:
                    abmwVar = defpackage.abmw.UNAVAILABLE;
                    break;
                case 15:
                    abmwVar = defpackage.abmw.DATA_LOSS;
                    break;
                case 16:
                    abmwVar = defpackage.abmw.UNAUTHENTICATED;
                    break;
                default:
                    abmwVar = null;
                    break;
            }
        } else {
            abmwVar = defpackage.abmw.DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_;
        }
        this.a = (defpackage.abmw) defpackage.xyn.g(abmwVar).d(defpackage.abmw.UNKNOWN);
        this.b = i2;
        this.c = i3;
        this.d = str2;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.String str = defpackage.ysr.bv(super.getMessage()) + " {canonicalCode=" + this.a.name() + ", loggedCode=" + this.b + ", posixErrno=" + this.c + "}";
        java.lang.String str2 = this.d;
        if (defpackage.ysr.bw(str2)) {
            return str;
        }
        return str + "\n\nNative status source locations:\n" + str2 + "\n";
    }
}
