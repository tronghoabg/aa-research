package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
final class wyo extends mo {
    public final ImageView s;
    public final TextView t;
    public final TextView u;

    public wyo(View view) {
        super(view);
        this.s = (ImageView) view.findViewById(R.id.permission_icon);
        this.t = (TextView) view.findViewById(R.id.permission_name);
        this.u = (TextView) view.findViewById(R.id.permission_description);
    }

    @Override // defpackage.mo
    public final void C(Context context, wyq wyqVar) {
        Drawable drawable = context.getDrawable(wyqVar.b());
        drawable.setTint(context.getColor(R.color.frx_text_color));
        this.s.setImageDrawable(drawable);
        this.t.setText(context.getString(wyqVar.c()));
        this.u.setText(context.getString(wyqVar.a()));
    }
}
