package defpackage;

import android.support.v4.app.Fragment;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class lsg implements pr {
    private final /* synthetic */ int a;

    public /* synthetic */ lsg(int i) {
        this.a = i;
    }

    @Override // defpackage.pr
    public final Object a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((lod) obj).e;
        }
        if (i != 1) {
            return i != 2 ? i != 3 ? i != 4 ? ((Fragment) obj).getHost() : ((lod) obj).h : ((lod) obj).g : ((lod) obj).f;
        }
        List list = (List) obj;
        yph yphVar = lpq.a;
        return list;
    }
}
