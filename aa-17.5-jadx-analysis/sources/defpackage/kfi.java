package defpackage;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.database.ContentObserver;

/* loaded from: classes.dex */
public final class kfi extends eqj {
    public static final yph a = yph.c("GH.CntntPrvdrQryLvDt");
    private final kfk h;
    private final ContentResolver i;
    private final AsyncQueryHandler j;
    private final int k;
    private final ContentObserver l = new kfg(this, wer.a());

    public kfi(int i, ContentResolver contentResolver, kfk kfkVar, kfj kfjVar) {
        this.k = i;
        this.i = contentResolver;
        this.h = kfkVar;
        this.j = new kfh(this, contentResolver, kfjVar);
    }

    public final void a() {
        AsyncQueryHandler asyncQueryHandler = this.j;
        int i = this.k;
        asyncQueryHandler.cancelOperation(i);
        kfk kfkVar = this.h;
        String[] strArr = (String[]) kfkVar.b.toArray(new String[0]);
        String[] strArr2 = (String[]) kfkVar.d.toArray(new String[0]);
        String str = kfkVar.e;
        asyncQueryHandler.startQuery(i, null, kfkVar.a, strArr, kfkVar.c, strArr2, str);
    }

    @Override // defpackage.eqj
    protected final void c() {
        try {
            this.i.registerContentObserver(this.h.a, true, this.l);
            a();
        } catch (SecurityException unused) {
            this.j.cancelOperation(this.k);
            String authority = this.h.a.getAuthority();
            ((ype) ((ype) a.g()).ai((char) 2988)).y("Failed to access ContentProvider (authority=%s)", authority);
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CONTENT_PROVIDER_QUERY, yzy.Jt);
            rrbVarH.p(new ComponentName(authority, ""));
            ohsVarJ.F(rrbVarH.l());
        }
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.j.cancelOperation(this.k);
        try {
            this.i.unregisterContentObserver(this.l);
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2991)).u("Failed to unregister from ContentProvider");
        }
    }
}
