package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import defpackage.yfl;
import defpackage.yfq;
import defpackage.yls;
import defpackage.ynp;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class VehicleEnergyForecast extends AbstractBundleable {
    public static final Parcelable.Creator<VehicleEnergyForecast> CREATOR = new AbstractBundleable.BundleableCreator(VehicleEnergyForecast.class);
    public EnergyAtDistance a;
    public EnergyAtDistance b;
    public int c;
    public ChargingStationDetails d;
    public List e;
    public List f;

    public VehicleEnergyForecast() {
        int i = yfq.d;
        yfq yfqVar = yls.a;
        this.e = yfqVar;
        this.f = yfqVar;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("energy_at_next_stop_bundle");
        if (bundle2 != null) {
            EnergyAtDistance energyAtDistance = new EnergyAtDistance();
            this.a = energyAtDistance;
            energyAtDistance.b(bundle2);
        }
        Bundle bundle3 = bundle.getBundle("distance_to_empty_bundle");
        if (bundle3 != null) {
            EnergyAtDistance energyAtDistance2 = new EnergyAtDistance();
            this.b = energyAtDistance2;
            energyAtDistance2.b(bundle3);
        }
        this.c = bundle.getInt("forecast_quality");
        Bundle bundle4 = bundle.getBundle("next_charging_stop_bundle");
        if (bundle4 != null) {
            ChargingStationDetails chargingStationDetails = new ChargingStationDetails();
            this.d = chargingStationDetails;
            chargingStationDetails.b(bundle4);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("stop_details_bundles");
        if (parcelableArrayList != null) {
            int i = yfq.d;
            yfl yflVar = new yfl(4);
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Bundle bundle5 = (Bundle) parcelableArrayList.get(i2);
                StopDetails stopDetails = new StopDetails();
                stopDetails.b(bundle5);
                yflVar.i(stopDetails);
            }
            this.e = yflVar.g();
        } else {
            int i3 = yfq.d;
            this.e = yls.a;
        }
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("data_authorizations_bundles");
        if (parcelableArrayList2 == null) {
            this.f = yls.a;
            return;
        }
        yfl yflVar2 = new yfl(4);
        int size2 = parcelableArrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Bundle bundle6 = (Bundle) parcelableArrayList2.get(i4);
            DataAuthorization dataAuthorization = new DataAuthorization();
            dataAuthorization.b(bundle6);
            yflVar2.i(dataAuthorization);
        }
        this.f = yflVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        if (this.a != null) {
            Bundle bundle2 = new Bundle();
            this.a.d(bundle2);
            bundle.putBundle("energy_at_next_stop_bundle", bundle2);
        }
        if (this.b != null) {
            Bundle bundle3 = new Bundle();
            this.b.d(bundle3);
            bundle.putBundle("distance_to_empty_bundle", bundle3);
        }
        bundle.putInt("forecast_quality", this.c);
        if (this.d != null) {
            Bundle bundle4 = new Bundle();
            this.d.d(bundle4);
            bundle.putBundle("next_charging_stop_bundle", bundle4);
        }
        if (!this.e.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(((yls) this.e).c);
            ynp ynpVarListIterator = ((yfq) this.e).listIterator(0);
            while (ynpVarListIterator.hasNext()) {
                StopDetails stopDetails = (StopDetails) ynpVarListIterator.next();
                Bundle bundle5 = new Bundle();
                stopDetails.d(bundle5);
                arrayList.add(bundle5);
            }
            bundle.putParcelableArrayList("stop_details_bundles", arrayList);
        }
        if (this.f.isEmpty()) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(((yls) this.f).c);
        ynp ynpVarListIterator2 = ((yfq) this.f).listIterator(0);
        while (ynpVarListIterator2.hasNext()) {
            DataAuthorization dataAuthorization = (DataAuthorization) ynpVarListIterator2.next();
            Bundle bundle6 = new Bundle();
            dataAuthorization.d(bundle6);
            arrayList2.add(bundle6);
        }
        bundle.putParcelableArrayList("data_authorizations_bundles", arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleEnergyForecast) {
            VehicleEnergyForecast vehicleEnergyForecast = (VehicleEnergyForecast) obj;
            if (this.c == vehicleEnergyForecast.c && Objects.equals(this.a, vehicleEnergyForecast.a) && Objects.equals(this.b, vehicleEnergyForecast.b) && Objects.equals(this.d, vehicleEnergyForecast.d) && Objects.equals(this.e, vehicleEnergyForecast.e) && Objects.equals(this.f, vehicleEnergyForecast.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "VehicleEnergyForecast{energyAtNextStop=" + String.valueOf(this.a) + ", distanceToEmpty=" + String.valueOf(this.b) + ", forecastQuality=" + this.c + ", nextChargingStop=" + String.valueOf(this.d) + ", stopDetails=" + String.valueOf(this.e) + ", dataAuthorizations=" + String.valueOf(this.f) + "}";
    }
}
