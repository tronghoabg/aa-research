package com.google.android.libraries.phenotype.client.stable;

import android.util.Log;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ac implements com.google.d.b.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6027a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6028b;

    public /* synthetic */ ac(Object obj, int i2) {
        this.f6028b = i2;
        this.f6027a = obj;
    }

    @Override // com.google.d.b.t
    public final Object apply(Object obj) {
        int i2 = this.f6028b;
        if (i2 != 0) {
            if (i2 == 1) {
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((q) this.f6027a).f6150f)), (Throwable) obj);
                return null;
            }
            if (i2 == 2) {
                int i3 = ae.f6031a;
                return ((f) obj).getAccountListsOrDefault((String) this.f6027a, c.getDefaultInstance()).getValuesList();
            }
            if (i2 != 3) {
                bh.f((bh) this.f6027a, (com.google.android.libraries.phenotype.client.b.u) obj);
                return null;
            }
            int i4 = ae.f6031a;
            return ((f) obj).getAccountListsOrDefault((String) this.f6027a, c.getDefaultInstance()).getLatestAccount();
        }
        int i5 = ae.f6031a;
        e eVarNewBuilder = f.newBuilder();
        for (Map.Entry<String, c> entry : ((f) obj).getAccountListsMap().entrySet()) {
            Object obj2 = this.f6027a;
            c value = entry.getValue();
            b bVarNewBuilder = c.newBuilder();
            if (!value.getLatestAccount().equals(obj2)) {
                bVarNewBuilder.c(value.getLatestAccount());
            }
            for (String str : value.getValuesList()) {
                if (!str.equals(obj2)) {
                    bVarNewBuilder.b(str);
                }
            }
            eVarNewBuilder.a(entry.getKey(), bVarNewBuilder.build());
        }
        return eVarNewBuilder.build();
    }
}
