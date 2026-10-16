package defpackage;

/* loaded from: classes.dex */
public final class dea implements afeg {
    public static final dea a = new dea();

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        ddf ddfVar = (ddf) obj;
        ddf ddfVar2 = (ddf) obj2;
        if (ddfVar == null || (str = ddfVar.a) == null) {
            str = ddfVar2.a;
        }
        return new ddf(str, ddfVar != null ? ddfVar.b : ddfVar2.b);
    }
}
