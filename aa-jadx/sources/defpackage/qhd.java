package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qhd extends defpackage.qhf {
    @Override // defpackage.qhf
    public final void E(com.google.android.apps.auto.sdk.SearchItem searchItem, android.content.Context context, android.content.Context context2) {
        android.graphics.Bitmap bitmap = searchItem.g;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.s;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        } else {
            int i = searchItem.f;
            if (i != 0) {
                android.widget.ImageView imageView2 = this.s;
                imageView2.setImageDrawable(defpackage.qga.a(context, i));
                imageView2.setVisibility(0);
            } else {
                android.widget.ImageView imageView3 = this.s;
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
