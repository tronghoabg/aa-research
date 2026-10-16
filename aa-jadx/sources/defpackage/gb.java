package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gb implements android.text.method.TransformationMethod {
    private final java.util.Locale a;

    public gb(android.content.Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString().toUpperCase(this.a);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z, int i, android.graphics.Rect rect) {
    }
}
