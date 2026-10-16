package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import java.util.List;

/* loaded from: classes2.dex */
public final class jya extends afde implements afeh {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ geu c;
    final /* synthetic */ String d;
    final /* synthetic */ ConversationItem e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(afck afckVar, geu geuVar, String str, ConversationItem conversationItem) {
        super(3, afckVar);
        this.c = geuVar;
        this.d = str;
        this.e = conversationItem;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [aiyl, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        jxz jxzVar;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            ?? r8 = this.f;
            List list = (List) this.b;
            if (list == null) {
                jxzVar = new jxz(dtx.m(lwo.a.a().d(lvd.c().d(this.d, jxt.c(this.c, this.e), null, null), (int) actj.d())), 0);
            } else {
                jxzVar = list.isEmpty() ? new jxz(null, 4) : new jxz(list.get(0), 4);
            }
            this.a = 1;
            if (aimr.c(r8, jxzVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jya jyaVar = new jya((afck) obj3, this.c, this.d, this.e);
        jyaVar.f = (aiyl) obj;
        jyaVar.b = obj2;
        return jyaVar.hT(afak.a);
    }
}
