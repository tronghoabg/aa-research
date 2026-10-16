package v9;

import com.google.protobuf.ByteString;
import java.util.HashMap;
import java.util.Map;
import p9.EnumC3784e;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f47117a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f47118b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f47119c = true;

    /* renamed from: d, reason: collision with root package name */
    public ByteString f47120d = ByteString.EMPTY;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47121e = false;

    public final t a() {
        c9.d dVar = s9.h.f45374c;
        c9.d dVarA = dVar;
        c9.d dVarA2 = dVarA;
        c9.d dVarA3 = dVarA2;
        for (Map.Entry entry : this.f47118b.entrySet()) {
            s9.h hVar = (s9.h) entry.getKey();
            EnumC3784e enumC3784e = (EnumC3784e) entry.getValue();
            int iOrdinal = enumC3784e.ordinal();
            if (iOrdinal == 0) {
                dVarA3 = dVarA3.a(hVar);
            } else if (iOrdinal == 1) {
                dVarA = dVarA.a(hVar);
            } else {
                if (iOrdinal != 2) {
                    A6.c.s("Encountered invalid change type: %s", enumC3784e);
                    throw null;
                }
                dVarA2 = dVarA2.a(hVar);
            }
        }
        return new t(this.f47120d, this.f47121e, dVarA, dVarA2, dVarA3);
    }
}
