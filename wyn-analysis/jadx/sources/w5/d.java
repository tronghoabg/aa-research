package W5;

import E5.T;
import R8.v;
import a6.C1332a;
import b6.h;
import d6.C2390c;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15151a = new d();

    public final ic.d a(T t10) {
        String str = t10.f3238l;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new X5.b(0);
                case "application/x-icy":
                    return new C1332a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new X5.b(1);
                case "application/x-scte35":
                    return new C2390c();
            }
        }
        throw new IllegalArgumentException(v.f("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(T t10) {
        String str = t10.f3238l;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
