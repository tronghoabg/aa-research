package defpackage;

import android.content.ComponentName;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class sha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public sha(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.c = view;
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.d;
        byte[] bArr = null;
        if (i == 0) {
            Object obj = this.b;
            shi shiVar = (shi) obj;
            shiVar.e();
            shh shhVar = shiVar.i;
            woy.aa(!shhVar.d, "Handoff already initiated");
            woy.aa(shhVar.a, "StartupService is not bound");
            ComponentName componentName = shhVar.e;
            componentName.getClass();
            rwv rwvVar = shhVar.f;
            rwvVar.getClass();
            Object obj2 = this.c;
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.car.extra.EXTRA_CONNECTION_HANDOFF_COMPONENT", componentName);
                ols.K(((shi) obj).b, "com.google.android.gms.car.CONNECTION_HANDOFF", rrx.a.ordinal(), bundle);
                shhVar.d = true;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ((Bundle) obj2).getParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR");
                int i2 = this.a;
                woy.O(i2 == 2 || parcelFileDescriptor != null, "File descriptor must not be null except for wifi connections");
                yop yopVarAi = shi.a.f().ai(8967);
                long j = ((shi) obj).c;
                yopVarAi.F("Handing off session %d (%d)", j, i2);
                rwvVar.d(j, i2, (Bundle) obj2, shhVar.c);
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            } catch (RemoteException e) {
                ols.K(shiVar.b, "com.google.android.gms.car.CONNECTION_HANDOFF", rrx.c.ordinal(), null);
                shi.a.g().p(e).ai(8969).u("Connection handoff failed due to RemoteException, exiting");
                throw new RuntimeException(e);
            }
        }
        if (i != 1) {
            ((BottomSheetBehavior) this.b).X((View) this.c, this.a, false);
            return;
        }
        ima imaVar = (ima) this.b;
        if (!imaVar.s) {
            ((ype) ((ype) ima.b.f()).ai((char) 311)).u("Delaying day/night mode update because projection has not started.");
            if (ecw.i()) {
                imaVar.t.set(true);
                return;
            }
            return;
        }
        iob iobVarN = imaVar.n();
        jff jffVar = imaVar.u.v;
        jffVar.getClass();
        ynp ynpVarListIterator = ((yfq) imaVar.W().values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            int i3 = this.a;
            Object obj3 = this.c;
            iuu iuuVar = (iuu) ynpVarListIterator.next();
            CarDisplayId carDisplayId = iuuVar.j;
            Configuration configurationA = jffVar.a(carDisplayId, (Configuration) obj3);
            if (iobVarN != null) {
                iobVarN.B(carDisplayId, configurationA, i3);
            }
            jkk jkkVar = iuuVar.p;
            if (jkkVar != null) {
                ina inaVar = (ina) jkkVar;
                inaVar.E = (configurationA.uiMode & 48) == 32;
                ((ype) ((ype) ina.a.f()).ai((char) 552)).y("Updating video configuration. isNightMode: %s", Boolean.valueOf(inaVar.E));
                synchronized (inaVar.ab) {
                    Iterator it = ((ina) jkkVar).ac.iterator();
                    while (it.hasNext()) {
                        ((jgt) it.next()).p(configurationA, i3);
                    }
                    if (((ina) jkkVar).ao) {
                        Iterator it2 = ((ina) jkkVar).ad.iterator();
                        while (it2.hasNext()) {
                            ((jgt) it2.next()).p(configurationA, i3);
                        }
                    }
                }
                rbe.g(Looper.getMainLooper(), new ne(jkkVar, 20, bArr));
            }
        }
    }

    public /* synthetic */ sha(ima imaVar, Configuration configuration, int i, int i2) {
        this.d = i2;
        this.b = imaVar;
        this.c = configuration;
        this.a = i;
    }

    public /* synthetic */ sha(shi shiVar, int i, Bundle bundle, int i2) {
        this.d = i2;
        this.b = shiVar;
        this.a = i;
        this.c = bundle;
    }
}
