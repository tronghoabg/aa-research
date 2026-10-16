package l.b;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum m implements eg {
    ONBOARDING_API_UNSPECIFIED(0),
    REGISTER(1),
    REGISTER_CONNECT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55785f;

    m(int i2) {
        this.f55785f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f55785f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55785f);
    }
}
