package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes3.dex */
public final class zdo extends zdp {
    final /* synthetic */ TypeVariable a;
    final /* synthetic */ zdp b;

    public zdo(TypeVariable typeVariable, zdp zdpVar) {
        this.a = typeVariable;
        this.b = zdpVar;
    }

    @Override // defpackage.zdp
    public final Type a(TypeVariable typeVariable, zdp zdpVar) {
        return typeVariable.getGenericDeclaration().equals(this.a.getGenericDeclaration()) ? typeVariable : this.b.a(typeVariable, zdpVar);
    }
}
