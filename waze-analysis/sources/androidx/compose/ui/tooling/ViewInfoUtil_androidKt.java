package androidx.compose.ui.tooling;

import androidx.compose.ui.unit.IntRect;
import h.a.i;
import h.b.a;
import h.g.a.l;
import h.n.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewInfoUtil_androidKt {
    private static final List<ViewInfo> filterTree(List<ViewInfo> list, l<? super ViewInfo, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        for (ViewInfo viewInfo : list) {
            List<ViewInfo> listFilterTree = filterTree(viewInfo.getChildren(), lVar);
            ArrayList arrayList2 = new ArrayList();
            for (ViewInfo viewInfo2 : listFilterTree) {
                i.aD(arrayList2, viewInfo2.getLocation() == null ? viewInfo2.getChildren() : i.d(viewInfo2));
            }
            ArrayList arrayList3 = arrayList2;
            i.aD(arrayList, lVar.invoke(viewInfo).booleanValue() ? i.d(new ViewInfo(viewInfo.getFileName(), viewInfo.getLineNumber(), viewInfo.getBounds(), viewInfo.getLocation(), arrayList3, viewInfo.getLayoutInfo(), viewInfo.getName())) : i.d(new ViewInfo("<root>", -1, IntRect.Companion.getZero(), null, arrayList3, null, null)));
        }
        return arrayList;
    }

    static /* synthetic */ List filterTree$default(List list, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return true;
                }
            };
        }
        return filterTree(list, lVar);
    }

    static final boolean filterTree$lambda$0(ViewInfo viewInfo) {
        return true;
    }

    public static final String toDebugString(List<ViewInfo> list, int i2, l<? super ViewInfo, Boolean> lVar) {
        String strJ = o.j(".", i2);
        StringBuilder sb = new StringBuilder();
        for (ViewInfo viewInfo : i.al(filterTree(list, lVar), a.b(new l() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ((ViewInfo) obj).getFileName();
            }
        }, new l() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(((ViewInfo) obj).getLineNumber());
            }
        }, new l() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(((ViewInfo) obj).allChildren().size());
            }
        }))) {
            if (viewInfo.getLocation() != null) {
                sb.append(strJ + '|' + viewInfo.getFileName() + ':' + viewInfo.getLineNumber());
                sb.append('\n');
            } else {
                sb.append(String.valueOf(strJ).concat("|<root>"));
                sb.append('\n');
            }
            String string = o.v(toDebugString(viewInfo.getChildren(), i2 + 1, lVar)).toString();
            if (string.length() > 0) {
                sb.append(string);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String toDebugString$default(List list, int i2, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            lVar = new l() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return true;
                }
            };
        }
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return toDebugString(list, i2, lVar);
    }

    static final boolean toDebugString$lambda$0(ViewInfo viewInfo) {
        return true;
    }
}
