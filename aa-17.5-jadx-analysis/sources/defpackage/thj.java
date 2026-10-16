package defpackage;

/* loaded from: classes3.dex */
public class thj extends thh {
    public static final yob h = yob.c("com/google/android/libraries/auto/template/ModelScreen");
    public eqj i;

    public thj(qn qnVar, String str, tho thoVar, afec afecVar) {
        this(qnVar, thoVar, afecVar);
        this.b.c(new ndk(str, 1));
    }

    @Override // defpackage.qw
    public final wb h() {
        eqj eqjVar = this.i;
        if (eqjVar == null) {
            affa.d("templateLiveData");
            eqjVar = null;
        }
        Object objE = eqjVar.e();
        if (objE != null) {
            return (wb) objE;
        }
        throw new IllegalStateException("LiveData must not return a null Template");
    }

    public thj(qn qnVar, tho thoVar, afec afecVar, byte[] bArr) {
        this(qnVar, thoVar, afecVar);
        this.b.c(new lya());
    }

    public thj(qn qnVar, tho thoVar, afec afecVar) {
        super(qnVar);
        this.b.c(new thi(this, thoVar, afecVar));
    }
}
