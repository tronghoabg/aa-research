package defpackage;

import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class yhy extends ynn {
    final /* synthetic */ yid a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhy(ListIterator listIterator, yid yidVar) {
        super(listIterator);
        this.a = yidVar;
    }

    @Override // defpackage.ynm
    public final /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // defpackage.ynn, java.util.ListIterator
    public final void set(Object obj) {
        yid yidVar = this.a;
        woy.Z(yidVar.c != null);
        yidVar.c.setValue(obj);
    }
}
