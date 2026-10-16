package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.CancellationSignal;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import defpackage.ad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
class FontProvider {
    private static final Comparator<byte[]> sByteArrayComparator = new Comparator<byte[]>() { // from class: androidx.core.provider.FontProvider.1
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    };

    private FontProvider() {
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
        return fontRequest.getCertificates() != null ? fontRequest.getCertificates() : FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    public static FontsContractCompat.FontFamilyResult getFontFamilyResult(Context context, FontRequest fontRequest, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        return provider == null ? FontsContractCompat.FontFamilyResult.create(1, null) : FontsContractCompat.FontFamilyResult.create(0, query(context, fontRequest, provider.authority, cancellationSignal));
    }

    public static ProviderInfo getProvider(PackageManager packageManager, FontRequest fontRequest, Resources resources) throws PackageManager.NameNotFoundException {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(ad.g("No package found for authority: ", providerAuthority));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
        }
        List<byte[]> listConvertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listConvertToByteArrayList, sByteArrayComparator);
        List<List<byte[]>> certificates = getCertificates(fontRequest, resources);
        for (int i = 0; i < certificates.size(); i++) {
            ArrayList arrayList = new ArrayList(certificates.get(i));
            Collections.sort(arrayList, sByteArrayComparator);
            if (equalsByteArrayList(listConvertToByteArrayList, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context r16, androidx.core.provider.FontRequest r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r5 = r2.build()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r0 = r2.authority(r0)
            java.lang.String r2 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r2)
            android.net.Uri r0 = r0.build()
            r2 = 0
            java.lang.String r6 = "_id"
            java.lang.String r7 = "file_id"
            java.lang.String r8 = "font_ttc_index"
            java.lang.String r9 = "font_variation_settings"
            java.lang.String r10 = "font_weight"
            java.lang.String r11 = "font_italic"
            java.lang.String r12 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L98
            android.content.ContentResolver r4 = r16.getContentResolver()     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "query = ?"
            java.lang.String r3 = r17.getQuery()     // Catch: java.lang.Throwable -> L98
            java.lang.String[] r8 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L98
            r9 = 0
            r10 = r19
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto Ld3
            int r4 = r2.getCount()     // Catch: java.lang.Throwable -> L98
            if (r4 <= 0) goto Ld3
            java.lang.String r1 = "result_code"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "_id"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "file_id"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = "font_ttc_index"
            int r8 = r2.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = "font_weight"
            int r9 = r2.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.String r10 = "font_italic"
            int r10 = r2.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L98
        L8a:
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L98
            if (r11 == 0) goto Ld2
            r11 = -1
            if (r1 == r11) goto L9a
            int r12 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L98
            goto L9b
        L98:
            r0 = move-exception
            goto Le2
        L9a:
            r12 = 0
        L9b:
            if (r8 == r11) goto La2
            int r13 = r2.getInt(r8)     // Catch: java.lang.Throwable -> L98
            goto La3
        La2:
            r13 = 0
        La3:
            if (r7 != r11) goto Lae
            long r14 = r2.getLong(r6)     // Catch: java.lang.Throwable -> L98
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r5, r14)     // Catch: java.lang.Throwable -> L98
            goto Lb6
        Lae:
            long r14 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L98
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r0, r14)     // Catch: java.lang.Throwable -> L98
        Lb6:
            if (r9 == r11) goto Lbd
            int r15 = r2.getInt(r9)     // Catch: java.lang.Throwable -> L98
            goto Lbf
        Lbd:
            r15 = 400(0x190, float:5.6E-43)
        Lbf:
            if (r10 == r11) goto Lc9
            int r11 = r2.getInt(r10)     // Catch: java.lang.Throwable -> L98
            r3 = 1
            if (r11 != r3) goto Lc9
            goto Lca
        Lc9:
            r3 = 0
        Lca:
            androidx.core.provider.FontsContractCompat$FontInfo r3 = androidx.core.provider.FontsContractCompat.FontInfo.create(r14, r13, r15, r3, r12)     // Catch: java.lang.Throwable -> L98
            r4.add(r3)     // Catch: java.lang.Throwable -> L98
            goto L8a
        Ld2:
            r1 = r4
        Ld3:
            if (r2 == 0) goto Ld8
            r2.close()
        Ld8:
            r0 = 0
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
            return r0
        Le2:
            if (r2 == 0) goto Le7
            r2.close()
        Le7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontProvider.query(android.content.Context, androidx.core.provider.FontRequest, java.lang.String, android.os.CancellationSignal):androidx.core.provider.FontsContractCompat$FontInfo[]");
    }
}
