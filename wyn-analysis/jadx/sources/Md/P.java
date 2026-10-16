package md;

import A7.C0237b0;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class P {
    public abstract String a();

    public abstract O b(AbstractC3556y abstractC3556y);

    public abstract d0 c(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(a(), "policy");
        c0237b0S.h("priority", String.valueOf(5));
        c0237b0S.g("available", true);
        return c0237b0S.toString();
    }
}
