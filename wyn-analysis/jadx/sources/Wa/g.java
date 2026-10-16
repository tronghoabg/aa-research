package Wa;

import Bf.k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129 A[Catch: IOException -> 0x0124, TryCatch #7 {IOException -> 0x0124, blocks: (B:55:0x011a, B:57:0x0120, B:61:0x0129, B:63:0x012e), top: B:90:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e A[Catch: IOException -> 0x0124, TRY_LEAVE, TryCatch #7 {IOException -> 0x0124, blocks: (B:55:0x011a, B:57:0x0120, B:61:0x0129, B:63:0x012e), top: B:90:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.app.Activity r12, android.net.Uri r13, boolean r14, java.util.ArrayList r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wa.g.a(android.app.Activity, android.net.Uri, boolean, java.util.ArrayList):void");
    }

    public static final Uri b(Activity activity, Uri uri, int i5) throws FileNotFoundException {
        if (i5 > 0) {
            Context applicationContext = activity.getApplicationContext();
            AbstractC3340k.d(applicationContext, "getApplicationContext(...)");
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(applicationContext.getContentResolver().getType(uri));
            if (extensionFromMimeType != null && (extensionFromMimeType.contentEquals("jpg") || extensionFromMimeType.contentEquals("jpeg") || extensionFromMimeType.contentEquals("png") || extensionFromMimeType.contentEquals("webp"))) {
                Context applicationContext2 = activity.getApplicationContext();
                AbstractC3340k.d(applicationContext2, "getApplicationContext(...)");
                try {
                    InputStream inputStreamOpenInputStream = applicationContext2.getContentResolver().openInputStream(uri);
                    try {
                        File fileD = d(applicationContext2, uri);
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                        FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                        bitmapDecodeStream.compress(e(applicationContext2, uri), i5, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Uri uriFromFile = Uri.fromFile(fileD);
                        AbstractC3340k.d(uriFromFile, "fromFile(...)");
                        Ba.c.n(inputStreamOpenInputStream, null);
                        return uriFromFile;
                    } finally {
                    }
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return uri;
    }

    public static final String c(String str) {
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    return "*/*";
                }
                return null;
            case 96748:
                if (str.equals("any")) {
                    return "*/*";
                }
                return null;
            case 99469:
                if (str.equals("dir")) {
                    return "dir";
                }
                return null;
            case 93166550:
                if (str.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    return "audio/*";
                }
                return null;
            case 100313435:
                if (str.equals("image")) {
                    return "image/*";
                }
                return null;
            case 103772132:
                if (str.equals("media")) {
                    return "image/*,video/*";
                }
                return null;
            case 112202875:
                if (str.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    return "video/*";
                }
                return null;
            default:
                return null;
        }
    }

    public static File d(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile(AbstractC3256n.f('_', "IMAGE_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date())), "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)), context.getCacheDir());
        AbstractC3340k.d(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static Bitmap.CompressFormat e(Context context, Uri uri) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        AbstractC3340k.b(extensionFromMimeType);
        Locale locale = Locale.getDefault();
        AbstractC3340k.d(locale, "getDefault(...)");
        String upperCase = extensionFromMimeType.toUpperCase(locale);
        AbstractC3340k.d(upperCase, "toUpperCase(...)");
        return upperCase.equals("PNG") ? Bitmap.CompressFormat.PNG : upperCase.equals("WEBP") ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String f(android.content.Context r9, android.net.Uri r10) {
        /*
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.AbstractC3340k.e(r10, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.AbstractC3340k.e(r9, r1)
            r1 = 0
            java.lang.String r2 = r10.getScheme()     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "content"
            boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r3)     // Catch: java.lang.Exception -> L42
            if (r2 == 0) goto L4e
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Exception -> L42
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L42
            r8 = 0
            r6 = 0
            r7 = 0
            r4 = r10
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L42
            if (r9 == 0) goto L45
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L3a
            if (r10 == 0) goto L45
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L3a
            goto L46
        L3a:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> L3d
        L3d:
            r0 = move-exception
            Ba.c.n(r9, r10)     // Catch: java.lang.Exception -> L42
            throw r0     // Catch: java.lang.Exception -> L42
        L42:
            r0 = move-exception
            r9 = r0
            goto L61
        L45:
            r10 = r1
        L46:
            Ba.c.n(r9, r1)     // Catch: java.lang.Exception -> L4a
            goto L50
        L4a:
            r0 = move-exception
            r9 = r0
            r1 = r10
            goto L61
        L4e:
            r4 = r10
            r10 = r1
        L50:
            if (r10 != 0) goto L60
            java.lang.String r9 = r4.getPath()     // Catch: java.lang.Exception -> L4a
            if (r9 == 0) goto L5f
            r0 = 47
            java.lang.String r9 = Bf.k.N0(r0, r9, r9)     // Catch: java.lang.Exception -> L4a
            return r9
        L5f:
            return r1
        L60:
            return r10
        L61:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to handle file name: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "FilePickerUtils"
            android.util.Log.e(r10, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wa.g.f(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static ArrayList g(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return new ArrayList(AbstractC3935e.C("*/*"));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i5));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type '" + ((String) arrayList.get(i5)) + "' is unsupported and will not be filtered.");
                return new ArrayList(AbstractC3935e.C("*/*"));
            }
            arrayList2.add(mimeTypeFromExtension);
            if (AbstractC3340k.a(arrayList.get(i5), "csv")) {
                arrayList2.add("text/csv");
            }
        }
        Log.d("FilePickerUtils", "Custom file types are " + arrayList + ". The mime types were detected as " + arrayList2 + '.');
        return arrayList2;
    }

    public static void h(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.listFiles() != null && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file2 : fileArrListFiles) {
                h(file2);
            }
        }
        file.delete();
    }

    public static void i(b bVar, String str, Boolean bool, Boolean bool2, ArrayList arrayList, Integer num, h hVar) {
        String str2;
        Intent intent;
        if (bVar != null) {
            if (bVar.f15422b != null) {
                int i5 = b.f15420j;
                hVar.b("already_active", "File picker is already active", null);
                return;
            }
            bVar.f15422b = hVar;
        }
        if (bVar != null) {
            bVar.f15425e = str;
        }
        if (bool != null && bVar != null) {
            bVar.f15423c = bool.booleanValue();
        }
        if (bool2 != null && bVar != null) {
            bVar.f15424d = bool2.booleanValue();
        }
        if (bVar != null) {
            bVar.f15427g = arrayList;
        }
        if (num != null && bVar != null) {
            bVar.f15426f = num.intValue();
        }
        if (bVar == null || (str2 = bVar.f15425e) == null) {
            return;
        }
        if (str2.equals("dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else if (AbstractC3340k.a(bVar.f15425e, "image/*")) {
            intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), bVar.f15425e);
            intent.setType(bVar.f15425e);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bVar.f15423c);
            intent.putExtra("multi-pick", bVar.f15423c);
            String str3 = bVar.f15425e;
            if (str3 != null) {
                String str4 = k.n0(str3, ",", false) ? str3 : null;
                if (str4 != null) {
                    List listI0 = k.I0(str4, new String[]{","});
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listI0) {
                        if (((String) obj).length() > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    bVar.f15427g = new ArrayList(arrayList2);
                }
            }
            ArrayList arrayList3 = bVar.f15427g;
            if (arrayList3 != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", arrayList3);
            }
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType(bVar.f15425e);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bVar.f15423c);
            intent.putExtra("multi-pick", bVar.f15423c);
            ArrayList arrayList4 = bVar.f15427g;
            if (arrayList4 != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList4.toArray(new String[0]));
            }
        }
        Activity activity = bVar.f15421a;
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(intent, b.f15420j);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            bVar.b("invalid_format_type", "Can't handle the provided file type.");
        }
    }
}
