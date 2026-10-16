package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class qhf extends defpackage.mr {
    protected final android.widget.ImageView s;
    protected final android.widget.TextView t;
    protected final android.widget.TextView u;
    protected final android.view.ViewGroup v;
    protected final android.widget.TextView w;
    protected final android.widget.TextView x;

    public qhf(android.view.View view) {
        super(view);
        this.s = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.icon);
        this.t = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.title);
        this.u = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.subtitle);
        this.v = (android.view.ViewGroup) view.findViewById(com.google.android.projection.gearhead.R.id.metadata_container);
        this.w = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.extra1);
        this.x = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.extra2);
    }

    protected static final void F(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public abstract void E(com.google.android.apps.auto.sdk.SearchItem searchItem, android.content.Context context, android.content.Context context2);
}
