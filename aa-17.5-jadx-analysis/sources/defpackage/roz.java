package defpackage;

/* loaded from: classes.dex */
public final class roz implements rpa {
    private final yfy a;

    public roz(mko mkoVar) {
        this.a = yrm.F(((yfu) mkoVar.b).d(true));
        yrm.F(((yfu) mkoVar.a).d(true));
        yrm.F(((yfu) mkoVar.c).d(true));
        yrm.F(((yfu) mkoVar.d).d(true));
    }

    @Override // defpackage.rpa
    public final boolean K(roy royVar) {
        Boolean bool = (Boolean) this.a.get(royVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException(a.bV(royVar, "No flag value was set for key: ", "!"));
    }
}
