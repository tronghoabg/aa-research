package defpackage;

/* loaded from: classes.dex */
public final class xxa extends xxd {
    final /* synthetic */ String a;
    final /* synthetic */ xxd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxa(xxd xxdVar, xxd xxdVar2, String str) {
        super(xxdVar2);
        this.a = str;
        this.b = xxdVar;
    }

    @Override // defpackage.xxd
    public final CharSequence a(Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }
}
