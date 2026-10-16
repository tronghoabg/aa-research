package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class xfs implements rby {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xfs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rby
    public final View a(Context context) {
        GradientDrawable gradientDrawable;
        if (this.b == 0) {
            yph yphVar = xft.a;
            return LayoutInflater.from(context).inflate(((nsf) this.a).a, (ViewGroup) null);
        }
        View view = new View(context);
        nrv nrvVar = (nrv) this.a;
        if (nrvVar.b != nsv.e) {
            view.setBackgroundColor(context.getColor(R.color.irregular_activity_and_widget_scrim));
            return view;
        }
        GradientDrawable.Orientation orientation = nrvVar.a ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT;
        int i = true != olm.b(context) ? 255 : 0;
        if (Build.VERSION.SDK_INT >= 29) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(orientation);
            gradientDrawable.setColors(new int[]{Color.argb(255, i, i, i), Color.argb(204, i, i, i), Color.argb(153, i, i, i), Color.argb(0, i, i, i), Color.argb(0, i, i, i)}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.2f, 0.5f, 0.6f, 1.0f});
        } else {
            gradientDrawable = new GradientDrawable(orientation, new int[]{Color.argb(255, i, i, i), Color.argb(0, i, i, i)});
        }
        view.setBackground(gradientDrawable);
        return view;
    }
}
