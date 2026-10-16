package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class evm {
    public static final evm a = new euj();
    public static final evm b = new evg();
    public static final evm c = new euh();
    public static final evm d = new eui();
    public static final evm e = new eum();
    public static final evm f = new euk();
    public static final evm g = new eul();
    public static final evm h = new eug();
    public static final evm i = new eue();
    public static final evm j = new euf();
    public static final evm k = new euc();
    public static final evm l = new eua();
    public static final evm m = new eub();
    public static final evm n = new evw();
    public static final evm o = new evu();
    public static final evm p = new evv();
    public final boolean q;

    public evm(boolean z) {
        this.q = z;
    }

    public abstract Object b(Bundle bundle, String str);

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public String e() {
        throw null;
    }

    public abstract void f(Bundle bundle, String str, Object obj);

    public String h(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return e();
    }
}
