package defpackage;

/* loaded from: classes2.dex */
public final class ajvt extends ajvh {
    private ajvs b;
    private String c;

    public ajvt() {
        byte[] bArr = ajvr.a;
        this.b = ajvs.a;
        this.c = null;
    }

    @Override // defpackage.ajpy
    public final String a() {
        return null;
    }

    @Override // defpackage.ajpy
    public final String b() {
        return "ntlm";
    }

    @Override // defpackage.ajpy
    public final ajoy c(ajqj ajqjVar, ajph ajphVar) throws ajqf {
        try {
            ajvs ajvsVar = this.b;
            if (ajvsVar == ajvs.f) {
                throw new ajqf("NTLM authentication failed");
            }
            if (ajvsVar == ajvs.b || ajvsVar == ajvs.d) {
                throw null;
            }
            throw new ajqf("Unexpected state: ".concat(String.valueOf(String.valueOf(ajvsVar))));
        } catch (ClassCastException unused) {
            throw new ajqk("Credentials cannot be used for NTLM authentication: ".concat(String.valueOf(ajqjVar.getClass().getName())));
        }
    }

    @Override // defpackage.ajpy
    public final boolean e() {
        ajvs ajvsVar = this.b;
        return ajvsVar == ajvs.e || ajvsVar == ajvs.f;
    }

    @Override // defpackage.ajpy
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ajvh
    protected final void h(akbh akbhVar, int i, int i2) throws ajqm {
        String strD = akbhVar.d(i, i2);
        this.c = strD;
        boolean zIsEmpty = strD.isEmpty();
        ajvs ajvsVar = this.b;
        if (zIsEmpty) {
            if (ajvsVar == ajvs.a) {
                this.b = ajvs.b;
                return;
            } else {
                this.b = ajvs.f;
                return;
            }
        }
        ajvs ajvsVar2 = ajvs.c;
        if (ajvsVar.compareTo(ajvsVar2) < 0) {
            this.b = ajvs.f;
            throw new ajqm("Out of sequence NTLM response message");
        }
        if (this.b == ajvsVar2) {
            this.b = ajvs.d;
        }
    }
}
