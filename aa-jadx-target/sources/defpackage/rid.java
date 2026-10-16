package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rid implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rid(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: roo */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.Object, rpy] */
    @Override // java.lang.Runnable
    public final void run() throws roo {
        java.io.File file;
        java.util.List<rka> list;
        android.os.ParcelFileDescriptor parcelFileDescriptorOpen;
        int i = 3;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((rie) this.a).a();
                return;
            case 1:
                ((defpackage.rib) this.a).b();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    java.lang.Object obj = this.a;
                    file = (java.io.File) ((rju) obj).c.call();
                    if (file == null) {
                        synchronized (((rju) obj).b) {
                            try {
                                ((rju) obj).d = null;
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        return;
                    }
                } catch (java.lang.Exception e) {
                    rju.a.h().p(e).ai(8194).u("Couldn't fetch data.");
                    file = null;
                }
                java.lang.Object obj2 = this.a;
                rju.a.l().ai(8195).u("notifyCallbacks");
                synchronized (((rju) obj2).b) {
                    list = ((rju) obj2).d;
                    ((rju) obj2).d = null;
                    break;
                }
                list.getClass();
                for (rka rkaVar : list) {
                    if (file != null) {
                        try {
                            parcelFileDescriptorOpen = android.os.ParcelFileDescriptor.open(file, 268435456);
                        } catch (android.os.RemoteException unused) {
                            rju.a.l().ai(8198).u("client died, not notifying");
                        } catch (java.io.FileNotFoundException e2) {
                            throw new java.lang.RuntimeException(e2);
                        }
                    } else {
                        parcelFileDescriptorOpen = null;
                    }
                    rju.a.l().ai(8196).y("notifying client: %s", rkaVar);
                    rkaVar.e(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        try {
                            parcelFileDescriptorOpen.close();
                        } catch (java.io.IOException unused2) {
                            rju.a.h().ai(8197).u("Error closing fd");
                        }
                    }
                }
                if (file != null) {
                    file.delete();
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj3 = this.a;
                if (((lhb) ((defpackage.pyk) obj3).b).d) {
                    ((defpackage.yqj) lhb.b.f()).u("Integrated overlay stopped.");
                    defpackage.khg.u(new defpackage.wde("GH.ProjIntegOverlayMgr", defpackage.zbe.INTEGRATED_OVERLAY, defpackage.zbd.Ms, "Car not connected when stopping integrated overlay activity.", new java.lang.Object[0]), new defpackage.lgy(obj3, i));
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((rmv) this.a).a();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    defpackage.qyu qyuVar = ((defpackage.ror) this.a).i;
                    if (qyuVar != null) {
                        qyuVar.v();
                    }
                    break;
                } catch (android.os.RemoteException unused3) {
                }
                java.lang.Object obj4 = this.a;
                defpackage.ror rorVar = (defpackage.ror) obj4;
                if (rorVar.I != null) {
                    rorVar.n(0, false);
                }
                try {
                    defpackage.qyu qyuVar2 = ((defpackage.ror) obj4).i;
                    if (qyuVar2 != null) {
                        qyuVar2.g();
                    }
                    break;
                } catch (android.os.RemoteException unused4) {
                }
                ((defpackage.ror) this.a).J = null;
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.view.View view = ((defpackage.ror) this.a).s;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj5 = this.a;
                defpackage.ror rorVar2 = (defpackage.ror) obj5;
                if (rorVar2.y()) {
                    if (rorVar2.I != null && (rorVar2.F == 3 || rorVar2.F == 5)) {
                        rorVar2.n(4, false);
                    }
                    try {
                        defpackage.qyu qyuVar3 = ((defpackage.ror) obj5).i;
                        if (qyuVar3 != null) {
                            qyuVar3.n();
                            return;
                        }
                        return;
                    } catch (android.os.RemoteException unused5) {
                        rorVar2.t();
                        return;
                    }
                }
                return;
            case 9:
                android.util.SparseArray sparseArray = defpackage.ror.a;
                defpackage.qrd qrdVar = ((defpackage.ror) this.a).I;
                return;
            case 10:
                defpackage.ror rorVar3 = (defpackage.ror) this.a;
                if (rorVar3.y()) {
                    rorVar3.n(2, false);
                    defpackage.rpm rpmVar = rorVar3.k;
                    if (rpmVar != null) {
                        rpmVar.k();
                    }
                    defpackage.qyu qyuVar4 = rorVar3.i;
                    if (qyuVar4 != null) {
                        try {
                            qyuVar4.r();
                        } catch (android.os.RemoteException unused6) {
                            rorVar3.t();
                        }
                        break;
                    }
                    defpackage.rpm rpmVar2 = rorVar3.k;
                    if (rpmVar2 != null) {
                        rpmVar2.n();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                defpackage.rrx.c("CAR.PROJECTION.CAHI", null, "Throwing a CrashClientAnrException to explicitly crash");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                com.google.android.gms.car.KillOptions killOptions = (com.google.android.gms.car.KillOptions) this.a;
                sb.append(killOptions.a);
                sb.append(":");
                sb.append(killOptions.d);
                throw new roo(sb.toString());
            case 12:
                android.util.SparseArray sparseArray2 = defpackage.ror.a;
                defpackage.qrd qrdVar2 = ((defpackage.ror) this.a).I;
                return;
            case 13:
                ((com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView) this.a).a.J(4);
                return;
            case 14:
                this.a.a();
                return;
            case 15:
                ((defpackage.rql) this.a).a.b(1, false);
                return;
            case 16:
                defpackage.rtc.a.f().ai(8256).u("car did not send byebye response. will quit.");
                defpackage.rtc rtcVar = (defpackage.rtc) this.a;
                rtcVar.j.p(defpackage.zaj.CAR_NOT_RESPONDING, defpackage.zak.BYEBYE_TIMEOUT, "byebye timeout");
                defpackage.omv.i(rtcVar.c, defpackage.yyn.PROJECTION_ENDED_BYEBYE_TIMEOUT);
                return;
            case 17:
                ((defpackage.rwj) this.a).c();
                return;
            case 18:
                ((defpackage.rwk) this.a).a();
                return;
            case 19:
                rye ryeVar = (rye) this.a;
                android.content.Context context = ryeVar.b;
                defpackage.yqk yqkVar = rxy.a;
                for (olq olqVar : ryb.r(context).b) {
                    if (olqVar.e.equals(ryeVar.d) && !olqVar.j) {
                        ryeVar.a.l().ai(8512).u("Found issue with bug report from session, not deleting bug report");
                        return;
                    }
                }
                ryeVar.c.d(ryeVar.d);
                return;
            default:
                rxy.m(((defpackage.ryu) this.a).a, yyt.b);
                return;
        }
        while (true) {
            try {
                java.lang.Object obj6 = this.a;
                java.util.concurrent.LinkedBlockingDeque linkedBlockingDeque = ((defpackage.rlz) obj6).c;
                if (linkedBlockingDeque.remainingCapacity() == 0) {
                    defpackage.rlz.a.h().ai(8207).u("Request buffer reaches full capacity, flush to dumpMessageBuffer");
                    synchronized (((defpackage.rlz) obj6).b) {
                        defpackage.yfd yfdVar = ((defpackage.rlz) obj6).d;
                        yfdVar.clear();
                        linkedBlockingDeque.drainTo(yfdVar);
                    }
                }
                rmb rmbVar = (rmb) linkedBlockingDeque.take();
                synchronized (((defpackage.rlz) obj6).b) {
                    ((defpackage.rlz) obj6).d.add(rmbVar);
                }
            } catch (java.lang.InterruptedException unused7) {
                defpackage.rlz.a.h().ai(8206).u("GAL Snoop worker thread has been interrupted");
                return;
            }
        }
    }

    public rid(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
