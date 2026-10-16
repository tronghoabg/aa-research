package defpackage;

import android.graphics.Shader;

/* loaded from: classes.dex */
public abstract class ckt extends cjs {
    private long a = 9205357640488583168L;
    private un b;

    @Override // defpackage.cjs
    public final void a(long j, cjk cjkVar, float f) {
        un unVar = this.b;
        if (unVar == null || this.a != j) {
            if (cjd.d(j)) {
                this.b = null;
                this.a = 9205357640488583168L;
                unVar = null;
            } else {
                unVar = this.b;
                if (unVar == null) {
                    unVar = new un();
                    this.b = unVar;
                }
                unVar.a = b(j);
                this.b = unVar;
                this.a = j;
            }
        }
        if (cjkVar.g() != -72057594037927936L) {
            cjkVar.j(-72057594037927936L);
        }
        if (!affa.f(cjkVar.c, unVar != null ? unVar.a : null)) {
            cjkVar.m((Shader) (unVar != null ? unVar.a : null));
        }
        if (cjkVar.a() == f) {
            return;
        }
        cjkVar.h(f);
    }

    public abstract Shader b(long j);
}
