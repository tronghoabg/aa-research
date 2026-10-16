package defpackage;

import com.google.android.gms.car.control.CarAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class dmu implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ dmu(aitx aitxVar, CarAction carAction, kkf kkfVar, afha afhaVar, afeg afegVar, int i) {
        this.f = i;
        this.b = aitxVar;
        this.d = carAction;
        this.e = kkfVar;
        this.c = afhaVar;
        this.a = afegVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kkf] */
    /* JADX WARN: Type inference failed for: r6v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [aitx, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        int i = this.f;
        if (i == 0) {
            ?? r0 = this.e;
            Object obj = this.d;
            Object obj2 = this.c;
            ((dnq) this.a).o(this.b, (dnu) obj2, (dlr) obj, r0);
            return afak.a;
        }
        if (i == 1) {
            ?? r02 = this.e;
            Object obj3 = this.d;
            Object obj4 = this.a;
            ((dnm) this.c).a(this.b, (dnk) obj4, (dlr) obj3, r02);
            return afak.a;
        }
        if (i != 2) {
            ?? r6 = this.a;
            Object obj5 = this.c;
            ahnc.d(this.b, null, 0, new foz((CarAction) this.d, (kkf) this.e, (afha) obj5, (afeg) r6, (afck) null, 5), 3);
            return afak.a;
        }
        String str = ((kqz) this.e).e;
        int i2 = lxt.a;
        kwv kwvVarH = kfl.h();
        str.getClass();
        Object obj6 = this.d;
        Object obj7 = this.a;
        Object obj8 = this.c;
        String str2 = (String) obj8;
        String str3 = (String) obj7;
        String str4 = (String) obj6;
        kwvVarH.E(str4, str, str3, str2, (String) this.b, osv.ASSISTANT_NUDGE_TO_CONTACT_IN_MESSAGING_APP_CLICKED);
        return afak.a;
    }

    public /* synthetic */ dmu(dnm dnmVar, afdr afdrVar, dnk dnkVar, dlr dlrVar, dlg dlgVar, int i) {
        this.f = i;
        this.c = dnmVar;
        this.b = afdrVar;
        this.a = dnkVar;
        this.d = dlrVar;
        this.e = dlgVar;
    }

    public /* synthetic */ dmu(dnq dnqVar, afdr afdrVar, dnu dnuVar, dlr dlrVar, dlg dlgVar, int i) {
        this.f = i;
        this.a = dnqVar;
        this.b = afdrVar;
        this.c = dnuVar;
        this.d = dlrVar;
        this.e = dlgVar;
    }

    public /* synthetic */ dmu(String str, kqz kqzVar, String str2, String str3, String str4, int i) {
        this.f = i;
        this.d = str;
        this.e = kqzVar;
        this.a = str2;
        this.c = str3;
        this.b = str4;
    }
}
