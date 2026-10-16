package defpackage;

import com.google.android.gms.car.CarSensorEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class ljl implements qse, lis {
    public static final /* synthetic */ int e = 0;
    private static final yph f = yph.c("GH.UnlimitedPrvdr");
    public final List a = new CopyOnWriteArrayList();
    public boolean b;
    public boolean c;
    public final roj d;
    private boolean g;
    private lir h;

    public ljl(roj rojVar) {
        this.d = rojVar;
        if (rojVar != null) {
            try {
                rojVar.f(this, 11, 0);
                qsf qsfVarA = rojVar.a(11);
                d(qsfVarA.a, qsfVarA.b, qsfVarA.c, qsfVarA.d);
            } catch (qrz unused) {
                ((ype) ((ype) f.h()).ai((char) 3978)).u("Unable to register sensor listener");
            }
        }
    }

    private final void c() {
        lir lirVar = this.h;
        boolean z = true;
        if (lirVar != lir.b && lirVar != lir.c) {
            z = false;
        }
        if (this.d != null) {
            z &= this.g;
        }
        if (this.b != z) {
            this.b = z;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((lit) it.next()).a(this.b);
            }
        }
    }

    @Override // defpackage.lis
    public final void a(lir lirVar) {
        this.h = lirVar;
        c();
    }

    @Override // defpackage.lis
    public final void b(Float f2) {
        if (f2 == null || f2.floatValue() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.c = true;
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        int length = fArr.length;
        int length2 = bArr.length;
        CarSensorEvent carSensorEvent = new CarSensorEvent(i, j, length, length2);
        System.arraycopy(fArr, 0, carSensorEvent.d, 0, length);
        System.arraycopy(bArr, 0, carSensorEvent.e, 0, length2);
        this.g = (carSensorEvent.g().a & 2) == 0;
        c();
    }
}
