package defpackage;

/* loaded from: classes2.dex */
public class iek extends iec {
    public static iek a;
    public static iek v;
    private static iek w;

    public static iek a(huq huqVar) {
        return (iek) new iek().P(huqVar, true);
    }

    public static iek b(Class cls) {
        return (iek) new iek().v(cls);
    }

    public static iek c(hwf hwfVar) {
        return (iek) new iek().w(hwfVar);
    }

    public static iek d() {
        iek iekVar = w;
        if (iekVar != null) {
            return iekVar;
        }
        iek iekVar2 = (iek) ((iek) new iek().L(ics.b, true)).t();
        w = iekVar2;
        return iekVar2;
    }

    public static iek e(hui huiVar) {
        return (iek) new iek().M(huiVar);
    }

    @Override // defpackage.iec
    public final boolean equals(Object obj) {
        return (obj instanceof iek) && super.equals(obj);
    }
}
