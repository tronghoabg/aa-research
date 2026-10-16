package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible, Dimension {
    public static final int $stable = 8;
    private final DimensionSymbol max;
    private final DimensionSymbol min;
    private final DimensionSymbol valueSymbol;

    private DimensionDescription(Dp dp, String str) {
        this.valueSymbol = new DimensionSymbol(dp, str, TtmlNode.RUBY_BASE, null);
        this.min = new DimensionSymbol(null, null, "min", null);
        this.max = new DimensionSymbol(null, null, "max", null);
    }

    public final CLElement asCLElement$constraintlayout_compose() {
        if (this.min.isUndefined() && this.max.isUndefined()) {
            return this.valueSymbol.asCLElement();
        }
        CLObject cLObject = new CLObject(new char[0]);
        if (!this.min.isUndefined()) {
            cLObject.put("min", this.min.asCLElement());
        }
        if (!this.max.isUndefined()) {
            cLObject.put("max", this.max.asCLElement());
        }
        cLObject.put("value", this.valueSymbol.asCLElement());
        return cLObject;
    }

    public final DimensionSymbol getMax$constraintlayout_compose() {
        return this.max;
    }

    public final DimensionSymbol getMin$constraintlayout_compose() {
        return this.min;
    }

    public /* synthetic */ DimensionDescription(float f2, o oVar) {
        this(f2);
    }

    private DimensionDescription(float f2) {
        this(Dp.m11162boximpl(f2), (String) null);
    }

    public DimensionDescription(String str) {
        this((Dp) null, str);
    }
}
