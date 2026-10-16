package com.waze;

import android.location.Location;
import com.waze.favorites.FavoritesActivity;
import com.waze.location.LocationSensorListener;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class dg implements com.waze.ae.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23558a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23559b;

    public /* synthetic */ dg(Object obj, int i2) {
        this.f23559b = i2;
        this.f23558a = obj;
    }

    @Override // com.waze.ae.a
    public final void a(Object obj) {
        int i2 = this.f23559b;
        if (i2 == 0) {
            if (((com.waze.modules.navigation.al) obj) == com.waze.modules.navigation.al.f30301a) {
                ((MainActivity) ((dc) this.f23558a).f23278a).u = null;
            }
        } else {
            if (i2 == 1) {
                if (((com.waze.modules.navigation.al) obj) == com.waze.modules.navigation.al.f30301a) {
                    FavoritesActivity favoritesActivity = (FavoritesActivity) this.f23558a;
                    favoritesActivity.setResult(-1);
                    favoritesActivity.finish();
                    return;
                }
                return;
            }
            if (i2 != 2) {
                ((LocationSensorListener) this.f23558a).onLocation((Location) obj);
            } else {
                ((LocationSensorListener) this.f23558a).lambda$initNative$0((com.waze.location.x) obj);
            }
        }
    }
}
