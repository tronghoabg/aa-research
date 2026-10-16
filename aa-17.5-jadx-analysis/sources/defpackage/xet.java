package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
final class xet extends mo {
    public final ImageView s;
    public final TextView t;
    public final TextView u;
    public final ViewGroup v;
    public final TextView w;
    public final TextView x;

    public xet(View view) {
        super(view);
        this.s = (ImageView) view.findViewById(R.id.icon);
        this.t = (TextView) view.findViewById(R.id.title);
        this.u = (TextView) view.findViewById(R.id.subtitle);
        this.v = (ViewGroup) view.findViewById(R.id.metadata_container);
        this.w = (TextView) view.findViewById(R.id.extra1);
        this.x = (TextView) view.findViewById(R.id.extra2);
    }
}
