package v9;

import java.util.Arrays;
import java.util.HashSet;
import m9.F;
import w9.C4386e;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f47065d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a, reason: collision with root package name */
    public final o f47066a;

    /* renamed from: b, reason: collision with root package name */
    public final C4386e f47067b;

    /* renamed from: c, reason: collision with root package name */
    public final m f47068c;

    public g(C4386e c4386e, o oVar, m mVar) {
        this.f47067b = c4386e;
        this.f47066a = oVar;
        this.f47068c = mVar;
    }

    public static boolean a(F f10) {
        switch (f10) {
            case OK:
                throw new IllegalArgumentException("Treated status OK as error");
            case CANCELLED:
            case UNKNOWN:
            case DEADLINE_EXCEEDED:
            case RESOURCE_EXHAUSTED:
            case INTERNAL:
            case UNAVAILABLE:
            case UNAUTHENTICATED:
                return false;
            case INVALID_ARGUMENT:
            case NOT_FOUND:
            case ALREADY_EXISTS:
            case PERMISSION_DENIED:
            case FAILED_PRECONDITION:
            case ABORTED:
            case OUT_OF_RANGE:
            case UNIMPLEMENTED:
            case DATA_LOSS:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + f10);
        }
    }
}
