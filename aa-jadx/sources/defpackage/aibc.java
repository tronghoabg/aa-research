package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aibc extends defpackage.aibd {
    private final defpackage.ahof fqName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibc(defpackage.ahof ahofVar, defpackage.ahmd ahmdVar, defpackage.ahmh ahmhVar, defpackage.agex agexVar) {
        super(ahmdVar, ahmhVar, agexVar, null);
        ahofVar.getClass();
        ahmdVar.getClass();
        ahmhVar.getClass();
        this.fqName = ahofVar;
    }

    @Override // defpackage.aibd
    public defpackage.ahof debugFqName() {
        return this.fqName;
    }
}
