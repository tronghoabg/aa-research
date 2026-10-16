package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xff extends defpackage.mr {
    public final android.widget.TextView s;
    public final android.widget.TextView t;
    public final android.view.View u;

    public xff(android.view.View view, byte[] bArr) {
        super(view);
        this.t = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.name);
        this.s = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.message);
        this.u = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.created_at);
    }

    public xff(android.view.View view) {
        super(view);
        this.u = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.icon);
        this.s = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.title);
        this.t = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.text);
    }
}
