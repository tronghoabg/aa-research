package defpackage;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.car.CarInfo;
import j$.util.Optional;

/* loaded from: classes.dex */
public final class lao implements lhg, qsv {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.DhuVendorExtension");
    private final Context c;
    private rol d;

    public lao(Context context) {
        this.c = context;
    }

    @Override // defpackage.qsv
    public final void a(byte[] bArr) {
        qpi qpiVar;
        Intent intent;
        yph yphVar = b;
        ((ype) yphVar.l().ai(3698)).w("data length=%d.", bArr.length);
        try {
            lan lanVar = (lan) abnv.B(lan.a, bArr, abnj.a());
            if (lanVar.b.size() == 0) {
                ((ype) yphVar.l().ai((char) 3701)).u("No launch intents were found.");
                return;
            }
            for (lap lapVar : lanVar.b) {
                try {
                    mki.a.g();
                    qrn qrnVarE = kio.b().e();
                    String str = lapVar.b;
                    int iAp = a.ap(lapVar.c);
                    if (iAp == 0) {
                        iAp = 1;
                    }
                    String str2 = "INTENT_ACTION_TYPE_UNKNOWN";
                    if (str.equals("com.google.android.apps.maps") || str.startsWith("com.google.android.apps.gmm")) {
                        qpiVar = qpi.f;
                    } else if (iAp == 3) {
                        qpiVar = qpi.h;
                    } else {
                        if (iAp != 2) {
                            throw new IllegalArgumentException(String.format("Invalid or unmapped package name %s and intent action type %s.", str, "INTENT_ACTION_TYPE_UNKNOWN"));
                        }
                        qpiVar = qpi.c;
                    }
                    if (ols.A(qrnVarE, str, qpiVar.ordinal())) {
                        int iAp2 = a.ap(lapVar.c);
                        if (iAp2 == 0) {
                            iAp2 = 1;
                        }
                        int i = iAp2 - 1;
                        if (i == 1) {
                            intent = new Intent("android.media.action.MEDIA_PLAY_FROM_SEARCH");
                            intent.setPackage(lapVar.b);
                            intent.putExtra("query", lapVar.d);
                            intent.setFlags(268435456);
                        } else if (i != 2) {
                            ype ypeVar = (ype) ((ype) b.h()).ai(3695);
                            int iAp3 = a.ap(lapVar.c);
                            if (iAp3 != 0 && iAp3 != 1) {
                                str2 = iAp3 != 2 ? "INTENT_ACTION_TYPE_NAVIGATION" : "INTENT_ACTION_TYPE_MEDIA";
                            }
                            ypeVar.y("Specified intent type %s is not supported.", str2);
                            intent = null;
                        } else {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(lapVar.d));
                            intent.setPackage(lapVar.b);
                            intent.setFlags(268435456);
                        }
                        Optional optionalOfNullable = Optional.ofNullable(intent);
                        if (!optionalOfNullable.isEmpty()) {
                            try {
                                this.c.startActivity((Intent) optionalOfNullable.get(), ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle());
                            } catch (ActivityNotFoundException e) {
                                ((ype) ((ype) ((ype) b.g()).p(e)).ai(3700)).y("Unable to start activity for package %s.", lapVar.b);
                            }
                        }
                    } else {
                        ((ype) ((ype) b.h()).ai(3696)).y("Specified package name %s is not allowed.", lapVar.b);
                    }
                } catch (qrz e2) {
                    ((ype) ((ype) ((ype) b.h()).p(e2)).ai(3697)).y("Car not connected while validating package %s.", lapVar.b);
                }
            }
            ((ype) b.l().ai((char) 3699)).u("Finished processing DhuVendorExtension message.");
        } catch (abon e3) {
            ((ype) ((ype) ((ype) b.h()).p(e3)).ai((char) 3702)).u("Exception on parsing as DhuVendorExtension.");
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        CarInfo carInfoB = kiq.a().b();
        if (carInfoB == null) {
            ((ype) b.l().ai((char) 3694)).u("No car info found.");
            return;
        }
        if ("Google".equals(carInfoB.a) && "Desktop Head Unit".equals(carInfoB.b)) {
            yph yphVar = b;
            ((ype) yphVar.l().ai((char) 3703)).u("Start connect immediately.");
            qrn qrnVarE = kio.b().e();
            try {
                mki.a.f();
                rol rolVarG = oni.g(qrnVarE, "com.google.android.apps.auto.components.dhuvendorextension");
                this.d = rolVarG;
                rolVarG.b = this;
                ((ype) yphVar.l().ai((char) 3691)).u("Registered DHU Vendor Extension listener.");
            } catch (qrz e) {
                ((ype) ((ype) b.l().p(e)).ai((char) 3693)).u("Car is not connected.");
            } catch (qsa e2) {
                ((ype) ((ype) b.l().p(e2)).ai((char) 3692)).u("The extension is not supported by the car.");
            }
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        rol rolVar = this.d;
        if (rolVar == null) {
            return;
        }
        rolVar.b();
        ((ype) b.l().ai((char) 3704)).u("Released DHU Vendor Extension listener.");
    }
}
