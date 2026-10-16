package defpackage;

import java.lang.reflect.Member;

/* loaded from: classes3.dex */
public final class afpa {
    private final Member callable;
    private final int index;

    public afpa(Member member, int i) {
        member.getClass();
        this.callable = member;
        this.index = i;
    }

    public final Member getCallable() {
        return this.callable;
    }

    public final int getIndex() {
        return this.index;
    }
}
