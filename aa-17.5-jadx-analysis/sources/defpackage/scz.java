package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class scz {
    public static volatile scz a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tqv] */
    public scz(ajdr ajdrVar) {
        this.e = new HashMap();
        this.c = ajdrVar;
        Object obj = ajdrVar.b;
        this.d = new urv(((AtomicInteger) ajdrVar.e).getAndIncrement(), ajdrVar.d, (rjs) obj);
        this.b = false;
    }

    public static Intent a(String str) {
        return new Intent(str).setComponent((ComponentName) rhz.f.gu());
    }

    public final boolean b(BluetoothDevice bluetoothDevice, boolean z) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String address = bluetoothDevice.getAddress();
        boolean zC = adbu.c();
        Object obj = this.d;
        if (zC) {
            EnumSet enumSetA = new scy((Context) obj).a(address);
            if (enumSetA.isEmpty()) {
                return false;
            }
            return z || !enumSetA.contains(scw.b);
        }
        int i2 = shj.a;
        Context context = (Context) obj;
        shj shjVar = !context.getDatabasePath("carservicedata.db").exists() ? null : new shj(context);
        if (shjVar == null) {
            return false;
        }
        SQLiteDatabase readableDatabase = shjVar.getReadableDatabase();
        ArrayList<CarInfoInternal> arrayList = new ArrayList();
        Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM allowedcars ORDER BY connectiontime DESC", null);
        try {
            if (cursorRawQuery.moveToFirst()) {
                do {
                    if (a.O()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("headUnitMake");
                        String string = columnIndex != -1 ? cursorRawQuery.getString(columnIndex) : null;
                        int columnIndex2 = cursorRawQuery.getColumnIndex("headUnitModel");
                        String string2 = columnIndex2 != -1 ? cursorRawQuery.getString(columnIndex2) : null;
                        int columnIndex3 = cursorRawQuery.getColumnIndex("headUnitSoftwareBuild");
                        String string3 = columnIndex3 != -1 ? cursorRawQuery.getString(columnIndex3) : null;
                        int columnIndex4 = cursorRawQuery.getColumnIndex("headUnitSoftwareVersion");
                        String string4 = columnIndex4 != -1 ? cursorRawQuery.getString(columnIndex4) : null;
                        int columnIndex5 = cursorRawQuery.getColumnIndex("vehicleType");
                        if (columnIndex5 != -1) {
                            str2 = string;
                            i = cursorRawQuery.getInt(columnIndex5);
                        } else {
                            i = 0;
                            str2 = string;
                        }
                        str3 = string2;
                        str4 = string3;
                        str5 = string4;
                    } else {
                        i = 0;
                        str2 = null;
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                    arrayList.add(new CarInfoInternal(new CarInfo(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("manufacturer")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("model")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("modelyear")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("vehicleidclient")), cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("headUnitProtocolMajorVersionNumber")), cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("headUnitProtocolMinorVersionNumber")), false, 0, str2, str3, str4, str5, false, false, false, cursorRawQuery.getString(cursorRawQuery.getColumnIndex("nickname")), null, i), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("vehicleid")), cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("bluetoothConnectionAllowed")) != 0, cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("id")), cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("connectiontime")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("bluetoothaddress")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("wifissid")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("wifibssid")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("wifipassword")), cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("wifisecurity")), null, 0, 0, 0, true, true, -1L, false, "", -1, null));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            shjVar.close();
            for (CarInfoInternal carInfoInternal : arrayList) {
                if (carInfoInternal != null && (str = carInfoInternal.f) != null && str.equals(address)) {
                    return z || TextUtils.isEmpty(carInfoInternal.g);
                }
            }
            return false;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public final void c(BluetoothDevice bluetoothDevice, boolean z, boolean z2) {
        Intent intentA = a("android.bluetooth.device.action.ACL_CONNECTED");
        intentA.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        intentA.putExtra("car_startup.HAS_WIFI", z);
        intentA.putExtra("car_setup.SUPPORTS_ANDROID_AUTO", z2);
        if (Build.VERSION.SDK_INT < 30) {
            ((ypf) this.c).l().ai(8777).u("Start background service");
            ((Context) this.d).startService(intentA);
            return;
        }
        if (z2) {
            Context context = (Context) this.d;
            if (((UsbManager) context.getSystemService("usb")).getAccessoryList() == null && ((AtomicBoolean) this.e).compareAndSet(false, true)) {
                ((yns) this.c).f().ai(8779).u("StartForegroundService");
                intentA.putExtra("start_foreground_immediately", true);
                context.startForegroundService(intentA);
                return;
            }
        }
        ((yns) this.c).f().ai(8778).u("Do not start CarStartupService");
    }

    public final boolean d() {
        return this.e == null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ackk, java.lang.Object] */
    public final uxc e(trm trmVar) {
        ?? r0 = this.e;
        uxc uxcVarC = (uxc) r0.get(trmVar);
        if (uxcVarC != null) {
            return uxcVarC;
        }
        uql uqlVar = (uql) trmVar;
        final int i = 1;
        if (uqlVar.a() - 1 != 1) {
            this.b = true;
            ygz ygzVar = ((uqj) uqlVar).a;
            ajdr ajdrVar = (ajdr) this.c;
            yfl yflVarJ = yfq.j(ygzVar.size());
            yno it = ygzVar.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                yflVarJ.i(new xxi((Integer) entry.getKey(), (Bitmap) entry.getValue()));
                Object obj = this.d;
                yfq yfqVarG = yflVarJ.g();
                final float f = ((Context) ajdrVar.a).getResources().getDisplayMetrics().density;
                final yfq yfqVarO = yfq.o(yfqVarG);
                final int i2 = 0;
                uxcVarC = ((urv) obj).c(new urp() { // from class: uro
                    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
                    @Override // defpackage.urp
                    public final void a(tqt tqtVar) {
                        if (i2 != 0) {
                            vaq.d();
                            Object obj2 = yfqVarO;
                            typ typVar = ((tyh) tqtVar).g;
                            twg twgVar = new twg(typVar, (tyh) tqtVar, (abdr) obj2, ((tyh) tqtVar).c.getAndIncrement());
                            typVar.o(twgVar, false);
                            aeoa aeoaVar = ((tyh) tqtVar).b;
                            synchronized (aeoaVar) {
                                aeoaVar.a(twgVar.a(), twgVar);
                            }
                            return;
                        }
                        AtomicInteger atomicInteger = ((tyh) tqtVar).c;
                        ?? r10 = yfqVarO;
                        int andIncrement = atomicInteger.getAndIncrement();
                        ujf[] ujfVarArr = new ujf[r10.size()];
                        byte[] bArr = new byte[r10.size()];
                        for (int i3 = 0; i3 < r10.size(); i3++) {
                            xxi xxiVar = (xxi) r10.get(i3);
                            Integer num = (Integer) xxiVar.a;
                            Bitmap bitmap = (Bitmap) xxiVar.b;
                            if (num == null) {
                                ((ynz) ((ynz) tyh.a.g()).ai((char) 9201)).y("Had a null zoom when creating a multizoom label icon style from %s, returning invalid style instead.", r10);
                                yob yobVar = typ.a;
                                return;
                            } else {
                                if (bitmap == null) {
                                    ((ynz) ((ynz) tyh.a.g()).ai((char) 9200)).y("Had a null bitmap when creating a multizoom label icon style from %s, returning invalid style instead.", r10);
                                    yob yobVar2 = typ.a;
                                    return;
                                }
                                ujf ujfVar = ujf.c;
                                uje ujeVar = new uje();
                                ujeVar.p = new uja(bitmap);
                                ujfVarArr[i3] = new ujf(ujeVar);
                                bArr[i3] = num.byteValue();
                            }
                        }
                        vaq.d();
                        txk txkVar = new txk((tyh) tqtVar, new ukf(0L, ujfVarArr, bArr, null, ((tyh) tqtVar).f), andIncrement);
                        aeoa aeoaVar2 = ((tyh) tqtVar).b;
                        synchronized (aeoaVar2) {
                            aeoaVar2.a(txkVar.e, txkVar);
                        }
                    }
                }, new urq() { // from class: urm
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
                    @Override // defpackage.urq
                    public final abdr a(rjg rjgVar) {
                        abnr abnrVar = (abnr) abdr.a.n();
                        yfq yfqVar = yfqVarO;
                        int size = yfqVar.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            float f2 = f;
                            xxi xxiVar = (xxi) yfqVar.get(i3);
                            abnp abnpVarN = abcv.a.n();
                            abnr abnrVar2 = (abnr) abbz.a.n();
                            Bitmap bitmap = (Bitmap) xxiVar.b;
                            rjs rjsVar = (rjs) rjgVar.b;
                            String str = "direct-bitmap://" + ((AtomicLong) rjsVar.a).incrementAndGet();
                            ((ConcurrentHashMap) rjsVar.b).put(str, bitmap);
                            rjgVar.a.add(str);
                            abnrVar2.t();
                            abbz abbzVar = (abbz) abnrVar2.b;
                            abbzVar.b |= 1;
                            abbzVar.c = str;
                            abnrVar2.t();
                            abbz abbzVar2 = (abbz) abnrVar2.b;
                            abbzVar2.b |= 16;
                            abbzVar2.g = f2;
                            abnpVarN.t();
                            abcv abcvVar = (abcv) abnpVarN.b;
                            abbz abbzVar3 = (abbz) abnrVar2.q();
                            abbzVar3.getClass();
                            aboh abohVar = abcvVar.e;
                            if (!abohVar.c()) {
                                abcvVar.e = abnv.I(abohVar);
                            }
                            abcvVar.e.add(abbzVar3);
                            abnr abnrVar3 = (abnr) abcf.a.n();
                            int iIntValue = ((Integer) xxiVar.a).intValue();
                            abnrVar3.t();
                            abcf abcfVar = (abcf) abnrVar3.b;
                            abcfVar.b |= 1;
                            abcfVar.c = iIntValue;
                            abnrVar3.t();
                            abcf abcfVar2 = (abcf) abnrVar3.b;
                            abcv abcvVar2 = (abcv) abnpVarN.q();
                            abcvVar2.getClass();
                            abcfVar2.e = abcvVar2;
                            abcfVar2.b |= 4;
                            abnrVar.bj(abnrVar3);
                        }
                        return (abdr) abnrVar.q();
                    }
                });
            }
        } else {
            this.b = true;
            Object obj2 = this.d;
            final abdr abdrVar = ((uqk) uqlVar).a;
            uxcVarC = ((urv) obj2).c(new urp() { // from class: uro
                /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
                @Override // defpackage.urp
                public final void a(tqt tqtVar) {
                    if (i != 0) {
                        vaq.d();
                        Object obj22 = abdrVar;
                        typ typVar = ((tyh) tqtVar).g;
                        twg twgVar = new twg(typVar, (tyh) tqtVar, (abdr) obj22, ((tyh) tqtVar).c.getAndIncrement());
                        typVar.o(twgVar, false);
                        aeoa aeoaVar = ((tyh) tqtVar).b;
                        synchronized (aeoaVar) {
                            aeoaVar.a(twgVar.a(), twgVar);
                        }
                        return;
                    }
                    AtomicInteger atomicInteger = ((tyh) tqtVar).c;
                    ?? r10 = abdrVar;
                    int andIncrement = atomicInteger.getAndIncrement();
                    ujf[] ujfVarArr = new ujf[r10.size()];
                    byte[] bArr = new byte[r10.size()];
                    for (int i3 = 0; i3 < r10.size(); i3++) {
                        xxi xxiVar = (xxi) r10.get(i3);
                        Integer num = (Integer) xxiVar.a;
                        Bitmap bitmap = (Bitmap) xxiVar.b;
                        if (num == null) {
                            ((ynz) ((ynz) tyh.a.g()).ai((char) 9201)).y("Had a null zoom when creating a multizoom label icon style from %s, returning invalid style instead.", r10);
                            yob yobVar = typ.a;
                            return;
                        } else {
                            if (bitmap == null) {
                                ((ynz) ((ynz) tyh.a.g()).ai((char) 9200)).y("Had a null bitmap when creating a multizoom label icon style from %s, returning invalid style instead.", r10);
                                yob yobVar2 = typ.a;
                                return;
                            }
                            ujf ujfVar = ujf.c;
                            uje ujeVar = new uje();
                            ujeVar.p = new uja(bitmap);
                            ujfVarArr[i3] = new ujf(ujeVar);
                            bArr[i3] = num.byteValue();
                        }
                    }
                    vaq.d();
                    txk txkVar = new txk((tyh) tqtVar, new ukf(0L, ujfVarArr, bArr, null, ((tyh) tqtVar).f), andIncrement);
                    aeoa aeoaVar2 = ((tyh) tqtVar).b;
                    synchronized (aeoaVar2) {
                        aeoaVar2.a(txkVar.e, txkVar);
                    }
                }
            }, new urq() { // from class: urn
                @Override // defpackage.urq
                public final abdr a(rjg rjgVar) {
                    return abdrVar;
                }
            });
        }
        uxcVarC.getClass();
        r0.put(trmVar, uxcVarC);
        return uxcVarC;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajkc, java.lang.Object] */
    public final ajjn f() {
        ajkb ajkbVarB = this.c.b();
        ajjn ajjnVar = ajkbVarB instanceof ajjn ? (ajjn) ajkbVarB : null;
        if (ajjnVar != null) {
            return ajjnVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajkc, java.lang.Object] */
    public final void g(IOException iOException) {
        this.b = true;
        this.c.b().i((ajjm) this.e, iOException);
    }

    public final IOException h(boolean z, boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            g(iOException);
        }
        Object obj = this.e;
        return ((ajjm) obj).i(this, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ajkc, java.lang.Object] */
    public final ajie i() throws IOException {
        try {
            ajie ajieVarI = this.c.i();
            ajieVarI.l = this;
            return ajieVarI;
        } catch (IOException e) {
            g(e);
            throw e;
        }
    }

    public scz(hrc hrcVar) {
        this.b = false;
        this.d = null;
        this.c = null;
        this.e = hrcVar;
    }

    public scz(Object obj, hqh hqhVar) {
        this.b = false;
        this.d = obj;
        this.c = hqhVar;
        this.e = null;
    }

    public scz(ifs ifsVar, icz iczVar) {
        this.c = new idr(this);
        this.d = ifsVar;
        this.e = iczVar;
    }

    public scz(Context context) {
        this.e = new AtomicBoolean(false);
        this.d = context;
        this.c = ols.R("CAR.BT_RCVR");
    }

    public scz(ajjm ajjmVar, ajji ajjiVar, ajkc ajkcVar) {
        this.e = ajjmVar;
        this.d = ajjiVar;
        this.c = ajkcVar;
    }
}
