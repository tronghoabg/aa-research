package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jsx extends defpackage.op {
    final /* synthetic */ defpackage.afer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsx(defpackage.afer aferVar) {
        super(true);
        this.a = aferVar;
    }

    @Override // defpackage.op
    public final void b() {
        this.a.invoke();
    }
}
