package i.b;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum ag implements eg {
    OK(0),
    ERROR(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f48370d;

    ag(int i2) {
        this.f48370d = i2;
    }

    public static ag a(int i2) {
        if (i2 == 0) {
            return OK;
        }
        if (i2 != 1) {
            return null;
        }
        return ERROR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48370d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48370d);
    }
}
