package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
final class ajur implements ajuq {
    final /* synthetic */ String a;
    final /* synthetic */ ajus b;

    public ajur(ajus ajusVar, String str) {
        this.a = str;
        this.b = ajusVar;
    }

    @Override // defpackage.ajuq
    public final ajuo b(akba akbaVar) {
        akas akasVarHX = ((ajph) akbaVar.v("http.request")).hX();
        String str = this.a;
        ahgm.e(str, "Name");
        ajup ajupVar = (ajup) this.b.a.get(str.toLowerCase(Locale.ENGLISH));
        if (ajupVar != null) {
            return ajupVar.a(akasVarHX);
        }
        throw new IllegalStateException("Unsupported cookie spec: ".concat(String.valueOf(str)));
    }
}
