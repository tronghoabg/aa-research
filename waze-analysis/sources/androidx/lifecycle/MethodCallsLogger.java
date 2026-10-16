package androidx.lifecycle;

import androidx.autofill.HintConstants;
import h.g.b.x;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    public boolean approveCall(String str, int i2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        Integer num = this.calledMethods.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        int i3 = iIntValue & i2;
        this.calledMethods.put(str, Integer.valueOf(i2 | iIntValue));
        return i3 == 0;
    }
}
