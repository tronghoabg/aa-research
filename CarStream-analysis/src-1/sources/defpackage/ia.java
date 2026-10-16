package defpackage;

import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ia implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;
    public final /* synthetic */ qa c;

    public /* synthetic */ ia(qa qaVar, dd ddVar, int i) {
        this.a = i;
        this.c = qaVar;
        this.b = ddVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((l6) this.c.b).a(this.b, true);
                break;
            default:
                ((l6) this.c.b).a(this.b, false);
                break;
        }
    }
}
