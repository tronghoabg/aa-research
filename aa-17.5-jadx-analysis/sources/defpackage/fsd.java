package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class fsd implements fse {
    private final /* synthetic */ int a;

    public fsd(int i) {
        this.a = i;
    }

    private static final boolean b(int i, Context context) {
        return context.getResources().getResourceEntryName(i) != null;
    }

    @Override // defpackage.fse
    public final /* synthetic */ Object a(Object obj, ftc ftcVar) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        int i = this.a;
        if (i == 0) {
            Uri uri = (Uri) obj;
            uri.getClass();
            if (!ftw.d(uri) && ((scheme = uri.getScheme()) == null || affa.f(scheme, "file"))) {
                String path = uri.getPath();
                if (afyh.M(path != null ? path : "", '/') && ftw.b(uri) != null) {
                    String path2 = uri.getPath();
                    path2.getClass();
                    return new File(path2);
                }
            }
            return null;
        }
        if (i == 1) {
            byte[] bArr = (byte[]) obj;
            bArr.getClass();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.getClass();
            return byteBufferWrap;
        }
        if (i == 2) {
            ajhx ajhxVar = (ajhx) obj;
            ajhxVar.getClass();
            return ajhxVar.e;
        }
        if (i == 3) {
            int iIntValue = ((Number) obj).intValue();
            Context context = ftcVar.a;
            if (!b(iIntValue, context)) {
                return null;
            }
            Uri uri2 = Uri.parse("android.resource://" + context.getPackageName() + "/" + iIntValue);
            uri2.getClass();
            return uri2;
        }
        if (i != 4) {
            String str = (String) obj;
            str.getClass();
            Uri uri3 = Uri.parse(str);
            uri3.getClass();
            return uri3;
        }
        Uri uri4 = (Uri) obj;
        uri4.getClass();
        if (!affa.f(uri4.getScheme(), "android.resource") || (authority = uri4.getAuthority()) == null || afyh.v(authority)) {
            return null;
        }
        List<String> pathSegments = uri4.getPathSegments();
        pathSegments.getClass();
        if (pathSegments.size() == 2) {
            String authority2 = uri4.getAuthority();
            String str2 = authority2 != null ? authority2 : "";
            Resources resourcesForApplication = ftcVar.a.getPackageManager().getResourcesForApplication(str2);
            resourcesForApplication.getClass();
            List<String> pathSegments2 = uri4.getPathSegments();
            pathSegments2.getClass();
            int identifier = resourcesForApplication.getIdentifier(pathSegments2.get(1), pathSegments2.get(0), str2);
            if (identifier == 0) {
                Objects.toString(uri4);
                throw new IllegalStateException("Invalid android.resource URI: ".concat(uri4.toString()));
            }
            Uri uri5 = Uri.parse(a.bA(identifier, str2, "android.resource://", "/"));
            uri5.getClass();
            return uri5;
        }
        return null;
    }
}
