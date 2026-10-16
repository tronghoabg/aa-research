package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bzq extends cax {
    public static final bzq a = new bzq();

    private bzq() {
        super(0, 2);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        int i = ((ccu) cbaVar.c(0)).a;
        List list = (List) cbaVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            bujVar.i(i3, obj);
            bujVar.j(i3, obj);
        }
    }
}
