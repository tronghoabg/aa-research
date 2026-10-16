package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xyg extends defpackage.xyj {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ defpackage.xyj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyg(defpackage.xyj xyjVar, defpackage.xyj xyjVar2, java.lang.String str) {
        super(xyjVar2);
        this.a = str;
        this.b = xyjVar;
    }

    @Override // defpackage.xyj
    public final java.lang.CharSequence a(java.lang.Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }
}
