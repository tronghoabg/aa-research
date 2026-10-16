package defpackage;

import androidx.car.app.model.Action;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class tjl extends tjo {
    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.k) {
            if (obj instanceof ths) {
                arrayList.add(obj);
            }
        }
        return (Action) ((ths) woy.bN(arrayList)).d();
    }

    @Override // defpackage.tjo
    public final String b() {
        return "Start action";
    }
}
