package m9;

import android.util.SparseArray;

/* loaded from: classes4.dex */
public enum F {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION_DENIED(7),
    /* JADX INFO: Fake field, exist only in values array */
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    /* JADX INFO: Fake field, exist only in values array */
    OUT_OF_RANGE(11),
    /* JADX INFO: Fake field, exist only in values array */
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* renamed from: m, reason: collision with root package name */
    public static final SparseArray f40422m;

    /* renamed from: a, reason: collision with root package name */
    public final int f40424a;

    static {
        SparseArray sparseArray = new SparseArray();
        for (F f10 : values()) {
            F f11 = (F) sparseArray.get(f10.f40424a);
            if (f11 != null) {
                throw new IllegalStateException("Code value duplication between " + f11 + "&" + f10.name());
            }
            sparseArray.put(f10.f40424a, f10);
        }
        f40422m = sparseArray;
    }

    F(int i5) {
        this.f40424a = i5;
    }
}
