package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zri {
    private final String a;
    private final abpc b;
    private final zrh c;

    public zri(Context context, String str, abpc abpcVar) {
        zrh zrhVar = new zrh(context);
        this.a = str;
        this.b = abpcVar;
        this.c = zrhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized abow a() {
        abow abowVarG;
        byte[] bArrB = this.c.b(this.a);
        abowVarG = null;
        abowVarG = null;
        if (bArrB != null) {
            try {
                abowVarG = this.b.g(bArrB);
            } catch (abon unused) {
                this.c.a(this.a, null);
            }
        }
        return abowVarG;
    }

    public final synchronized void b(abow abowVar) {
        zrh zrhVar = this.c;
        if (abowVar == null) {
            zrhVar.a(this.a, null);
        } else {
            zrhVar.a(this.a, abowVar.h());
        }
    }
}
