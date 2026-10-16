package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xeg extends mo {
    public final TextView s;
    public final TextView t;
    public final View u;

    public xeg(View view, byte[] bArr) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.name);
        this.s = (TextView) view.findViewById(R.id.message);
        this.u = (TextView) view.findViewById(R.id.created_at);
    }

    public xeg(View view) {
        super(view);
        this.u = (ImageView) view.findViewById(R.id.icon);
        this.s = (TextView) view.findViewById(R.id.title);
        this.t = (TextView) view.findViewById(R.id.text);
    }
}
