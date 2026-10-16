package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mef implements defpackage.mdy {
    private final defpackage.mdz a = new defpackage.mdz(0);
    private final defpackage.mdz b;
    private final defpackage.mdz c;

    public mef(android.content.Context context) {
        this.b = new defpackage.mdz(context, 1);
        this.c = new defpackage.mdz(context, 2);
    }

    @Override // defpackage.mdy
    public final defpackage.mdx a() {
        return this.b;
    }

    @Override // defpackage.mdy
    public final defpackage.mdx b() {
        return this.a;
    }

    @Override // defpackage.mdy
    public final defpackage.mdx c() {
        return this.c;
    }
}
