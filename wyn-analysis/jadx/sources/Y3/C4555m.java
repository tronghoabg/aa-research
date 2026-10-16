package y3;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x3.AbstractC4467j;

/* renamed from: y3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4555m extends AbstractC4545c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f48004d;

    public C4555m() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f48004d = Pattern.compile("\\A\\d+");
    }

    @Override // y3.AbstractC4545c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // y3.AbstractC4545c
    public final boolean b() {
        int i5;
        PackageInfo packageInfoB;
        boolean zB = super.b();
        if (!zB || (i5 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        boolean z2 = AbstractC4467j.f47677a;
        if (i5 >= 26) {
            packageInfoB = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoB = AbstractC4467j.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoB = null;
            }
        }
        if (packageInfoB != null) {
            Matcher matcher = this.f48004d.matcher(packageInfoB.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoB.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
