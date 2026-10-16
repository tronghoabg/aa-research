package h1;

import E4.ThreadFactoryC0433b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import b1.AbstractC1497f;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r7.AbstractC3935e;
import x.C4417j;
import x.C4429v;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C4417j f35954a = new C4417j(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f35955b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f35956c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4429v f35957d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0433b(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f35955b = threadPoolExecutor;
        f35956c = new Object();
        f35957d = new C4429v(0);
    }

    public static String a(int i5, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((d) list.get(i10)).f35944e);
            sb2.append("-");
            sb2.append(i5);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static g b(String str, Context context, List list, int i5) {
        int i10;
        Typeface typefaceP;
        Trace.beginSection(tg.b.U("getFontSync"));
        C4417j c4417j = f35954a;
        try {
            Typeface typeface = (Typeface) c4417j.get(str);
            if (typeface != null) {
                return new g(typeface);
            }
            Y2.f fVarA = AbstractC2768c.a(context, list);
            int i11 = fVarA.f16437a;
            List list2 = fVarA.f16438b;
            if (i11 != 0) {
                i10 = i11 != 1 ? -3 : -2;
            } else {
                i[] iVarArr = (i[]) list2.get(0);
                if (iVarArr == null || iVarArr.length == 0) {
                    i10 = 1;
                } else {
                    int length = iVarArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            i10 = 0;
                            break;
                        }
                        int i13 = iVarArr[i12].f35962e;
                        if (i13 == 0) {
                            i12++;
                        } else if (i13 >= 0) {
                            i10 = i13;
                        }
                    }
                }
            }
            if (i10 != 0) {
                return new g(i10);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                i[] iVarArr2 = (i[]) list2.get(0);
                AbstractC3935e abstractC3935e = AbstractC1497f.f19128a;
                Trace.beginSection(tg.b.U("TypefaceCompat.createFromFontInfo"));
                typefaceP = AbstractC1497f.f19128a.p(context, iVarArr2, i5);
                Trace.endSection();
            } else {
                AbstractC3935e abstractC3935e2 = AbstractC1497f.f19128a;
                Trace.beginSection(tg.b.U("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceP = AbstractC1497f.f19128a.q(context, list2, i5);
                Trace.endSection();
            }
            if (typefaceP == null) {
                return new g(-3);
            }
            c4417j.put(str, typefaceP);
            return new g(typefaceP);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }
}
