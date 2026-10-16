package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.libraries.storage.protostore.MappedCounterCacheVersion;
import com.google.android.projection.gearhead.R;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class kew implements zfk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kew(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, wgc] */
    /* JADX WARN: Type inference failed for: r7v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Object, xwx] */
    @Override // defpackage.zfk
    public final zgp a(Object obj) throws Throwable {
        int i;
        kql kqlVar;
        int i2;
        int i3;
        ryc rycVar;
        int i4;
        zgp zgpVar;
        long jLongValue = -1;
        switch (this.b) {
            case 0:
                Context context = (Context) this.a;
                return wub.Y(new kev(context.getString(R.string.unable_to_run) + " " + context.getString(R.string.package_took_too_long), context.getString(R.string.no_data), context.getString(R.string.please_try_again), 1));
            case 1:
                yph yphVar = jmm.a;
                return this.a.invoke(obj);
            case 2:
                kqk kqkVar = (kqk) obj;
                int i5 = kqkVar.b & 1;
                Object obj2 = this.a;
                if (i5 != 0 && (i2 = (kqlVar = (kql) obj2).f) != 0 && kqkVar.c == i2) {
                    kqlVar.e();
                }
                if ((kqkVar.b & 2) != 0 && (i = kqkVar.d) >= 0) {
                    ajju ajjuVar = ((kql) obj2).l;
                    ajjuVar.a = i;
                    jLongValue = ((Long) ajjuVar.k(0)).longValue();
                }
                return wub.Y(new wic(jLongValue));
            case 3:
                yph yphVar2 = WirelessSetupSharedService.a;
                return ((phh) this.a).a;
            case 4:
                rrp rrpVar = (rrp) obj;
                int i6 = rrpVar.b & 1;
                Object obj3 = this.a;
                if (i6 != 0 && (i4 = (rycVar = (ryc) obj3).h) != 0 && rrpVar.c == i4) {
                    rycVar.e();
                }
                if ((rrpVar.b & 2) != 0 && (i3 = rrpVar.d) >= 0) {
                    ((ryc) obj3).m = true;
                    ajlp ajlpVar = ryc.q;
                    ajlpVar.a = i3;
                    jLongValue = ((Long) ajlpVar.n(0)).longValue();
                }
                return wub.Y(new wic(jLongValue));
            case 5:
                return ((voy) this.a).a((vow) obj);
            case 6:
                return ((wdn) this.a).c((wdo) obj);
            case 7:
                return ((wdn) this.a).c((wdo) obj);
            case 8:
                return ((wdn) this.a).c((wdo) obj);
            case 9:
                return wub.Z((zgp) ((wdq) this.a).f.gu());
            case 10:
                return this.a.c();
            case 11:
                wgp wgpVar = (wgp) this.a;
                wgpVar.f((Uri) wub.af(wgpVar.a), obj, (MappedCounterCacheVersion) wub.af(wgpVar.e.a()));
                return zgl.a;
            case 12:
                wgt wgtVar = (wgt) this.a;
                wgtVar.c((Uri) wub.af(wgtVar.a), obj);
                return zgl.a;
            case 13:
                wgt wgtVar2 = (wgt) this.a;
                return wub.Y(wgtVar2.b((Uri) wub.af(wgtVar2.a)));
            case 14:
                Uri uri = (Uri) obj;
                Uri uriT = woy.t(uri, ".bak");
                try {
                    nfh nfhVar = ((wgt) this.a).f;
                    if (nfhVar.g(uriT)) {
                        nfhVar.f(uriT, uri);
                    }
                    return zgl.a;
                } catch (IOException e) {
                    return new zhc(e);
                }
            case 15:
                Object obj4 = this.a;
                synchronized (((wgt) obj4).d) {
                    zgpVar = ((wgt) obj4).e;
                }
                return zgpVar;
            case 16:
                return wub.Y(this.a.a(obj));
            default:
                Object obj5 = this.a;
                ((IOException) obj5).addSuppressed((IOException) obj);
                throw ((Throwable) obj5);
        }
    }
}
