package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.auto.sdk.SearchItem;

/* loaded from: classes2.dex */
final class qgi extends qgk {
    @Override // defpackage.qgk
    public final void E(SearchItem searchItem, Context context, Context context2) {
        Bitmap bitmap = searchItem.g;
        if (bitmap != null) {
            ImageView imageView = this.s;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        } else {
            int i = searchItem.f;
            if (i != 0) {
                ImageView imageView2 = this.s;
                imageView2.setImageDrawable(qff.a(context, i));
                imageView2.setVisibility(0);
            } else {
                ImageView imageView3 = this.s;
                imageView3.setImageDrawable(null);
                imageView3.setVisibility(8);
            }
        }
        F(this.t, searchItem.b);
        F(this.u, searchItem.c);
        F(this.w, searchItem.d);
        F(this.x, searchItem.e);
        if (searchItem.d == null && searchItem.e == null) {
            this.v.setVisibility(8);
        } else {
            this.v.setVisibility(0);
        }
    }
}
