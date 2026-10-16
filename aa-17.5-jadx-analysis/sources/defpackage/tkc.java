package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tkc implements tjy {
    private final /* synthetic */ int a;
    private final Object b;

    public tkc(int i) {
        this.a = i;
        this.b = new tkg(new oin(17));
    }

    @Override // defpackage.tjy
    public final /* synthetic */ Uri a(Object obj) {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? (Uri) obj : (Uri) obj;
        }
        Uri uriBuild = new Uri.Builder().path(String.valueOf(((Number) obj).intValue())).build();
        uriBuild.getClass();
        return uriBuild;
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat b(Object obj) throws PackageManager.NameNotFoundException, NumberFormatException {
        int identifier;
        int i = this.a;
        if (i == 0) {
            return IconCompat.m((Context) this.b, ((Number) obj).intValue());
        }
        if (i == 1) {
            Uri uri = (Uri) obj;
            uri.getClass();
            if (mlq.N(uri)) {
                return ((tkg) this.b).b(new URL(uri.toString()));
            }
            String scheme = uri.getScheme();
            if (scheme != null && afyh.R(scheme, "content")) {
                return tjw.e(uri);
            }
            Objects.toString(uri);
            throw new IllegalStateException("Invalid media icon Uri ".concat(uri.toString()));
        }
        Uri uri2 = (Uri) obj;
        uri2.getClass();
        String authority = uri2.getAuthority();
        if (authority == null) {
            Objects.toString(uri2);
            throw new IllegalStateException("Could not find package name for resource Uri ".concat(uri2.toString()));
        }
        Resources resourcesForApplication = ((Context) this.b).getPackageManager().getResourcesForApplication(authority);
        resourcesForApplication.getClass();
        int size = uri2.getPathSegments().size();
        if (size == 1) {
            try {
                String str = uri2.getPathSegments().get(0);
                str.getClass();
                identifier = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                Objects.toString(uri2);
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(uri2.toString()), e);
            }
        } else {
            if (size != 2) {
                Objects.toString(uri2);
                throw new IllegalStateException("Unrecognized Uri format: ".concat(uri2.toString()));
            }
            List<String> pathSegments = uri2.getPathSegments();
            String authority2 = uri2.getAuthority();
            String str2 = pathSegments.get(0);
            String str3 = pathSegments.get(1);
            identifier = resourcesForApplication.getIdentifier(str3, str2, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str3, str2, "android");
            }
        }
        return IconCompat.n(resourcesForApplication, authority, identifier);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        int i = this.a;
        return i != 0 ? i != 1 ? szp.y(this, uri) : szp.y(this, uri) : szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ Object d(Uri uri) {
        if (this.a != 0) {
            return uri;
        }
        String path = uri.getPath();
        path.getClass();
        return Integer.valueOf(Integer.parseInt(path));
    }

    public tkc(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
