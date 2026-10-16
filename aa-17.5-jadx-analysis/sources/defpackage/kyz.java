package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class kyz implements kwx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kyz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.kwx
    public final void a(Object obj) {
        int i = this.b;
        char c = 1;
        if (i == 0) {
            boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
            Object obj2 = this.a;
            if (zEquals) {
                ((kzc) obj2).f(5, new kyz(obj2, c == true ? 1 : 0), String.class);
                return;
            }
            kzc kzcVar = (kzc) obj2;
            kzcVar.a.edit().remove("AssistantPrimaryLanguage").apply();
            kzc.h(kzcVar.e, null);
            return;
        }
        if (i == 1) {
            String str = (String) obj;
            kzc kzcVar2 = (kzc) this.a;
            kzcVar2.a.edit().putString("AssistantPrimaryLanguage", str).apply();
            kzc.h(kzcVar2.e, str);
            return;
        }
        if (i == 2) {
            Boolean bool = (Boolean) obj;
            ((kzc) this.a).c = bool != null && bool.booleanValue();
            return;
        }
        boolean zEquals2 = Boolean.TRUE.equals((Boolean) obj);
        lwi lwiVar = (lwi) this.a;
        lwiVar.a = zEquals2;
        Iterator it = lwiVar.b.iterator();
        while (it.hasNext()) {
            ((lwh) it.next()).a(lwiVar.a);
        }
    }
}
