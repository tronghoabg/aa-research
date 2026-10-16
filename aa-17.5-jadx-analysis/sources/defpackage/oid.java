package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.LocationManager;
import android.os.SystemClock;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import com.google.android.gms.car.CarInfo;
import j$.util.Optional;
import j$.util.OptionalLong;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class oid implements ohw {
    public static final yph a = yph.c("GH.TelemetryManager");
    public final Context b;
    UUID c;
    private final CarInfo d;
    private final LocationManager e;
    private final AtomicReference f = new AtomicReference();
    private final AtomicReference g;
    private final AtomicReference h;
    private final Object i;
    private final yks j;
    private final List k;
    private volatile UUID l;
    private OptionalLong m;
    private final oic n;
    private final rqe o;
    private final xyc p;
    private final xyc q;

    public oid() {
        AtomicReference atomicReference = new AtomicReference();
        this.g = atomicReference;
        this.h = new AtomicReference(yzz.NO_FACET);
        this.i = new Object();
        this.j = new yez(null);
        this.k = new ArrayList();
        this.m = OptionalLong.empty();
        this.p = wub.L(new imq(13));
        this.q = wub.L(new imq(14));
        mki mkiVar = mki.a;
        Context context = mkiVar.c;
        this.b = context;
        this.c = ((lbi) mkiVar.i(lbi.class)).d();
        CarInfo carInfo = new CarInfo();
        this.d = carInfo;
        carInfo.a = "PhoneOnly";
        carInfo.b = "PhoneOnly";
        atomicReference.set(carInfo);
        this.e = (LocationManager) context.getSystemService("location");
        this.n = (oic) new ntn((Object) null).h(new koy(this, 2));
        this.o = new rqe();
    }

    public static Optional g(String str) {
        try {
            for (PackageInfo packageInfo : mki.a.c.getPackageManager().getInstalledPackages(1073741824)) {
                if (packageInfo.packageName.matches(str)) {
                    return Optional.of(Long.valueOf(packageInfo.getLongVersionCode()));
                }
            }
            return Optional.empty();
        } catch (IllegalStateException | NullPointerException | SecurityException unused) {
            return Optional.empty();
        }
    }

    private final void h(TelemetryEvent telemetryEvent, yzy yzyVar) {
        if (telemetryEvent.a == yxc.UI) {
            zab zabVar = telemetryEvent.b.o;
            if (zabVar == null) {
                zabVar = zab.a;
            }
            if (zabVar.d == yzz.PHONE_CALL.he) {
                zab zabVar2 = telemetryEvent.b.o;
                if (zabVar2 == null) {
                    zabVar2 = zab.a;
                }
                if (zabVar2.e != yzyVar.a()) {
                    return;
                }
                if (!yzyVar.equals(yzy.Dp)) {
                    Optional optionalOfNullable = Optional.ofNullable(this.l);
                    if (true == optionalOfNullable.isPresent()) {
                        UUID uuid = (UUID) optionalOfNullable.get();
                        ((ype) ((ype) a.f()).ai((char) 5963)).y("phone call session ended. id = %s", new zjd(zjc.a, uuid));
                    }
                    this.l = null;
                    return;
                }
                this.l = ((lbi) mki.a.i(lbi.class)).d();
                Optional optionalOfNullable2 = Optional.ofNullable(this.l);
                if (true == optionalOfNullable2.isPresent()) {
                    UUID uuid2 = (UUID) optionalOfNullable2.get();
                    ((ype) ((ype) a.f()).ai((char) 5962)).y("phone call session started. id = %s", new zjd(zjc.a, uuid2));
                }
            }
        }
    }

    private final void i(TelemetryEvent telemetryEvent, yyv yyvVar) {
        OptionalLong optionalLongEmpty;
        if (telemetryEvent.a == yxc.NON_UI) {
            yyz yyzVar = telemetryEvent.b.p;
            if (yyzVar == null) {
                yyzVar = yyz.a;
            }
            if (yyzVar.c == 7) {
                yyz yyzVar2 = telemetryEvent.b.p;
                if (yyzVar2 == null) {
                    yyzVar2 = yyz.a;
                }
                if (yyzVar2.d != yyvVar.fI) {
                    return;
                }
                if (yyvVar == yyv.LIFETIME_START) {
                    oit.a();
                    optionalLongEmpty = OptionalLong.of(SystemClock.elapsedRealtime());
                } else {
                    optionalLongEmpty = OptionalLong.empty();
                }
                int iAp = a.ap(telemetryEvent.b.A);
                if (iAp == 0) {
                    throw null;
                }
                int i = iAp - 1;
                if (i != 0) {
                    if (i != 1) {
                        tss.q("GH.TelemetryManager", "Unexpected application mode", new Object[0]);
                    } else {
                        this.c = ((lbi) mki.a.i(lbi.class)).d();
                        this.m = optionalLongEmpty;
                    }
                }
            }
        }
    }

    @Override // defpackage.ohw
    public final OptionalLong a() {
        return this.m;
    }

    @Override // defpackage.ohw
    public final void b() {
        this.n.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0465  */
    @Override // defpackage.ohw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.apps.auto.components.telemetry.TelemetryEvent r18) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oid.c(com.google.android.apps.auto.components.telemetry.TelemetryEvent):void");
    }

    @Override // defpackage.ohw
    public final void d(ohv ohvVar, Collection collection) {
        ohvVar.getClass();
        synchronized (this.i) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.j.t((yxc) it.next(), ohvVar);
            }
        }
    }

    @Override // defpackage.ohw
    public final void e() {
        this.h.set(yzz.NO_FACET);
    }

    @Override // defpackage.ohw
    public final void f(ohv ohvVar) {
        synchronized (this.i) {
            this.j.v().removeAll(Collections.singleton(ohvVar));
        }
    }
}
