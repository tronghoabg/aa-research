package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class j8 implements View.OnClickListener {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ImageView c;
    public final /* synthetic */ ma d;

    public j8(LinearLayout linearLayout, View view, ImageView imageView, ma maVar) {
        this.a = linearLayout;
        this.b = view;
        this.c = imageView;
        this.d = maVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout = this.a;
        boolean z = linearLayout.getVisibility() != 0;
        linearLayout.setVisibility(z ? 0 : 8);
        this.b.setVisibility(z ? 0 : 8);
        this.c.animate().rotation(z ? 180.0f : 0.0f).setDuration(160L).start();
        this.d.a(z);
    }
}
