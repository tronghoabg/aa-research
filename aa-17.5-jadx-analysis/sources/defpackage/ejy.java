package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
final class ejy {
    private static final ekc b = new ejw(0);
    public final ekc a;

    public ejy() {
        ekc ekcVar;
        ekc[] ekcVarArr = new ekc[2];
        ekcVarArr[0] = ejw.a;
        Class cls = eig.a;
        try {
            ekcVar = (ekc) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            ekcVar = b;
        }
        ekcVarArr[1] = ekcVar;
        ejx ejxVar = new ejx(ekcVarArr);
        Charset charset = ejn.a;
        this.a = ejxVar;
    }

    public static boolean a(ekb ekbVar) {
        return ekbVar.c() + (-1) != 1;
    }

    public static boolean b(Class cls) {
        Class cls2 = eig.a;
        return eji.class.isAssignableFrom(cls);
    }
}
