package defpackage;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.carstream.tech.phone.MainActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ka implements View.OnClickListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ qa e;

    public ka(qa qaVar, EditText editText, Dialog dialog, TextView textView, TextView textView2) {
        this.e = qaVar;
        this.a = editText;
        this.b = dialog;
        this.c = textView;
        this.d = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.e.a;
        String strTrim = this.a.getText().toString().trim();
        if (strTrim.isEmpty()) {
            this.b.dismiss();
            return;
        }
        String strTrim2 = strTrim.trim();
        boolean zIsEmpty = strTrim2.isEmpty();
        TextView textView = this.c;
        if (!zIsEmpty) {
            ArrayList arrayListZ = w1.z(mainActivity);
            if (!arrayListZ.contains(strTrim2)) {
                arrayListZ.add(strTrim2);
                w1.u(mainActivity, arrayListZ);
                this.d.setText("Đang tải…");
                textView.setText("Đang tải danh sách…");
                w1.t(mainActivity, new c1(this, 9));
                return;
            }
        }
        textView.setText("Nguồn này đã có trong danh sách.");
    }
}
