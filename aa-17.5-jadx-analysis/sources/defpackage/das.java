package defpackage;

import android.view.SoundEffectConstants;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class das {
    public static final int a(int i, boolean z) {
        return SoundEffectConstants.getConstantForFocusDirection(i, z);
    }

    public static final void b(View view) {
        view.clearViewTranslationCallback();
    }

    public static final void c(View view) {
        view.setViewTranslationCallback(dar.a);
    }

    public static final cfy d(cfy cfyVar, String str) {
        return cfyVar.a(new dca(str));
    }

    public static final int e(List list, int i) throws IOException {
        int i2;
        int i3 = ((dfd) woy.bK(list)).b;
        if (i > ((dfd) woy.bK(list)).b) {
            dka.c(a.bo(i3, i, "Index ", " should be less or equal than last line's end "));
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            dfd dfdVar = (dfd) list.get(i2);
            char c = dfdVar.a <= i ? dfdVar.b <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        dka.c("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + dlz.c(list, null, null, null, new cyo(9), 31) + "]");
        return i2;
    }

    public static final int f(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            dfd dfdVar = (dfd) list.get(i3);
            char c = dfdVar.c <= i ? dfdVar.d <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    public static final int g(List list, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f >= ((dfd) woy.bK(list)).f) {
            return woy.bh(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                return -(i + 1);
            }
            int i2 = (i + size) >>> 1;
            dfd dfdVar = (dfd) list.get(i2);
            char c = dfdVar.e <= f ? dfdVar.f <= f ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
    }

    public static final void h(List list, long j, afec afecVar) {
        int size = list.size();
        for (int iE = e(list, dfv.d(j)); iE < size; iE++) {
            dfd dfdVar = (dfd) list.get(iE);
            int i = dfdVar.a;
            if (i >= dfv.c(j)) {
                return;
            }
            if (i != dfdVar.b) {
                afecVar.invoke(dfdVar);
            }
        }
    }

    public static final der i(det detVar) {
        return new der(detVar.a, detVar.b, detVar.c, detVar.d);
    }
}
