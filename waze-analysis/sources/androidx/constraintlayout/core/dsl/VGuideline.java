package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class VGuideline extends Guideline {
    public VGuideline(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.HelperType(typeMap.get(Helper.Type.VERTICAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }

    public VGuideline(String str) {
        super(str);
        this.type = new Helper.HelperType(typeMap.get(Helper.Type.VERTICAL_GUIDELINE));
    }
}
