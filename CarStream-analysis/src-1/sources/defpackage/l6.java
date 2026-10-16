package defpackage;

import android.content.Intent;
import android.widget.Toast;
import com.carstream.tech.apps.auth.LoginActivity;
import com.carstream.tech.phone.ActivateActivity;
import com.carstream.tech.phone.MainActivity;
import org.json.JSONException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l6 implements v6, x6, pa, h8, y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ l6(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    public void a(dd ddVar, boolean z) {
        MainActivity mainActivity = this.b;
        if (z) {
            mainActivity.confirm(ad.d("Đăng xuất ", ddVar.b, "?"), "Phiên đăng nhập trên màn hình xe sẽ mất. Đăng nhập lại phải gõ tài khoản và mật khẩu.", "Đăng xuất", new h(10, this, ddVar));
        } else {
            mainActivity.startActivity(LoginActivity.intentFor(mainActivity, ddVar));
        }
    }

    @Override // defpackage.y5
    public void c(z5 z5Var) throws JSONException {
        switch (this.a) {
            case 4:
                this.b.goMayThat();
                break;
            default:
                boolean z = z5Var.a;
                String str = z5Var.b;
                MainActivity mainActivity = this.b;
                if (!z && !"hwid_mismatch".equals(str)) {
                    Toast.makeText(mainActivity, "unbind_limit_reached".equals(str) ? "Đã đổi máy 2 lần trong năm nay. Nhắn hỗ trợ để được gỡ." : "unbind_stale_token".equals(str) ? "Chưa gỡ được. Kiểm tra mạng rồi thử lại sau vài phút." : "Chưa gỡ được máy — kiểm tra mạng rồi thử lại.", 1).show();
                    break;
                } else {
                    xc.p(mainActivity, "licenseToken", "");
                    xc.p(mainActivity, "licenseKey", "");
                    xc.p(mainActivity, "scriptKey", "");
                    xc.p(mainActivity, "launcherKey", "");
                    z6.j();
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) ActivateActivity.class));
                    mainActivity.finish();
                    break;
                }
        }
    }
}
