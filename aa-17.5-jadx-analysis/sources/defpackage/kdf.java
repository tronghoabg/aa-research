package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kdf extends LinearLayout {
    public boolean a;
    public hig b;
    public final hmb c;
    public final boolean d;
    private boolean e;
    private final int f;
    private final int g;
    private final int h;

    public kdf(Context context, int i) throws Resources.NotFoundException {
        super(context, null, 0, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateActionWithTextMinWidth, R.attr.templateActionWithoutTextMinWidth});
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, new int[]{R.attr.fabDefaultContentColor, R.attr.isMinimizedStateFab});
        int color = typedArrayObtainStyledAttributes2.getColor(0, -1);
        this.h = color;
        this.d = typedArrayObtainStyledAttributes2.getBoolean(1, false);
        typedArrayObtainStyledAttributes2.recycle();
        hmb hmbVar = hmb.a;
        this.c = new hmb(color, true, false, ghw.b, null, false, 0);
    }

    private final void b(geu geuVar, CarIcon carIcon, LayoutInflater layoutInflater, boolean z, kde kdeVar) {
        layoutInflater.inflate(R.layout.action_button_view_icon, this);
        ImageView imageView = (ImageView) findViewById(R.id.action_icon);
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.template_padding_3));
                imageView.setLayoutParams(layoutParams);
            }
            kdeVar.d = true;
        }
        kdeVar.e = true;
        hbz.j(geuVar, carIcon, imageView, this.c);
    }

    private final void c(geu geuVar, CarIcon carIcon, LayoutInflater layoutInflater, Action action, kde kdeVar) {
        layoutInflater.inflate(carIcon != null ? R.layout.fab_view_text : R.layout.fab_view_text_no_icon, this);
        CarTextView carTextView = (CarTextView) findViewById(R.id.action_text);
        carTextView.a(geuVar, action.getTitle());
        carTextView.setTextColor(this.h);
        if (this.d) {
            carTextView.setMaxEms(geuVar.getResources().getInteger(R.integer.minimized_template_fab_text_max_ems));
        }
        kdeVar.d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final defpackage.geu r13, defpackage.hig r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdf.a(geu, hig, boolean, boolean):void");
    }
}
