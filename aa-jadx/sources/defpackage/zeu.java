package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zeu extends defpackage.zev {
    final /* synthetic */ java.lang.reflect.TypeVariable a;
    final /* synthetic */ defpackage.zev b;

    public zeu(java.lang.reflect.TypeVariable typeVariable, defpackage.zev zevVar) {
        this.a = typeVariable;
        this.b = zevVar;
    }

    @Override // defpackage.zev
    public final java.lang.reflect.Type a(java.lang.reflect.TypeVariable typeVariable, defpackage.zev zevVar) {
        return typeVariable.getGenericDeclaration().equals(this.a.getGenericDeclaration()) ? typeVariable : this.b.a(typeVariable, zevVar);
    }
}
