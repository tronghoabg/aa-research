package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class zvo {
    public static final /* synthetic */ int c = 0;
    private static final String d = "zvo";
    public final zrt a;
    public vej b;
    private final ViewGroup e;
    private final zvn f;

    public zvo(zrt zrtVar, ViewGroup viewGroup, zvn zvnVar) {
        this.a = zrtVar;
        this.e = viewGroup;
        this.f = zvnVar;
    }

    public final Bitmap a(zwv zwvVar, int i, int i2) {
        View viewB = b(zwvVar);
        if (viewB == null) {
            return null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        viewB.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = viewB.getMeasuredWidth();
        int measuredHeight = viewB.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            String str = d;
            if (!zrn.e(str, 5)) {
                return null;
            }
            Log.w(str, "Info window has a width or height of zero.");
            return null;
        }
        viewB.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDensity(0);
        viewB.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View] */
    public final View b(zwv zwvVar) {
        try {
            vej vejVar = this.b;
            View view = vejVar != null ? (View) sqi.a(vejVar.f(zwvVar)) : null;
            if (view != null) {
                return view;
            }
            try {
                vej vejVar2 = this.b;
                zvn zvnVar = vejVar2 != null ? (View) sqi.a(vejVar2.e(zwvVar)) : null;
                if (zvnVar == null) {
                    if (ysi.R(zwvVar.getTitle())) {
                        return null;
                    }
                    zvnVar = this.f;
                    String title = zwvVar.getTitle();
                    TextView textView = zvnVar.a;
                    textView.setText(title);
                    textView.setVisibility(title != null ? 0 : 8);
                    String snippet = zwvVar.getSnippet();
                    TextView textView2 = zvnVar.b;
                    textView2.setText(snippet);
                    textView2.setVisibility(snippet == null ? 8 : 0);
                }
                ViewGroup viewGroup = this.e;
                viewGroup.removeAllViews();
                viewGroup.addView(zvnVar);
                return viewGroup;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
