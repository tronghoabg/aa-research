package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.carstream.tech.phone.MainActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ja implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qa c;

    public /* synthetic */ ja(qa qaVar, String str, int i) {
        this.a = i;
        this.c = qaVar;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qa qaVar = this.c;
                MainActivity mainActivity = qaVar.a;
                ArrayList arrayListZ = w1.z(mainActivity);
                arrayListZ.remove(this.b);
                w1.u(mainActivity, arrayListZ);
                w1.t(mainActivity, new c1(this, 8));
                qaVar.c();
                break;
            default:
                String str = this.b;
                MainActivity mainActivity2 = this.c.a;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) mainActivity2.getSystemService("clipboard");
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("ver", str));
                        Toast.makeText(mainActivity2, "Đã chép: " + str, 0).show();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
