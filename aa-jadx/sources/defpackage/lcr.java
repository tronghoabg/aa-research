package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lcr {
    public final android.view.View a;
    public final android.view.View b;
    public final android.widget.ImageView c;
    public final android.widget.TextView d;

    public lcr(android.view.View view) {
        this.a = view;
        android.view.View viewFindViewById = view.findViewById(com.google.android.projection.gearhead.R.id.csat_dialog_choice_icon_container);
        viewFindViewById.getClass();
        this.b = viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(com.google.android.projection.gearhead.R.id.csat_dialog_choice_icon);
        viewFindViewById2.getClass();
        this.c = (android.widget.ImageView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(com.google.android.projection.gearhead.R.id.csat_dialog_choice_text);
        viewFindViewById3.getClass();
        this.d = (android.widget.TextView) viewFindViewById3;
    }
}
