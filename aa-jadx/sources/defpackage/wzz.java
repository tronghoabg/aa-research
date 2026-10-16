package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wzz extends defpackage.mr {
    final /* synthetic */ defpackage.xaa s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzz(defpackage.xaa xaaVar, android.view.View view) {
        super(view);
        this.s = xaaVar;
        android.view.View viewFindViewById = view.findViewById(com.google.android.projection.gearhead.R.id.play_button);
        viewFindViewById.setOnClickListener(new defpackage.wzy(this, viewFindViewById, view.findViewById(com.google.android.projection.gearhead.R.id.spinner)));
    }
}
