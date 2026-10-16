package defpackage;

/* loaded from: classes3.dex */
public class aiom implements aing {
    private final String description;
    private final String name;
    private final afec<afye, aigl> type;

    /* JADX WARN: Multi-variable type inference failed */
    private aiom(String str, afec<? super afye, ? extends aigl> afecVar) {
        this.name = str;
        this.type = afecVar;
        this.description = "must return ".concat(String.valueOf(str));
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        return affa.f(agcjVar.getReturnType(), this.type.invoke(ahvz.getBuiltIns(agcjVar)));
    }

    @Override // defpackage.aing
    public String getDescription() {
        return this.description;
    }

    @Override // defpackage.aing
    public /* bridge */ String invoke(agcj agcjVar) {
        return ainf.invoke(this, agcjVar);
    }

    public /* synthetic */ aiom(String str, afec afecVar, afeu afeuVar) {
        this(str, afecVar);
    }
}
