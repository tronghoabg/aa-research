package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes3.dex */
public final class yky extends yla implements yig {
    private static final long serialVersionUID = 0;

    public yky(yig yigVar) {
        super(yigVar);
    }

    @Override // defpackage.yla, defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yla, defpackage.yek
    /* renamed from: e */
    public final /* synthetic */ yks d() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yig, yks] */
    @Override // defpackage.yla, defpackage.yek, defpackage.yks
    /* renamed from: f */
    public final List c(Object obj) {
        return DesugarCollections.unmodifiableList(this.a.c(obj));
    }

    @Override // defpackage.yig
    public final List g(Object obj) {
        throw null;
    }
}
