package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1768n extends la.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27476a;

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        switch (this.f27476a) {
            case 0:
                c3962a.k0();
                return null;
            case 1:
                if (c3962a.e0() != 9) {
                    return Double.valueOf(c3962a.V());
                }
                c3962a.a0();
                return null;
            default:
                if (c3962a.e0() != 9) {
                    return Float.valueOf((float) c3962a.V());
                }
                c3962a.a0();
                return null;
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        switch (this.f27476a) {
            case 0:
                c3963b.z();
                break;
            case 1:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    la.l.a(dDoubleValue);
                    c3963b.Q(dDoubleValue);
                    break;
                } else {
                    c3963b.z();
                    break;
                }
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    la.l.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c3963b.X(numberValueOf);
                    break;
                } else {
                    c3963b.z();
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f27476a) {
            case 0:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
