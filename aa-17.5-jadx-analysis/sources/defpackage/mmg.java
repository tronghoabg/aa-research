package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmg extends mo {
    public ojn s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final ajmd w;

    public mmg(View view, ajmd ajmdVar) {
        super(view);
        this.w = ajmdVar;
        this.t = (TextView) view.findViewById(R.id.title_view);
        this.u = (TextView) view.findViewById(R.id.summary_view);
        this.v = (TextView) view.findViewById(R.id.resolution_button);
        view.setOnClickListener(new mli(this, 10));
    }
}
