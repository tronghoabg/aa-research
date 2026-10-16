package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static final int maskForNonWindowMetricsChanges = -805248385;
    private static l<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (x.n(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final boolean diffForWindowMetricsChanged(Configuration configuration, Configuration configuration2) {
        return (configuration.diff(configuration2) & 805248384) != 0;
    }

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m10200dotp89u6pk(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        float f2 = fArr[i4] * fArr2[i3];
        float f3 = fArr[i4 + 1] * fArr2[i3 + 4];
        return f2 + f3 + (fArr[i4 + 2] * fArr2[i3 + 8]) + (fArr[i4 + 3] * fArr2[i3 + 12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionWrapper getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final l<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m10201preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM10200dotp89u6pk = m10200dotp89u6pk(fArr2, 0, fArr, 0);
        float fM10200dotp89u6pk2 = m10200dotp89u6pk(fArr2, 0, fArr, 1);
        float fM10200dotp89u6pk3 = m10200dotp89u6pk(fArr2, 0, fArr, 2);
        float fM10200dotp89u6pk4 = m10200dotp89u6pk(fArr2, 0, fArr, 3);
        float fM10200dotp89u6pk5 = m10200dotp89u6pk(fArr2, 1, fArr, 0);
        float fM10200dotp89u6pk6 = m10200dotp89u6pk(fArr2, 1, fArr, 1);
        float fM10200dotp89u6pk7 = m10200dotp89u6pk(fArr2, 1, fArr, 2);
        float fM10200dotp89u6pk8 = m10200dotp89u6pk(fArr2, 1, fArr, 3);
        float fM10200dotp89u6pk9 = m10200dotp89u6pk(fArr2, 2, fArr, 0);
        float fM10200dotp89u6pk10 = m10200dotp89u6pk(fArr2, 2, fArr, 1);
        float fM10200dotp89u6pk11 = m10200dotp89u6pk(fArr2, 2, fArr, 2);
        float fM10200dotp89u6pk12 = m10200dotp89u6pk(fArr2, 2, fArr, 3);
        float fM10200dotp89u6pk13 = m10200dotp89u6pk(fArr2, 3, fArr, 0);
        float fM10200dotp89u6pk14 = m10200dotp89u6pk(fArr2, 3, fArr, 1);
        float fM10200dotp89u6pk15 = m10200dotp89u6pk(fArr2, 3, fArr, 2);
        float fM10200dotp89u6pk16 = m10200dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM10200dotp89u6pk;
        fArr[1] = fM10200dotp89u6pk2;
        fArr[2] = fM10200dotp89u6pk3;
        fArr[3] = fM10200dotp89u6pk4;
        fArr[4] = fM10200dotp89u6pk5;
        fArr[5] = fM10200dotp89u6pk6;
        fArr[6] = fM10200dotp89u6pk7;
        fArr[7] = fM10200dotp89u6pk8;
        fArr[8] = fM10200dotp89u6pk9;
        fArr[9] = fM10200dotp89u6pk10;
        fArr[10] = fM10200dotp89u6pk11;
        fArr[11] = fM10200dotp89u6pk12;
        fArr[12] = fM10200dotp89u6pk13;
        fArr[13] = fM10200dotp89u6pk14;
        fArr[14] = fM10200dotp89u6pk15;
        fArr[15] = fM10200dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m10202preTranslatecG2Xzmc(float[] fArr, float f2, float f3, float[] fArr2) {
        Matrix.m8501resetimpl(fArr2);
        Matrix.m8514translateimpl$default(fArr2, f2, f3, 0.0f, 4, null);
        m10201preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(l<? super PlatformTextInputService, ? extends PlatformTextInputService> lVar) {
        platformTextInputServiceInterceptor = lVar;
    }
}
