package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lat implements defpackage.lhn, defpackage.qtr {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.DhuVendorExtension");
    private final android.content.Context c;
    private rpg d;

    public lat(android.content.Context context) {
        this.c = context;
    }

    @Override // defpackage.qtr
    public final void a(byte[] bArr) {
        defpackage.qqe qqeVar;
        android.content.Intent intent;
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai(3701)).w("data length=%d.", bArr.length);
        try {
            las lasVarB = defpackage.abox.B(las.a, bArr, defpackage.abol.a());
            if (lasVarB.b.size() == 0) {
                ((defpackage.yqj) yqmVar.l().ai((char) 3704)).u("No launch intents were found.");
                return;
            }
            for (lau lauVar : lasVarB.b) {
                try {
                    defpackage.mkp.a.g();
                    defpackage.qsh qshVarE = defpackage.kit.b().e();
                    java.lang.String str = lauVar.b;
                    int iAo = defpackage.a.ao(lauVar.c);
                    if (iAo == 0) {
                        iAo = 1;
                    }
                    java.lang.String str2 = "INTENT_ACTION_TYPE_UNKNOWN";
                    if (str.equals("com.google.android.apps.maps") || str.startsWith("com.google.android.apps.gmm")) {
                        qqeVar = defpackage.qqe.f;
                    } else if (iAo == 3) {
                        qqeVar = defpackage.qqe.h;
                    } else {
                        if (iAo != 2) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid or unmapped package name %s and intent action type %s.", str, "INTENT_ACTION_TYPE_UNKNOWN"));
                        }
                        qqeVar = defpackage.qqe.c;
                    }
                    if (defpackage.oml.A(qshVarE, str, qqeVar.ordinal())) {
                        int iAo2 = defpackage.a.ao(lauVar.c);
                        if (iAo2 == 0) {
                            iAo2 = 1;
                        }
                        int i = iAo2 - 1;
                        if (i == 1) {
                            intent = new android.content.Intent("android.media.action.MEDIA_PLAY_FROM_SEARCH");
                            intent.setPackage(lauVar.b);
                            intent.putExtra("query", lauVar.d);
                            intent.setFlags(268435456);
                        } else if (i != 2) {
                            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) b.h()).ai(3698);
                            int iAo3 = defpackage.a.ao(lauVar.c);
                            if (iAo3 != 0 && iAo3 != 1) {
                                str2 = iAo3 != 2 ? "INTENT_ACTION_TYPE_NAVIGATION" : "INTENT_ACTION_TYPE_MEDIA";
                            }
                            yqjVar.y("Specified intent type %s is not supported.", str2);
                            intent = null;
                        } else {
                            intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(lauVar.d));
                            intent.setPackage(lauVar.b);
                            intent.setFlags(268435456);
                        }
                        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(intent);
                        if (!optionalOfNullable.isEmpty()) {
                            try {
                                this.c.startActivity((android.content.Intent) optionalOfNullable.get(), a$.ExternalSyntheticApiModelOutline1.m(android.app.ActivityOptions.makeBasic(), 0).toBundle());
                            } catch (android.content.ActivityNotFoundException e) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.g()).p(e)).ai(3703)).y("Unable to start activity for package %s.", lauVar.b);
                            }
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(3699)).y("Specified package name %s is not allowed.", lauVar.b);
                    }
                } catch (defpackage.qst e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e2)).ai(3700)).y("Car not connected while validating package %s.", lauVar.b);
                }
            }
            ((defpackage.yqj) b.l().ai((char) 3702)).u("Finished processing DhuVendorExtension message.");
        } catch (defpackage.abpp e3) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e3)).ai((char) 3705)).u("Exception on parsing as DhuVendorExtension.");
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        rpg rpgVar = this.d;
        if (rpgVar == null) {
            return;
        }
        rpgVar.b();
        ((defpackage.yqj) b.l().ai((char) 3707)).u("Released DHU Vendor Extension listener.");
    }

    @Override // defpackage.lhn
    public final void eQ() {
        com.google.android.gms.car.CarInfo carInfoB = defpackage.kiv.a().b();
        if (carInfoB == null) {
            ((defpackage.yqj) b.l().ai((char) 3697)).u("No car info found.");
            return;
        }
        if ("Google".equals(carInfoB.a) && "Desktop Head Unit".equals(carInfoB.b)) {
            defpackage.yqm yqmVar = b;
            ((defpackage.yqj) yqmVar.l().ai((char) 3706)).u("Start connect immediately.");
            defpackage.qsh qshVarE = defpackage.kit.b().e();
            try {
                defpackage.mkp.a.f();
                rpg rpgVarG = defpackage.ooa.g(qshVarE, "com.google.android.apps.auto.components.dhuvendorextension");
                this.d = rpgVarG;
                rpgVarG.b = this;
                ((defpackage.yqj) yqmVar.l().ai((char) 3694)).u("Registered DHU Vendor Extension listener.");
            } catch (defpackage.qst e) {
                ((defpackage.yqj) ((defpackage.yqj) b.l().p(e)).ai((char) 3696)).u("Car is not connected.");
            } catch (defpackage.qsu e2) {
                ((defpackage.yqj) ((defpackage.yqj) b.l().p(e2)).ai((char) 3695)).u("The extension is not supported by the car.");
            }
        }
    }
}
