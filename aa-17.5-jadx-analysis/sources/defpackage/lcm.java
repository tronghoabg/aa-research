package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class lcm {
    public final View a;
    public final View b;
    public final ImageView c;
    public final TextView d;

    public lcm(View view) {
        this.a = view;
        View viewFindViewById = view.findViewById(R.id.csat_dialog_choice_icon_container);
        viewFindViewById.getClass();
        this.b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.csat_dialog_choice_icon);
        viewFindViewById2.getClass();
        this.c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.csat_dialog_choice_text);
        viewFindViewById3.getClass();
        this.d = (TextView) viewFindViewById3;
    }
}
