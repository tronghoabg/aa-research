package defpackage;

import android.bluetooth.BluetoothDevice;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class qat implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qat(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((qaj) this.a).j((zau) obj);
            return;
        }
        if (i == 1) {
            for (pii piiVar : (Set) obj) {
                if (!piiVar.b.isEmpty()) {
                    int iAz = a.az(piiVar.c);
                    if (iAz == 0) {
                        iAz = 1;
                    }
                    ((yfu) this.a).e(Integer.valueOf(aclh.c(iAz)), piiVar.b);
                }
            }
            return;
        }
        if (i == 2) {
            ((qrg) this.a).p(((BluetoothDevice) obj).getAddress());
            return;
        }
        if (i == 3) {
            ((ums) ((tzz) this.a).a.a()).q((trl) obj);
            return;
        }
        if (i == 4) {
            ((ums) ((tzz) this.a).a.a()).s((trl) obj);
        } else if (i == 5) {
            ((tun) this.a).d((tuk) obj);
        } else {
            boolean z = ((okx) obj).d;
            xbo xboVar = (xbo) this.a;
            xboVar.u(new xbi(xboVar, z));
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
