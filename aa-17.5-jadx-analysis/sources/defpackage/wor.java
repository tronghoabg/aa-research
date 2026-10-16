package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wor extends mo {
    public final View s;

    public wor(View view, byte[] bArr) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.license);
    }

    public wor(View view) {
        super(view);
        this.s = view;
    }

    public wor(TextView textView) {
        super(textView);
        this.s = textView;
    }
}
