package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelUuid;
import android.util.Log;
import android.util.Pair;
import com.google.android.libraries.storage.protostore.MappedCounterCacheVersion;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final /* synthetic */ class vzf implements zfk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vzf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object, wdg] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object, zgp] */
    @Override // defpackage.zfk
    public final zgp a(Object obj) throws ExecutionException, IOException {
        int i = this.c;
        boolean zA = true;
        if (i == 0) {
            abnr abnrVar = (abnr) ((vys) obj).K();
            abnrVar.t();
            vys vysVar = (vys) abnrVar.b;
            Object obj2 = this.b;
            obj2.getClass();
            vysVar.c = (ajgu) obj2;
            vysVar.b = 1 | vysVar.b;
            vys vysVar2 = (vys) abnrVar.q();
            vzg vzgVar = (vzg) this.a;
            return vzgVar.b.a(vzgVar.a, vysVar2);
        }
        if (i == 1) {
            oyv oyvVar = (oyv) obj;
            yfq yfqVar = oyvVar.b;
            ParcelUuid[] parcelUuidArr = yfqVar == null ? null : (ParcelUuid[]) yfqVar.toArray(new ParcelUuid[0]);
            Object obj3 = this.a;
            if (oyr.g(parcelUuidArr).f) {
                ((oyr) obj3).d.b((String) this.b);
            }
            BluetoothDevice bluetoothDevice = oyvVar.a;
            if (oyr.h(bluetoothDevice)) {
                ((oyr) obj3).e.f(bluetoothDevice);
                return oyr.i(oyn.NOT_BONDED);
            }
            String address = bluetoothDevice.getAddress();
            yph yphVar = oyr.a;
            ((ype) ((ype) yphVar.f()).ai((char) 6196)).y("Second pass on device with address %s", address);
            oyr oyrVar = (oyr) obj3;
            oyq oyqVarA = oyrVar.a(parcelUuidArr, bluetoothDevice);
            oyq oyqVar = oyq.UUID_ARRAY_HAS_AA_UUID;
            if (oyqVarA.equals(oyqVar)) {
                return oyr.i(oyn.SUPPORTED);
            }
            if (oyqVarA.f) {
                ((ype) ((ype) yphVar.f()).ai((char) 6199)).u("This device fetched valid UUIDs which contains no known AA UUIDs.");
                return oyr.i(oyn.NOT_SUPPORTED);
            }
            oyq oyqVarB = oyrVar.b(bluetoothDevice);
            if (oyqVarB.equals(oyqVar)) {
                return oyr.i(oyn.SUPPORTED);
            }
            if (oyqVarB.f) {
                ((ype) ((ype) yphVar.f()).ai((char) 6198)).u("This device cached valid UUIDs which contains no known AA UUIDs.");
                return oyr.i(oyn.NOT_SUPPORTED);
            }
            ((ype) ((ype) yphVar.h()).ai((char) 6197)).u("This device fetched invalid UUIDs.");
            return oyr.i(oyn.UNKNOWN_AND_TRY_RFCOMM);
        }
        if (i == 2) {
            int i2 = wcy.a;
            int i3 = yfq.d;
            yfl yflVar = new yfl(4);
            Context context = ((wae) this.a).c;
            yflVar.i(context);
            int i4 = tmz.a;
            yflVar.i(tmz.a(context));
            yfq yfqVarG = yflVar.g();
            int i5 = ((yls) yfqVarG).c;
            for (int i6 = 0; i6 < i5; i6++) {
                Object obj4 = this.b;
                File file = new File(String.valueOf(((Context) yfqVarG.get(i6)).getFilesDir()) + "/phenotype/shared/" + ((String) obj4));
                Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                if (file.exists()) {
                    zA = wcy.a(file);
                }
            }
            return zA ? zgl.a : new zhc(new IOException("Unable to remove snapshots for removed user"));
        }
        if (i == 3) {
            wdb wdbVar = (wdb) this.a;
            return ((six) wdbVar.d.gu()).g(new wda(wdbVar, this.b));
        }
        if (i == 4) {
            return wub.Y(((wgp) this.b).c((Uri) this.a));
        }
        if (i != 5) {
            Object obj5 = this.a;
            wgt wgtVar = (wgt) obj5;
            wgtVar.c((Uri) wub.af(wgtVar.a), obj);
            Object obj6 = wgtVar.d;
            ?? r9 = this.b;
            synchronized (obj6) {
                ((wgt) obj5).e = r9;
            }
            return wub.Y(obj);
        }
        Object objAf = wub.af(this.b);
        if (objAf.equals(obj)) {
            return wub.Y(obj);
        }
        Object obj7 = this.a;
        wgp wgpVar = (wgp) obj7;
        MappedCounterCacheVersion mappedCounterCacheVersion = (MappedCounterCacheVersion) wub.af(wgpVar.e.a());
        Uri uri = (Uri) wub.af(wgpVar.a);
        Pair pair = (Pair) wgpVar.h.get();
        long jA = mappedCounterCacheVersion.a();
        if (pair != null && jA == ((Long) pair.second).longValue()) {
            woy.aa(objAf.equals(pair.first), "Cache is inconsistent when it shouldn't be");
        }
        xua xuaVarAx = woy.ax("Write ".concat(String.valueOf(wgpVar.f)));
        try {
            ((wgp) obj7).f(uri, obj, mappedCounterCacheVersion);
            xuaVarAx.close();
            return wub.Y(obj);
        } catch (Throwable th) {
            try {
                xuaVarAx.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ vzf(wgp wgpVar, Uri uri, int i) {
        this.c = i;
        this.b = wgpVar;
        this.a = uri;
    }
}
