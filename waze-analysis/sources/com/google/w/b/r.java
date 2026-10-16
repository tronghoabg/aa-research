package com.google.w.b;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r implements eh {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13141a;

    r(int i2) {
        this.f13141a = i2;
    }

    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (this.f13141a == 0) {
            return t.b(i2);
        }
        switch (i2) {
            case 0:
                return f.DF_NONE;
            case 1:
                return f.DF_HTTPHEADER;
            case 2:
                return f.DF_COOKIE;
            case 3:
                return f.DF_URL;
            case 4:
                return f.DF_CGI_ARGS;
            case 5:
                return f.DF_HOST_ORDER;
            case 6:
                return f.DF_BYTE_SWAPPED;
            case 7:
                return f.DF_LOGGING_ELEMENT_TYPE_ID;
            default:
                return null;
        }
    }
}
