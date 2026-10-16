package defpackage;

/* loaded from: classes3.dex */
public final class afxw extends afye {
    public static final afxv Companion = new afxv(null);
    private static final aezr<afxw> Instance$delegate = woy.dG(afxu.INSTANCE);

    public afxw(boolean z) {
        super(new aidz("DefaultBuiltIns"));
        if (z) {
            createBuiltInsModule(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afxw Instance_delegate$lambda$0() {
        return new afxw(false, 1, null);
    }

    public afxw() {
        this(false, 1, null);
    }

    public /* synthetic */ afxw(boolean z, int i, afeu afeuVar) {
        this(1 == ((z ? 1 : 0) | (i & 1)));
    }
}
