package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class fok implements afec {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    private final /* synthetic */ int d;

    public /* synthetic */ fok(long j, String str, int i) {
        this.d = i;
        this.a = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        fbk fbkVarA;
        if (this.d == 0) {
            fca fcaVar = (fca) obj;
            fcaVar.getClass();
            fbkVarA = fcaVar.a(this.a);
            String str = this.c;
            try {
                fbkVarA.f(1, this.b);
                fbkVarA.h(2, str);
                fbkVarA.k();
                fbkVarA.close();
                return afak.a;
            } finally {
            }
        }
        fca fcaVar2 = (fca) obj;
        fcaVar2.getClass();
        fbkVarA = fcaVar2.a(this.a);
        String str2 = this.c;
        try {
            fbkVarA.f(1, this.b);
            fbkVarA.h(2, str2);
            fbkVarA.k();
            int iK = ckf.k(fcaVar2);
            fbkVarA.close();
            return Integer.valueOf(iK);
        } finally {
        }
    }

    public /* synthetic */ fok(long j, String str, int i, byte[] bArr) {
        this.d = i;
        this.a = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        this.b = j;
        this.c = str;
    }
}
