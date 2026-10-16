package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class xft extends defpackage.mr {
    public final android.widget.ImageView s;
    public final android.widget.TextView t;
    public final android.widget.TextView u;
    public final android.view.ViewGroup v;
    public final android.widget.TextView w;
    public final android.widget.TextView x;

    public xft(android.view.View view) {
        super(view);
        this.s = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.icon);
        this.t = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.title);
        this.u = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.subtitle);
        this.v = (android.view.ViewGroup) view.findViewById(com.google.android.projection.gearhead.R.id.metadata_container);
        this.w = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.extra1);
        this.x = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.extra2);
    }
}
