package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qhg extends defpackage.qhf {
    @Override // defpackage.qhf
    public final void E(com.google.android.apps.auto.sdk.SearchItem searchItem, android.content.Context context, android.content.Context context2) {
        this.t.setText(searchItem.b);
        android.graphics.drawable.Drawable drawable = context2.getDrawable(2131233581);
        drawable.setTint(context2.getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_tint));
        android.widget.ImageView imageView = this.s;
        if (drawable == null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }
}
