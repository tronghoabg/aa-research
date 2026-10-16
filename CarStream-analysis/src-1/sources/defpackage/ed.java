package defpackage;

import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ed implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;

    public /* synthetic */ ed(fd fdVar, int i) {
        this.a = i;
        this.b = fdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fd fdVar = this.b;
                fdVar.a.b.js("if(window.__cntWebEnter){window.__cntWebEnter();}");
                fdVar.a();
                break;
            case 1:
                fd fdVar2 = this.b;
                fdVar2.a();
                fdVar2.a.b.baoTrangTuVePhim();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
