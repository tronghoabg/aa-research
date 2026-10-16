package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class wza extends mo {
    final TextView s;
    final TextView t;
    final Button u;

    public wza(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.title);
        this.t = (TextView) view.findViewById(R.id.body);
        this.u = (Button) view.findViewById(R.id.action_button);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.mo
    public final void D(wyw wywVar) {
        this.s.setText(((wyx) wywVar.d).h);
        this.t.setText(((wyx) wywVar.d).i);
        int i = ((wyx) wywVar.d).j;
        Button button = this.u;
        button.setText(i);
        button.setOnClickListener(wywVar.b);
    }
}
