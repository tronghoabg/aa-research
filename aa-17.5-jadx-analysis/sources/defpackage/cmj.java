package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class cmj implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ cmj(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                czz.I((cmd) obj, 0L, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, 126);
                return afak.a;
            case 1:
                return afak.a;
            case 2:
                boolean z = ((cqf) obj).b;
                return true;
            case 3:
                ((cxb) obj).u = true;
                return afak.a;
            case 4:
                return afak.a;
            case 5:
                cvy cvyVar = (cvy) obj;
                cvyVar.b = true;
                cjn.w(cvyVar);
                return afak.a;
            case 6:
                ((cvy) obj).v();
                return afak.a;
            case 7:
                ((cvw) obj).i().c = false;
                return afak.a;
            case 8:
                ((cvw) obj).i().d = false;
                return afak.a;
            case 9:
                cvw cvwVar = (cvw) obj;
                cvwVar.i().e = cvwVar.i().d;
                return afak.a;
            case 10:
                obj.getClass();
                return Boolean.valueOf(!((cyn) obj).w());
            case 11:
                Class cls = czq.a;
                return true;
            case 12:
                zf zfVar = czy.a;
                return Boolean.valueOf(vs.k((ddu) obj));
            case 13:
                ((Long) obj).longValue();
                int i = dcy.d;
                return afak.a;
            case 14:
                return Integer.valueOf(((dde) obj).b);
            case 15:
                return Integer.valueOf(((dde) obj).c.a());
            case 16:
                dme dmeVar = (dme) obj;
                dmeVar.getHandler().post(new lh(dmeVar.q, 15, null));
                return afak.a;
            case 17:
                return afak.a;
            case 18:
                return afak.a;
            case 19:
                return afak.a;
            default:
                deb debVar = ddx.z;
                afak afakVar = afak.a;
                ((dec) obj).a(debVar, afakVar);
                return afakVar;
        }
    }
}
