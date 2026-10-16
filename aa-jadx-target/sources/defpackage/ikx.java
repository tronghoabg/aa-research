package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikx implements defpackage.zhh {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public ikx(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ikz.a.l().p(th)).ai(180)).u("Failed to extract RadioProgramInfo for onFavoriteListUpdate");
                break;
            case 1:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ikz.a.l().p(th)).ai(175)).u("Failed to extract RadioProgramInfo for onProgramListUpdate");
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                th.getClass();
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.config.phenotype.receiver.FlagUpdaterReceiver.a.h()).p(th)).u("Failed to load flags from snapshot");
                ((defpackage.mmi) this.a).i();
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (!(th instanceof java.util.concurrent.CancellationException)) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kpt.a.g()).p(th)).ai((char) 3337)).u("Error checking connectivity state");
                    ((defpackage.kpt) this.a).n = true;
                } else {
                    defpackage.yqm yqmVar = defpackage.kpt.a;
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) kqt.a.h()).p(th)).ai((char) 3382)).u("Could not get persisted data");
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).p(th)).ai((char) 3559)).u("Failure getting Assistant stored data");
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).p(th)).ai((char) 3560)).u("Failure getting Assistant stored data");
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).p(th)).ai((char) 3561)).u("Failure marking impression in Assistant stored data");
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).p(th)).ai((char) 3563)).u("Failure marking impression in Assistant stored data");
                break;
            case 9:
                defpackage.yqm yqmVar2 = mjt.a;
                ((mjs) this.a).e.a();
                break;
            case 10:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ool.a.g()).p(th)).ai((char) 6086)).u("Failed to retrieve weather, error thrown.");
                ((defpackage.ool) this.a).j();
                break;
            case 11:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver.a.g()).p(th)).ai((char) 6177)).u("Rfcomm trial failed.");
                break;
            case 12:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver.a.h()).p(th)).ai(6179)).y("Unable to get WiFi config for %s", this.a);
                break;
            case 13:
                ((defpackage.doe) this.a).d(th);
                break;
            case 14:
                if (th instanceof java.util.concurrent.CancellationException) {
                    ((org.chromium.net.UrlRequest) this.a).cancel();
                }
                break;
            case 15:
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) pwm.a.g()).p(th)).ai((char) 6936)).u("Failed to get auth token");
                ((pwm) this.a).g(th);
                break;
            case 16:
                if (th instanceof java.util.concurrent.CancellationException) {
                    ((org.chromium.net.UrlRequest) this.a).cancel();
                }
                break;
            case 17:
                ryx.a.h().p(th).ai(8567).u("Could not get persisted data");
                break;
            case 18:
                break;
            case 19:
                ((com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity) this.a).u.setEnabled(true);
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity.m.h()).p(th)).ai((char) 9981)).u("Unable to access test results with error");
                break;
            default:
                ((defpackage.adps) this.a).f(th);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, qza] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, qza] */
    @Override // defpackage.zhh
    public final /* synthetic */ void b(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        int i = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj2 = this.a;
                java.util.List list3 = (java.util.List) obj;
                defpackage.ikz ikzVar = (defpackage.ikz) obj2;
                if (!ikzVar.c) {
                    ((defpackage.yqj) defpackage.ikz.a.l().ai((char) 181)).u("Car no longer connected");
                    defpackage.ikz.C(list3);
                    return;
                }
                synchronized (ikzVar.e) {
                    list = ((defpackage.ikz) obj2).l;
                    ((defpackage.ikz) obj2).l = list3;
                    break;
                }
                defpackage.ikz ikzVar2 = (defpackage.ikz) this.a;
                if (ikzVar2.c) {
                    defpackage.ygw ygwVarI = ikzVar2.i();
                    int size = ygwVarI.size();
                    while (i < size) {
                        defpackage.iko ikoVar = (defpackage.iko) ygwVarI.get(i);
                        if (ikzVar2.c) {
                            try {
                                ikoVar.a.e(list3);
                            } catch (android.os.RemoteException e) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ikz.a.h()).p(e)).ai((char) 184)).u("Error calling onFavoriteListUpdate()");
                            }
                            i++;
                        }
                    }
                }
                defpackage.ikz.C(list);
                return;
            case 1:
                java.lang.Object obj3 = this.a;
                java.util.List list4 = (java.util.List) obj;
                defpackage.ikz ikzVar3 = (defpackage.ikz) obj3;
                if (!ikzVar3.c) {
                    ((defpackage.yqj) defpackage.ikz.a.l().ai((char) 176)).u("Car no longer connected");
                    defpackage.ikz.C(list4);
                    return;
                }
                synchronized (ikzVar3.e) {
                    list2 = ((defpackage.ikz) obj3).k;
                    ((defpackage.ikz) obj3).k = list4;
                    break;
                }
                defpackage.ikz ikzVar4 = (defpackage.ikz) this.a;
                if (ikzVar4.c) {
                    defpackage.ygw ygwVarI2 = ikzVar4.i();
                    int size2 = ygwVarI2.size();
                    while (i < size2) {
                        defpackage.iko ikoVar2 = (defpackage.iko) ygwVarI2.get(i);
                        if (ikzVar4.c) {
                            try {
                                ikoVar2.a.h(list4);
                            } catch (android.os.RemoteException e2) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ikz.a.h()).p(e2)).ai((char) 187)).u("Error calling onProgramListUpdate()");
                            }
                            i++;
                        }
                    }
                }
                defpackage.ikz.C(list2);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.yqj) com.google.android.apps.auto.components.config.phenotype.receiver.FlagUpdaterReceiver.a.f()).u("Successfully loaded flags from snapshot");
                ((defpackage.mmi) this.a).i();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kpt.a.f()).ai((char) 3339)).y("connectivity state updated: %s", bool);
                boolean zBooleanValue = bool.booleanValue();
                defpackage.kpt kptVar = (defpackage.kpt) this.a;
                kptVar.n = zBooleanValue;
                kptVar.j = defpackage.kpt.p();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                wjb wjbVar = (wjb) obj;
                kqt kqtVar = (kqt) this.a;
                int i2 = kqtVar.j;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 != 3) {
                    long j = wjbVar.a;
                    if (j != -1) {
                        kqtVar.c(j);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.kzb) this.a).t.m(java.lang.Boolean.valueOf(((defpackage.kxg) obj).c));
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.kzb) this.a).t.m(java.lang.Boolean.valueOf(((defpackage.kxg) obj).c));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3562)).u("Marked Assistant media recommendation impression");
                java.lang.Object obj4 = this.a;
                ((defpackage.kzb) obj4).t.m(java.lang.Boolean.TRUE);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3564)).u("Marked Assistant media recommendation impression");
                java.lang.Object obj5 = this.a;
                ((defpackage.kzb) obj5).t.m(java.lang.Boolean.TRUE);
                return;
            case 9:
                if (((java.lang.Integer) obj).intValue() != 1) {
                    ((mjs) this.a).e.a();
                    return;
                }
                return;
            case 10:
                oom oomVar = (oom) obj;
                if (oomVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ool.a.h()).ai((char) 6087)).u("Failed to retrieve weather, data null.");
                    ((defpackage.ool) this.a).j();
                    return;
                }
                defpackage.yqm yqmVar = defpackage.ool.a;
                defpackage.ool oolVar = (defpackage.ool) this.a;
                oolVar.d.m(oomVar);
                defpackage.ool.f(defpackage.zbd.Br);
                oolVar.g(defpackage.adai.b());
                return;
            case 11:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj6 = this.a;
                if (zBooleanValue2) {
                    defpackage.kfn.g().g(defpackage.yyn.WIRELESS_BT_RECEIVER_RFCOMM_AFTER_FAILED_SDP_QUERY_SUCCEED, ozj.a((android.bluetooth.BluetoothDevice) obj6), android.os.SystemClock.elapsedRealtime());
                    return;
                } else {
                    defpackage.kfn.g().g(defpackage.yyn.WIRELESS_BT_RECEIVER_RFCOMM_AFTER_FAILED_SDP_QUERY_FAILED, ozj.a((android.bluetooth.BluetoothDevice) obj6), android.os.SystemClock.elapsedRealtime());
                    return;
                }
            case 12:
                j$.util.Optional optional = (j$.util.Optional) obj;
                mlc mlcVar = new mlc(this.a, 10);
                if (true != optional.isPresent()) {
                    return;
                }
                java.lang.Object obj7 = optional.get();
                java.lang.Object obj8 = mlcVar.a;
                pac.b().d((android.bluetooth.BluetoothDevice) obj8).c(new osa(obj8, 5), defpackage.mkp.a.d);
                return;
            case 13:
                ((defpackage.doe) this.a).b((ozl) obj);
                return;
            case 14:
                return;
            case 15:
                java.lang.String strBu = defpackage.ysr.bu((java.lang.String) obj);
                java.lang.Object obj9 = this.a;
                if (strBu != null) {
                    ((pwm) obj9).h(strBu);
                    return;
                } else {
                    ((pwm) obj9).g(new pxo(pxn.n));
                    return;
                }
            case 16:
                return;
            case 17:
                wjb wjbVar2 = (wjb) obj;
                ryx ryxVar = (ryx) this.a;
                int i3 = ryxVar.o;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 != 3) {
                    long j2 = wjbVar2.a;
                    if (j2 != -1) {
                        ryxVar.h(j2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable samplerDecisionParcelable = (com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable) obj;
                java.util.WeakHashMap weakHashMap = skj.b;
                synchronized (weakHashMap) {
                    j$.util.Map.-EL.putIfAbsent(weakHashMap, java.lang.Integer.valueOf(((skj) this.a).c.hashCode()), samplerDecisionParcelable);
                    break;
                }
                return;
            case 19:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity appQualityTesterActivity = (com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity) this.a;
                appQualityTesterActivity.u.setEnabled(true);
                appQualityTesterActivity.r = defpackage.ygw.y(ygwVar);
                appQualityTesterActivity.s.b(appQualityTesterActivity.r);
                defpackage.yqm yqmVar2 = com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity.m;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai(9982)).y("Component Name : %s", appQualityTesterActivity.q);
                int size3 = ygwVar.size();
                while (i < size3) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai(9983)).y("%s", (kex) ygwVar.get(i));
                    i++;
                }
                return;
            default:
                ((defpackage.adps) this.a).h((defpackage.ador) obj);
                return;
        }
    }
}
