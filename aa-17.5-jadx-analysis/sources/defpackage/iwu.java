package defpackage;

import android.os.Bundle;
import j$.util.function.Consumer$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class iwu implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ iwu(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((iwv) obj).a();
                break;
            case 1:
                ike.l((ikf) obj);
                break;
            case 2:
                ((iwv) obj).b();
                break;
            case 3:
                ((jku) obj).f.e(rrx.a);
                break;
            case 4:
                jku jkuVar = (jku) obj;
                jkv jkvVar = jkuVar.f;
                jkvVar.e(rrx.b);
                ((ype) ((ype) jqj.a.f()).ai(2622)).T("Wifi socket connect event: status = %d, socket retry count = %s, network retry count = %s, error code = %d, connection time = %s ms", Integer.valueOf(1), Integer.valueOf(jkuVar.e), Integer.valueOf(jkvVar.f), Integer.valueOf(303 == 0 ? 0 : 0 - 1), Integer.valueOf((int) jkvVar.g.a(TimeUnit.MILLISECONDS)));
                rxf.i(jkvVar.b, jkvVar.d, yxo.VPN_DETECTED);
                break;
            case 5:
                yph yphVar = jox.a;
                break;
            case 6:
                yph yphVar2 = jox.a;
                break;
            case 7:
                ((geu) obj).p();
                break;
            case 8:
                yph yphVar3 = jsp.a;
                ((geu) obj).B().a(13);
                break;
            case 9:
                ((rkx) obj).a();
                break;
            case 10:
                ((rkw) obj).a();
                break;
            case 11:
                ((ype) lnb.a.l().ai(4026)).y("isCarMedia()=%s", (Boolean) obj);
                break;
            case 12:
                yph yphVar4 = lvv.a;
                lvl.a((lvg) obj);
                break;
            case 13:
                Bundle bundle = (Bundle) obj;
                lvg.i(bundle, lvv.n(bundle));
                break;
            case 14:
                Bundle bundle2 = (Bundle) obj;
                int i = lvg.l;
                if (bundle2.getBoolean("group_conversation")) {
                    lvg.i(bundle2, lvv.n(bundle2));
                    break;
                }
                break;
            case 15:
                yph yphVar5 = lvv.a;
                lvl.a((lvg) obj);
                break;
            case 16:
                yph yphVar6 = lvv.a;
                lvl.a((lvg) obj);
                break;
            case 17:
                ((nrd) obj).a = false;
                break;
            case 18:
                yph yphVar7 = pdh.a;
                ((ozs) obj).c(ozr.t);
                break;
            case 19:
                yph yphVar8 = pdh.a;
                ((ozs) obj).b(ozr.v);
                break;
            default:
                yph yphVar9 = pdh.a;
                ((ozs) obj).b(ozr.v);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
