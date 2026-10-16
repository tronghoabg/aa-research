package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public abstract class wzy extends mo {
    public final View u;
    public final TextView v;
    public mqz w;
    public final View x;
    public final xai y;
    protected final View z;

    protected wzy(xai xaiVar, View view) {
        super(view);
        this.x = view;
        this.y = xaiVar;
        View viewFindViewById = view.findViewById(R.id.app_icon);
        viewFindViewById.getClass();
        this.u = viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.app_name);
        textView.getClass();
        this.v = textView;
        View viewFindViewById2 = view.findViewById(R.id.drag_handle);
        viewFindViewById2.getClass();
        this.z = viewFindViewById2;
    }

    protected abstract void E();

    public abstract void F();

    protected abstract void G();

    protected abstract boolean H();

    public final void I(boolean z) {
        View view = this.z;
        byte[] bArr = null;
        if (z) {
            view.setVisibility(0);
            view.setOnTouchListener(new jzt(this, 12, bArr));
        } else {
            view.setVisibility(4);
            view.setOnTouchListener(null);
        }
    }
}
