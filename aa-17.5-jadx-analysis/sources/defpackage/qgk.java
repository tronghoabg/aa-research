package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.sdk.SearchItem;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
abstract class qgk extends mo {
    protected final ImageView s;
    protected final TextView t;
    protected final TextView u;
    protected final ViewGroup v;
    protected final TextView w;
    protected final TextView x;

    public qgk(View view) {
        super(view);
        this.s = (ImageView) view.findViewById(R.id.icon);
        this.t = (TextView) view.findViewById(R.id.title);
        this.u = (TextView) view.findViewById(R.id.subtitle);
        this.v = (ViewGroup) view.findViewById(R.id.metadata_container);
        this.w = (TextView) view.findViewById(R.id.extra1);
        this.x = (TextView) view.findViewById(R.id.extra2);
    }

    protected static final void F(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public abstract void E(SearchItem searchItem, Context context, Context context2);
}
