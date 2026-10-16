package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public class qaj {
    private abkz a;
    private String b;
    private final abnp c;

    public qaj(byte[] bArr) {
        this();
        int i = yfq.d;
        yfq yfqVar = yls.a;
        this.c = zbd.a.n();
    }

    public final synchronized abkz a() {
        return this.a;
    }

    public final synchronized String b() {
        return this.b;
    }

    public final synchronized void c(String str) {
        this.b = str;
    }

    @Deprecated
    public final synchronized void d(abkz abkzVar) {
        this.a = abkzVar;
    }

    public final synchronized void e(zbi zbiVar) {
        if (zbiVar != null) {
            abnp abnpVarG = g();
            abnpVarG.t();
            abkz abkzVar = (abkz) abnpVarG.b;
            abkz abkzVar2 = abkz.a;
            abkzVar.f = zbiVar;
            abkzVar.b |= 4194304;
            this.a = (abkz) abnpVarG.q();
        }
    }

    public boolean f() {
        return false;
    }

    protected final synchronized abnp g() {
        abkz abkzVar = this.a;
        if (abkzVar != null) {
            return abkzVar.K();
        }
        return abkz.a.n();
    }

    public final synchronized int h() {
        return ((zbd) this.c.b).c;
    }

    public final synchronized boolean i() {
        return (((zbd) this.c.b).b & 4) != 0;
    }

    public final synchronized void j(zau zauVar) {
        abnp abnpVar = this.c;
        abnpVar.t();
        zbd zbdVar = (zbd) abnpVar.b;
        zbd zbdVar2 = zbd.a;
        zauVar.getClass();
        zbdVar.e = zauVar;
        zbdVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
    }

    public final synchronized void k(int i) {
        abnp abnpVar = this.c;
        abnpVar.t();
        zbd zbdVar = (zbd) abnpVar.b;
        zbd zbdVar2 = zbd.a;
        zbdVar.b |= 4;
        zbdVar.c = i;
    }

    public void l(List list) {
        m(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final synchronized void m(List list) {
        abnp abnpVar = this.c;
        abnpVar.t();
        zbd zbdVar = (zbd) abnpVar.b;
        zbd zbdVar2 = zbd.a;
        zbdVar.d = abpf.b;
        ynp ynpVarListIterator = ((yfq) list).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            qag qagVar = (qag) ynpVarListIterator.next();
            abnp abnpVarN = zbc.a.n();
            zbp zbpVarA = qaf.a(qagVar.a);
            if (zbpVarA != null) {
                abnpVarN.t();
                zbc zbcVar = (zbc) abnpVarN.b;
                zbcVar.c = zbpVarA;
                zbcVar.b |= 1;
            }
            abnpVar.t();
            zbd zbdVar3 = (zbd) abnpVar.b;
            zbc zbcVar2 = (zbc) abnpVarN.q();
            zbcVar2.getClass();
            aboh abohVar = zbdVar3.d;
            if (!abohVar.c()) {
                zbdVar3.d = abnv.I(abohVar);
            }
            zbdVar3.d.add(zbcVar2);
        }
    }

    public qaj() {
    }
}
