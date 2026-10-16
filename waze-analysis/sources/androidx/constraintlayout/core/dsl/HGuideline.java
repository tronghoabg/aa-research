package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class HGuideline extends Guideline {
    public HGuideline(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.HelperType(typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }

    public HGuideline(String str) {
        super(str);
        this.type = new Helper.HelperType(typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
    }
}
