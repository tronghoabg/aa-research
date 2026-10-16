package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xfk extends defpackage.qrd {
    @Override // defpackage.qrd
    public final void a(android.os.Bundle bundle) {
        v(com.google.android.projection.gearhead.R.layout.placeholder);
        java.lang.String stringExtra = q().getStringExtra("placeholder_text");
        if (stringExtra != null) {
            ((android.widget.TextView) B(com.google.android.projection.gearhead.R.id.placeholder_text)).setText(getString(com.google.android.projection.gearhead.R.string.placeholder_text, new java.lang.Object[]{stringExtra}));
        }
        int intExtra = q().getIntExtra("placeholder_image", 0);
        if (intExtra != 0) {
            ((android.widget.ImageView) B(com.google.android.projection.gearhead.R.id.placeholder_image)).setImageDrawable(getResources().getDrawable(intExtra));
        }
    }
}
