package k1;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class P {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C3119f b(View view, C3119f c3119f) {
        ContentInfo contentInfoC = c3119f.f38817a.c();
        Objects.requireNonNull(contentInfoC);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoC);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoC ? c3119f : new C3119f(new com.google.android.gms.ads.nativead.l(contentInfoPerformReceiveContent));
    }
}
