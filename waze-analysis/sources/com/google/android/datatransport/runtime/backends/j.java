package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    private final i f4175a;

    /* renamed from: b, reason: collision with root package name */
    private final g f4176b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f4177c;

    j(Context context, g gVar) {
        i iVar = new i(context);
        this.f4177c = new HashMap();
        this.f4175a = iVar;
        this.f4176b = gVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.b
    public final synchronized l a(String str) {
        Map map = this.f4177c;
        if (map.containsKey(str)) {
            return (l) map.get(str);
        }
        a aVarA = this.f4175a.a(str);
        if (aVarA == null) {
            return null;
        }
        l lVarCreate = aVarA.create(this.f4176b.a(str));
        map.put(str, lVarCreate);
        return lVarCreate;
    }
}
