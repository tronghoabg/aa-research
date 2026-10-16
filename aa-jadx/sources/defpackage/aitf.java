package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aitf implements defpackage.aisp {
    public final java.lang.CharSequence a;
    public final int b;
    public final defpackage.affg c;

    public aitf(java.lang.CharSequence charSequence, int i, defpackage.affg affgVar) {
        this.a = charSequence;
        this.b = i;
        this.c = affgVar;
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return new defpackage.aite(this);
    }
}
