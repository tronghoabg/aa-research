package defpackage;

import java.util.regex.Matcher;

/* loaded from: classes3.dex */
final class xxu extends xvz {
    final /* synthetic */ oct g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxu(xxx xxxVar, CharSequence charSequence, oct octVar) {
        super(xxxVar, charSequence);
        this.g = octVar;
    }

    @Override // defpackage.xvz
    public final int a(int i) {
        return ((Matcher) this.g.a).end();
    }

    @Override // defpackage.xvz
    public final int b(int i) {
        Matcher matcher = (Matcher) this.g.a;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
