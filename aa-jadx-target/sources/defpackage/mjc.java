package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mjc implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjc(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v15, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v70, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v75, types: [java.lang.Object, xzi] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 6;
        boolean z = false;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((miy) this.a).f((com.google.android.gms.car.RadioProgramInfo) obj);
            case 1:
                return ((miy) this.a).d((com.google.android.gms.car.RadioProgramInfo) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((miy) this.a).h((com.google.android.gms.car.RadioProgramInfo) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                androidx.car.app.suggestion.model.Suggestion suggestion = (androidx.car.app.suggestion.model.Suggestion) obj;
                int i2 = defpackage.moj.b;
                if (suggestion != null) {
                    return new mok(suggestion, (android.content.ComponentName) this.a);
                }
                throw new java.lang.NullPointerException("Null suggestion");
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                mrd mrdVar = (mrd) obj;
                defpackage.mqj mqjVar = mrdVar.c;
                android.content.ComponentName componentNameA = mqjVar.a();
                return new mre(mrdVar, this.a.contains(componentNameA.getPackageName().equals("com.google.android.projection.gearhead") ? nul.a(componentNameA, mqjVar.a.b) : new nul((android.content.ComponentName) null, componentNameA.getPackageName(), mqjVar.a.b)));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i3 = mqo.f;
                return this.a.invoke(obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i4 = mqo.f;
                return this.a.invoke(obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.nke nkeVar = defpackage.nkj.a;
                return this.a.invoke(obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((android.view.View) obj).getRootView().setOnTouchListener(new jzx(this.a, 7, (byte[]) null));
                return java.lang.Boolean.FALSE;
            case 9:
                return (com.google.android.gms.car.display.CarRegionId) ((defpackage.ntb) this.a).h.a().get((defpackage.nta) obj);
            case 10:
                return ((defpackage.mkc) this.a).N((com.google.android.gms.car.CarCall) obj);
            case 11:
                return ((defpackage.mkc) this.a).N((com.google.android.gms.car.CarCall) obj);
            case 12:
                android.telecom.PhoneAccountSuggestion phoneAccountSuggestionM = ep$.ExternalSyntheticApiModelOutline0.m(obj);
                defpackage.yqm yqmVar = defpackage.ofz.a;
                return ((android.telecom.TelecomManager) this.a).getPhoneAccount(ep$.ExternalSyntheticApiModelOutline0.m(phoneAccountSuggestionM));
            case 13:
                return ((android.telecom.TelecomManager) this.a).getPhoneAccount((android.telecom.PhoneAccountHandle) obj);
            case 14:
                olq olqVar = (olq) obj;
                java.util.Map mapA = ((com.google.android.apps.auto.components.troubleshooter.contentprovider.TroubleshooterContentProvider) this.a).a();
                yyt yytVarB = yyt.b(olqVar.d);
                if (yytVarB == null) {
                    yytVarB = yyt.a;
                }
                okc okcVar = (okc) mapA.get(yytVarB);
                okcVar.getClass();
                return new oka(okcVar, olqVar);
            case 15:
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
                java.lang.String name = bluetoothDevice.getName();
                java.lang.String str = name != null ? name : "";
                android.os.ParcelUuid[] uuids = bluetoothDevice.getUuids();
                boolean zAnyMatch = uuids == null ? false : j$.util.DesugarArrays.stream(uuids).anyMatch(new omr(6));
                defpackage.jlv jlvVar = new defpackage.jlv((android.content.Context) this.a);
                try {
                    boolean zF = jlvVar.c(bluetoothDevice.getAddress(), false).f();
                    jlvVar.close();
                    return new ori(str, zAnyMatch, zF);
                } catch (java.lang.Throwable th) {
                    try {
                        jlvVar.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 16:
                int i5 = pod.b;
                defpackage.abor aborVarN = acev.a.n();
                aborVarN.t();
                acev acevVar = aborVarN.b;
                acevVar.c = ((aceu) obj).e;
                acevVar.b |= 1;
                zlh zlhVar = (zlh) this.a;
                boolean z2 = zlhVar.c;
                aborVarN.t();
                acev acevVar2 = aborVarN.b;
                acevVar2.b |= 2;
                acevVar2.d = z2;
                int iP = defpackage.zfh.p(zlhVar.e);
                if (iP != 0 && iP == 3) {
                    z = true;
                }
                aborVarN.t();
                acev acevVar3 = aborVarN.b;
                acevVar3.b |= 4;
                acevVar3.e = z;
                int iAE = defpackage.a.aE(zlhVar.d);
                if (iAE == 0) {
                    iAE = 1;
                }
                int i6 = iAE - 1;
                if (i6 == 1) {
                    i = 2;
                } else if (i6 == 2) {
                    i = 3;
                } else if (i6 == 3) {
                    i = 4;
                } else if (i6 == 4) {
                    i = 5;
                } else if (i6 != 5) {
                    i = 12;
                    if (i6 != 11) {
                        i = i6 != 12 ? 1 : 13;
                    }
                }
                aborVarN.t();
                acev acevVar4 = aborVarN.b;
                acevVar4.f = i - 1;
                acevVar4.b |= 8;
                return aborVarN.q();
            case 17:
                qje qjeVar = (qje) obj;
                int i7 = ((defpackage.qjg) ((defpackage.qjf) this.a).d).k;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0 || i8 == 1) {
                    return qjeVar.c;
                }
                if (i8 == 2) {
                    return "";
                }
                throw new java.lang.RuntimeException(null, null);
            case 18:
                return this.a.remove((java.lang.String) obj);
            case 19:
                return ((usn) obj).a((wep) this.a);
            default:
                return new vaw((defpackage.xzi) this.a);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
