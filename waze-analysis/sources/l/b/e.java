package l.b;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum e implements eg {
    RESULT_STATUS_UNSPECIFIED(0),
    SUCCESS(1),
    FAILURE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55769f;

    e(int i2) {
        this.f55769f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f55769f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55769f);
    }
}
