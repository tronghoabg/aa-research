package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class baq extends bbt {
    public static final cdt b = byx.t(new abp(6), new awf(9));
    public final bwq a;

    public baq(int i, float f, afdr afdrVar) {
        super(i, f);
        this.a = new ParcelableSnapshotMutableState(afdrVar, bxp.c);
    }

    @Override // defpackage.bbt
    public final int b() {
        return ((Number) ((afdr) this.a.a()).invoke()).intValue();
    }
}
