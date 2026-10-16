package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wzq extends android.os.AsyncTask {
    android.widget.Button a;
    final /* synthetic */ defpackage.lgv b;

    public wzq(defpackage.lgv lgvVar) {
        this.b = lgvVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        this.a = ((android.widget.Button[]) objArr)[0];
        return java.lang.Boolean.valueOf(this.b.g());
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.b.f(false);
            this.a.setText(com.google.android.projection.gearhead.R.string.companion_handwriting_input_finished);
        } else {
            this.a.setText(com.google.android.projection.gearhead.R.string.companion_handwriting_input_retry);
            this.a.setEnabled(true);
        }
    }
}
