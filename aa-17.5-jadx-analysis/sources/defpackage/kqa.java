package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import androidx.car.app.model.Action;
import androidx.car.app.model.Alert;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class kqa implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kqa(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ackk ackkVar;
        int i = this.c;
        int i2 = 1;
        int i3 = 4;
        if (i == 0) {
            yfq yfqVar = (yfq) obj;
            yfl yflVar = new yfl(4);
            Stream stream = Collection.EL.stream(yfqVar);
            ?? r5 = this.b;
            Stream streamFilter = stream.filter(new koh(r5, i3));
            int i4 = yfq.d;
            Collector collector = ycm.a;
            yfq yfqVar2 = (yfq) streamFilter.collect(collector);
            yfq yfqVar3 = yfqVar2.isEmpty() ? r5 : (yfq) Collection.EL.stream(r5).map(new gjm(yfqVar2, 14)).collect(collector);
            Object obj2 = this.a;
            yflVar.k(yfqVar3);
            yflVar.k((yfq) Collection.EL.stream(yfqVar).filter(new koh(r5, 6)).collect(collector));
            yfq yfqVar4 = (yfq) Collection.EL.stream(yflVar.g()).filter(new kxo(i2)).collect(collector);
            eqj eqjVar = (eqj) obj2;
            Optional optional = (Optional) eqjVar.e();
            if (optional == null || optional.isEmpty()) {
                if (yfqVar4 == null) {
                    return;
                }
            } else if (optional.get().equals(yfqVar4)) {
                return;
            }
            eqjVar.q(yfqVar4);
            return;
        }
        if (i == 1) {
            ype ypeVar = (ype) ((ype) jym.a.f()).ai(2840);
            int id = ((Alert) obj).getId();
            Action action = (Action) this.a;
            ypeVar.B("Alert %s Action %s Tapped", id, action.hashCode());
            uq onClickDelegate = action.getOnClickDelegate();
            if (onClickDelegate != null) {
                ((jwq) ((jyo) this.b).d.c).g.h(onClickDelegate);
                return;
            }
            return;
        }
        if (i == 2) {
            BluetoothAdapter bluetoothAdapter = ((kxr) this.a).c;
            bluetoothAdapter.getClass();
            ((ygp) this.b).c(bluetoothAdapter.getRemoteDevice(((BluetoothDevice) obj).getAddress()));
            return;
        }
        if (i == 3) {
            CharSequence charSequenceF = ((lpt) obj).f(((lpz) this.a).b);
            charSequenceF.getClass();
            this.b.add(charSequenceF.toString());
            return;
        }
        if (i == 4) {
            Object obj3 = this.a;
            wub.ah(((mjl) obj3).e.c.k((RadioProgramSelector) obj), new ikn(obj3, 9), zfq.a);
            return;
        }
        if (i != 5) {
            abgl abglVarB = abgl.b(((abgk) obj).c);
            if (abglVarB == null) {
                abglVarB = abgl.UNKNOWN;
            }
            this.b.put(abglVarB, this.a);
            return;
        }
        aceg acegVar = (aceg) obj;
        pqu pquVar = ((ppw) this.a).b;
        acef acefVarB = acef.b(acegVar.e);
        if (acefVarB == null) {
            acefVarB = acef.UNKNOWN_TYPE;
        }
        Object obj4 = this.b;
        if (acefVarB == acef.LOGGING && pquVar == pqu.b) {
            if (((acegVar.c == 18 ? (acdh) acegVar.d : acdh.a).b & 65536) == 0) {
                int i5 = (acegVar.c == 18 ? (acdh) acegVar.d : acdh.a).b;
            }
        }
        acef acefVarB2 = acef.b(acegVar.e);
        if (acefVarB2 == null) {
            acefVarB2 = acef.UNKNOWN_TYPE;
        }
        if (acefVarB2 != acef.PHENOTYPE_MIGRATION || (ackkVar = ((pqe) obj4).g) == null) {
            return;
        }
        ((ynz) ((ynz) pqe.a.f()).ai((char) 6822)).u("P/H: Syncing migration flags with updated parameters");
        pya pyaVar = (pya) ackkVar.a();
        if (acegVar.c == 249) {
        } else {
            aawk aawkVar = aawk.a;
        }
        pyaVar.b();
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ kqa(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
