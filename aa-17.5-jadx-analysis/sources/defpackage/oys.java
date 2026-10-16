package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.car.RadioProgramInfo;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class oys implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ oys(trd trdVar, Optional optional, BluetoothDevice bluetoothDevice, int i) {
        this.d = i;
        this.a = trdVar;
        this.b = optional;
        this.c = bluetoothDevice;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, zgp] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.d == 0) {
            yph yphVar = oyw.a;
            wub.ah(((trd) this.a).a, new oyu((oyo) obj, (Optional) this.b, (BluetoothDevice) this.c, 0), mki.a.d);
            return;
        }
        yph yphVar2 = mil.a;
        mih mihVar = (mih) ((yfy) this.b).get((Integer) obj);
        Object obj2 = this.c;
        if (mihVar != null) {
            ((yfr) this.a).b(mihVar, obj2);
        } else {
            ((ype) ((ype) mil.a.h()).ai(4979)).y("Band configuration for %s not found, dropping station.", ((RadioProgramInfo) obj2).a);
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.d != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ oys(yfy yfyVar, yfr yfrVar, RadioProgramInfo radioProgramInfo, int i) {
        this.d = i;
        this.b = yfyVar;
        this.a = yfrVar;
        this.c = radioProgramInfo;
    }
}
