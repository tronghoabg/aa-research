package com.waze.search;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class i extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35973a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(Object obj, int i2) {
        super(1, obj, com.waze.shared_infra.j.a.class, "hasPermission", "hasPermission(Ljava/lang/String;)Z", 0);
        this.f35973a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f35973a;
        if (i2 == 0) {
            String str = (String) obj;
            h.g.b.x.f(str, "p0");
            return Boolean.valueOf(((com.waze.shared_infra.j.a) this.receiver).a(str));
        }
        if (i2 == 1) {
            return ((NativeManager) this.receiver).isCategorySearch((String) obj);
        }
        com.waze.ui.ac.n nVar = (com.waze.ui.ac.n) obj;
        h.g.b.x.f(nVar, "p0");
        return com.waze.sharedui.utils.o.a((com.waze.shared_infra.o.a) this.receiver, nVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(Object obj, int i2, byte[] bArr) {
        super(1, obj, NativeManager.class, "isCategorySearch", "isCategorySearch(Ljava/lang/String;)Ljava/lang/String;", 0);
        this.f35973a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(Object obj, int i2, char[] cArr) {
        super(1, obj, com.waze.sharedui.utils.o.class, "resString", "resString(Lcom/waze/shared_infra/string/StringProvider;Lcom/waze/ui/types/TextSource;)Ljava/lang/String;", 1);
        this.f35973a = i2;
    }
}
