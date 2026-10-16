package com.google.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements eh {
    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        switch (i2) {
            case 0:
                return d.FIELD_BEHAVIOR_UNSPECIFIED;
            case 1:
                return d.OPTIONAL;
            case 2:
                return d.REQUIRED;
            case 3:
                return d.OUTPUT_ONLY;
            case 4:
                return d.INPUT_ONLY;
            case 5:
                return d.IMMUTABLE;
            case 6:
                return d.UNORDERED_LIST;
            case 7:
                return d.NON_EMPTY_DEFAULT;
            case 8:
                return d.IDENTIFIER;
            case 9:
                return d.MUTABLE_RESOURCE_CONTAINER;
            case 10:
                return d.MUTABLE_RESOURCE_NAME;
            case 11:
                return d.LEGACY_RESOURCE_IDENTIFIER;
            default:
                return null;
        }
    }
}
