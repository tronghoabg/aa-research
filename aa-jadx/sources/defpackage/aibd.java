package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aibd {
    private final defpackage.ahmd nameResolver;
    private final defpackage.agex source;
    private final defpackage.ahmh typeTable;

    private aibd(defpackage.ahmd ahmdVar, defpackage.ahmh ahmhVar, defpackage.agex agexVar) {
        this.nameResolver = ahmdVar;
        this.typeTable = ahmhVar;
        this.source = agexVar;
    }

    public abstract defpackage.ahof debugFqName();

    public final defpackage.ahmd getNameResolver() {
        return this.nameResolver;
    }

    public final defpackage.agex getSource() {
        return this.source;
    }

    public final defpackage.ahmh getTypeTable() {
        return this.typeTable;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }

    public /* synthetic */ aibd(defpackage.ahmd ahmdVar, defpackage.ahmh ahmhVar, defpackage.agex agexVar, defpackage.affu affuVar) {
        this(ahmdVar, ahmhVar, agexVar);
    }
}
