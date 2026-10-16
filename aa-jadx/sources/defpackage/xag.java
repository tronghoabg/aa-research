package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xag extends defpackage.mr {
    public final android.view.View s;
    public final android.widget.ImageView t;
    public final android.widget.TextView u;
    public final android.widget.TextView v;
    public final android.widget.TextView w;

    public xag(android.view.View view) {
        super(view);
        this.s = view.findViewById(com.google.android.projection.gearhead.R.id.content);
        this.t = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.report_icon);
        this.u = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.summary_text_view);
        this.v = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.metadata_text_view);
        this.w = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.recommendation_text_view);
    }
}
