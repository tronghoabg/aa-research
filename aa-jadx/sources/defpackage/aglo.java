package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class aglo extends defpackage.affy implements defpackage.affc {
    public static final defpackage.aglo INSTANCE = new defpackage.aglo();

    public aglo() {
        super(1, java.lang.reflect.Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }

    @Override // defpackage.affc
    public final java.lang.Boolean invoke(java.lang.reflect.Member member) {
        member.getClass();
        return java.lang.Boolean.valueOf(member.isSynthetic());
    }
}
