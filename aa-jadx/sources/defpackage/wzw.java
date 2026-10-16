package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wzw extends defpackage.mr {
    final android.widget.TextView s;
    final android.widget.TextView t;
    final android.widget.Button u;

    public wzw(android.view.View view) {
        super(view);
        this.s = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.title);
        this.t = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.body);
        this.u = (android.widget.Button) view.findViewById(com.google.android.projection.gearhead.R.id.action_button);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.mr
    public final void D(defpackage.wzs wzsVar) {
        this.s.setText(((defpackage.wzt) wzsVar.d).h);
        this.t.setText(((defpackage.wzt) wzsVar.d).i);
        int i = ((defpackage.wzt) wzsVar.d).j;
        android.widget.Button button = this.u;
        button.setText(i);
        button.setOnClickListener(wzsVar.b);
    }
}
