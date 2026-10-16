package defpackage;

import android.os.AsyncTask;
import android.widget.Button;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wyu extends AsyncTask {
    Button a;
    final /* synthetic */ lgp b;

    public wyu(lgp lgpVar) {
        this.b = lgpVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.a = ((Button[]) objArr)[0];
        return Boolean.valueOf(this.b.g());
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.b.f(false);
            this.a.setText(R.string.companion_handwriting_input_finished);
        } else {
            this.a.setText(R.string.companion_handwriting_input_retry);
            this.a.setEnabled(true);
        }
    }
}
