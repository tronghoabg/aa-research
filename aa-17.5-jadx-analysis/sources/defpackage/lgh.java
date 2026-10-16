package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lgh implements View.OnLayoutChangeListener {
    final /* synthetic */ ImageView a;
    final /* synthetic */ boolean b;

    public lgh(ImageView imageView, boolean z) {
        this.a = imageView;
        this.b = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        Object tag = view.getTag(R.id.tag_gh_icon);
        GhIcon ghIcon = tag instanceof GhIcon ? (GhIcon) tag : null;
        ImageView imageView = this.a;
        lgi.e(imageView, ghIcon, imageView.getWidth(), this.b);
    }
}
