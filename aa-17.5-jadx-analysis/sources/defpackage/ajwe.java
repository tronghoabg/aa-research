package defpackage;

@Deprecated
/* loaded from: classes2.dex */
public final class ajwe extends akaq {
    protected final akas a;
    protected final akas b;

    public ajwe(akas akasVar, akas akasVar2) {
        this.a = akasVar;
        this.b = akasVar2;
    }

    @Override // defpackage.akas
    public final Object a(String str) {
        akas akasVar;
        akas akasVar2 = this.b;
        Object objA = akasVar2 != null ? akasVar2.a(str) : null;
        return (objA != null || (akasVar = this.a) == null) ? objA : akasVar.a(str);
    }

    @Override // defpackage.akas
    public final void b(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
