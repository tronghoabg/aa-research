package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wzx extends defpackage.mr {
    final android.widget.TextView s;
    final android.widget.Button t;
    final android.widget.Button u;

    public wzx(android.view.View view) {
        super(view);
        this.s = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.body);
        this.t = (android.widget.Button) view.findViewById(com.google.android.projection.gearhead.R.id.positive_action_button);
        this.u = (android.widget.Button) view.findViewById(com.google.android.projection.gearhead.R.id.negative_action_button);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.mr
    public final void D(defpackage.wzs wzsVar) {
        this.s.setText(((defpackage.wzt) wzsVar.d).i);
        int i = ((defpackage.wzt) wzsVar.d).j;
        android.widget.Button button = this.t;
        button.setText(i);
        button.setOnClickListener(wzsVar.b);
        java.lang.Object obj = wzsVar.a;
        android.widget.Button button2 = this.u;
        button2.setText((java.lang.CharSequence) null);
        java.lang.Object obj2 = wzsVar.c;
        button2.setOnClickListener(null);
    }
}
