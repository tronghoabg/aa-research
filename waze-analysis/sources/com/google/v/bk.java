package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bk implements eh {
    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        switch (i2) {
            case 1:
                return bl.TYPE_DOUBLE;
            case 2:
                return bl.TYPE_FLOAT;
            case 3:
                return bl.TYPE_INT64;
            case 4:
                return bl.TYPE_UINT64;
            case 5:
                return bl.TYPE_INT32;
            case 6:
                return bl.TYPE_FIXED64;
            case 7:
                return bl.TYPE_FIXED32;
            case 8:
                return bl.TYPE_BOOL;
            case 9:
                return bl.TYPE_STRING;
            case 10:
                return bl.TYPE_GROUP;
            case 11:
                return bl.TYPE_MESSAGE;
            case 12:
                return bl.TYPE_BYTES;
            case 13:
                return bl.TYPE_UINT32;
            case 14:
                return bl.TYPE_ENUM;
            case 15:
                return bl.TYPE_SFIXED32;
            case 16:
                return bl.TYPE_SFIXED64;
            case 17:
                return bl.TYPE_SINT32;
            case 18:
                return bl.TYPE_SINT64;
            default:
                return null;
        }
    }
}
