package defpackage;

import android.webkit.CookieManager;
import android.webkit.WebStorage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class i4 extends z2 {
    public static final String[] e = {"NUMBER_PR", "TYPE_PR", "PROFILE_MATURITY"};
    public static final String[] f = {"https://fptplay.vn", "https://fptplay.vn/"};

    @Override // defpackage.z2
    public final boolean j() {
        for (String str : (String[]) this.d) {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (cookie != null) {
                for (String str2 : cookie.split(";")) {
                    int iIndexOf = str2.indexOf(61);
                    if (iIndexOf > 0) {
                        String strTrim = str2.substring(0, iIndexOf).trim();
                        for (int i = 0; i < 3; i++) {
                            if (e[i].equals(strTrim)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.z2
    public final String k() {
        return "(function(){var n=40;function t(){var h=document.querySelector('header');if(h){var d=h.querySelectorAll('button,a');for(var i=0;i<d.length;i++){var c=(d[i].textContent||d[i].getAttribute('aria-label')||'');if(/Đăng nhập|Đăng ký/.test(c)){d[i].click();return;}}}if(--n>0){setTimeout(t,250);}}t();})();";
    }

    @Override // defpackage.z2
    public final void l(f fVar) {
        WebStorage webStorage = WebStorage.getInstance();
        for (int i = 0; i < 2; i++) {
            try {
                webStorage.deleteOrigin(f[i]);
            } catch (Throwable unused) {
            }
        }
        super.l(fVar);
    }
}
