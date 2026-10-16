package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.phone.ActivateActivity;
import org.json.JSONException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class n implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) throws JSONException {
        switch (this.a) {
            case 0:
                ((ActivateActivity) this.b).submit();
                break;
            case 1:
                ((CarScreen) this.b).moDiaChi(textView.getText().toString());
                break;
            default:
                w9 w9Var = (w9) this.b;
                String strTrim = w9Var.g.getText().toString().trim();
                if (!strTrim.isEmpty()) {
                    w9Var.b.a.h(strTrim);
                    break;
                }
                break;
        }
        return true;
    }
}
