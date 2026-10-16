package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wzu extends defpackage.mr {
    final android.widget.TextView s;
    final android.widget.TextView t;
    final android.widget.Button u;
    final android.widget.ImageView v;

    public wzu(android.view.View view) {
        super(view);
        this.s = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.title);
        this.t = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.body);
        this.u = (android.widget.Button) view.findViewById(com.google.android.projection.gearhead.R.id.action_button);
        this.v = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.background);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.mr
    public final void D(defpackage.wzs wzsVar) {
        int i = ((defpackage.wzt) wzsVar.d).h;
        android.widget.TextView textView = this.s;
        textView.setText(i);
        int i2 = ((defpackage.wzt) wzsVar.d).i;
        android.widget.TextView textView2 = this.t;
        textView2.setText(i2);
        int i3 = ((defpackage.wzt) wzsVar.d).j;
        android.widget.Button button = this.u;
        button.setText(i3);
        button.setOnClickListener(wzsVar.b);
        this.v.setImageResource(((defpackage.wzt) wzsVar.d).l);
        textView.setTextColor(-1);
        textView2.setTextColor(-1);
    }
}
