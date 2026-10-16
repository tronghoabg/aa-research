package defpackage;

import java.lang.reflect.Member;

/* loaded from: classes3.dex */
final /* synthetic */ class agkq extends afey implements afec {
    public static final agkq INSTANCE = new agkq();

    public agkq() {
        super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }

    @Override // defpackage.afec
    public final Boolean invoke(Member member) {
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
