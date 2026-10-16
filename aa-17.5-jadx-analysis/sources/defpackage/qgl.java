package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.auto.sdk.SearchItem;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class qgl extends qgk {
    @Override // defpackage.qgk
    public final void E(SearchItem searchItem, Context context, Context context2) {
        this.t.setText(searchItem.b);
        Drawable drawable = context2.getDrawable(2131233581);
        drawable.setTint(context2.getColor(R.color.gearhead_sdk_tint));
        ImageView imageView = this.s;
        if (drawable == null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }
}
