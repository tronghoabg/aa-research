package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class aizy implements aizu {
    public final long a;
    private final long b = Long.MAX_VALUE;

    public aizy(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aizy)) {
            return false;
        }
        aizy aizyVar = (aizy) obj;
        if (this.a != aizyVar.a) {
            return false;
        }
        long j = aizyVar.b;
        return true;
    }

    public final int hashCode() {
        return (aipd.a(this.a) * 31) + aipd.a(Long.MAX_VALUE);
    }

    public final String toString() throws IOException {
        afbt afbtVar = new afbt(2);
        long j = this.a;
        if (j > 0) {
            afbtVar.add(a.bI(j, "stopTimeout=", "ms"));
        }
        return "SharingStarted.WhileSubscribed(" + woy.cu(afbtVar.f(), null, null, null, null, 63) + ")";
    }
}
