package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class wyy extends mo {
    final TextView s;
    final TextView t;
    final Button u;
    final ImageView v;

    public wyy(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.title);
        this.t = (TextView) view.findViewById(R.id.body);
        this.u = (Button) view.findViewById(R.id.action_button);
        this.v = (ImageView) view.findViewById(R.id.background);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.mo
    public final void D(wyw wywVar) {
        int i = ((wyx) wywVar.d).h;
        TextView textView = this.s;
        textView.setText(i);
        int i2 = ((wyx) wywVar.d).i;
        TextView textView2 = this.t;
        textView2.setText(i2);
        int i3 = ((wyx) wywVar.d).j;
        Button button = this.u;
        button.setText(i3);
        button.setOnClickListener(wywVar.b);
        this.v.setImageResource(((wyx) wywVar.d).l);
        textView.setTextColor(-1);
        textView2.setTextColor(-1);
    }
}
