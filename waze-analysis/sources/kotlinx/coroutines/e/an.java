package kotlinx.coroutines.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class an {
    public static final long a(String str, long j2, long j3, long j4) {
        String property;
        int i2 = am.f51870a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lH = h.n.o.h(property);
        if (lH == null) {
            throw new IllegalStateException("System property '" + str + "' has unrecognized value '" + property + "'");
        }
        long jLongValue = lH.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + "'");
    }

    public static final boolean b(String str, boolean z) {
        String strB = am.b(str);
        return strB != null ? Boolean.parseBoolean(strB) : z;
    }
}
