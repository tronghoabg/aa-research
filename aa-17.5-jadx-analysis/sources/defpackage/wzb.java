package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wzb extends mo {
    final TextView s;
    final Button t;
    final Button u;

    public wzb(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.body);
        this.t = (Button) view.findViewById(R.id.positive_action_button);
        this.u = (Button) view.findViewById(R.id.negative_action_button);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.mo
    public final void D(wyw wywVar) {
        this.s.setText(((wyx) wywVar.d).i);
        int i = ((wyx) wywVar.d).j;
        Button button = this.t;
        button.setText(i);
        button.setOnClickListener(wywVar.b);
        Object obj = wywVar.a;
        Button button2 = this.u;
        button2.setText((CharSequence) null);
        Object obj2 = wywVar.c;
        button2.setOnClickListener(null);
    }
}
