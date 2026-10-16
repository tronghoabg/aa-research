package defpackage;

import android.view.View;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class da implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fa c;

    public /* synthetic */ da(fa faVar, String str, int i) {
        this.a = i;
        this.c = faVar;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fa faVar = this.c;
                xc.p(faVar.a, "hudText", this.b);
                faVar.f();
                e eVar = faVar.c;
                if (eVar != null) {
                    eVar.o();
                    break;
                }
                break;
            default:
                fa faVar2 = this.c;
                xc.p(faVar2.a, "toolbarMode", this.b);
                faVar2.e();
                e eVar2 = faVar2.c;
                if (eVar2 != null) {
                    eVar2.o();
                    break;
                }
                break;
        }
    }
}
