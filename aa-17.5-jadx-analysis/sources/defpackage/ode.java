package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.auto.components.system.transcription.TranscriptionFragment;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class ode implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public ode(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i2) {
        this.f = i2;
        this.a = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.b = arrayList4;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, pah] */
    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        int i = this.f;
        if (i == 0) {
            odg odgVar = ((odf) this.b).a;
            TranscriptionFragment transcriptionFragmentA = odgVar.a();
            if (transcriptionFragmentA == null) {
                odgVar.b();
                return;
            }
            Object obj = this.e;
            Object obj2 = this.d;
            transcriptionFragmentA.a((String) this.c, this.a, (Bitmap) obj2, (String) obj);
            return;
        }
        if (i == 1) {
            for (int i2 = 0; i2 < this.a; i2++) {
                View view = (View) ((ArrayList) this.c).get(i2);
                String str = (String) ((ArrayList) this.d).get(i2);
                int[] iArr = ebm.a;
                view.setTransitionName(str);
                ((View) ((ArrayList) this.e).get(i2)).setTransitionName((String) ((ArrayList) this.b).get(i2));
            }
            return;
        }
        if (i == 2) {
            pgr pgrVar = (pgr) this.c;
            int i3 = pgrVar.u;
            int i4 = pgrVar.v;
            Object obj3 = this.d;
            this.b.a((String) this.e, this.a, (WifiInfo) obj3, i3, i4);
            return;
        }
        if (i != 3) {
            CarRegionId carRegionId = new CarRegionId(0, new CarDisplayId(this.a));
            SparseArray sparseArray = rnw.a;
            Object obj4 = this.b;
            Object obj5 = this.d;
            ((rnw) this.e).p(carRegionId, (DrawingSpec) this.c, (Intent) obj5, null, (Bundle) obj4);
            return;
        }
        Object obj6 = this.c;
        qcw qcwVar = new qcw(this.a, (Bundle) this.d, (qcz) obj6);
        qcx qcxVar = (qcx) this.b;
        qcxVar.j.add(qcwVar);
        qcxVar.c();
        qcxVar.b.execute(new prm(qcxVar, this.e, (Object) qcwVar, 4));
        qcxVar.l.add(qcwVar);
        qcxVar.m.add(qcwVar);
        qcxVar.k();
        qcxVar.b();
    }

    public /* synthetic */ ode(odf odfVar, String str, int i, Bitmap bitmap, String str2, int i2) {
        this.f = i2;
        this.b = odfVar;
        this.c = str;
        this.a = i;
        this.d = bitmap;
        this.e = str2;
    }

    public /* synthetic */ ode(pgr pgrVar, pah pahVar, String str, int i, WifiInfo wifiInfo, int i2) {
        this.f = i2;
        this.c = pgrVar;
        this.b = pahVar;
        this.e = str;
        this.a = i;
        this.d = wifiInfo;
    }

    public /* synthetic */ ode(qcx qcxVar, int i, Bundle bundle, qcz qczVar, Object obj, int i2) {
        this.f = i2;
        this.b = qcxVar;
        this.a = i;
        this.d = bundle;
        this.c = qczVar;
        this.e = obj;
    }

    public /* synthetic */ ode(rnw rnwVar, int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle, int i2) {
        this.f = i2;
        this.e = rnwVar;
        this.a = i;
        this.c = drawingSpec;
        this.d = intent;
        this.b = bundle;
    }
}
