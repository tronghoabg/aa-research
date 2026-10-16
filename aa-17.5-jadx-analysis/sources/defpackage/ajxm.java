package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxm implements ajzv {
    private final ajzv a;
    private final ajxo b;
    private final String c;

    public ajxm(ajzv ajzvVar, ajxo ajxoVar, String str) {
        this.a = ajzvVar;
        this.b = ajxoVar;
        this.c = str == null ? ajox.b.name() : str;
    }

    @Override // defpackage.ajzv
    public final void a() throws IOException {
        this.a.a();
    }

    @Override // defpackage.ajzv
    public final void b(int i) throws IOException {
        this.a.b(i);
        ajxo ajxoVar = this.b;
        if (ajxoVar.d()) {
            ajxoVar.b(new byte[]{(byte) i});
        }
    }

    @Override // defpackage.ajzv
    public final void c(byte[] bArr, int i, int i2) throws IOException {
        this.a.c(bArr, i, i2);
        ajxo ajxoVar = this.b;
        if (ajxoVar.d()) {
            ahgm.e(bArr, "Output");
            ajxoVar.c(">> ", new ByteArrayInputStream(bArr, i, i2));
        }
    }

    @Override // defpackage.ajzv
    public final void d(String str) throws IOException {
        this.a.d(str);
        ajxo ajxoVar = this.b;
        if (ajxoVar.d()) {
            String strValueOf = String.valueOf(str);
            ajxoVar.b(strValueOf.concat("\r\n").getBytes(this.c));
        }
    }

    @Override // defpackage.ajzv
    public final void e(akbh akbhVar) throws IOException {
        this.a.e(akbhVar);
        ajxo ajxoVar = this.b;
        if (ajxoVar.d()) {
            String str = new String(akbhVar.a, 0, akbhVar.b);
            ajxoVar.b(str.concat("\r\n").getBytes(this.c));
        }
    }
}
