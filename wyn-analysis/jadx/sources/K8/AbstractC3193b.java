package k8;

/* renamed from: k8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3193b implements InterfaceC3202k {
    public abstract boolean a(char c10);

    @Override // k8.InterfaceC3202k
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
