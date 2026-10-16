package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class vo {
    public Object a;

    public /* synthetic */ vo(byte[] bArr) {
        this(new ParcelableSnapshotMutableState(null, bxp.c));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ywf] */
    public final qai a() {
        ?? r1 = this.a;
        if (r1 != 0) {
            return new qai(r1);
        }
        throw new IllegalStateException();
    }

    public final void b(ywf ywfVar) {
        ywfVar.getClass();
        this.a = ywfVar;
    }

    public vo(bwq bwqVar) {
        this.a = bwqVar;
    }

    public vo(char[] cArr) {
    }

    public vo() {
        this((byte[]) null);
    }
}
