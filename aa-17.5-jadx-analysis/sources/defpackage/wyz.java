package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wyz extends mo {
    final TextView s;
    final TextView t;
    final Button u;
    final ImageView v;

    public wyz(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.title);
        this.t = (TextView) view.findViewById(R.id.body);
        this.u = (Button) view.findViewById(R.id.action_button);
        this.v = (ImageView) view.findViewById(R.id.image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.mo
    public final void D(wyw wywVar) {
        this.s.setText(((wyx) wywVar.d).h);
        this.t.setText(((wyx) wywVar.d).i);
        int i = ((wyx) wywVar.d).j;
        Button button = this.u;
        button.setText(i);
        button.setOnClickListener(wywVar.b);
        this.v.setImageResource(((wyx) wywVar.d).k);
    }
}
