package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.Settings;
import android.telephony.SmsMessage;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class kok implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kok(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Resources.NotFoundException {
        boolean z = true;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                ((koo) this.a).g((kom) obj, "reset");
                break;
            case 1:
                Alert alert = (Alert) obj;
                alert.getClass();
                ((kcu) this.a).b.d(alert.getId());
                break;
            case 2:
                ((eqj) this.a).q((kqg) obj);
                break;
            case 3:
                Integer num = (Integer) obj;
                yph yphVar = kqq.a;
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    ((ype) kqq.a.l().ai((char) 3395)).u("Reset USB port successful");
                } else if (iIntValue == 1) {
                    ((ype) ((ype) kqq.a.h()).ai((char) 3396)).u("Internal error resetting USB port");
                } else if (iIntValue == 2) {
                    ((ype) ((ype) kqq.a.h()).ai((char) 3397)).u("Resetting USB port not supported");
                } else if (iIntValue == 3) {
                    ((ype) ((ype) kqq.a.h()).ai((char) 3398)).u("ID mismatch resetting USB port");
                } else if (iIntValue != 4) {
                    ((ype) ((ype) kqq.a.h()).ai((char) 3394)).y("Unexpected return code %d when resetting USB", num);
                } else {
                    ((ype) ((ype) kqq.a.h()).ai((char) 3399)).u("Reset USB port failed for unknown reasons");
                }
                ((dnw) this.a).b(null);
                break;
            case 4:
                yph yphVar2 = lpz.a;
                lpz.e((ComponentName) this.a, ((yfq) obj).isEmpty() ? yzy.gI : yzy.gJ);
                break;
            case 5:
                yph yphVar3 = lpz.a;
                lpz.e((ComponentName) this.a, ((yfq) obj).isEmpty() ? yzy.gF : yzy.gH);
                break;
            case 6:
                SmsMessage[] smsMessageArr = (SmsMessage[]) obj;
                String strI = lva.i(smsMessageArr[0]);
                woy.aa(DesugarArrays.stream(smsMessageArr).allMatch(new lou(strI, 5)), "Received messages from different conversations");
                lva lvaVar = (lva) this.a;
                Map map = lvaVar.b;
                ids idsVar = (ids) map.get(strI);
                yfq yfqVar = (idsVar == null || idsVar.a) ? null : ((lug) idsVar.c).d;
                Context context = mki.a.c;
                String originatingAddress = smsMessageArr[0].getOriginatingAddress();
                originatingAddress.getClass();
                String strQ = odn.a().q(context, originatingAddress);
                Bitmap bitmapA = odn.a().a(context.getContentResolver(), originatingAddress);
                if (bitmapA == null) {
                    Context context2 = mki.a.c;
                    int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.notification_icon_size);
                    gnb gnbVar = new gnb(context2.getResources());
                    gnbVar.b(strQ, strQ);
                    gnbVar.c();
                    bitmapA = gnbVar.a(dimensionPixelSize);
                }
                duj dujVar = new duj();
                dujVar.a = strQ;
                Stream map2 = DesugarArrays.stream(smsMessageArr).map(new jxf(strI, new duk(dujVar), 9, bArr));
                int i = yfq.d;
                yfq yfqVarG = (yfq) map2.collect(ycm.a);
                if (yfqVar != null) {
                    yfl yflVar = new yfl(4);
                    yflVar.k(yfqVar);
                    yflVar.k(yfqVarG);
                    yfqVarG = yflVar.g();
                }
                luf lufVar = new luf();
                lufVar.b(strI);
                lufVar.f(strQ);
                lufVar.b = bitmapA;
                lufVar.c(false);
                lufVar.d(false);
                lufVar.e(yfqVarG);
                map.put(strI, new ids(lufVar.a(), originatingAddress));
                lvaVar.j();
                break;
            case 7:
                SmsMessage[] smsMessageArr2 = (SmsMessage[]) obj;
                String originatingAddress2 = smsMessageArr2[0].getOriginatingAddress();
                originatingAddress2.getClass();
                Context context3 = (Context) this.a;
                String strQ2 = odn.a().q(context3, originatingAddress2);
                Bitmap bitmapA2 = odn.a().a(context3.getContentResolver(), originatingAddress2);
                oit.a();
                long epochMilli = Instant.now().toEpochMilli();
                if (bitmapA2 == null) {
                    gnb gnbVar2 = new gnb(context3.getResources());
                    gnbVar2.b(strQ2, originatingAddress2);
                    gnbVar2.c();
                    bitmapA2 = gnbVar2.a(context3.getResources().getDimensionPixelSize(R.dimen.notification_icon_size));
                }
                int iHashCode = originatingAddress2.hashCode();
                lvj lvjVar = new lvj();
                lvjVar.f = iHashCode;
                lvjVar.l = Collections.singletonList(smsMessageArr2);
                lvjVar.g = context3.getPackageName();
                lvjVar.h = 4;
                lvjVar.o = epochMilli;
                lvjVar.p = strQ2;
                lvjVar.q = originatingAddress2;
                lvjVar.i = 2131233464;
                lvjVar.j = bitmapA2;
                lvjVar.k = Settings.System.DEFAULT_NOTIFICATION_URI;
                lvjVar.c = lnm.j().b(iHashCode);
                lvk lvkVar = new lvk(lvjVar);
                lvkVar.j(lws.d().i());
                if (!lnm.j().j(lvkVar) && !lvkVar.o()) {
                    z = false;
                }
                lvkVar.h(z);
                ebf.j().x(14, yyv.SI_CREATION_USED_SMS);
                lxr.e();
                yzz yzzVar = yzz.MESSAGING;
                lxr.i(yzzVar, yzy.nj, context3.getPackageName());
                lxr.e();
                lxr.i(yzzVar, yzy.nn, context3.getPackageName());
                ((ype) lvv.a.l().ai((char) 4354)).u("Processing Sms event");
                lnm.m().h(lvkVar);
                break;
            case 8:
                mik mikVar = (mik) obj;
                yph yphVar4 = mil.a;
                String strA = mikVar.a.a();
                strA.getClass();
                this.a.put(strA, mikVar.b);
                break;
            case 9:
                mik mikVar2 = (mik) obj;
                ?? r12 = this.a;
                yph yphVar5 = mil.a;
                String strA2 = mikVar2.a.a();
                strA2.getClass();
                Map.EL.putIfAbsent(r12, strA2, mikVar2.b);
                break;
            case 10:
                ((kmu) this.a).h("android.media.metadata.DISPLAY_ICON_URI", ((Uri) obj).toString());
                break;
            case 11:
                ((ett) this.a).b((String) obj);
                break;
            case 12:
                yop yopVarL = RailHotseatItemView.a.l();
                RailHotseatItemView railHotseatItemView = (RailHotseatItemView) this.a;
                yopVarL.y("%s global layout change, rebinding", railHotseatItemView.f);
                railHotseatItemView.g = false;
                nmj nmjVar = railHotseatItemView.d;
                if (nmjVar != null) {
                    railHotseatItemView.a(nmjVar);
                    break;
                }
                break;
            case 13:
                this.a.run();
                break;
            case 14:
                ((eqj) this.a).q((BluetoothProfile) obj);
                break;
            case 15:
                ((pdh) this.a).a((yxi) obj);
                break;
            case 16:
                pdh pdhVar = (pdh) this.a;
                ((ozs) obj).a(pdhVar.C, pdhVar.A, pdhVar.B);
                break;
            case 17:
                yph yphVar6 = pdh.a;
                ((ozs) obj).c((ozr) this.a);
                break;
            case 18:
                yph yphVar7 = pdh.a;
                ((ozs) obj).b((ozr) this.a);
                break;
            case 19:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                ((ype) WirelessSetupSharedService.a.l().ai((char) 6672)).y("associated bluetooth device: %s", bluetoothDevice);
                ((eqj) ((WirelessSetupSharedService) this.a).B.c).m(bluetoothDevice);
                break;
            default:
                ((rla) this.a).d((pba) obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
