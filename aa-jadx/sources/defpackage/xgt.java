package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xgt implements defpackage.rct {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xgt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rct
    public final android.view.View a(android.content.Context context) {
        if (this.b == 0) {
            defpackage.yqm yqmVar = defpackage.xgu.a;
            return android.view.LayoutInflater.from(context).inflate(((defpackage.nss) this.a).a, (android.view.ViewGroup) null);
        }
        android.view.View view = new android.view.View(context);
        defpackage.nsj nsjVar = (defpackage.nsj) this.a;
        int iOrdinal = nsjVar.b.ordinal();
        if (iOrdinal == 4) {
            defpackage.nsj.b(context, view, nsjVar.a ? android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT : android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
            return view;
        }
        if (iOrdinal != 5) {
            view.setBackgroundColor(context.getColor(com.google.android.projection.gearhead.R.color.irregular_activity_and_widget_scrim));
            return view;
        }
        defpackage.nsj.b(context, view, android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP);
        return view;
    }
}
