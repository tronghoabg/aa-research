package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1382a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(InterfaceC1385b0 interfaceC1385b0) {
        AbstractC1404v abstractC1404v = (AbstractC1404v) this;
        int i5 = abstractC1404v.memoizedSerializedSize;
        if (i5 != -1) {
            return i5;
        }
        int iD = interfaceC1385b0.d(this);
        abstractC1404v.memoizedSerializedSize = iD;
        return iD;
    }

    public abstract void c(C1393j c1393j);
}
