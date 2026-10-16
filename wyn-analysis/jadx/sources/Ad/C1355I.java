package ad;

import a.AbstractC1304a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import cg.C1618g;
import com.google.android.gms.internal.mlkit_common.zzss;
import d0.C2384c;
import e0.InterfaceC2442E;
import g2.C2679I;
import g2.InterfaceC2683d;
import g2.InterfaceC2684e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.AbstractC3340k;
import r7.InterfaceC3933c;
import wa.C4398a;

/* renamed from: ad.I, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1355I implements InterfaceC2442E, InterfaceC2683d, i3.a, InterfaceC3933c, L8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17504a;

    public /* synthetic */ C1355I(int i5) {
        this.f17504a = i5;
    }

    public static ArrayList c(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ff.t.e0(list, arrayList);
        }
        if (list2 != null) {
            ff.t.e0(list2, arrayList);
        }
        return arrayList;
    }

    public static List g(LinkedHashMap linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C c10) {
        List list = (List) linkedHashMap.get(c10);
        if (list == null) {
            return ff.v.f35432a;
        }
        ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) it.next()).f31435b);
        }
        return arrayList;
    }

    public static pd.t h(int i5) {
        return new pd.t(new C1618g(), Math.min(1048576, Math.max(4096, i5)));
    }

    public static void i(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Y2.B j(Context context, String[] strArr, String str, md.J j8) throws IOException {
        String[] strArrL = l(context);
        int length = strArrL.length;
        char c10 = 0;
        int i5 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i5 >= length) {
                return null;
            }
            String str2 = strArrL[i5];
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i10 = i11;
                }
            }
            if (zipFile != null) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i12 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder("lib");
                            char c11 = File.separatorChar;
                            sb2.append(c11);
                            sb2.append(str3);
                            sb2.append(c11);
                            sb2.append(str);
                            String string = sb2.toString();
                            j8.getClass();
                            md.J.r("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                Y2.B b5 = new Y2.B(19, c10);
                                b5.f16383b = zipFile;
                                b5.f16384c = entry;
                                return b5;
                            }
                        }
                        i12 = i13;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i5++;
        }
    }

    public static String[] k(Context context, String str) {
        StringBuilder sb2 = new StringBuilder("lib");
        char c10 = File.separatorChar;
        sb2.append(c10);
        sb2.append("([^\\");
        sb2.append(c10);
        sb2.append("]*)");
        sb2.append(c10);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : l(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] l(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // i3.a
    public void a(int i5, Serializable serializable) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // e0.InterfaceC2442E
    public e0.z b(long j8, L0.i layoutDirection, L0.b density) {
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        AbstractC3340k.e(density, "density");
        return new e0.v(AbstractC1304a.f(C2384c.f33931b, j8));
    }

    @Override // i3.a
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // r7.InterfaceC3933c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G5.C0522c e(android.content.Context r3, java.lang.String r4, r7.InterfaceC3932b r5) {
        /*
            r2 = this;
            G5.c r0 = new G5.c
            r0.<init>()
            int r1 = r5.d(r3, r4)
            r0.f4405a = r1
            r1 = 1
            int r3 = r5.a(r3, r4, r1)
            r0.f4406b = r3
            int r4 = r0.f4405a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f4407c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.C1355I.e(android.content.Context, java.lang.String, r7.b):G5.c");
    }

    @Override // g2.InterfaceC2683d
    public InterfaceC2684e f(int i5) throws IOException {
        C2679I c2679i = new C2679I();
        C2679I c2679i2 = new C2679I();
        try {
            c2679i.f35552a.y(A6.c.y(0));
            int iP = c2679i.p();
            boolean z2 = iP % 2 == 0;
            c2679i2.f35552a.y(A6.c.y(z2 ? iP + 1 : iP - 1));
            if (z2) {
                c2679i.f35553b = c2679i2;
                return c2679i;
            }
            c2679i2.f35553b = c2679i;
            return c2679i2;
        } catch (IOException e7) {
            Fe.b.m(c2679i);
            Fe.b.m(c2679i2);
            throw e7;
        }
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        zzss.zzb("common");
        return new C4398a(0);
    }

    public String toString() {
        switch (this.f17504a) {
            case 5:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
