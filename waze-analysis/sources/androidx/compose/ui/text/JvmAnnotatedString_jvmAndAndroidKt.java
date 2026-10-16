package androidx.compose.ui.text;

import androidx.collection.IntIntMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.compose.ui.text.AnnotatedString;
import h.a.am;
import h.a.c;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.aq;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmAndAndroidKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnnotatedString.Range<?> range = list.get(i2);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    public static final AnnotatedString transform(final AnnotatedString annotatedString, final q<? super String, ? super Integer, ? super Integer, String> qVar) {
        ArrayList arrayList;
        Integer[] numArr = {0, Integer.valueOf(annotatedString.getText().length())};
        x.f(numArr, "elements");
        SortedSet treeSet = new TreeSet();
        c.aJ(numArr, treeSet);
        SortedSet sortedSet = (TreeSet) treeSet;
        collectRangeTransitions(annotatedString.getAnnotations$ui_text(), sortedSet);
        final aq aqVar = new aq();
        aqVar.f48105a = "";
        final MutableIntIntMap mutableIntIntMapMutableIntIntMapOf = IntIntMapKt.mutableIntIntMapOf();
        mutableIntIntMapMutableIntIntMapOf.set(0, 0);
        SortedSet sortedSet2 = sortedSet;
        l lVar = new l() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmAndAndroidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return JvmAnnotatedString_jvmAndAndroidKt.transform$lambda$0(aqVar, qVar, annotatedString, mutableIntIntMapMutableIntIntMapOf, (List) obj);
            }
        };
        x.f(sortedSet2, "<this>");
        x.f(lVar, "transform");
        if ((sortedSet2 instanceof RandomAccess) && (sortedSet2 instanceof List)) {
            List list = (List) sortedSet2;
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            am amVar = new am(list);
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = n.i(2, size - i2);
                if (i3 < 2) {
                    break;
                }
                amVar.a(i2, i3 + i2);
                arrayList2.add(lVar.invoke(amVar));
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator itAN = c.aN(sortedSet2.iterator(), 1, false, true);
            while (itAN.hasNext()) {
                arrayList3.add(lVar.invoke((List) itAN.next()));
            }
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text = annotatedString.getAnnotations$ui_text();
        if (annotations$ui_text != null) {
            ArrayList arrayList4 = new ArrayList(annotations$ui_text.size());
            int size2 = annotations$ui_text.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text.get(i4);
                arrayList4.add(new AnnotatedString.Range(range.getItem(), mutableIntIntMapMutableIntIntMapOf.get(range.getStart()), mutableIntIntMapMutableIntIntMapOf.get(range.getEnd())));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return new AnnotatedString(arrayList, (String) aqVar.f48105a);
    }

    static final ab transform$lambda$0(aq aqVar, q qVar, AnnotatedString annotatedString, MutableIntIntMap mutableIntIntMap, List list) {
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        aqVar.f48105a = String.valueOf((String) aqVar.f48105a).concat(String.valueOf((String) qVar.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2))));
        mutableIntIntMap.put(iIntValue2, ((String) aqVar.f48105a).length());
        return ab.f48028a;
    }
}
