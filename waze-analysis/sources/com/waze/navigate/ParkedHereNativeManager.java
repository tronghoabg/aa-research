package com.waze.navigate;

import android.content.SharedPreferences;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.jni.protos.navigate.ParkedHere;
import com.waze.jni.protos.navigate.ParkedHereSetReason;
import com.waze.mg;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ParkedHereNativeManager extends fh implements fk {
    public static final int $stable = 8;
    private final com.waze.view.popups.b.m myParkingPhotoStateHolder;
    private final kotlinx.coroutines.b.bn<fj> parkedState;

    public ParkedHereNativeManager(com.waze.view.popups.b.m mVar) {
        h.g.b.x.f(mVar, "myParkingPhotoStateHolder");
        this.myParkingPhotoStateHolder = mVar;
        this.parkedState = kotlinx.coroutines.b.ck.b(null);
    }

    static final h.ab removeParking$lambda$0(ParkedHereNativeManager parkedHereNativeManager, h.ab abVar) {
        com.waze.ab.a.l.j(mg.f29780a.a());
        parkedHereNativeManager.myParkingPhotoStateHolder.b(com.waze.view.popups.b.e.f45255a);
        com.waze.map.bq bqVarE = com.waze.t.e();
        if (bqVarE != null) {
            bqVarE.j();
        }
        return h.ab.f48028a;
    }

    static final h.ab setParking$lambda$0(int i2, int i3, long j2, String str, CompletableDeferred completableDeferred, h.ab abVar) {
        SharedPreferences sharedPreferences = mg.f29780a.a().getSharedPreferences("com.waze.parked", 0);
        sharedPreferences.edit().putString(DriveToNativeManager.EXTRA_LON, Double.toString(com.waze.location.bg.a(i2))).putString(DriveToNativeManager.EXTRA_LAT, Double.toString(com.waze.location.bg.a(i3))).putString("time", Integer.toString(((int) j2) / 1000)).putString(TtmlNode.ATTR_ID, str).apply();
        sharedPreferences.edit().commit();
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    public final native void initNativeLayerNTV();

    public final void initialize() {
        initNativeLayerNTV();
        com.waze.location.bj bjVarK = com.waze.ab.a.l.k(mg.f29780a.a());
        double d2 = bjVarK.f25360b;
        if (d2 == -1.0d) {
            return;
        }
        int iB = com.waze.location.bg.b(d2);
        int iB2 = com.waze.location.bg.b(bjVarK.f25359a);
        int i2 = bjVarK.f25361c * 1000;
        String str = bjVarK.f25362d;
        h.g.b.x.e(str, "parkingId");
        setParking(iB, iB2, i2, str, true);
    }

    @Override // com.waze.navigate.fh
    public void onParkedChanged(ParkedHere parkedHere) {
        fi fiVar;
        h.g.b.x.f(parkedHere, "parkedHere");
        kotlinx.coroutines.b.bn<fj> parkedState = getParkedState();
        com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(parkedHere.getLatitude(), parkedHere.getLongitude());
        ParkedHereSetReason reason = parkedHere.getReason();
        h.g.b.x.e(reason, "getReason(...)");
        ParkedHereSetReason parkedHereSetReason = ParkedHereSetReason.UNSPECIFIED;
        int iOrdinal = reason.ordinal();
        if (iOrdinal == 0) {
            fiVar = fi.f31361a;
        } else if (iOrdinal == 1) {
            fiVar = fi.f31362b;
        } else if (iOrdinal == 2) {
            fiVar = fi.f31363c;
        } else if (iOrdinal == 3) {
            fiVar = fi.f31364d;
        } else if (iOrdinal == 4) {
            fiVar = fi.f31365e;
        } else {
            if (iOrdinal != 5) {
                throw new h.i();
            }
            fiVar = fi.f31361a;
        }
        parkedState.e(new fj(cVar, fiVar, parkedHere.getShowPopup()));
    }

    @Override // com.waze.navigate.fh
    public void onParkedRemoved() {
        getParkedState().e(null);
    }

    public final native void removeParkedNTV(int i2);

    @Override // com.waze.navigate.fk
    public com.waze.shared_infra.s.c<h.ab> removeParking(com.waze.parking.a aVar) {
        int i2;
        h.g.b.x.f(aVar, "reason");
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        h.g.b.x.f(aVar, "<this>");
        com.waze.parking.a aVar2 = com.waze.parking.a.f32939a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            i2 = 1;
            if (iOrdinal != 1) {
                i2 = 2;
                if (iOrdinal != 2) {
                    i2 = 3;
                    if (iOrdinal != 3) {
                        i2 = 4;
                        if (iOrdinal != 4) {
                            i2 = 5;
                            if (iOrdinal != 5) {
                                throw new h.i();
                            }
                        }
                    }
                }
            }
        } else {
            i2 = 0;
        }
        removeParked(i2, new g(this, 8));
        return new com.waze.shared_infra.s.c<>(completableDeferredJ);
    }

    public final native void setParkedNTV(int i2, int i3, long j2, boolean z);

    @Override // com.waze.navigate.fk
    public com.waze.shared_infra.s.c<h.ab> setParking(final int i2, final int i3, final long j2, final String str, boolean z) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        final CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        setParked(i2, i3, j2, z, new h.g.a.l() { // from class: com.waze.navigate.fe
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ParkedHereNativeManager.setParking$lambda$0(i2, i3, j2, str, completableDeferredJ, (h.ab) obj);
            }
        });
        return new com.waze.shared_infra.s.c<>(completableDeferredJ);
    }

    @Override // com.waze.navigate.fk
    public kotlinx.coroutines.b.bn<fj> getParkedState() {
        return this.parkedState;
    }
}
