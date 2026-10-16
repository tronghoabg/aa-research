package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.LruCache;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lfr implements gaq {
    private final AdaptiveIconDrawable e = new AdaptiveIconDrawable(new ColorDrawable(), new ColorDrawable());
    private final LruCache f = new LruCache(10);
    public static final lfq a = new lfq();
    private static final yph d = yph.c("GH.IconShapeProv");
    public static final afgl b = new kkp(mki.b, 9);
    public static final ckv c = new lfp();

    public static final lfr b() {
        return a.a();
    }

    @Override // defpackage.gaq
    public final synchronized Path a(int i) {
        Path path;
        LruCache lruCache = this.f;
        Integer numValueOf = Integer.valueOf(i);
        Path path2 = (Path) lruCache.get(numValueOf);
        if (path2 != null) {
            return path2;
        }
        int i2 = lfq.b;
        acvb acvbVar = acvb.a;
        if (acvbVar.gu().d()) {
            aboh abohVar = acvbVar.gu().b().b;
            String str = Build.MANUFACTURER;
            str.getClass();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (!abohVar.contains(lowerCase)) {
                path = new Path();
                float f = i / 2.0f;
                path.addCircle(f, f, f, Path.Direction.CW);
            }
            d.l().w("Stored icon mask with size %d", i);
            lruCache.put(numValueOf, path);
            return path;
        }
        AdaptiveIconDrawable adaptiveIconDrawable = this.e;
        adaptiveIconDrawable.setBounds(new Rect(0, 0, i, i));
        path = new Path(adaptiveIconDrawable.getIconMask());
        d.l().w("Stored icon mask with size %d", i);
        lruCache.put(numValueOf, path);
        return path;
    }
}
