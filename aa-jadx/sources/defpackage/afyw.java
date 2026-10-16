package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afyw extends defpackage.afze {
    public static final defpackage.afyv Companion = new defpackage.afyv(null);
    private static final defpackage.afar<defpackage.afyw> Instance$delegate = defpackage.afga.cA(defpackage.afyu.INSTANCE);

    public afyw(boolean z) {
        super(new defpackage.aiez("DefaultBuiltIns"));
        if (z) {
            createBuiltInsModule(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afyw Instance_delegate$lambda$0() {
        return new defpackage.afyw(false, 1, null);
    }

    public afyw() {
        this(false, 1, null);
    }

    public /* synthetic */ afyw(boolean z, int i, defpackage.affu affuVar) {
        this(1 == ((z ? 1 : 0) | (i & 1)));
    }
}
