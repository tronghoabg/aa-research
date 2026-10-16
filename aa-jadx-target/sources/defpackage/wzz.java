package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wzz extends defpackage.mr {
    final /* synthetic */ defpackage.xaa s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzz(defpackage.xaa xaaVar, android.view.View view) {
        super(view);
        this.s = xaaVar;
        android.view.View viewFindViewById = view.findViewById(2131429183);
        viewFindViewById.setOnClickListener(new defpackage.wzy(this, viewFindViewById, view.findViewById(2131429554)));
    }
}
