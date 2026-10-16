package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wle extends defpackage.lw {
    private java.util.List a;

    @Override // defpackage.lw
    public final int a() {
        java.util.List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void b(java.util.List list) {
        this.a = list;
        g();
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ defpackage.mr f(android.view.ViewGroup viewGroup, int i) {
        return new defpackage.wpo(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.projection.gearhead.R.layout.survey_system_info_item, viewGroup, false));
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ void n(defpackage.mr mrVar, int i) {
        defpackage.dzp dzpVar = (defpackage.dzp) this.a.get(i);
        android.view.View view = ((defpackage.wpo) mrVar).s;
        ((android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.survey_system_info_item_key)).setText((java.lang.CharSequence) dzpVar.a);
        ((android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.survey_system_info_item_value)).setText((java.lang.CharSequence) dzpVar.b);
    }
}
