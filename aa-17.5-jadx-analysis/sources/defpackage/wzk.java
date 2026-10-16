package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wzk extends mo {
    public final View s;
    public final ImageView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;

    public wzk(View view) {
        super(view);
        this.s = view.findViewById(R.id.content);
        this.t = (ImageView) view.findViewById(R.id.report_icon);
        this.u = (TextView) view.findViewById(R.id.summary_text_view);
        this.v = (TextView) view.findViewById(R.id.metadata_text_view);
        this.w = (TextView) view.findViewById(R.id.recommendation_text_view);
    }
}
