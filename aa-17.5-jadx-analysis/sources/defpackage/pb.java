package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class pb extends oy {
    final /* synthetic */ pc a;
    final /* synthetic */ String b;
    final /* synthetic */ pf c;

    public pb(pc pcVar, String str, pf pfVar) {
        this.a = pcVar;
        this.b = str;
        this.c = pfVar;
    }

    @Override // defpackage.oy
    public final void a() {
        this.a.d(this.b);
    }

    @Override // defpackage.oy
    public final void b(Object obj) throws Exception {
        pc pcVar = this.a;
        Map map = pcVar.b;
        pf pfVar = this.c;
        String str = this.b;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new IllegalStateException(a.bw(obj, pfVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int iIntValue = ((Number) obj2).intValue();
        pcVar.c.add(str);
        try {
            pcVar.f(iIntValue, pfVar, obj);
        } catch (Exception e) {
            pc pcVar2 = this.a;
            pcVar2.c.remove(this.b);
            throw e;
        }
    }
}
