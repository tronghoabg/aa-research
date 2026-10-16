package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qup extends defpackage.ijw implements quq {
    final /* synthetic */ com.google.android.gearhead.appdecor.AppDecorService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qup(com.google.android.gearhead.appdecor.AppDecorService appDecorService) {
        super("com.google.android.gms.car.IAppDecorService");
        this.a = appDecorService;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    public final android.os.Bundle e() throws lhz {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            boolean zE = defpackage.nrr.a().e();
            boolean zF = defpackage.nrr.a().f();
            int i = defpackage.lbf.a;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("touch_enabled", zE);
            bundle2.putBoolean("touchpad_nav_enabled", zF);
            bundle2.putInt("minimum_menu_items_for_alpha_jump", 12);
            java.lang.String language = java.util.Locale.getDefault().getLanguage();
            bundle2.putBoolean("alpha_jump_language_supported", language.equals("en") || language.equals("fr") || language.equals("de") || language.equals("it") || language.equals("es") || language.equals("pt"));
            bundle.putAll(bundle2);
            bundle.putBoolean("hide_status_bar_icons", true);
            bundle.putBoolean("hide_mic_button", true);
            bundle.putBoolean("status_bar_buttons_focusable", true);
            bundle.putBoolean("rotary_nudge_focus_menu", true);
            bundle.putBoolean("optimized_car_activity_enabled", true);
            bundle.putStringArrayList("optimized_car_activity_package_names", new java.util.ArrayList<>(com.google.android.gearhead.appdecor.AppDecorService.c));
            bundle.putBoolean("use_configuration_context", true);
            return bundle;
        } catch (java.lang.RuntimeException e) {
            defpackage.yhx yhxVar = qfw.a;
            defpackage.yzn yznVarB = defpackage.yzn.b((int) defpackage.acxb.b());
            if (yznVarB == null || !qfw.a.contains(yznVarB)) {
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.g()).ai(7042)).R("Not forwarding %s('%s') to the main thread (gearheadChannel=%s). Please file a bug.", e.getClass(), e.getMessage(), yznVarB.name());
            } else {
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai(7043)).R("Forwarding %s('%s') to main thread to trigger a crash cluster (gearheadChannel=%s)", e.getClass(), e.getMessage(), yznVarB.name());
                defpackage.tna.i(new defpackage.qbr(java.lang.String.format(java.util.Locale.US, "[INTERNAL-ONLY CRASH](gearheadChannel=%s)", yznVarB.name()), e, 4));
            }
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "getConfigParams() failed with exception %s('%s')", e.getClass().getSimpleName(), e.getLocalizedMessage()), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException, lhz {
        rai rafVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    rai raiVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IConnectivityStatusCallback");
                    rafVar = raiVarQueryLocalInterface instanceof raf ? (raf) raiVarQueryLocalInterface : new raf(strongBinder);
                }
                defpackage.ijx.d(parcel);
                rafVar.getClass();
                com.google.android.gearhead.appdecor.AppDecorService appDecorService = this.a;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = appDecorService.d;
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((defpackage.ijv) ((defpackage.iko) it.next()).a).asBinder() == rafVar.asBinder()) {
                        parcel2.writeNoException();
                        return true;
                    }
                }
                copyOnWriteArrayList.add(new defpackage.iko(appDecorService, (raf) rafVar, 6));
                parcel2.writeNoException();
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    rai raiVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.IConnectivityStatusCallback");
                    rafVar = raiVarQueryLocalInterface2 instanceof raf ? (raf) raiVarQueryLocalInterface2 : new raf(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                java.util.concurrent.CopyOnWriteArrayList<defpackage.iko> copyOnWriteArrayList2 = this.a.d;
                for (defpackage.iko ikoVar : copyOnWriteArrayList2) {
                    defpackage.ijv ijvVar = (defpackage.ijv) ikoVar.a;
                    if (ijvVar.asBinder() == rafVar.asBinder()) {
                        copyOnWriteArrayList2.remove(ikoVar);
                        ijvVar.asBinder().unlinkToDeath(ikoVar, 0);
                    }
                }
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.car.IDrivingStatusCallback");
                    rafVar = iInterfaceQueryLocalInterface instanceof rai ? (rai) iInterfaceQueryLocalInterface : new defpackage.rag(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                h(rafVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder4.queryLocalInterface("com.google.android.gms.car.IDrivingStatusCallback");
                    rafVar = iInterfaceQueryLocalInterface2 instanceof rai ? (rai) iInterfaceQueryLocalInterface2 : new defpackage.rag(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                j(rafVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.os.Bundle bundleF = f();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, bundleF);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.Bundle bundleE = e();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, bundleE);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException("setFacetBarVisibility is no longer supported");
            case 9:
                boolean zJ = defpackage.ijx.j(parcel);
                boolean zJ2 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                i(zJ, zJ2);
                parcel2.writeNoException();
                return true;
            case 10:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                rax raxVarG = g(i2, com.google.android.gms.car.display.CarRegionId.a.g);
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, raxVarG);
                return true;
            case 11:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                rax raxVarG2 = g(i3, i4);
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, raxVarG2);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    public final android.os.Bundle f() throws lhz {
        defpackage.nrr nrrVarA = defpackage.nrr.a();
        boolean zE = nrrVarA.e();
        boolean zD = nrrVarA.d();
        boolean zF = nrrVarA.f();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("permits_per_sec", 0.2f);
        bundle.putFloat("max_permits", 6.0f);
        bundle.putLong("fill_delay_ms", 600L);
        bundle.putLong("lockout_ms", 5833L);
        bundle.putFloat("permits_after_lockout", 6.0f);
        bundle.putLong("unrestricted_consecutive_page_ups", 2L);
        bundle.putInt("maximum_taps", defpackage.ysr.cN(true != zE ? Integer.MAX_VALUE : 6, true != zD ? Integer.MAX_VALUE : 6, zF ? (int) defpackage.acpy.b() : Integer.MAX_VALUE));
        return bundle;
    }

    public final rax g(int i, int i2) {
        com.google.android.gms.car.display.CarRegionId carRegionId = new com.google.android.gms.car.display.CarRegionId(i2, new com.google.android.gms.car.display.CarDisplayId(i));
        com.google.android.gearhead.appdecor.AppDecorService appDecorService = this.a;
        if (appDecorService.i.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai((char) 7041)).y("Cannot get SystemUIService outside of lifetime . CarRegionId: %s", carRegionId);
            return null;
        }
        rax raxVar = (rax) appDecorService.i.get(carRegionId);
        raxVar.getClass();
        return raxVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, rai] */
    public final void h(rai raiVar) throws android.os.RemoteException {
        raiVar.getClass();
        com.google.android.gearhead.appdecor.AppDecorService appDecorService = this.a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = appDecorService.e;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((defpackage.iko) it.next()).a.asBinder() == raiVar.asBinder()) {
                return;
            }
        }
        copyOnWriteArrayList.add(new defpackage.iko(appDecorService, raiVar, 7));
        ttc ttcVar = appDecorService.l;
        if (ttcVar != null) {
            raiVar.a(ttcVar.a);
        }
        usc uscVar = appDecorService.m;
        if (uscVar != null) {
            raiVar.b(uscVar.a);
        }
        raiVar.c(defpackage.ler.b().s());
    }

    public final void i(boolean z, boolean z2) {
        defpackage.tna.i(new qfv(z, z2));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rai] */
    public final void j(rai raiVar) {
        java.util.concurrent.CopyOnWriteArrayList<defpackage.iko> copyOnWriteArrayList = this.a.e;
        for (defpackage.iko ikoVar : copyOnWriteArrayList) {
            ?? r2 = ikoVar.a;
            if (r2.asBinder() == raiVar.asBinder()) {
                copyOnWriteArrayList.remove(ikoVar);
                r2.asBinder().unlinkToDeath(ikoVar, 0);
            }
        }
    }
}
