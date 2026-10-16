package defpackage;

import android.app.Activity;
import com.carstream.tech.box.BoxActivity;
import com.carstream.tech.phone.ActivateActivity;
import com.carstream.tech.phone.MainActivity;
import com.carstream.tech.phone.ModeActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l implements t6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ l(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // defpackage.t6
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                ((ActivateActivity) this.b).runOnUiThread(new f(this, z));
                break;
            case 1:
                if (z) {
                    ((BoxActivity) this.b).runOnUiThread(new f(this, 7));
                    break;
                }
                break;
            case 2:
                if (!z) {
                    ((MainActivity) this.b).runOnUiThread(new f(this, 27));
                    break;
                }
                break;
            default:
                if (z) {
                    ((ModeActivity) this.b).runOnUiThread(new f(this, 29));
                    break;
                }
                break;
        }
    }
}
