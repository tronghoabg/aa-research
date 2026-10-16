package h3;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2773a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36043a;

    public C2773a(boolean z2) {
        this.f36043a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2773a)) {
            return false;
        }
        C2773a c2773a = (C2773a) obj;
        c2773a.getClass();
        return this.f36043a == c2773a.f36043a;
    }

    public final int hashCode() {
        return 1169068184 + (this.f36043a ? 1231 : 1237);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f36043a;
    }
}
