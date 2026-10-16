package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Alert;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.TravelEstimate;
import j$.time.Duration;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmn {
    public static /* synthetic */ fwm a(fvu fvuVar, geu geuVar, boolean z, boolean z2, int i) {
        afdr afdrVarD;
        boolean z3 = false;
        byte[] bArr = null;
        hls hlsVar = (i & 2) != 0 ? new hls(true, false, false) : null;
        boolean z4 = (!((i & 8) == 0)) | z;
        boolean z5 = ((i & 16) == 0) & z2;
        fvuVar.getClass();
        hlsVar.getClass();
        fwb fwbVar = fvuVar.b;
        if (fwbVar != null) {
            if (z5) {
                afdrVarD = new fwc(geuVar, fwbVar.d(), 5, bArr);
                z3 = true;
            } else {
                afdrVarD = fwbVar.d();
            }
            fxo fxoVarC = fxa.c(fwbVar, geuVar, afdrVarD, z3 ? null : fwbVar.c());
            if (fxoVarC instanceof fwy) {
                return new fwm(null, new fwr((fwy) fxoVarC, z4), fwbVar.g() ? null : fwx.f);
            }
            throw new IllegalStateException("Unexpected generic action ui model type");
        }
        fvv fvvVar = fvuVar.a;
        if (fvvVar == null) {
            throw new IllegalStateException("Either of the internal models should be non null!");
        }
        fwi fwiVarE = fwl.e(fvvVar, geuVar, fwh.f, null, hlsVar, false, 1, true, z4);
        if (z5 && (fwiVarE instanceof fxs)) {
            fxs fxsVar = (fxs) fwiVarE;
            fwiVarE = new fxs(fxsVar.a, fxsVar.b, fxsVar.c, fxsVar.d, fxsVar.e, fxsVar.f, fxsVar.g, fxsVar.h, 3, fxsVar.i);
        }
        return new fwm(fwiVarE, null, null);
    }

    public static final gth b(TravelEstimate travelEstimate, geu geuVar) {
        geuVar.getClass();
        CarColor remainingTimeColor = travelEstimate.getRemainingTimeColor();
        CarColor remainingDistanceColor = travelEstimate.getRemainingDistanceColor();
        String strL = null;
        CarText tripText = geuVar.i().c() >= 5 ? travelEstimate.getTripText() : null;
        CarIcon tripIcon = (geuVar.i().c() < 5 || travelEstimate.getTripIcon() == null) ? null : travelEstimate.getTripIcon();
        String strM = d(travelEstimate.getRemainingTimeSeconds()) ? null : hbz.m(geuVar, Duration.ofSeconds(travelEstimate.getRemainingTimeSeconds()));
        Distance remainingDistance = travelEstimate.getRemainingDistance();
        String strB = remainingDistance != null ? hly.b(geuVar, remainingDistance) : null;
        if (d(travelEstimate.getRemainingTimeSeconds())) {
            strL = "--";
        } else {
            DateTimeWithZone arrivalTimeAtDestination = travelEstimate.getArrivalTimeAtDestination();
            if (arrivalTimeAtDestination != null) {
                strL = hbz.l(geuVar, arrivalTimeAtDestination, ZoneId.systemDefault());
            }
        }
        return new gth(tripIcon, tripText, strM, strL, strB, remainingDistanceColor, remainingTimeColor);
    }

    public static final gtb c(Alert alert, geu geuVar) {
        gte gtcVar;
        boolean zF = ((ggk) geuVar.F(ggk.class)).f();
        List<Action> actions = alert.getActions();
        actions.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(actions, 10));
        for (Action action : actions) {
            Alert alert2 = alert;
            geu geuVar2 = geuVar;
            ah ahVar = new ah((Object) action, (Object) geuVar2, (Object) alert2, 8, (byte[]) null);
            action.getClass();
            fvu fvuVarC = fvl.c(action, geuVar2, zF, ahVar, false, 8);
            if (fvr.c(action)) {
                fvuVarC = fvl.b(fvuVarC, new fvw((int) alert2.getDurationMillis(), 0, true, 5), zF);
            }
            arrayList.add(fvuVarC);
            geuVar = geuVar2;
            alert = alert2;
        }
        Alert alert3 = alert;
        geu geuVar3 = geuVar;
        long durationMillis = alert3.getDurationMillis();
        if (durationMillis == 2147483647L) {
            gtcVar = gtd.a;
        } else {
            hem hemVarL = geuVar3.l(gdl.class);
            hemVarL.getClass();
            gtcVar = new gtc(durationMillis, new gbz((gdl) hemVarL, 15));
        }
        int id = alert3.getId();
        CarText title = alert3.getTitle();
        title.getClass();
        CarText subtitle = alert3.getSubtitle();
        CarIcon icon = alert3.getIcon();
        return new gtb(id, title, subtitle, icon != null ? fxp.e(icon, geuVar3, new gqr(8), new gqr(9), null, 24) : null, gtcVar, arrayList);
    }

    private static final boolean d(long j) {
        return j == -1;
    }
}
