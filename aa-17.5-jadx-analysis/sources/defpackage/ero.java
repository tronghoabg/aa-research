package defpackage;

/* loaded from: classes.dex */
public final class ero implements aezr {
    private final afhe a;
    private final afdr b;
    private final afdr c;
    private final afdr d;
    private erm e;

    public ero(afhe afheVar, afdr afdrVar, afdr afdrVar2, afdr afdrVar3) {
        afheVar.getClass();
        this.a = afheVar;
        this.b = afdrVar;
        this.c = afdrVar2;
        this.d = afdrVar3;
    }

    @Override // defpackage.aezr
    public final /* synthetic */ Object a() {
        erm ermVar = this.e;
        if (ermVar != null) {
            return ermVar;
        }
        ert ertVar = (ert) this.b.invoke();
        erq erqVar = (erq) this.c.invoke();
        esc escVar = (esc) this.d.invoke();
        ertVar.getClass();
        erqVar.getClass();
        escVar.getClass();
        erm ermVarB = new ers(ertVar, erqVar, escVar).b(this.a);
        this.e = ermVarB;
        return ermVarB;
    }

    @Override // defpackage.aezr
    public final boolean b() {
        throw null;
    }
}
