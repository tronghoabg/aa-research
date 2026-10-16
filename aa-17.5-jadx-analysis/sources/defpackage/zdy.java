package defpackage;

import java.io.Serializable;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zdy extends yen implements Serializable {
    private static final long serialVersionUID = 0;
    public final /* synthetic */ zdz a;
    private transient ygr b;

    public zdy(zdz zdzVar) {
        this.a = zdzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yel
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set d() {
        ygr ygrVar = this.b;
        if (ygrVar != null) {
            return ygrVar;
        }
        ygr ygrVarM = ygr.m(yeb.d(zdw.a.d(yfq.q(this.a))).c(zdx.a).h());
        this.b = ygrVarM;
        return ygrVarM;
    }
}
