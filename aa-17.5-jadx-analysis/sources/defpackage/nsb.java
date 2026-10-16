package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplayNativeUiElement;
import j$.util.function.Function$CC;
import java.util.AbstractMap;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class nsb implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ nsb(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws NumberFormatException {
        switch (this.a) {
            case 0:
                yph yphVar = nso.a;
                return ((CarDisplayNativeUiElement) obj).a;
            case 1:
                return ((nfp) obj).i;
            case 2:
                yph yphVar2 = nso.a;
                return ((CarDisplayNativeUiElement) obj).a;
            case 3:
                yph yphVar3 = nso.a;
                return ((CarDisplayNativeUiElement) obj).a;
            case 4:
                yph yphVar4 = nso.a;
                return ((CarDisplayNativeUiElement) obj).a;
            case 5:
                return ((nxq) obj).a;
            case 6:
                int i = ofc.b;
                List listI = xxx.c(':').i((String) obj);
                String str = (String) listI.get(0);
                String str2 = (String) listI.get(1);
                str.getClass();
                str2.getClass();
                return new AbstractMap.SimpleImmutableEntry(str, str2);
            case 7:
                return ((mqc) obj).a;
            case 8:
                return ((mqb) obj).a;
            case 9:
                return ((ComponentName) obj).getPackageName();
            case 10:
                return Integer.valueOf(((ojn) obj).q() - 3);
            case 11:
                return ((BluetoothDevice) obj).getAddress();
            case 12:
                return ag$$ExternalSyntheticApiModelOutline0.m67m(obj).getDeviceMacAddress();
            case 13:
                yph yphVar5 = oyw.a;
                return (ParcelUuid) ((Parcelable) obj);
            case 14:
                yph yphVar6 = pcj.a;
                String[] strArrSplit = ((String) obj).split(":", 2);
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(strArrSplit[0]);
                if (componentNameUnflattenFromString == null) {
                    ((ype) ((ype) pcj.a.g()).ai(6302)).y("Failed to unflatten component name: %s", strArrSplit[0]);
                    return null;
                }
                try {
                    long j = 0;
                    if (strArrSplit.length > 1 && !strArrSplit[1].isEmpty()) {
                        j = Long.parseLong(strArrSplit[1]);
                    }
                    return new AbstractMap.SimpleImmutableEntry(componentNameUnflattenFromString, Long.valueOf(j));
                } catch (NumberFormatException unused) {
                    ((ype) ((ype) pcj.a.g()).ai(6301)).y("Failed to parse value as long: %s", strArrSplit[1]);
                    return null;
                }
            case 15:
                yph yphVar7 = pdh.a;
                ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) obj).getSystemService(ConnectivityManager.class);
                connectivityManager.getClass();
                return koo.n() ? new pci(connectivityManager) : new pby(connectivityManager);
            case 16:
                return ((pgk) obj).a;
            case 17:
                return ((pwd) obj).a();
            case 18:
                throw null;
            case 19:
                return ((our) obj).name();
            default:
                return ((mqc) obj).a();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
