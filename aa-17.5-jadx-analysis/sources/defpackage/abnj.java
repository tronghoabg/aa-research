package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class abnj {
    public static final abnj a = new abnj(null);
    public static volatile int b = 1;
    private static volatile boolean c = false;
    private static volatile abnj d;
    private final Map e;

    public abnj() {
        this.e = new HashMap();
    }

    public static abnj a() {
        abnj abnjVar = d;
        if (abnjVar != null) {
            return abnjVar;
        }
        synchronized (abnj.class) {
            abnj abnjVar2 = d;
            if (abnjVar2 != null) {
                return abnjVar2;
            }
            abnj abnjVarB = abno.b(abnj.class);
            d = abnjVarB;
            return abnjVarB;
        }
    }

    public abnh b(abow abowVar, int i) {
        return (abnh) this.e.get(new abni(abowVar, i));
    }

    public final void c(abnh abnhVar) {
        this.e.put(new abni(abnhVar.a, abnhVar.a()), abnhVar);
    }

    public abnj(byte[] bArr) {
        this.e = Collections.EMPTY_MAP;
    }
}
