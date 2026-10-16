package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class eem {
    public static float a(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static float b(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f, f2);
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static android.widget.EdgeEffect c(android.content.Context context, android.util.AttributeSet attributeSet) {
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static void d(android.view.View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (java.lang.LinkageError unused) {
        }
    }

    public void e(defpackage.fbs fbsVar) {
    }
}
