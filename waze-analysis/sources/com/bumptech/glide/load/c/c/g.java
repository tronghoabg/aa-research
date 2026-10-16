package com.bumptech.glide.load.c.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.g.p;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.r;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.u;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3395a = r.b("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: b, reason: collision with root package name */
    private final Context f3396b;

    public g(Context context) {
        this.f3396b = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ aw a(Object obj, int i2, int i3, s sVar) {
        return c((Uri) obj, sVar);
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, s sVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final aw c(Uri uri, s sVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + String.valueOf(uri) + " is null or empty");
        }
        Context contextCreatePackageContext = this.f3396b;
        if (!authority.equals(contextCreatePackageContext.getPackageName())) {
            try {
                contextCreatePackageContext = contextCreatePackageContext.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                Context context = this.f3396b;
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e2);
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
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e3);
            }
        }
        p.f(authority);
        Context context2 = this.f3396b;
        Resources.Theme theme = authority.equals(context2.getPackageName()) ? (Resources.Theme) sVar.b(f3395a) : null;
        return f.g(theme == null ? d.b(context2, contextCreatePackageContext, identifier) : d.a(context2, identifier, theme));
    }
}
