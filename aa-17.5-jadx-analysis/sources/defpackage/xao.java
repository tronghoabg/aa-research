package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.components.settings.connectacar.ConnectACarActivity;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;
import com.google.android.projection.gearhead.sdk.CarAppLayout;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class xao implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public xao(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ProjectionKeyboardLayout projectionKeyboardLayout;
        xdo xdoVar;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                xap xapVar = (xap) obj;
                CarInfoInternal carInfoInternal = xapVar.c;
                if (carInfoInternal != null) {
                    if (BluetoothAdapter.checkBluetoothAddress(carInfoInternal.f)) {
                        try {
                            ((zeu) ozf.b().d(((BluetoothAdapter) ((xap) obj).e.get()).getRemoteDevice(((xap) obj).c.f))).s();
                        } catch (InterruptedException | ExecutionException e) {
                            ((ype) ((ype) ((ype) xap.a.h()).p(e)).ai(10000)).y("Failed to delete car with address %s from WifiDataStore", xapVar.c.f);
                        }
                    }
                    jlo jloVar = xapVar.b;
                    jloVar.getClass();
                    CarInfo carInfo = xapVar.c.a;
                    jloVar.i(carInfo.d, carInfo.a);
                    if (xapVar.d) {
                        rxf.i(((Fragment) obj).getActivity().getApplicationContext(), mki.a.d, yxo.REJECTED_CARS);
                    }
                    ((Fragment) obj).getActivity().a().Q();
                    break;
                }
                break;
            case 1:
                Object obj2 = this.a;
                xap xapVar2 = (xap) obj2;
                CarInfo carInfo2 = xapVar2.c.a;
                Fragment fragment = (Fragment) obj2;
                View viewInflate = fragment.getActivity().getLayoutInflater().inflate(R.layout.settings_legacy_car_name_dialog, (ViewGroup) fragment.getActivity().findViewById(android.R.id.content), false);
                ((EditText) viewInflate.findViewById(R.id.manufacturer_text)).setText(carInfo2.a);
                EditText editText = (EditText) viewInflate.findViewById(R.id.name_text);
                editText.setText(carInfo2.p);
                editText.requestFocus();
                AlertDialog alertDialogCreate = new AlertDialog.Builder(fragment.getActivity()).setTitle(fragment.getString(R.string.name_this_car)).setView(viewInflate).setPositiveButton(fragment.getString(android.R.string.ok), new jmn(xapVar2, carInfo2, 5)).setNegativeButton(fragment.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                alertDialogCreate.getWindow().setSoftInputMode(5);
                break;
            case 2:
                Object obj3 = this.a;
                Fragment fragment2 = (Fragment) obj3;
                final Intent intent = new Intent(fragment2.requireActivity(), (Class<?>) ConnectACarActivity.class);
                if (!aczy.c()) {
                    fragment2.startActivity(intent);
                    break;
                } else {
                    final xbo xboVar = (xbo) obj3;
                    xboVar.u(new xbn() { // from class: xbh
                        @Override // defpackage.xbn
                        public final void a(Activity activity) {
                            xboVar.j.b(intent);
                        }
                    });
                    break;
                }
            case 3:
                Object obj4 = this.a;
                xbq xbqVar = (xbq) obj4;
                LauncherAppSettingsActivity launcherAppSettingsActivity = xbqVar.t;
                em emVar = new em(new ContextThemeWrapper(launcherAppSettingsActivity, R.style.Theme_Gearhead_Settings_AlertDialog));
                boolean zI = nrz.e().i();
                emVar.o(launcherAppSettingsActivity.getText(R.string.settings_customize_sorting_selection_dialog_title));
                emVar.m(xbqVar.v, zI ? 1 : 0, new mhb(obj4, 17));
                emVar.b().show();
                break;
            case 4:
                int i = xbr.t;
                this.a.run();
                break;
            case 5:
                Object obj5 = this.a;
                mrl mrlVar = (mrl) ((wzy) obj5).w;
                wxj wxjVar = new wxj(mrlVar, 7);
                mrg mrgVar = mrlVar.h;
                mrj mrjVarB = mrj.b();
                if (acsi.e()) {
                    wer.c();
                    yph yphVar = mrj.a;
                    ((ype) yphVar.l().ai(5220)).w("delete rec=%d", mrgVar.hashCode());
                    if (mrjVarB.b.remove(mrgVar)) {
                        mrjVarB.c();
                        mrjVarB.d();
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uR).l());
                    } else {
                        ((ype) yphVar.l().ai((char) 5221)).u("record not found");
                    }
                }
                Snackbar snackbarK = Snackbar.k(((xbr) obj5).x, R.string.settings_customize_add_launcher_shortcut_deleted);
                snackbarK.m(R.string.undo, new xao(wxjVar, 4, bArr));
                snackbarK.f();
                break;
            case 6:
                ((ype) ((ype) xbt.a.f()).ai((char) 10049)).u("user exits frx");
                sei seiVar = (sei) this.a;
                seiVar.b().f("EVENT_EXIT_CLICKED", null);
                seiVar.c(yzy.bL);
                break;
            case 7:
                ((ype) ((ype) xbu.a.g()).ai((char) 10050)).u("Critical error: user didn't accept Terms Of Service");
                sei seiVar2 = (sei) this.a;
                seiVar2.b().f("EVENT_EXIT_CLICKED", null);
                seiVar2.c(yzy.bI);
                break;
            case 8:
                Object obj6 = this.a;
                xbu xbuVar = (xbu) obj6;
                xbuVar.g(view);
                ((ImageView) view.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(xbuVar.c);
                ((xcg) obj6).f();
                break;
            case 9:
                ((TextView) view.findViewById(R.id.data_notice_entry_body)).setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
                ImageView imageView = (ImageView) view.findViewById(R.id.data_notice_entry_arrow);
                Object obj7 = this.a;
                imageView.setImageDrawable(((xbu) obj7).d);
                ((xcg) obj7).f();
                view.setOnClickListener(new xao(obj7, 8));
                break;
            case 10:
                sei seiVar3 = (sei) this.a;
                seiVar3.b().f("EVENT_ACCEPT_CLICKED", null);
                seiVar3.c(yzy.bH);
                break;
            case 11:
                sei seiVar4 = (sei) this.a;
                seiVar4.b().f("EVENT_EXIT_CLICKED", null);
                seiVar4.c(yzy.bL);
                break;
            case 12:
                sei seiVar5 = (sei) this.a;
                seiVar5.b().f("EVENT_EXIT_CLICKED", null);
                seiVar5.c(yzy.bL);
                break;
            case 13:
                Object obj8 = this.a;
                if (((xca) obj8).a) {
                    Bundle bundle = new Bundle();
                    Fragment fragment3 = (Fragment) obj8;
                    bundle.putString("errorTitle", fragment3.getString(R.string.frx_installing_apps_error_title_cancelled));
                    bundle.putString("errorMessage", fragment3.getString(R.string.frx_installing_apps_error_message_cancelled));
                    ((sei) obj8).b().f("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED", bundle);
                } else {
                    ((sei) obj8).b().f("EVENT_DOWNLOAD_APPS_REJECTED", null);
                }
                ((sei) obj8).c(yzy.bL);
                break;
            case 14:
                sei seiVar6 = (sei) this.a;
                seiVar6.c(yzy.bH);
                seiVar6.b().f("EVENT_DOWNLOAD_APPS_ACCEPTED", null);
                break;
            case 15:
                ((ype) ((ype) xce.a.g()).ai((char) 10051)).u("Critical error: user didn't accept Preinstalled Bulk Permissions.");
                sei seiVar7 = (sei) this.a;
                seiVar7.b().f("EVENT_EXIT_CLICKED", null);
                seiVar7.c(yzy.bI);
                break;
            case 16:
                sei seiVar8 = (sei) this.a;
                seiVar8.b().f("EVENT_EXIT_CLICKED", null);
                seiVar8.c(yzy.bI);
                break;
            case 17:
                ((ype) ((ype) xcp.a.g()).ai((char) 10111)).u("Critical error: user didn't accept Terms Of Service");
                sei seiVar9 = (sei) this.a;
                seiVar9.b().f("EVENT_EXIT_CLICKED", null);
                seiVar9.c(yzy.bI);
                break;
            case 18:
                xdo xdoVar2 = (xdo) view.getTag();
                long jCurrentTimeMillis = System.currentTimeMillis();
                int[] iArr = xdoVar2.d;
                int length = iArr.length;
                if (length <= 1 || (xdoVar = (projectionKeyboardLayout = (ProjectionKeyboardLayout) this.a).h) == null || xdoVar2.a != xdoVar.a || jCurrentTimeMillis >= projectionKeyboardLayout.g + 800) {
                    ProjectionKeyboardLayout projectionKeyboardLayout2 = (ProjectionKeyboardLayout) this.a;
                    projectionKeyboardLayout2.k.f(xdoVar2.a());
                    projectionKeyboardLayout2.f = 0;
                } else {
                    ajmd ajmdVar = projectionKeyboardLayout.k;
                    int i2 = projectionKeyboardLayout.f + 1;
                    projectionKeyboardLayout.f = i2;
                    int i3 = iArr[i2 % length];
                    xds xdsVar = (xds) ajmdVar.a;
                    xdsVar.e(-5);
                    xdsVar.e(i3);
                }
                ProjectionKeyboardLayout projectionKeyboardLayout3 = (ProjectionKeyboardLayout) this.a;
                projectionKeyboardLayout3.g = jCurrentTimeMillis;
                projectionKeyboardLayout3.h = xdoVar2;
                break;
            case 19:
                ((ype) CarAppLayout.a.l().ai((char) 10169)).u("mic button onclick");
                Object obj9 = this.a;
                try {
                    ((CarAppLayout) obj9).e.b(CarAppLayout.a());
                    break;
                } catch (IllegalStateException e2) {
                    ((ype) ((ype) ((ype) CarAppLayout.a.h()).p(e2)).ai((char) 10170)).u("failed to open demand space");
                    ((CarAppLayout) obj9).f = true;
                    return;
                }
            default:
                zvf zvfVar = (zvf) this.a;
                zvfVar.f.b(aahu.COMPASS_BUTTON_CLICK);
                ztt zttVar = zvfVar.a;
                CameraPosition cameraPositionC = zttVar.c();
                zttVar.h(new CameraPosition(cameraPositionC.target, cameraPositionC.zoom, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 400);
                break;
        }
    }

    public /* synthetic */ xao(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
