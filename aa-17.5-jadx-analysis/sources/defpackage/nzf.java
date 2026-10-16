package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.appwidget.AppWidgetProviderInfo;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.apps.auto.components.ui.text.CountIndicatorTextView;
import com.google.android.apps.auto.components.widgets.EarthPickerActivity;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.Distance;
import com.google.android.gms.car.navigation.StepDistance;
import com.google.android.projection.gearhead.R;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class nzf implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nzf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v30, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v41, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v43, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v72, types: [afeh, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        Distance distance;
        Distance distance2;
        CountIndicatorTextView countIndicatorTextView = null;
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                yph yphVar = RailStatusBarFragment.b;
                bool.getClass();
                ((nyn) this.a).c(bool.booleanValue());
                return afak.a;
            case 1:
                nep nepVar = (nep) obj;
                RailStatusBarFragment.b.l().y("Battery status update: %s", nepVar);
                int i = nepVar.a;
                nyn nynVar = (nyn) this.a;
                nynVar.a(i);
                nynVar.b(nepVar.a());
                return afak.a;
            case 2:
                Boolean bool2 = (Boolean) obj;
                ((ype) RailStatusBarFragment.b.f()).y("Show cell signal: %s", bool2);
                Object obj2 = this.a;
                obj2.getClass();
                bool2.getClass();
                ((View) obj2).setVisibility(true != bool2.booleanValue() ? 8 : 0);
                return afak.a;
            case 3:
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                valueAnimator.getClass();
                RailStatusBarFragment railStatusBarFragment = (RailStatusBarFragment) this.a;
                CountIndicatorTextView countIndicatorTextView2 = railStatusBarFragment.h;
                if (countIndicatorTextView2 == null) {
                    affa.d("notificationBadgeCount");
                    countIndicatorTextView2 = null;
                }
                ViewGroup.LayoutParams layoutParams = countIndicatorTextView2.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.height = ((Integer) animatedValue).intValue();
                CountIndicatorTextView countIndicatorTextView3 = railStatusBarFragment.h;
                if (countIndicatorTextView3 == null) {
                    affa.d("notificationBadgeCount");
                } else {
                    countIndicatorTextView = countIndicatorTextView3;
                }
                countIndicatorTextView.requestLayout();
                return afak.a;
            case 4:
                StepDistance stepDistance = (StepDistance) obj;
                yph yphVar2 = olb.a;
                if (stepDistance == null || (distance = stepDistance.a) == null) {
                    return null;
                }
                return olb.a((Context) this.a, distance);
            case 5:
                DestinationDistance destinationDistance = (DestinationDistance) obj;
                yph yphVar3 = olb.a;
                if (destinationDistance != null && (distance2 = destinationDistance.a) != null) {
                    Object obj3 = this.a;
                    long jCeil = (long) Math.ceil(destinationDistance.c / 60.0d);
                    int i2 = (int) (jCeil % 60);
                    int i3 = (int) (jCeil / 60);
                    String string = i3 == 0 ? ((Context) obj3).getString(R.string.navigation_time_minutes_only_format, Integer.toString(i2)) : i2 == 0 ? ((Context) obj3).getString(R.string.navigation_time_minutes_only_format, Integer.toString(i3)) : ((Context) obj3).getString(R.string.navigation_time_hours_minutes_format, Integer.toString(i3), Integer.toString(i2));
                    String strA = olb.a((Context) obj3, distance2);
                    if (strA != null) {
                        return string + " · " + strA;
                    }
                }
                return null;
            case 6:
                gjv gjvVar = (gjv) obj;
                omp ompVar = omp.a;
                gjvVar.getClass();
                int[] iArr = {android.R.attr.state_focused, android.R.attr.state_window_focused};
                omn omnVar = (omn) this.a;
                int i4 = omnVar.b;
                gjvVar.z(i4, iArr);
                gjvVar.z(i4, android.R.attr.state_activated);
                gjvVar.x(omnVar.a);
                return afak.a;
            case 7:
                opr.a.a().f.startAppWidgetConfigureActivityForResult((Activity) this.a, ((Integer) obj).intValue(), 0, 103, null);
                return afak.a;
            case 8:
                cst cstVar = (cst) obj;
                cstVar.getClass();
                ((byd) this.a).h((int) (cstVar.h() & 4294967295L));
                return afak.a;
            case 9:
                this.a.b(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return afak.a;
            case 10:
                ((byb) this.a).h(((Float) obj).floatValue());
                return afak.a;
            case 11:
                ((byd) this.a).h(((Integer) obj).intValue());
                return afak.a;
            case 12:
                AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) obj;
                appWidgetProviderInfo.getClass();
                Intent intent = new Intent();
                intent.putExtra("widget_info", appWidgetProviderInfo);
                EarthPickerActivity earthPickerActivity = (EarthPickerActivity) this.a;
                earthPickerActivity.setResult(-1, intent);
                earthPickerActivity.finish();
                return afak.a;
            case 13:
                String str = (String) obj;
                str.getClass();
                this.a.b(str);
                return afak.a;
            case 14:
                Set set = (Set) obj;
                set.getClass();
                this.a.b(set);
                return afak.a;
            case 15:
                oze ozeVar = ozf.a;
                pbm pbmVar = (pbm) DesugarCollections.unmodifiableMap(((pbn) obj).b).get(this.a);
                return Optional.ofNullable(pbmVar != null ? osq.O(pbmVar) : null);
            case 16:
                pbn pbnVar = (pbn) obj;
                oze ozeVar2 = ozf.a;
                pbnVar.getClass();
                abnp abnpVarK = pbnVar.K();
                abnpVarK.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pbn) abnpVarK.b).c)).getClass();
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.a;
                String address = bluetoothDevice.getAddress();
                address.getClass();
                abnpVarK.t();
                ((pbn) abnpVarK.b).c().remove(address);
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pbn) abnpVarK.b).b)).getClass();
                String address2 = bluetoothDevice.getAddress();
                address2.getClass();
                abnpVarK.t();
                ((pbn) abnpVarK.b).b().remove(address2);
                abqk abqkVarL = osq.L(abnpVarK);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : abqkVarL.a()) {
                    if (!affa.f((String) entry.getValue(), bluetoothDevice.getAddress())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                osq.L(abnpVarK);
                abnpVarK.t();
                ((pbn) abnpVarK.b).d().clear();
                osq.L(abnpVarK);
                abnpVarK.t();
                ((pbn) abnpVarK.b).d().putAll(linkedHashMap);
                return osq.K(abnpVarK);
            case 17:
                pbn pbnVar2 = (pbn) obj;
                oze ozeVar3 = ozf.a;
                pbnVar2.getClass();
                pbo pboVar = (pbo) DesugarCollections.unmodifiableMap(pbnVar2.c).get(this.a);
                return pboVar == null ? Optional.empty() : Optional.of(pboVar);
            case 18:
                pbn pbnVar3 = (pbn) obj;
                oze ozeVar4 = ozf.a;
                pbnVar3.getClass();
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(pbnVar3.b);
                Object obj4 = this.a;
                pbm pbmVar2 = (pbm) mapUnmodifiableMap.get(obj4);
                ozy ozyVarO = pbmVar2 != null ? osq.O(pbmVar2) : null;
                pbo pboVar2 = (pbo) DesugarCollections.unmodifiableMap(pbnVar3.c).get(obj4);
                if (ozyVarO == null || pboVar2 == null) {
                    return Optional.empty();
                }
                String str2 = pboVar2.c;
                str2.getClass();
                return Optional.of(new pad(ozyVarO, str2, pboVar2.d));
            case 19:
                Object obj5 = this.a;
                tbj tbjVar = (tbj) obj5;
                if (tbjVar.a) {
                    tbjVar.a = false;
                } else {
                    ((eqj) obj5).m(obj);
                }
                return afak.a;
            default:
                afco afcoVar = tby.a;
                return this.a.invoke(obj, obj, obj);
        }
    }
}
