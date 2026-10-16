package N4;

import A4.d;
import B4.g;
import B4.i;
import E4.B;
import L4.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import ka.AbstractC3230e0;
import pd.f;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8397a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8398b;

    public b(F4.a aVar) {
        this.f8398b = aVar;
    }

    @Override // B4.i
    public final B a(Object obj, int i5, int i10, g gVar) {
        switch (this.f8397a) {
            case 0:
                return c((Uri) obj);
            default:
                Bitmap bitmapB = ((d) obj).b();
                F4.a aVar = (F4.a) this.f8398b;
                if (bitmapB == null) {
                    return null;
                }
                return new c(aVar, bitmapB);
        }
    }

    @Override // B4.i
    public final boolean b(Object obj, g gVar) {
        switch (this.f8397a) {
            case 0:
                return ((Uri) obj).getScheme().equals("android.resource");
            default:
                return true;
        }
    }

    public B c(Uri uri) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = (Context) this.f8398b;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e7) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(f.k(uri, "Failed to obtain context or unrecognized Uri format for: "), e7);
                }
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
                throw new IllegalArgumentException(f.k(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(f.k(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException(f.k(uri, "Unrecognized Uri format: "), e10);
            }
        }
        Drawable drawableQ = AbstractC3230e0.q(context, contextCreatePackageContext, identifier, null);
        if (drawableQ != null) {
            return new a(drawableQ, 0);
        }
        return null;
    }

    public b(Context context) {
        this.f8398b = context.getApplicationContext();
    }
}
