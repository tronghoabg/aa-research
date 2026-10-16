package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.os.ParcelUuid;
import android.telecom.PhoneAccountHandle;
import android.telecom.PhoneAccountSuggestion;
import android.telecom.TelecomManager;
import android.view.View;
import androidx.car.app.suggestion.model.Suggestion;
import com.google.android.apps.auto.components.troubleshooter.contentprovider.TroubleshooterContentProvider;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class mix implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mix(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v12, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v67, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v72, types: [java.lang.Object, xyc] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 5;
        boolean z = false;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                return ((mit) this.a).h((RadioProgramInfo) obj);
            case 1:
                return ((mit) this.a).f((RadioProgramInfo) obj);
            case 2:
                Suggestion suggestion = (Suggestion) obj;
                int i2 = mod.b;
                if (suggestion != null) {
                    return new moe(suggestion, (ComponentName) this.a);
                }
                throw new NullPointerException("Null suggestion");
            case 3:
                mqz mqzVar = (mqz) obj;
                mqc mqcVar = mqzVar.c;
                ComponentName componentNameA = mqcVar.a();
                return new mra(mqzVar, this.a.contains(componentNameA.getPackageName().equals("com.google.android.projection.gearhead") ? ntx.a(componentNameA, mqcVar.a.b) : new ntx(null, componentNameA.getPackageName(), mqcVar.a.b)));
            case 4:
                int i3 = mqi.f;
                return this.a.invoke(obj);
            case 5:
                int i4 = mqi.f;
                return this.a.invoke(obj);
            case 6:
                njj njjVar = njp.a;
                return this.a.invoke(obj);
            case 7:
                ((View) obj).getRootView().setOnTouchListener(new jzt(this.a, 7, bArr));
                return false;
            case 8:
                return (CarRegionId) ((nso) this.a).h.a().get((nsn) obj);
            case 9:
                return ((mjv) this.a).z((CarCall) obj);
            case 10:
                return ((mjv) this.a).z((CarCall) obj);
            case 11:
                PhoneAccountSuggestion phoneAccountSuggestionM283m = ep$$ExternalSyntheticApiModelOutline0.m283m(obj);
                yph yphVar = off.a;
                return ((TelecomManager) this.a).getPhoneAccount(phoneAccountSuggestionM283m.getPhoneAccountHandle());
            case 12:
                return ((TelecomManager) this.a).getPhoneAccount((PhoneAccountHandle) obj);
            case 13:
                oky okyVar = (oky) obj;
                Map mapA = ((TroubleshooterContentProvider) this.a).a();
                yxo yxoVarB = yxo.b(okyVar.d);
                if (yxoVarB == null) {
                    yxoVarB = yxo.DETECTOR_TYPE_UNSPECIFIED;
                }
                ojj ojjVar = (ojj) mapA.get(yxoVarB);
                ojjVar.getClass();
                return new ojh(ojjVar, okyVar);
            case 14:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                String name = bluetoothDevice.getName();
                String str = name != null ? name : "";
                ParcelUuid[] uuids = bluetoothDevice.getUuids();
                boolean zAnyMatch = uuids == null ? false : DesugarArrays.stream(uuids).anyMatch(new oly(i));
                jlo jloVar = new jlo((Context) this.a);
                try {
                    boolean zF = jloVar.c(bluetoothDevice.getAddress(), false).f();
                    jloVar.close();
                    return new oqo(str, zAnyMatch, zF);
                } catch (Throwable th) {
                    try {
                        jloVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 15:
                int i5 = pnh.b;
                abnp abnpVarN = acdt.a.n();
                abnpVarN.t();
                acdt acdtVar = (acdt) abnpVarN.b;
                acdtVar.c = ((acds) obj).e;
                acdtVar.b |= 1;
                zkf zkfVar = (zkf) this.a;
                boolean z2 = zkfVar.c;
                abnpVarN.t();
                acdt acdtVar2 = (acdt) abnpVarN.b;
                acdtVar2.b |= 2;
                acdtVar2.d = z2;
                int iT = zkt.t(zkfVar.e);
                if (iT != 0 && iT == 3) {
                    z = true;
                }
                abnpVarN.t();
                acdt acdtVar3 = (acdt) abnpVarN.b;
                acdtVar3.b |= 4;
                acdtVar3.e = z;
                int iAF = a.aF(zkfVar.d);
                if (iAF == 0) {
                    iAF = 1;
                }
                int i6 = iAF - 1;
                if (i6 == 1) {
                    i = 2;
                } else if (i6 == 2) {
                    i = 3;
                } else if (i6 == 3) {
                    i = 4;
                } else if (i6 != 4) {
                    if (i6 != 5) {
                        i = 12;
                        if (i6 != 11) {
                            i = i6 != 12 ? 1 : 13;
                        }
                    } else {
                        i = 6;
                    }
                }
                abnpVarN.t();
                acdt acdtVar4 = (acdt) abnpVarN.b;
                acdtVar4.f = i - 1;
                acdtVar4.b |= 8;
                return (acdt) abnpVarN.q();
            case 16:
                qii qiiVar = (qii) obj;
                int i7 = ((qik) ((qij) this.a).d).k;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0 || i8 == 1) {
                    return qiiVar.c;
                }
                if (i8 == 2) {
                    return "";
                }
                throw new RuntimeException(null, null);
            case 17:
                return this.a.remove((String) obj);
            case 18:
                return ((urq) obj).a((rjg) this.a);
            default:
                return new uzz(this.a);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
