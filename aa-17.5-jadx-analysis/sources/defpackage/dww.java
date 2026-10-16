package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class dww extends afde implements afeg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dww(afck afckVar, int i) {
        super(2, afckVar);
        this.a = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new dww(afckVar, 5, (boolean[]) null) : new dww(afckVar, 4, (int[]) null) : new dww(afckVar, 3, (short[]) null) : new dww(afckVar, 2, (char[]) null) : new dww(afckVar, 1, (byte[]) null) : new dww(afckVar, 0);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.a;
        if (i == 0) {
            woy.dF(obj);
            return afak.a;
        }
        if (i == 1) {
            woy.dF(obj);
            return Choreographer.getInstance();
        }
        if (i == 2) {
            woy.dF(obj);
            return afak.a;
        }
        if (i == 3) {
            woy.dF(obj);
            return afak.a;
        }
        if (i != 4) {
            woy.dF(obj);
            return afak.a;
        }
        woy.dF(obj);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            ((Boolean) obj).booleanValue();
            return new dww((afck) obj2, 0).hT(afak.a);
        }
        if (i == 1) {
            return new dww((afck) obj2, 1, (byte[]) null).hT(afak.a);
        }
        if (i == 2) {
            ((Number) obj).floatValue();
            return new dww((afck) obj2, 2, (char[]) null).hT(afak.a);
        }
        if (i == 3) {
            ((Number) obj).floatValue();
            return new dww((afck) obj2, 3, (short[]) null).hT(afak.a);
        }
        if (i != 4) {
            ((Number) obj).intValue();
            return new dww((afck) obj2, 5, (boolean[]) null).hT(afak.a);
        }
        ((Number) obj).intValue();
        return new dww((afck) obj2, 4, (int[]) null).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dww(afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dww(afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dww(afck afckVar, int i, int[] iArr) {
        super(2, afckVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dww(afck afckVar, int i, short[] sArr) {
        super(2, afckVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dww(afck afckVar, int i, boolean[] zArr) {
        super(2, afckVar);
        this.a = i;
    }
}
