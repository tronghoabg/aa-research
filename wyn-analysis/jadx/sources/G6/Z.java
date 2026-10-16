package G6;

import D6.C0395s;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfk;
import java.util.Locale;

/* loaded from: classes3.dex */
public class Z extends X {
    @Override // G6.b0
    public final void e(final Activity activity) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbW)).booleanValue() && ((O) C6.n.f1857D.f1868h.zzp()).A() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: G6.Y
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    C6.n nVar = C6.n.f1857D;
                    if (((O) nVar.f1868h.zzp()).A() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        zzcfk zzcfkVar = nVar.f1868h;
                        String strConcat = "";
                        if (displayCutout != null) {
                            N nZzp = zzcfkVar.zzp();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                Locale locale = Locale.US;
                                int i5 = rect.left;
                                int i10 = rect.top;
                                int i11 = rect.right;
                                int i12 = rect.bottom;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(i5);
                                sb2.append(",");
                                sb2.append(i10);
                                sb2.append(",");
                                sb2.append(i11);
                                String strD = N0.a.d(i12, ",", sb2);
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(strD);
                            }
                            ((O) nZzp).B(strConcat);
                        } else {
                            ((O) zzcfkVar.zzp()).B("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // G6.b0
    public final int f(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
