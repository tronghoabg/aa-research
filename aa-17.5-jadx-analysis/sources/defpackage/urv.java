package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class urv {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/v3/style/StyleCollectionImpl");
    private final urt b;
    private final List c = new ArrayList();
    private urs d;
    private final rjs e;

    public urv(int i, tqv tqvVar, rjs rjsVar) {
        this.b = new urt(i, tqvVar);
        this.e = rjsVar;
    }

    private final synchronized int d(urp urpVar, urq urqVar) {
        int iA;
        synchronized (this) {
            this.c.add(urqVar);
            iA = this.b.a(urpVar);
            this.d = null;
        }
        return iA;
        return iA;
    }

    public final synchronized urr a() {
        urs ursVar;
        ursVar = this.d;
        if (ursVar == null) {
            List list = this.c;
            urs ursVar2 = new urs(yfq.o(list), this.e);
            this.d = ursVar2;
            ursVar = ursVar2;
        }
        return ursVar.a();
    }

    public final uru b() {
        return this.b.c();
    }

    public final uxc c(urp urpVar, urq urqVar) {
        return new uxc(d(urpVar, urqVar));
    }
}
