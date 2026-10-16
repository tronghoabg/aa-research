package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class rgf implements xwx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rgf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v36, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38, types: [afec, java.lang.Object] */
    @Override // defpackage.xwx
    public final Object a(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                ypf ypfVar = rgh.a;
                abnp abnpVarK = ((rhh) obj).K();
                abnpVarK.t();
                ((rhh) abnpVarK.b).b().put(this.a, true);
                return (rhh) abnpVarK.q();
            case 1:
                pls plsVar = (pls) obj;
                return Locale.KOREA.getCountry().equals(((plq) this.a).d(plsVar)) ? Integer.valueOf(plsVar.b()) : Integer.valueOf(plsVar.a());
            case 2:
                ypf ypfVar2 = ryc.a;
                abnp abnpVarK2 = ((rrp) obj).K();
                abnpVarK2.w((abnv) this.a);
                return (rrp) abnpVarK2.q();
            case 3:
                final int iIntValue = ((Integer) obj).intValue();
                ypf ypfVar3 = sfb.a;
                Object obj2 = this.a;
                Object objCreateDeviceContext = obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    rhx rhxVar = rhx.c;
                    objCreateDeviceContext = obj2;
                    if (acuc.g()) {
                        objCreateDeviceContext = ((Context) obj2).createDeviceContext(0);
                    }
                }
                final Context context = (Context) objCreateDeviceContext;
                return dsg.w(new dny() { // from class: sex
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.dny
                    public final Object a(dnw dnwVar) {
                        ypf ypfVar4 = sfb.a;
                        sss sssVar = new sss(Looper.getMainLooper());
                        int i2 = iIntValue;
                        BluetoothAdapter adapter = null;
                        rgm rgmVar = new rgm(dnwVar, i2, 8, 0 == true ? 1 : 0);
                        sssVar.postDelayed(rgmVar, 10000L);
                        Context context2 = context;
                        if (context2 == null) {
                            adapter = BluetoothAdapter.getDefaultAdapter();
                        } else {
                            BluetoothManager bluetoothManager = (BluetoothManager) context2.getSystemService("bluetooth");
                            if (bluetoothManager != null) {
                                adapter = bluetoothManager.getAdapter();
                            }
                        }
                        BluetoothAdapter bluetoothAdapter = adapter;
                        if (bluetoothAdapter != null) {
                            bluetoothAdapter.getProfileProxy(context2, new sfa(i2, sssVar, rgmVar, dnwVar, bluetoothAdapter), i2);
                            return "getBluetoothDevicesAsync";
                        }
                        sfb.a.h().ai(8852).u("Could not get bluetooth adapter");
                        int i3 = yfq.d;
                        dnwVar.b(yls.a);
                        return "getBluetoothDevicesAsync";
                    }
                });
            case 4:
                return siu.a(((Boolean) obj).booleanValue(), ((sjn) this.a).c.b);
            case 5:
                abnp abnpVarK3 = ((syo) obj).K();
                while (true) {
                    Object obj3 = this.a;
                    if (i >= ((syo) abnpVarK3.b).b.size()) {
                        abnpVarK3.t();
                        syo syoVar = (syo) abnpVarK3.b;
                        obj3.getClass();
                        syoVar.b();
                        syoVar.b.add(obj3);
                        return (syo) abnpVarK3.q();
                    }
                    if (((sym) ((syo) abnpVarK3.b).b.get(i)).d.equals(((sym) obj3).d)) {
                        abnpVarK3.t();
                        syo syoVar2 = (syo) abnpVarK3.b;
                        obj3.getClass();
                        syoVar2.b();
                        syoVar2.b.set(i, obj3);
                        return (syo) abnpVarK3.q();
                    }
                    i++;
                }
            case 6:
                return this.a.invoke(obj);
            case 7:
                this.a.invoke(obj);
                return null;
            case 8:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((vsg) this.a).b = true;
                    return null;
                }
            case 9:
                UsageReportingOptInOptions usageReportingOptInOptions = ((sww) ((ntn) obj).a).a;
                spu.aw(usageReportingOptInOptions);
                int i2 = usageReportingOptInOptions.a;
                boolean z = i2 == 1 || i2 == 3;
                Object obj4 = this.a;
                Boolean boolValueOf = Boolean.valueOf(z);
                ((vyy) obj4).a.set(boolValueOf);
                return boolValueOf;
            case 10:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((wcq) this.a).e)), (Throwable) obj);
                return null;
            case 11:
                int i3 = wcy.a;
                abnp abnpVarN = wbq.a.n();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((wbq) obj).b).entrySet()) {
                    Object obj5 = this.a;
                    wbp wbpVar = (wbp) entry.getValue();
                    abnp abnpVarN2 = wbp.a.n();
                    if (!wbpVar.d.equals(obj5)) {
                        String str = wbpVar.d;
                        abnpVarN2.t();
                        wbp wbpVar2 = (wbp) abnpVarN2.b;
                        str.getClass();
                        wbpVar2.b |= 1;
                        wbpVar2.d = str;
                    }
                    for (String str2 : wbpVar.c) {
                        if (!str2.equals(obj5)) {
                            abnpVarN2.E(str2);
                        }
                    }
                    abnpVarN.F((String) entry.getKey(), (wbp) abnpVarN2.q());
                }
                return (wbq) abnpVarN.q();
            case 12:
                int i4 = wcy.a;
                wbp wbpVar3 = wbp.a;
                wbp wbpVar4 = (wbp) ((wbq) obj).b.get(this.a);
                if (wbpVar4 != null) {
                    wbpVar3 = wbpVar4;
                }
                return wbpVar3.c;
            case 13:
                int i5 = wcy.a;
                Object obj6 = this.a;
                wbp wbpVar5 = wbp.a;
                obj6.getClass();
                wbp wbpVar6 = (wbp) ((wbq) obj).b.get(obj6);
                if (wbpVar6 != null) {
                    wbpVar5 = wbpVar6;
                }
                return wbpVar5.d;
            case 14:
                return ((wdn) this.a).a();
            case 15:
                wbn wbnVar = (wbn) obj;
                Object obj7 = this.a;
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        synchronized (wdq.a) {
                            String str3 = (String) ((wdq) obj7).g.gu();
                            wbj wbjVar = wbnVar.c;
                            if (wbjVar == null) {
                                wbjVar = wbj.b;
                            }
                            wdq.e(str3, wbjVar, "ce-tmp");
                            wbj wbjVar2 = wbnVar.c;
                            if (wbjVar2 == null) {
                                wbjVar2 = wbj.b;
                            }
                            ((wdq) obj7).h = wbjVar2;
                        }
                        synchronized (wdq.b) {
                            String str4 = (String) ((wdq) obj7).i.gu();
                            wbl wblVar = wbnVar.d;
                            if (wblVar == null) {
                                wblVar = wbl.b;
                            }
                            wdq.e(str4, wblVar, "de-tmp");
                            wbl wblVar2 = wbnVar.d;
                            if (wblVar2 == null) {
                                wblVar2 = wbl.b;
                            }
                            ((wdq) obj7).j = wblVar2;
                        }
                        return null;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case 16:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new ykj(entry2, (ykd) this.a);
            case 17:
                return new yhv((yif) this.a, obj);
            case 18:
                return ((zee) this.a).b((Type) obj);
            default:
                return ((zee) this.a).b((Type) obj);
        }
    }
}
