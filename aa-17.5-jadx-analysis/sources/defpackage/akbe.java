package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class akbe implements akbc {
    private final ajpi[] a;
    private final ajpl[] b;

    public akbe(ajpi[] ajpiVarArr, ajpl[] ajplVarArr) {
        int length = ajpiVarArr.length;
        ajpi[] ajpiVarArr2 = new ajpi[length];
        this.a = ajpiVarArr2;
        System.arraycopy(ajpiVarArr, 0, ajpiVarArr2, 0, length);
        int length2 = ajplVarArr.length;
        ajpl[] ajplVarArr2 = new ajpl[length2];
        this.b = ajplVarArr2;
        System.arraycopy(ajplVarArr, 0, ajplVarArr2, 0, length2);
    }

    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        int i = 0;
        while (true) {
            ajpi[] ajpiVarArr = this.a;
            if (i >= ajpiVarArr.length) {
                return;
            }
            ajpiVarArr[i].a(ajphVar, akbaVar);
            i++;
        }
    }

    @Override // defpackage.ajpl
    public final void b(ajpj ajpjVar, akba akbaVar) throws ajpd, IOException {
        int i = 0;
        while (true) {
            ajpl[] ajplVarArr = this.b;
            if (i >= ajplVarArr.length) {
                return;
            }
            ajplVarArr[i].b(ajpjVar, akbaVar);
            i++;
        }
    }
}
