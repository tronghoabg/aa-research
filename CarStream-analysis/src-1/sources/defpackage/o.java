package defpackage;

import android.view.View;
import com.carstream.tech.phone.ActivateActivity;
import org.json.JSONException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivateActivity b;

    public /* synthetic */ o(ActivateActivity activateActivity, int i) {
        this.a = i;
        this.b = activateActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.a) {
            case 0:
                this.b.submit();
                break;
            default:
                this.b.openBuyPage();
                break;
        }
    }
}
