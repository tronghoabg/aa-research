package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.car.app.model.Action;
import com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridItemView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.InputSignInView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.apps.auto.sdk.SearchItem;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import com.google.android.apps.auto.wireless.deeplink.DeepLinkResolver;
import com.google.android.gearhead.appdecor.CarUiEntry;
import com.google.android.projection.gearhead.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final /* synthetic */ class jmq implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jmq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, mfq] */
    /* JADX WARN: Type inference failed for: r8v13, types: [gkt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, lpt] */
    /* JADX WARN: Type inference failed for: r8v8, types: [hjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r9v16, types: [gku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, uq] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xpv xpvVarB;
        int i = 1;
        switch (this.c) {
            case 0:
                ((ype) ((ype) jmr.g.h()).ai((char) 2364)).u("onClick: cancel");
                Object obj = this.a;
                ((jms) obj).j(yzy.bK);
                ((jmr) obj).j.a();
                ((PhonescreenFrxActivity) this.b).D();
                return;
            case 1:
                ((ype) ((ype) jmo.g.e()).ai((char) 2358)).u("onClick: continue");
                PhonescreenFrxActivity phonescreenFrxActivity = (PhonescreenFrxActivity) this.b;
                phonescreenFrxActivity.B(true);
                ((ynz) ((ynz) PhonescreenFrxActivity.m.f()).ai((char) 2379)).y("setBluetoothConnectionAllowed: bluetoothConnectionAllowed=%b", true);
                phonescreenFrxActivity.r.o(phonescreenFrxActivity.q, true);
                phonescreenFrxActivity.q.c = true;
                ((jms) this.a).j(yzy.bH);
                phonescreenFrxActivity.C();
                return;
            case 2:
                geu geuVar = (geu) this.b;
                ghe gheVarD = jtq.d(geuVar);
                if (gheVarD != null) {
                    gheVarD.g(gsn.c);
                }
                uq onClickDelegate = ((Action) this.a).getOnClickDelegate();
                if (onClickDelegate != null) {
                    gca.e(geuVar, onClickDelegate);
                    return;
                }
                return;
            case 3:
                EditorInfo editorInfo = new EditorInfo();
                Object obj2 = this.b;
                this.a.a(((kbu) obj2).b.onCreateInputConnection(editorInfo), new kbs(obj2, i));
                return;
            case 4:
                ?? r9 = this.a;
                Object obj3 = this.b;
                hlv hlvVar = GridItemView.a;
                jtr.d((geu) obj3, r9);
                return;
            case 5:
                jtr.d((geu) this.b, this.a);
                return;
            case 6:
                ?? r92 = this.a;
                if (r92.c()) {
                    return;
                }
                ?? r8 = this.b;
                ((InputSignInView) r8).a.removeMessages(1);
                r92.a(r8);
                return;
            case 7:
                ?? r93 = this.a;
                Object obj4 = this.b;
                yph yphVar = MaterialRowView.a;
                jtr.d((geu) obj4, r93);
                return;
            case 8:
                geu geuVar2 = (geu) this.b;
                ghe gheVarD2 = jtq.d(geuVar2);
                if (gheVarD2 != null) {
                    gheVarD2.g(gsn.c);
                }
                uq onClickDelegate2 = ((Action) this.a).getOnClickDelegate();
                if (onClickDelegate2 != null) {
                    gca.e(geuVar2, onClickDelegate2);
                    return;
                }
                return;
            case 9:
                ?? r94 = this.a;
                Object obj5 = this.b;
                yph yphVar2 = RowView.a;
                jtr.d((geu) obj5, r94);
                return;
            case 10:
                yph yphVar3 = mgi.a;
                ((ype) ((ype) yphVar3.f()).ai((char) 4887)).u("DSA reject button clicked");
                this.a.a(yzy.bI);
                mfo mfoVar = ((mfp) luk.b().a()).c;
                mfoVar.getClass();
                jlo jloVar = new jlo(((Fragment) this.b).getContext());
                try {
                    jloVar.m(mfoVar.e);
                    ((ype) ((ype) yphVar3.f()).ai(4889)).u("Added car to Rejected Cars list.");
                    jloVar.close();
                    ((mfp) luk.b().a()).b.a(mgl.d);
                    return;
                } catch (Throwable th) {
                    try {
                        jloVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                Object obj6 = this.a;
                if (obj6 != null) {
                    ((mzs) this.b).b();
                    mzo.c((ComponentName) obj6);
                    return;
                }
                return;
            case 12:
                Object obj7 = this.a;
                if (obj7 != null) {
                    ((mzs) this.b).b();
                    mzo.c((ComponentName) obj7);
                    return;
                }
                return;
            case 13:
                ((mzu) this.b).b();
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DASHBOARD, yzy.w);
                ComponentName componentName = (ComponentName) this.a;
                rrbVarH.p(componentName);
                ohsVarJ.F(rrbVarH.l());
                Intent component = new Intent().setComponent(componentName);
                component.getClass();
                mlq.g(component);
                return;
            case 14:
                Object obj8 = this.b;
                nao naoVarB = ((MediaSuggestionFragment) obj8).b();
                eqa viewLifecycleOwner = ((Fragment) obj8).getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                naoVarB.c(this.a, viewLifecycleOwner);
                return;
            case 15:
                int iOrdinal = ((nip) this.a).ordinal();
                Object obj9 = this.b;
                if (iOrdinal == 0) {
                    niy niyVar = (niy) obj9;
                    niyVar.a().m(niyVar.e);
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new aezs();
                    }
                    niy niyVar2 = (niy) obj9;
                    niyVar2.a().n(niyVar2.e);
                    return;
                }
            case 16:
                Object obj10 = this.a;
                DeepLinkResolver deepLinkResolver = (DeepLinkResolver) obj10;
                deepLinkResolver.B(yxi.QR_CODE_CONNECTION_ACCEPTED);
                ep epVar = (ep) obj10;
                ((TextView) epVar.findViewById(R.id.bs_title)).setText(R.string.deep_link_connecting_title);
                epVar.findViewById(R.id.bs_buttons).setVisibility(8);
                Object obj11 = this.b;
                BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(((ozh) obj11).h);
                try {
                    ozf ozfVarA = ozf.a(((DeepLinkResolver) obj10).getApplicationContext(), Executors.newCachedThreadPool());
                    if ((((ozh) obj11).b & 64) != 0) {
                        xpvVarB = xpv.b(((ozh) obj11).i);
                        if (xpvVarB == null) {
                            xpvVarB = xpv.UNKNOWN_SECURITY_MODE;
                        }
                    } else {
                        xpvVarB = xpv.WPA2_PERSONAL;
                    }
                    vlz vlzVar = new vlz();
                    vlzVar.g(((ozh) obj11).c);
                    vlzVar.c(((ozh) obj11).d);
                    vlzVar.e(((ozh) obj11).e);
                    vlzVar.f(xpvVarB);
                    ((zeu) ozfVarA.h(remoteDevice, vlzVar.b())).s();
                    abnp abnpVarN = xpu.a.n();
                    String str = ((ozh) obj11).f;
                    abnpVarN.t();
                    xpu xpuVar = (xpu) abnpVarN.b;
                    str.getClass();
                    xpuVar.b = 1 | xpuVar.b;
                    xpuVar.c = str;
                    int i2 = ((ozh) obj11).g;
                    abnpVarN.t();
                    xpu xpuVar2 = (xpu) abnpVarN.b;
                    xpuVar2.b |= 2;
                    xpuVar2.d = i2;
                    ((zeu) ozfVarA.i(remoteDevice, (xpu) abnpVarN.q())).s();
                    ((ype) ((ype) DeepLinkResolver.n.f()).ai(6216)).u("Parsed QR Code data was successfully saved!");
                    Intent intent = new Intent("com.google.android.projection.gearhead.START_WIRELESS_PROJECTION_WPP");
                    intent.setComponent(new ComponentName(deepLinkResolver.getApplicationContext(), (Class<?>) WifiBluetoothReceiver.class));
                    intent.putExtra("android.bluetooth.device.extra.DEVICE", remoteDevice);
                    deepLinkResolver.sendBroadcast(intent);
                    deepLinkResolver.B(yxi.QR_CODE_PAIRING_REQUEST_SENT);
                    deepLinkResolver.s = new oyy(obj10, 6);
                    deepLinkResolver.q.postDelayed(deepLinkResolver.s, DeepLinkResolver.o.toMillis());
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    ((ype) ((ype) ((ype) DeepLinkResolver.n.g()).p(e)).ai((char) 6217)).u("Failed to save QR Code data!");
                    deepLinkResolver.B(yxi.QR_CODE_CONNECTION_FAILED);
                    deepLinkResolver.D();
                    return;
                }
            case 17:
                ((CarUiEntry) this.b).lambda$initializeLegacyControllers$1((View) this.a, view);
                return;
            case 18:
                ((qgg) this.b).b.a(null);
                qgf qgfVar = (qgf) this.a;
                if (qgfVar.i()) {
                    qgfVar.e();
                    return;
                }
                return;
            case 19:
                qgm qgmVar = ((qgj) this.b).e;
                if (qgmVar.g.c.c()) {
                    ((ype) ((ype) qgm.a.h()).ai((char) 7159)).u("Skip notifying search item selected during animation");
                    return;
                }
                Object obj12 = this.a;
                SearchItem searchItem = (SearchItem) obj12;
                if (searchItem.a == 1) {
                    qgmVar.j(searchItem.b.toString());
                    return;
                }
                yph yphVar4 = qgm.a;
                ((ype) yphVar4.l().ai((char) 7165)).y("notifySearchItemSelected %s", obj12);
                if (qgmVar.i) {
                    qgmVar.g.c.a(new qfa(qgmVar, obj12, 5));
                    return;
                } else {
                    ((ype) ((ype) yphVar4.h()).ai((char) 7166)).u("notifySearchItemSelected called when search is inactive!");
                    return;
                }
            default:
                ((qgq) this.b).t((MenuItem) this.a);
                return;
        }
    }

    public /* synthetic */ jmq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public jmq(qgq qgqVar, MenuItem menuItem, int i) {
        this.c = i;
        this.b = qgqVar;
        this.a = menuItem;
    }
}
