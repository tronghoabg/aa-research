package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class z {
    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT < 25;
    }

    public static long a(Context context) {
        long length;
        AbstractC3340k.e(context, "context");
        long length2 = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            if (file.exists() && file.exists()) {
                qf.h hVar = qf.h.f44276a;
                qf.f fVar = new qf.f(new Af.j(file));
                length = 0;
                while (fVar.hasNext()) {
                    File file2 = (File) fVar.next();
                    if (file2.isFile()) {
                        length += file2.length();
                    }
                }
            } else {
                length = 0;
            }
        } catch (Exception e7) {
            e = e7;
        }
        try {
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return length;
            }
            File fileX = qf.i.X(cacheDir, "webviewCache");
            if (fileX.exists()) {
                qf.h hVar2 = qf.h.f44276a;
                qf.f fVar2 = new qf.f(new Af.j(fileX));
                while (fVar2.hasNext()) {
                    File file3 = (File) fVar2.next();
                    if (file3.isFile()) {
                        length2 += file3.length();
                    }
                }
            }
            return length + length2;
        } catch (Exception e10) {
            e = e10;
            length2 = length;
            boolean z2 = u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error reading WebView data size: ");
            sbA.append(e.getMessage());
            t.b("WebViewSize", sbA.toString());
            return length2;
        }
    }
}
