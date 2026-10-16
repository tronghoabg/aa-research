package defpackage;

import android.view.View;
import com.carstream.tech.phone.ModeActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class s7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModeActivity b;

    public /* synthetic */ s7(ModeActivity modeActivity, int i) {
        this.a = i;
        this.b = modeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.vaoDienThoai();
                break;
            default:
                this.b.vaoBox("nguoi dung chon");
                break;
        }
    }
}
