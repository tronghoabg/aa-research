package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ActionOnlyNavDirections implements NavDirections {
    private final int actionId;
    private final Bundle arguments;

    public ActionOnlyNavDirections(int i2) {
        k[] kVarArr;
        this.actionId = i2;
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        this.arguments = bundleBundleOf;
    }

    public static /* synthetic */ ActionOnlyNavDirections copy$default(ActionOnlyNavDirections actionOnlyNavDirections, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = actionOnlyNavDirections.actionId;
        }
        return actionOnlyNavDirections.copy(i2);
    }

    public final int component1() {
        return this.actionId;
    }

    public final ActionOnlyNavDirections copy(int i2) {
        return new ActionOnlyNavDirections(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x.n(getClass(), obj.getClass()) && getActionId() == ((ActionOnlyNavDirections) obj).getActionId();
    }

    @Override // androidx.navigation.NavDirections
    public int getActionId() {
        return this.actionId;
    }

    @Override // androidx.navigation.NavDirections
    public Bundle getArguments() {
        return this.arguments;
    }

    public int hashCode() {
        return getActionId() + 31;
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ")";
    }
}
