package defpackage;

/* loaded from: classes2.dex */
public final class aitv extends afcg implements aiwi {
    public static final ezh b = new ezh();
    public final long a;

    public aitv(long j) {
        super(b);
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aitv) && this.a == ((aitv) obj).a;
    }

    @Override // defpackage.aiwi
    public final /* bridge */ /* synthetic */ Object hC(afco afcoVar) {
        aitw aitwVar = (aitw) afcoVar.get(aitw.b);
        String str = aitwVar != null ? aitwVar.a : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iF = afyh.F(name, " @", 0, 6);
        if (iF < 0) {
            iF = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iF + 10);
        String strSubstring = name.substring(0, iF);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.aiwi
    public final /* bridge */ /* synthetic */ void hD(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final int hashCode() {
        return a.g(this.a);
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ")";
    }
}
