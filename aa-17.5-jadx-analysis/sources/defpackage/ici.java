package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class ici implements huo {
    public static final hul a = new hul("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, hul.a);
    private final Context b;

    public ici(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ hwx a(Object obj, int i, int i2, hum humVar) throws IOException {
        return c((Uri) obj, humVar);
    }

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final hwx c(Uri uri, hum humVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException(a.bV(uri, "Package name for ", " is null or empty"));
        }
        Context contextCreatePackageContext = this.b;
        if (!authority.equals(contextCreatePackageContext.getPackageName())) {
            try {
                contextCreatePackageContext = contextCreatePackageContext.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                Context context = this.b;
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        }
        a.al(authority, "Argument must not be null");
        Context context2 = this.b;
        Resources.Theme theme = authority.equals(context2.getPackageName()) ? (Resources.Theme) humVar.b(a) : null;
        return ich.g(theme == null ? ice.a(context2, contextCreatePackageContext, identifier, null) : ice.a(context2, context2, identifier, theme));
    }
}
