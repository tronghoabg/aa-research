package androidx.compose.ui.semantics;

import h.g.a.p;
import h.g.b.x;
import h.g.b.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SemanticsProperties$ContentDescription$1 extends y implements p<List<? extends String>, List<? extends String>, List<? extends String>> {
    public static final SemanticsProperties$ContentDescription$1 INSTANCE = new SemanticsProperties$ContentDescription$1();

    SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<String> invoke2(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        List<String> list3 = list;
        x.f(list3, "<this>");
        ArrayList arrayList = new ArrayList(list3);
        arrayList.addAll(list2);
        return arrayList;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
        return invoke2((List<String>) list, (List<String>) list2);
    }
}
