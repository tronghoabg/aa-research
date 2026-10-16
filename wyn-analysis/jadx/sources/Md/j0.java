package md;

import k8.AbstractC3198g;

/* loaded from: classes5.dex */
public enum j0 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* renamed from: a, reason: collision with root package name */
    public final int f40671a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f40672b;

    j0(int i5) {
        this.f40671a = i5;
        this.f40672b = Integer.toString(i5).getBytes(AbstractC3198g.f39299a);
    }

    public final k0 a() {
        return (k0) k0.f40673d.get(this.f40671a);
    }
}
