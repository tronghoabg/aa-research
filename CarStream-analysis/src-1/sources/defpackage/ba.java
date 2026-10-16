package defpackage;

import android.view.View;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ba implements View.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ea c;
    public final /* synthetic */ fa d;

    public ba(fa faVar, String str, boolean z, ea eaVar) {
        this.d = faVar;
        this.a = str;
        this.b = z;
        this.c = eaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fa faVar = this.d;
        CarScreen carScreen = faVar.a;
        boolean z = this.b;
        String str = this.a;
        boolean z2 = !xc.e(carScreen, str, z);
        xc.m(carScreen, str, z2);
        ea eaVar = this.c;
        if (z2 != eaVar.c) {
            eaVar.c = z2;
            eaVar.invalidate();
        }
        e eVar = faVar.c;
        if (eVar != null) {
            eVar.o();
        }
    }
}
