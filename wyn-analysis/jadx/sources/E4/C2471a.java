package e4;

import Bf.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import ff.o;
import h4.l;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import k4.e;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.HttpUrl;
import pd.f;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2471a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34424a;

    public /* synthetic */ C2471a(int i5) {
        this.f34424a = i5;
    }

    public final Object a(Object obj, l lVar) throws PackageManager.NameNotFoundException {
        String authority;
        switch (this.f34424a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uriBuild = (Uri) obj;
                if (e.c(uriBuild)) {
                    return null;
                }
                String scheme = uriBuild.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uriBuild.getPath();
                if (path == null) {
                    path = "";
                }
                if (!k.K0(path, '/') || ((String) o.s0(uriBuild.getPathSegments())) == null) {
                    return null;
                }
                if (uriBuild.getScheme() != null) {
                    uriBuild = uriBuild.buildUpon().scheme(null).build();
                }
                return new File(uriBuild.toString());
            case 2:
                return ((HttpUrl) obj).f42281i;
            case 3:
                Context context = lVar.f36118a;
                int iIntValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                        AbstractC3340k.d(uri, "parse(this)");
                        return uri;
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!AbstractC3340k.a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || k.y0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = "";
                }
                Resources resourcesForApplication = lVar.f36118a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(f.k(uri2, "Invalid android.resource URI: ").toString());
                }
                Uri uri3 = Uri.parse("android.resource://" + authority2 + '/' + identifier);
                AbstractC3340k.d(uri3, "parse(this)");
                return uri3;
            default:
                Uri uri4 = Uri.parse((String) obj);
                AbstractC3340k.d(uri4, "parse(this)");
                return uri4;
        }
    }
}
