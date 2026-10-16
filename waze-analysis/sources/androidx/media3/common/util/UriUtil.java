package androidx.media3.common.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.d.b.an;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    public static String getRelativePath(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !an.M(scheme, scheme2)) : scheme2 == null) {
            if (Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int iMin = Math.min(pathSegments.size(), pathSegments2.size());
                int i2 = 0;
                for (int i3 = 0; i3 < iMin && pathSegments.get(i3).equals(pathSegments2.get(i3)); i3++) {
                    i2++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i4 = i2; i4 < pathSegments.size(); i4++) {
                    sb.append("../");
                }
                while (i2 < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i2));
                    if (i2 < pathSegments2.size() - 1) {
                        sb.append(DomExceptionUtils.SEPARATOR);
                    }
                    i2++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }

    private static int[] getUriIndices(String str) {
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            length = iIndexOf;
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1 || iIndexOf2 > length) {
            iIndexOf2 = length;
        }
        int iIndexOf3 = str.indexOf(47);
        if (iIndexOf3 == -1 || iIndexOf3 > iIndexOf2) {
            iIndexOf3 = iIndexOf2;
        }
        int iIndexOf4 = str.indexOf(58);
        if (iIndexOf4 > iIndexOf3) {
            iIndexOf4 = -1;
        }
        int i2 = iIndexOf4 + 2;
        int iIndexOf5 = iIndexOf4 + 1;
        if (i2 < iIndexOf2 && str.charAt(iIndexOf5) == '/' && str.charAt(i2) == '/' && ((iIndexOf5 = str.indexOf(47, iIndexOf4 + 3)) == -1 || iIndexOf5 > iIndexOf2)) {
            iIndexOf5 = iIndexOf2;
        }
        iArr[0] = iIndexOf4;
        iArr[1] = iIndexOf5;
        iArr[2] = iIndexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean isAbsolute(String str) {
        return (str == null || getUriIndices(str)[0] == -1) ? false : true;
    }

    private static String removeDotSegments(StringBuilder sb, int i2, int i3) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i6 = i2;
        int iLastIndexOf = i6;
        while (i6 <= i3) {
            if (i6 == i3) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                if (sb.charAt(i6) != '/') {
                    i6 = i4;
                }
            }
            int i7 = iLastIndexOf + 1;
            if (i6 == i7 && sb.charAt(iLastIndexOf) == '.') {
                sb.delete(iLastIndexOf, i4);
                i5 = i4 - iLastIndexOf;
            } else if (i6 == iLastIndexOf + 2 && sb.charAt(iLastIndexOf) == '.' && sb.charAt(i7) == '.') {
                iLastIndexOf = sb.lastIndexOf(DomExceptionUtils.SEPARATOR, iLastIndexOf - 2) + 1;
                int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                sb.delete(i8, i4);
                i5 = i4 - i8;
            } else {
                iLastIndexOf = i6 + 1;
                i6 = iLastIndexOf;
            }
            i3 -= i5;
            i6 = iLastIndexOf;
        }
        return sb.toString();
    }

    public static Uri removeQueryParameter(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static String resolve(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb.append(str2);
            removeDotSegments(sb, uriIndices[1], uriIndices[2]);
            return sb.toString();
        }
        if (str == null) {
            str = "";
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            sb.append((CharSequence) str, 0, uriIndices2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (uriIndices[2] == 0) {
            sb.append((CharSequence) str, 0, uriIndices2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (uriIndices[1] != 0) {
            int i2 = uriIndices2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return removeDotSegments(sb, uriIndices[1] + i2, i2 + uriIndices[2]);
        }
        if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, uriIndices2[1]);
            sb.append(str2);
            int i3 = uriIndices2[1];
            return removeDotSegments(sb, i3, uriIndices[2] + i3);
        }
        int i4 = uriIndices2[0] + 2;
        int i5 = uriIndices2[1];
        if (i4 >= i5 || i5 != uriIndices2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, uriIndices2[2] - 1);
            int i6 = iLastIndexOf == -1 ? uriIndices2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return removeDotSegments(sb, uriIndices2[1], i6 + uriIndices[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = uriIndices2[1];
        return removeDotSegments(sb, i7, uriIndices[2] + i7 + 1);
    }

    public static Uri resolveToUri(String str, String str2) {
        return Uri.parse(resolve(str, str2));
    }
}
