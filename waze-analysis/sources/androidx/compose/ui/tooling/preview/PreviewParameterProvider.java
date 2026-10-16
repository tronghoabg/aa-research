package androidx.compose.ui.tooling.preview;

import h.a.i;
import h.g.b.x;
import h.m.h;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface PreviewParameterProvider<T> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.tooling.preview.PreviewParameterProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getCount(PreviewParameterProvider previewParameterProvider) {
            h<T> values = previewParameterProvider.getValues();
            x.f(values, "<this>");
            Iterator<T> it = values.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
                if (i2 < 0) {
                    i.o();
                }
            }
            return i2;
        }

        public static String $default$getDisplayName(PreviewParameterProvider previewParameterProvider, int i2) {
            return null;
        }

        public static /* synthetic */ String access$getDisplayName$jd(PreviewParameterProvider previewParameterProvider, int i2) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            return CC.$default$getCount(previewParameterProvider);
        }

        @Deprecated
        public static <T> String getDisplayName(PreviewParameterProvider<T> previewParameterProvider, int i2) {
            return null;
        }
    }

    int getCount();

    String getDisplayName(int i2);

    h<T> getValues();
}
