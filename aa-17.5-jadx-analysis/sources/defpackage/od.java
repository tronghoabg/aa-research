package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class od {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);
    private static ok c;

    /* JADX WARN: Type inference failed for: r0v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [afec, java.lang.Object] */
    public static /* synthetic */ void a(ob obVar) {
        os osVarK = ca.k(0, 0);
        os osVarK2 = ca.k(a, b);
        View decorView = obVar.getWindow().getDecorView();
        decorView.getClass();
        ok oiVar = c;
        if (oiVar == null) {
            oiVar = Build.VERSION.SDK_INT >= 35 ? new oi() : Build.VERSION.SDK_INT >= 30 ? new oh() : Build.VERSION.SDK_INT >= 29 ? new og() : new of();
            c = oiVar;
        }
        ok okVar = oiVar;
        Window window = obVar.getWindow();
        window.getClass();
        ?? r0 = osVarK.c;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) r0.invoke(resources)).booleanValue();
        ?? r02 = osVarK2.c;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        okVar.a(osVarK, osVarK2, window, decorView, zBooleanValue, ((Boolean) r02.invoke(resources2)).booleanValue());
        Window window2 = obVar.getWindow();
        window2.getClass();
        okVar.b(window2);
    }
}
