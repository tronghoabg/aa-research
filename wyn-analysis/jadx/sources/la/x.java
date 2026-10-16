package la;

import E5.Q;
import java.io.IOException;
import ra.C3962a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final t f40210a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f40211b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f40212c;

    static {
        t tVar = new t();
        f40210a = tVar;
        u uVar = new u();
        f40211b = uVar;
        f40212c = new x[]{tVar, uVar, new x() { // from class: la.v
            public static Double b(String str, C3962a c3962a) throws ra.c, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        boolean z2 = true;
                        if (c3962a.f44697o != 1) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new ra.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c3962a.B());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e7) {
                    StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Cannot parse ", str, "; at path ");
                    sbW.append(c3962a.B());
                    throw new Q(sbW.toString(), e7, 13);
                }
            }

            @Override // la.x
            public final Number a(C3962a c3962a) throws IOException {
                String strC0 = c3962a.c0();
                if (strC0.indexOf(46) >= 0) {
                    return b(strC0, c3962a);
                }
                try {
                    return Long.valueOf(Long.parseLong(strC0));
                } catch (NumberFormatException unused) {
                    return b(strC0, c3962a);
                }
            }
        }, new x() { // from class: la.w
            @Override // la.x
            public final Number a(C3962a c3962a) throws IOException {
                String strC0 = c3962a.c0();
                try {
                    return na.d.j(strC0);
                } catch (NumberFormatException e7) {
                    StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Cannot parse ", strC0, "; at path ");
                    sbW.append(c3962a.B());
                    throw new Q(sbW.toString(), e7, 13);
                }
            }
        }};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f40212c.clone();
    }

    public abstract Number a(C3962a c3962a);
}
