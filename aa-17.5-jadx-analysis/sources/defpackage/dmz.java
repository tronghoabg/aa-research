package defpackage;

import android.net.Uri;
import android.view.KeyEvent;
import androidx.car.app.media.model.MediaPlaybackTemplate;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.android.car.libraries.apphost.external.model.InCallTemplate;
import com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate;

/* loaded from: classes2.dex */
public final class dmz implements afec {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dmz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v31, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v43, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v46, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v49, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v52, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v55, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v58, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v61, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v64, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v67, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, zgp] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        giz gizVar = null;
        switch (this.b) {
            case 0:
                ((cun) obj).x((cuo) this.a, 0, 0);
                return afak.a;
            case 1:
                Throwable th = (Throwable) obj;
                crl crlVar = (crl) this.a;
                aitf aitfVar = crlVar.a;
                if (aitfVar != null) {
                    aitfVar.g(th);
                }
                crlVar.a = null;
                return afak.a;
            case 2:
                ?? r11 = this.a;
                cun cunVar = (cun) obj;
                int iBh = woy.bh(r11);
                if (iBh >= 0) {
                    int i = 0;
                    while (true) {
                        cunVar.x((cuo) r11.get(i), 0, 0);
                        if (i != iBh) {
                            i++;
                        }
                    }
                }
                return afak.a;
            case 3:
                this.a.cancel(false);
                return afak.a;
            case 4:
                Uri uri = (Uri) obj;
                uri.getClass();
                dxj dxjVar = (dxj) this.a;
                ahnc.d(dxjVar.d, null, 0, new bns(dxjVar, uri, (afck) null, 18), 3);
                return afak.a;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dyr dyrVar = (dyr) this.a;
                ahnc.d(dyrVar.c, null, 0, new dyo(zBooleanValue, dyrVar, null, 1, null), 3);
                return afak.a;
            case 6:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                dyr dyrVar2 = (dyr) this.a;
                ahnc.d(dyrVar2.c, null, 0, new dyo(zBooleanValue2, dyrVar2, null, 0), 3);
                return afak.a;
            case 7:
                String str = (String) obj;
                str.getClass();
                dyt dytVar = (dyt) this.a;
                ahnc.d(dytVar.c, null, 0, new bns(str, dytVar, (afck) null, 20), 3);
                return afak.a;
            case 8:
                int iIntValue = ((Number) obj).intValue();
                dyt dytVar2 = (dyt) this.a;
                ahnc.d(dytVar2.c, null, 0, new dys(dytVar2, iIntValue, (afck) null, 0), 3);
                return afak.a;
            case 9:
                KeyEvent keyEvent = ((cpo) obj).a;
                keyEvent.getClass();
                if (a.Y(rl.e(keyEvent), 1)) {
                    switch (keyEvent.getKeyCode()) {
                        case 280:
                            gizVar = giz.a;
                            break;
                        case 281:
                            gizVar = giz.b;
                            break;
                        case 282:
                            gizVar = giz.c;
                            break;
                        case 283:
                            gizVar = giz.d;
                            break;
                    }
                }
                return Boolean.valueOf(gizVar != null ? ((Boolean) this.a.invoke(gizVar)).booleanValue() : false);
            case 10:
                KeyEvent keyEvent2 = ((cpo) obj).a;
                keyEvent2.getClass();
                if (!a.Y(rl.e(keyEvent2), 1) || (!a.j(rl.f(keyEvent2), ti.g(66)) && !a.j(rl.f(keyEvent2), ti.g(23)))) {
                    return false;
                }
                this.a.b(Boolean.valueOf(!((Boolean) r11.a()).booleanValue()));
                return true;
            case 11:
                ((ggk) obj).getClass();
                return Boolean.valueOf(((gqo) this.a).b.f());
            case 12:
                wb wbVar = (wb) obj;
                if (wbVar != null) {
                    return this.a.invoke((MediaPlaybackTemplate) wbVar);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.media.model.MediaPlaybackTemplate");
            case 13:
                wb wbVar2 = (wb) obj;
                if (wbVar2 != null) {
                    return this.a.invoke((MapTemplate) wbVar2);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.navigation.model.MapTemplate");
            case 14:
                wb wbVar3 = (wb) obj;
                if (wbVar3 != null) {
                    return this.a.invoke((ggr) wbVar3);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.connectiontest.template.ConnectionTestTemplate");
            case 15:
                wb wbVar4 = (wb) obj;
                if (wbVar4 != null) {
                    return this.a.invoke((LongMessageTemplate) wbVar4);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.LongMessageTemplate");
            case 16:
                wb wbVar5 = (wb) obj;
                if (wbVar5 != null) {
                    return this.a.invoke((TelephoneKeypadTemplate) wbVar5);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate");
            case 17:
                wb wbVar6 = (wb) obj;
                if (wbVar6 != null) {
                    return this.a.invoke((androidx.car.app.dialer.TelephoneKeypadTemplate) wbVar6);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.dialer.TelephoneKeypadTemplate");
            case 18:
                wb wbVar7 = (wb) obj;
                if (wbVar7 != null) {
                    return this.a.invoke((InCallTemplate) wbVar7);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.InCallTemplate");
            case 19:
                wb wbVar8 = (wb) obj;
                if (wbVar8 != null) {
                    return this.a.invoke((androidx.car.app.dialer.InCallTemplate) wbVar8);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.dialer.InCallTemplate");
            default:
                wb wbVar9 = (wb) obj;
                if (wbVar9 != null) {
                    return this.a.invoke((NavigationTemplate) wbVar9);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.navigation.model.NavigationTemplate");
        }
    }
}
