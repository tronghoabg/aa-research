package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gqx extends afde implements afeh {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqx(afck afckVar, int i) {
        super(3, afckVar);
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        boolean z;
        int i = this.c;
        if (i == 0) {
            woy.dF(obj);
            long j = ((PlaybackStateCompat) this.a).e & 256;
            Object obj2 = this.b;
            if (j != 0 && !((Duration) obj2).isNegative()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i == 1) {
            woy.dF(obj);
            Object obj3 = this.a;
            long millis = ((Duration) this.b).toMillis();
            long millis2 = ((Duration) obj3).toMillis();
            float fD = BitmapDescriptorFactory.HUE_RED;
            if (millis != 0) {
                fD = afpt.d(millis2 / millis, BitmapDescriptorFactory.HUE_RED, 1.0f);
            }
            return new Float(fD);
        }
        woy.dF(obj);
        ?? r10 = this.a;
        Object obj4 = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : r10) {
            if (obj5 instanceof fwm) {
                arrayList.add(obj5);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fxo fxoVar = ((fwm) it.next()).b;
                fwy fwyVar = fxoVar instanceof fwy ? (fwy) fxoVar : null;
                if ((fwyVar != null ? fwyVar.c : null) instanceof gap) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(obj4 == gbk.a || !z);
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        if (i == 0) {
            gqx gqxVar = new gqx((afck) obj3, 0);
            gqxVar.a = (PlaybackStateCompat) obj;
            gqxVar.b = (Duration) obj2;
            return gqxVar.hT(afak.a);
        }
        if (i != 1) {
            gqx gqxVar2 = new gqx((afck) obj3, 2, (char[]) null);
            gqxVar2.a = (List) obj;
            gqxVar2.b = (gbk) obj2;
            return gqxVar2.hT(afak.a);
        }
        gqx gqxVar3 = new gqx((afck) obj3, 1, (byte[]) null);
        gqxVar3.a = (Duration) obj;
        gqxVar3.b = (Duration) obj2;
        return gqxVar3.hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqx(afck afckVar, int i, byte[] bArr) {
        super(3, afckVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqx(afck afckVar, int i, char[] cArr) {
        super(3, afckVar);
        this.c = i;
    }
}
