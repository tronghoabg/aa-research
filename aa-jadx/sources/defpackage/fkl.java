package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fkl extends defpackage.faq {
    public static final defpackage.fkl c = new defpackage.fkl();

    private fkl() {
        super(12, 13);
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        fbsVar.e("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        fbsVar.e("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
