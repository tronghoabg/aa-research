package Yf;

import ef.C2529m;

/* renamed from: Yf.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1298d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16853a;

    static {
        Object objZ;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objZ = property != null ? Bf.r.l0(property) : null;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Integer num = (Integer) (objZ instanceof C2529m ? null : objZ);
        f16853a = num != null ? num.intValue() : 2097152;
    }
}
