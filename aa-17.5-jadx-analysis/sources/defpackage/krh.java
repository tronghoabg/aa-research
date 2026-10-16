package defpackage;

import android.database.Cursor;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class krh implements kqw {
    private static final yph b = yph.c("GH.ContactsManagerImpl");
    private kqy c;
    private boolean d;
    public final Set a = new CopyOnWriteArraySet();
    private final ajmd e = new ajmd(this);

    @Override // defpackage.kqw
    public final yfq a() {
        kre kreVar = (kre) this.c;
        Cursor cursor = kreVar.g;
        if (cursor != null) {
            return kreVar.f(cursor);
        }
        ((ype) kre.a.l().ai((char) 3416)).u("Returning empty list. The cursor has not been initialized yet");
        int i = yfq.d;
        return yls.a;
    }

    @Override // defpackage.kqw
    public final void b(kqv kqvVar) {
        this.a.add(kqvVar);
    }

    @Override // defpackage.kqw
    public final void c(kqv kqvVar) {
        this.a.remove(kqvVar);
    }

    @Override // defpackage.kqw
    public final void d() {
        if (this.d) {
            this.d = false;
            kqy kqyVar = this.c;
            ((kre) kqyVar).b.remove(this.e);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((kqv) it.next()).b();
            }
            kre kreVar = (kre) this.c;
            if (!kreVar.e || kreVar.f) {
                throw new IllegalStateException("ContactsStore already disposed:");
            }
            kreVar.f = true;
            kreVar.c.b(kreVar.d.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [esl, kqy] */
    @Override // defpackage.kqw
    @ResultIgnorabilityUnspecified
    public final boolean e() {
        if (!lgv.c().i()) {
            ((ype) ((ype) b.h()).ai((char) 3419)).u("Start called without Contacts permission.");
            return false;
        }
        woy.Z(!this.d);
        this.d = true;
        ?? F = f();
        this.c = F;
        kre kreVar = (kre) F;
        boolean z = kreVar.e;
        if (z || kreVar.f) {
            throw new IllegalStateException("ContactsStore initialized:" + z + " disposed:" + kreVar.f);
        }
        kreVar.e = true;
        kreVar.c.e(kreVar.d.f, null, F);
        kqy kqyVar = this.c;
        ajmd ajmdVar = this.e;
        kre kreVar2 = (kre) kqyVar;
        kreVar2.b.add(ajmdVar);
        if (kreVar2.g != null) {
            ajmdVar.B();
        }
        return true;
    }

    protected abstract kqy f();
}
