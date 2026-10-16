package defpackage;

/* loaded from: classes2.dex */
final class ejx implements ekc {
    private final ekc[] a;

    public ejx(ekc... ekcVarArr) {
        this.a = ekcVarArr;
    }

    @Override // defpackage.ekc
    public final ekb a(Class cls) {
        for (int i = 0; i < 2; i++) {
            ekc ekcVar = this.a[i];
            if (ekcVar.b(cls)) {
                return ekcVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.ekc
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
