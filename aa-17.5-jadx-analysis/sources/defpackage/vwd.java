package defpackage;

/* loaded from: classes3.dex */
public final class vwd extends vmc {
    public vwd(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vmc
    protected final String e() {
        ajfg ajfgVar;
        int i;
        ajfg ajfgVar2;
        ajgu ajguVar = this.a;
        ajfh ajfhVar = ajguVar.h;
        if (ajfhVar == null) {
            ajfhVar = ajfh.a;
        }
        if (ajfhVar.b.size() == 0) {
            return "FIXME: network event without network usage";
        }
        long j = 0;
        ajfi ajfiVar = null;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (ajfg ajfgVar3 : ajfhVar.b) {
            if ((ajfgVar3.b & 4194304) != 0 && (ajfiVar = ajfgVar3.z) == null) {
                ajfiVar = ajfi.a;
            }
            int i3 = ajfgVar3.b;
            if ((i3 & 32) != 0) {
                i2 = ajfgVar3.j;
            }
            if ((i3 & 64) != 0) {
                ajfgVar = ajfgVar3;
                j += ajfgVar3.k;
            } else {
                ajfgVar = ajfgVar3;
            }
            if ((i3 & 128) != 0) {
                ajfgVar2 = ajfgVar;
                i = i3;
                j2 += ajfgVar2.l;
            } else {
                i = i3;
                ajfgVar2 = ajfgVar;
            }
            if ((i & 16) != 0) {
                j3 = ajfgVar2.i;
            }
            if ((i & 8) != 0) {
                j4 = ajfgVar2.h;
            }
        }
        ajfh ajfhVar2 = ajguVar.h;
        if (ajfhVar2 == null) {
            ajfhVar2 = ajfh.a;
        }
        ajfg ajfgVar4 = (ajfg) ajfhVar2.b.get(0);
        int i4 = ajfgVar4.b;
        String str = (i4 & 4) != 0 ? ajfgVar4.g : null;
        if ((524288 & i4) != 0) {
            str = ajfgVar4.w;
        }
        if ((i4 & 2) != 0) {
            str = ajfgVar4.f;
        }
        xxd xxdVar = new xxd(", ");
        return new xxb(xxdVar, xxdVar).e(ajfiVar != null ? "RPC Status Code: " + ajfiVar.c : null, i2 > 0 ? a.bp(i2, "HTTP Status Code: ") : null, j > 0 ? "Downloaded: ".concat(b(Long.valueOf(j))) : null, j2 > 0 ? "Uploaded: ".concat(b(Long.valueOf(j2))) : null, j3 > 0 ? "Time To First Header: ".concat(f(Long.valueOf(j3))) : null, j4 > 0 ? "Time To Finish: ".concat(f(Long.valueOf(j4))) : null, str != null ? "URL: ".concat(str) : null);
    }

    @Override // defpackage.vmc
    protected final String g() {
        return (String) xxh.g(c()).d("Network event");
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 32) != 0;
    }
}
