package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class ykg extends ynm {
    final /* synthetic */ xwx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykg(Iterator it, xwx xwxVar) {
        super(it);
        this.a = xwxVar;
    }

    @Override // defpackage.ynm
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, this.a.a(obj));
    }
}
