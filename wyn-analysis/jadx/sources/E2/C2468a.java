package e2;

import G2.i;
import I2.c;
import N1.C0765n;
import R8.v;
import ic.d;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2468a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2468a f34403a = new C2468a();

    public final d a(C0765n c0765n) {
        String str = c0765n.f8232n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C2.b(0);
                case "application/x-icy":
                    return new F2.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new C2.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(v.f("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(C0765n c0765n) {
        String str = c0765n.f8232n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
