package Cg;

import A7.RunnableC0299w0;
import X0.AbstractC1274b;
import Y0.e;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.applovin.shadow.okio.Segment;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import uc.InterfaceC4285v;

/* loaded from: classes5.dex */
public class c implements InterfaceC3885b, InterfaceC4279p, InterfaceC3964a, InterfaceC4285v {

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f2230e = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: f, reason: collision with root package name */
    public static final Uri f2231f = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2232g;

    /* renamed from: a, reason: collision with root package name */
    public C4281r f2233a;

    /* renamed from: b, reason: collision with root package name */
    public C3884a f2234b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f2235c;

    /* renamed from: d, reason: collision with root package name */
    public RunnableC0299w0 f2236d;

    static {
        f2232g = Build.VERSION.SDK_INT <= 29;
    }

    public static void a(Exception exc, g gVar) {
        String str = ((exc instanceof SecurityException) || exc.toString().contains("Permission denied")) ? "ACCESS_DENIED" : exc instanceof FileNotFoundException ? "NOT_SUPPORTED_FORMAT" : ((exc instanceof IOException) && exc.toString().contains("No space left on device")) ? "NOT_ENOUGH_SPACE" : "UNEXPECTED";
        String string = exc.toString();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append("\n");
        }
        new Handler(Looper.getMainLooper()).post(new Cb.a(gVar, str, string, sb2, 2));
    }

    public final boolean b(boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 29) {
            return true;
        }
        return (i5 == 29 && !z2) || e.checkSelfPermission(this.f2234b.f44186a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final void c(String str, String str2, boolean z2) throws IOException {
        File file = new File(str);
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            throw new FileNotFoundException("Extension not found.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            e(fileInputStream, z2, name.substring(0, iLastIndexOf), name.substring(iLastIndexOf), str2);
            fileInputStream.close();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[ADDED_TO_REGION, PHI: r6
  0x006e: PHI (r6v4 eg.a) = (r6v0 eg.a), (r6v1 eg.a), (r6v2 eg.a), (r6v3 eg.a), (r6v2 eg.a) binds: [B:28:0x006c, B:38:0x008d, B:45:0x00a1, B:52:0x00b5, B:49:0x00ac] A[DONT_GENERATE, DONT_INLINE], REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x000c, B:8:0x001e, B:10:0x002a, B:14:0x0035, B:16:0x003d, B:17:0x0040, B:19:0x0048, B:20:0x004b, B:22:0x0053, B:23:0x0056, B:27:0x0066, B:30:0x006f, B:32:0x0077, B:33:0x007a, B:35:0x0082, B:36:0x0085, B:40:0x0090, B:43:0x0099, B:47:0x00a4, B:50:0x00ad, B:54:0x00b8, B:57:0x00c1, B:59:0x00c9, B:62:0x00d5, B:64:0x00e5, B:76:0x0113, B:65:0x00e9, B:66:0x00ee, B:67:0x00ef, B:69:0x00f7, B:70:0x00fb, B:72:0x0103, B:73:0x0107, B:75:0x010f, B:89:0x0164, B:90:0x0169), top: B:96:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r9, java.lang.String r10, byte[] r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cg.c.d(java.lang.String, java.lang.String, byte[]):void");
    }

    public final void e(InputStream inputStream, boolean z2, String str, String str2, String str3) throws IOException {
        String string;
        ContentResolver contentResolver = this.f2234b.f44186a.getContentResolver();
        ContentValues contentValues = new ContentValues();
        String str4 = (z2 || str3 != null) ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES;
        if (f2232g) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str4);
            if (str3 == null) {
                str3 = "";
            }
            File file = new File(externalStoragePublicDirectory, str3);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getPath());
            String strC = wg.b.c(sb2, File.separator, str);
            int i5 = 0;
            while (true) {
                StringBuilder sbJ = N0.a.j(strC);
                sbJ.append(i5 == 0 ? "" : Integer.valueOf(i5));
                sbJ.append(str2);
                string = sbJ.toString();
                if (!new File(string).exists()) {
                    break;
                } else {
                    i5++;
                }
            }
            contentValues.put("_data", string);
        } else {
            StringBuilder sbJ2 = N0.a.j(str4);
            sbJ2.append(str3 != null ? wg.b.c(new StringBuilder(), File.separator, str3) : "");
            contentValues.put("relative_path", sbJ2.toString());
        }
        contentValues.put("_display_name", str + str2);
        int i10 = 0;
        while (true) {
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i10 > 0 ? Integer.valueOf(i10) : "");
                sb3.append(str2);
                contentValues.put("_display_name", sb3.toString());
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(contentResolver.insert(z2 ? f2230e : f2231f, contentValues));
                try {
                    byte[] bArr = new byte[Segment.SIZE];
                    while (true) {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            break;
                        } else {
                            outputStreamOpenOutputStream.write(bArr, 0, i11);
                        }
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IllegalStateException e7) {
                if (!e7.getMessage().contains("Failed to build unique file")) {
                    throw e7;
                }
                i10++;
            }
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        this.f2235c = (Activity) s1Var.f43896a;
        s1Var.d(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        C4281r c4281r = new C4281r(c3884a.f44188c, "gal");
        this.f2233a = c4281r;
        c4281r.b(this);
        this.f2234b = c3884a;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f2235c = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f2235c = null;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f2233a.b(null);
        this.f2234b = null;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(final C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        final int i5;
        final int i10;
        i5 = 1;
        i10 = 0;
        String str = c4278o.f46759a;
        str.getClass();
        switch (str) {
            case "hasAccess":
                ((g) interfaceC4280q).a(Boolean.valueOf(b(((Boolean) c4278o.a("toAlbum")).booleanValue())));
                break;
            case "open":
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT <= 23) {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                } else {
                    intent.setData(f2230e);
                }
                intent.setFlags(268435456);
                this.f2234b.f44186a.startActivity(intent);
                new Handler(Looper.getMainLooper()).post(new b((g) interfaceC4280q, 0));
                break;
            case "requestAccess":
                if (!b(((Boolean) c4278o.a("toAlbum")).booleanValue())) {
                    this.f2236d = new RunnableC0299w0(this, (g) interfaceC4280q, c4278o, 10);
                    AbstractC1274b.a(this.f2235c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1317298);
                    break;
                } else {
                    ((g) interfaceC4280q).a(Boolean.TRUE);
                    break;
                }
            case "putImage":
            case "putVideo":
                final g gVar = (g) interfaceC4280q;
                new Thread(new Runnable(this) { // from class: Cg.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ c f2225b;

                    {
                        this.f2225b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = this.f2225b;
                        g gVar2 = gVar;
                        C4278o c4278o2 = c4278o;
                        switch (i10) {
                            case 0:
                                Uri uri = c.f2230e;
                                cVar.getClass();
                                try {
                                    cVar.c((String) c4278o2.a("path"), (String) c4278o2.a("album"), c4278o2.f46759a.contains("Image"));
                                    new Handler(Looper.getMainLooper()).post(new b(gVar2, 2));
                                    break;
                                } catch (Exception e7) {
                                    c.a(e7, gVar2);
                                    return;
                                }
                            default:
                                Uri uri2 = c.f2230e;
                                cVar.getClass();
                                try {
                                    cVar.d((String) c4278o2.a("album"), (String) c4278o2.a(MediationMetaData.KEY_NAME), (byte[]) c4278o2.a("bytes"));
                                    new Handler(Looper.getMainLooper()).post(new b(gVar2, 1));
                                    break;
                                } catch (Exception e10) {
                                    c.a(e10, gVar2);
                                }
                        }
                    }
                }).start();
                break;
            case "putImageBytes":
                final g gVar2 = (g) interfaceC4280q;
                new Thread(new Runnable(this) { // from class: Cg.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ c f2225b;

                    {
                        this.f2225b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = this.f2225b;
                        g gVar22 = gVar2;
                        C4278o c4278o2 = c4278o;
                        switch (i5) {
                            case 0:
                                Uri uri = c.f2230e;
                                cVar.getClass();
                                try {
                                    cVar.c((String) c4278o2.a("path"), (String) c4278o2.a("album"), c4278o2.f46759a.contains("Image"));
                                    new Handler(Looper.getMainLooper()).post(new b(gVar22, 2));
                                    break;
                                } catch (Exception e7) {
                                    c.a(e7, gVar22);
                                    return;
                                }
                            default:
                                Uri uri2 = c.f2230e;
                                cVar.getClass();
                                try {
                                    cVar.d((String) c4278o2.a("album"), (String) c4278o2.a(MediationMetaData.KEY_NAME), (byte[]) c4278o2.a("bytes"));
                                    new Handler(Looper.getMainLooper()).post(new b(gVar22, 1));
                                    break;
                                } catch (Exception e10) {
                                    c.a(e10, gVar22);
                                }
                        }
                    }
                }).start();
                break;
            default:
                ((g) interfaceC4280q).c();
                break;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        this.f2235c = (Activity) s1Var.f43896a;
        s1Var.d(this);
    }

    @Override // uc.InterfaceC4285v
    public final boolean onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        if (i5 != 1317298 || iArr.length == 0) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(this.f2236d);
        this.f2236d = null;
        return true;
    }
}
