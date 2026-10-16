package defpackage;

/* loaded from: classes3.dex */
public final class thu extends afde implements afeg {
    /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thu(afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.b != 0) {
            thu thuVar = new thu(afckVar, 1, null);
            thuVar.a = ((Boolean) obj).booleanValue();
            return thuVar;
        }
        thu thuVar2 = new thu(afckVar, 0);
        thuVar2.a = ((Boolean) obj).booleanValue();
        return thuVar2;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.b != 0) {
            woy.dF(obj);
            return Boolean.valueOf(this.a);
        }
        woy.dF(obj);
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.b != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((thu) b(bool, (afck) obj2)).hT(afak.a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((thu) b(bool2, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thu(afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
    }
}
