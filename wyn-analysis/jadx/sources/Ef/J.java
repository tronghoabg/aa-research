package Ef;

/* loaded from: classes5.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final M f3680a;

    static {
        String property;
        M m10;
        int i5 = Jf.t.f6138a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            Lf.e eVar = S.f3698a;
            Ff.e eVar2 = Jf.n.f6132a;
            Ff.e eVar3 = eVar2.f4117e;
            boolean z2 = eVar2 instanceof M;
            m10 = eVar2;
            if (!z2) {
                m10 = I.f3678i;
            }
        } else {
            m10 = I.f3678i;
        }
        f3680a = m10;
    }
}
