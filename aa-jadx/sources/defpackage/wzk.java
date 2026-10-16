package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wzk extends defpackage.mr {
    public final android.widget.ImageView s;
    public final android.widget.TextView t;
    public final android.widget.TextView u;

    public wzk(android.view.View view) {
        super(view);
        this.s = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.permission_icon);
        this.t = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.permission_name);
        this.u = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.permission_description);
    }

    @Override // defpackage.mr
    public final void C(android.content.Context context, defpackage.wzm wzmVar) {
        android.graphics.drawable.Drawable drawable = context.getDrawable(wzmVar.b());
        drawable.setTint(context.getColor(com.google.android.projection.gearhead.R.color.frx_text_color));
        this.s.setImageDrawable(drawable);
        this.t.setText(context.getString(wzmVar.c()));
        this.u.setText(context.getString(wzmVar.a()));
    }
}
