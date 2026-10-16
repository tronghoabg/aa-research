package defpackage;

import java.util.Map;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public abstract class adlk extends adky {
    private static final admn a = new admn(new adlj());

    public admn b(Map map) {
        return a;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("policy", c());
        xxgVarAo.f(LogFactory.PRIORITY_KEY, 5);
        xxgVarAo.h("available", true);
        return xxgVarAo.toString();
    }
}
