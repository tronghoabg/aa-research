package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class svn implements swa {
    public final svm a;
    public final swe b;
    private final Executor c;

    public svn(Executor executor, svm svmVar, swe sweVar) {
        this.c = executor;
        this.a = svmVar;
        this.b = sweVar;
    }

    @Override // defpackage.swa
    public final void a(svz svzVar) {
        this.c.execute(new sbj(this, svzVar, 11, (char[]) null));
    }
}
