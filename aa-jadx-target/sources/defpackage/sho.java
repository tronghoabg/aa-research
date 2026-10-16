package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class sho implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ sho(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object, szn] */
    /* JADX WARN: Type inference failed for: r6v66, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.content.ServiceConnection, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        int i2 = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.wyz) this.a).d();
                return;
            case 1:
                ((defpackage.wyz) this.a).e();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.shp) this.a).h.h.f(false);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ?? r6 = this.a;
                defpackage.shp shpVar = (defpackage.shp) r6;
                if (shpVar.i == 1) {
                    shpVar.i = 3;
                    defpackage.shu shuVar = shpVar.h;
                    defpackage.sqf.a().c(shuVar.b, r6);
                    shuVar.d.post(new defpackage.sho(shuVar.h, i2));
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.wyz) this.a).d();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.rxe) this.a).a.h.f(false);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqk yqkVar = defpackage.qtn.a;
                java.lang.Object obj = ((defpackage.wyz) this.a).a;
                ((defpackage.qtn) obj).d.post(new defpackage.qth(obj, i));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.sid sidVar = (defpackage.sid) this.a;
                sidVar.j.c(null, sidVar.d);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.sid) this.a).f();
                return;
            case 9:
                java.lang.Object obj2 = this.a;
                defpackage.sid sidVar2 = (defpackage.sid) obj2;
                defpackage.sic sicVar = sidVar2.i;
                if (sicVar.a) {
                    defpackage.rxo rxoVar = sicVar.f;
                    if (rxoVar != null) {
                        try {
                            rxoVar.m(((defpackage.sid) obj2).c);
                        } catch (android.os.RemoteException e) {
                            defpackage.sid.a.f().p(e).ai(8987).y("Couldn't stop %s, but it could be fine.", sidVar2.i.e);
                        }
                        break;
                    }
                    sidVar2.b.unbindService(sidVar2.h);
                    sidVar2.i.a = false;
                    return;
                }
                return;
            case 10:
                defpackage.sbq sbqVar = (defpackage.sbq) this.a;
                sbqVar.c.post(sbqVar.b);
                return;
            case 11:
                defpackage.slr slrVar = ((defpackage.snb) ((defpackage.xei) this.a).a).b;
                slrVar.o(java.lang.String.valueOf(slrVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 12:
                ((snw) this.a).f.b(new com.google.android.gms.common.ConnectionResult(1, 4, null, null, null));
                return;
            case 13:
                java.lang.Object obj3 = this.a;
                synchronized (((defpackage.swo) obj3).a) {
                    ((defpackage.swo) obj3).b.b();
                    break;
                }
                return;
            case 14:
                try {
                    java.lang.Thread.sleep(600000L);
                    break;
                } catch (java.lang.InterruptedException e2) {
                    android.util.Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e2);
                    java.lang.Thread.currentThread().interrupt();
                }
                sza.a((android.content.Context) this.a);
                sza.b();
                return;
            case 15:
                this.a.b();
                return;
            case 16:
                defpackage.ypg ypgVar = tfo.a;
                ((defpackage.ype) ((defpackage.ype) ypgVar.h()).ai((char) 9018)).u("Lockscreen timeout expired");
                defpackage.ype ypeVar = (defpackage.ype) ((defpackage.ype) ypgVar.e()).ai(9016);
                tfo tfoVar = (tfo) this.a;
                java.util.List list = tfoVar.b;
                ypeVar.w("Notifying %d external onTimeout listeners", list.size());
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                list.clear();
                tfoVar.a();
                return;
            case 17:
                toe toeVar = (toe) this.a;
                android.content.SharedPreferences.Editor editorEdit = toeVar.e.edit();
                editorEdit.putLong("InitializedEventPreviousEventMsPrefKey", toeVar.f);
                editorEdit.apply();
                return;
            case 18:
                vbn.d();
                qbs qbsVar = ((tok) this.a).k;
                vv vvVar = new vv((char[]) null);
                vvVar.b(ywn.v);
                qbsVar.g(vvVar.a());
                return;
            case 19:
                java.lang.Object obj4 = this.a;
                try {
                    defpackage.abox.B(zrr.a, (byte[]) obj4, defpackage.abol.a());
                    return;
                } catch (defpackage.abpp e3) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) com.google.android.libraries.geo.mapcore.geoxp.jni.logging.NativeCountersLoggingTransport.a.h()).p(e3)).ai((char) 9137)).u("Failed to parse counterfactual event");
                    return;
                }
            default:
                ((defpackage.gmz) this.a).a.run();
                return;
        }
    }

    public sho(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
