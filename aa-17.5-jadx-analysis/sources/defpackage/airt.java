package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class airt implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ airt(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj == null);
            case 1:
            case 3:
                return obj;
            case 2:
                String str = (String) obj;
                str.getClass();
                return str;
            case 4:
                int i = ajci.a;
                return null;
            case 5:
                ajim ajimVar = (ajim) obj;
                ajimVar.getClass();
                ajin ajinVar = ajimVar.c;
                if (ajinVar instanceof ajim) {
                    return (ajim) ajinVar;
                }
                return null;
            case 6:
                ajim ajimVar2 = (ajim) obj;
                ajimVar2.getClass();
                return ajimVar2.a + "=" + ajimVar2.b;
            default:
                ajop ajopVar = (ajop) obj;
                ajnr ajnrVar = ajon.c;
                ajopVar.getClass();
                return Boolean.valueOf(ahfy.c(ajopVar.a));
        }
    }
}
