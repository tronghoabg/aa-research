package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class tbm implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tbm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v33, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = 14;
        int i2 = 13;
        int i3 = 15;
        int i4 = 10;
        int i5 = 1;
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                afco afcoVar = tby.a;
                bool.getClass();
                ((tbo) this.a).b(bool.booleanValue());
                break;
            case 1:
                Object obj2 = this.a;
                afco afcoVar2 = tby.a;
                break;
            case 2:
                afco afcoVar3 = tby.a;
                ((eqj) this.a).m(obj);
                break;
            case 3:
                gjv gjvVar = (gjv) obj;
                if (gjvVar != null) {
                    break;
                } else {
                    break;
                }
            case 4:
                tcf tcfVar = new tcf(obj);
                tbn tbnVar = (tbn) this.a;
                tbnVar.a = tcfVar;
                tbnVar.h = new tcf(obj);
                tbnVar.a();
                break;
            case 5:
                List list = (List) obj;
                list.getClass();
                Object obj3 = this.a;
                ((eqj) obj3).m(((tbp) obj3).a.invoke(list));
                break;
            case 6:
                ((ynz) thj.h.f().ai(9075)).u("Invalidate template");
                ((qw) this.a).j();
                break;
            case 7:
                Object obj4 = this.a;
                break;
            case 8:
                wb wbVar = (wb) obj;
                wbVar.getClass();
                break;
            case 9:
                wb wbVar2 = (wb) obj;
                wbVar2.getClass();
                break;
            case 10:
                xsa xsaVar = (xsa) obj;
                xsaVar.getClass();
                xsaVar.a = BitmapDescriptorFactory.HUE_RED;
                xsaVar.b = BitmapDescriptorFactory.HUE_RED;
                xsaVar.d = 1.0f;
                xsaVar.c = ((xrt) this.a).d.intValue();
                break;
            case 11:
                xrk xrkVar = (xrk) obj;
                xrkVar.getClass();
                xrkVar.a = 6.0f;
                xrkVar.b = 10.0f;
                xrkVar.c = 0.1f;
                xrkVar.d = 0.5f;
                xrkVar.e = 1.5f;
                xrkVar.h = BitmapDescriptorFactory.HUE_RED;
                xrkVar.g = wpq.G(((xrt) this.a).e);
                break;
            case 12:
                xsd xsdVar = (xsd) obj;
                xsdVar.getClass();
                xsdVar.a = BitmapDescriptorFactory.HUE_RED;
                xsdVar.c = 0.0175f;
                xsdVar.b = 1.0f;
                xsdVar.d = 50.0f;
                xsdVar.e = 1.0f;
                xsdVar.f = 5.5f;
                xsdVar.g = wpq.F(((xrt) this.a).e);
                break;
            case 13:
                xru xruVar = (xru) obj;
                xruVar.getClass();
                xruVar.d = 26.6f;
                xruVar.e = 26.6f;
                xruVar.b = wpq.G(((xrt) this.a).e);
                break;
            case 14:
                xsb xsbVar = (xsb) obj;
                xsbVar.getClass();
                int[] iArr = ((xrt) this.a).e;
                xsbVar.d = wpq.F(iArr);
                xsbVar.e = wpq.G(iArr);
                xsbVar.b = 1;
                break;
            case 15:
                xrf xrfVar = (xrf) obj;
                xrfVar.getClass();
                xrm xrmVar = (xrm) this.a;
                xrfVar.b(xrmVar.d(), new xrl(6));
                xrfVar.b(xrmVar.a(), new xrl(i2));
                break;
            case 16:
                xrf xrfVar2 = (xrf) obj;
                xrfVar2.getClass();
                xrfVar2.b(((xrm) this.a).c(), new xrl(i));
                break;
            case 17:
                xrf xrfVar3 = (xrf) obj;
                xrfVar3.getClass();
                xrfVar3.b(((xrm) this.a).d(), new oin(20));
                break;
            case 18:
                xrx xrxVar = (xrx) obj;
                xrxVar.getClass();
                xrxVar.a = wpq.V(new xrl(4));
                Object obj5 = this.a;
                xrxVar.b = wpq.Y(new tbm(obj5, i4));
                xrxVar.f = wpq.O(new tbm(obj5, 11));
                xrxVar.e = wpq.ae(new xrl(5));
                tbm tbmVar = new tbm(obj5, 12);
                xsd xsdVar2 = new xsd((byte[]) null);
                tbmVar.invoke(xsdVar2);
                xrxVar.h = xsdVar2.a();
                xrxVar.i = wpq.R(new tbm(obj5, i2));
                xrxVar.c = wpq.aa(new tbm(obj5, i));
                break;
            case 19:
                xrx xrxVar2 = (xrx) obj;
                xrxVar2.getClass();
                xrxVar2.a = wpq.V(new xrp(2));
                xrt xrtVar = (xrt) this.a;
                xrxVar2.b = wpq.Y(new xro(xrtVar, 7));
                xrxVar2.c = wpq.aa(new xro(xrtVar, 8));
                xrxVar2.f = wpq.O(new xro(xrtVar, 9));
                xrxVar2.i = wpq.R(new xro(xrtVar, i4));
                break;
            default:
                xrx xrxVar3 = (xrx) obj;
                xrxVar3.getClass();
                xrxVar3.b = wpq.X(xrxVar3.e(), new xrn(i5));
                xrxVar3.e = wpq.ad(xrxVar3.g(), new xrn(i4));
                xrxVar3.f = wpq.P(xrxVar3.a(), new xrn(i3));
                xqx xqxVar = xrxVar3.c;
                if (xqxVar == null) {
                    xqxVar = new xqx(null);
                }
                xrxVar3.c = wpq.Z(xqxVar, new xrp(0));
                break;
        }
        return afak.a;
    }
}
