package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLString;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DimensionSymbol {
    public static final int $stable = 8;
    private final String debugName;
    private String symbol;
    private Dp value;

    private DimensionSymbol(Dp dp, String str, String str2) {
        this.value = dp;
        this.symbol = str;
        this.debugName = str2;
    }

    public final CLElement asCLElement() {
        Dp dp = this.value;
        if (dp != null) {
            return new CLNumber(dp.m11178unboximpl());
        }
        String str = this.symbol;
        if (str != null) {
            return CLString.from(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.debugName + ". Using WrapContent.");
        return CLString.from("wrap");
    }

    public final boolean isUndefined() {
        return this.value == null && this.symbol == null;
    }

    public final void update(String str) {
        this.value = null;
        this.symbol = str;
    }

    /* renamed from: update-0680j_4, reason: not valid java name */
    public final void m11526update0680j_4(float f2) {
        this.value = Dp.m11162boximpl(f2);
        this.symbol = null;
    }

    public /* synthetic */ DimensionSymbol(Dp dp, String str, String str2, o oVar) {
        this(dp, str, str2);
    }
}
