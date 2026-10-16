package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class xrr implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xrr(int i) {
        this.b = i;
        this.a = "    ";
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [cwk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        Object objDE;
        switch (this.b) {
            case 0:
                xrx xrxVar = (xrx) obj;
                xrxVar.getClass();
                xrxVar.a = wpq.V(new xrp(5));
                xrt xrtVar = (xrt) this.a;
                xrxVar.b = wpq.Y(new xro(xrtVar, 14));
                xrxVar.c = wpq.aa(new xro(xrtVar, 15));
                xrxVar.e = wpq.ae(new xrp(6));
                xrxVar.f = wpq.O(new xro(xrtVar, 16));
                xrxVar.i = wpq.R(new xro(xrtVar, 17));
                return afak.a;
            case 1:
                xrf xrfVar = (xrf) obj;
                xrfVar.getClass();
                xrfVar.b(((xrs) this.a).c(), new xrp(13));
                return afak.a;
            case 2:
                xrk xrkVar = (xrk) obj;
                xrkVar.getClass();
                xrkVar.a = BitmapDescriptorFactory.HUE_RED;
                xrkVar.b = BitmapDescriptorFactory.HUE_RED;
                xrkVar.e = 2.0f;
                xrkVar.h = 1.0f;
                xrkVar.g = wpq.G(((xrt) this.a).e);
                return afak.a;
            case 3:
                cjn.w(this.a);
                return afak.a;
            case 4:
                return obj == this.a ? "(this Collection)" : String.valueOf(obj);
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                afas afasVar = (afas) this.a;
                return afasVar.h(key) + "=" + afasVar.h(entry.getValue());
            case 6:
                return ((aisl) this.a).b(((Integer) obj).intValue());
            case 7:
                String str = (String) obj;
                str.getClass();
                boolean zV = afyh.v(str);
                Object obj2 = this.a;
                return zV ? str.length() >= ((String) obj2).length() ? str : obj2 : ((String) obj2).concat(str);
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                return ((String) this.a).concat(str2);
            case 9:
                Throwable th = (Throwable) obj;
                int i = ajci.a;
                try {
                    Throwable th2 = (Throwable) this.a.invoke(th);
                    boolean zF = affa.f(th.getMessage(), th2.getMessage());
                    objDE = th2;
                    if (!zF) {
                        boolean zF2 = affa.f(th2.getMessage(), th.toString());
                        objDE = th2;
                        if (!zF2) {
                            objDE = null;
                        }
                    }
                } catch (Throwable th3) {
                    objDE = woy.dE(th3);
                }
                return (Throwable) (true != (objDE instanceof aezv) ? objDE : null);
            default:
                ((ajdz) this.a).d();
                return afak.a;
        }
    }

    public /* synthetic */ xrr(int i, byte[] bArr) {
        this.b = i;
        this.a = "";
    }

    public /* synthetic */ xrr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
