package defpackage;

import java.lang.reflect.Member;

/* loaded from: classes3.dex */
final /* synthetic */ class agko extends afey implements afec {
    public static final agko INSTANCE = new agko();

    public agko() {
        super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }

    @Override // defpackage.afec
    public final Boolean invoke(Member member) {
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
