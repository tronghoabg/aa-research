package defpackage;

/* loaded from: classes3.dex */
public abstract class aiot implements aing {
    private final String description;

    private aiot(String str) {
        this.description = str;
    }

    @Override // defpackage.aing
    public String getDescription() {
        return this.description;
    }

    @Override // defpackage.aing
    public /* bridge */ String invoke(agcj agcjVar) {
        return ainf.invoke(this, agcjVar);
    }

    public /* synthetic */ aiot(String str, afeu afeuVar) {
        this(str);
    }
}
