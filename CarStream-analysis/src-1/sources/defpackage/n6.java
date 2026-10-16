package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class n6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n6(Object obj, Object obj2, Dialog dialog, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                try {
                    ((MainActivity) this.d).startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) this.c)));
                } catch (Exception unused) {
                }
                this.b.dismiss();
                break;
            default:
                qa qaVar = (qa) this.d;
                String string = ((EditText) this.c).getText().toString();
                xc.p(qaVar.a, "wazePkg", string == null ? "" : string.trim());
                w7.e();
                qaVar.d();
                qaVar.c();
                this.b.dismiss();
                break;
        }
    }
}
