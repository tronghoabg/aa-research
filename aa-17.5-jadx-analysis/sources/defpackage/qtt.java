package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.model.Alert;
import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class qtt extends ijo implements qtu {
    final /* synthetic */ AppDecorService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtt(AppDecorService appDecorService) {
        super("com.google.android.gms.car.IAppDecorService");
        this.a = appDecorService;
    }

    @Override // defpackage.qtu
    public final Bundle e() {
        Bundle bundle = new Bundle();
        try {
            boolean zE = nrd.a().e();
            boolean zF = nrd.a().f();
            int i = lba.a;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("touch_enabled", zE);
            bundle2.putBoolean("touchpad_nav_enabled", zF);
            bundle2.putInt("minimum_menu_items_for_alpha_jump", 12);
            String language = Locale.getDefault().getLanguage();
            bundle2.putBoolean("alpha_jump_language_supported", language.equals("en") || language.equals("fr") || language.equals("de") || language.equals("it") || language.equals("es") || language.equals("pt"));
            bundle.putAll(bundle2);
            bundle.putBoolean("hide_status_bar_icons", true);
            bundle.putBoolean("hide_mic_button", true);
            bundle.putBoolean("status_bar_buttons_focusable", true);
            bundle.putBoolean("rotary_nudge_focus_menu", true);
            bundle.putBoolean("optimized_car_activity_enabled", true);
            bundle.putStringArrayList("optimized_car_activity_package_names", new ArrayList<>(AppDecorService.c));
            bundle.putBoolean("use_configuration_context", true);
            return bundle;
        } catch (RuntimeException e) {
            ygr ygrVar = qfb.a;
            yyi yyiVarB = yyi.b((int) acvz.b());
            if (yyiVarB == null || !qfb.a.contains(yyiVarB)) {
                ((ype) ((ype) AppDecorService.a.g()).ai(7017)).R("Not forwarding %s('%s') to the main thread (gearheadChannel=%s). Please file a bug.", e.getClass(), e.getMessage(), yyiVarB.name());
            } else {
                ((ype) ((ype) AppDecorService.a.h()).ai(7018)).R("Forwarding %s('%s') to main thread to trigger a crash cluster (gearheadChannel=%s)", e.getClass(), e.getMessage(), yyiVarB.name());
                szp.u(new qfa(String.format(Locale.US, "[INTERNAL-ONLY CRASH](gearheadChannel=%s)", yyiVarB.name()), e, 0));
            }
            throw new IllegalStateException(String.format(Locale.US, "getConfigParams() failed with exception %s('%s')", e.getClass().getSimpleName(), e.getLocalizedMessage()), e);
        }
    }

    @Override // defpackage.qtu
    public final Bundle f() {
        nrd nrdVarA = nrd.a();
        boolean zE = nrdVarA.e();
        boolean zD = nrdVarA.d();
        boolean zF = nrdVarA.f();
        Bundle bundle = new Bundle();
        bundle.putFloat("permits_per_sec", 0.2f);
        bundle.putFloat("max_permits", 6.0f);
        bundle.putLong("fill_delay_ms", 600L);
        bundle.putLong("lockout_ms", 5833L);
        bundle.putFloat("permits_after_lockout", 6.0f);
        bundle.putLong("unrestricted_consecutive_page_ups", 2L);
        int iB = Alert.DURATION_SHOW_INDEFINITELY;
        int i = true != zE ? Integer.MAX_VALUE : 6;
        int i2 = true != zD ? Integer.MAX_VALUE : 6;
        if (zF) {
            iB = (int) acow.b();
        }
        bundle.putInt("maximum_taps", wub.av(i, i2, iB));
        return bundle;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qzj qzjVar = null;
        qzm qzkVar = null;
        qzm qzkVar2 = null;
        qzj qzjVar2 = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IConnectivityStatusCallback");
                    qzjVar = iInterfaceQueryLocalInterface instanceof qzj ? (qzj) iInterfaceQueryLocalInterface : new qzj(strongBinder);
                }
                ijp.d(parcel);
                qzjVar.getClass();
                AppDecorService appDecorService = this.a;
                CopyOnWriteArrayList copyOnWriteArrayList = appDecorService.d;
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        copyOnWriteArrayList.add(new ikf(appDecorService, qzjVar, 6));
                    } else if (((ijn) ((ikf) it.next()).a).asBinder() == qzjVar.asBinder()) {
                    }
                }
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.IConnectivityStatusCallback");
                    qzjVar2 = iInterfaceQueryLocalInterface2 instanceof qzj ? (qzj) iInterfaceQueryLocalInterface2 : new qzj(strongBinder2);
                }
                ijp.d(parcel);
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.a.d;
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ikf ikfVar = (ikf) it2.next();
                    ijn ijnVar = (ijn) ikfVar.a;
                    if (ijnVar.asBinder() == qzjVar2.asBinder()) {
                        copyOnWriteArrayList2.remove(ikfVar);
                        ijnVar.asBinder().unlinkToDeath(ikfVar, 0);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.IDrivingStatusCallback");
                    qzkVar2 = iInterfaceQueryLocalInterface3 instanceof qzm ? (qzm) iInterfaceQueryLocalInterface3 : new qzk(strongBinder3);
                }
                ijp.d(parcel);
                h(qzkVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.IDrivingStatusCallback");
                    qzkVar = iInterfaceQueryLocalInterface4 instanceof qzm ? (qzm) iInterfaceQueryLocalInterface4 : new qzk(strongBinder4);
                }
                ijp.d(parcel);
                j(qzkVar);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundleF = f();
                parcel2.writeNoException();
                ijp.h(parcel2, bundleF);
                return true;
            case 7:
                Bundle bundleE = e();
                parcel2.writeNoException();
                ijp.h(parcel2, bundleE);
                return true;
            case 8:
                ijp.j(parcel);
                ijp.d(parcel);
                throw new UnsupportedOperationException("setFacetBarVisibility is no longer supported");
            case 9:
                boolean zJ = ijp.j(parcel);
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                i(zJ, zJ2);
                parcel2.writeNoException();
                return true;
            case 10:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                rab rabVarG = g(i2, CarRegionId.a.g);
                parcel2.writeNoException();
                ijp.i(parcel2, rabVarG);
                return true;
            case 11:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                ijp.d(parcel);
                rab rabVarG2 = g(i3, i4);
                parcel2.writeNoException();
                ijp.i(parcel2, rabVarG2);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.qtu
    public final rab g(int i, int i2) {
        CarRegionId carRegionId = new CarRegionId(i2, new CarDisplayId(i));
        AppDecorService appDecorService = this.a;
        if (appDecorService.i.isEmpty()) {
            ((ype) ((ype) AppDecorService.a.h()).ai((char) 7016)).y("Cannot get SystemUIService outside of lifetime . CarRegionId: %s", carRegionId);
            return null;
        }
        rab rabVar = (rab) appDecorService.i.get(carRegionId);
        rabVar.getClass();
        return rabVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, qzm] */
    @Override // defpackage.qtu
    public final void h(qzm qzmVar) throws RemoteException {
        qzmVar.getClass();
        AppDecorService appDecorService = this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = appDecorService.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((ikf) it.next()).a.asBinder() == qzmVar.asBinder()) {
                return;
            }
        }
        copyOnWriteArrayList.add(new ikf(appDecorService, qzmVar, 7));
        tse tseVar = appDecorService.l;
        if (tseVar != null) {
            qzmVar.a(tseVar.a);
        }
        urf urfVar = appDecorService.m;
        if (urfVar != null) {
            qzmVar.b(urfVar.a);
        }
        qzmVar.c(lbh.c().s());
    }

    @Override // defpackage.qtu
    public final void i(final boolean z, final boolean z2) {
        szp.u(new Runnable() { // from class: qez
            @Override // java.lang.Runnable
            public final void run() {
                mpl.e().l(!z ? 1 : z2 ? 3 : 2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qzm] */
    @Override // defpackage.qtu
    public final void j(qzm qzmVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ikf ikfVar = (ikf) it.next();
            ?? r2 = ikfVar.a;
            if (r2.asBinder() == qzmVar.asBinder()) {
                copyOnWriteArrayList.remove(ikfVar);
                r2.asBinder().unlinkToDeath(ikfVar, 0);
            }
        }
    }
}
