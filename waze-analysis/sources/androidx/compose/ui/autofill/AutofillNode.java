package androidx.compose.ui.autofill;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutofillNode {
    public static final int $stable = 8;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final l<String, ab> onFill;

    public /* synthetic */ AutofillNode(List list, Rect rect, l lVar, int i2, o oVar) {
        this((i2 & 1) != 0 ? i.h() : list, (i2 & 2) != 0 ? null : rect, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return x.n(this.autofillTypes, autofillNode.autofillTypes) && x.n(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    public final l<String, ab> getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int iHashCode2 = (iHashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        l<String, ab> lVar = this.onFill;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> list, Rect rect, l<? super String, ab> lVar) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = lVar;
        this.id = SemanticsModifierKt.generateSemanticsId();
    }
}
