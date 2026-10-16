package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lcw {
    public final android.view.View a;
    public final android.widget.ImageView b;
    public final android.widget.ImageView c;
    public final android.widget.TextView d;

    public lcw(android.view.View view) {
        this.a = view;
        android.view.View viewFindViewById = view.findViewById(com.google.android.projection.gearhead.R.id.csat_dialog_choice_icon);
        viewFindViewById.getClass();
        this.b = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(com.google.android.projection.gearhead.R.id.csat_dialog_choice_circle_backdrop);
        viewFindViewById2.getClass();
        this.c = (android.widget.ImageView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(com.google.android.projection.gearhead.R.id.csat_dialog_choice_text);
        viewFindViewById3.getClass();
        this.d = (android.widget.TextView) viewFindViewById3;
    }
}
