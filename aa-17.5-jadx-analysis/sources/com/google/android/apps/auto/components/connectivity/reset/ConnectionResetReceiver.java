package com.google.android.apps.auto.components.connectivity.reset;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.joa;
import defpackage.kea;
import defpackage.mdd;
import defpackage.qrv;
import defpackage.ryf;
import defpackage.ryg;
import defpackage.tss;
import defpackage.vky;
import defpackage.wub;
import defpackage.xyc;
import defpackage.yfy;
import defpackage.ype;
import defpackage.yph;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class ConnectionResetReceiver extends mdd {
    public static final yph a = yph.c("GH.ConnectionReset");
    private static final yfy c = yfy.n("com.google.android.projection.gearhead.RESET_USB_PORT", ryf.b, "com.google.android.projection.gearhead.RESET_USB_GADGET", ryf.c, "com.google.android.projection.gearhead.RESET_USB_ROLES", ryf.d, "com.google.android.projection.gearhead.RESET_USB_FUNCTION", ryf.e);
    public final xyc b = wub.L(new joa(3));

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("ConnectionResetReceiver");
    }

    @Override // defpackage.mdd
    public final void b(final Context context, final Intent intent) {
        Throwable e;
        String stringExtra;
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3376)).u("Starting ConnectionResetReceiver");
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) ((ype) yphVar.h()).ai((char) 3377)).u("Can't reset USB on this version of Android");
            return;
        }
        String action = intent.getAction();
        action.getClass();
        final int iZ = 0;
        if (!action.equals("com.google.android.projection.gearhead.RECOVERY_RESET")) {
            ryf ryfVar = (ryf) c.get(action);
            if (ryfVar == null) {
                tss.q("GH.ConnectionReset", "Unknown action %s", action);
            }
            ryg rygVar = (ryg) this.b.gu();
            ryfVar.getClass();
            rygVar.a(context, ryfVar);
            return;
        }
        try {
            stringExtra = intent.getStringExtra("EXTRA_ORIGIN");
            try {
                stringExtra.getClass();
                iZ = qrv.z(stringExtra.toUpperCase(Locale.US));
            } catch (IllegalArgumentException e2) {
                e = e2;
                tss.r("GH.ConnectionReset", e, "Unknown origin %s", stringExtra);
                ryf ryfVar2 = ryf.e;
                Optional.ofNullable(qrv.A(ryfVar2.name())).ifPresentOrElse(new Consumer() { // from class: kqj
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ryf ryfVar3 = (ryf) obj;
                        ryg rygVar2 = (ryg) this.a.b.gu();
                        int intExtra = intent.getIntExtra("EXTRA_CONNECTION_TYPE", -1);
                        int i = iZ;
                        if (i == 0) {
                            throw null;
                        }
                        rygVar2.d(context, intExtra, i, ryfVar3);
                    }

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new kea(ryfVar2, 19));
            } catch (NullPointerException e3) {
                e = e3;
                tss.r("GH.ConnectionReset", e, "Unknown origin %s", stringExtra);
                ryf ryfVar22 = ryf.e;
                Optional.ofNullable(qrv.A(ryfVar22.name())).ifPresentOrElse(new Consumer() { // from class: kqj
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ryf ryfVar3 = (ryf) obj;
                        ryg rygVar2 = (ryg) this.a.b.gu();
                        int intExtra = intent.getIntExtra("EXTRA_CONNECTION_TYPE", -1);
                        int i = iZ;
                        if (i == 0) {
                            throw null;
                        }
                        rygVar2.d(context, intExtra, i, ryfVar3);
                    }

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new kea(ryfVar22, 19));
            }
        } catch (IllegalArgumentException | NullPointerException e4) {
            e = e4;
            stringExtra = null;
        }
        ryf ryfVar222 = ryf.e;
        Optional.ofNullable(qrv.A(ryfVar222.name())).ifPresentOrElse(new Consumer() { // from class: kqj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ryf ryfVar3 = (ryf) obj;
                ryg rygVar2 = (ryg) this.a.b.gu();
                int intExtra = intent.getIntExtra("EXTRA_CONNECTION_TYPE", -1);
                int i = iZ;
                if (i == 0) {
                    throw null;
                }
                rygVar2.d(context, intExtra, i, ryfVar3);
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new kea(ryfVar222, 19));
    }
}
