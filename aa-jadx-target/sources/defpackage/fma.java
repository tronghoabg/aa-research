package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class fma implements java.util.concurrent.Callable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public fma(ete eteVar, int i) {
        this.b = i;
        this.a = eteVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Type inference failed for: r12v57, types: [aclm, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws defpackage.qst, rlo {
        java.lang.Object objA = null;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        int i = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                fok fokVar = ((fmg) this.a).a;
                if (fokVar.b != fkb.a) {
                    fjv.a().c(fmh.a, java.lang.String.valueOf(fokVar.c).concat(" is not in ENQUEUED state. Nothing more to do"));
                    return java.lang.Boolean.TRUE;
                }
                if ((!fokVar.d() && !fokVar.c()) || java.lang.System.currentTimeMillis() >= fokVar.a()) {
                    return java.lang.Boolean.FALSE;
                }
                fjv.a().c(fmh.a, "Delaying execution for " + fokVar.c + " because it is being executed before schedule.");
                return java.lang.Boolean.TRUE;
            case 1:
                java.lang.Object obj = this.a;
                ((ete) obj).e.set(true);
                try {
                    android.os.Process.setThreadPriority(10);
                    objA = ((ete) obj).a();
                    android.os.Binder.flushPendingCommands();
                    ((ete) this.a).d(objA);
                    return objA;
                } catch (java.lang.Throwable th) {
                    try {
                        ((ete) this.a).d.set(true);
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ((ete) this.a).d(objA);
                        throw th2;
                    }
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                fmg fmgVar = (fmg) this.a;
                java.lang.String str = fmgVar.c;
                fol folVar = fmgVar.f;
                if (folVar.b(str) == fkb.a) {
                    folVar.w(fkb.b, str);
                    folVar.r(str);
                    folVar.o(str, -256);
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) ((defpackage.gkc) this.a).a;
                java.lang.Long lA = workDatabase.t().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                dtb.i(workDatabase, iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1);
                if (iLongValue < 0) {
                    dtb.i(workDatabase, 1);
                } else {
                    i = iLongValue;
                }
                return java.lang.Integer.valueOf(i);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                mqu mquVarB = mqu.b((defpackage.mqj) this.a);
                mquVarB.getClass();
                return mquVarB;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.kxn kxnVar = (defpackage.kxn) this.a;
                byte[] bArr = kxnVar.c;
                int length = bArr.length;
                defpackage.rot rotVar = kxnVar.d;
                if (rotVar.c != 1) {
                    throw new java.lang.IllegalStateException("startRecording not called");
                }
                int i2 = 512;
                int i3 = 0;
                while (i2 > 0) {
                    try {
                        int iMin = java.lang.Math.min(i2, 16384);
                        qwd qwdVar = rotVar.a;
                        defpackage.qwf qwfVar = rotVar.d;
                        if (qwdVar.k(qwfVar, iMin)) {
                            int i4 = rotVar.b.read(bArr, i3, iMin);
                            if (i4 > 0) {
                                qwdVar.d(qwfVar, i4);
                                i3 += i4;
                                i2 -= i4;
                            } else {
                                defpackage.rrx.d(5, "CAR.AUDIO.RECORD", null, "CarAudioRecord read returned %d", java.lang.Integer.valueOf(i4));
                            }
                        } else {
                            defpackage.rrx.d(4, "CAR.AUDIO.RECORD", null, "No data available to read %d bytes", java.lang.Integer.valueOf(iMin));
                        }
                    } catch (android.os.RemoteException e) {
                        rotVar.a(e);
                    } catch (java.io.IOException unused) {
                        defpackage.rrx.b("CAR.AUDIO.RECORD", null, "CarAudioRecord error reading microphone data");
                    } catch (java.lang.IllegalStateException e2) {
                        defpackage.oml.G(e2);
                    }
                    i3 = -1;
                    return java.lang.Integer.valueOf(i3);
                }
                return java.lang.Integer.valueOf(i3);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                kxs kxsVar = (kxs) this.a;
                byte[] bArr2 = kxsVar.d;
                int length2 = bArr2.length;
                return java.lang.Integer.valueOf(kxsVar.c.read(bArr2, 0, 8192));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar = defpackage.kzb.a;
                java.lang.Object obj2 = this.a;
                defpackage.kwv kwvVar = new defpackage.kwv(obj2, (char[]) null);
                java.util.regex.Pattern pattern = defpackage.wfx.a;
                defpackage.wfw wfwVar = new defpackage.wfw((android.content.Context) obj2);
                wfwVar.b("assistant");
                wfwVar.c("assistant_stored_data.pb");
                return vvb.O(wfwVar.a(), kwvVar);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ldb ldbVar = defpackage.ldd.a;
                java.lang.Object obj3 = this.a;
                defpackage.kwv kwvVar2 = new defpackage.kwv(obj3, (char[]) null);
                java.util.regex.Pattern pattern2 = defpackage.wfx.a;
                defpackage.wfw wfwVar2 = new defpackage.wfw((android.content.Context) obj3);
                wfwVar2.b("csat");
                wfwVar2.c("ratelimit.pb");
                return vvb.O(wfwVar2.a(), kwvVar2);
            case 9:
                return defpackage.ebq.p(((phn) this.a).q);
            case 10:
                return (defpackage.erh) this.a.a();
            case 11:
                defpackage.qdv qdvVar = (defpackage.qdv) this.a;
                if (qdvVar.j.isEmpty() && qdvVar.o()) {
                    qdvVar.l();
                }
                return null;
            case 12:
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.qsa) this.a).k);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((com.google.android.gms.car.bluetooth.data.CarBluetoothData) optionalOfNullable.get()).a());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((android.bluetooth.BluetoothDevice) optionalOfNullable.get()).getAddress());
                }
                return (java.lang.String) optionalOfNullable.orElse((java.lang.Object) null);
            case 13:
                defpackage.qsa qsaVar = (defpackage.qsa) this.a;
                java.lang.String str2 = qsaVar.j;
                if (str2 != null) {
                    return str2;
                }
                j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(qsaVar.k);
                if (true == optionalOfNullable2.isPresent() && ((com.google.android.gms.car.bluetooth.data.CarBluetoothData) optionalOfNullable2.get()).b()) {
                    optionalOfNullable2 = j$.util.Optional.empty();
                }
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((com.google.android.gms.car.bluetooth.data.CarBluetoothData) optionalOfNullable2.get()).a());
                }
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((android.bluetooth.BluetoothDevice) optionalOfNullable2.get()).getAddress());
                }
                return (java.lang.String) optionalOfNullable2.orElse((java.lang.Object) null);
            case 14:
                return java.lang.Boolean.valueOf(((defpackage.rib) this.a).f());
            case 15:
                return java.lang.Boolean.valueOf(((defpackage.rib) this.a).h());
            case 16:
                rhq rhqVar = ((defpackage.qsa) this.a).h;
                if (rhqVar != null && rhqVar.a()) {
                    z3 = true;
                }
                return java.lang.Boolean.valueOf(z3);
            case 17:
                rhq rhqVar2 = ((defpackage.qsa) this.a).h;
                if (rhqVar2 != null && rhqVar2.b()) {
                    z2 = true;
                }
                return java.lang.Boolean.valueOf(z2);
            case 18:
                return java.lang.Boolean.valueOf(((defpackage.rib) this.a).i());
            case 19:
                return ((android.content.Context) ((defpackage.zps) this.a).c).getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            default:
                ((android.content.BroadcastReceiver.PendingResult) this.a).finish();
                return null;
        }
    }

    public /* synthetic */ fma(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
