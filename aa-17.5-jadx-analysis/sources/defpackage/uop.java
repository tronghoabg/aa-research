package defpackage;

/* loaded from: classes3.dex */
public enum uop {
    OK(1, 1),
    OK_PENDING(1, 2),
    IO_ERROR(2, 1),
    NOT_EXIST(3, 1),
    NOT_EXIST_PENDING(3, 2),
    NOT_FOUND_LOCALLY(4, 1),
    NOT_FOUND_LOCALLY_PENDING(4, 2),
    NOT_OFFLINEABLE(5, 1),
    NETWORK_ERROR(6, 1);

    public final int j;
    public final int k;

    uop(int i, int i2) {
        this.j = i;
        this.k = i2;
    }

    public static uop a(uop uopVar, boolean z) {
        int i = uopVar.j;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 2 ? i2 != 3 ? uopVar : z ? NOT_FOUND_LOCALLY_PENDING : NOT_FOUND_LOCALLY : z ? NOT_EXIST_PENDING : NOT_EXIST : z ? OK_PENDING : OK;
        }
        throw null;
    }
}
