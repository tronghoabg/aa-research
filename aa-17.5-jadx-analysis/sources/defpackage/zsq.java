package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zsq extends zsm {
    private final zss b;

    public zsq(zss zssVar) {
        this.b = zssVar;
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zsq) {
            return a.C(this.b, ((zsq) obj).b);
        }
        return false;
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final boolean f() {
        return false;
    }

    @Override // defpackage.zsr
    public final int h() {
        return 62;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // defpackage.zsr
    public final void i(DataOutputStream dataOutputStream) throws IOException {
        zss zssVar = this.b;
        zssVar.n();
        zrp.b(dataOutputStream, zssVar.d());
    }

    @Override // defpackage.zsr
    @ResultIgnorabilityUnspecified
    public final void j(DataInputStream dataInputStream) throws IOException {
        acbw acbwVar = acbw.a;
        this.b.o((acbw) zrp.a(abnv.L(acbw.class), dataInputStream));
    }

    @Override // defpackage.zsm
    public final String toString() {
        zss zssVar = this.b;
        return "[" + getClass().getSimpleName() + "@" + zssVar.toString() + "]";
    }
}
