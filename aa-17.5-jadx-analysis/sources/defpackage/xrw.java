package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class xrw implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ xrw(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                xsa xsaVar = (xsa) obj;
                xsaVar.getClass();
                xsaVar.b();
                return afak.a;
            case 1:
                xrj xrjVar = (xrj) obj;
                xrjVar.getClass();
                xrjVar.a = 850L;
                return afak.a;
            case 2:
                xsb xsbVar = (xsb) obj;
                xsbVar.getClass();
                xsbVar.b();
                return afak.a;
            case 3:
                xsc xscVar = (xsc) obj;
                xscVar.getClass();
                xscVar.a();
                return afak.a;
            case 4:
                xse xseVar = (xse) obj;
                xseVar.getClass();
                xseVar.b();
                return afak.a;
            case 5:
                xrk xrkVar = (xrk) obj;
                xrkVar.getClass();
                xrkVar.b();
                return afak.a;
            case 6:
                xrk xrkVar2 = (xrk) obj;
                xrkVar2.getClass();
                xrkVar2.b();
                return afak.a;
            case 7:
                xsd xsdVar = (xsd) obj;
                xsdVar.getClass();
                xsdVar.b();
                return afak.a;
            case 8:
                xru xruVar = (xru) obj;
                xruVar.getClass();
                xruVar.b();
                return afak.a;
            case 9:
                xrz xrzVar = (xrz) obj;
                xrzVar.getClass();
                xrzVar.a();
                return afak.a;
            case 10:
                xsa xsaVar2 = (xsa) obj;
                xsaVar2.getClass();
                xsaVar2.b();
                return afak.a;
            case 11:
                xsb xsbVar2 = (xsb) obj;
                xsbVar2.getClass();
                xsbVar2.b();
                return afak.a;
            case 12:
                xsc xscVar2 = (xsc) obj;
                xscVar2.getClass();
                xscVar2.a();
                return afak.a;
            case 13:
                xse xseVar2 = (xse) obj;
                xseVar2.getClass();
                xseVar2.b();
                return afak.a;
            case 14:
                xrk xrkVar3 = (xrk) obj;
                xrkVar3.getClass();
                xrkVar3.b();
                return afak.a;
            case 15:
                xrk xrkVar4 = (xrk) obj;
                xrkVar4.getClass();
                xrkVar4.b();
                return afak.a;
            case 16:
                xsd xsdVar2 = (xsd) obj;
                xsdVar2.getClass();
                xsdVar2.b();
                return afak.a;
            case 17:
                xru xruVar2 = (xru) obj;
                xruVar2.getClass();
                xruVar2.b();
                return afak.a;
            case 18:
                xrz xrzVar2 = (xrz) obj;
                xrzVar2.getClass();
                xrzVar2.a();
                return afak.a;
            case 19:
                afid afidVar = (afid) obj;
                afidVar.getClass();
                afie afieVar = afidVar.b;
                if (afieVar == null) {
                    return "*";
                }
                afib afibVar = afidVar.c;
                afgb afgbVar = afibVar instanceof afgb ? (afgb) afibVar : null;
                String strA = afgbVar != null ? afgbVar.a(true) : String.valueOf(afibVar);
                int iOrdinal = afieVar.ordinal();
                if (iOrdinal == 0) {
                    return strA;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(String.valueOf(strA));
                }
                if (iOrdinal == 2) {
                    return "out ".concat(String.valueOf(strA));
                }
                throw new aezs();
            default:
                airp airpVar = (airp) obj;
                airpVar.getClass();
                return airpVar.a();
        }
    }
}
