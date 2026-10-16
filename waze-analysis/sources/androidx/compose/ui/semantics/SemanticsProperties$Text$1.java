package androidx.compose.ui.semantics;

import androidx.compose.ui.text.AnnotatedString;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SemanticsProperties$Text$1 extends y implements p<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>> {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<AnnotatedString> invoke2(List<AnnotatedString> list, List<AnnotatedString> list2) {
        if (list == null) {
            return list2;
        }
        List<AnnotatedString> list3 = list;
        x.f(list3, "<this>");
        ArrayList arrayList = new ArrayList(list3);
        arrayList.addAll(list2);
        return arrayList;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ List<? extends AnnotatedString> invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
        return invoke2((List<AnnotatedString>) list, (List<AnnotatedString>) list2);
    }
}
