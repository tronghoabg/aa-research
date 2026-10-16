package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class iml implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iml(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 0;
        switch (this.b) {
            case 0:
                SparseArray sparseArray = ((ina) this.a).S;
                int size = sparseArray.size();
                SparseArray sparseArray2 = new SparseArray(size);
                while (i < size) {
                    List list = (List) sparseArray.valueAt(i);
                    sparseArray2.put(sparseArray.keyAt(i), list != null ? new ArrayList(list) : new ArrayList());
                    i++;
                }
                return sparseArray2;
            case 1:
                ina inaVar = (ina) this.a;
                jiv jivVar = (jiv) inaVar.aq;
                jhc jhcVar = inaVar.w;
                jhcVar.getClass();
                ArrayList arrayList = new ArrayList();
                int i2 = jhcVar.b;
                iuw iuwVar = jhcVar.a;
                Rect rect = iuwVar.n;
                int iK = afgi.k(dlz.F(100, iuwVar.i));
                int i3 = rect.left + i2 + iK;
                int i4 = jhcVar.c + rect.bottom + iK;
                int i5 = (((iuwVar.e + i2) - rect.right) - 1) - iK;
                int i6 = iuwVar.c;
                int i7 = (((i6 - iuwVar.h) - rect.top) - 1) - iK;
                while (true) {
                    int i8 = i7 - i4;
                    int i9 = i5 - i3;
                    if (i >= 20) {
                        arrayList.add(jivVar.a(iuwVar.b, i6, i3 + (i9 / 2), i4 + (i8 / 2)));
                        return arrayList;
                    }
                    arrayList.add(jivVar.a(iuwVar.b, i6, (int) ((Math.random() * i9) + i3), (int) (i4 + (Math.random() * i8))));
                    i++;
                    i4 = i4;
                }
            case 2:
                qrg qrgVar = (qrg) this.a;
                String str = qrgVar.j;
                if (str != null) {
                    return str;
                }
                Optional optionalOfNullable = Optional.ofNullable(qrgVar.k);
                if (true == optionalOfNullable.isPresent() && ((CarBluetoothData) optionalOfNullable.get()).b()) {
                    optionalOfNullable = Optional.empty();
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((CarBluetoothData) optionalOfNullable.get()).a());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((BluetoothDevice) optionalOfNullable.get()).getAddress());
                }
                return (String) optionalOfNullable.orElse(null);
            case 3:
                return ((qrg) this.a).j;
            case 4:
                rla rlaVar = rla.i;
                boolean z = ((Context) this.a).getSharedPreferences("action_developer_settings", 0).getBoolean("failure_injection_enabled", false);
                if (z) {
                    rla.i = new koo();
                }
                return Boolean.valueOf(z);
            case 5:
                ((ynz) ((ynz) vlj.a.e()).ai((char) 9745)).u("DeferrableExecutor unblocked after max task delay");
                ((vkx) this.a).g();
                return null;
            case 6:
                ((ynz) ((ynz) vlj.a.e()).ai((char) 9746)).u("DeferrableExecutor unblocked after onResume");
                ((vkx) this.a).g();
                return null;
            default:
                Object obj = this.a;
                synchronized (((wgw) obj).b.d) {
                    ((wgw) obj).a = null;
                }
                return null;
        }
    }
}
